// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.f;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import io.reactivex.i;

public final class x<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final i H;
    
    public x(final b0<T> b0, final i h) {
        super(b0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements i0<T>, f, c
    {
        private static final long J = -1953724749712440952L;
        final i0<? super T> G;
        i H;
        boolean I;
        
        a(final i0<? super T> g, final i h) {
            this.G = g;
            this.H = h;
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
            if (this.I) {
                this.G.f();
            }
            else {
                this.I = true;
                d.f(this, null);
                final i h = this.H;
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
            if (d.j(this, c) && !this.I) {
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
    }
}
