// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.b;
import io.reactivex.internal.subscriptions.j;
import y5.n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.n0;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import io.reactivex.q0;

public final class h2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final q0<? extends T> I;
    
    public h2(final l<T> l, final q0<? extends T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c);
        c.z((d)a);
        super.H.m6(a);
        this.I.c((n0<? super T>)a.I);
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d
    {
        private static final long U = -4592979584110982903L;
        static final int V = 1;
        static final int W = 2;
        final c<? super T> G;
        final AtomicReference<d> H;
        final h2.a.a<T> I;
        final io.reactivex.internal.util.c J;
        final AtomicLong K;
        final int L;
        final int M;
        volatile n<T> N;
        T O;
        volatile boolean P;
        volatile boolean Q;
        volatile int R;
        long S;
        int T;
        
        a(final c<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<d>();
            this.I = new h2.a.a<T>(this);
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicLong();
            final int b0 = l.b0();
            this.L = b0;
            this.M = b0 - (b0 >> 2);
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                this.c();
            }
        }
        
        public void b(final Throwable t) {
            if (this.J.a(t)) {
                j.b(this.H);
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            final c<? super T> g = this.G;
            long s = this.S;
            int t = this.T;
            final int m = this.M;
            int addAndGet = 1;
            while (true) {
                final long value = this.K.get();
                long n;
                while (true) {
                    n = lcmp(s, value);
                    if (n == 0) {
                        break;
                    }
                    if (this.P) {
                        this.O = null;
                        this.N = null;
                        return;
                    }
                    if (this.J.get() != null) {
                        this.O = null;
                        this.N = null;
                        g.b(this.J.c());
                        return;
                    }
                    final int r = this.R;
                    if (r == 1) {
                        final T o = this.O;
                        this.O = null;
                        this.R = 2;
                        g.m((Object)o);
                        ++s;
                    }
                    else {
                        final boolean q = this.Q;
                        final n<T> n2 = this.N;
                        Object poll;
                        if (n2 != null) {
                            poll = n2.poll();
                        }
                        else {
                            poll = null;
                        }
                        final boolean b = poll == null;
                        if (q && b && r == 2) {
                            this.N = null;
                            g.f();
                            return;
                        }
                        if (b) {
                            break;
                        }
                        g.m(poll);
                        ++s;
                        if (++t != m) {
                            continue;
                        }
                        this.H.get().v((long)m);
                        t = 0;
                    }
                }
                if (n == 0) {
                    if (this.P) {
                        this.O = null;
                        this.N = null;
                        return;
                    }
                    if (this.J.get() != null) {
                        this.O = null;
                        this.N = null;
                        g.b(this.J.c());
                        return;
                    }
                    final boolean q2 = this.Q;
                    final n<T> n3 = this.N;
                    final boolean b2 = n3 == null || n3.isEmpty();
                    if (q2 && b2 && this.R == 2) {
                        this.N = null;
                        g.f();
                        return;
                    }
                }
                this.S = s;
                this.T = t;
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet == 0) {
                    return;
                }
            }
        }
        
        public void cancel() {
            this.P = true;
            j.b(this.H);
            io.reactivex.internal.disposables.d.b(this.I);
            if (this.getAndIncrement() == 0) {
                this.N = null;
                this.O = null;
            }
        }
        
        n<T> d() {
            n<T> n;
            if ((n = this.N) == null) {
                n = new b<T>(l.b0());
                this.N = n;
            }
            return n;
        }
        
        void e(final Throwable t) {
            if (this.J.a(t)) {
                j.b(this.H);
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void f() {
            this.Q = true;
            this.a();
        }
        
        void g(final T t) {
            if (this.compareAndSet(0, 1)) {
                final long s = this.S;
                if (this.K.get() != s) {
                    this.S = s + 1L;
                    this.G.m((Object)t);
                    this.R = 2;
                }
                else {
                    this.O = t;
                    this.R = 1;
                    if (this.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
            else {
                this.O = t;
                this.R = 1;
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.c();
        }
        
        public void m(final T t) {
            if (this.compareAndSet(0, 1)) {
                final long s = this.S;
                if (this.K.get() != s) {
                    final n<T> n = this.N;
                    if (n != null && !n.isEmpty()) {
                        n.offer(t);
                    }
                    else {
                        this.S = s + 1L;
                        this.G.m((Object)t);
                        final int t2 = this.T + 1;
                        if (t2 == this.M) {
                            this.T = 0;
                            this.H.get().v((long)t2);
                        }
                        else {
                            this.T = t2;
                        }
                    }
                }
                else {
                    this.d().offer(t);
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                this.d().offer(t);
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.c();
        }
        
        public void v(final long n) {
            io.reactivex.internal.util.d.a(this.K, n);
            this.a();
        }
        
        @Override
        public void z(final d d) {
            j.l(this.H, d, this.L);
        }
        
        static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements n0<T>
        {
            private static final long H = -2935427570954647017L;
            final h2.a<T> G;
            
            a(final h2.a<T> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.e(t);
            }
            
            @Override
            public void d(final T t) {
                this.G.g(t);
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
