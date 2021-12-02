// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.plugins.a;
import io.reactivex.b0;
import io.reactivex.g0;
import y5.d;
import io.reactivex.s;

public final class r0<T> extends s<T> implements d<T>
{
    final g0<T> G;
    final long H;
    
    public r0(final g0<T> g, final long h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public b0<T> a() {
        return io.reactivex.plugins.a.R(new q0((g0<Object>)this.G, this.H, null, false));
    }
    
    public void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v, this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final v<? super T> G;
        final long H;
        c I;
        long J;
        boolean K;
        
        a(final v<? super T> g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (!this.K) {
                this.K = true;
                this.G.f();
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
            if (this.K) {
                return;
            }
            final long j = this.J;
            if (j == this.H) {
                this.K = true;
                this.I.dispose();
                this.G.d((Object)t);
                return;
            }
            this.J = j + 1L;
        }
    }
}
