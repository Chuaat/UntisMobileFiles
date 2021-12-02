// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.n0;
import io.reactivex.y;
import y5.f;
import io.reactivex.k0;

public final class i<T> extends k0<Long> implements f<T>
{
    final y<T> G;
    
    public i(final y<T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super Long> n0) {
        this.G.c(new a(n0));
    }
    
    @Override
    public y<T> source() {
        return this.G;
    }
    
    static final class a implements v<Object>, c
    {
        final n0<? super Long> G;
        c H;
        
        a(final n0<? super Long> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            this.G.b(t);
        }
        
        @Override
        public void d(final Object o) {
            this.H = d.G;
            this.G.d(1L);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = d.G;
        }
        
        @Override
        public void f() {
            this.H = d.G;
            this.G.d(0L);
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
