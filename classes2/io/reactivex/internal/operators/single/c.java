// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.b;
import io.reactivex.n0;
import x5.d;
import io.reactivex.q0;
import io.reactivex.k0;

public final class c<T> extends k0<Boolean>
{
    final q0<T> G;
    final Object H;
    final d<Object, Object> I;
    
    public c(final q0<T> g, final Object h, final d<Object, Object> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        this.G.c(new a(n0));
    }
    
    final class a implements n0<T>
    {
        private final n0<? super Boolean> G;
        
        a(final n0<? super Boolean> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                final c h = c.this;
                this.G.d(h.I.a(t, h.H));
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.l(c);
        }
    }
}
