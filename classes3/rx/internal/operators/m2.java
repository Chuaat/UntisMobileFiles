// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Queue;
import rx.h;
import rx.exceptions.c;
import rx.i;
import rx.subscriptions.f;
import rx.functions.a;
import rx.n;
import rx.internal.util.m;
import rx.internal.util.s;
import java.util.Map;
import rx.functions.b;
import rx.functions.p;
import rx.observables.d;
import rx.g;

@Deprecated
public final class m2<T, K, V> implements g.b<rx.observables.d<K, V>, T>
{
    final p<? super T, ? extends K> G;
    final p<? super T, ? extends V> H;
    final int I;
    final boolean J;
    final p<rx.functions.b<K>, Map<K, Object>> K;
    
    public m2(final p<? super T, ? extends K> p) {
        this(p, (p)s.c(), m.J, false, null);
    }
    
    public m2(final p<? super T, ? extends K> p2, final p<? super T, ? extends V> p3) {
        this(p2, p3, m.J, false, null);
    }
    
    public m2(final p<? super T, ? extends K> g, final p<? super T, ? extends V> h, final int i, final boolean j, final p<rx.functions.b<K>, Map<K, Object>> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public m2(final p<? super T, ? extends K> p3, final p<? super T, ? extends V> p4, final p<rx.functions.b<K>, Map<K, Object>> p5) {
        this(p3, p4, m.J, false, p5);
    }
    
    public n<? super T> a(final n<? super rx.observables.d<K, V>> n) {
        try {
            final c c = new c((n<? super rx.observables.d<K, V>>)n, (p<? super T, ? extends K>)this.G, (p<? super T, ? extends V>)this.H, this.I, this.J, (p<rx.functions.b<K>, Map<K, Object>>)this.K);
            n.r(f.a(new rx.functions.a() {
                @Override
                public void call() {
                    c.w();
                }
            }));
            n.s0(c.T);
            return (n<? super T>)c;
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
            final n<? super T> d = rx.observers.h.d();
            d.i();
            return d;
        }
    }
    
    public static final class b implements i
    {
        final c<?, ?, ?> G;
        
        public b(final c<?, ?, ?> g) {
            this.G = g;
        }
        
        @Override
        public void v(final long n) {
            this.G.G(n);
        }
    }
    
    public static final class c<T, K, V> extends n<T>
    {
        static final Object c0;
        final n<? super rx.observables.d<K, V>> L;
        final p<? super T, ? extends K> M;
        final p<? super T, ? extends V> N;
        final int O;
        final boolean P;
        final Map<Object, d<K, V>> Q;
        final Map<Object, d<K, V>> R;
        final Queue<rx.observables.d<K, V>> S;
        final b T;
        final Queue<K> U;
        final rx.internal.producers.a V;
        final AtomicBoolean W;
        final AtomicLong X;
        final AtomicInteger Y;
        Throwable Z;
        volatile boolean a0;
        final AtomicInteger b0;
        
        static {
            c0 = new Object();
        }
        
        public c(final n<? super rx.observables.d<K, V>> l, final p<? super T, ? extends K> m, final p<? super T, ? extends V> n, final int o, final boolean p6, final p<rx.functions.b<K>, Map<K, Object>> p7) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = p6;
            this.S = new ConcurrentLinkedQueue<rx.observables.d<K, V>>();
            (this.V = new rx.internal.producers.a()).v(o);
            this.T = new b((c<?, ?, ?>)this);
            this.W = new AtomicBoolean();
            this.X = new AtomicLong();
            this.Y = new AtomicInteger(1);
            this.b0 = new AtomicInteger();
            if (p7 == null) {
                this.Q = new ConcurrentHashMap<Object, d<K, V>>();
                this.U = null;
            }
            else {
                final ConcurrentLinkedQueue<K> u = new ConcurrentLinkedQueue<K>();
                this.U = u;
                this.Q = this.C(p7, new a<K>((Queue<Object>)u));
            }
            this.R = new ConcurrentHashMap<Object, d<K, V>>();
        }
        
        private Map<Object, d<K, V>> C(final p<rx.functions.b<K>, Map<K, Object>> p2, final rx.functions.b<K> b) {
            return (Map<Object, d<K, V>>)p2.h(b);
        }
        
        boolean A(final boolean b, final boolean b2, final n<? super rx.observables.d<K, V>> n, final Queue<?> queue) {
            if (b) {
                final Throwable z = this.Z;
                if (z != null) {
                    this.F(n, queue, z);
                    return true;
                }
                if (b2) {
                    this.L.c();
                    return true;
                }
            }
            return false;
        }
        
        void D() {
            if (this.b0.getAndIncrement() != 0) {
                return;
            }
            final Queue<rx.observables.d<K, V>> s = this.S;
            final n<? super rx.observables.d<K, V>> l = this.L;
            int addAndGet = 1;
            while (!this.A(this.a0, s.isEmpty(), l, s)) {
                long value;
                long n;
                for (value = this.X.get(), n = 0L; n != value; ++n) {
                    final boolean a0 = this.a0;
                    final rx.observables.d<K, V> d = s.poll();
                    final boolean b = d == null;
                    if (this.A(a0, b, l, s)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    l.m(d);
                }
                if (n != 0L) {
                    if (value != Long.MAX_VALUE) {
                        rx.internal.operators.a.i(this.X, n);
                    }
                    this.V.v(n);
                }
                if ((addAndGet = this.b0.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        void F(final n<? super rx.observables.d<K, V>> n, final Queue<?> queue, final Throwable t) {
            queue.clear();
            final ArrayList<d> list = (ArrayList<d>)new ArrayList<Object>(this.Q.values());
            this.Q.clear();
            if (this.U != null) {
                this.R.clear();
                this.U.clear();
            }
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(t);
            }
            n.b(t);
        }
        
        public void G(final long lng) {
            if (lng >= 0L) {
                rx.internal.operators.a.b(this.X, lng);
                this.D();
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @Override
        public void b(final Throwable z) {
            if (this.a0) {
                rx.plugins.c.I(z);
                return;
            }
            this.Z = z;
            this.a0 = true;
            this.Y.decrementAndGet();
            this.D();
        }
        
        @Override
        public void c() {
            if (this.a0) {
                return;
            }
            final Iterator<d<K, V>> iterator = this.Q.values().iterator();
            while (iterator.hasNext()) {
                ((d)iterator.next()).I7();
            }
            this.Q.clear();
            if (this.U != null) {
                this.R.clear();
                this.U.clear();
            }
            this.a0 = true;
            this.Y.decrementAndGet();
            this.D();
        }
        
        @Override
        public void m(final T t) {
            if (this.a0) {
                return;
            }
            final Queue<rx.observables.d<K, V>> s = this.S;
            final n<? super rx.observables.d<K, V>> l = this.L;
            try {
                final K h = (K)this.M.h((Object)t);
                boolean b = false;
                Object c0;
                if (h != null) {
                    c0 = h;
                }
                else {
                    c0 = c.c0;
                }
                d<K, V> h2;
                if ((h2 = (d<K, V>)this.Q.get(c0)) == null) {
                    if (this.W.get()) {
                        return;
                    }
                    h2 = d.H7(h, this.O, (c<?, K, V>)this, this.P);
                    this.Q.put(c0, h2);
                    if (this.U != null) {
                        this.R.put(c0, h2);
                    }
                    this.Y.getAndIncrement();
                    b = true;
                }
                h2.m((V)this.N.h((Object)t));
                if (this.U != null) {
                    while (true) {
                        final K poll = this.U.poll();
                        if (poll == null) {
                            break;
                        }
                        final d d = this.R.remove(poll);
                        if (d == null) {
                            continue;
                        }
                        d.I7();
                    }
                }
                if (b) {
                    s.offer(h2);
                    this.D();
                }
            }
            finally {
                this.i();
                final Throwable t2;
                this.F(l, s, t2);
            }
        }
        
        @Override
        public void s0(final i i) {
            this.V.c(i);
        }
        
        public void w() {
            if (this.W.compareAndSet(false, true) && this.Y.decrementAndGet() == 0) {
                this.i();
            }
        }
        
        public void x(K c0) {
            if (c0 == null) {
                c0 = (K)c.c0;
            }
            if (this.Q.remove(c0) != null && this.Y.decrementAndGet() == 0) {
                this.i();
            }
            if (this.U != null) {
                this.R.remove(c0);
            }
        }
        
        static class a<K> implements b<K>
        {
            final Queue<K> G;
            
            a(final Queue<K> g) {
                this.G = g;
            }
            
            @Override
            public void h(final K k) {
                this.G.offer(k);
            }
        }
    }
    
    static final class d<K, T> extends rx.observables.d<K, T>
    {
        final e<T, K> I;
        
        protected d(final K k, final e<T, K> i) {
            super(k, (g.a<Object>)i);
            this.I = i;
        }
        
        public static <T, K> d<K, T> H7(final K k, final int n, final m2.c<?, K, T> c, final boolean b) {
            return new d<K, T>(k, (e<T, K>)new e(n, (m2.c<?, Object, Object>)c, k, b));
        }
        
        public void I7() {
            this.I.d();
        }
        
        public void b(final Throwable t) {
            this.I.e(t);
        }
        
        public void m(final T t) {
            this.I.m(t);
        }
    }
    
    static final class e<T, K> extends AtomicInteger implements i, o, g.a<T>
    {
        private static final long Q = -3852313036005250360L;
        final K G;
        final Queue<Object> H;
        final m2.c<?, K, T> I;
        final boolean J;
        final AtomicLong K;
        volatile boolean L;
        Throwable M;
        final AtomicBoolean N;
        final AtomicReference<n<? super T>> O;
        final AtomicBoolean P;
        
        public e(final int n, final m2.c<?, K, T> i, final K g, final boolean j) {
            this.H = new ConcurrentLinkedQueue<Object>();
            this.I = i;
            this.G = g;
            this.J = j;
            this.N = new AtomicBoolean();
            this.O = new AtomicReference<n<? super T>>();
            this.P = new AtomicBoolean();
            this.K = new AtomicLong();
        }
        
        public void a(final n<? super T> newValue) {
            if (this.P.compareAndSet(false, true)) {
                newValue.r(this);
                newValue.s0(this);
                this.O.lazySet(newValue);
                this.c();
            }
            else {
                newValue.b(new IllegalStateException("Only one Subscriber allowed!"));
            }
        }
        
        boolean b(final boolean b, final boolean b2, final n<? super T> n, final boolean b3) {
            if (this.N.get()) {
                this.H.clear();
                this.I.x(this.G);
                return true;
            }
            if (b) {
                if (b3) {
                    if (b2) {
                        final Throwable m = this.M;
                        if (m != null) {
                            n.b(m);
                        }
                        else {
                            n.c();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable i = this.M;
                    if (i != null) {
                        this.H.clear();
                        n.b(i);
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
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final Queue<Object> h = this.H;
            final boolean j = this.J;
            n<? super T> n = this.O.get();
            int n2 = 1;
            while (true) {
                if (n != null) {
                    if (this.b(this.L, h.isEmpty(), n, j)) {
                        return;
                    }
                    long value;
                    long n3;
                    for (value = this.K.get(), n3 = 0L; n3 != value; ++n3) {
                        final boolean l = this.L;
                        final Object poll = h.poll();
                        final boolean b = poll == null;
                        if (this.b(l, b, n, j)) {
                            return;
                        }
                        if (b) {
                            break;
                        }
                        n.m((Object)x.e(poll));
                    }
                    if (n3 != 0L) {
                        if (value != Long.MAX_VALUE) {
                            a.i(this.K, n3);
                        }
                        this.I.V.v(n3);
                    }
                }
                final int addAndGet = this.addAndGet(-n2);
                if (addAndGet == 0) {
                    return;
                }
                n2 = addAndGet;
                if (n != null) {
                    continue;
                }
                n = this.O.get();
                n2 = addAndGet;
            }
        }
        
        public void d() {
            this.L = true;
            this.c();
        }
        
        public void e(final Throwable m) {
            this.M = m;
            this.L = true;
            this.c();
        }
        
        @Override
        public boolean g() {
            return this.N.get();
        }
        
        @Override
        public void i() {
            if (this.N.compareAndSet(false, true) && this.getAndIncrement() == 0) {
                this.I.x(this.G);
            }
        }
        
        public void m(final T t) {
            if (t == null) {
                this.M = new NullPointerException();
                this.L = true;
            }
            else {
                this.H.offer(x.j(t));
            }
            this.c();
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n != 0) {
                    a.b(this.K, lng);
                    this.c();
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
