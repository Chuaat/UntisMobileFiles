// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.c;

public final class i extends c
{
    final io.reactivex.i G;
    final long H;
    final TimeUnit I;
    final j0 J;
    final boolean K;
    
    public i(final io.reactivex.i g, final long h, final TimeUnit i, final j0 j, final boolean k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f, this.H, this.I, this.J, this.K));
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements f, Runnable, io.reactivex.disposables.c
    {
        private static final long M = 465972761105851022L;
        final f G;
        final long H;
        final TimeUnit I;
        final j0 J;
        final boolean K;
        Throwable L;
        
        a(final f g, final long h, final TimeUnit i, final j0 j, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public void b(final Throwable l) {
            this.L = l;
            final j0 j = this.J;
            long h;
            if (this.K) {
                h = this.H;
            }
            else {
                h = 0L;
            }
            d.f(this, j.f(this, h, this.I));
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            d.f(this, this.J.f(this, this.H, this.I));
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
        
        @Override
        public void run() {
            final Throwable l = this.L;
            this.L = null;
            if (l != null) {
                this.G.b(l);
            }
            else {
                this.G.f();
            }
        }
    }
}
