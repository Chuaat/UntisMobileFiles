// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

final class e extends AtomicReference<Future<?>> implements c
{
    private static final long H = 6545242830671168775L;
    private final boolean G;
    
    e(final Future<?> initialValue, final boolean g) {
        super(initialValue);
        this.G = g;
    }
    
    @Override
    public void dispose() {
        final Future<?> future = this.getAndSet(null);
        if (future != null) {
            future.cancel(this.G);
        }
    }
    
    @Override
    public boolean i() {
        final Future future = ((AtomicReference<Future>)this).get();
        return future == null || future.isDone();
    }
}
