// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import x5.a;
import io.reactivex.q0;
import io.reactivex.k0;

public final class p<T> extends k0<T>
{
    final q0<T> G;
    final x5.a H;
    
    public p(final q0<T> g, final x5.a h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> extends AtomicReference<x5.a> implements n0<T>, c
    {
        private static final long I = -8583764624474935784L;
        final n0<? super T> G;
        c H;
        
        a(final n0<? super T> g, final x5.a newValue) {
            this.G = g;
            this.lazySet(newValue);
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
            final x5.a a = this.getAndSet(null);
            if (a != null) {
                try {
                    a.run();
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
                this.H.dispose();
            }
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
