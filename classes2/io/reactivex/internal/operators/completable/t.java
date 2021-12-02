// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import io.reactivex.f;
import o7.b;
import io.reactivex.c;

public final class t<T> extends c
{
    final b<T> G;
    
    public t(final b<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.e((o7.c)new a(f));
    }
    
    static final class a<T> implements q<T>, io.reactivex.disposables.c
    {
        final f G;
        d H;
        
        a(final f g) {
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
