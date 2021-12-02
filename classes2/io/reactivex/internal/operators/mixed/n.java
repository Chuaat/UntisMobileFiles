// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.n0;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.internal.util.j;
import io.reactivex.q0;
import x5.o;
import io.reactivex.b0;

public final class n<T, R> extends b0<R>
{
    final b0<T> G;
    final o<? super T, ? extends q0<? extends R>> H;
    final j I;
    final int J;
    
    public n(final b0<T> g, final o<? super T, ? extends q0<? extends R>> h, final j i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        if (!r.c((Object)this.G, (o<? super Object, ? extends q0<?>>)this.H, (i0<? super Object>)i0)) {
            this.G.c(new a<Object, Object>(i0, this.H, this.J, this.I));
        }
    }
    
    static final class a<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long R = -9140123220065488293L;
        static final int S = 0;
        static final int T = 1;
        static final int U = 2;
        final i0<? super R> G;
        final o<? super T, ? extends q0<? extends R>> H;
        final io.reactivex.internal.util.c I;
        final n.a.a<R> J;
        final y5.n<T> K;
        final j L;
        c M;
        volatile boolean N;
        volatile boolean O;
        R P;
        volatile int Q;
        
        a(final i0<? super R> g, final o<? super T, ? extends q0<? extends R>> h, final int n, final j l) {
            this.G = g;
            this.H = h;
            this.L = l;
            this.I = new io.reactivex.internal.util.c();
            this.J = new n.a.a<R>(this);
            this.K = new io.reactivex.internal.queue.c<T>(n);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super R> g = this.G;
            final j l = this.L;
            final y5.n<T> k = this.K;
            final io.reactivex.internal.util.c i = this.I;
            int addAndGet = 1;
            Block_9: {
                while (true) {
                    Label_0290: {
                        if (this.O) {
                            k.clear();
                            this.P = null;
                        }
                        else {
                            final int q = this.Q;
                            if (i.get() != null && (l == j.G || (l == j.H && q == 0))) {
                                k.clear();
                                this.P = null;
                                break;
                            }
                            boolean b = false;
                            if (q == 0) {
                                final boolean n = this.N;
                                final T poll = k.poll();
                                if (poll == null) {
                                    b = true;
                                }
                                if (n && b) {
                                    break Block_9;
                                }
                                if (b) {
                                    break Label_0290;
                                }
                                try {
                                    final q0 q2 = io.reactivex.internal.functions.b.g((q0)this.H.apply((Object)poll), "The mapper returned a null SingleSource");
                                    this.Q = 1;
                                    q2.c(this.J);
                                    break Label_0290;
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)l);
                                    this.M.dispose();
                                    k.clear();
                                    i.a((Throwable)l);
                                    break;
                                }
                            }
                            if (q == 2) {
                                final R p = this.P;
                                this.P = null;
                                g.m(p);
                                this.Q = 0;
                                continue;
                            }
                        }
                    }
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                }
                g.b(i.c());
                return;
            }
            final Throwable c = i.c();
            if (c == null) {
                g.f();
            }
            else {
                g.b(c);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I.a(t)) {
                if (this.L == j.G) {
                    this.J.a();
                }
                this.N = true;
                this.a();
            }
            else {
                a.Y(t);
            }
        }
        
        void c(final Throwable t) {
            if (this.I.a(t)) {
                if (this.L != j.I) {
                    this.M.dispose();
                }
                this.Q = 0;
                this.a();
            }
            else {
                a.Y(t);
            }
        }
        
        void d(final R p) {
            this.P = p;
            this.Q = 2;
            this.a();
        }
        
        @Override
        public void dispose() {
            this.O = true;
            this.M.dispose();
            this.J.a();
            if (this.getAndIncrement() == 0) {
                this.K.clear();
                this.P = null;
            }
        }
        
        @Override
        public void f() {
            this.N = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.O;
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
            this.K.offer(t);
            this.a();
        }
        
        static final class a<R> extends AtomicReference<c> implements n0<R>
        {
            private static final long H = -3051469169682093892L;
            final n.a<?, R> G;
            
            a(final n.a<?, R> g) {
                this.G = g;
            }
            
            void a() {
                d.b(this);
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.c(t);
            }
            
            @Override
            public void d(final R r) {
                this.G.d(r);
            }
            
            @Override
            public void l(final c c) {
                d.f(this, c);
            }
        }
    }
}
