// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.i0;
import o7.b;
import io.reactivex.b0;

public final class g1<T> extends b0<T>
{
    final b<? extends T> G;
    
    public g1(final b<? extends T> g) {
        this.G = g;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.G.e((c)new a((i0<? super Object>)i0));
    }
    
    static final class a<T> implements q<T>, c
    {
        final i0<? super T> G;
        d H;
        
        a(final i0<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.cancel();
            this.H = (d)j.G;
        }
        
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H == j.G;
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
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
