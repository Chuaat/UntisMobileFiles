// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.j0;
import io.reactivex.i;
import io.reactivex.c;

public final class k0 extends c
{
    final i G;
    final j0 H;
    
    public k0(final i g, final j0 h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f, this.G);
        f.l(a);
        a.H.a(this.H.e(a));
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c, Runnable
    {
        private static final long J = 7000911171163930287L;
        final f G;
        final h H;
        final i I;
        
        a(final f g, final i i) {
            this.G = g;
            this.I = i;
            this.H = new h();
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.j(this, c);
        }
        
        @Override
        public void run() {
            this.I.c(this);
        }
    }
}
