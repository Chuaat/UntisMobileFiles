// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class g0<T> extends k0<T>
{
    final q0<? extends T> G;
    
    public g0(final q0<? extends T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0));
    }
    
    static final class a<T> implements n0<T>, c
    {
        final n0<? super T> G;
        c H;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
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
