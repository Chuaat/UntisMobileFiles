// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;

abstract class f<T> extends AtomicReference<T> implements c
{
    private static final long G = 6537757548749041217L;
    
    f(final T t) {
        super(b.g(t, "value is null"));
    }
    
    protected abstract void a(@io.reactivex.annotations.f final T p0);
    
    @Override
    public final void dispose() {
        if (this.get() != null) {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                this.a(andSet);
            }
        }
    }
    
    @Override
    public final boolean i() {
        return this.get() == null;
    }
}
