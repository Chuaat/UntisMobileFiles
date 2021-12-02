// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.g0;
import io.reactivex.s;

public final class t1<T> extends s<T>
{
    final g0<T> G;
    
    public t1(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final v<? super T> G;
        c H;
        T I;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            this.I = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = d.G;
        }
        
        @Override
        public void f() {
            this.H = d.G;
            final T i = this.I;
            if (i != null) {
                this.I = null;
                this.G.d((Object)i);
            }
            else {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.H == d.G;
        }
        
        @Override
        public void l(final c h) {
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T i) {
            this.I = i;
        }
    }
}
