// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import x5.o;
import io.reactivex.g0;
import io.reactivex.b0;

public final class u<T, R> extends b0<R>
{
    final g0<? extends T>[] G;
    final Iterable<? extends g0<? extends T>> H;
    final o<? super Object[], ? extends R> I;
    final int J;
    final boolean K;
    
    public u(final g0<? extends T>[] g, final Iterable<? extends g0<? extends T>> h, final o<? super Object[], ? extends R> i, final int j, final boolean k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(final i0<? super R> i0) {
        g0<? extends T>[] g = this.G;
        int length;
        if (g == null) {
            g0<? extends T>[] array = (g0<? extends T>[])new b0[8];
            final Iterator<? extends g0<? extends T>> iterator = this.H.iterator();
            int n = 0;
            while (true) {
                g = array;
                length = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final g0<? extends T> g2 = (g0<? extends T>)iterator.next();
                g0<? extends T>[] array2 = array;
                if (n == array.length) {
                    array2 = (g0<? extends T>[])new g0[(n >> 2) + n];
                    System.arraycopy(array, 0, array2, 0, n);
                }
                array2[n] = g2;
                ++n;
                array = array2;
            }
        }
        else {
            length = g.length;
        }
        if (length == 0) {
            e.f(i0);
            return;
        }
        new b((i0<? super Object>)i0, this.I, length, this.J, this.K).g((g0[])g);
    }
    
    static final class a<T, R> extends AtomicReference<c> implements i0<T>
    {
        private static final long I = -4823716997131257941L;
        final b<T, R> G;
        final int H;
        
        a(final b<T, R> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.e(this.H, t);
        }
        
        @Override
        public void f() {
            this.G.d(this.H);
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void m(final T t) {
            this.G.f(this.H, t);
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements c
    {
        private static final long R = 8567835998786448817L;
        final i0<? super R> G;
        final o<? super Object[], ? extends R> H;
        final a<T, R>[] I;
        Object[] J;
        final io.reactivex.internal.queue.c<Object[]> K;
        final boolean L;
        volatile boolean M;
        volatile boolean N;
        final io.reactivex.internal.util.c O;
        int P;
        int Q;
        
        b(final i0<? super R> g, final o<? super Object[], ? extends R> h, final int n, final int n2, final boolean l) {
            this.O = new io.reactivex.internal.util.c();
            this.G = g;
            this.H = h;
            this.L = l;
            this.J = new Object[n];
            final a[] i = new a[n];
            for (int j = 0; j < n; ++j) {
                i[j] = new a((b<Object, Object>)this, j);
            }
            this.I = (a<T, R>[])i;
            this.K = new io.reactivex.internal.queue.c<Object[]>(n2);
        }
        
        void a() {
            final a<T, R>[] i = this.I;
            for (int length = i.length, j = 0; j < length; ++j) {
                i[j].a();
            }
        }
        
        void b(final io.reactivex.internal.queue.c<?> c) {
            synchronized (this) {
                this.J = null;
                // monitorexit(this)
                c.clear();
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final io.reactivex.internal.queue.c<Object[]> k = this.K;
            final i0<? super R> g = this.G;
            final boolean l = this.L;
            int addAndGet = 1;
            while (!this.M) {
                if (l || this.O.get() == null) {
                    final boolean n = this.N;
                    final Object[] array = k.poll();
                    final boolean b = array == null;
                    if (n && b) {
                        this.b(k);
                        final Throwable c = this.O.c();
                        if (c == null) {
                            g.f();
                        }
                        else {
                            g.b(c);
                        }
                        return;
                    }
                    if (b) {
                        if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                            return;
                        }
                        continue;
                    }
                    else {
                        try {
                            g.m(io.reactivex.internal.functions.b.g((Object)this.H.apply(array), "The combiner returned a null value"));
                            continue;
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            this.O.a(t);
                        }
                    }
                }
                this.a();
                this.b(k);
                g.b(this.O.c());
                return;
            }
            this.b(k);
        }
        
        void d(int n) {
            synchronized (this) {
                final Object[] j = this.J;
                if (j == null) {
                    return;
                }
                if (j[n] == null) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0 || ++this.Q == j.length) {
                    this.N = true;
                }
                // monitorexit(this)
                if (n != 0) {
                    this.a();
                }
                this.c();
            }
        }
        
        @Override
        public void dispose() {
            if (!this.M) {
                this.M = true;
                this.a();
                if (this.getAndIncrement() == 0) {
                    this.b(this.K);
                }
            }
        }
        
        void e(int n, final Throwable t) {
            if (this.O.a(t)) {
                final boolean l = this.L;
                int q = 1;
                if (l) {
                    synchronized (this) {
                        final Object[] j = this.J;
                        if (j == null) {
                            return;
                        }
                        if (j[n] == null) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        Label_0080: {
                            if (n == 0) {
                                q = this.Q + 1;
                                if ((this.Q = q) != j.length) {
                                    break Label_0080;
                                }
                            }
                            this.N = true;
                        }
                        // monitorexit(this)
                        q = n;
                    }
                }
                if (q != 0) {
                    this.a();
                }
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void f(int n, final T t) {
            synchronized (this) {
                final Object[] j = this.J;
                if (j == null) {
                    return;
                }
                final Object o = j[n];
                int p2;
                final int n2 = p2 = this.P;
                if (o == null) {
                    p2 = n2 + 1;
                    this.P = p2;
                }
                j[n] = t;
                if (p2 == j.length) {
                    this.K.offer(j.clone());
                    n = 1;
                }
                else {
                    n = 0;
                }
                // monitorexit(this)
                if (n != 0) {
                    this.c();
                }
            }
        }
        
        public void g(final g0<? extends T>[] array) {
            final a<T, R>[] i = this.I;
            final int length = i.length;
            this.G.l(this);
            for (int n = 0; n < length && !this.N && !this.M; ++n) {
                array[n].c(i[n]);
            }
        }
        
        @Override
        public boolean i() {
            return this.M;
        }
    }
}
