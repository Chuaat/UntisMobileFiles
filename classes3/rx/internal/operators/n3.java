// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.functions.a;
import rx.o;
import rx.n;
import rx.j;
import rx.g;

public final class n3<T> implements g.a<T>
{
    final j G;
    final g<T> H;
    final boolean I;
    
    public n3(final g<T> h, final j g, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final n<? super T> n) {
        final j.a a = this.G.a();
        final a a2 = new a(n, this.I, a, this.H);
        n.r(a2);
        n.r(a);
        a.c(a2);
    }
    
    static final class a<T> extends n<T> implements rx.functions.a
    {
        final n<? super T> L;
        final boolean M;
        final j.a N;
        g<T> O;
        Thread P;
        
        a(final n<? super T> l, final boolean m, final j.a n, final g<T> o) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                this.L.b(t);
            }
            finally {
                this.N.i();
            }
        }
        
        @Override
        public void c() {
            try {
                this.L.c();
            }
            finally {
                this.N.i();
            }
        }
        
        @Override
        public void call() {
            final g<T> o = this.O;
            this.O = null;
            this.P = Thread.currentThread();
            o.R6(this);
        }
        
        @Override
        public void m(final T t) {
            this.L.m((Object)t);
        }
        
        @Override
        public void s0(final i i) {
            this.L.s0(new i() {
                @Override
                public void v(final long n) {
                    if (a.this.P != Thread.currentThread()) {
                        final a h = a.this;
                        if (h.M) {
                            h.N.c(new rx.functions.a() {
                                @Override
                                public void call() {
                                    i.v(n);
                                }
                            });
                            return;
                        }
                    }
                    i.v(n);
                }
            });
        }
    }
}
