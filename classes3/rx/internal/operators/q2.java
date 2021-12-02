// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.exceptions.h;
import rx.plugins.c;
import rx.o;
import rx.n;
import rx.functions.q;
import rx.functions.p;
import rx.g;

public final class q2<T, U, R> implements g.b<g<? extends R>, T>
{
    final p<? super T, ? extends g<? extends U>> G;
    final q<? super T, ? super U, ? extends R> H;
    
    public q2(final p<? super T, ? extends g<? extends U>> g, final q<? super T, ? super U, ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    public static <T, U> p<T, g<U>> b(final p<? super T, ? extends Iterable<? extends U>> p) {
        return new p<T, g<U>>() {
            public g<U> a(final T t) {
                return g.C2((Iterable<? extends U>)p.h(t));
            }
        };
    }
    
    public n<? super T> a(final n<? super g<? extends R>> n) {
        final b b = new b(n, this.G, this.H);
        n.r(b);
        return (n<? super T>)b;
    }
    
    static final class b<T, U, R> extends n<T>
    {
        final n<? super g<? extends R>> L;
        final p<? super T, ? extends g<? extends U>> M;
        final q<? super T, ? super U, ? extends R> N;
        boolean O;
        
        public b(final n<? super g<? extends R>> l, final p<? super T, ? extends g<? extends U>> m, final q<? super T, ? super U, ? extends R> n) {
            this.L = l;
            this.M = m;
            this.N = n;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.O) {
                rx.plugins.c.I(t);
                return;
            }
            this.O = true;
            this.L.b(t);
        }
        
        @Override
        public void c() {
            if (this.O) {
                return;
            }
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            try {
                this.L.m(((g)this.M.h((Object)t)).k3(new c(t, this.N)));
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
    
    static final class c<T, U, R> implements p<U, R>
    {
        final T G;
        final q<? super T, ? super U, ? extends R> H;
        
        public c(final T g, final q<? super T, ? super U, ? extends R> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public R h(final U u) {
            return (R)this.H.s((Object)this.G, (Object)u);
        }
    }
}
