// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.m;
import rx.plugins.c;
import rx.internal.util.f;
import rx.internal.util.atomic.d;
import rx.internal.util.unsafe.n0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import rx.subscriptions.b;
import java.util.concurrent.atomic.AtomicInteger;
import rx.i;
import rx.o;
import rx.n;
import java.util.Objects;
import rx.k;
import rx.functions.p;
import rx.g;

public final class m0<T, R> implements g.a<R>
{
    final g<T> G;
    final p<? super T, ? extends rx.k<? extends R>> H;
    final boolean I;
    final int J;
    
    public m0(final g<T> g, final p<? super T, ? extends rx.k<? extends R>> p4, final boolean i, final int n) {
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
    
    public void a(final n<? super R> n) {
        final a a = new a((n<? super R>)n, (p<? super T, ? extends rx.k<? extends R>>)this.H, this.I, this.J);
        n.r(a.R);
        n.r(a.U);
        n.s0(a.U);
        this.G.R6(a);
    }
    
    static final class a<T, R> extends n<T>
    {
        final n<? super R> L;
        final p<? super T, ? extends rx.k<? extends R>> M;
        final boolean N;
        final int O;
        final AtomicInteger P;
        final AtomicInteger Q;
        final rx.subscriptions.b R;
        final AtomicReference<Throwable> S;
        final Queue<Object> T;
        final b U;
        volatile boolean V;
        volatile boolean W;
        
        a(final n<? super R> l, final p<? super T, ? extends rx.k<? extends R>> m, final boolean n, final int o) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = new AtomicInteger();
            this.S = new AtomicReference<Throwable>();
            this.U = new b();
            this.R = new rx.subscriptions.b();
            this.Q = new AtomicInteger();
            Object t;
            if (n0.f()) {
                t = new rx.internal.util.unsafe.o<Object>();
            }
            else {
                t = new d<Object>();
            }
            this.T = (Queue<Object>)t;
            long n2;
            if (o != Integer.MAX_VALUE) {
                n2 = o;
            }
            else {
                n2 = Long.MAX_VALUE;
            }
            this.v(n2);
        }
        
        void A(final m0.a.a a, final R r) {
            this.T.offer(x.j(r));
            this.R.e(a);
            this.Q.decrementAndGet();
            this.w();
        }
        
        @Override
        public void b(final Throwable newValue) {
            if (this.N) {
                f.b(this.S, newValue);
            }
            else {
                this.R.i();
                if (!this.S.compareAndSet(null, newValue)) {
                    rx.plugins.c.I(newValue);
                    return;
                }
            }
            this.V = true;
            this.w();
        }
        
        @Override
        public void c() {
            this.V = true;
            this.w();
        }
        
        @Override
        public void m(final T t) {
            try {
                final rx.k k = (rx.k)this.M.h((Object)t);
                if (k != null) {
                    final m0.a.a a = new m0.a.a();
                    this.R.a(a);
                    this.Q.incrementAndGet();
                    k.j0(a);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                this.b(t2);
            }
        }
        
        void w() {
            if (this.P.getAndIncrement() != 0) {
                return;
            }
            final n<? super R> l = this.L;
            final Queue<Object> t = this.T;
            final boolean n = this.N;
            final AtomicInteger q = this.Q;
            int addAndGet = 1;
            do {
                final long value = this.U.get();
                long n2 = 0L;
                Label_0101: {
                    long n3;
                    while (true) {
                        n3 = lcmp(n2, value);
                        if (n3 == 0) {
                            break;
                        }
                        if (this.W) {
                            t.clear();
                            return;
                        }
                        final boolean v = this.V;
                        if (!n && v && this.S.get() != null) {
                            break Label_0101;
                        }
                        final Object poll = t.poll();
                        final boolean b = poll == null;
                        if (v && q.get() == 0 && b) {
                            if (this.S.get() != null) {
                                l.b(f.g(this.S));
                            }
                            else {
                                l.c();
                            }
                            return;
                        }
                        if (b) {
                            break;
                        }
                        l.m(x.e(poll));
                        ++n2;
                    }
                    if (n3 == 0) {
                        if (this.W) {
                            t.clear();
                            return;
                        }
                        if (this.V) {
                            if (n) {
                                if (q.get() == 0 && t.isEmpty()) {
                                    if (this.S.get() != null) {
                                        l.b(f.g(this.S));
                                    }
                                    else {
                                        l.c();
                                    }
                                    return;
                                }
                            }
                            else {
                                if (this.S.get() != null) {
                                    break Label_0101;
                                }
                                if (q.get() == 0 && t.isEmpty()) {
                                    l.c();
                                    return;
                                }
                            }
                        }
                    }
                    if (n2 == 0L) {
                        continue;
                    }
                    this.U.a(n2);
                    if (!this.V && this.O != Integer.MAX_VALUE) {
                        this.v(n2);
                        continue;
                    }
                    continue;
                }
                t.clear();
                l.b(f.g(this.S));
            } while ((addAndGet = this.P.addAndGet(-addAndGet)) != 0);
        }
        
        void x(final m0.a.a a, final Throwable newValue) {
            if (this.N) {
                f.b(this.S, newValue);
                this.R.e(a);
                if (!this.V && this.O != Integer.MAX_VALUE) {
                    this.v(1L);
                }
            }
            else {
                this.R.i();
                this.i();
                if (!this.S.compareAndSet(null, newValue)) {
                    rx.plugins.c.I(newValue);
                    return;
                }
                this.V = true;
            }
            this.Q.decrementAndGet();
            this.w();
        }
        
        final class a extends m<R>
        {
            @Override
            public void b(final Throwable t) {
                m0.a.this.x(this, t);
            }
            
            @Override
            public void e(final R r) {
                m0.a.this.A(this, r);
            }
        }
        
        final class b extends AtomicLong implements i, o
        {
            private static final long H = -887187595446742742L;
            
            void a(final long n) {
                a.i(this, n);
            }
            
            @Override
            public boolean g() {
                return m0.a.this.W;
            }
            
            @Override
            public void i() {
                m0.a.this.W = true;
                m0.a.this.i();
                if (m0.a.this.P.getAndIncrement() == 0) {
                    m0.a.this.T.clear();
                }
            }
            
            @Override
            public void v(final long n) {
                if (n > 0L) {
                    a.b(this, n);
                    m0.a.this.w();
                }
            }
        }
    }
}
