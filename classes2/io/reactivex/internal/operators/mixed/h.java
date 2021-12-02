// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.n0;
import io.reactivex.internal.functions.b;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.q0;
import x5.o;
import io.reactivex.l;

public final class h<T, R> extends l<R>
{
    final l<T> H;
    final o<? super T, ? extends q0<? extends R>> I;
    final boolean J;
    
    public h(final l<T> h, final o<? super T, ? extends q0<? extends R>> i, final boolean j) {
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.m6(new a<Object, Object>(c, this.I, this.J));
    }
    
    static final class a<T, R> extends AtomicInteger implements q<T>, d
    {
        private static final long Q = -5402190102429853762L;
        static final h.a.a<Object> R;
        final c<? super R> G;
        final o<? super T, ? extends q0<? extends R>> H;
        final boolean I;
        final io.reactivex.internal.util.c J;
        final AtomicLong K;
        final AtomicReference<h.a.a<R>> L;
        d M;
        volatile boolean N;
        volatile boolean O;
        long P;
        
        static {
            R = new h.a.a<Object>((h.a<?, Object>)null);
        }
        
        a(final c<? super R> g, final o<? super T, ? extends q0<? extends R>> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicLong();
            this.L = new AtomicReference<h.a.a<R>>();
        }
        
        void a() {
            final AtomicReference<h.a.a<R>> l = this.L;
            final h.a.a<Object> r = h.a.R;
            final h.a.a<R> a = l.getAndSet((h.a.a<R>)r);
            if (a != null && a != r) {
                a.a();
            }
        }
        
        public void b(final Throwable t) {
            if (this.J.a(t)) {
                if (!this.I) {
                    this.a();
                }
                this.N = true;
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
            final c<? super R> g = this.G;
            final io.reactivex.internal.util.c j = this.J;
            final AtomicReference<h.a.a<R>> l = this.L;
            final AtomicLong k = this.K;
            long p = this.P;
            int addAndGet = 1;
            while (!this.O) {
                if (j.get() != null && !this.I) {
                    g.b(j.c());
                    return;
                }
                final boolean n = this.N;
                final h.a.a<R> expectedValue = l.get();
                final boolean b = expectedValue == null;
                if (n && b) {
                    final Throwable c = j.c();
                    if (c != null) {
                        g.b(c);
                    }
                    else {
                        g.f();
                    }
                    return;
                }
                if (!b && expectedValue.H != null && p != k.get()) {
                    l.compareAndSet(expectedValue, null);
                    g.m((Object)expectedValue.H);
                    ++p;
                }
                else {
                    this.P = p;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
            }
        }
        
        public void cancel() {
            this.O = true;
            this.M.cancel();
            this.a();
        }
        
        void d(final h.a.a<R> expectedValue, final Throwable t) {
            if (this.L.compareAndSet(expectedValue, null) && this.J.a(t)) {
                if (!this.I) {
                    this.M.cancel();
                    this.a();
                }
                this.c();
                return;
            }
            a.Y(t);
        }
        
        public void f() {
            this.N = true;
            this.c();
        }
        
        public void m(final T t) {
            final h.a.a<R> a = this.L.get();
            if (a != null) {
                a.a();
            }
            try {
                final q0 q0 = b.g((q0)this.H.apply((Object)t), "The mapper returned a null SingleSource");
                final h.a.a<R> newValue = new h.a.a<R>(this);
                h.a.a<R> expectedValue;
                do {
                    expectedValue = this.L.get();
                    if (expectedValue == h.a.R) {
                        return;
                    }
                } while (!this.L.compareAndSet(expectedValue, newValue));
                q0.c(newValue);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.M.cancel();
                this.L.getAndSet((h.a.a<R>)h.a.R);
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            io.reactivex.internal.util.d.a(this.K, n);
            this.c();
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.z((d)this);
                m.v(Long.MAX_VALUE);
            }
        }
        
        static final class a<R> extends AtomicReference<io.reactivex.disposables.c> implements n0<R>
        {
            private static final long I = 8042919737683345351L;
            final h.a<?, R> G;
            volatile R H;
            
            a(final h.a<?, R> g) {
                this.G = g;
            }
            
            void a() {
                io.reactivex.internal.disposables.d.b(this);
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
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
