// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.i0;
import java.util.concurrent.Callable;
import io.reactivex.b0;

public final class u0<T> extends b0<T>
{
    final Callable<? extends Throwable> G;
    
    public u0(final Callable<? extends Throwable> g) {
        this.G = g;
    }
    
    public void L5(final i0<? super T> i0) {
        final Throwable t2;
        try {
            final Throwable t = b.g((Throwable)this.G.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            io.reactivex.exceptions.b.b(t2);
        }
        e.l(t2, i0);
    }
}
