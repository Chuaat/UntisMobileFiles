// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Collection;
import java.util.ArrayList;
import rx.exceptions.b;
import rx.plugins.c;
import rx.subscriptions.f;
import rx.functions.a;
import rx.internal.util.m;
import java.util.concurrent.atomic.AtomicLong;
import rx.subscriptions.e;
import rx.i;
import rx.o;
import rx.n;
import rx.g;

public final class o3<T> implements g.b<T, g<? extends T>>
{
    final boolean G;
    
    o3(final boolean g) {
        this.G = g;
    }
    
    public static <T> o3<T> b(final boolean b) {
        if (b) {
            return (o3<T>)o3.b.a;
        }
        return (o3<T>)a.a;
    }
    
    public n<? super g<? extends T>> a(final n<? super T> n) {
        final d d = new d(n, this.G);
        n.r(d);
        d.H();
        return (n<? super g<? extends T>>)d;
    }
    
    static final class a
    {
        static final o3<Object> a;
        
        static {
            a = new o3<Object>(false);
        }
    }
    
    static final class b
    {
        static final o3<Object> a;
        
        static {
            a = new o3<Object>(true);
        }
    }
    
    static final class c<T> extends n<T>
    {
        private final long L;
        private final d<T> M;
        
        c(final long l, final d<T> m) {
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            this.M.G(t, this.L);
        }
        
        @Override
        public void c() {
            this.M.C(this.L);
        }
        
        @Override
        public void m(final T t) {
            this.M.F(t, this);
        }
        
        @Override
        public void s0(final i i) {
            this.M.J(i, this.L);
        }
    }
    
    static final class d<T> extends n<g<? extends T>>
    {
        static final Throwable X;
        final n<? super T> L;
        final e M;
        final boolean N;
        final AtomicLong O;
        final rx.internal.util.atomic.g<Object> P;
        boolean Q;
        boolean R;
        long S;
        i T;
        volatile boolean U;
        Throwable V;
        boolean W;
        
        static {
            X = new Throwable("Terminal error");
        }
        
        d(final n<? super T> l, final boolean n) {
            this.L = l;
            this.M = new e();
            this.N = n;
            this.O = new AtomicLong();
            this.P = new rx.internal.util.atomic.g<Object>(m.J);
        }
        
        void A() {
            synchronized (this) {
                this.T = null;
            }
        }
        
        void C(final long n) {
            synchronized (this) {
                if (this.O.get() != n) {
                    return;
                }
                this.W = false;
                this.T = null;
                // monitorexit(this)
                this.D();
            }
        }
        
