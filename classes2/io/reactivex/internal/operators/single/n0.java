// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.j0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class n0<T> extends k0<T>
{
    final q0<T> G;
    final j0 H;
    
    public n0(final q0<T> g, final j0 h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final io.reactivex.n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements n0<T>, c, Runnable
    {
        private static final long K = 3528003840217436037L;
        final n0<? super T> G;
        final j0 H;
        T I;
        Throwable J;
        
        a(final n0<? super T> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable j) {
            this.J = j;
            d.f(this, this.H.e(this));
        }
        
        @Override
        public void d(final T i) {
            this.I = i;
            d.f(this, this.H.e(this));
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
        
        @Override
        public void run() {
            final Throwable j = this.J;
            if (j != null) {
                this.G.b(j);
            }
            else {
                this.G.d((Object)this.I);
            }
        }
    }
}
