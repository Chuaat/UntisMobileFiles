// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.j0;
import io.reactivex.i;
import io.reactivex.c;

public final class g0 extends c
{
    final i G;
    final j0 H;
    
    public g0(final i g, final j0 h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f, this.H));
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c, Runnable
    {
        private static final long J = 8571289934935992137L;
        final f G;
        final j0 H;
        Throwable I;
        
        a(final f g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable i) {
            this.I = i;
            d.f(this, this.H.e(this));
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            d.f(this, this.H.e(this));
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
            final Throwable i = this.I;
            if (i != null) {
                this.I = null;
                this.G.b(i);
            }
            else {
                this.G.f();
            }
        }
    }
}
