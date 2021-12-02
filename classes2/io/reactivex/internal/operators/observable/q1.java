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

public final class q1 extends b0<Long>
{
    final j0 G;
    final long H;
    final long I;
    final long J;
    final long K;
    final TimeUnit L;
    
    public q1(final long h, final long i, final long j, final long k, final TimeUnit l, final j0 g) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super Long> i0) {
        final a a = new a(i0, this.H, this.I);
        i0.l(a);
        final j0 g = this.G;
        if (g instanceof s) {
            final j0.c c = g.c();
            a.a(c);
            c.d(a, this.J, this.K, this.L);
        }
        else {
            a.a(g.g(a, this.J, this.K, this.L));
        }
    }
    
    static final class a extends AtomicReference<c> implements c, Runnable
    {
        private static final long J = 1891866368734007884L;
        final i0<? super Long> G;
        final long H;
        long I;
        
        a(final i0<? super Long> g, final long i, final long h) {
            this.G = g;
            this.I = i;
            this.H = h;
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
            if (!this.i()) {
                final long i = this.I;
                this.G.m(i);
                if (i == this.H) {
                    d.b(this);
                    this.G.f();
                    return;
                }
                this.I = i + 1L;
            }
        }
    }
}
