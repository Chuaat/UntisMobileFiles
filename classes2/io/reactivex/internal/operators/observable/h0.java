// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;

public final class h0<T, U> extends b0<T>
{
    final g0<? extends T> G;
    final g0<U> H;
    
    public h0(final g0<? extends T> g, final g0<U> h) {
        this.G = g;
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final h h = new h();
        i0.l(h);
        this.H.c(new a(h, i0));
    }
    
    final class a implements i0<U>
    {
        final h G;
        final i0<? super T> H;
        boolean I;
        
        a(final h g, final i0<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                a.Y(t);
                return;
            }
            this.I = true;
            this.H.b(t);
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            h0.this.G.c(new h0.a.a());
        }
        
        @Override
        public void l(final c c) {
            this.G.b(c);
        }
        
        @Override
        public void m(final U u) {
            this.f();
        }
        
        final class a implements i0<T>
        {
            @Override
            public void b(final Throwable t) {
                h0.a.this.H.b(t);
            }
            
            @Override
            public void f() {
                h0.a.this.H.f();
            }
            
            @Override
            public void l(final c c) {
                h0.a.this.G.b(c);
            }
            
            @Override
            public void m(final T t) {
                h0.a.this.H.m((Object)t);
            }
        }
    }
}
