// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.subscriptions.f;
import rx.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import rx.k;

public final class s4<T> implements t<T>
{
    final Future<? extends T> G;
    final long H;
    final TimeUnit I;
    
    public s4(final Future<? extends T> g, final long h, final TimeUnit i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final m<? super T> m) {
        final Future<? extends T> g = this.G;
        m.d(f.c(g));
        try {
            final long h = this.H;
            T t;
            if (h == 0L) {
                t = (T)g.get();
            }
            else {
                t = (T)g.get(h, this.I);
            }
            m.e(t);
        }
        finally {
            final Throwable t2;
            c.e(t2);
            m.b(t2);
        }
    }
}
