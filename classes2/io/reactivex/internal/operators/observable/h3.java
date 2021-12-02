// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class h3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    final int K;
    final boolean L;
    
    public h3(final g0<T> g0, final long h, final TimeUnit i, final j0 j, final int k, final boolean l) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H, this.I, this.J, this.K, this.L));
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, c
    {
        private static final long Q = -5677354903406201275L;
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0 J;
        final io.reactivex.internal.queue.c<Object> K;
        final boolean L;
        c M;
        volatile boolean N;
        volatile boolean O;
        Throwable P;
        
        a(final i0<? super T> g, final long h, final TimeUnit i, final j0 j, final int n, final boolean l) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new io.reactivex.internal.queue.c<Object>(n);
            this.L = l;
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super T> g = this.G;
            final io.reactivex.internal.queue.c<Object> k = this.K;
            final boolean l = this.L;
            final TimeUnit i = this.I;
            final j0 j = this.J;
            final long h = this.H;
            int addAndGet = 1;
            while (!this.N) {
                final boolean o = this.O;
                final Long n = k.peek();
                final boolean b = n == null;
                final long d = j.d(i);
                boolean b2 = b;
                if (!b) {
                    b2 = b;
                    if (n > d - h) {
                        b2 = true;
                    }
                }
                if (o) {
                    if (l) {
                        if (b2) {
                            final Throwable p = this.P;
                            if (p != null) {
                                g.b(p);
                            }
                            else {
                                g.f();
                            }
                            return;
                        }
                    }
                    else {
                        final Throwable p2 = this.P;
                        if (p2 != null) {
                            this.K.clear();
                            g.b(p2);
                            return;
                        }
                        if (b2) {
                            g.f();
                            return;
                        }
                    }
                }
                if (b2) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    k.poll();
                    g.m(k.poll());
                }
            }
            this.K.clear();
        }
        
        @Override
        public void b(final Throwable p) {
            this.P = p;
            this.O = true;
            this.a();
        }
        
        @Override
        public void dispose() {
            if (!this.N) {
                this.N = true;
                this.M.dispose();
                if (this.getAndIncrement() == 0) {
                    this.K.clear();
                }
            }
        }
        
        @Override
        public void f() {
            this.O = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.N;
        }
        
        @Override
        public void l(final c m) {
            if (d.l(this.M, m)) {
                this.M = m;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.K.p(this.J.d(this.I), t);
            this.a();
        }
    }
}
