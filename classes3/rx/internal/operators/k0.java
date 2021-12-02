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

public final class k0<T> implements g.a<T>
{
    final g<T> G;
    final p<? super T, Boolean> H;
    
    public k0(final g<T> g, final p<? super T, Boolean> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super T> n) {
        final a<Object> a = new a<Object>((n<? super Object>)n, (p<? super Object, Boolean>)this.H);
        n.r(a);
        this.G.R6(a);
    }
    
    static final class a<T> extends n<T>
    {
        final n<? super T> L;
        final p<? super T, Boolean> M;
        boolean N;
        
        public a(final n<? super T> l, final p<? super T, Boolean> m) {
            this.L = l;
            this.M = m;
            this.v(0L);
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
                if (this.M.h((Object)t)) {
                    this.L.m((Object)t);
                }
                else {
                    this.v(1L);
                }
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
            super.s0(i);
            this.L.s0(i);
        }
    }
}
