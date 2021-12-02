// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Collection;
import java.util.ArrayList;
import rx.exceptions.b;
import java.io.Serializable;
import java.util.Queue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import rx.o;
import rx.i;
import java.util.concurrent.atomic.AtomicInteger;
import rx.plugins.c;
import java.util.Iterator;
import java.util.List;
import rx.n;
import rx.internal.util.m;
import rx.functions.y;
import rx.g;

public final class b0<T, R> implements g.a<R>
{
    final g<? extends T>[] G;
    final Iterable<? extends g<? extends T>> H;
    final y<? extends R> I;
    final int J;
    final boolean K;
    
    public b0(final Iterable<? extends g<? extends T>> iterable, final y<? extends R> y) {
        this(null, iterable, y, m.J, false);
    }
    
    public b0(final g<? extends T>[] g, final Iterable<? extends g<? extends T>> h, final y<? extends R> i, final int j, final boolean k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void a(final n<? super R> n) {
        g<? extends T>[] g = this.G;
        int n2;
        if (g == null) {
            final Iterable<? extends g<? extends T>> h = this.H;
            if (h instanceof List) {
                final List<g> list = (List<g>)h;
                g = list.toArray(new g[list.size()]);
                n2 = g.length;
            }
            else {
                g = (g<? extends T>[])new g[8];
                final Iterator<? extends g<? extends T>> iterator = h.iterator();
                n2 = 0;
                while (iterator.hasNext()) {
                    final g<? extends T> g2 = (g<? extends T>)iterator.next();
                    g<? extends T>[] array = g;
                    if (n2 == g.length) {
                        array = (g<? extends T>[])new g[(n2 >> 2) + n2];
                        System.arraycopy(g, 0, array, 0, n2);
                    }
                    array[n2] = g2;
                    ++n2;
                    g = array;
                }
            }
        }
        else {
            n2 = g.length;
        }
        if (n2 == 0) {
            n.c();
            return;
        }
        new b((n<? super Object>)n, this.I, n2, this.J, this.K).h((g[])g);
    }
    
    static final class a<T, R> extends n<T>
    {
        final b<T, R> L;
        final int M;
        boolean N;
        
        public a(final b<T, R> l, final int m) {
            this.L = l;
            this.M = m;
            this.v(l.J);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.N) {
                rx.plugins.c.I(t);
                return;
            }
            this.L.e(t);
            this.N = true;
            this.L.c(null, this.M);
        }
        
        @Override
        public void c() {
            if (this.N) {
                return;
            }
            this.N = true;
            this.L.c(null, this.M);
        }
        
        @Override
        public void m(final T t) {
            if (this.N) {
                return;
            }
            this.L.c(x.j(t), this.M);
        }
        
        public void w(final long n) {
            this.v(n);
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements i, o
    {
        private static final long T = 8567835998786448817L;
        static final Object U;
        final n<? super R> G;
        final y<? extends R> H;
        final a<T, R>[] I;
        final int J;
        final Object[] K;
        final rx.internal.util.atomic.g<Object> L;
        final boolean M;
        volatile boolean N;
        volatile boolean O;
        final AtomicLong P;
        final AtomicReference<Throwable> Q;
        int R;
        int S;
        
        static {
            U = new Object();
        }
        
        public b(final n<? super R> g, final y<? extends R> h, final int n, final int j, final boolean m) {
            this.G = g;
            this.H = h;
            this.J = j;
            this.M = m;
            Arrays.fill(this.K = new Object[n], b.U);
            this.I = (a<T, R>[])new a[n];
            this.L = new rx.internal.util.atomic.g<Object>(j);
            this.P = new AtomicLong();
            this.Q = new AtomicReference<Throwable>();
        }
        
        void a(final Queue<?> queue) {
            queue.clear();
            final a<T, R>[] i = this.I;
            for (int length = i.length, j = 0; j < length; ++j) {
                i[j].i();
            }
        }
        
        boolean b(final boolean b, final boolean b2, final n<?> n, final Queue<?> queue, final boolean b3) {
            if (this.N) {
                this.a(queue);
                return true;
            }
            if (b) {
                if (b3) {
                    if (b2) {
                        final Throwable t = this.Q.get();
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
                    final Throwable t2 = this.Q.get();
                    if (t2 != null) {
                        this.a(queue);
                        n.b(t2);
                        return true;
                    }
                    if (b2) {
                        n.c();
                        return true;
                    }
                }
            }
            return false;
        }
        
        void c(final Object o, int s) {
            final a<T, R> a = this.I[s];
            synchronized (this) {
                final Object[] k = this.K;
                final int length = k.length;
                final Object o2 = k[s];
                final int r = this.R;
                final Object u = b.U;
                int r2 = r;
                if (o2 == u) {
                    r2 = r + 1;
                    this.R = r2;
                }
                final int s2 = this.S;
                if (o == null) {
                    s = s2 + 1;
                    this.S = s;
                }
                else {
                    k[s] = x.e(o);
                    s = s2;
                }
                final int n = 0;
                final boolean b = r2 == length;
                Label_0138: {
                    if (s != length) {
                        s = n;
                        if (o != null) {
                            break Label_0138;
                        }
                        s = n;
                        if (o2 != u) {
                            break Label_0138;
                        }
                    }
                    s = 1;
                }
                Label_0203: {
                    if (s == 0) {
                        if (o != null && b) {
                            this.L.r(a, this.K.clone());
                            break Label_0203;
                        }
                        if (o != null || this.Q.get() == null || (o2 != u && this.M)) {
                            break Label_0203;
                        }
                    }
                    this.O = true;
                }
                // monitorexit(this)
                if (!b && o != null) {
                    a.w(1L);
                    return;
                }
                this.d();
            }
        }
        
        void d() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final rx.internal.util.atomic.g<Object> l = this.L;
            final n<? super R> g = this.G;
            final boolean m = this.M;
            Serializable p = this.P;
            int addAndGet = 1;
            while (!this.b(this.O, l.isEmpty(), g, l, m)) {
                final long value = ((AtomicLong)p).get();
                long n = 0L;
                while (n != value) {
                    final boolean o = this.O;
                    final a a = l.peek();
                    final boolean b = a == null;
                    if (this.b(o, b, g, l, m)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    l.poll();
                    final Object[] array = l.poll();
                    Label_0169: {
                        if (array != null) {
                            try {
                                g.m((Object)this.H.call(array));
                                a.w(1L);
                                ++n;
                                continue;
                            }
                            finally {
                                this.N = true;
                                this.a(l);
                                break Label_0169;
                            }
                            break;
                        }
                        this.N = true;
                        this.a(l);
                        p = new IllegalStateException("Broken queue?! Sender received but not the array.");
                    }
                    g.b((Throwable)p);
                    return;
                }
                if (n != 0L && value != Long.MAX_VALUE) {
                    rx.internal.operators.a.i((AtomicLong)p, n);
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        void e(final Throwable t) {
            final AtomicReference<Throwable> q = this.Q;
            Throwable expectedValue;
            Throwable newValue;
            do {
                expectedValue = q.get();
                if (expectedValue != null) {
                    if (expectedValue instanceof rx.exceptions.b) {
                        final ArrayList list = new ArrayList<Throwable>(((rx.exceptions.b)expectedValue).b());
                        list.add(t);
                        newValue = new rx.exceptions.b((Collection<? extends Throwable>)list);
                    }
                    else {
                        newValue = new rx.exceptions.b(Arrays.asList(expectedValue, t));
                    }
                }
                else {
                    newValue = t;
                }
            } while (!q.compareAndSet(expectedValue, newValue));
        }
        
        @Override
        public boolean g() {
            return this.N;
        }
        
        public void h(final g<? extends T>[] array) {
            final a<T, R>[] i = this.I;
            final int length = i.length;
            final int n = 0;
            for (int j = 0; j < length; ++j) {
                i[j] = (a<T, R>)new a((b<Object, Object>)this, j);
            }
            this.lazySet(0);
            this.G.r(this);
            this.G.s0(this);
            for (int k = n; k < length; ++k) {
                if (this.N) {
                    return;
                }
                array[k].z5((n<? super T>)i[k]);
            }
        }
        
        @Override
        public void i() {
            if (!this.N) {
                this.N = true;
                if (this.getAndIncrement() == 0) {
                    this.a(this.L);
                }
            }
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n != 0) {
                    rx.internal.operators.a.b(this.P, lng);
                    this.d();
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
