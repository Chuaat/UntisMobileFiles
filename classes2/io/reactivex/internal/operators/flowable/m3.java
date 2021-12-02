// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import y5.o;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.f;
import o7.c;
import x5.d;
import o7.b;
import io.reactivex.l;

public final class m3<T> extends l<Boolean>
{
    final o7.b<? extends T> H;
    final o7.b<? extends T> I;
    final d<? super T, ? super T> J;
    final int K;
    
    public m3(final o7.b<? extends T> h, final o7.b<? extends T> i, final d<? super T, ? super T> j, final int k) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void n6(final o7.c<? super Boolean> c) {
        final a a = new a(c, this.K, this.J);
        c.z((o7.d)a);
        a.q(this.H, this.I);
    }
    
    static final class a<T> extends f<Boolean> implements b
    {
        private static final long Z = -6178010334400373240L;
        final d<? super T, ? super T> S;
        final m3.c<T> T;
        final m3.c<T> U;
        final io.reactivex.internal.util.c V;
        final AtomicInteger W;
        T X;
        T Y;
        
        a(final c<? super Boolean> c, final int n, final d<? super T, ? super T> s) {
            super(c);
            this.S = s;
            this.W = new AtomicInteger();
            this.T = (m3.c<T>)new m3.c(this, n);
            this.U = (m3.c<T>)new m3.c(this, n);
            this.V = new io.reactivex.internal.util.c();
        }
        
        @Override
        public void a(final Throwable t) {
            if (this.V.a(t)) {
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c() {
            if (this.W.getAndIncrement() != 0) {
                return;
            }
            int addAndGet = 1;
        Label_0499:
            do {
                final o<T> k = this.T.K;
                final o<T> i = this.U.K;
                Label_0443: {
                    if (k != null && i != null) {
                        while (!this.i()) {
                            if (this.V.get() != null) {
                                this.n();
                                super.H.b(this.V.c());
                                return;
                            }
                            final boolean l = this.T.L;
                            final T x;
                            if ((x = this.X) == null) {
                                try {
                                    this.X = k.poll();
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)x);
                                    this.n();
                                    this.V.a((Throwable)x);
                                    super.H.b(this.V.c());
                                    return;
                                }
                            }
                            boolean b = false;
                            final boolean b2 = x == null;
                            final boolean j = this.U.L;
                            T y;
                            if ((y = this.Y) == null) {
                                try {
                                    y = i.poll();
                                    this.Y = y;
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)x);
                                    this.n();
                                    this.V.a((Throwable)x);
                                    super.H.b(this.V.c());
                                    return;
                                }
                            }
                            if (y == null) {
                                b = true;
                            }
                            if (l && j && b2 && b) {
                                this.g(Boolean.TRUE);
                                return;
                            }
                            if (l && j && b2 != b) {
                                this.n();
                                this.g(Boolean.FALSE);
                                return;
                            }
                            if (b2) {
                                continue Label_0499;
                            }
                            if (b) {
                                continue Label_0499;
                            }
                            try {
                                if (!this.S.a((Object)x, (Object)y)) {
                                    this.n();
                                    this.g(Boolean.FALSE);
                                    return;
                                }
                                this.X = null;
                                this.Y = null;
                                this.T.d();
                                this.U.d();
                                continue;
                            }
                            finally {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                this.n();
                                this.V.a(t);
                                super.H.b(this.V.c());
                                return;
                            }
                            break Label_0443;
                        }
                        this.T.c();
                        this.U.c();
                        return;
                    }
                }
                if (this.i()) {
                    this.T.c();
                    this.U.c();
                    return;
                }
                if (this.V.get() != null) {
                    this.n();
                    super.H.b(this.V.c());
                }
            } while ((addAndGet = this.W.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.T.a();
            this.U.a();
            if (this.W.getAndIncrement() == 0) {
                this.T.c();
                this.U.c();
            }
        }
        
        void n() {
            this.T.a();
            this.T.c();
            this.U.a();
            this.U.c();
        }
        
        void q(final o7.b<? extends T> b, final o7.b<? extends T> b2) {
            b.e((c)this.T);
            b2.e((c)this.U);
        }
    }
    
    interface b
    {
        void a(final Throwable p0);
        
        void c();
    }
    
    static final class c<T> extends AtomicReference<o7.d> implements q<T>
    {
        private static final long N = 4804128302091633067L;
        final b G;
        final int H;
        final int I;
        long J;
        volatile o<T> K;
        volatile boolean L;
        int M;
        
        c(final b g, final int h) {
            this.G = g;
            this.I = h - (h >> 2);
            this.H = h;
        }
        
        public void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            this.G.a(t);
        }
        
        void c() {
            final o<T> k = this.K;
            if (k != null) {
                k.clear();
            }
        }
        
        public void d() {
            if (this.M != 1) {
                final long j = this.J + 1L;
                if (j >= this.I) {
                    this.J = 0L;
                    this.get().v(j);
                }
                else {
                    this.J = j;
                }
            }
        }
        
        public void f() {
            this.L = true;
            this.G.c();
        }
        
        public void m(final T t) {
            if (this.M == 0 && !this.K.offer(t)) {
                this.b(new io.reactivex.exceptions.c());
                return;
            }
            this.G.c();
        }
        
        @Override
        public void z(final o7.d d) {
            if (j.k(this, d)) {
                if (d instanceof y5.l) {
                    final y5.l l = (y5.l)d;
                    final int e = l.E(3);
                    if (e == 1) {
                        this.M = e;
                        this.K = (o<T>)l;
                        this.L = true;
                        this.G.c();
                        return;
                    }
                    if (e == 2) {
                        this.M = e;
                        this.K = (o<T>)l;
                        d.v((long)this.H);
                        return;
                    }
                }
                this.K = new io.reactivex.internal.queue.b<T>(this.H);
                d.v((long)this.H);
            }
        }
    }
}
