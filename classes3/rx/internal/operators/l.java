// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.o;
import rx.d;
import rx.b;

public final class l implements j0
{
    final b[] G;
    
    public l(final b[] g) {
        this.G = g;
    }
    
    public void a(final d d) {
        final a a = new a(d, this.G);
        d.a(a.J);
        a.d();
    }
    
    static final class a extends AtomicInteger implements d
    {
        private static final long K = -7965400327305809232L;
        final d G;
        final b[] H;
        int I;
        final rx.internal.subscriptions.b J;
        
        public a(final d g, final b[] h) {
            this.G = g;
            this.H = h;
            this.J = new rx.internal.subscriptions.b();
        }
        
        @Override
        public void a(final o o) {
            this.J.b(o);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void c() {
            this.d();
        }
        
        void d() {
            if (this.J.g()) {
                return;
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
            final b[] h = this.H;
            while (!this.J.g()) {
                final int n = this.I++;
                if (n == h.length) {
                    this.G.c();
                    return;
                }
                h[n].G0(this);
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
