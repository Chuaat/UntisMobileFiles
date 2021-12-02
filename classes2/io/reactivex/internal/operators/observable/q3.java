// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class q3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final long I;
    final TimeUnit J;
    final j0 K;
    final int L;
    final boolean M;
    
    public q3(final g0<T> g0, final long h, final long i, final TimeUnit j, final j0 k, final int l, final boolean m) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H, this.I, this.J, this.K, this.L, this.M));
    }
    
    static final class a<T> extends AtomicBoolean implements i0<T>, c
    {
        private static final long Q = -5677354903406201275L;
        final i0<? super T> G;
        final long H;
        final long I;
        final TimeUnit J;
        final j0 K;
        final io.reactivex.internal.queue.c<Object> L;
        final boolean M;
        c N;
        volatile boolean O;
        Throwable P;
        
        a(final i0<? super T> g, final long h, final long i, final TimeUnit j, final j0 k, final int n, final boolean m) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = new io.reactivex.internal.queue.c<Object>(n);
            this.M = m;
        }
        
        void a() {
            if (!this.compareAndSet(false, true)) {
                return;
            }
            final i0<? super T> g = this.G;
            final io.reactivex.internal.queue.c<Object> l = this.L;
            final boolean m = this.M;
            while (!this.O) {
                if (!m) {
                    final Throwable p = this.P;
                    if (p != null) {
                        l.clear();
                        g.b(p);
                        return;
                    }
                }
                final Long poll = l.poll();
                if (poll == null) {
                    final Throwable p2 = this.P;
                    if (p2 != null) {
                        g.b(p2);
                    }
                    else {
                        g.f();
                    }
                    return;
                }
                final Object poll2 = l.poll();
                if (poll < this.K.d(this.J) - this.I) {
                    continue;
                }
                g.m(poll2);
            }
            l.clear();
        }
        
        @Override
        public void b(final Throwable p) {
            this.P = p;
            this.a();
        }
        
        @Override
        public void dispose() {
            if (!this.O) {
                this.O = true;
                this.N.dispose();
                if (this.compareAndSet(false, true)) {
                    this.L.clear();
                }
            }
        }
        
        @Override
        public void f() {
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.O;
        }
        
        @Override
        public void l(final c n) {
            if (d.l(this.N, n)) {
                this.N = n;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final io.reactivex.internal.queue.c<Object> l = this.L;
            final long d = this.K.d(this.J);
            final long i = this.I;
            final long h = this.H;
            final boolean b = h == Long.MAX_VALUE;
            l.p(d, t);
            while (!l.isEmpty() && (l.peek() <= d - i || (!b && l.q() >> 1 > h))) {
                l.poll();
                l.poll();
            }
        }
    }
}
