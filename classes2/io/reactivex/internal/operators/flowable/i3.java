// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class i3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final j0 K;
    final boolean L;
    
    public i3(final l<T> l, final long i, final TimeUnit j, final j0 k, final boolean m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final e e = new e((o7.c<? super Object>)c);
        Object o;
        Runnable runnable;
        if (this.L) {
            o = super.H;
            runnable = new a<Object>((o7.c)e, this.I, this.J, this.K);
        }
        else {
            o = super.H;
            runnable = new b<Object>((o7.c)e, this.I, this.J, this.K);
        }
        ((l)o).m6((q)runnable);
    }
    
    static final class a<T> extends c<T>
    {
        private static final long P = -7139995637533111443L;
        final AtomicInteger O;
        
        a(final o7.c<? super T> c, final long n, final TimeUnit timeUnit, final j0 j0) {
            super(c, n, timeUnit, j0);
            this.O = new AtomicInteger(1);
        }
        
        @Override
        void c() {
            this.d();
            if (this.O.decrementAndGet() == 0) {
                super.G.f();
            }
        }
        
        public void run() {
            if (this.O.incrementAndGet() == 2) {
                this.d();
                if (this.O.decrementAndGet() == 0) {
                    super.G.f();
                }
            }
        }
    }
    
    static final class b<T> extends c<T>
    {
        private static final long O = -7139995637533111443L;
        
        b(final o7.c<? super T> c, final long n, final TimeUnit timeUnit, final j0 j0) {
            super(c, n, timeUnit, j0);
        }
        
        @Override
        void c() {
            super.G.f();
        }
        
        public void run() {
            this.d();
        }
    }
    
    abstract static class c<T> extends AtomicReference<T> implements q<T>, d, Runnable
    {
        private static final long N = -3517602651313910099L;
        final o7.c<? super T> G;
        final long H;
        final TimeUnit I;
        final j0 J;
        final AtomicLong K;
        final io.reactivex.internal.disposables.h L;
        d M;
        
        c(final o7.c<? super T> g, final long h, final TimeUnit i, final j0 j) {
            this.K = new AtomicLong();
            this.L = new io.reactivex.internal.disposables.h();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            io.reactivex.internal.disposables.d.b(this.L);
        }
        
        public void b(final Throwable t) {
            this.a();
            this.G.b(t);
        }
        
        abstract void c();
        
        public void cancel() {
            this.a();
            this.M.cancel();
        }
        
        void d() {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                if (this.K.get() != 0L) {
                    this.G.m((Object)andSet);
                    io.reactivex.internal.util.d.e(this.K, 1L);
                }
                else {
                    this.cancel();
                    this.G.b((Throwable)new io.reactivex.exceptions.c("Couldn't emit value due to lack of requests!"));
                }
            }
        }
        
        public void f() {
            this.a();
            this.c();
        }
        
        public void m(final T newValue) {
            this.lazySet(newValue);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.K, n);
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.z((d)this);
                final io.reactivex.internal.disposables.h l = this.L;
                final j0 j = this.J;
                final long h = this.H;
                l.a(j.g(this, h, h, this.I));
                m.v(Long.MAX_VALUE);
            }
        }
    }
}
