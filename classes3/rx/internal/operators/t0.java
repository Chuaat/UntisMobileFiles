// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import rx.n;
import rx.g;

public final class t0<T, R> implements a<R>
{
    final a<T> G;
    final g.b<? extends R, ? super T> H;
    
    public t0(final a<T> g, final g.b<? extends R, ? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super R> n) {
        try {
            final n<? super T> n2 = rx.plugins.c.M(this.H).h(n);
            try {
                n2.f();
                this.G.h(n2);
            }
            finally {}
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            n.b(t);
        }
    }
}
