// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.n0;
import x5.g;
import io.reactivex.q0;
import io.reactivex.k0;

public final class t<T> extends k0<T>
{
    final q0<T> G;
    final g<? super T> H;
    
    public t(final q0<T> g, final g<? super T> h) {
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
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                t.this.H.accept((Object)t);
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
