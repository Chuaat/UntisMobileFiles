// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.plugins.a;
import io.reactivex.b0;
import x5.r;
import io.reactivex.g0;
import y5.d;
import io.reactivex.k0;

public final class j<T> extends k0<Boolean> implements d<Boolean>
{
    final g0<T> G;
    final r<? super T> H;
    
    public j(final g0<T> g, final r<? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public b0<Boolean> a() {
        return io.reactivex.plugins.a.R(new i((g0<Object>)this.G, (r<? super Object>)this.H));
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final n0<? super Boolean> G;
        final r<? super T> H;
        c I;
        boolean J;
        
        a(final n0<? super Boolean> g, final r<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (!this.J) {
                this.J = true;
                this.G.d(Boolean.FALSE);
            }
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (io.reactivex.internal.disposables.d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.J) {
                return;
            }
            try {
                if (this.H.a((Object)t)) {
                    this.J = true;
                    this.I.dispose();
                    this.G.d(Boolean.TRUE);
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.I.dispose();
                this.b(t2);
            }
        }
    }
}
