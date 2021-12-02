// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import retrofit2.d;
import rx.i;
import rx.o;
import rx.n;
import retrofit2.b;
import retrofit2.t;
import rx.g;

final class c<T> implements a<t<T>>
{
    private final b<T> G;
    
    c(final b<T> g) {
        this.G = g;
    }
    
    public void a(final n<? super t<T>> n) {
        final b<T> m = this.G.M();
        final b b = new b(m, n);
        n.r(b);
        n.s0(b);
        m.N2(new d<T>() {
            @Override
            public void a(final b<T> b, final Throwable t) {
                rx.exceptions.c.e(t);
                b.b(t);
            }
            
            @Override
            public void b(final b<T> b, final t<T> t) {
                b.c(t);
            }
        });
    }
}
