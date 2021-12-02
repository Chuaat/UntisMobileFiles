// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.z;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class j<T, U> extends k0<T>
{
    final q0<T> G;
    final q0<U> H;
    
    public j(final q0<T> g, final q0<U> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.H.c(new a<Object, Object>(n0, this.G));
    }
    
    static final class a<T, U> extends AtomicReference<c> implements n0<U>, c
    {
        private static final long I = -8565274649390031272L;
        final n0<? super T> G;
        final q0<T> H;
        
        a(final n0<? super T> g, final q0<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final U u) {
            this.H.c(new z<Object>(this, this.G));
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
    }
}
