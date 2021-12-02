// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.b0;

public final class z3 extends b0<Long>
{
    final j0 G;
    final long H;
    final TimeUnit I;
    
    public z3(final long h, final TimeUnit i, final j0 g) {
        this.H = h;
        this.I = i;
        this.G = g;
    }
    
    public void L5(final i0<? super Long> i0) {
        final a a = new a(i0);
        i0.l(a);
        a.a(this.G.f(a, this.H, this.I));
    }
    
    static final class a extends AtomicReference<c> implements c, Runnable
    {
        private static final long H = -2809475196591179431L;
        final i0<? super Long> G;
        
        a(final i0<? super Long> g) {
            this.G = g;
        }
        
        public void a(final c c) {
            d.k(this, c);
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
                this.G.m(0L);
                ((AtomicReference<e>)this).lazySet(e.G);
                this.G.f();
            }
        }
    }
}
