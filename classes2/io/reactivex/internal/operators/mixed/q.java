// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.n0;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.q0;
import x5.o;
import io.reactivex.b0;

public final class q<T, R> extends b0<R>
{
    final b0<T> G;
    final o<? super T, ? extends q0<? extends R>> H;
    final boolean I;
    
    public q(final b0<T> g, final o<? super T, ? extends q0<? extends R>> h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        if (!r.c((Object)this.G, (o<? super Object, ? extends q0<?>>)this.H, (i0<? super Object>)i0)) {
            this.G.c(new a<Object, Object>(i0, this.H, this.I));
        }
    }
    
    static final class a<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long O = -5402190102429853762L;
        static final q.a.a<Object> P;
        final i0<? super R> G;
        final o<? super T, ? extends q0<? extends R>> H;
        final boolean I;
        final io.reactivex.internal.util.c J;
        final AtomicReference<q.a.a<R>> K;
        c L;
        volatile boolean M;
        volatile boolean N;
        
        static {
            P = new q.a.a<Object>(null);
        }
        
        a(final i0<? super R> g, final o<? super T, ? extends q0<? extends R>> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicReference<q.a.a<R>>();
        }
        
        void a() {
            final AtomicReference<q.a.a<R>> k = this.K;
            final q.a.a<Object> p = q.a.P;
            final q.a.a<R> a = k.getAndSet((q.a.a<R>)p);
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
            final AtomicReference<q.a.a<R>> k = this.K;
            int addAndGet = 1;
            while (!this.N) {
                if (j.get() != null && !this.I) {
                    g.b(j.c());
                    return;
                }
                final boolean m = this.M;
                final q.a.a<R> expectedValue = k.get();
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
        
        void d(final q.a.a<R> expectedValue, final Throwable t) {
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
        public void dispose() {
            this.N = true;
            this.L.dispose();
            this.a();
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
            final q.a.a<R> a = this.K.get();
            if (a != null) {
                a.a();
            }
            try {
                final q0 q0 = b.g((q0)this.H.apply((Object)t), "The mapper returned a null SingleSource");
                final q.a.a<R> newValue = new q.a.a<R>(this);
                q.a.a<R> expectedValue;
                do {
                    expectedValue = this.K.get();
                    if (expectedValue == q.a.P) {
                        return;
                    }
                } while (!this.K.compareAndSet(expectedValue, newValue));
                q0.c(newValue);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.L.dispose();
                this.K.getAndSet((q.a.a<R>)q.a.P);
                this.b(t2);
            }
        }
        
        static final class a<R> extends AtomicReference<c> implements n0<R>
        {
            private static final long I = 8042919737683345351L;
            final q.a<?, R> G;
            volatile R H;
            
            a(final q.a<?, R> g) {
                this.G = g;
            }
            
            void a() {
                d.b(this);
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.d(this, t);
            }
            
            @Override
            public void d(final R h) {
                this.H = h;
                this.G.c();
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
