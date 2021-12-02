// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.l;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.subjects.i;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.subjects.e;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import x5.o;

public final class u2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final o<? super b0<Throwable>, ? extends g0<?>> H;
    
    public u2(final g0<T> g0, final o<? super b0<Throwable>, ? extends g0<?>> h) {
        super(g0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final i<Throwable> p = e.r8().p8();
        try {
            final g0 g0 = b.g((g0)this.H.apply(p), "The handler returned a null ObservableSource");
            final a a = new a((i0<? super Object>)i0, p, super.G);
            i0.l(a);
            g0.c(a.K);
            a.e();
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            io.reactivex.internal.disposables.e.l(t, i0);
        }
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, c
    {
        private static final long O = 802743776666017014L;
        final i0<? super T> G;
        final AtomicInteger H;
        final io.reactivex.internal.util.c I;
        final i<Throwable> J;
        final u2.a.a K;
        final AtomicReference<c> L;
        final g0<T> M;
        volatile boolean N;
        
        a(final i0<? super T> g, final i<Throwable> j, final g0<T> m) {
            this.G = g;
            this.J = j;
            this.M = m;
            this.H = new AtomicInteger();
            this.I = new io.reactivex.internal.util.c();
            this.K = new u2.a.a();
            this.L = new AtomicReference<c>();
        }
        
        void a() {
            d.b(this.L);
            l.a(this.G, this, this.I);
        }
        
        @Override
        public void b(final Throwable t) {
            d.f(this.L, null);
            this.N = false;
            this.J.m(t);
        }
        
        void c(final Throwable t) {
            d.b(this.L);
            l.c(this.G, t, this, this.I);
        }
        
        void d() {
            this.e();
        }
        
        @Override
        public void dispose() {
            d.b(this.L);
            d.b(this.K);
        }
        
        void e() {
            if (this.H.getAndIncrement() == 0) {
                while (!this.i()) {
                    if (!this.N) {
                        this.N = true;
                        this.M.c(this);
                    }
                    if (this.H.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        @Override
        public void f() {
            d.b(this.K);
            l.a(this.G, this, this.I);
        }
        
        @Override
        public boolean i() {
            return d.d(this.L.get());
        }
        
        @Override
        public void l(final c c) {
            d.f(this.L, c);
        }
        
        @Override
        public void m(final T t) {
            l.e(this.G, t, this, this.I);
        }
        
        final class a extends AtomicReference<c> implements i0<Object>
        {
            private static final long H = 3254781284376480842L;
            
            @Override
            public void b(final Throwable t) {
                u2.a.this.c(t);
            }
            
            @Override
            public void f() {
                u2.a.this.a();
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
            
            @Override
            public void m(final Object o) {
                u2.a.this.d();
            }
        }
    }
}
