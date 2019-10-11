package it.rubenspischedda.bladeadapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BladeBindingAdapter<T> : BladeAdapter<T>() {


    abstract fun getViewHolder(): BladeBindingViewHolder<T>
    abstract fun getViewBinding(): ViewDataBinding

    class BladeBindingViewHolder<T>(val viewBinding: ViewDataBinding, val variableId: Int) : RecyclerView.ViewHolder(viewBinding.root) {
        fun setModel(item: T) {
            viewBinding.setVariable(variableId, item)
        }
    }
}