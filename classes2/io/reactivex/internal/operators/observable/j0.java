// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.h;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class j0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    public j0(final g0<T> g0) {
        super(g0);
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0));
    }
    
    static final class a<T> implements i0<T>, c
    {
        i0<? super T> G;
        c H;
        
        a(final i0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            final i0<? super T> g = this.G;
            this.H = h.G;
            this.G = h.g();
            g.b(t);
        }
        
        @Override
        public void dispose() {
            final c h = this.H;
            this.H = io.reactivex.internal.util.h.G;
            this.G = io.reactivex.internal.util.h.g();
            h.dispose();
        }
        
        @Override
        public void f() {
            final i0<? super T> g = this.G;
            this.H = h.G;
            this.G = h.g();
            g.f();
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
            this.G.m((Object)t);
        }
    }
}
