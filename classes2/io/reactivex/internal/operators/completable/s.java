// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.i0;
import io.reactivex.f;
import io.reactivex.g0;
import io.reactivex.c;

public final class s<T> extends c
{
    final g0<T> G;
    
    public s(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a<Object>(f));
    }
    
    static final class a<T> implements i0<T>
    {
        final f G;
        
        a(final f g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.l(c);
        }
        
        @Override
        public void m(final T t) {
        }
    }
}
