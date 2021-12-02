// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import rx.exceptions.c;
import rx.internal.operators.x;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.h0;
import rx.internal.util.unsafe.n0;
import java.util.Queue;
import rx.n;
import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import rx.h;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.a;
import rx.g;

public final class i<T> extends f<T, T>
{
    final a<T> H;
    
    private i(final a<T> h) {
        super(h);
        this.H = h;
    }
    
    public static <T> i<T> G7() {
        return H7(16);
    }
    
    public static <T> i<T> H7(final int n) {
        return new i<T>(new a<T>(n, false, null));
    }
    
    public static <T> i<T> I7(final int n, final rx.functions.a a) {
        return new i<T>(new a<T>(n, false, a));
    }
    
    public static <T> i<T> J7(final int n, final rx.functions.a a, final boolean b) {
        return new i<T>(new a<T>(n, b, a));
    }
    
    public static <T> i<T> K7(final boolean b) {
        return new i<T>(new a<T>(16, b, null));
    }
    
    @Override
    public boolean E7() {
        return this.H.G.get() != null;
    }
    
    @Override
    public void b(final Throwable t) {
        this.H.b(t);
    }
    
    @Override
    public void c() {
        this.H.c();
    }
    
    @Override
    public void m(final T t) {
        this.H.m(t);
    }
    
    static final class a<T> extends AtomicLong implements i, h<T>, g.a<T>, o
    {
        private static final long P = -9044104859202255786L;
        final AtomicReference<n<? super T>> G;
        final Queue<Object> H;
        final boolean I;
        final AtomicReference<rx.functions.a> J;
        Throwable K;
        volatile boolean L;
        boolean M;
        boolean N;
        volatile boolean O;
        
        public a(final int n, final boolean i, final rx.functions.a initialValue) {
            this.G = new AtomicReference<n<? super T>>();
            AtomicReference<rx.functions.a> j;
            if (initialValue != null) {
                j = new AtomicReference<rx.functions.a>(initialValue);
            }
            else {
                j = null;
            }
            this.J = j;
            this.I = i;
            Object h;
            if (n > 1) {
                if (n0.f()) {
                    h = new h0<Object>(n);
                }
                else {
                    h = new rx.internal.util.atomic.i<Object>(n);
                }
            }
            else if (n0.f()) {
                h = new g0<Object>();
            }
            else {
                h = new rx.internal.util.atomic.h<Object>();
            }
            this.H = (Queue<Object>)h;
        }
        
        @Override
        public void b(final Throwable k) {
            if (!this.L) {
                this.r();
                this.K = k;
                boolean b = true;
                this.L = true;
                if (!this.O) {
                    synchronized (this) {
                        if (this.O) {
                            b = false;
                        }
                        // monitorexit(this)
                        if (b) {
                            this.t();
                            return;
                        }
                    }
                }
                this.G.get().b(k);
            }
        }
        
        @Override
        public void c() {
            if (!this.L) {
                this.r();
                boolean b = true;
                this.L = true;
                if (!this.O) {
                    synchronized (this) {
                        if (this.O) {
                            b = false;
                        }
                        // monitorexit(this)
                        if (b) {
                            this.t();
                            return;
                        }
                    }
                }
                this.G.get().c();
            }
        }
        
        @Override
        public boolean g() {
            return this.L;
        }
        
        @Override
        public void i() {
            this.r();
            this.L = true;
            synchronized (this) {
                if (this.M) {
                    return;
                }
                this.M = true;
                // monitorexit(this)
                this.H.clear();
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.L) {
                if (!this.O) {
                    boolean b = false;
                    synchronized (this) {
                        if (!this.O) {
                            this.H.offer(x.j(t));
                            b = true;
                        }
                        // monitorexit(this)
                        if (b) {
                            this.t();
                            return;
                        }
                    }
                }
                final n<? super T> n = this.G.get();
                try {
                    n.m(t);
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.g(t2, n, t);
                }
            }
        }
        
        public void n(final n<? super T> newValue) {
            if (this.G.compareAndSet(null, newValue)) {
                newValue.r(this);
                newValue.s0(this);
            }
            else {
                newValue.b(new IllegalStateException("Only a single subscriber is allowed"));
            }
        }
        
        boolean q(final boolean b, final boolean b2, final boolean b3, final n<? super T> n) {
            if (n.g()) {
                this.H.clear();
                return true;
            }
            if (b) {
                final Throwable k = this.K;
                if (k != null && !b3) {
                    this.H.clear();
                    n.b(k);
                    return true;
                }
                if (b2) {
                    if (k != null) {
                        n.b(k);
                    }
                    else {
                        n.c();
                    }
                    return true;
                }
            }
            return false;
        }
        
        void r() {
            final AtomicReference<rx.functions.a> j = this.J;
            if (j != null) {
                final rx.functions.a expectedValue = j.get();
                if (expectedValue != null && j.compareAndSet(expectedValue, null)) {
                    expectedValue.call();
                }
            }
        }
        
        void t() {
            synchronized (this) {
                if (this.M) {
                    this.N = true;
                    return;
                }
                this.M = true;
                // monitorexit(this)
                final Queue<Object> h = this.H;
                final boolean i = this.I;
                while (true) {
                    final n<? super T> n = this.G.get();
                    boolean b3;
                    if (n != null) {
                        if (this.q(this.L, h.isEmpty(), i, n)) {
                            return;
                        }
                        long value = this.get();
                        final boolean b = value == Long.MAX_VALUE;
                        long n2 = 0L;
                        while (value != 0L) {
                            final boolean l = this.L;
                            final Object poll = h.poll();
                            final boolean b2 = poll == null;
                            if (this.q(l, b2, i, n)) {
                                return;
                            }
                            if (b2) {
                                break;
                            }
                            final Object e = x.e(poll);
                            try {
                                n.m((Object)e);
                                --value;
                                ++n2;
                                continue;
                            }
                            finally {
                                h.clear();
                                final Throwable t;
                                rx.exceptions.c.e(t);
                                n.b(rx.exceptions.h.a(t, e));
                                return;
                            }
                            break;
                        }
                        b3 = b;
                        if (!b) {
                            b3 = b;
                            if (n2 != 0L) {
                                this.addAndGet(-n2);
                                b3 = b;
                            }
                        }
                    }
                    else {
                        b3 = false;
                    }
                    synchronized (this) {
                        if (!this.N) {
                            if (b3 && h.isEmpty()) {
                                this.O = true;
                            }
                            this.M = false;
                            return;
                        }
                        this.N = false;
                        continue;
                    }
                }
            }
        }
        
        @Override
        public void v(final long n) {
            final long n2 = lcmp(n, 0L);
            if (n2 >= 0) {
                if (n2 > 0) {
                    rx.internal.operators.a.b(this, n);
                }
                else if (!this.L) {
                    return;
                }
                this.t();
                return;
            }
            throw new IllegalArgumentException("n >= 0 required");
        }
    }
}
