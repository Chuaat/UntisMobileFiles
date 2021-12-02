// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.disposables.c;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.plugins.a;
import io.reactivex.l;
import y5.b;
import io.reactivex.s;

public final class u0<T> extends s<T> implements b<T>
{
    final l<T> G;
    final long H;
    
    public u0(final l<T> g, final long h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new t0((l<Object>)this.G, this.H, null, false));
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.m6(new a<Object>(v, this.H));
    }
    
    static final class a<T> implements q<T>, c
    {
        final v<? super T> G;
        final long H;
        d I;
        long J;
        boolean K;
        
        a(final v<? super T> g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.I = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.cancel();
            this.I = (d)j.G;
        }
        
        public void f() {
            this.I = (d)j.G;
            if (!this.K) {
                this.K = true;
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.I == j.G;
        }
        
        public void m(final T t) {
            if (this.K) {
                return;
            }
            final long j = this.J;
            if (j == this.H) {
                this.K = true;
                this.I.cancel();
                this.I = (d)io.reactivex.internal.subscriptions.j.G;
                this.G.d((Object)t);
                return;
            }
            this.J = j + 1L;
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.l(this);
                i.v(Long.MAX_VALUE);
            }
        }
    }
}
