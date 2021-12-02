// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.Serializable;
import io.reactivex.subscribers.e;
import o7.c;
import o7.b;
import io.reactivex.l;

public final class h3<T> extends l<T>
{
    final o7.b<T> H;
    final o7.b<?> I;
    final boolean J;
    
    public h3(final o7.b<T> h, final o7.b<?> i, final boolean j) {
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final e e = new e((o7.c<? super Object>)c);
        o7.b<T> b;
        Serializable s;
        if (this.J) {
            b = this.H;
            s = new a<Object>((o7.c<?>)e, this.I);
        }
        else {
            b = this.H;
            s = new b<Object>((o7.c<?>)e, this.I);
        }
        b.e((o7.c)s);
    }
    
    static final class a<T> extends c<T>
    {
        private static final long O = -3029755663834015785L;
        final AtomicInteger M;
        volatile boolean N;
        
        a(final o7.c<? super T> c, final o7.b<?> b) {
            super(c, b);
            this.M = new AtomicInteger();
        }
        
        @Override
        void c() {
            this.N = true;
            if (this.M.getAndIncrement() == 0) {
                this.d();
                super.G.f();
            }
        }
        
        @Override
        void g() {
            if (this.M.getAndIncrement() == 0) {
                do {
                    final boolean n = this.N;
                    this.d();
                    if (n) {
                        super.G.f();
                    }
                } while (this.M.decrementAndGet() != 0);
            }
        }
    }
    
    static final class b<T> extends c<T>
    {
        private static final long M = -3029755663834015785L;
        
        b(final o7.c<? super T> c, final o7.b<?> b) {
            super(c, b);
        }
        
        @Override
        void c() {
            super.G.f();
        }
        
        @Override
        void g() {
            this.d();
        }
    }
    
    abstract static class c<T> extends AtomicReference<T> implements q<T>, o7.d
    {
        private static final long L = -3517602651313910099L;
        final o7.c<? super T> G;
        final o7.b<?> H;
        final AtomicLong I;
        final AtomicReference<o7.d> J;
        o7.d K;
        
        c(final o7.c<? super T> g, final o7.b<?> h) {
            this.I = new AtomicLong();
            this.J = new AtomicReference<o7.d>();
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            this.K.cancel();
            this.c();
        }
        
        public void b(final Throwable t) {
            j.b(this.J);
            this.G.b(t);
        }
        
        abstract void c();
        
        public void cancel() {
            j.b(this.J);
            this.K.cancel();
        }
        
        void d() {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                if (this.I.get() != 0L) {
                    this.G.m((Object)andSet);
                    io.reactivex.internal.util.d.e(this.I, 1L);
                }
                else {
                    this.cancel();
                    this.G.b((Throwable)new io.reactivex.exceptions.c("Couldn't emit value due to lack of requests!"));
                }
            }
        }
        
        public void e(final Throwable t) {
            this.K.cancel();
            this.G.b(t);
        }
        
        public void f() {
            j.b(this.J);
            this.c();
        }
        
        abstract void g();
        
        void h(final o7.d d) {
            j.l(this.J, d, Long.MAX_VALUE);
        }
        
        public void m(final T newValue) {
            this.lazySet(newValue);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.I, n);
            }
        }
        
        @Override
        public void z(final o7.d k) {
            if (j.o(this.K, k)) {
                this.K = k;
                this.G.z((o7.d)this);
                if (this.J.get() == null) {
                    this.H.e((o7.c)new d((c<Object>)this));
                    k.v(Long.MAX_VALUE);
                }
            }
        }
    }
    
    static final class d<T> implements q<Object>
    {
        final c<T> G;
        
        d(final c<T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.G.e(t);
        }
        
        public void f() {
            this.G.a();
        }
        
        public void m(final Object o) {
            this.G.g();
        }
        
        @Override
        public void z(final o7.d d) {
            this.G.h(d);
        }
    }
}
