// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class v2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    final boolean K;
    
    public v2(final g0<T> g0, final long h, final TimeUnit i, final j0 j, final boolean k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(final i0<? super T> i0) {
        final m<Object> m = new m<Object>((i0<? super Object>)i0);
        Object o;
        io.reactivex.disposables.c c;
        if (this.K) {
            o = super.G;
            c = new a<Object>(m, this.H, this.I, this.J);
        }
        else {
            o = super.G;
            c = new b<Object>(m, this.H, this.I, this.J);
        }
        ((g0)o).c((i0)c);
    }
    
    static final class a<T> extends c<T>
    {
        private static final long O = -7139995637533111443L;
        final AtomicInteger N;
        
        a(final i0<? super T> i0, final long n, final TimeUnit timeUnit, final j0 j0) {
            super(i0, n, timeUnit, j0);
            this.N = new AtomicInteger(1);
        }
        
        @Override
        void c() {
            this.d();
            if (this.N.decrementAndGet() == 0) {
                super.G.f();
            }
        }
        
        @Override
        public void run() {
            if (this.N.incrementAndGet() == 2) {
                this.d();
                if (this.N.decrementAndGet() == 0) {
                    super.G.f();
                }
            }
        }
    }
    
    static final class b<T> extends c<T>
    {
        private static final long N = -7139995637533111443L;
        
        b(final i0<? super T> i0, final long n, final TimeUnit timeUnit, final j0 j0) {
            super(i0, n, timeUnit, j0);
        }
        
        @Override
        void c() {
            super.G.f();
        }
        
        @Override
        public void run() {
            this.d();
        }
    }
    
    abstract static class c<T> extends AtomicReference<T> implements i0<T>, io.reactivex.disposables.c, Runnable
    {
        private static final long M = -3517602651313910099L;
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0 J;
        final AtomicReference<io.reactivex.disposables.c> K;
        io.reactivex.disposables.c L;
        
        c(final i0<? super T> g, final long h, final TimeUnit i, final j0 j) {
            this.K = new AtomicReference<io.reactivex.disposables.c>();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            d.b(this.K);
        }
        
        @Override
        public void b(final Throwable t) {
            this.a();
            this.G.b(t);
        }
        
        abstract void c();
        
        void d() {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                this.G.m((Object)andSet);
            }
        }
        
        @Override
        public void dispose() {
            this.a();
            this.L.dispose();
        }
        
        @Override
        public void f() {
            this.a();
            this.c();
        }
        
        @Override
        public boolean i() {
            return this.L.i();
        }
        
        @Override
        public void l(io.reactivex.disposables.c g) {
            if (d.l(this.L, g)) {
                this.L = g;
                this.G.l(this);
                final j0 j = this.J;
                final long h = this.H;
                g = j.g(this, h, h, this.I);
                d.f(this.K, g);
            }
        }
        
        @Override
        public void m(final T newValue) {
            this.lazySet(newValue);
        }
    }
}
