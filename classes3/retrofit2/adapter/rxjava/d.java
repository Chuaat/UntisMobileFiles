// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import rx.exceptions.c;
import rx.i;
import rx.o;
import rx.n;
import retrofit2.b;
import retrofit2.t;
import rx.g;

final class d<T> implements a<t<T>>
{
    private final b<T> G;
    
    d(final b<T> g) {
        this.G = g;
    }
    
    public void a(final n<? super t<T>> n) {
        final b<T> m = this.G.M();
        final b b = new b<T>(m, n);
        n.r(b);
        n.s0(b);
        try {
            b.c(m.p());
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            b.b(t);
        }
    }
}
