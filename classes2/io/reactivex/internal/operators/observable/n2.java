// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.h;
import io.reactivex.disposables.c;
import x5.g;
import io.reactivex.i0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.observables.a;
import io.reactivex.b0;

public final class n2<T> extends b0<T>
{
    final io.reactivex.observables.a<T> G;
    final int H;
    final long I;
    final TimeUnit J;
    final j0 K;
    a L;
    
    public n2(final io.reactivex.observables.a<T> a) {
        this(a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }
    
    public n2(final io.reactivex.observables.a<T> g, final int h, final long i, final TimeUnit j, final j0 k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        synchronized (this) {
            a l;
            if ((l = this.L) == null) {
                l = new a(this);
                this.L = l;
            }
            final long j = l.I;
            if (j == 0L) {
                final c h = l.H;
                if (h != null) {
                    h.dispose();
                }
            }
            final long k = j + 1L;
            l.I = k;
            final boolean m = l.J;
            boolean b = true;
            if (!m && k == this.H) {
                l.J = true;
            }
            else {
                b = false;
            }
            // monitorexit(this)
            this.G.c(new b<Object>((i0<? super Object>)i0, (n2<Object>)this, l));
            if (b) {
                this.G.p8(l);
            }
        }
    }
    
    void l8(final a a) {
        synchronized (this) {
            final a l = this.L;
            if (l == null || l != a) {
                return;
            }
            final long i = a.I - 1L;
            a.I = i;
            if (i != 0L || !a.J) {
                return;
            }
            if (this.I == 0L) {
                this.n8(a);
                return;
            }
            final h h = new h();
            a.H = h;
            // monitorexit(this)
            h.a(this.K.f(a, this.I, this.J));
        }
    }
    
    void m8(final a a) {
        synchronized (this) {
            final a l = this.L;
            if (l != null && l == a) {
                this.L = null;
                final c h = a.H;
                if (h != null) {
                    h.dispose();
                }
            }
            final long i = a.I - 1L;
            a.I = i;
            if (i == 0L) {
                final io.reactivex.observables.a<T> g = this.G;
                if (g instanceof c) {
                    ((c)g).dispose();
                }
                else if (g instanceof io.reactivex.internal.disposables.g) {
                    ((io.reactivex.internal.disposables.g)g).d(a.get());
                }
            }
        }
    }
    
    void n8(final a a) {
        synchronized (this) {
            if (a.I == 0L && a == this.L) {
                this.L = null;
                final c c = a.get();
                d.b(a);
                final io.reactivex.observables.a<T> g = this.G;
                if (g instanceof c) {
                    ((c)g).dispose();
                }
                else if (g instanceof io.reactivex.internal.disposables.g) {
                    if (c == null) {
                        a.K = true;
                    }
                    else {
                        ((io.reactivex.internal.disposables.g)g).d(c);
                    }
                }
            }
        }
    }
    
    static final class a extends AtomicReference<c> implements Runnable, g<c>
    {
        private static final long L = -4552101107598366241L;
        final n2<?> G;
        c H;
        long I;
        boolean J;
        boolean K;
        
        a(final n2<?> g) {
            this.G = g;
        }
        
        public void a(final c c) throws Exception {
            d.f(this, c);
            synchronized (this.G) {
                if (this.K) {
                    ((io.reactivex.internal.disposables.g)this.G.G).d(c);
                }
            }
        }
        
        @Override
        public void run() {
            this.G.n8(this);
        }
    }
    
    static final class b<T> extends AtomicBoolean implements i0<T>, c
    {
        private static final long K = -7419642935409022375L;
        final i0<? super T> G;
        final n2<T> H;
        final a I;
        c J;
        
        b(final i0<? super T> g, final n2<T> h, final a i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.compareAndSet(false, true)) {
                this.H.m8(this.I);
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
            if (this.compareAndSet(false, true)) {
                this.H.l8(this.I);
            }
        }
        
        @Override
        public void f() {
            if (this.compareAndSet(false, true)) {
                this.H.m8(this.I);
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
    }
}
