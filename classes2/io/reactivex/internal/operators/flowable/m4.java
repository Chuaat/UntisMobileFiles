// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import o7.b;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class m4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final j0 K;
    final o7.b<? extends T> L;
    
    public m4(final l<T> l, final long i, final TimeUnit j, final j0 k, final o7.b<? extends T> m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        d d;
        if (this.L == null) {
            final c<Object> c2 = new c<Object>((o7.c<? super Object>)c, this.I, this.J, this.K.c());
            c.z((o7.d)c2);
            c2.d(0L);
            d = c2;
        }
        else {
            final b<Object> b = new b<Object>((o7.c<? super Object>)c, this.I, this.J, this.K.c(), this.L);
            c.z((o7.d)b);
            b.k(0L);
            d = b;
        }
        super.H.m6((q<? super T>)d);
    }
    
    static final class a<T> implements q<T>
    {
        final o7.c<? super T> G;
        final i H;
        
        a(final o7.c<? super T> g, final i h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void f() {
            this.G.f();
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        @Override
        public void z(final o7.d d) {
            this.H.j(d);
        }
    }
    
    static final class b<T> extends i implements q<T>, d
    {
        private static final long Y = 3764492702657003550L;
        final o7.c<? super T> P;
        final long Q;
        final TimeUnit R;
        final j0.c S;
        final io.reactivex.internal.disposables.h T;
        final AtomicReference<o7.d> U;
        final AtomicLong V;
        long W;
        o7.b<? extends T> X;
        
        b(final o7.c<? super T> p5, final long q, final TimeUnit r, final j0.c s, final o7.b<? extends T> x) {
            super(true);
            this.P = p5;
            this.Q = q;
            this.R = r;
            this.S = s;
            this.X = x;
            this.T = new io.reactivex.internal.disposables.h();
            this.U = new AtomicReference<o7.d>();
            this.V = new AtomicLong();
        }
        
        @Override
        public void a(long w) {
            if (this.V.compareAndSet(w, Long.MAX_VALUE)) {
                j.b(this.U);
                w = this.W;
                if (w != 0L) {
                    this.i(w);
                }
                final o7.b<? extends T> x = this.X;
                this.X = null;
                x.e((o7.c)new a((o7.c<? super Object>)this.P, this));
                this.S.dispose();
            }
        }
        
        public void b(final Throwable t) {
            if (this.V.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.T.dispose();
                this.P.b(t);
                this.S.dispose();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.S.dispose();
        }
        
        public void f() {
            if (this.V.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.T.dispose();
                this.P.f();
                this.S.dispose();
            }
        }
        
        void k(final long n) {
            this.T.a(this.S.c(new e(n, this), this.Q, this.R));
        }
        
        public void m(final T t) {
            final long value = this.V.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong v = this.V;
                final long newValue = value + 1L;
                if (v.compareAndSet(value, newValue)) {
                    this.T.get().dispose();
                    ++this.W;
                    this.P.m((Object)t);
                    this.k(newValue);
                }
            }
        }
        
        @Override
        public void z(final o7.d d) {
            if (j.k(this.U, d)) {
                this.j(d);
            }
        }
    }
    
    static final class c<T> extends AtomicLong implements q<T>, o7.d, d
    {
        private static final long N = 3764492702657003550L;
        final o7.c<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        final io.reactivex.internal.disposables.h K;
        final AtomicReference<o7.d> L;
        final AtomicLong M;
        
        c(final o7.c<? super T> g, final long h, final TimeUnit i, final j0.c j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new io.reactivex.internal.disposables.h();
            this.L = new AtomicReference<o7.d>();
            this.M = new AtomicLong();
        }
        
        public void a(final long expectedValue) {
            if (this.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                j.b(this.L);
                this.G.b((Throwable)new TimeoutException(k.e(this.H, this.I)));
                this.J.dispose();
            }
        }
        
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
        
        public void cancel() {
            j.b(this.L);
            this.J.dispose();
        }
        
        void d(final long n) {
            this.K.a(this.J.c(new e(n, this), this.H, this.I));
        }
        
        public void f() {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.K.dispose();
                this.G.f();
                this.J.dispose();
            }
        }
        
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
        
        public void v(final long n) {
            j.d(this.L, this.M, n);
        }
        
        @Override
        public void z(final o7.d d) {
            j.f(this.L, this.M, d);
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
