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

public final class n0 extends c
{
    final long G;
    final TimeUnit H;
    final j0 I;
    
    public n0(final long g, final TimeUnit h, final j0 i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f);
        f.l(a);
        a.a(this.I.f(a, this.G, this.H));
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable
    {
        private static final long H = 3167244060586201109L;
        final f G;
        
        a(final f g) {
            this.G = g;
        }
        
        void a(final io.reactivex.disposables.c c) {
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
            this.G.f();
        }
    }
}
