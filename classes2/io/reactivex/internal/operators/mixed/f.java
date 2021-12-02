// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.functions.b;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.k;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import io.reactivex.i;
import x5.o;
import io.reactivex.l;
import io.reactivex.c;

public final class f<T> extends c
{
    final l<T> G;
    final o<? super T, ? extends i> H;
    final boolean I;
    
    public f(final l<T> g, final o<? super T, ? extends i> h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L0(final io.reactivex.f f) {
        this.G.m6(new a<Object>(f, this.H, this.I));
    }
    
    static final class a<T> implements q<T>, io.reactivex.disposables.c
    {
        static final f.a.a N;
        final io.reactivex.f G;
        final o<? super T, ? extends i> H;
        final boolean I;
        final io.reactivex.internal.util.c J;
        final AtomicReference<f.a.a> K;
        volatile boolean L;
        d M;
        
        static {
            N = new f.a.a(null);
        }
        
        a(final io.reactivex.f g, final o<? super T, ? extends i> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicReference<f.a.a>();
        }
        
        void a() {
            final AtomicReference<f.a.a> k = this.K;
            final f.a.a n = f.a.N;
            final f.a.a a = k.getAndSet(n);
            if (a != null && a != n) {
                a.a();
            }
        }
        
        public void b(Throwable c) {
            if (this.J.a(c)) {
                if (this.I) {
                    this.f();
                }
                else {
                    this.a();
                    c = this.J.c();
                    if (c != k.a) {
                        this.G.b(c);
                    }
                }
            }
            else {
                a.Y(c);
            }
        }
        
        void c(final f.a.a expectedValue) {
            if (this.K.compareAndSet(expectedValue, null) && this.L) {
                final Throwable c = this.J.c();
                if (c == null) {
                    this.G.f();
                }
                else {
                    this.G.b(c);
                }
            }
        }
        
        void d(final f.a.a expectedValue, final Throwable t) {
            if (this.K.compareAndSet(expectedValue, null) && this.J.a(t)) {
                Throwable t2;
                if (this.I) {
                    if (!this.L) {
                        return;
                    }
                    t2 = this.J.c();
                }
                else {
                    this.dispose();
                    t2 = this.J.c();
                    if (t2 == k.a) {
                        return;
                    }
                }
                this.G.b(t2);
                return;
            }
            a.Y(t);
        }
        
        @Override
        public void dispose() {
            this.M.cancel();
            this.a();
        }
        
        public void f() {
            this.L = true;
            if (this.K.get() == null) {
                final Throwable c = this.J.c();
                if (c == null) {
                    this.G.f();
                }
                else {
                    this.G.b(c);
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.K.get() == f.a.N;
        }
        
        public void m(final T t) {
            try {
                final i i = b.g((i)this.H.apply((Object)t), "The mapper returned a null CompletableSource");
                final f.a.a newValue = new f.a.a(this);
                f.a.a expectedValue;
                do {
                    expectedValue = this.K.get();
                    if (expectedValue == f.a.N) {
                        return;
                    }
                } while (!this.K.compareAndSet(expectedValue, newValue));
                if (expectedValue != null) {
                    expectedValue.a();
                }
                i.c(newValue);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.M.cancel();
                this.b(t2);
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.l(this);
                m.v(Long.MAX_VALUE);
            }
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = -8003404460084760287L;
            final io.reactivex.internal.operators.mixed.f.a<?> G;
            
            a(final io.reactivex.internal.operators.mixed.f.a<?> g) {
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
            public void f() {
                this.G.c(this);
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
