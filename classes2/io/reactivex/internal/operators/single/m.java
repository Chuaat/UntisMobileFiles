// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import x5.g;
import io.reactivex.q0;
import io.reactivex.k0;

public final class m<T> extends k0<T>
{
    final q0<T> G;
    final g<? super T> H;
    
    public m(final q0<T> g, final g<? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> implements n0<T>, c
    {
        final n0<? super T> G;
        final g<? super T> H;
        c I;
        
        a(final n0<? super T> g, final g<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
            try {
                this.H.accept((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                io.reactivex.plugins.a.Y(t2);
            }
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
    }
}
