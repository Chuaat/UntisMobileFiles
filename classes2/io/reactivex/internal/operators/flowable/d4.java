// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class d4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final long J;
    final TimeUnit K;
    final j0 L;
    final int M;
    final boolean N;
    
    public d4(final l<T> l, final long i, final long j, final TimeUnit k, final j0 m, final int m2, final boolean n) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
        this.M = m2;
        this.N = n;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I, this.J, this.K, this.L, this.M, this.N));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d
    {
        private static final long S = -5677354903406201275L;
        final c<? super T> G;
        final long H;
        final long I;
        final TimeUnit J;
        final j0 K;
        final io.reactivex.internal.queue.c<Object> L;
        final boolean M;
        d N;
        final AtomicLong O;
        volatile boolean P;
        volatile boolean Q;
        Throwable R;
        
        a(final c<? super T> g, final long h, final long i, final TimeUnit j, final j0 k, final int n, final boolean m) {
            this.O = new AtomicLong();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = new io.reactivex.internal.queue.c<Object>(n);
            this.M = m;
        }
        
        boolean a(final boolean b, final c<? super T> c, final boolean b2) {
            if (this.P) {
                this.L.clear();
                return true;
            }
            if (b2) {
                if (b) {
                    final Throwable r = this.R;
                    if (r != null) {
                        c.b(r);
                    }
                    else {
                        c.f();
                    }
                    return true;
                }
            }
            else {
                final Throwable r2 = this.R;
                if (r2 != null) {
                    this.L.clear();
                    c.b(r2);
                    return true;
                }
                if (b) {
                    c.f();
                    return true;
                }
            }
            return false;
        }
        
        public void b(final Throwable r) {
            if (this.M) {
                this.d(this.K.d(this.J), this.L);
            }
            this.R = r;
            this.Q = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super T> g = this.G;
            final io.reactivex.internal.queue.c<Object> l = this.L;
            final boolean m = this.M;
            int addAndGet = 1;
        Label_0139:
            do {
                if (this.Q) {
                    if (this.a(l.isEmpty(), g, m)) {
                        return;
                    }
                    final long value = this.O.get();
                    long n = 0L;
                    while (!this.a(l.peek() == null, g, m)) {
                        if (value == n) {
                            if (n != 0L) {
                                io.reactivex.internal.util.d.e(this.O, n);
                                continue Label_0139;
                            }
                            continue Label_0139;
                        }
                        else {
                            l.poll();
                            g.m(l.poll());
                            ++n;
                        }
                    }
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void cancel() {
            if (!this.P) {
                this.P = true;
                this.N.cancel();
                if (this.getAndIncrement() == 0) {
                    this.L.clear();
                }
            }
        }
        
        void d(final long n, final io.reactivex.internal.queue.c<Object> c) {
            final long i = this.I;
            final long h = this.H;
            final boolean b = h == Long.MAX_VALUE;
            while (!c.isEmpty() && (c.peek() < n - i || (!b && c.q() >> 1 > h))) {
                c.poll();
                c.poll();
            }
        }
        
        public void f() {
            this.d(this.K.d(this.J), this.L);
            this.Q = true;
            this.c();
        }
        
        public void m(final T t) {
            final io.reactivex.internal.queue.c<Object> l = this.L;
            final long d = this.K.d(this.J);
            l.p(d, t);
            this.d(d, l);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.O, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d n) {
            if (j.o(this.N, n)) {
                this.N = n;
                this.G.z((d)this);
                n.v(Long.MAX_VALUE);
            }
        }
    }
}
