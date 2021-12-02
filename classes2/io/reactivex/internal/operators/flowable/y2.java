// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.e;
import io.reactivex.n0;
import x5.c;
import java.util.concurrent.Callable;
import o7.b;
import io.reactivex.k0;

public final class y2<T, R> extends k0<R>
{
    final b<T> G;
    final Callable<R> H;
    final c<R, ? super T, R> I;
    
    public y2(final b<T> g, final Callable<R> h, final c<R, ? super T, R> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        try {
            this.G.e((o7.c)new x2.a((n0<? super Object>)n0, (c<Object, ? super Object, Object>)this.I, io.reactivex.internal.functions.b.g(this.H.call(), "The seedSupplier returned a null value")));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.m(t, n0);
        }
    }
}
