// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.exceptions.h;
import rx.plugins.c;
import rx.o;
import rx.n;
import rx.g;

public class y1<T, R> implements b<R, T>
{
    final Class<R> G;
    
    public y1(final Class<R> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super R> n) {
        final a a = new a(n, this.G);
        n.r(a);
        return (n<? super T>)a;
    }
    
    static final class a<T, R> extends n<T>
    {
        final n<? super R> L;
        final Class<R> M;
        boolean N;
        
        public a(final n<? super R> l, final Class<R> m) {
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
        public void m(final T obj) {
            try {
                this.L.m((Object)this.M.cast(obj));
            }
            finally {
                final Throwable t;
                rx.exceptions.c.e(t);
                this.i();
                this.b(rx.exceptions.h.a(t, obj));
            }
        }
        
        @Override
        public void s0(final i i) {
            this.L.s0(i);
        }
    }
}
