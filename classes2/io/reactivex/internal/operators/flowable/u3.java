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

public final class u3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final j0 K;
    final int L;
    final boolean M;
    
    public u3(final l<T> l, final long i, final TimeUnit j, final j0 k, final int m, final boolean m2) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
        this.M = m2;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I, this.J, this.K, this.L, this.M));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d
    {
        private static final long R = -5677354903406201275L;
        final c<? super T> G;
        final long H;
        final TimeUnit I;
        final j0 J;
        final io.reactivex.internal.queue.c<Object> K;
        final boolean L;
        d M;
        final AtomicLong N;
        volatile boolean O;
        volatile boolean P;
        Throwable Q;
        
        a(final c<? super T> g, final long h, final TimeUnit i, final j0 j, final int n, final boolean l) {
            this.N = new AtomicLong();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new io.reactivex.internal.queue.c<Object>(n);
            this.L = l;
        }
        
        boolean a(final boolean b, final boolean b2, final c<? super T> c, final boolean b3) {
            if (this.O) {
                this.K.clear();
                return true;
            }
            if (b) {
                if (b3) {
                    if (b2) {
                        final Throwable q = this.Q;
                        if (q != null) {
                            c.b(q);
                        }
                        else {
                            c.f();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable q2 = this.Q;
                    if (q2 != null) {
                        this.K.clear();
                        c.b(q2);
                        return true;
                    }
                    if (b2) {
                        c.f();
                        return true;
                    }
                }
            }
            return false;
        }
        
        public void b(final Throwable q) {
            this.Q = q;
            this.P = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super T> g = this.G;
            final io.reactivex.internal.queue.c<Object> k = this.K;
            final boolean l = this.L;
            final TimeUnit i = this.I;
            final j0 j = this.J;
            final long h = this.H;
            int addAndGet = 1;
            do {
                long value;
                long n;
                for (value = this.N.get(), n = 0L; n != value; ++n) {
                    final boolean p = this.P;
                    final Long n2 = k.peek();
                    boolean b = n2 == null;
                    final long d = j.d(i);
                    if (!b && n2 > d - h) {
                        b = true;
                    }
                    if (this.a(p, b, g, l)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    k.poll();
                    g.m(k.poll());
                }
                if (n != 0L) {
                    io.reactivex.internal.util.d.e(this.N, n);
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void cancel() {
            if (!this.O) {
                this.O = true;
                this.M.cancel();
                if (this.getAndIncrement() == 0) {
                    this.K.clear();
                }
            }
        }
        
        public void f() {
            this.P = true;
            this.c();
        }
        
        public void m(final T t) {
            this.K.p(this.J.d(this.I), t);
            this.c();
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.N, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.z((d)this);
                m.v(Long.MAX_VALUE);
            }
        }
    }
}
