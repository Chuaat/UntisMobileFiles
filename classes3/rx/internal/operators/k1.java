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
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class k1<T> implements g.a<T>
{
    final g<T> G;
    final long H;
    final TimeUnit I;
    final j J;
    final g<? extends T> K;
    
    public k1(final g<T> g, final long h, final TimeUnit i, final j j, final g<? extends T> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void a(final n<? super T> n) {
        final b<Object> b = new b<Object>((n<? super Object>)n, this.H, this.I, this.J.a(), this.K);
        n.r(b.T);
        n.s0(b.Q);
        b.x(0L);
        this.G.z5(b);
    }
    
    static final class a<T> extends n<T>
    {
        final n<? super T> L;
        final rx.internal.producers.a M;
        
        a(final n<? super T> l, final rx.internal.producers.a m) {
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            this.L.m((Object)t);
        }
        
        @Override
        public void s0(final i i) {
            this.M.c(i);
        }
    }
    
    static final class b<T> extends n<T>
    {
        final n<? super T> L;
        final long M;
        final TimeUnit N;
        final j.a O;
        final g<? extends T> P;
        final rx.internal.producers.a Q;
        final AtomicLong R;
        final rx.internal.subscriptions.b S;
        final rx.internal.subscriptions.b T;
        long U;
        
        b(final n<? super T> l, final long m, final TimeUnit n, final j.a o, final g<? extends T> p5) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = p5;
            this.Q = new rx.internal.producers.a();
            this.R = new AtomicLong();
            final rx.internal.subscriptions.b s = new rx.internal.subscriptions.b();
            this.S = s;
            this.T = new rx.internal.subscriptions.b(this);
            this.r(o);
            this.r(s);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.R.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.S.i();
                this.L.b(t);
                this.O.i();
            }
            else {
                rx.plugins.c.I(t);
            }
        }
        
        @Override
        public void c() {
            if (this.R.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.S.i();
                this.L.c();
                this.O.i();
            }
        }
        
        @Override
        public void m(final T t) {
            final long value = this.R.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong r = this.R;
                final long newValue = value + 1L;
                if (r.compareAndSet(value, newValue)) {
                    final o o = this.S.get();
                    if (o != null) {
                        o.i();
                    }
                    ++this.U;
                    this.L.m((Object)t);
                    this.x(newValue);
                }
            }
        }
        
        @Override
        public void s0(final i i) {
            this.Q.c(i);
        }
        
        void w(long u) {
            if (!this.R.compareAndSet(u, Long.MAX_VALUE)) {
                return;
            }
            this.i();
            if (this.P == null) {
                this.L.b(new TimeoutException());
            }
            else {
                u = this.U;
                if (u != 0L) {
                    this.Q.b(u);
                }
                final k1.a<Object> a = new k1.a<Object>((n<? super Object>)this.L, this.Q);
                if (this.T.b(a)) {
                    this.P.z5(a);
                }
            }
        }
        
        void x(final long n) {
            this.S.b(this.O.d(new a(n), this.M, this.N));
        }
        
        final class a implements rx.functions.a
        {
            final long G;
            
            a(final long g) {
                this.G = g;
            }
            
            @Override
            public void call() {
                b.this.w(this.G);
            }
        }
    }
}
