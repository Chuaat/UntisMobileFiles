// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.functions.b;
import o7.c;
import java.util.concurrent.Callable;
import io.reactivex.l;

public final class x0<T> extends l<T>
{
    final Callable<? extends Throwable> H;
    
    public x0(final Callable<? extends Throwable> h) {
        this.H = h;
    }
    
    public void n6(final c<? super T> c) {
        final Throwable t2;
        try {
            final Throwable t = b.g((Throwable)this.H.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            io.reactivex.exceptions.b.b(t2);
        }
        g.d(t2, c);
    }
}
