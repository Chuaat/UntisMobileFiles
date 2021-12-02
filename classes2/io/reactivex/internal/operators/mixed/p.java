// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.v;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.y;
import x5.o;
import io.reactivex.b0;

public final class p<T, R> extends b0<R>
{
    final b0<T> G;
    final o<? super T, ? extends y<? extends R>> H;
    final boolean I;
    
    public p(final b0<T> g, final o<? super T, ? extends y<? extends R>> h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        if (!r.b((Object)this.G, (o<? super Object, ? extends y<?>>)this.H, (i0<? super Object>)i0)) {
            this.G.c(new a<Object, Object>(i0, this.H, this.I));
        }
    }
    
    static final class a<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long O = -5402190102429853762L;
        static final p.a.a<Object> P;
        final i0<? super R> G;
        final o<? super T, ? extends y<? extends R>> H;
        final boolean I;
        final io.reactivex.internal.util.c J;
        final AtomicReference<p.a.a<R>> K;
        c L;
        volatile boolean M;
        volatile boolean N;
        
        static {
            P = new p.a.a<Object>(null);
        }
        
        a(final i0<? super R> g, final o<? super T, ? extends y<? extends R>> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicReference<p.a.a<R>>();
        }
        
        void a() {
            final AtomicReference<p.a.a<R>> k = this.K;
            final p.a.a<Object> p = io.reactivex.internal.operators.mixed.p.a.P;
            final p.a.a<R> a = k.getAndSet((p.a.a<R>)p);
            if (a != null && a != p) {
                a.a();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J.a(t)) {
                if (!this.I) {
                    this.a();
                }
                this.M = true;
                this.c();
            }
            else {
                a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super R> g = this.G;
            final io.reactivex.internal.util.c j = this.J;
            final AtomicReference<p.a.a<R>> k = this.K;
            int addAndGet = 1;
            while (!this.N) {
                if (j.get() != null && !this.I) {
                    g.b(j.c());
                    return;
                }
                final boolean m = this.M;
                final p.a.a<R> expectedValue = k.get();
                final boolean b = expectedValue == null;
                if (m && b) {
                    final Throwable c = j.c();
                    if (c != null) {
                        g.b(c);
                    }
                    else {
                        g.f();
                    }
                    return;
                }
                if (!b && expectedValue.H != null) {
                    k.compareAndSet(expectedValue, null);
                    g.m(expectedValue.H);
                }
                else {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
            }
        }
        
        void d(final p.a.a<R> expectedValue) {
            if (this.K.compareAndSet(expectedValue, null)) {
                this.c();
            }
        }
        
        @Override
        public void dispose() {
            this.N = true;
            this.L.dispose();
            this.a();
        }
        
        void e(final p.a.a<R> expectedValue, final Throwable t) {
            if (this.K.compareAndSet(expectedValue, null) && this.J.a(t)) {
                if (!this.I) {
                    this.L.dispose();
                    this.a();
                }
                this.c();
                return;
            }
            a.Y(t);
        }
        
        @Override
        public void f() {
            this.M = true;
            this.c();
        }
        
        @Override
        public boolean i() {
            return this.N;
        }
        
        @Override
        public void l(final c l) {
            if (d.l(this.L, l)) {
                this.L = l;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final p.a.a<R> a = this.K.get();
            if (a != null) {
                a.a();
            }
            try {
                final y y = b.g((y)this.H.apply((Object)t), "The mapper returned a null MaybeSource");
                final p.a.a<R> newValue = new p.a.a<R>(this);
                p.a.a<R> expectedValue;
                do {
                    expectedValue = this.K.get();
                    if (expectedValue == p.a.P) {
                        return;
                    }
                } while (!this.K.compareAndSet(expectedValue, newValue));
                y.c(newValue);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.L.dispose();
                this.K.getAndSet((p.a.a<R>)p.a.P);
                this.b(t2);
            }
        }
        
        static final class a<R> extends AtomicReference<c> implements v<R>
        {
            private static final long I = 8042919737683345351L;
            final p.a<?, R> G;
            volatile R H;
            
            a(final p.a<?, R> g) {
                this.G = g;
            }
            
            void a() {
                d.b(this);
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.e(this, t);
            }
            
            @Override
            public void d(final R h) {
                this.H = h;
                this.G.c();
            }
            
            @Override
            public void f() {
                this.G.d(this);
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
