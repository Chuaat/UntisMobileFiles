// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class m1<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    public m1(final g0<T> g0) {
        super(g0);
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        c H;
        
        a(final i0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final c h) {
            this.H = h;
            this.G.l(this);
        }
        
        @Override
        public void m(final T t) {
        }
    }
}
