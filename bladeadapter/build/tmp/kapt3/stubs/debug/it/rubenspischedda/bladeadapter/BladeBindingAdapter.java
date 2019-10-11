package it.rubenspischedda.bladeadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&\u00a8\u0006\t"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeBindingAdapter;", "T", "Lit/rubenspischedda/bladeadapter/BladeAdapter;", "()V", "getViewBinding", "Landroidx/databinding/ViewDataBinding;", "getViewHolder", "Lit/rubenspischedda/bladeadapter/BladeBindingAdapter$BladeBindingViewHolder;", "BladeBindingViewHolder", "bladeadapter_debug"})
public abstract class BladeBindingAdapter<T extends java.lang.Object> extends it.rubenspischedda.bladeadapter.BladeAdapter<T> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract it.rubenspischedda.bladeadapter.BladeBindingAdapter.BladeBindingViewHolder<T> getViewHolder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ViewDataBinding getViewBinding();
    
    public BladeBindingAdapter() {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeBindingAdapter$BladeBindingViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Landroidx/databinding/ViewDataBinding;", "variableId", "", "(Landroidx/databinding/ViewDataBinding;I)V", "getVariableId", "()I", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setModel", "", "item", "(Ljava/lang/Object;)V", "bladeadapter_debug"})
    public static final class BladeBindingViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.databinding.ViewDataBinding viewBinding = null;
        private final int variableId = 0;
        
        public final void setModel(T item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getViewBinding() {
            return null;
        }
        
        public final int getVariableId() {
            return 0;
        }
        
        public BladeBindingViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding viewBinding, int variableId) {
            super(null);
        }
    }
}