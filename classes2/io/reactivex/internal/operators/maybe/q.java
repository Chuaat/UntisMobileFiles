// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import x5.g;

public final class q<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final g<? super T> H;
    
    public q(final y<T> y, final g<? super T> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, (g<? super T>)this.H));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super T> G;
        final g<? super T> H;
        c I;
        
        a(final v<? super T> g, final g<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
            try {
                this.H.accept((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                io.reactivex.plugins.a.Y(t2);
            }
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
    }
}
