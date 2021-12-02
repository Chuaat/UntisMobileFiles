// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.annotations.g;
import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.c;
import io.reactivex.internal.observers.b;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.i;
import x5.o;

public final class x0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final o<? super T, ? extends i> H;
    final boolean I;
    
    public x0(final g0<T> g0, final o<? super T, ? extends i> h, final boolean i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, (o<? super T, ? extends i>)this.H, this.I));
    }
    
    static final class a<T> extends b<T> implements i0<T>
    {
        private static final long O = 8443155186132538303L;
        final i0<? super T> H;
        final io.reactivex.internal.util.c I;
        final x5.o<? super T, ? extends i> J;
        final boolean K;
        final io.reactivex.disposables.b L;
        c M;
        volatile boolean N;
        
        a(final i0<? super T> h, final x5.o<? super T, ? extends i> j, final boolean k) {
            this.H = h;
            this.J = j;
            this.K = k;
            this.I = new io.reactivex.internal.util.c();
            this.L = new io.reactivex.disposables.b();
            this.lazySet(1);
        }
        
        @Override
        public int E(final int n) {
            return n & 0x2;
        }
        
        void a(final x0.a.a a) {
            this.L.c(a);
            this.f();
        }
        
        @Override
        public void b(Throwable c) {
            if (this.I.a(c)) {
                if (this.K) {
                    if (this.decrementAndGet() != 0) {
                        return;
                    }
                }
                else {
                    this.dispose();
                    if (this.getAndSet(0) <= 0) {
                        return;
                    }
                }
                c = this.I.c();
                this.H.b(c);
            }
            else {
                io.reactivex.plugins.a.Y(c);
            }
        }
        
        void c(final x0.a.a a, final Throwable t) {
            this.L.c(a);
            this.b(t);
        }
        
        @Override
        public void clear() {
        }
        
        @Override
        public void dispose() {
            this.N = true;
            this.M.dispose();
            this.L.dispose();
        }
        
        @Override
        public void f() {
            if (this.decrementAndGet() == 0) {
                final Throwable c = this.I.c();
                if (c != null) {
                    this.H.b(c);
                }
                else {
                    this.H.f();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.M.i();
        }
        
        @Override
        public boolean isEmpty() {
            return true;
        }
        
        @Override
        public void l(final c m) {
            if (d.l(this.M, m)) {
                this.M = m;
                this.H.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            try {
                final i i = io.reactivex.internal.functions.b.g((i)this.J.apply((Object)t), "The mapper returned a null CompletableSource");
                this.getAndIncrement();
                final x0.a.a a = new x0.a.a();
                if (!this.N && this.L.b(a)) {
                    i.c(a);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.M.dispose();
                this.b(t2);
            }
        }
        
        @io.reactivex.annotations.g
        @Override
        public T poll() throws Exception {
            return null;
        }
        
        final class a extends AtomicReference<c> implements f, c
        {
            private static final long H = 8606673141535671828L;
            
            @Override
            public void b(final Throwable t) {
                x0.a.this.c(this, t);
            }
            
            @Override
            public void dispose() {
                d.b(this);
            }
            
            @Override
            public void f() {
                x0.a.this.a(this);
            }
            
            @Override
            public boolean i() {
                return d.d(this.get());
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
