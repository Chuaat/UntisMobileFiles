// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.d;
import rx.plugins.c;
import rx.internal.util.f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import rx.o;
import rx.n;
import java.util.Objects;
import rx.b;
import rx.functions.p;
import rx.g;

public final class l0<T> implements g.a<T>
{
    final g<T> G;
    final p<? super T, ? extends b> H;
    final boolean I;
    final int J;
    
    public l0(final g<T> g, final p<? super T, ? extends b> p4, final boolean i, final int n) {
        Objects.requireNonNull(p4, "mapper is null");
        if (n > 0) {
            this.G = g;
            this.H = p4;
            this.I = i;
            this.J = n;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("maxConcurrency > 0 required but it was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void a(final n<? super T> n) {
        final a<Object> a = new a<Object>((n<? super Object>)n, (p<? super Object, ? extends b>)this.H, this.I, this.J);
        n.r(a);
        n.r(a.Q);
        this.G.R6(a);
    }
    
    static final class a<T> extends n<T>
    {
        final n<? super T> L;
        final p<? super T, ? extends b> M;
        final boolean N;
        final int O;
        final AtomicInteger P;
        final rx.subscriptions.b Q;
        final AtomicReference<Throwable> R;
        
        a(final n<? super T> l, final p<? super T, ? extends b> m, final boolean n, final int o) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = new AtomicInteger(1);
            this.R = new AtomicReference<Throwable>();
            this.Q = new rx.subscriptions.b();
            long n2;
            if (o != Integer.MAX_VALUE) {
                n2 = o;
            }
            else {
                n2 = Long.MAX_VALUE;
            }
            this.v(n2);
        }
        
        public void A(final l0.a.a a, final Throwable newValue) {
            this.Q.e(a);
            if (this.N) {
                f.b(this.R, newValue);
                if (!this.w() && this.O != Integer.MAX_VALUE) {
                    this.v(1L);
                }
            }
            else {
                this.Q.i();
                this.i();
                if (this.R.compareAndSet(null, newValue)) {
                    this.L.b(f.g(this.R));
                }
                else {
                    rx.plugins.c.I(newValue);
                }
            }
        }
        
        @Override
        public void b(final Throwable newValue) {
            if (this.N) {
                f.b(this.R, newValue);
                this.c();
            }
            else {
                this.Q.i();
                if (this.R.compareAndSet(null, newValue)) {
                    this.L.b(f.g(this.R));
                }
                else {
                    rx.plugins.c.I(newValue);
                }
            }
        }
        
        @Override
        public void c() {
            this.w();
        }
        
        @Override
        public void m(final T t) {
            try {
                final b b = (b)this.M.h((Object)t);
                if (b != null) {
                    final l0.a.a a = new l0.a.a();
                    this.Q.a(a);
                    this.P.getAndIncrement();
                    b.G0(a);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Completable");
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                this.b(t2);
            }
        }
        
        boolean w() {
            if (this.P.decrementAndGet() == 0) {
                final Throwable g = f.g(this.R);
                if (g != null) {
                    this.L.b(g);
                }
                else {
                    this.L.c();
                }
                return true;
            }
            return false;
        }
        
        public void x(final l0.a.a a) {
            this.Q.e(a);
            if (!this.w() && this.O != Integer.MAX_VALUE) {
                this.v(1L);
            }
        }
        
        final class a extends AtomicReference<o> implements d, o
        {
            private static final long H = -8588259593722659900L;
            
            @Override
            public void a(final o newValue) {
                if (!this.compareAndSet(null, newValue)) {
                    newValue.i();
                    if (this.get() != this) {
                        rx.plugins.c.I(new IllegalStateException("Subscription already set!"));
                    }
                }
            }
            
            @Override
            public void b(final Throwable t) {
                l0.a.this.A(this, t);
            }
            
            @Override
            public void c() {
                l0.a.this.x(this);
            }
            
            @Override
            public boolean g() {
                return this.get() == this;
            }
            
            @Override
            public void i() {
                final a a = ((AtomicReference<a>)this).getAndSet(this);
                if (a != null && a != this) {
                    a.i();
                }
            }
        }
    }
}
