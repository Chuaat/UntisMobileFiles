// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.b0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class y3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    final g0<? extends T> K;
    
    public y3(final b0<T> b0, final long h, final TimeUnit i, final j0 j, final g0<? extends T> k) {
        super(b0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        io.reactivex.disposables.c c2;
        if (this.K == null) {
            final c<Object> c = new c<Object>((i0<? super Object>)i0, this.H, this.I, this.J.c());
            i0.l(c);
            c.d(0L);
            c2 = c;
        }
        else {
            final b<Object> b = new b<Object>((i0<? super Object>)i0, this.H, this.I, this.J.c(), this.K);
            i0.l(b);
            b.d(0L);
            c2 = b;
        }
        super.G.c((i0<? super T>)c2);
    }
    
    static final class a<T> implements i0<T>
    {
        final i0<? super T> G;
        final AtomicReference<io.reactivex.disposables.c> H;
        
        a(final i0<? super T> g, final AtomicReference<io.reactivex.disposables.c> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.f(this.H, c);
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
    }
    
    static final class b<T> extends AtomicReference<c> implements i0<T>, c, d
    {
        private static final long O = 3764492702657003550L;
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        final h K;
        final AtomicLong L;
        final AtomicReference<c> M;
        g0<? extends T> N;
        
        b(final i0<? super T> g, final long h, final TimeUnit i, final j0.c j, final g0<? extends T> n) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.N = n;
            this.K = new h();
            this.L = new AtomicLong();
            this.M = new AtomicReference<c>();
        }
        
        @Override
        public void a(final long expectedValue) {
            if (this.L.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.M);
                final g0<? extends T> n = this.N;
                this.N = null;
                n.c(new a<Object>(this.G, this));
                this.J.dispose();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.L.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.K.dispose();
                this.G.b(t);
                this.J.dispose();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void d(final long n) {
            this.K.a(this.J.c(new e(n, this), this.H, this.I));
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.M);
            io.reactivex.internal.disposables.d.b(this);
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (this.L.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.K.dispose();
                this.G.f();
                this.J.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            io.reactivex.internal.disposables.d.j(this.M, c);
        }
        
        @Override
        public void m(final T t) {
            final long value = this.L.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong l = this.L;
                final long newValue = 1L + value;
                if (l.compareAndSet(value, newValue)) {
                    this.K.get().dispose();
                    this.G.m((Object)t);
                    this.d(newValue);
                }
            }
        }
    }
    
    static final class c<T> extends AtomicLong implements i0<T>, io.reactivex.disposables.c, d
    {
        private static final long M = 3764492702657003550L;
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        final h K;
        final AtomicReference<io.reactivex.disposables.c> L;
        
        c(final i0<? super T> g, final long h, final TimeUnit i, final j0.c j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new h();
            this.L = new AtomicReference<io.reactivex.disposables.c>();
        }
        
        @Override
        public void a(final long expectedValue) {
            if (this.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.L);
                this.G.b(new TimeoutException(k.e(this.H, this.I)));
                this.J.dispose();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.K.dispose();
                this.G.b(t);
                this.J.dispose();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void d(final long n) {
            this.K.a(this.J.c(new e(n, this), this.H, this.I));
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.L);
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.K.dispose();
                this.G.f();
                this.J.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.L.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this.L, c);
        }
        
        @Override
        public void m(final T t) {
            final long value = this.get();
            if (value != Long.MAX_VALUE) {
                final long newValue = 1L + value;
                if (this.compareAndSet(value, newValue)) {
                    this.K.get().dispose();
                    this.G.m((Object)t);
                    this.d(newValue);
                }
            }
        }
    }
    
    interface d
    {
        void a(final long p0);
    }
    
    static final class e implements Runnable
    {
        final d G;
        final long H;
        
        e(final long h, final d g) {
            this.H = h;
            this.G = g;
        }
        
        @Override
        public void run() {
            this.G.a(this.H);
        }
    }
}
