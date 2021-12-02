// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import rx.plugins.c;
import rx.internal.subscriptions.b;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.producers.a;
import rx.i;
import rx.o;
import rx.n;
import rx.functions.p;
import rx.g;

public final class j1<T, U, V> implements g.a<T>
{
    final g<T> G;
    final g<U> H;
    final p<? super T, ? extends g<V>> I;
    final g<? extends T> J;
    
    public j1(final g<T> g, final g<U> h, final p<? super T, ? extends g<V>> i, final g<? extends T> j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void a(final n<? super T> n) {
        final a<Object> a = new a<Object>((n<? super Object>)n, (p<? super Object, ? extends g<?>>)this.I, this.J);
        n.r(a.R);
        n.s0(a.O);
        a.A(this.H);
        this.G.z5(a);
    }
    
    static final class a<T> extends n<T>
    {
        final n<? super T> L;
        final p<? super T, ? extends g<?>> M;
        final g<? extends T> N;
        final a O;
        final AtomicLong P;
        final b Q;
        final b R;
        long S;
        
        a(final n<? super T> l, final p<? super T, ? extends g<?>> m, final g<? extends T> n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = new a();
            this.P = new AtomicLong();
            final b q = new b();
            this.Q = q;
            this.R = new b(this);
            this.r(q);
        }
        
        void A(final g<?> g) {
            if (g != null) {
                final j1.a.a a = new j1.a.a(0L);
                if (this.Q.b(a)) {
                    g.z5(a);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.P.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Q.i();
                this.L.b(t);
            }
            else {
                rx.plugins.c.I(t);
            }
        }
        
        @Override
        public void c() {
            if (this.P.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Q.i();
                this.L.c();
            }
        }
        
        @Override
        public void m(final T t) {
            final long value = this.P.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong p = this.P;
                final long newValue = value + 1L;
                if (p.compareAndSet(value, newValue)) {
                    final o o = this.Q.get();
                    if (o != null) {
                        o.i();
                    }
                    this.L.m((Object)t);
                    ++this.S;
                    try {
                        final g g = (g)this.M.h((Object)t);
                        if (g != null) {
                            final j1.a.a a = new j1.a.a(newValue);
                            if (this.Q.b(a)) {
                                g.z5(a);
                            }
                            return;
                        }
                        throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                    }
                    finally {
                        final Throwable t2;
                        rx.exceptions.c.e(t2);
                        this.i();
                        this.P.getAndSet(Long.MAX_VALUE);
                        this.L.b(t2);
                    }
                }
            }
        }
        
        @Override
        public void s0(final i i) {
            this.O.c(i);
        }
        
        void w(long s) {
            if (!this.P.compareAndSet(s, Long.MAX_VALUE)) {
                return;
            }
            this.i();
            if (this.N == null) {
                this.L.b(new TimeoutException());
            }
            else {
                s = this.S;
                if (s != 0L) {
                    this.O.b(s);
                }
                final k1.a<Object> a = new k1.a<Object>((n<? super Object>)this.L, this.O);
                if (this.R.b(a)) {
                    this.N.z5(a);
                }
            }
        }
        
        void x(final long expectedValue, final Throwable t) {
            if (this.P.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                this.i();
                this.L.b(t);
            }
            else {
                rx.plugins.c.I(t);
            }
        }
        
        final class a extends n<Object>
        {
            final long L;
            boolean M;
            
            a(final long l) {
                this.L = l;
            }
            
            @Override
            public void b(final Throwable t) {
                if (!this.M) {
                    this.M = true;
                    j1.a.this.x(this.L, t);
                }
                else {
                    rx.plugins.c.I(t);
                }
            }
            
            @Override
            public void c() {
                if (!this.M) {
                    this.M = true;
                    j1.a.this.w(this.L);
                }
            }
            
            @Override
            public void m(final Object o) {
                if (!this.M) {
                    this.M = true;
                    this.i();
                    j1.a.this.w(this.L);
                }
            }
        }
    }
}
