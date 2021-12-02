// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.h;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class l3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final g0<? extends T> H;
    
    public l3(final g0<T> g0, final g0<? extends T> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final a<Object> a = new a<Object>((i0<? super Object>)i0, this.H);
        i0.l(a.I);
        super.G.c(a);
    }
    
    static final class a<T> implements i0<T>
    {
        final i0<? super T> G;
        final g0<? extends T> H;
        final h I;
        boolean J;
        
        a(final i0<? super T> g, final g0<? extends T> h) {
            this.G = g;
            this.H = h;
            this.J = true;
            this.I = new h();
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            if (this.J) {
                this.J = false;
                this.H.c(this);
            }
            else {
                this.G.f();
            }
        }
        
        @Override
        public void l(final c c) {
            this.I.b(c);
        }
        
        @Override
        public void m(final T t) {
            if (this.J) {
                this.J = false;
            }
            this.G.m((Object)t);
        }
    }
}
