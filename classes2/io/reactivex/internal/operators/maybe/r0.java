// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;

public final class r0<T> extends io.reactivex.internal.operators.maybe.a<T, Boolean>
{
    public r0(final y<T> y) {
        super(y);
    }
    
    @Override
    protected void u1(final v<? super Boolean> v) {
        super.G.c(new a<Object>(v));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super Boolean> G;
        c H;
        
        a(final v<? super Boolean> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d(Boolean.FALSE);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.d(Boolean.TRUE);
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
