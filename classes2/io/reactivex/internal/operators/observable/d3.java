// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.g0;
import io.reactivex.s;

public final class d3<T> extends s<T>
{
    final g0<T> G;
    
    public d3(final g0<T> g) {
        this.G = g;
    }
    
    public void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final v<? super T> G;
        c H;
        T I;
        boolean J;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            final T i = this.I;
            this.I = null;
            if (i == null) {
                this.G.f();
            }
            else {
                this.G.d((Object)i);
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
        
        @Override
        public void m(final T i) {
            if (this.J) {
                return;
            }
            if (this.I != null) {
                this.J = true;
                this.H.dispose();
                this.G.b(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.I = i;
        }
    }
}
