// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Objects;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;
import rx.i;
import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.functions.q;
import rx.functions.o;
import rx.g;

public final class e3<R, T> implements b<R, T>
{
    private static final Object I;
    private final o<R> G;
    final q<R, ? super T, R> H;
    
    static {
        I = new Object();
    }
    
    public e3(final R r, final q<R, ? super T, R> q) {
        this(new o<R>() {
            @Override
            public R call() {
                return r;
            }
        }, q);
    }
    
    public e3(final o<R> g, final q<R, ? super T, R> h) {
        this.G = g;
        this.H = h;
    }
    
    public e3(final q<R, ? super T, R> q) {
        this(e3.I, (q<Object, ? super T, Object>)q);
    }
    
    public n<? super T> a(final n<? super R> n) {
        final R call = this.G.call();
        if (call == e3.I) {
            return new n<T>(n) {
                boolean L;
                R M;
                
                @Override
                public void b(final Throwable t) {
                    n.b(t);
                }
                
                @Override
                public void c() {
                    n.c();
                }
                
                @Override
                public void m(T s) {
                    Label_0037: {
                        if (!this.L) {
                            this.L = true;
                            break Label_0037;
                        }
                        final R m = this.M;
                        try {
                            s = (T)e3.this.H.s(m, (Object)s);
                            this.M = (R)s;
                            n.m(s);
                        }
                        finally {
                            final Throwable t;
                            rx.exceptions.c.g(t, n, s);
                        }
                    }
                }
            };
        }
        final d d = new d(call, (n<? super Object>)n);
        final n<T> n2 = new n<T>() {
            private R L = o2;
            
            @Override
            public void b(final Throwable t) {
                d.b(t);
            }
            
            @Override
            public void c() {
                d.c();
            }
            
            @Override
            public void m(final T t) {
                final R l = this.L;
                try {
                    final R s = e3.this.H.s(l, (Object)t);
                    this.L = s;
                    d.m(s);
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.g(t2, this, t);
                }
            }
            
            @Override
            public void s0(final i i) {
                d.s0(i);
            }
        };
        n.r(n2);
        n.s0(d);
        return n2;
    }
    
    static final class d<R> implements i, h<R>
    {
        final n<? super R> G;
        final Queue<Object> H;
        boolean I;
        boolean J;
        long K;
        final AtomicLong L;
        volatile i M;
        volatile boolean N;
        Throwable O;
        
        public d(final R r, final n<? super R> g) {
            this.G = g;
            Object h;
            if (n0.f()) {
                h = new g0<Object>();
            }
            else {
                h = new rx.internal.util.atomic.h<Object>();
            }
            (this.H = (Queue<Object>)h).offer(x.j(r));
            this.L = new AtomicLong();
        }
        
        @Override
        public void b(final Throwable o) {
            this.O = o;
            this.N = true;
            this.j();
        }
        
        @Override
        public void c() {
            this.N = true;
            this.j();
        }
        
        boolean h(final boolean b, final boolean b2, final n<? super R> n) {
            if (n.g()) {
                return true;
            }
            if (b) {
                final Throwable o = this.O;
                if (o != null) {
                    n.b(o);
                    return true;
                }
                if (b2) {
                    n.c();
                    return true;
                }
            }
            return false;
        }
        
        void j() {
            synchronized (this) {
                if (this.I) {
                    this.J = true;
                    return;
                }
                this.I = true;
                // monitorexit(this)
                this.k();
            }
        }
        
        void k() {
            final n<? super R> g = this.G;
            final Queue<Object> h = this.H;
            final AtomicLong l = this.L;
            long value = l.get();
            while (!this.h(this.N, h.isEmpty(), g)) {
                long n = 0L;
                while (n != value) {
                    final boolean n2 = this.N;
                    final Object poll = h.poll();
                    final boolean b = poll == null;
                    if (this.h(n2, b, g)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    final Object e = x.e(poll);
                    try {
                        g.m((Object)e);
                        ++n;
                        continue;
                    }
                    finally {
                        rx.exceptions.c.g((Throwable)l, g, e);
                        return;
                    }
                    break;
                }
                long i = value;
                if (n != 0L) {
                    i = value;
                    if (value != Long.MAX_VALUE) {
                        i = rx.internal.operators.a.i(l, n);
                    }
                }
                synchronized (this) {
                    if (!this.J) {
                        this.I = false;
                        return;
                    }
                    this.J = false;
                    // monitorexit(this)
                    value = i;
                }
            }
        }
        
        @Override
        public void m(final R r) {
            this.H.offer(x.j(r));
            this.j();
        }
        
        public void s0(final i i) {
            Objects.requireNonNull(i);
            synchronized (this.L) {
                if (this.M == null) {
                    long k;
                    final long n = k = this.K;
                    if (n != Long.MAX_VALUE) {
                        k = n - 1L;
                    }
                    this.K = 0L;
                    this.M = i;
                    // monitorexit(this.L)
                    if (k > 0L) {
                        i.v(k);
                    }
                    this.j();
                    return;
                }
                throw new IllegalStateException("Can't set more than one Producer!");
            }
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n != 0) {
                    rx.internal.operators.a.b(this.L, lng);
                    final i m;
                    if ((m = this.M) == null) {
                        synchronized (this.L) {
                            if (this.M == null) {
                                this.K = rx.internal.operators.a.a(this.K, lng);
                            }
                        }
                    }
                    if (m != null) {
                        m.v(lng);
                    }
                    this.j();
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
