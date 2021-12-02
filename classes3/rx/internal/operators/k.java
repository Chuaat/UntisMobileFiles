// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.internal.util.unsafe.z;
import rx.n;
import rx.o;
import rx.d;
import rx.g;
import rx.b;

public final class k implements j0
{
    final g<b> G;
    final int H;
    
    public k(final g<? extends b> g, final int h) {
        this.G = (g<b>)g;
        this.H = h;
    }
    
    public void a(final d d) {
        final a a = new a(d, this.H);
        d.a(a);
        this.G.R6(a);
    }
    
    static final class a extends n<b>
    {
        final d L;
        final rx.internal.subscriptions.b M;
        final rx.internal.util.unsafe.z<b> N;
        final k.a.a O;
        final AtomicBoolean P;
        volatile boolean Q;
        volatile boolean R;
        
        public a(final d l, final int n) {
            this.L = l;
            this.N = new rx.internal.util.unsafe.z<b>(n);
            final rx.internal.subscriptions.b m = new rx.internal.subscriptions.b();
            this.M = m;
            this.O = new k.a.a();
            this.P = new AtomicBoolean();
            this.r(m);
            this.v(n);
        }
        
        void A(final Throwable t) {
            this.i();
            this.b(t);
        }
        
        public void C(final b b) {
            if (!this.N.offer(b)) {
                this.b(new rx.exceptions.d());
                return;
            }
            this.w();
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.P.compareAndSet(false, true)) {
                this.L.b(t);
                return;
            }
            rx.plugins.c.I(t);
        }
        
        @Override
        public void c() {
            if (this.Q) {
                return;
            }
            this.Q = true;
            this.w();
        }
        
        void w() {
            final k.a.a o = this.O;
            if (o.getAndIncrement() != 0) {
                return;
            }
            while (!this.g()) {
                if (!this.R) {
                    final boolean q = this.Q;
                    final b b = this.N.poll();
                    final boolean b2 = b == null;
                    if (q && b2) {
                        this.L.c();
                        return;
                    }
                    if (!b2) {
                        this.R = true;
                        b.q0(o);
                        this.v(1L);
                    }
                }
                if (o.decrementAndGet() == 0) {
                    return;
                }
            }
        }
        
        void x() {
            this.R = false;
            this.w();
        }
        
        final class a extends AtomicInteger implements d
        {
            private static final long H = 7233503139645205620L;
            
            @Override
            public void a(final o newValue) {
                k.a.this.M.set(newValue);
            }
            
            @Override
            public void b(final Throwable t) {
                k.a.this.A(t);
            }
            
            @Override
            public void c() {
                k.a.this.x();
            }
        }
    }
}
