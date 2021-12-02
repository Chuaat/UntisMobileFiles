// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i0;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.b0;
import io.reactivex.c;

public final class o<T> extends c
{
    final b0<T> G;
    final x5.o<? super T, ? extends i> H;
    final boolean I;
    
    public o(final b0<T> g, final x5.o<? super T, ? extends i> h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L0(final f f) {
        if (!r.a(this.G, (x5.o<? super Object, ? extends i>)this.H, f)) {
            this.G.c(new a<Object>(f, this.H, this.I));
        }
    }
    
    static final class a<T> implements i0<T>, io.reactivex.disposables.c
    {
        static final o.a.a N;
        final f G;
        final x5.o<? super T, ? extends i> H;
        final boolean I;
        final io.reactivex.internal.util.c J;
        final AtomicReference<o.a.a> K;
        volatile boolean L;
        io.reactivex.disposables.c M;
        
        static {
            N = new o.a.a(null);
        }
        
        a(final f g, final x5.o<? super T, ? extends i> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicReference<o.a.a>();
        }
        
        void a() {
            final AtomicReference<o.a.a> k = this.K;
            final o.a.a n = o.a.N;
            final o.a.a a = k.getAndSet(n);
            if (a != null && a != n) {
                a.a();
            }
        }
        
        @Override
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
        
        void c(final o.a.a expectedValue) {
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
        
        void d(final o.a.a expectedValue, final Throwable t) {
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
            this.M.dispose();
            this.a();
        }
        
        @Override
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
            return this.K.get() == o.a.N;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c m) {
            if (d.l(this.M, m)) {
                this.M = m;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            try {
                final i i = b.g((i)this.H.apply((Object)t), "The mapper returned a null CompletableSource");
                final o.a.a newValue = new o.a.a(this);
                o.a.a expectedValue;
                do {
                    expectedValue = this.K.get();
                    if (expectedValue == o.a.N) {
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
                this.M.dispose();
                this.b(t2);
            }
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = -8003404460084760287L;
            final o.a<?> G;
            
            a(final o.a<?> g) {
                this.G = g;
            }
            
            void a() {
                d.b(this);
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
                d.j(this, c);
            }
        }
    }
}
