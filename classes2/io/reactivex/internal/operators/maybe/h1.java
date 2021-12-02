// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;

public final class h1<T, U> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final y<U> H;
    
    public h1(final y<T> y, final y<U> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final a<Object, Object> a = new a<Object, Object>((v<? super Object>)v);
        v.l(a);
        this.H.c(a.H);
        super.G.c(a);
    }
    
    static final class a<T, U> extends AtomicReference<c> implements v<T>, c
    {
        private static final long I = -2187421758664251153L;
        final v<? super T> G;
        final h1.a.a<U> H;
        
        a(final v<? super T> g) {
            this.G = g;
            this.H = new h1.a.a<U>(this);
        }
        
        void a() {
            if (d.b(this)) {
                this.G.f();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            d.b(this.H);
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c(final Throwable t) {
            if (d.b(this)) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void d(final T t) {
            d.b(this.H);
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.d((Object)t);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
            d.b(this.H);
        }
        
        @Override
        public void f() {
            d.b(this.H);
            final d g = d.G;
            if (this.getAndSet(g) != g) {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        static final class a<U> extends AtomicReference<c> implements v<U>
        {
            private static final long H = -1266041316834525931L;
            final h1.a<?, U> G;
            
            a(final h1.a<?, U> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.c(t);
            }
            
            @Override
            public void d(final Object o) {
                this.G.a();
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
