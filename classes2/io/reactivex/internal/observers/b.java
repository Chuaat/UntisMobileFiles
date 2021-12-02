// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import y5.j;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b<T> extends AtomicInteger implements j<T>
{
    private static final long G = -1001730202384742097L;
    
    @Override
    public final boolean offer(final T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
    
    @Override
    public final boolean p(final T t, final T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
