// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import y5.n;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.q;
import io.reactivex.internal.functions.b;
import io.reactivex.l;
import java.util.concurrent.Callable;
import x5.c;

public final class l3<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final c<R, ? super T, R> I;
    final Callable<R> J;
    
    public l3(final l<T> l, final Callable<R> j, final c<R, ? super T, R> i) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        try {
            super.H.m6(new a<Object, Object>(c, this.I, b.g(this.J.call(), "The seed supplied is null"), l.b0()));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            g.d(t, c);
        }
    }
    
    static final class a<T, R> extends AtomicInteger implements q<T>, d
    {
        private static final long S = -1776795561228106469L;
        final o7.c<? super R> G;
        final c<R, ? super T, R> H;
        final n<R> I;
        final AtomicLong J;
        final int K;
        final int L;
        volatile boolean M;
        volatile boolean N;
        Throwable O;
        d P;
        R Q;
        int R;
        
        a(final o7.c<? super R> g, final c<R, ? super T, R> h, final R q, final int k) {
            this.G = g;
            this.H = h;
            this.Q = q;
            this.K = k;
            this.L = k - (k >> 2);
            (this.I = new io.reactivex.internal.queue.b<R>(k)).offer(q);
            this.J = new AtomicLong();
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super R> g = this.G;
            final n<R> i = this.I;
            final int l = this.L;
            int r = this.R;
            int addAndGet = 1;
            do {
                final long value = this.J.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (this.M) {
                        i.clear();
                        return;
                    }
                    final boolean n3 = this.N;
                    if (n3) {
                        final Throwable o = this.O;
                        if (o != null) {
                            i.clear();
                            g.b(o);
                            return;
                        }
                    }
                    final R poll = i.poll();
                    final boolean b = poll == null;
                    if (n3 && b) {
                        g.f();
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m((Object)poll);
                    final long n4 = n + 1L;
                    final int n5 = ++r;
                    n = n4;
                    if (n5 != l) {
                        continue;
                    }
                    this.P.v((long)l);
                    r = 0;
                    n = n4;
                }
                if (n2 == 0 && this.N) {
                    final Throwable o2 = this.O;
                    if (o2 != null) {
                        i.clear();
                        g.b(o2);
                        return;
                    }
                    if (i.isEmpty()) {
                        g.f();
                        return;
                    }
                }
                if (n != 0L) {
                    io.reactivex.internal.util.d.e(this.J, n);
                }
                this.R = r;
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void b(final Throwable o) {
            if (this.N) {
                io.reactivex.plugins.a.Y(o);
                return;
            }
            this.O = o;
            this.N = true;
            this.a();
        }
        
        public void cancel() {
            this.M = true;
            this.P.cancel();
            if (this.getAndIncrement() == 0) {
                this.I.clear();
            }
        }
        
        public void f() {
            if (this.N) {
                return;
            }
            this.N = true;
            this.a();
        }
        
        public void m(final T t) {
            if (this.N) {
                return;
            }
            final R q = this.Q;
            try {
                final R g = b.g(this.H.b(q, (Object)t), "The accumulator returned a null value");
                this.Q = g;
                this.I.offer(g);
                this.a();
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.P.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.a();
            }
        }
        
        @Override
        public void z(final d p) {
            if (j.o(this.P, p)) {
                this.P = p;
                this.G.z((d)this);
                p.v((long)(this.K - 1));
            }
        }
    }
}
