// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import io.reactivex.internal.functions.b;
import io.reactivex.n0;
import x5.c;
import java.util.concurrent.Callable;
import io.reactivex.g0;
import io.reactivex.k0;

public final class m2<T, R> extends k0<R>
{
    final g0<T> G;
    final Callable<R> H;
    final c<R, ? super T, R> I;
    
    public m2(final g0<T> g, final Callable<R> h, final c<R, ? super T, R> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        try {
            this.G.c(new l2.a<Object, Object>(n0, this.I, b.g(this.H.call(), "The seedSupplier returned a null value")));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.m(t, n0);
        }
    }
}
