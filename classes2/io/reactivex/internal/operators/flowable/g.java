// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.q;
import io.reactivex.n0;
import x5.r;
import io.reactivex.l;
import y5.b;
import io.reactivex.k0;

public final class g<T> extends k0<Boolean> implements b<Boolean>
{
    final l<T> G;
    final r<? super T> H;
    
    public g(final l<T> g, final r<? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        this.G.m6(new a<Object>(n0, this.H));
    }
    
    @Override
    public l<Boolean> g() {
        return io.reactivex.plugins.a.P(new f((l<Object>)this.G, (r<? super Object>)this.H));
    }
    
    static final class a<T> implements q<T>, c
    {
        final n0<? super Boolean> G;
        final r<? super T> H;
        d I;
        boolean J;
        
        a(final n0<? super Boolean> g, final r<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.I = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.cancel();
            this.I = (d)j.G;
        }
        
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            this.I = (d)j.G;
            this.G.d(Boolean.TRUE);
        }
        
        @Override
        public boolean i() {
            return this.I == j.G;
        }
        
        public void m(final T t) {
            if (this.J) {
                return;
            }
            try {
                if (!this.H.a((Object)t)) {
                    this.J = true;
                    this.I.cancel();
                    this.I = (d)j.G;
                    this.G.d(Boolean.FALSE);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.I.cancel();
                this.I = (d)j.G;
                this.b(t2);
            }
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
