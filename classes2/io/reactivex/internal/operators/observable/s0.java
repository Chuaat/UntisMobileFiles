// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.plugins.a;
import io.reactivex.b0;
import io.reactivex.g0;
import y5.d;
import io.reactivex.k0;

public final class s0<T> extends k0<T> implements d<T>
{
    final g0<T> G;
    final long H;
    final T I;
    
    public s0(final g0<T> g, final long h, final T i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public b0<T> a() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.q0((g0<Object>)this.G, this.H, this.I, true));
    }
    
    public void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H, (Object)this.I));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final n0<? super T> G;
        final long H;
        final T I;
        c J;
        long K;
        boolean L;
        
        a(final n0<? super T> g, final long h, final T i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.L) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.L = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (!this.L) {
                this.L = true;
                final T i = this.I;
                if (i != null) {
                    this.G.d((Object)i);
                }
                else {
                    this.G.b(new NoSuchElementException());
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c j) {
            if (io.reactivex.internal.disposables.d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.L) {
                return;
            }
            final long k = this.K;
            if (k == this.H) {
                this.L = true;
                this.J.dispose();
                this.G.d((Object)t);
                return;
            }
            this.K = k + 1L;
        }
    }
}