        void D() {
            synchronized (this) {
                if (this.Q) {
                    this.R = true;
                    return;
                }
                this.Q = true;
                boolean b = this.W;
                long s = this.S;
                final Throwable v = this.V;
                if (v != null) {
                    final Throwable x = d.X;
                    if (v != x && !this.N) {
                        this.V = x;
                    }
                }
                // monitorexit(this)
                final rx.internal.util.atomic.g<Object> p = this.P;
                final AtomicLong o = this.O;
                final n<? super T> l = this.L;
                boolean b2 = this.U;
                while (true) {
                    long n = 0L;
                    long n2;
                    while (true) {
                        n2 = lcmp(n, s);
                        if (n2 == 0) {
                            break;
                        }
                        if (l.g()) {
                            return;
                        }
                        final boolean empty = p.isEmpty();
                        if (this.w(b2, b, v, p, l, empty)) {
                            return;
                        }
                        if (empty) {
                            break;
                        }
                        final c<Object> c = p.poll();
                        final Object e = x.e(p.poll());
                        if (o.get() != c.L) {
                            continue;
                        }
                        l.m((Object)e);
                        ++n;
                    }
                    if (n2 == 0) {
                        if (l.g()) {
                            return;
                        }
                        if (this.w(this.U, b, v, p, l, p.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        final long n3 = s = this.S;
                        if (n3 != Long.MAX_VALUE) {
                            s = n3 - n;
                            this.S = s;
                        }
                        if (!this.R) {
                            this.Q = false;
                            return;
                        }
                        this.R = false;
                        b2 = this.U;
                        b = this.W;
                        final Throwable v2 = this.V;
                        if (v2 == null) {
                            continue;
                        }
                        final Throwable x2 = d.X;
                        if (v2 == x2 || this.N) {
                            continue;
                        }
                        this.V = x2;
                        continue;
                    }
                }
            }
        }
        
        void F(final T t, final c<T> c) {
            synchronized (this) {
                if (this.O.get() != ((c<Object>)c).L) {
                    return;
                }
                this.P.r(c, x.j(t));
                // monitorexit(this)
                this.D();
            }
        }
        
        void G(final Throwable t, final long n) {
            synchronized (this) {
                boolean m;
                if (this.O.get() == n) {
                    m = this.M(t);
                    this.W = false;
                    this.T = null;
                }
                else {
                    m = true;
                }
                // monitorexit(this)
                if (m) {
                    this.D();
                }
                else {
                    this.L(t);
                }
            }
        }
        
        void H() {
            this.L.r(this.M);
            this.L.r(f.a(new rx.functions.a() {
                @Override
                public void call() {
                    d.this.A();
                }
            }));
            this.L.s0(new i() {
                @Override
                public void v(final long lng) {
                    final long n = lcmp(lng, 0L);
                    if (n > 0) {
                        d.this.x(lng);
                    }
                    else if (n < 0) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("n >= 0 expected but it was ");
                        sb.append(lng);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            });
        }
        
        void J(final i t, long s) {
            synchronized (this) {
                if (this.O.get() != s) {
                    return;
                }
                s = this.S;
                this.T = t;
                // monitorexit(this)
                t.v(s);
            }
        }
        
        public void K(final g<? extends T> g) {
            final long incrementAndGet = this.O.incrementAndGet();
            final o a = this.M.a();
            if (a != null) {
                a.i();
            }
            synchronized (this) {
                final c c = new c<Object>(incrementAndGet, (d<? super T>)this);
                this.W = true;
                this.T = null;
                // monitorexit(this)
                this.M.b(c);
                g.R6((n<? super T>)c);
            }
        }
        
        void L(final Throwable t) {
            rx.plugins.c.I(t);
        }
        
        boolean M(Throwable v) {
            final Throwable v2 = this.V;
            if (v2 == d.X) {
                return false;
            }
            if (v2 != null) {
                if (!(v2 instanceof rx.exceptions.b)) {
                    this.V = new rx.exceptions.b(new Throwable[] { v2, v });
                    return true;
                }
                final ArrayList list = new ArrayList<Throwable>(((rx.exceptions.b)v2).b());
                list.add(v);
                v = new rx.exceptions.b((Collection<? extends Throwable>)list);
            }
            this.V = v;
            return true;
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                final boolean m = this.M(t);
                // monitorexit(this)
                if (m) {
                    this.U = true;
                    this.D();
                }
                else {
                    this.L(t);
                }
            }
        }
        
        @Override
        public void c() {
            this.U = true;
            this.D();
        }
        
        protected boolean w(final boolean b, final boolean b2, final Throwable t, final rx.internal.util.atomic.g<Object> g, final n<? super T> n, final boolean b3) {
            if (this.N) {
                if (b && !b2 && b3) {
                    if (t != null) {
                        n.b(t);
                    }
                    else {
                        n.c();
                    }
                    return true;
                }
            }
            else {
                if (t != null) {
                    g.clear();
                    n.b(t);
                    return true;
                }
                if (b && !b2 && b3) {
                    n.c();
                    return true;
                }
            }
            return false;
        }
        
        void x(final long n) {
            synchronized (this) {
                final i t = this.T;
                this.S = rx.internal.operators.a.a(this.S, n);
                // monitorexit(this)
                if (t != null) {
                    t.v(n);
                }
                this.D();
            }
        }
    }
}
