// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import x5.a;
import io.reactivex.q0;
import io.reactivex.k0;

public final class n<T> extends k0<T>
{
    final q0<T> G;
    final x5.a H;
    
    public n(final q0<T> g, final x5.a h) {
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
        final x5.a H;
        c I;
        
        a(final n0<? super T> g, final x5.a h) {
            this.G = g;
            this.H = h;
        }
        
        private void a() {
            try {
                this.H.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
            this.a();
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
            this.a();
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
