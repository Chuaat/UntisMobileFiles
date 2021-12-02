// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.i;
import rx.o;
import rx.n;
import rx.functions.p;
import rx.g;

public final class u3<T> implements g.b<T, T>
{
    final p<? super T, Boolean> G;
    
    public u3(final p<? super T, Boolean> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final b b = new b(n);
        n.r(b);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                b.w(n);
            }
        });
        return b;
    }
    
    final class b extends n<T>
    {
        private final n<? super T> L;
        private boolean M;
        
        b(final n<? super T> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.M) {
                this.L.b(t);
            }
        }
        
        @Override
        public void c() {
            if (!this.M) {
                this.L.c();
            }
        }
        
        @Override
        public void m(final T t) {
            this.L.m((Object)t);
            try {
                if (u3.this.G.h((Object)t)) {
                    this.M = true;
                    this.L.c();
                    this.i();
                }
            }
            finally {
                this.M = true;
                final Throwable t2;
                rx.exceptions.c.g(t2, this.L, t);
                this.i();
            }
        }
        
        void w(final long n) {
            this.v(n);
        }
    }
}
