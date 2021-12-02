// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.i;
import rx.exceptions.d;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;
import rx.functions.a;
import rx.internal.schedulers.f;
import rx.schedulers.c;
import rx.n;
import rx.internal.util.m;
import rx.j;
import rx.g;

public final class u2<T> implements g.b<T, T>
{
    private final j G;
    private final boolean H;
    private final int I;
    
    public u2(final j j, final boolean b) {
        this(j, b, m.J);
    }
    
    public u2(final j g, final boolean h, int j) {
        this.G = g;
        this.H = h;
        if (j <= 0) {
            j = m.J;
        }
        this.I = j;
    }
    
    public static <T> g.b<T, T> b(final int n) {
        return new g.b<T, T>() {
            public n<? super T> a(final n<? super T> n) {
                final u2.b<Object> b = new u2.b<Object>(rx.schedulers.c.d(), (n<? super Object>)n, false, n);
                b.x();
                return b;
            }
        };
    }
    
    public n<? super T> a(final n<? super T> n) {
        final j g = this.G;
        if (g instanceof f) {
            return n;
        }
        if (g instanceof rx.internal.schedulers.n) {
            return n;
        }
        final b b = new b<Object>(g, n, this.H, this.I);
        b.x();
        return (n<? super T>)b;
    }
    
    static final class b<T> extends n<T> implements a
    {
        final n<? super T> L;
        final j.a M;
        final boolean N;
        final Queue<Object> O;
        final int P;
        volatile boolean Q;
        final AtomicLong R;
        final AtomicLong S;
        Throwable T;
        long U;
        
        public b(final j j, final n<? super T> l, final boolean n, int i) {
            this.R = new AtomicLong();
            this.S = new AtomicLong();
            this.L = l;
            this.M = j.a();
            this.N = n;
            if (i <= 0) {
                i = m.J;
            }
            this.P = i - (i >> 2);
            Object o;
            if (n0.f()) {
                o = new rx.internal.util.unsafe.z<Object>(i);
            }
            else {
                o = new e<Object>(i);
            }
            this.O = (Queue<Object>)o;
            this.v(i);
        }
        
        protected void A() {
            if (this.S.getAndIncrement() == 0L) {
                this.M.c(this);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.g() && !this.Q) {
                this.T = t;
                this.Q = true;
                this.A();
                return;
            }
            rx.plugins.c.I(t);
        }
        
        @Override
        public void c() {
            if (!this.g()) {
                if (!this.Q) {
                    this.Q = true;
                    this.A();
                }
            }
        }
        
        @Override
        public void call() {
            long u = this.U;
            final Queue<Object> o = this.O;
            final n<? super T> l = this.L;
            long addAndGet = 1L;
            do {
                long n = this.R.get();
                long n2;
                while (true) {
                    n2 = lcmp(n, u);
                    if (n2 == 0) {
                        break;
                    }
                    final boolean q = this.Q;
                    final Object poll = o.poll();
                    final boolean b = poll == null;
                    if (this.w(q, b, l, o)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    l.m((Object)x.e(poll));
                    final long n3 = ++u;
                    if (n3 != this.P) {
                        continue;
                    }
                    n = a.i(this.R, n3);
                    this.v(n3);
                    u = 0L;
                }
                if (n2 == 0 && this.w(this.Q, o.isEmpty(), l, o)) {
                    return;
                }
                this.U = u;
            } while ((addAndGet = this.S.addAndGet(-addAndGet)) != 0L);
        }
        
        @Override
        public void m(final T t) {
            if (!this.g()) {
                if (!this.Q) {
                    if (!this.O.offer(x.j(t))) {
                        this.b(new d());
                        return;
                    }
                    this.A();
                }
            }
        }
        
        boolean w(final boolean b, final boolean b2, final n<? super T> n, final Queue<Object> queue) {
            if (n.g()) {
                queue.clear();
                return true;
            }
            if (b) {
                if (this.N) {
                    if (!b2) {
                        return false;
                    }
                    final Throwable t = this.T;
                    Label_0053: {
                        if (t == null) {
                            break Label_0053;
                        }
                        try {
                            n.b(t);
                            return false;
                            n.c();
                            return false;
                        }
                        finally {
                            this.M.i();
                        }
                    }
                }
                final Throwable t2 = this.T;
                if (t2 != null) {
                    queue.clear();
                    try {
                        n.b(t2);
                        return true;
                    }
                    finally {
                        this.M.i();
                    }
                }
                if (b2) {
                    try {
                        n.c();
                        return true;
                    }
                    finally {
                        this.M.i();
                    }
                }
            }
            return false;
        }
        
        void x() {
            final n<? super T> l = this.L;
            l.s0(new i() {
                @Override
                public void v(final long n) {
                    if (n > 0L) {
                        a.b(b.this.R, n);
                        b.this.A();
                    }
                }
            });
            l.r(this.M);
            l.r(this);
        }
    }
}
