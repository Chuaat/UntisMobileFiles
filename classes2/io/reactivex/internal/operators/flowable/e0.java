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
import io.reactivex.l;
import y5.b;
import io.reactivex.k0;

public final class e0<T> extends k0<Long> implements b<Long>
{
    final l<T> G;
    
    public e0(final l<T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super Long> n0) {
        this.G.m6(new a(n0));
    }
    
    @Override
    public l<Long> g() {
        return io.reactivex.plugins.a.P(new d0((l<Object>)this.G));
    }
    
    static final class a implements q<Object>, c
    {
        final n0<? super Long> G;
        d H;
        long I;
        
        a(final n0<? super Long> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.H = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.cancel();
            this.H = (d)j.G;
        }
        
        public void f() {
            this.H = (d)j.G;
            this.G.d(this.I);
        }
        
        @Override
        public boolean i() {
            return this.H == j.G;
        }
        
        public void m(final Object o) {
            ++this.I;
        }
        
        @Override
        public void z(final d h) {
            if (j.o(this.H, h)) {
                this.H = h;
                this.G.l(this);
                h.v(Long.MAX_VALUE);
            }
        }
    }
}
