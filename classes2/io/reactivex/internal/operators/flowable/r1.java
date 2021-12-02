// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.plugins.a;
import io.reactivex.q;
import io.reactivex.f;
import io.reactivex.l;
import y5.b;
import io.reactivex.c;

public final class r1<T> extends c implements b<T>
{
    final l<T> G;
    
    public r1(final l<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.m6(new a<Object>(f));
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new q1((l<Object>)this.G));
    }
    
    static final class a<T> implements q<T>, io.reactivex.disposables.c
    {
        final f G;
        d H;
        
        a(final f g) {
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
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H == j.G;
        }
        
        public void m(final T t) {
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
