// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

final class g extends f<Runnable>
{
    private static final long H = -8219729196779211169L;
    
    g(final Runnable runnable) {
        super(runnable);
    }
    
    protected void b(@io.reactivex.annotations.f final Runnable runnable) {
        runnable.run();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(this.i());
        sb.append(", ");
        sb.append(((AtomicReference<Object>)this).get());
        sb.append(")");
        return sb.toString();
    }
}
