// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.n0;
import io.reactivex.f;
import io.reactivex.q0;
import io.reactivex.c;

public final class v<T> extends c
{
    final q0<T> G;
    
    public v(final q0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a<Object>(f));
    }
    
    static final class a<T> implements n0<T>
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
        public void d(final T t) {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.l(c);
        }
    }
}
