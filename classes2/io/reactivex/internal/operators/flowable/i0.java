// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.g;
import o7.c;
import o7.b;
import java.util.concurrent.Callable;
import io.reactivex.l;

public final class i0<T> extends l<T>
{
    final Callable<? extends b<? extends T>> H;
    
    public i0(final Callable<? extends b<? extends T>> h) {
        this.H = h;
    }
    
    public void n6(final c<? super T> c) {
        try {
            io.reactivex.internal.functions.b.g((b)this.H.call(), "The publisher supplied is null").e((c)c);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            g.d(t, c);
        }
    }
}
