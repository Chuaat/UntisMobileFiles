// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import io.reactivex.b0;
import io.reactivex.i0;
import io.reactivex.f;
import io.reactivex.g0;
import y5.d;
import io.reactivex.c;

public final class n1<T> extends c implements d<T>
{
    final g0<T> G;
    
    public n1(final g0<T> g) {
        this.G = g;
    }
    
    public void L0(final f f) {
        this.G.c(new a<Object>(f));
    }
    
    @Override
    public b0<T> a() {
        return io.reactivex.plugins.a.R(new m1((g0<Object>)this.G));
    }
    
    static final class a<T> implements i0<T>, io.reactivex.disposables.c
    {
        final f G;
        io.reactivex.disposables.c H;
        
        a(final f g) {
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
        public void l(final io.reactivex.disposables.c h) {
            this.H = h;
            this.G.l(this);
        }
        
        @Override
        public void m(final T t) {
        }
    }
}
