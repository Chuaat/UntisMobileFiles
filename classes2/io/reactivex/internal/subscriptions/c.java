// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import y5.l;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T> extends AtomicInteger implements l<T>
{
    private static final long G = -6671519529404341862L;
    
    public final boolean offer(final T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public final boolean p(final T t, final T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
