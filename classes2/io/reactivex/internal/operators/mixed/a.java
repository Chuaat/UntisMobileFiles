// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.i;
import io.reactivex.b0;

public final class a<R> extends b0<R>
{
    final i G;
    final g0<? extends R> H;
    
    public a(final i g, final g0<? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        final a a = new a((i0<? super Object>)i0, this.H);
        i0.l(a);
        this.G.c(a);
    }
    
    static final class a<R> extends AtomicReference<c> implements i0<R>, f, c
    {
        private static final long I = -8948264376121066672L;
        final i0<? super R> G;
        g0<? extends R> H;
        
        a(final i0<? super R> g, final g0<? extends R> h) {
            this.H = h;
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            final g0<? extends R> h = this.H;
            if (h == null) {
                this.G.f();
            }
            else {
                this.H = null;
                h.c(this);
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.f(this, c);
        }
        
        @Override
        public void m(final R r) {
            this.G.m((Object)r);
        }
    }
}
