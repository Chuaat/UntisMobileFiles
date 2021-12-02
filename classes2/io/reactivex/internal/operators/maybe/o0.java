// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;

public final class o0<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    public o0(final y<T> y) {
        super(y);
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super T> G;
        c H;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = d.G;
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
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
    }
}
