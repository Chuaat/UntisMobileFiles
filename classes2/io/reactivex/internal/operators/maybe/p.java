// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;

public final class p<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    public p(final y<T> y) {
        super(y);
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v));
    }
    
    static final class a<T> implements v<T>, c
    {
        v<? super T> G;
        c H;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            final v<? super T> g = this.G;
            if (g != null) {
                this.G = null;
                g.b(t);
            }
        }
        
        @Override
        public void d(final T t) {
            this.H = d.G;
            final v<? super T> g = this.G;
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
        public void f() {
            this.H = d.G;
            final v<? super T> g = this.G;
            if (g != null) {
                this.G = null;
                g.f();
            }
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
