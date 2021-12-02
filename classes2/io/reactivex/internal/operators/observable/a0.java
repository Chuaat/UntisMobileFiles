// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class a0<T> extends io.reactivex.internal.operators.observable.a<T, Long>
{
    public a0(final g0<T> g0) {
        super(g0);
    }
    
    public void L5(final i0<? super Long> i0) {
        super.G.c(new a(i0));
    }
    
    static final class a implements i0<Object>, c
    {
        final i0<? super Long> G;
        c H;
        long I;
        
        a(final i0<? super Long> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.m(this.I);
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
        public void m(final Object o) {
            ++this.I;
        }
    }
}
