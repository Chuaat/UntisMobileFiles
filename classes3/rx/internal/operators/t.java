// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.g;
import rx.i;
import rx.o;
import java.util.concurrent.atomic.AtomicInteger;
import rx.n;

public abstract class t<T, R> extends n<T>
{
    static final int P = 0;
    static final int Q = 1;
    static final int R = 2;
    static final int S = 3;
    protected final n<? super R> L;
    protected boolean M;
    protected R N;
    final AtomicInteger O;
    
    public t(final n<? super R> l) {
        this.L = l;
        this.O = new AtomicInteger();
    }
    
    final void A(final long lng) {
        final long n = lcmp(lng, 0L);
        if (n >= 0) {
            if (n != 0) {
                final n<? super R> l = this.L;
                do {
                    final int value = this.O.get();
                    if (value == 1 || value == 3) {
                        break;
                    }
                    if (l.g()) {
                        break;
                    }
                    if (value == 2) {
                        if (this.O.compareAndSet(2, 3)) {
                            l.m(this.N);
                            if (!l.g()) {
                                l.c();
                            }
                        }
                    }
                } while (!this.O.compareAndSet(0, 1));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("n >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    final void C() {
        final n<? super R> l = this.L;
        l.r(this);
        l.s0(new a(this));
    }
    
    public final void D(final g<? extends T> g) {
        this.C();
        g.R6(this);
    }
    
    @Override
    public void b(final Throwable t) {
        this.N = null;
        this.L.b(t);
    }
    
    @Override
    public void c() {
        if (this.M) {
            this.x(this.N);
        }
        else {
            this.w();
        }
    }
    
    @Override
    public final void s0(final i i) {
        i.v(Long.MAX_VALUE);
    }
    
    protected final void w() {
        this.L.c();
    }
    
    protected final void x(final R n) {
        final n<? super R> l = this.L;
        do {
            final int value = this.O.get();
            if (value == 2 || value == 3) {
                break;
            }
            if (l.g()) {
                break;
            }
            if (value == 1) {
                l.m(n);
                if (!l.g()) {
                    l.c();
                }
                this.O.lazySet(3);
                return;
            }
            this.N = n;
        } while (!this.O.compareAndSet(0, 2));
    }
    
    static final class a implements i
    {
        final t<?, ?> G;
        
        public a(final t<?, ?> g) {
            this.G = g;
        }
        
        @Override
        public void v(final long n) {
            this.G.A(n);
        }
    }
}
