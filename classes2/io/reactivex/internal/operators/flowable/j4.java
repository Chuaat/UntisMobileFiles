// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class j4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final j0 K;
    final boolean L;
    
    public j4(final l<T> l, final long i, final TimeUnit j, final j0 k, final boolean m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I, this.J, this.K.c(), this.L));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d, Runnable
    {
        private static final long U = -8296689127439125014L;
        final c<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        final boolean K;
        final AtomicReference<T> L;
        final AtomicLong M;
        d N;
        volatile boolean O;
        Throwable P;
        volatile boolean Q;
        volatile boolean R;
        long S;
        boolean T;
        
        a(final c<? super T> g, final long h, final TimeUnit i, final j0.c j, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = new AtomicReference<T>();
            this.M = new AtomicLong();
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final AtomicReference<T> l = this.L;
            final AtomicLong m = this.M;
            final c<? super T> g = this.G;
            int addAndGet = 1;
            while (!this.Q) {
                final boolean o = this.O;
                Label_0074: {
                    Throwable p = null;
                    Label_0067: {
                        if (o && this.P != null) {
                            l.lazySet(null);
                            p = this.P;
                        }
                        else {
                            final boolean b = l.get() == null;
                            if (o) {
                                if (!b && this.K) {
                                    final T andSet = l.getAndSet(null);
                                    final long s = this.S;
                                    if (s == m.get()) {
                                        p = new io.reactivex.exceptions.c("Could not emit final value due to lack of requests");
                                        break Label_0067;
                                    }
                                    this.S = s + 1L;
                                    g.m((Object)andSet);
                                }
                                else {
                                    l.lazySet(null);
                                }
                                g.f();
                                break Label_0074;
                            }
                            if (b) {
                                if (this.R) {
                                    this.T = false;
                                    this.R = false;
                                }
                            }
                            else if (!this.T || this.R) {
                                final T andSet2 = l.getAndSet(null);
                                final long s2 = this.S;
                                if (s2 != m.get()) {
                                    g.m((Object)andSet2);
                                    this.S = s2 + 1L;
                                    this.R = false;
                                    this.T = true;
                                    this.J.c(this, this.H, this.I);
                                    continue;
                                }
                                this.N.cancel();
                                p = new io.reactivex.exceptions.c("Could not emit value due to lack of requests");
                                break Label_0067;
                            }
                            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                                return;
                            }
                            continue;
                        }
                    }
                    g.b(p);
                }
                this.J.dispose();
                return;
            }
            l.lazySet(null);
        }
        
        public void b(final Throwable p) {
            this.P = p;
            this.O = true;
            this.a();
        }
        
        public void cancel() {
            this.Q = true;
            this.N.cancel();
            this.J.dispose();
            if (this.getAndIncrement() == 0) {
                this.L.lazySet(null);
            }
        }
        
        public void f() {
            this.O = true;
            this.a();
        }
        
        public void m(final T newValue) {
            this.L.set(newValue);
            this.a();
        }
        
        public void run() {
            this.R = true;
            this.a();
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.M, n);
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
