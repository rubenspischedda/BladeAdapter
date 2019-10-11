package it.rubenspischedda.bladeadapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class ImprovedBindingAdapter<T> : ImprovedAdapter<T>() {


    abstract fun getViewHolder(): ImprovedBindingViewHolder<T>
    abstract fun getViewBinding(): ViewDataBinding

    class ImprovedBindingViewHolder<T>(val viewBinding: ViewDataBinding, val variableId: Int) : RecyclerView.ViewHolder(viewBinding.root) {
        fun setModel(item: T) {
            viewBinding.setVariable(variableId, item)
        }
    }
}