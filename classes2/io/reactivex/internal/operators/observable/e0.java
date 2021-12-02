// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class e0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    
    public e0(final g0<T> g0, final long h, final TimeUnit i, final j0 j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new b<Object>(new m<Object>((i0<? super T>)i0), this.H, this.I, this.J.c()));
    }
    
    static final class a<T> extends AtomicReference<c> implements Runnable, c
    {
        private static final long K = 6812032969491025141L;
        final T G;
        final long H;
        final b<T> I;
        final AtomicBoolean J;
        
        a(final T g, final long h, final b<T> i) {
            this.J = new AtomicBoolean();
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void a(final c c) {
            d.f(this, c);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean i() {
            return this.get() == d.G;
        }
        
        @Override
        public void run() {
            if (this.J.compareAndSet(false, true)) {
                this.I.a(this.H, this.G, this);
            }
        }
    }
    
    static final class b<T> implements i0<T>, c
    {
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        c K;
        c L;
        volatile long M;
        boolean N;
        
        b(final i0<? super T> g, final long h, final TimeUnit i, final j0.c j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a(final long n, final T t, final a<T> a) {
            if (n == this.M) {
                this.G.m((Object)t);
                a.dispose();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.N) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            final c l = this.L;
            if (l != null) {
                l.dispose();
            }
            this.N = true;
            this.G.b(t);
            this.J.dispose();
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (this.N) {
                return;
            }
            this.N = true;
            final c l = this.L;
            if (l != null) {
                l.dispose();
            }
            final a a = (a)l;
            if (a != null) {
                a.run();
            }
            this.G.f();
            this.J.dispose();
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.N) {
                return;
            }
            final long m = this.M + 1L;
            this.M = m;
            final c l = this.L;
            if (l != null) {
                l.dispose();
            }
            final a i = new a(t, m, (b)this);
            ((a)(this.L = i)).a(this.J.c(i, this.H, this.I));
        }
    }
}
