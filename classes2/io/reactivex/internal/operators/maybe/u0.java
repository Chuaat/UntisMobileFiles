// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.x;

public final class u0<T, R> extends a<T, R>
{
    final x<? extends R, ? super T> H;
    
    public u0(final y<T> y, final x<? extends R, ? super T> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        try {
            super.G.c(b.g(this.H.a(v), "The operator returned a null MaybeObserver"));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.j(t, v);
        }
    }
}
