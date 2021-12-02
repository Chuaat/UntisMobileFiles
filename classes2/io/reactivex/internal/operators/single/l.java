// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class l<T> extends k0<T>
{
    final q0<T> G;
    
    public l(final q0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0));
    }
    
    static final class a<T> implements n0<T>, c
    {
        n0<? super T> G;
        c H;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            final n0<? super T> g = this.G;
            if (g != null) {
                this.G = null;
                g.b(t);
            }
        }
        
        @Override
        public void d(final T t) {
            this.H = d.G;
            final n0<? super T> g = this.G;
            if (g != null) {
                this.G = null;
                g.d(t);
            }
        }
        
        @Override
        public void dispose() {
            this.G = null;
            this.H.dispose();
            this.H = d.G;
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
    }
}
