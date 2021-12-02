// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import io.reactivex.internal.observers.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.b0;

public final class j2 extends b0<Long>
{
    private final long G;
    private final long H;
    
    public j2(final long g, final long h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super Long> i0) {
        final long g = this.G;
        final a a = new a(i0, g, g + this.H);
        i0.l(a);
        a.run();
    }
    
    static final class a extends b<Long>
    {
        private static final long L = 396518478098735504L;
        final i0<? super Long> H;
        final long I;
        long J;
        boolean K;
        
        a(final i0<? super Long> h, final long j, final long i) {
            this.H = h;
            this.J = j;
            this.I = i;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x1) != 0x0) {
                this.K = true;
                return 1;
            }
            return 0;
        }
        
        @g
        public Long a() throws Exception {
            final long j = this.J;
            if (j != this.I) {
                this.J = 1L + j;
                return j;
            }
            this.lazySet(1);
            return null;
        }
        
        @Override
        public void clear() {
            this.J = this.I;
            this.lazySet(1);
        }
        
        @Override
        public void dispose() {
            this.set(1);
        }
        
        @Override
        public boolean i() {
            return this.get() != 0;
        }
        
        @Override
        public boolean isEmpty() {
            return this.J == this.I;
        }
        
        void run() {
            if (this.K) {
                return;
            }
            final i0<? super Long> h = this.H;
            for (long i = this.I, j = this.J; j != i && this.get() == 0; ++j) {
                h.m(j);
            }
            if (this.get() == 0) {
                this.lazySet(1);
                h.f();
            }
        }
    }
}
