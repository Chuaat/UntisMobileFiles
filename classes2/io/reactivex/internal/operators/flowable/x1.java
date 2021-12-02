// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.v;
import o7.b;
import io.reactivex.s;

public final class x1<T> extends s<T>
{
    final b<T> G;
    
    public x1(final b<T> g) {
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.e((c)new a((v<? super Object>)v));
    }
    
    static final class a<T> implements q<T>, c
    {
        final v<? super T> G;
        d H;
        T I;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.H = (d)j.G;
            this.I = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.cancel();
            this.H = (d)j.G;
        }
        
        public void f() {
            this.H = (d)j.G;
            final T i = this.I;
            if (i != null) {
                this.I = null;
                this.G.d((Object)i);
            }
            else {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.H == j.G;
        }
        
        public void m(final T i) {
            this.I = i;
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
