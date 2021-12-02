// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.schedulers.s;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.b0;

public final class p1 extends b0<Long>
{
    final j0 G;
    final long H;
    final long I;
    final TimeUnit J;
    
    public p1(final long h, final long i, final TimeUnit j, final j0 g) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.G = g;
    }
    
    public void L5(final i0<? super Long> i0) {
        final a a = new a(i0);
        i0.l(a);
        final j0 g = this.G;
        if (g instanceof s) {
            final j0.c c = g.c();
            a.a(c);
            c.d(a, this.H, this.I, this.J);
        }
        else {
            a.a(g.g(a, this.H, this.I, this.J));
        }
    }
    
    static final class a extends AtomicReference<c> implements c, Runnable
    {
        private static final long I = 346773832286157679L;
        final i0<? super Long> G;
        long H;
        
        a(final i0<? super Long> g) {
            this.G = g;
        }
        
        public void a(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean i() {
            return this.get() == d.G;
        }
        
        @Override
        public void run() {
            if (this.get() != d.G) {
                final i0<? super Long> g = this.G;
                final long h = this.H;
                this.H = 1L + h;
                g.m(h);
            }
        }
    }
}
