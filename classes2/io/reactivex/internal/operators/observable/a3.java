// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.a;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import x5.d;
import io.reactivex.g0;
import io.reactivex.b0;

public final class a3<T> extends b0<Boolean>
{
    final g0<? extends T> G;
    final g0<? extends T> H;
    final d<? super T, ? super T> I;
    final int J;
    
    public a3(final g0<? extends T> g, final g0<? extends T> h, final d<? super T, ? super T> i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super Boolean> i0) {
        final a a = new a(i0, this.J, this.G, this.H, (d<? super Object, ? super Object>)this.I);
        i0.l(a);
        a.d();
    }
    
    static final class a<T> extends AtomicInteger implements c
    {
        private static final long P = -6178010334400373240L;
        final i0<? super Boolean> G;
        final d<? super T, ? super T> H;
        final io.reactivex.internal.disposables.a I;
        final g0<? extends T> J;
        final g0<? extends T> K;
        final b<T>[] L;
        volatile boolean M;
        T N;
        T O;
        
        a(final i0<? super Boolean> g, final int n, final g0<? extends T> j, final g0<? extends T> k, final d<? super T, ? super T> h) {
            this.G = g;
            this.J = j;
            this.K = k;
            this.H = h;
            final b[] l = new b[2];
            (this.L = (b<T>[])l)[0] = (b<T>)new b((a<Object>)this, 0, n);
            l[1] = new b((a<Object>)this, 1, n);
            this.I = new io.reactivex.internal.disposables.a(2);
        }
        
        void a(final io.reactivex.internal.queue.c<T> c, final io.reactivex.internal.queue.c<T> c2) {
            this.M = true;
            c.clear();
            c2.clear();
        }
        
        void b() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final b<T>[] l = this.L;
            final b<T> b = l[0];
            final io.reactivex.internal.queue.c<T> h = b.H;
            final b<T> b2 = l[1];
            final io.reactivex.internal.queue.c<T> h2 = b2.H;
            int addAndGet = 1;
            while (!this.M) {
                final boolean j = b.J;
                if (j) {
                    final Throwable k = b.K;
                    if (k != null) {
                        this.a(h, h2);
                        this.G.b(k);
                        return;
                    }
                }
                final boolean i = b2.J;
                if (i) {
                    final Throwable m = b2.K;
                    if (m != null) {
                        this.a(h, h2);
                        this.G.b(m);
                        return;
                    }
                }
                if (this.N == null) {
                    this.N = h.poll();
                }
                final boolean b3 = this.N == null;
                if (this.O == null) {
                    this.O = h2.poll();
                }
                final T o = this.O;
                final boolean b4 = o == null;
                if (j && i && b3 && b4) {
                    this.G.m(Boolean.TRUE);
                    this.G.f();
                    return;
                }
                if (j && i && b3 != b4) {
                    this.a(h, h2);
                    this.G.m(Boolean.FALSE);
                    this.G.f();
                    return;
                }
                if (!b3 && !b4) {
                    try {
                        if (!this.H.a((Object)this.N, (Object)o)) {
                            this.a(h, h2);
                            this.G.m(Boolean.FALSE);
                            this.G.f();
                            return;
                        }
                        this.N = null;
                        this.O = null;
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)b);
                        this.a(h, h2);
                        this.G.b((Throwable)b);
                        return;
                    }
                }
                if ((b3 || b4) && (addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            h.clear();
            h2.clear();
        }
        
        boolean c(final c c, final int n) {
            return this.I.b(n, c);
        }
        
        void d() {
            final b<T>[] l = this.L;
            this.J.c(l[0]);
            this.K.c(l[1]);
        }
        
        @Override
        public void dispose() {
            if (!this.M) {
                this.M = true;
                this.I.dispose();
                if (this.getAndIncrement() == 0) {
                    final b<T>[] l = this.L;
                    l[0].H.clear();
                    l[1].H.clear();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.M;
        }
    }
    
    static final class b<T> implements i0<T>
    {
        final a<T> G;
        final io.reactivex.internal.queue.c<T> H;
        final int I;
        volatile boolean J;
        Throwable K;
        
        b(final a<T> g, final int i, final int n) {
            this.G = g;
            this.I = i;
            this.H = new io.reactivex.internal.queue.c<T>(n);
        }
        
        @Override
        public void b(final Throwable k) {
            this.K = k;
            this.J = true;
            this.G.b();
        }
        
        @Override
        public void f() {
            this.J = true;
            this.G.b();
        }
        
        @Override
        public void l(final c c) {
            this.G.c(c, this.I);
        }
        
        @Override
        public void m(final T t) {
            this.H.offer(t);
            this.G.b();
        }
    }
}
