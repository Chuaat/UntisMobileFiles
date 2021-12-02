// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.observers.z;
import io.reactivex.plugins.a;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import o7.c;
import io.reactivex.n0;
import o7.b;
import io.reactivex.q0;
import io.reactivex.k0;

public final class i<T, U> extends k0<T>
{
    final q0<T> G;
    final b<U> H;
    
    public i(final q0<T> g, final b<U> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.H.e((c)new a((n0<? super Object>)n0, (q0<Object>)this.G));
    }
    
    static final class a<T, U> extends AtomicReference<c> implements q<U>, c
    {
        private static final long K = -8565274649390031272L;
        final n0<? super T> G;
        final q0<T> H;
        boolean I;
        d J;
        
        a(final n0<? super T> g, final q0<T> h) {
            this.G = g;
            this.H = h;
        }
        
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
            this.J.cancel();
            io.reactivex.internal.disposables.d.b(this);
        }
        
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.c(new z<Object>(this, this.G));
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        public void m(final U u) {
            this.J.cancel();
            this.f();
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.l(this);
                j.v(Long.MAX_VALUE);
            }
        }
    }
}
