// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.s;
import java.util.ArrayDeque;
import io.reactivex.internal.observers.t;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.internal.util.j;
import io.reactivex.g0;
import x5.o;

public final class w<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final o<? super T, ? extends g0<? extends R>> H;
    final j I;
    final int J;
    final int K;
    
    public w(final g0<T> g0, final o<? super T, ? extends g0<? extends R>> h, final j i, final int j, final int k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        super.G.c(new a<Object, Object>(i0, this.H, this.J, this.K, this.I));
    }
    
    static final class a<T, R> extends AtomicInteger implements i0<T>, c, t<R>
    {
        private static final long U = 8080567949447303262L;
        final i0<? super R> G;
        final o<? super T, ? extends g0<? extends R>> H;
        final int I;
        final int J;
        final j K;
        final io.reactivex.internal.util.c L;
        final ArrayDeque<s<R>> M;
        y5.o<T> N;
        c O;
        volatile boolean P;
        int Q;
        volatile boolean R;
        s<R> S;
        int T;
        
        a(final i0<? super R> g, final o<? super T, ? extends g0<? extends R>> h, final int i, final int j, final j k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = new io.reactivex.internal.util.c();
            this.M = new ArrayDeque<s<R>>();
        }
        
        void a() {
            s<R> s = this.S;
            while (true) {
                Label_0013: {
                    if (s == null) {
                        break Label_0013;
                    }
                    s.dispose();
                }
                if ((s = this.M.poll()) == null) {
                    return;
                }
                continue;
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.L.a(t)) {
                this.P = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final y5.o<T> n = this.N;
            final ArrayDeque<s<R>> m = this.M;
            final i0<? super R> g = this.G;
            final j k = this.K;
            int addAndGet = 1;
        Label_0032:
            while (true) {
                int i = this.T;
                while (i != this.I) {
                    if (this.R) {
                        n.clear();
                        this.a();
                        return;
                    }
                    if (k == j.G && this.L.get() != null) {
                        n.clear();
                        this.a();
                        g.b(this.L.c());
                        return;
                    }
                    try {
                        final T poll = n.poll();
                        if (poll != null) {
                            final g0 g2 = b.g((g0)this.H.apply((Object)poll), "The mapper returned a null ObservableSource");
                            final s<R> e = new s<R>(this, this.J);
                            m.offer(e);
                            g2.c(e);
                            ++i;
                            continue;
                        }
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.O.dispose();
                        n.clear();
                        this.a();
                        this.L.a(t);
                        g.b(this.L.c());
                        return;
                    }
                    break;
                }
                this.T = i;
                if (this.R) {
                    n.clear();
                    this.a();
                    return;
                }
                if (k == j.G && this.L.get() != null) {
                    n.clear();
                    this.a();
                    g.b(this.L.c());
                    return;
                }
                s<R> s;
                if ((s = this.S) == null) {
                    if (k == j.H && this.L.get() != null) {
                        n.clear();
                        this.a();
                        g.b(this.L.c());
                        return;
                    }
                    final boolean p = this.P;
                    s = m.poll();
                    final boolean b = s == null;
                    if (p && b) {
                        if (this.L.get() != null) {
                            n.clear();
                            this.a();
                            g.b(this.L.c());
                        }
                        else {
                            g.f();
                        }
                        return;
                    }
                    if (!b) {
                        this.S = s;
                    }
                }
                Label_0630: {
                    if (s != null) {
                        final y5.o<R> d = s.d();
                        while (!this.R) {
                            final boolean c = s.c();
                            if (k == j.G && this.L.get() != null) {
                                n.clear();
                                this.a();
                                g.b(this.L.c());
                                return;
                            }
                            try {
                                final R poll2 = d.poll();
                                final boolean b2 = poll2 == null;
                                if (!c || !b2) {
                                    if (b2) {
                                        break Label_0630;
                                    }
                                    g.m(poll2);
                                    continue;
                                }
                            }
                            finally {
                                io.reactivex.exceptions.b.b((Throwable)s);
                                this.L.a((Throwable)s);
                            }
                            this.S = null;
                            --this.T;
                            continue Label_0032;
                        }
                        n.clear();
                        this.a();
                        return;
                    }
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        @Override
        public void d(final s<R> s, final Throwable t) {
            if (this.L.a(t)) {
                if (this.K == j.G) {
                    this.O.dispose();
                }
                s.e();
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            if (this.R) {
                return;
            }
            this.R = true;
            this.O.dispose();
            this.h();
        }
        
        @Override
        public void e(final s<R> s) {
            s.e();
            this.c();
        }
        
        @Override
        public void f() {
            this.P = true;
            this.c();
        }
        
        @Override
        public void g(final s<R> s, final R r) {
            s.d().offer(r);
            this.c();
        }
        
        void h() {
            if (this.getAndIncrement() == 0) {
                do {
                    this.N.clear();
                    this.a();
                } while (this.decrementAndGet() != 0);
            }
        }
        
        @Override
        public boolean i() {
            return this.R;
        }
        
        @Override
        public void l(final c o) {
            if (d.l(this.O, o)) {
                this.O = o;
                if (o instanceof y5.j) {
                    final y5.j j = (y5.j)o;
                    final int e = j.E(3);
                    if (e == 1) {
                        this.Q = e;
                        this.N = (y5.o<T>)j;
                        this.P = true;
                        this.G.l(this);
                        this.c();
                        return;
                    }
                    if (e == 2) {
                        this.Q = e;
                        this.N = (y5.o<T>)j;
                        this.G.l(this);
                        return;
                    }
                }
                this.N = new io.reactivex.internal.queue.c<T>(this.J);
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.Q == 0) {
                this.N.offer(t);
            }
            this.c();
        }
    }
}
