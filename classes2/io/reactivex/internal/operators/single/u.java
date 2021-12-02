// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.n0;
import x5.a;
import io.reactivex.q0;
import io.reactivex.k0;

public final class u<T> extends k0<T>
{
    final q0<T> G;
    final x5.a H;
    
    public u(final q0<T> g, final x5.a h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a(n0));
    }
    
    final class a implements n0<T>
    {
        final n0<? super T> G;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            io.reactivex.exceptions.a a = null;
            try {
                u.this.H.run();
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b(a);
        }
        
        @Override
        public void d(final T t) {
            try {
                u.this.H.run();
                this.G.d((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void l(final c c) {
            this.G.l(c);
        }
    }
}
