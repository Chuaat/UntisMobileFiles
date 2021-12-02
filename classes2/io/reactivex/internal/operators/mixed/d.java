// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.a;
import io.reactivex.v;
import io.reactivex.internal.queue.b;
import y5.n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.internal.util.j;
import io.reactivex.y;
import x5.o;
import io.reactivex.l;

public final class d<T, R> extends l<R>
{
    final l<T> H;
    final o<? super T, ? extends y<? extends R>> I;
    final j J;
    final int K;
    
    public d(final l<T> h, final o<? super T, ? extends y<? extends R>> i, final j j, final int k) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.m6(new a<Object, Object>(c, this.I, this.K, this.J));
    }
    
    static final class a<T, R> extends AtomicInteger implements q<T>, o7.d
    {
        private static final long V = -9140123220065488293L;
        static final int W = 0;
        static final int X = 1;
        static final int Y = 2;
        final c<? super R> G;
        final o<? super T, ? extends y<? extends R>> H;
        final int I;
        final AtomicLong J;
        final io.reactivex.internal.util.c K;
        final d.a.a<R> L;
        final n<T> M;
        final j N;
        o7.d O;
        volatile boolean P;
        volatile boolean Q;
        long R;
        int S;
        R T;
        volatile int U;
        
        a(final c<? super R> g, final o<? super T, ? extends y<? extends R>> h, final int i, final j n) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.N = n;
            this.J = new AtomicLong();
            this.K = new io.reactivex.internal.util.c();
            this.L = new d.a.a<R>(this);
            this.M = new b<T>(i);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super R> g = this.G;
            final j n = this.N;
            final n<T> m = this.M;
            final io.reactivex.internal.util.c k = this.K;
            final AtomicLong j = this.J;
            final int i = this.I;
            final int n2 = i - (i >> 1);
            int addAndGet = 1;
            Block_9: {
                while (true) {
                    Label_0377: {
                        if (this.Q) {
                            m.clear();
                            this.T = null;
                        }
                        else {
                            final int u = this.U;
                            if (k.get() != null && (n == io.reactivex.internal.util.j.G || (n == io.reactivex.internal.util.j.H && u == 0))) {
                                m.clear();
                                this.T = null;
                                break;
                            }
                            if (u == 0) {
                                final boolean p = this.P;
                                final T poll = m.poll();
                                final boolean b = poll == null;
                                if (p && b) {
                                    break Block_9;
                                }
                                if (b) {
                                    break Label_0377;
                                }
                                final int s = this.S + 1;
                                if (s == n2) {
                                    this.S = 0;
                                    this.O.v((long)n2);
                                }
                                else {
                                    this.S = s;
                                }
                                try {
                                    final y y = io.reactivex.internal.functions.b.g((y)this.H.apply((Object)poll), "The mapper returned a null MaybeSource");
                                    this.U = 1;
                                    y.c(this.L);
                                    break Label_0377;
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)n);
                                    this.O.cancel();
                                    m.clear();
                                    k.a((Throwable)n);
                                    break;
                                }
                            }
                            if (u == 2) {
                                final long r = this.R;
                                if (r != j.get()) {
                                    final R t = this.T;
                                    this.T = null;
                                    g.m((Object)t);
                                    this.R = r + 1L;
                                    this.U = 0;
                                    continue;
                                }
                            }
                        }
                    }
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                }
                g.b(k.c());
                return;
            }
            final Throwable c = k.c();
            if (c == null) {
                g.f();
            }
            else {
                g.b(c);
            }
        }
        
        public void b(final Throwable t) {
            if (this.K.a(t)) {
                if (this.N == j.G) {
                    this.L.a();
                }
                this.P = true;
                this.a();
            }
            else {
                a.Y(t);
            }
        }
        
        void c() {
            this.U = 0;
            this.a();
        }
        
        public void cancel() {
            this.Q = true;
            this.O.cancel();
            this.L.a();
            if (this.getAndIncrement() == 0) {
                this.M.clear();
                this.T = null;
            }
        }
        
        void d(final Throwable t) {
            if (this.K.a(t)) {
                if (this.N != j.I) {
                    this.O.cancel();
                }
                this.U = 0;
                this.a();
            }
            else {
                a.Y(t);
            }
        }
        
        void e(final R t) {
            this.T = t;
            this.U = 2;
            this.a();
        }
        
        public void f() {
            this.P = true;
            this.a();
        }
        
        public void m(final T t) {
            if (!this.M.offer(t)) {
                this.O.cancel();
                this.b(new io.reactivex.exceptions.c("queue full?!"));
                return;
            }
            this.a();
        }
        
        public void v(final long n) {
            io.reactivex.internal.util.d.a(this.J, n);
            this.a();
        }
        
        @Override
        public void z(final o7.d o) {
            if (io.reactivex.internal.subscriptions.j.o(this.O, o)) {
                this.O = o;
                this.G.z((o7.d)this);
                o.v((long)this.I);
            }
        }
        
        static final class a<R> extends AtomicReference<io.reactivex.disposables.c> implements v<R>
        {
            private static final long H = -3051469169682093892L;
            final d.a<?, R> G;
            
            a(final d.a<?, R> g) {
                this.G = g;
            }
            
            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.d(t);
            }
            
            @Override
            public void d(final R r) {
                this.G.e(r);
            }
            
            @Override
            public void f() {
                this.G.c();
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.f(this, c);
            }
        }
    }
}
