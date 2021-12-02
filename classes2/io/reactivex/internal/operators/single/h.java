// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.observers.z;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.g0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class h<T, U> extends k0<T>
{
    final q0<T> G;
    final g0<U> H;
    
    public h(final q0<T> g, final g0<U> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.H.c(new a<Object, Object>(n0, this.G));
    }
    
    static final class a<T, U> extends AtomicReference<c> implements i0<U>, c
    {
        private static final long J = -8565274649390031272L;
        final n0<? super T> G;
        final q0<T> H;
        boolean I;
        
        a(final n0<? super T> g, final q0<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.c(new z<Object>(this, this.G));
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.h(this, c)) {
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final U u) {
            this.get().dispose();
            this.f();
        }
    }
}
