// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.n0;
import io.reactivex.y;
import y5.f;
import io.reactivex.k0;

public final class h<T> extends k0<Boolean> implements f<T>
{
    final y<T> G;
    final Object H;
    
    public h(final y<T> g, final Object h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        this.G.c(new a(n0, this.H));
    }
    
    @Override
    public y<T> source() {
        return this.G;
    }
    
    static final class a implements v<Object>, c
    {
        final n0<? super Boolean> G;
        final Object H;
        c I;
        
        a(final n0<? super Boolean> g, final Object h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.I = d.G;
            this.G.b(t);
        }
        
        @Override
        public void d(final Object o) {
            this.I = d.G;
            this.G.d(b.c(o, this.H));
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            this.I = d.G;
            this.G.d(Boolean.FALSE);
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
