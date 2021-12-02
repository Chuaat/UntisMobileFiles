// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.n0;
import io.reactivex.p0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class j0<T, R> extends k0<R>
{
    final q0<T> G;
    final p0<? extends R, ? super T> H;
    
    public j0(final q0<T> g, final p0<? extends R, ? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        try {
            this.G.c(b.g(this.H.a(n0), "The onLift returned a null SingleObserver"));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.m(t, n0);
        }
    }
}
