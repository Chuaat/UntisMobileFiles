// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import x5.o;
import o7.b;

public final class l4<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o7.b<U> I;
    final o<? super T, ? extends o7.b<V>> J;
    final o7.b<? extends T> K;
    
    public l4(final l<T> l, final o7.b<U> i, final o<? super T, ? extends o7.b<V>> j, final o7.b<? extends T> k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        c c2;
        if (this.K == null) {
            final d<Object> d = new d<Object>((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.J);
            c.z((o7.d)d);
            d.d(this.I);
            c2 = d;
        }
        else {
            final b<Object> b = new b<Object>((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.J, this.K);
            c.z((o7.d)b);
            b.k(this.I);
            c2 = b;
        }
        super.H.m6((q<? super T>)c2);
    }
    
    static final class a extends AtomicReference<o7.d> implements q<Object>, io.reactivex.disposables.c
    {
        private static final long I = 8708641127342403073L;
        final l4.c G;
        final long H;
        
        a(final long h, final l4.c g) {
            this.H = h;
            this.G = g;
        }
        
        public void b(final Throwable t) {
            final j value = ((AtomicReference<j>)this).get();
            final j g = j.G;
            if (value != g) {
                this.lazySet((o7.d)g);
                this.G.c(this.H, t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            j.b(this);
        }
        
        public void f() {
            final j value = ((AtomicReference<j>)this).get();
            final j g = j.G;
            if (value != g) {
                this.lazySet((o7.d)g);
                ((m4.d)this.G).a(this.H);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == j.G;
        }
        
        public void m(final Object o) {
            final o7.d d = this.get();
            final j g = j.G;
            if (d != g) {
                d.cancel();
                this.lazySet((o7.d)g);
                ((m4.d)this.G).a(this.H);
            }
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
    
    static final class b<T> extends i implements q<T>, c
    {
        private static final long W = 3764492702657003550L;
        final o7.c<? super T> P;
        final o<? super T, ? extends o7.b<?>> Q;
        final io.reactivex.internal.disposables.h R;
        final AtomicReference<d> S;
        final AtomicLong T;
        o7.b<? extends T> U;
        long V;
        
        b(final o7.c<? super T> p3, final o<? super T, ? extends o7.b<?>> q, final o7.b<? extends T> u) {
            super(true);
            this.P = p3;
            this.Q = q;
            this.R = new io.reactivex.internal.disposables.h();
            this.S = new AtomicReference<d>();
            this.U = u;
            this.T = new AtomicLong();
        }
        
        public void a(long v) {
            if (this.T.compareAndSet(v, Long.MAX_VALUE)) {
                j.b(this.S);
                final o7.b<? extends T> u = this.U;
                this.U = null;
                v = this.V;
                if (v != 0L) {
                    this.i(v);
                }
                u.e((o7.c)new m4.a((o7.c<? super Object>)this.P, this));
            }
        }
        
        public void b(final Throwable t) {
            if (this.T.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.R.dispose();
                this.P.b(t);
                this.R.dispose();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final long expectedValue, final Throwable t) {
            if (this.T.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                j.b(this.S);
                this.P.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.R.dispose();
        }
        
        public void f() {
            if (this.T.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.R.dispose();
                this.P.f();
                this.R.dispose();
            }
        }
        
        void k(final o7.b<?> b) {
            if (b != null) {
                final l4.a a = new l4.a(0L, this);
                if (this.R.a(a)) {
                    b.e((o7.c)a);
                }
            }
        }
        
        public void m(final T t) {
            final long value = this.T.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong t2 = this.T;
                final long newValue = value + 1L;
                if (t2.compareAndSet(value, newValue)) {
                    final io.reactivex.disposables.c c = this.R.get();
                    if (c != null) {
                        c.dispose();
                    }
                    ++this.V;
                    this.P.m((Object)t);
                    try {
                        final o7.b b = io.reactivex.internal.functions.b.g((o7.b)this.Q.apply((Object)t), "The itemTimeoutIndicator returned a null Publisher.");
                        final l4.a a = new l4.a(newValue, this);
                        if (this.R.a(a)) {
                            b.e((o7.c)a);
                        }
                    }
                    finally {
                        final Throwable t3;
                        io.reactivex.exceptions.b.b(t3);
                        this.S.get().cancel();
                        this.T.getAndSet(Long.MAX_VALUE);
                        this.P.b(t3);
                    }
                }
            }
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this.S, d)) {
                this.j(d);
            }
        }
    }
    
    interface c extends m4.d
    {
        void c(final long p0, final Throwable p1);
    }
    
    static final class d<T> extends AtomicLong implements q<T>, o7.d, c
    {
        private static final long L = 3764492702657003550L;
        final o7.c<? super T> G;
        final o<? super T, ? extends b<?>> H;
        final io.reactivex.internal.disposables.h I;
        final AtomicReference<o7.d> J;
        final AtomicLong K;
        
        d(final o7.c<? super T> g, final o<? super T, ? extends b<?>> h) {
            this.G = g;
            this.H = h;
            this.I = new io.reactivex.internal.disposables.h();
            this.J = new AtomicReference<o7.d>();
            this.K = new AtomicLong();
        }
        
        public void a(final long expectedValue) {
            if (this.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                j.b(this.J);
                this.G.b((Throwable)new TimeoutException());
            }
        }
        
        public void b(final Throwable t) {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.I.dispose();
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void c(final long expectedValue, final Throwable t) {
            if (this.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                j.b(this.J);
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            j.b(this.J);
            this.I.dispose();
        }
        
        void d(final b<?> b) {
            if (b != null) {
                final l4.a a = new l4.a(0L, this);
                if (this.I.a(a)) {
                    b.e((o7.c)a);
                }
            }
        }
        
        public void f() {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.I.dispose();
                this.G.f();
            }
        }
        
        public void m(final T t) {
            final long value = this.get();
            if (value != Long.MAX_VALUE) {
                final long newValue = 1L + value;
                if (this.compareAndSet(value, newValue)) {
                    final io.reactivex.disposables.c c = this.I.get();
                    if (c != null) {
                        c.dispose();
                    }
                    this.G.m((Object)t);
                    try {
                        final b b = io.reactivex.internal.functions.b.g((b)this.H.apply((Object)t), "The itemTimeoutIndicator returned a null Publisher.");
                        final l4.a a = new l4.a(newValue, this);
                        if (this.I.a(a)) {
                            b.e((o7.c)a);
                        }
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        this.J.get().cancel();
                        this.getAndSet(Long.MAX_VALUE);
                        this.G.b(t2);
                    }
                }
            }
        }
        
        public void v(final long n) {
            j.d(this.J, this.K, n);
        }
        
        @Override
        public void z(final o7.d d) {
            j.f(this.J, this.K, d);
        }
    }
}
