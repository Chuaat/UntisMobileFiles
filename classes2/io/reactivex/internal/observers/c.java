// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import y5.j;

public abstract class c<T> implements j<T>
{
    @Override
    public final boolean offer(final T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
    
    @Override
    public final boolean p(final T t, final T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
