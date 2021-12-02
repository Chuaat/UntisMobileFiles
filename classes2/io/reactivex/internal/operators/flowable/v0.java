// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.q;
import io.reactivex.n0;
import io.reactivex.l;
import y5.b;
import io.reactivex.k0;

public final class v0<T> extends k0<T> implements b<T>
{
    final l<T> G;
    final long H;
    final T I;
    
    public v0(final l<T> g, final long h, final T i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.m6(new a<Object>(n0, this.H, (Object)this.I));
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new t0((l<Object>)this.G, this.H, this.I, true));
    }
    
    static final class a<T> implements q<T>, c
    {
        final n0<? super T> G;
        final long H;
        final T I;
        d J;
        long K;
        boolean L;
        
        a(final n0<? super T> g, final long h, final T i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void b(final Throwable t) {
            if (this.L) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.L = true;
            this.J = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J.cancel();
            this.J = (d)j.G;
        }
        
        public void f() {
            this.J = (d)j.G;
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
            return this.J == j.G;
        }
        
        public void m(final T t) {
            if (this.L) {
                return;
            }
            final long k = this.K;
            if (k == this.H) {
                this.L = true;
                this.J.cancel();
                this.J = (d)j.G;
                this.G.d((Object)t);
                return;
            }
            this.K = k + 1L;
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.l(this);
                j.v(Long.MAX_VALUE);
            }
        }
    }
}
