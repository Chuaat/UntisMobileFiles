// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.s;

public final class l1 extends s<Long>
{
    final long G;
    final TimeUnit H;
    final j0 I;
    
    public l1(final long g, final TimeUnit h, final j0 i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void u1(final v<? super Long> v) {
        final a a = new a(v);
        v.l(a);
        a.a(this.I.f(a, this.G, this.H));
    }
    
    static final class a extends AtomicReference<c> implements c, Runnable
    {
        private static final long H = 2875964065294031672L;
        final v<? super Long> G;
        
        a(final v<? super Long> g) {
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
