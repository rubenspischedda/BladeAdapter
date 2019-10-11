package it.rubenspischedda.bladeadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00028\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lit/rubenspischedda/bladeadapter/BladeAttribute;", "T", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "copy", "bladeadapter_debug"})
public abstract class BladeAttribute<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    public abstract T getValue();
    
    public abstract void setValue(T p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract it.rubenspischedda.bladeadapter.BladeAttribute<T> copy();
    
    public BladeAttribute() {
        super();
    }
}