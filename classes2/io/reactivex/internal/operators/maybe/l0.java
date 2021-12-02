// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import java.util.concurrent.ExecutionException;
import io.reactivex.disposables.d;
import io.reactivex.v;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import io.reactivex.s;

public final class l0<T> extends s<T>
{
    final Future<? extends T> G;
    final long H;
    final TimeUnit I;
    
    public l0(final Future<? extends T> g, final long h, final TimeUnit i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final c b = d.b();
        v.l(b);
        if (!b.i()) {
            try {
                final long h = this.H;
                T t;
                if (h <= 0L) {
                    t = (T)this.G.get();
                }
                else {
                    t = (T)this.G.get(h, this.I);
                }
                if (!b.i()) {
                    if (t == null) {
                        v.f();
                    }
                    else {
                        v.d(t);
                    }
                }
            }
            finally {
                final Throwable t2;
                Throwable cause = t2;
                if (t2 instanceof ExecutionException) {
                    cause = t2.getCause();
                }
                io.reactivex.exceptions.b.b(cause);
                if (!b.i()) {
                    v.b(cause);
                }
            }
        }
    }
}
