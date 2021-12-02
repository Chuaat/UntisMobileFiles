// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.exceptions.h;
import rx.plugins.c;
import rx.o;
import rx.n;
import rx.functions.p;
import rx.g;

public final class u0<T, R> implements g.a<R>
{
    final g<T> G;
    final p<? super T, ? extends R> H;
    
    public u0(final g<T> g, final p<? super T, ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super R> n) {
        final a a = new a(n, this.H);
        n.r(a);
        this.G.R6((n<? super T>)a);
    }
    
    static final class a<T, R> extends n<T>
    {
        final n<? super R> L;
        final p<? super T, ? extends R> M;
        boolean N;
        
        public a(final n<? super R> l, final p<? super T, ? extends R> m) {
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.N) {
                rx.plugins.c.I(t);
                return;
            }
            this.N = true;
            this.L.b(t);
        }
        
        @Override
        public void c() {
            if (this.N) {
                return;
            }
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            try {
                this.L.m((Object)this.M.h((Object)t));
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                this.b(rx.exceptions.h.a(t2, t));
            }
        }
        
        @Override
        public void s0(final i i) {
            this.L.s0(i);
        }
    }
}
