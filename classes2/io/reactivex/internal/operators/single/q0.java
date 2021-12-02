// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.j0;
import io.reactivex.k0;

public final class q0<T> extends k0<T>
{
    final io.reactivex.q0<? extends T> G;
    final j0 H;
    
    public q0(final io.reactivex.q0<? extends T> g, final j0 h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final a a = new a((n0<? super Object>)n0, this.G);
        n0.l(a);
        a.H.a(this.H.e(a));
    }
    
    static final class a<T> extends AtomicReference<c> implements n0<T>, c, Runnable
    {
        private static final long J = 7000911171163930287L;
        final n0<? super T> G;
        final h H;
        final io.reactivex.q0<? extends T> I;
        
        a(final n0<? super T> g, final io.reactivex.q0<? extends T> i) {
            this.G = g;
            this.I = i;
            this.H = new h();
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
            d.b(this);
            this.H.dispose();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void run() {
            this.I.c(this);
        }
    }
}
