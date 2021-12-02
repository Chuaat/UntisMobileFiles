// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import io.reactivex.j0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class w0<T> extends k0<T>
{
    final q0<T> G;
    final j0 H;
    
    public w0(final q0<T> g, final j0 h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements n0<T>, c, Runnable
    {
        private static final long J = 3256698449646456986L;
        final n0<? super T> G;
        final j0 H;
        c I;
        
        a(final n0<? super T> g, final j0 h) {
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
        }
        
        @Override
        public void dispose() {
            final d g = d.G;
            final d i = this.getAndSet(g);
            if (i != g) {
                this.I = i;
                this.H.e(this);
            }
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
            this.I.dispose();
        }
    }
}
