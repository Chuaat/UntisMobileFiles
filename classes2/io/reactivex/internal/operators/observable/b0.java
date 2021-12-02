// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.plugins.a;
import io.reactivex.g0;
import y5.d;
import io.reactivex.k0;

public final class b0<T> extends k0<Long> implements d<Long>
{
    final g0<T> G;
    
    public b0(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    public io.reactivex.b0<Long> a() {
        return io.reactivex.plugins.a.R(new a0((g0<Object>)this.G));
    }
    
    public void e1(final n0<? super Long> n0) {
        this.G.c(new a(n0));
    }
    
    static final class a implements i0<Object>, c
    {
        final n0<? super Long> G;
        c H;
        long I;
        
        a(final n0<? super Long> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = io.reactivex.internal.disposables.d.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = io.reactivex.internal.disposables.d.G;
        }
        
        @Override
        public void f() {
            this.H = io.reactivex.internal.disposables.d.G;
            this.G.d(this.I);
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final c h) {
            if (io.reactivex.internal.disposables.d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final Object o) {
            ++this.I;
        }
    }
}
