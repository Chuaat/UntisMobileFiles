// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.d;
import rx.plugins.c;
import rx.internal.util.f;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.z;
import rx.internal.util.m;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Queue;
import rx.i;
import rx.n;
import rx.internal.util.o;
import rx.functions.p;
import rx.g;

public final class n0<T, R> implements a<R>
{
    final g<? extends T> G;
    final p<? super T, ? extends Iterable<? extends R>> H;
    final int I;
    
    protected n0(final g<? extends T> g, final p<? super T, ? extends Iterable<? extends R>> h, final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public static <T, R> g<R> b(final g<? extends T> g, final p<? super T, ? extends Iterable<? extends R>> p3, final int n) {
        if (g instanceof o) {
            return g.Q6((g.a<R>)new c(((o<Object>)g).G7(), (p<? super Object, ? extends Iterable<?>>)p3));
        }
        return g.Q6((g.a<R>)new n0(g, (p<? super Object, ? extends Iterable<?>>)p3, n));
    }
    
    public void a(final n<? super R> n) {
        final b b = new b((n<? super R>)n, (p<? super T, ? extends Iterable<? extends R>>)this.H, this.I);
        n.r(b);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                b.A(n);
            }
        });
        this.G.R6(b);
    }
    
    static final class b<T, R> extends n<T>
    {
        final n<? super R> L;
        final p<? super T, ? extends Iterable<? extends R>> M;
        final long N;
        final Queue<Object> O;
        final AtomicReference<Throwable> P;
        final AtomicLong Q;
        final AtomicInteger R;
        volatile boolean S;
        long T;
        Iterator<? extends R> U;
        
        public b(final n<? super R> l, final p<? super T, ? extends Iterable<? extends R>> m, final int n) {
            this.L = l;
            this.M = m;
            this.P = new AtomicReference<Throwable>();
            this.R = new AtomicInteger();
            this.Q = new AtomicLong();
            Object o;
            if (n == Integer.MAX_VALUE) {
                this.N = Long.MAX_VALUE;
                o = new rx.internal.util.atomic.g<Object>(m.J);
            }
            else {
                this.N = n - (n >> 2);
                if (rx.internal.util.unsafe.n0.f()) {
                    o = new rx.internal.util.unsafe.z<Object>(n);
                }
                else {
                    o = new e<Object>(n);
                }
            }
            this.O = (Queue<Object>)o;
            this.v(n);
        }
        
        void A(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n > 0) {
                rx.internal.operators.a.b(this.Q, lng);
                this.x();
            }
            else if (n < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("n >= 0 required but it was ");
                sb.append(lng);
                throw new IllegalStateException(sb.toString());
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (f.b(this.P, t)) {
                this.S = true;
                this.x();
            }
            else {
                rx.plugins.c.I(t);
            }
        }
        
        @Override
        public void c() {
            this.S = true;
            this.x();
        }
        
        @Override
        public void m(final T t) {
            if (!this.O.offer(x.j(t))) {
                this.i();
                this.b(new d());
                return;
            }
            this.x();
        }
        
        boolean w(final boolean b, final boolean b2, final n<?> n, final Queue<?> queue) {
            if (n.g()) {
                queue.clear();
                this.U = null;
                return true;
            }
            if (b) {
                if (this.P.get() != null) {
                    final Throwable g = f.g(this.P);
                    this.i();
                    queue.clear();
                    this.U = null;
                    n.b(g);
                    return true;
                }
                if (b2) {
                    n.c();
                    return true;
                }
            }
            return false;
        }
        
        void x() {
            if (this.R.getAndIncrement() != 0) {
                return;
            }
            final n<? super R> l = this.L;
            final Queue<Object> o = this.O;
            int addAndGet = 1;
            while (true) {
                final Iterator<? extends R> u = this.U;
                final boolean b = false;
                if (u == null) {
                    final boolean s = this.S;
                    final Object poll = o.poll();
                    final boolean b2 = poll == null;
                    if (this.w(s, b2, l, o)) {
                        return;
                    }
                    if (!b2) {
                        final long t = this.T + 1L;
                        if (t == this.N) {
                            this.T = 0L;
                            this.v(t);
                        }
                        else {
                            this.T = t;
                        }
                        try {
                            final Iterator iterator = ((Iterable)this.M.h(x.e(poll))).iterator();
                            if (!iterator.hasNext()) {
                                continue;
                            }
                            this.U = (Iterator<? extends R>)iterator;
                        }
                        finally {
                            rx.exceptions.c.e((Throwable)u);
                            this.b((Throwable)u);
                            continue;
                        }
                    }
                }
                if (u != null) {
                    final long value = this.Q.get();
                    long n = 0L;
                    Object o2;
                    long n2;
                    while (true) {
                        o2 = u;
                        n2 = n;
                        if (n == value) {
                            break;
                        }
                        if (this.w(this.S, false, l, o)) {
                            return;
                        }
                        n2 = n;
                        try {
                            l.m((Object)u.next());
                            if (this.w(this.S, false, l, o)) {
                                return;
                            }
                            final long n3 = n2 = n + 1L;
                            final boolean hasNext = u.hasNext();
                            n = n3;
                            if (hasNext) {
                                continue;
                            }
                            this.U = null;
                            n2 = n3;
                        }
                        finally {
                            rx.exceptions.c.e((Throwable)u);
                            this.U = null;
                            this.b((Throwable)u);
                        }
                        o2 = null;
                        break;
                    }
                    if (n2 == value) {
                        final boolean s2 = this.S;
                        boolean b3 = b;
                        if (o.isEmpty()) {
                            b3 = b;
                            if (o2 == null) {
                                b3 = true;
                            }
                        }
                        if (this.w(s2, b3, l, o)) {
                            return;
                        }
                    }
                    if (n2 != 0L) {
                        rx.internal.operators.a.i(this.Q, n2);
                    }
                    if (o2 == null) {
                        continue;
                    }
                }
                if ((addAndGet = this.R.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
    }
    
    static final class c<T, R> implements a<R>
    {
        final T G;
        final p<? super T, ? extends Iterable<? extends R>> H;
        
        public c(final T g, final p<? super T, ? extends Iterable<? extends R>> h) {
            this.G = g;
            this.H = h;
        }
        
        public void a(final n<? super R> n) {
            try {
                final Iterator<?> iterator = (Iterator<?>)((Iterable)this.H.h((Object)this.G)).iterator();
                if (!iterator.hasNext()) {
                    n.c();
                    return;
                }
                n.s0(new q0.a<Object>((n<? super Object>)n, iterator));
            }
            finally {
                final Throwable t;
                rx.exceptions.c.g(t, n, this.G);
            }
        }
    }
}
