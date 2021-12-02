// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.b;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import o7.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import io.reactivex.l;

public final class i1<T> extends l<T>
{
    final Future<? extends T> H;
    final long I;
    final TimeUnit J;
    
    public i1(final Future<? extends T> h, final long i, final TimeUnit j) {
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void n6(final c<? super T> c) {
        final f f = new f(c);
        c.z((d)f);
        try {
            final TimeUnit j = this.J;
            T t;
            if (j != null) {
                t = (T)this.H.get(this.I, j);
            }
            else {
                t = (T)this.H.get();
            }
            if (t == null) {
                c.b((Throwable)new NullPointerException("The future returned null"));
            }
            else {
                f.g(t);
            }
        }
        finally {
            final Throwable t2;
            b.b(t2);
            if (!f.i()) {
                c.b(t2);
            }
        }
    }
}
