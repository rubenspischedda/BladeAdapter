package it.rubenspischedda.bladeadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003[\\]Bq\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u0006\u0012 \b\u0002\u0010\u000b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u0006\u00a2\u0006\u0002\u0010\rJ%\u0010\"\u001a\u00020#\"\u0004\b\u0001\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0014\u0010\'\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u008b\u0001\u0010)\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010,\u001a\u00020-2$\b\u0002\u0010.\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u00062 \b\u0002\u0010/\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u00062\b\b\u0002\u00100\u001a\u00020\u00152\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000102H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u00c0\u0001\u00104\u001a\u00020-2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2$\b\u0002\u00106\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u00062$\b\u0002\u0010.\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u00062\u001e\u00107\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u00062\u001e\u0010/\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u00062\u0006\u00108\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H&J\u0015\u00109\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010;J|\u0010<\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\"\u0010.\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u00062\u001e\u0010/\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u00062\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000102H\u0002J\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006J\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006J\u001e\u0010?\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u0006J\"\u0010@\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u0006J\b\u0010A\u001a\u00020BH\u0016J\u0013\u0010C\u001a\u00028\u00002\u0006\u0010D\u001a\u00020B\u00a2\u0006\u0002\u0010EJ\u0010\u0010F\u001a\u00020B2\u0006\u0010D\u001a\u00020BH\u0016J\b\u0010G\u001a\u00020HH\u0002J4\u0010I\u001a\u00020B2\u0006\u0010J\u001a\u00020B2\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0+J\u0015\u0010L\u001a\u00020\u00152\u0006\u0010:\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010MJ\'\u0010N\u001a\u00020\u00152\u0006\u0010:\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0+\u00a2\u0006\u0002\u0010OJ\u0015\u0010P\u001a\u00020\u00152\u0006\u0010:\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010MJ$\u0010Q\u001a\u00020#2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016Jb\u00101\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\"\u0010.\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u00062\u001e\u0010/\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u00062\u0006\u00100\u001a\u00020\u0015H\u0016J)\u0010R\u001a\u00020\u00152\u0006\u0010:\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0+H\u0016\u00a2\u0006\u0002\u0010OJ\u000e\u0010S\u001a\u00020#2\u0006\u0010T\u001a\u00020UJ\u0019\u0010\u0018\u001a\u00020#2\u0006\u0010V\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010WJ\u008f\u0001\u0010X\u001a\u00020#2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010+2(\b\u0002\u0010.\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0018\u00010\u0005j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0018\u0001`\u00062$\b\u0002\u0010/\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u00010\u0005j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u0001`\u00062\b\b\u0002\u00100\u001a\u00020\u00152\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000102H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ\u0089\u0001\u0010Z\u001a\u00020#2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010+2&\u0010.\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0018\u00010\u0005j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0018\u0001`\u00062\"\u0010/\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u00010\u0005j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u0001`\u00062\b\b\u0002\u00100\u001a\u00020\u00152\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000102H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YR)\u0010\u000b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR-\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006^"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dataset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "queueUpdateMethod", "Lit/rubenspischedda/bladeadapter/QueueUpdateMethod;", "filters", "Lit/rubenspischedda/bladeadapter/BladeFilter;", "attributes", "Lit/rubenspischedda/bladeadapter/BladeAttribute;", "(Ljava/util/ArrayList;Lit/rubenspischedda/bladeadapter/QueueUpdateMethod;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getAttributes", "()Ljava/util/ArrayList;", "getDataset", "getFilters", "fixedAttributes", "fixedFilters", "loading", "", "getLoading", "()Z", "setLoading", "(Z)V", "operationPending", "pendingUpdates", "Ljava/util/Deque;", "Lit/rubenspischedda/bladeadapter/BladeAdapter$UpdateRequest;", "getQueueUpdateMethod", "()Lit/rubenspischedda/bladeadapter/QueueUpdateMethod;", "setQueueUpdateMethod", "(Lit/rubenspischedda/bladeadapter/QueueUpdateMethod;)V", "addOrReplaceAttribute", "", "R", "bladeAttribute", "(Lit/rubenspischedda/bladeadapter/BladeAttribute;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrReplaceFilter", "bladeFilter", "applyDiffResult", "newItems", "", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "newFilters", "newAttributes", "newLoading", "onUpdateDone", "Lkotlin/Function0;", "(Ljava/util/List;Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateDiff", "oldItems", "oldFilters", "oldAttributes", "oldLoading", "copyItem", "item", "(Ljava/lang/Object;)Ljava/lang/Object;", "dispatchUpdates", "getDatasetCopy", "getFilteredDataset", "getFixedAttributes", "getFixedFilters", "getItemCount", "", "getItemFromAdapterPosition", "position", "(I)Ljava/lang/Object;", "getItemViewType", "getListUpdateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getRealIndex", "index", "list", "isInvisible", "(Ljava/lang/Object;)Z", "isRealVisible", "(Ljava/lang/Object;Ljava/util/List;)Z", "isVisible", "onPreUpdate", "passFilters", "removeFilter", "filterId", "", "isLoading", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItems", "(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItemsInternal", "EmptyViewHolder", "LoadingViewHolder", "UpdateRequest", "bladeadapter_release"})
public abstract class BladeAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private boolean loading;
    private final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> fixedFilters = null;
    private final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> fixedAttributes = null;
    private final java.util.Deque<it.rubenspischedda.bladeadapter.BladeAdapter.UpdateRequest<T>> pendingUpdates = null;
    private boolean operationPending;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<T> dataset = null;
    @org.jetbrains.annotations.NotNull()
    private it.rubenspischedda.bladeadapter.QueueUpdateMethod queueUpdateMethod;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> attributes = null;
    
    public final boolean getLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public abstract T copyItem(T item);
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> newItems, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> newFilters, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> newAttributes, boolean newLoading, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateDone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p5) {
        return null;
    }
    
    private final void dispatchUpdates(java.util.List<? extends T> newItems, java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> newFilters, java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> newAttributes, boolean newLoading, androidx.recyclerview.widget.DiffUtil.DiffResult diffResult, kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateDone) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> oldItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> newItems, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> oldFilters, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> newFilters, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> oldAttributes, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> newAttributes, boolean oldLoading, boolean newLoading);
    
    public void onUpdateDone(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> newItems, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> newFilters, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> newAttributes, boolean newLoading) {
    }
    
    public void onPreUpdate(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> oldItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> newItems) {
    }
    
    public boolean isInvisible(T item) {
        return false;
    }
    
    public boolean isVisible(T item) {
        return false;
    }
    
    public boolean passFilters(T item, @org.jetbrains.annotations.NotNull()
    java.util.List<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters) {
        return false;
    }
    
    public final boolean isRealVisible(T item, @org.jetbrains.annotations.NotNull()
    java.util.List<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters) {
        return false;
    }
    
    public final int getRealIndex(int index, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list, @org.jetbrains.annotations.NotNull()
    java.util.List<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters) {
        return 0;
    }
    
    public final T getItemFromAdapterPosition(int position) {
        return null;
    }
    
    private final androidx.recyclerview.widget.ListUpdateCallback getListUpdateCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getFilteredDataset() {
        return null;
    }
    
    public final void addOrReplaceFilter(@org.jetbrains.annotations.NotNull()
    it.rubenspischedda.bladeadapter.BladeFilter<T> bladeFilter) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <R extends java.lang.Object>java.lang.Object addOrReplaceAttribute(@org.jetbrains.annotations.NotNull()
    it.rubenspischedda.bladeadapter.BladeAttribute<R> bladeAttribute, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void removeFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filterId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> getFixedFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> getFixedAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setLoading(boolean isLoading, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getDatasetCopy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final it.rubenspischedda.bladeadapter.QueueUpdateMethod getQueueUpdateMethod() {
        return null;
    }
    
    public final void setQueueUpdateMethod(@org.jetbrains.annotations.NotNull()
    it.rubenspischedda.bladeadapter.QueueUpdateMethod p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> getFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> getAttributes() {
        return null;
    }
    
    public BladeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> dataset, @org.jetbrains.annotations.NotNull()
    it.rubenspischedda.bladeadapter.QueueUpdateMethod queueUpdateMethod, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> attributes) {
        super();
    }
    
    public BladeAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002By\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012&\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u0001`\b\u0012\"\u0010\t\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u00010\u0006j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u0001`\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u00c6\u0003J)\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u0001`\bH\u00c6\u0003J%\u0010\u001c\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u00010\u0006j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u0001`\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\fH\u00c6\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\u008d\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042(\b\u0002\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u0001`\b2$\b\u0002\u0010\t\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u00010\u0006j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u0001`\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R-\u0010\t\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u00010\u0006j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R1\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeAdapter$UpdateRequest;", "T", "", "items", "", "filters", "Ljava/util/ArrayList;", "Lit/rubenspischedda/bladeadapter/BladeFilter;", "Lkotlin/collections/ArrayList;", "attributes", "Lit/rubenspischedda/bladeadapter/BladeAttribute;", "loading", "", "onUpdateDone", "Lkotlin/Function0;", "", "(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLkotlin/jvm/functions/Function0;)V", "getAttributes", "()Ljava/util/ArrayList;", "getFilters", "getItems", "()Ljava/util/List;", "getLoading", "()Z", "getOnUpdateDone", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "bladeadapter_release"})
    public static final class UpdateRequest<T extends java.lang.Object> {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<T> items = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> attributes = null;
        private final boolean loading = false;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateDone = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<T> getItems() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> getFilters() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> getAttributes() {
            return null;
        }
        
        public final boolean getLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnUpdateDone() {
            return null;
        }
        
        public UpdateRequest(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> items, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> attributes, boolean loading, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateDone) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<T> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final it.rubenspischedda.bladeadapter.BladeAdapter.UpdateRequest<T> copy(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> items, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeFilter<T>> filters, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<it.rubenspischedda.bladeadapter.BladeAttribute<?>> attributes, boolean loading, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateDone) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeAdapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemLoadingBinding", "Lit/rubenspischedda/bladeadapter/databinding/BladeadapterItemEmptyBinding;", "(Lit/rubenspischedda/bladeadapter/databinding/BladeadapterItemEmptyBinding;)V", "bladeadapter_release"})
    public static final class EmptyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull()
        it.rubenspischedda.bladeadapter.databinding.BladeadapterItemEmptyBinding itemLoadingBinding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeAdapter$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemLoadingBinding", "Lit/rubenspischedda/bladeadapter/databinding/BladeadapterItemLoadingBinding;", "(Lit/rubenspischedda/bladeadapter/databinding/BladeadapterItemLoadingBinding;)V", "bladeadapter_release"})
    public static final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull()
        it.rubenspischedda.bladeadapter.databinding.BladeadapterItemLoadingBinding itemLoadingBinding) {
            super(null);
        }
    }
}