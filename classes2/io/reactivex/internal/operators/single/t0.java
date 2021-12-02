// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.k0;

public final class t0 extends k0<Long>
{
    final long G;
    final TimeUnit H;
    final j0 I;
    
    public t0(final long g, final TimeUnit h, final j0 i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super Long> n0) {
        final a a = new a(n0);
        n0.l(a);
        a.a(this.I.f(a, this.G, this.H));
    }
    
    static final class a extends AtomicReference<c> implements c, Runnable
    {
        private static final long H = 8465401857522493082L;
        final n0<? super Long> G;
        
        a(final n0<? super Long> g) {
            this.G = g;
        }
        
        void a(final c c) {
            d.f(this, c);
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
        public void run() {
            this.G.d(0L);
        }
    }
}
