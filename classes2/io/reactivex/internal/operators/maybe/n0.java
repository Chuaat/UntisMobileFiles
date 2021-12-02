// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.q0;
import y5.i;
import io.reactivex.s;

public final class n0<T> extends s<T> implements i<T>
{
    final q0<T> G;
    
    public n0(final q0<T> g) {
        this.G = g;
    }
    
    @Override
    public q0<T> source() {
        return this.G;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v));
    }
    
    static final class a<T> implements n0<T>, c
    {
        final v<? super T> G;
        c H;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.H = d.G;
            this.G.d((Object)t);
        }
        
        @Override
        public void dispose() {
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
