// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class e extends c
{
    final i[] G;
    
    public e(final i[] g) {
        this.G = g;
    }
    
    public void L0(final f f) {
        final a a = new a(f, this.G);
        f.l(a.J);
        a.a();
    }
    
    static final class a extends AtomicInteger implements f
    {
        private static final long K = -7965400327305809232L;
        final f G;
        final i[] H;
        int I;
        final h J;
        
        a(final f g, final i[] h) {
            this.G = g;
            this.H = h;
            this.J = new h();
        }
        
        void a() {
            if (this.J.i()) {
                return;
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i[] h = this.H;
            while (!this.J.i()) {
                final int n = this.I++;
                if (n == h.length) {
                    this.G.f();
                    return;
                }
                h[n].c(this);
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            this.a();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.J.a(c);
        }
    }
}
