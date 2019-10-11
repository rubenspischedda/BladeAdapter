package it.rubenspischedda.bladeadapter

import android.util.Log
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import it.rubenspischedda.bladeadapter.databinding.BladeadapterItemLoadingBinding
import it.rubenspischedda.bladeadapter.databinding.BladeadapterItemEmptyBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.*
import kotlin.collections.ArrayList

const val TYPE_LOADING = -10
const val TYPE_EMPTY = 0
const val TYPE_ITEM = 10

abstract class BladeAdapter<T>(
    val dataset: ArrayList<T> = arrayListOf(),
    var queueUpdateMethod: QueueUpdateMethod = QueueUpdateMethod.APPLY_IN_ORDER,
    val filters: ArrayList<BladeFilter<T>> = arrayListOf(),
    val attributes: ArrayList<BladeAttribute<*>> = arrayListOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    data class UpdateRequest<T>(
        val items: List<T>?,
        val filters: ArrayList<BladeFilter<T>>?,
        val attributes: ArrayList<BladeAttribute<*>>?,
        val loading: Boolean,
        val onUpdateDone: (() -> Unit)?
    )

    var loading = false

    private val fixedFilters = arrayListOf<BladeFilter<T>>()
    private val fixedAttributes = arrayListOf<BladeAttribute<*>>()

    private val pendingUpdates: Deque<UpdateRequest<T>> = ArrayDeque()
    private var operationPending: Boolean = false

    abstract fun copyItem(item: T): T

    override fun getItemCount(): Int {
        return dataset.count { f -> isRealVisible(f, filters) } + if (loading) 1 else 0
    }

    suspend fun updateItems(
        newItems: List<T>? = null,
        newFilters: ArrayList<BladeFilter<T>>? = null,
        newAttributes: ArrayList<BladeAttribute<*>>? = null,
        newLoading: Boolean = loading,
        onUpdateDone: (() -> Unit)? = null
    ) {

        when (queueUpdateMethod) {
            QueueUpdateMethod.NONE -> {
                // DO NOTHING
            }
            QueueUpdateMethod.IGNORE_IF_BUSY -> {
                if (operationPending) {
                    return
                }
            }
            QueueUpdateMethod.LATEST_WINS -> {
                pendingUpdates.push(
                    UpdateRequest(
                        newItems,
                        newFilters,
                        newAttributes,
                        newLoading,
                        onUpdateDone
                    )
                )
                if (pendingUpdates.size > 1) {
                    return
                }
            }
            QueueUpdateMethod.APPLY_IN_ORDER -> {
                pendingUpdates.add(
                    UpdateRequest(
                        newItems,
                        newFilters,
                        newAttributes,
                        newLoading,
                        onUpdateDone
                    )
                )
                if (pendingUpdates.size > 1) {
                    return
                }
            }
        }

        updateItemsInternal(newItems, newFilters, newAttributes, newLoading, onUpdateDone)
    }

    private suspend fun updateItemsInternal(
        newItems: List<T>?,
        newFilters: ArrayList<BladeFilter<T>>?,
        newAttributes: ArrayList<BladeAttribute<*>>?,
        newLoading: Boolean = loading,
        onUpdateDone: (() -> Unit)? = null
    ) {
        val oldItems = ArrayList(dataset)
        val oldFilters = ArrayList(filters)
        val oldAttributes = ArrayList(attributes)
        val oldLoading = loading

        withContext(Dispatchers.Default) {
            val diffResult = calculateDiff(
                oldItems,
                newItems ?: oldItems,
                oldFilters,
                newFilters ?: oldFilters,
                oldAttributes,
                newAttributes ?: oldAttributes,
                oldLoading,
                newLoading
            )
            withContext(Dispatchers.Main) {
                applyDiffResult(newItems?.copyArray { i -> copyItem(i) } ?: oldItems,
                    diffResult,
                    newFilters?.copyArray { i -> i.copy() } ?: oldFilters,
                    newAttributes?.copyArray { i -> i.copy() } ?: oldAttributes,
                    newLoading,
                    onUpdateDone)
            }
        }

    }

    private suspend fun applyDiffResult(
        newItems: List<T>,
        diffResult: DiffUtil.DiffResult,
        newFilters: ArrayList<BladeFilter<T>> = filters,
        newAttributes: ArrayList<BladeAttribute<*>> = attributes,
        newLoading: Boolean = loading,
        onUpdateDone: (() -> Unit)? = null
    ) {

        // PRE-OPERATION
        when (queueUpdateMethod) {
            QueueUpdateMethod.NONE -> {
                // DO NOTHING
            }
            QueueUpdateMethod.IGNORE_IF_BUSY -> {
                // DO NOTHING
            }
            QueueUpdateMethod.LATEST_WINS -> {
                pendingUpdates.remove(
                    UpdateRequest(
                        newItems,
                        newFilters,
                        newAttributes,
                        newLoading,
                        onUpdateDone
                    )
                )
            }
            QueueUpdateMethod.APPLY_IN_ORDER -> {
                pendingUpdates.remove()
            }
        }

        dispatchUpdates(newItems, newFilters, newAttributes, newLoading, diffResult, onUpdateDone)

        // POST-OPERATION
        when (queueUpdateMethod) {
            QueueUpdateMethod.NONE -> {
                // DO NOTHING
            }
            QueueUpdateMethod.IGNORE_IF_BUSY -> {
                operationPending = false
            }
            QueueUpdateMethod.LATEST_WINS -> {
                if (pendingUpdates.size > 0) {
                    val latest = pendingUpdates.pop()
                    pendingUpdates.clear()
                    updateItemsInternal(
                        latest.items,
                        latest.filters,
                        latest.attributes,
                        latest.loading,
                        onUpdateDone
                    )
                }
            }
            QueueUpdateMethod.APPLY_IN_ORDER -> {
                if (pendingUpdates.size > 0) {
                    val pu = pendingUpdates.peek()

                    if (pu != null) {
                        updateItemsInternal(
                            pu.items,
                            pu.filters,
                            pu.attributes,
                            pu.loading,
                            onUpdateDone
                        )
                    }
                }
            }
        }
    }

    private fun dispatchUpdates(
        newItems: List<T>,
        newFilters: ArrayList<BladeFilter<T>>,
        newAttributes: ArrayList<BladeAttribute<*>>,
        newLoading: Boolean,
        diffResult: DiffUtil.DiffResult,
        onUpdateDone: (() -> Unit)? = null
    ) {
        onPreUpdate(dataset, newItems)

        diffResult.dispatchUpdatesTo(getListUpdateCallback())
        dataset.clear()
        dataset.addAll(newItems)

        filters.clear()
        filters.addAll(newFilters)

        val alreadyExistingAttributes =
            newAttributes.filter { a -> attributes.firstOrNull { f -> f.id == a.id } != null }
                .copyArray { c -> c.copy() }

        val toRemove = arrayListOf<Int>()
        attributes.forEachIndexed { i, ia ->
            if (alreadyExistingAttributes.firstOrNull { fn -> fn.id == ia.id } != null) {
                toRemove.add(i)
            }
        }

        for (i in (attributes.size - 1) downTo 0) {
            if (toRemove.contains(i)) {
                attributes.removeAt(i)
            }
        }
        attributes.addAll(newAttributes)

        Log.d(
            "ADAPEXP",
            "Current attributes: ${attributes.joinToString { js -> "${js.id}: ${js.value}" }}"
        )

        loading = newLoading

        this.onUpdateDone(newItems, newFilters, newAttributes, newLoading)
        onUpdateDone?.invoke()
    }

    override fun getItemViewType(position: Int): Int {
        return if (loading) {
            if (position == dataset.size) {
                TYPE_LOADING
            } else {
                TYPE_ITEM
            }
        } else {
            TYPE_ITEM
        }
    }

    abstract fun calculateDiff(
        oldItems: List<T>,
        newItems: List<T>,
        oldFilters: ArrayList<BladeFilter<T>> = arrayListOf(),
        newFilters: ArrayList<BladeFilter<T>> = arrayListOf(),
        oldAttributes: ArrayList<BladeAttribute<*>>,
        newAttributes: ArrayList<BladeAttribute<*>>,
        oldLoading: Boolean,
        newLoading: Boolean
    ): DiffUtil.DiffResult

    open fun onUpdateDone(
        newItems: List<T>,
        newFilters: ArrayList<BladeFilter<T>>,
        newAttributes: ArrayList<BladeAttribute<*>>,
        newLoading: Boolean
    ) {
    }

    open fun onPreUpdate(oldItems: List<T>, newItems: List<T>) {}
    open fun isInvisible(item: T): Boolean {
        return false
    }

    //Deprecated
    open fun isVisible(item: T): Boolean {
        return !isInvisible(item)
    }

    open fun passFilters(item: T, filters: List<BladeFilter<T>>): Boolean {
        return if (filters.isNotEmpty()) {
            filters.all { f ->
                f.operation(item)
            }
        } else true
    }

    fun isRealVisible(item: T, filters: List<BladeFilter<T>>): Boolean {
        return isVisible(item) && passFilters(item, filters)
    }

    fun getRealIndex(
        index: Int,
        list: List<T> = dataset,
        filters: List<BladeFilter<T>> = arrayListOf()
    ): Int {

        var modifiedIndex = index
        for (i in list.indices) {
            if (!isRealVisible(list[i], filters) && i <= modifiedIndex) {
                modifiedIndex++
            }

            if (i >= modifiedIndex) break
        }

        return modifiedIndex

    }

    fun getItemFromAdapterPosition(position: Int): T {
        return dataset[getRealIndex(position)]
    }

    private fun getListUpdateCallback(): ListUpdateCallback {
        return object : ListUpdateCallback {
            override fun onChanged(position: Int, count: Int, payload: Any?) {
                if (count == 1) {
                    notifyItemChanged(position, payload)
                } else if (count > 1) {
                    notifyItemRangeChanged(position, count, payload)
                }
            }

            override fun onMoved(fromPosition: Int, toPosition: Int) {
                notifyItemMoved(fromPosition, toPosition)
            }

            override fun onInserted(position: Int, count: Int) {
                if (count == 1) {
                    notifyItemInserted(position)
                } else if (count > 1) {
                    notifyItemRangeInserted(position, count)
                }
            }

            override fun onRemoved(position: Int, count: Int) {
                if (count == 1) {
                    notifyItemRemoved(position)
                } else if (count > 1) {
                    notifyItemRangeRemoved(position, count)
                }
            }

        }
    }

    // Will it work?
    fun getFilteredDataset(): ArrayList<T> {
        return ArrayList(dataset.filter { f -> isRealVisible(f, filters) })
    }

    fun addOrReplaceFilter(bladeFilter: BladeFilter<T>) {
        if (fixedFilters.firstOrNull { it.id == bladeFilter.id } != null) {
            fixedFilters.removeAt(fixedFilters.indexOfFirst { it.id == bladeFilter.id })
        }
        fixedFilters.add(bladeFilter)
        if (filters.firstOrNull { it.id == bladeFilter.id } != null) {
            filters.removeAt(filters.indexOfFirst { it.id == bladeFilter.id })
        }
        filters.add(bladeFilter)
    }

    suspend fun <R> addOrReplaceAttribute(bladeAttribute: BladeAttribute<R>) {
        val oldAttributes = attributes.copy()

        val toRemoveIndex = oldAttributes.indexOfFirst { f -> f.id == bladeAttribute.id }

        if (toRemoveIndex != -1) {
            oldAttributes.removeAt(toRemoveIndex)
        }

        oldAttributes.add(bladeAttribute)

        updateItems(newAttributes = oldAttributes)
    }

    fun removeFilter(filterId: String) {
        fixedFilters.removeAt(fixedFilters.indexOfFirst { it.id == filterId })
    }

    fun getFixedFilters(): ArrayList<BladeFilter<T>> {
        return fixedFilters.copy()
    }

    fun getFixedAttributes(): ArrayList<BladeAttribute<*>> {
        return fixedAttributes.copy()
    }

    suspend fun setLoading(isLoading: Boolean) {
        updateItems(newLoading = isLoading)
    }

    fun getDatasetCopy(): ArrayList<T> {
        return dataset.copyArray { i -> copyItem(i) }
    }

    class EmptyViewHolder(itemLoadingBinding: BladeadapterItemEmptyBinding) :
        RecyclerView.ViewHolder(itemLoadingBinding.root)

    class LoadingViewHolder(itemLoadingBinding: BladeadapterItemLoadingBinding) :
        RecyclerView.ViewHolder(itemLoadingBinding.root)
}