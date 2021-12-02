// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.observers.e;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class d0<T, U> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final o<? super T, ? extends g0<U>> H;
    
    public d0(final g0<T> g0, final o<? super T, ? extends g0<U>> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object, Object>(new m<Object>(i0), this.H));
    }
    
    static final class a<T, U> implements i0<T>, c
    {
        final i0<? super T> G;
        final o<? super T, ? extends g0<U>> H;
        c I;
        final AtomicReference<c> J;
        volatile long K;
        boolean L;
        
        a(final i0<? super T> g, final o<? super T, ? extends g0<U>> h) {
            this.J = new AtomicReference<c>();
            this.G = g;
            this.H = h;
        }
        
        void a(final long n, final T t) {
            if (n == this.K) {
                this.G.m((Object)t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            d.b(this.J);
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            d.b(this.J);
        }
        
        @Override
        public void f() {
            if (this.L) {
                return;
            }
            this.L = true;
            final c c = this.J.get();
            if (c != d.G) {
                ((d0.a.a)c).c();
                d.b(this.J);
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.L) {
                return;
            }
            final long k = this.K + 1L;
            this.K = k;
            final c expectedValue = this.J.get();
            if (expectedValue != null) {
                expectedValue.dispose();
            }
            try {
                final g0 g0 = b.g((g0)this.H.apply((Object)t), "The ObservableSource supplied is null");
                final d0.a.a newValue = new d0.a.a((d0.a<Object, Object>)this, k, t);
                if (this.J.compareAndSet(expectedValue, newValue)) {
                    g0.c(newValue);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.dispose();
                this.G.b(t2);
            }
        }
        
        static final class a<T, U> extends e<U>
        {
            final d0.a<T, U> H;
            final long I;
            final T J;
            boolean K;
            final AtomicBoolean L;
            
            a(final d0.a<T, U> h, final long i, final T j) {
                this.L = new AtomicBoolean();
                this.H = h;
                this.I = i;
                this.J = j;
            }
            
            @Override
            public void b(final Throwable t) {
                if (this.K) {
                    io.reactivex.plugins.a.Y(t);
                    return;
                }
                this.K = true;
                this.H.b(t);
            }
            
            void c() {
                if (this.L.compareAndSet(false, true)) {
                    this.H.a(this.I, this.J);
                }
            }
            
            @Override
            public void f() {
                if (this.K) {
                    return;
                }
                this.K = true;
                this.c();
            }
            
            @Override
            public void m(final U u) {
                if (this.K) {
                    return;
                }
                this.K = true;
                this.dispose();
                this.c();
            }
        }
    }
}
