// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.b0;
import x5.o;
import io.reactivex.g0;

public final class x3<T, U, V> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final g0<U> H;
    final o<? super T, ? extends g0<V>> I;
    final g0<? extends T> J;
    
    public x3(final b0<T> b0, final g0<U> h, final o<? super T, ? extends g0<V>> i, final g0<? extends T> j) {
        super(b0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        io.reactivex.disposables.c c2;
        if (this.J == null) {
            final c<Object> c = new c<Object>((i0<? super Object>)i0, (o<? super Object, ? extends g0<?>>)this.I);
            i0.l(c);
            c.d(this.H);
            c2 = c;
        }
        else {
            final b<Object> b = new b<Object>((i0<? super Object>)i0, (o<? super Object, ? extends g0<?>>)this.I, this.J);
            i0.l(b);
            b.d(this.H);
            c2 = b;
        }
        super.G.c((i0<? super T>)c2);
    }
    
    static final class a extends AtomicReference<c> implements i0<Object>, c
    {
        private static final long I = 8708641127342403073L;
        final d G;
        final long H;
        
        a(final long h, final d g) {
            this.H = h;
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            final io.reactivex.internal.disposables.d value = ((AtomicReference<io.reactivex.internal.disposables.d>)this).get();
            final io.reactivex.internal.disposables.d g = io.reactivex.internal.disposables.d.G;
            if (value != g) {
                ((AtomicReference<io.reactivex.internal.disposables.d>)this).lazySet(g);
                this.G.c(this.H, t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }
        
        @Override
        public void f() {
            final io.reactivex.internal.disposables.d value = ((AtomicReference<io.reactivex.internal.disposables.d>)this).get();
            final io.reactivex.internal.disposables.d g = io.reactivex.internal.disposables.d.G;
            if (value != g) {
                ((AtomicReference<io.reactivex.internal.disposables.d>)this).lazySet(g);
                ((y3.d)this.G).a(this.H);
            }
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            io.reactivex.internal.disposables.d.j(this, c);
        }
        
        @Override
        public void m(final Object o) {
            final c c = this.get();
            final io.reactivex.internal.disposables.d g = io.reactivex.internal.disposables.d.G;
            if (c != g) {
                c.dispose();
                ((AtomicReference<io.reactivex.internal.disposables.d>)this).lazySet(g);
                ((y3.d)this.G).a(this.H);
            }
        }
    }
    
    static final class b<T> extends AtomicReference<c> implements i0<T>, c, d
    {
        private static final long M = -7508389464265974549L;
        final i0<? super T> G;
        final o<? super T, ? extends g0<?>> H;
        final h I;
        final AtomicLong J;
        final AtomicReference<c> K;
        g0<? extends T> L;
        
        b(final i0<? super T> g, final o<? super T, ? extends g0<?>> h, final g0<? extends T> l) {
            this.G = g;
            this.H = h;
            this.I = new h();
            this.L = l;
            this.J = new AtomicLong();
            this.K = new AtomicReference<c>();
        }
        
        @Override
        public void a(final long expectedValue) {
            if (this.J.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.K);
                final g0<? extends T> l = this.L;
                this.L = null;
                l.c(new y3.a<Object>(this.G, this));
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.I.dispose();
                this.G.b(t);
                this.I.dispose();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final long expectedValue, final Throwable t) {
            if (this.J.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this);
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void d(final g0<?> g0) {
            if (g0 != null) {
                final x3.a a = new x3.a(0L, this);
                if (this.I.a(a)) {
                    g0.c(a);
                }
            }
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.K);
            io.reactivex.internal.disposables.d.b(this);
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (this.J.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.I.dispose();
                this.G.f();
                this.I.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            io.reactivex.internal.disposables.d.j(this.K, c);
        }
        
        @Override
        public void m(final T t) {
            final long value = this.J.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong j = this.J;
                final long newValue = 1L + value;
                if (j.compareAndSet(value, newValue)) {
                    final c c = this.I.get();
                    if (c != null) {
                        c.dispose();
                    }
                    this.G.m((Object)t);
                    try {
                        final g0 g0 = io.reactivex.internal.functions.b.g((g0)this.H.apply((Object)t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        final x3.a a = new x3.a(newValue, this);
                        if (this.I.a(a)) {
                            g0.c(a);
                        }
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        this.K.get().dispose();
                        this.J.getAndSet(Long.MAX_VALUE);
                        this.G.b(t2);
                    }
                }
            }
        }
    }
    
    static final class c<T> extends AtomicLong implements i0<T>, io.reactivex.disposables.c, d
    {
        private static final long K = 3764492702657003550L;
        final i0<? super T> G;
        final o<? super T, ? extends g0<?>> H;
        final h I;
        final AtomicReference<io.reactivex.disposables.c> J;
        
        c(final i0<? super T> g, final o<? super T, ? extends g0<?>> h) {
            this.G = g;
            this.H = h;
            this.I = new h();
            this.J = new AtomicReference<io.reactivex.disposables.c>();
        }
        
        @Override
        public void a(final long expectedValue) {
            if (this.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.J);
                this.G.b(new TimeoutException());
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.I.dispose();
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final long expectedValue, final Throwable t) {
            if (this.compareAndSet(expectedValue, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.J);
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void d(final g0<?> g0) {
            if (g0 != null) {
                final x3.a a = new x3.a(0L, this);
                if (this.I.a(a)) {
                    g0.c(a);
                }
            }
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.J);
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.I.dispose();
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.J.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this.J, c);
        }
        
        @Override
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
                        final g0 g0 = b.g((g0)this.H.apply((Object)t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        final x3.a a = new x3.a(newValue, this);
                        if (this.I.a(a)) {
                            g0.c(a);
                        }
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        this.J.get().dispose();
                        this.getAndSet(Long.MAX_VALUE);
                        this.G.b(t2);
                    }
                }
            }
        }
    }
    
    interface d extends y3.d
    {
        void c(final long p0, final Throwable p1);
    }
}
