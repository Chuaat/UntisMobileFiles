// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.g;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.flowables.a;
import io.reactivex.l;

public final class z2<T> extends l<T>
{
    final io.reactivex.flowables.a<T> H;
    final int I;
    final long J;
    final TimeUnit K;
    final j0 L;
    a M;
    
    public z2(final io.reactivex.flowables.a<T> a) {
        this(a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }
    
    public z2(final io.reactivex.flowables.a<T> h, final int i, final long j, final TimeUnit k, final j0 l) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    void P8(final a a) {
        synchronized (this) {
            final a m = this.M;
            if (m == null || m != a) {
                return;
            }
            final long i = a.I - 1L;
            a.I = i;
            if (i != 0L || !a.J) {
                return;
            }
            if (this.J == 0L) {
                this.R8(a);
                return;
            }
            final h h = new h();
            a.H = h;
            // monitorexit(this)
            h.a(this.L.f(a, this.J, this.K));
        }
    }
    
    void Q8(final a a) {
        synchronized (this) {
            final a m = this.M;
            if (m != null && m == a) {
                this.M = null;
                final c h = a.H;
                if (h != null) {
                    h.dispose();
                }
            }
            final long i = a.I - 1L;
            a.I = i;
            if (i == 0L) {
                final io.reactivex.flowables.a<T> h2 = this.H;
                if (h2 instanceof c) {
                    ((c)h2).dispose();
                }
                else if (h2 instanceof g) {
                    ((g)h2).d(a.get());
                }
            }
        }
    }
    
    void R8(final a a) {
        synchronized (this) {
            if (a.I == 0L && a == this.M) {
                this.M = null;
                final c c = a.get();
                d.b(a);
                final io.reactivex.flowables.a<T> h = this.H;
                if (h instanceof c) {
                    ((c)h).dispose();
                }
                else if (h instanceof g) {
                    if (c == null) {
                        a.K = true;
                    }
                    else {
                        ((g)h).d(c);
                    }
                }
            }
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        synchronized (this) {
            a m;
            if ((m = this.M) == null) {
                m = new a(this);
                this.M = m;
            }
            final long i = m.I;
            if (i == 0L) {
                final c h = m.H;
                if (h != null) {
                    h.dispose();
                }
            }
            final long j = i + 1L;
            m.I = j;
            final boolean k = m.J;
            boolean b = true;
            if (!k && j == this.I) {
                m.J = true;
            }
            else {
                b = false;
            }
            // monitorexit(this)
            this.H.m6(new b<Object>((o7.c<? super Object>)c, (z2<Object>)this, m));
            if (b) {
                this.H.T8(m);
            }
        }
    }
    
    static final class a extends AtomicReference<c> implements Runnable, g<c>
    {
        private static final long L = -4552101107598366241L;
        final z2<?> G;
        c H;
        long I;
        boolean J;
        boolean K;
        
        a(final z2<?> g) {
            this.G = g;
        }
        
        public void a(final c c) throws Exception {
            d.f(this, c);
            synchronized (this.G) {
                if (this.K) {
                    ((io.reactivex.internal.disposables.g)this.G.H).d(c);
                }
            }
        }
        
        @Override
        public void run() {
            this.G.R8(this);
        }
    }
    
    static final class b<T> extends AtomicBoolean implements q<T>, o7.d
    {
        private static final long K = -7419642935409022375L;
        final o7.c<? super T> G;
        final z2<T> H;
        final a I;
        o7.d J;
        
        b(final o7.c<? super T> g, final z2<T> h, final a i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void b(final Throwable t) {
            if (this.compareAndSet(false, true)) {
                this.H.Q8(this.I);
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            this.J.cancel();
            if (this.compareAndSet(false, true)) {
                this.H.P8(this.I);
            }
        }
        
        public void f() {
            if (this.compareAndSet(false, true)) {
                this.H.Q8(this.I);
                this.G.f();
            }
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        @Override
        public void z(final o7.d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.z((o7.d)this);
            }
        }
    }
}
