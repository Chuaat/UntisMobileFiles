// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.a0;

public final class y1<T> extends io.reactivex.internal.operators.observable.a<T, a0<T>>
{
    public y1(final g0<T> g0) {
        super(g0);
    }
    
    public void L5(final i0<? super a0<T>> i0) {
        super.G.c(new a<Object>((i0<? super a0<? super T>>)i0));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super a0<T>> G;
        c H;
        
        a(final i0<? super a0<T>> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.m((Object)a0.b(t));
            this.G.f();
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.m((Object)a0.a());
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final c h) {
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.G.m(a0.c(t));
        }
    }
}
