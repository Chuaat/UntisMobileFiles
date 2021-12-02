// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.l;
import io.reactivex.i0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import io.reactivex.b0;

public final class e1<T> extends b0<T>
{
    final Future<? extends T> G;
    final long H;
    final TimeUnit I;
    
    public e1(final Future<? extends T> g, final long h, final TimeUnit i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super T> i0) {
        final l<T> l = new l<T>(i0);
        i0.l(l);
        if (!l.i()) {
            try {
                final TimeUnit j = this.I;
                T t;
                if (j != null) {
                    t = (T)this.G.get(this.H, j);
                }
                else {
                    t = (T)this.G.get();
                }
                l.c(b.g(t, "Future returned null"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                if (!l.i()) {
                    i0.b(t2);
                }
            }
        }
    }
}
