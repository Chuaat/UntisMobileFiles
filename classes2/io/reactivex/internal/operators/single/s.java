// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.b;
import io.reactivex.plugins.a;
import io.reactivex.n0;
import io.reactivex.disposables.c;
import x5.g;
import io.reactivex.q0;
import io.reactivex.k0;

public final class s<T> extends k0<T>
{
    final q0<T> G;
    final g<? super c> H;
    
    public s(final q0<T> g, final g<? super c> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> implements n0<T>
    {
        final n0<? super T> G;
        final g<? super c> H;
        boolean I;
        
        a(final n0<? super T> g, final g<? super c> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            if (this.I) {
                return;
            }
            this.G.d((Object)t);
        }
        
        @Override
        public void l(final c c) {
            try {
                this.H.accept(c);
                this.G.l(c);
            }
            finally {
                final Throwable t;
                b.b(t);
                this.I = true;
                c.dispose();
                e.m(t, this.G);
            }
        }
    }
}
