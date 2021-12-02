// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.f;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import io.reactivex.i;

public final class z1<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final i H;
    
    public z1(final b0<T> b0, final i h) {
        super(b0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<Object> a = new a<Object>((i0<? super Object>)i0);
        i0.l(a);
        super.G.c(a);
        this.H.c(a.I);
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, c
    {
        private static final long M = -4592979584110982903L;
        final i0<? super T> G;
        final AtomicReference<c> H;
        final z1.a.a I;
        final io.reactivex.internal.util.c J;
        volatile boolean K;
        volatile boolean L;
        
        a(final i0<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<c>();
            this.I = new z1.a.a(this);
            this.J = new io.reactivex.internal.util.c();
        }
        
        void a() {
            this.L = true;
            if (this.K) {
                l.a(this.G, this, this.J);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            d.b(this.H);
            l.c(this.G, t, this, this.J);
        }
        
        void c(final Throwable t) {
            d.b(this.H);
            l.c(this.G, t, this, this.J);
        }
        
        @Override
        public void dispose() {
            d.b(this.H);
            d.b(this.I);
        }
        
        @Override
        public void f() {
            this.K = true;
            if (this.L) {
                l.a(this.G, this, this.J);
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.H.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this.H, c);
        }
        
        @Override
        public void m(final T t) {
            l.e(this.G, t, this, this.J);
        }
        
        static final class a extends AtomicReference<c> implements f
        {
            private static final long H = -2935427570954647017L;
            final z1.a<?> G;
            
            a(final z1.a<?> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.c(t);
            }
            
            @Override
            public void f() {
                this.G.a();
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
