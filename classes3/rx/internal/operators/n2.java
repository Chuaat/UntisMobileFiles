// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.h;
import rx.exceptions.c;
import rx.i;
import rx.subscriptions.f;
import rx.functions.a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentHashMap;
import rx.n;
import rx.internal.util.m;
import rx.internal.util.s;
import java.util.Map;
import rx.functions.b;
import rx.functions.p;
import rx.observables.d;
import rx.g;

public final class n2<T, K, V> implements g.b<rx.observables.d<K, V>, T>
{
    final p<? super T, ? extends K> G;
    final p<? super T, ? extends V> H;
    final int I;
    final boolean J;
    final p<rx.functions.b<Object>, Map<K, Object>> K;
    
    public n2(final p<? super T, ? extends K> p) {
        this(p, (p)s.c(), m.J, false, null);
    }
    
    public n2(final p<? super T, ? extends K> p2, final p<? super T, ? extends V> p3) {
        this(p2, p3, m.J, false, null);
    }
    
    public n2(final p<? super T, ? extends K> g, final p<? super T, ? extends V> h, final int i, final boolean j, final p<rx.functions.b<Object>, Map<K, Object>> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public n<? super T> a(n<? super rx.observables.d<K, V>> d) {
        while (true) {
            ConcurrentHashMap<Object, e<K, V>> concurrentHashMap = null;
            if (this.K == null) {
                final Queue<e<K, V>> queue = null;
                concurrentHashMap = (ConcurrentHashMap<Object, e<K, V>>)new ConcurrentHashMap<Object, e<Object, Object>>();
                break Label_0017;
            }
            Label_0054: {
                Label_0020: {
                    break Label_0020;
                    break Label_0054;
                }
                final Queue<e<K, V>> queue = new ConcurrentLinkedQueue<e<K, V>>();
                final b b = new b((Queue<e<Object, Object>>)queue);
                try {
                    final Map<K, Object> map = this.K.h((rx.functions.b<Object>)b);
                    continue;
                    final d d2 = new d((n<? super rx.observables.d<Object, Object>>)d, (p<? super Object, ?>)this.G, (p<? super Object, ?>)this.H, this.I, this.J, (Map<Object, e<Object, Object>>)concurrentHashMap, (Queue<e<Object, Object>>)queue);
                    d.r(rx.subscriptions.f.a(new rx.functions.a() {
                        @Override
                        public void call() {
                            d2.w();
                        }
                    }));
                    d.s0(d2.S);
                    return (n<? super T>)d2;
                }
                finally {
                    rx.exceptions.c.f((Throwable)concurrentHashMap, d);
                    d = (n<? super rx.observables.d<K, V>>)rx.observers.h.d();
                    d.i();
                    return (n<? super T>)d;
                }
            }
            break;
        }
    }
    
    static class b<K, V> implements rx.functions.b<e<K, V>>
    {
        final Queue<e<K, V>> G;
        
        b(final Queue<e<K, V>> g) {
            this.G = g;
        }
        
        public void a(final e<K, V> e) {
            this.G.offer(e);
        }
    }
    
    public static final class c implements i
    {
        final d<?, ?, ?> G;
        
        public c(final d<?, ?, ?> g) {
            this.G = g;
        }
        
        @Override
        public void v(final long n) {
            this.G.F(n);
        }
    }
    
    public static final class d<T, K, V> extends n<T>
    {
        static final Object b0;
        final n<? super rx.observables.d<K, V>> L;
        final p<? super T, ? extends K> M;
        final p<? super T, ? extends V> N;
        final int O;
        final boolean P;
        final Map<K, e<K, V>> Q;
        final Queue<e<K, V>> R;
        final c S;
        final Queue<e<K, V>> T;
        final rx.internal.producers.a U;
        final AtomicBoolean V;
        final AtomicLong W;
        final AtomicInteger X;
        Throwable Y;
        volatile boolean Z;
        final AtomicInteger a0;
        
        static {
            b0 = new Object();
        }
        
        public d(final n<? super rx.observables.d<K, V>> l, final p<? super T, ? extends K> m, final p<? super T, ? extends V> n, final int o, final boolean p7, final Map<K, e<K, V>> q, final Queue<e<K, V>> t) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = p7;
            this.R = new ConcurrentLinkedQueue<e<K, V>>();
            (this.U = new rx.internal.producers.a()).v(o);
            this.S = new c((d<?, ?, ?>)this);
            this.V = new AtomicBoolean();
            this.W = new AtomicLong();
            this.X = new AtomicInteger(1);
            this.a0 = new AtomicInteger();
            this.Q = q;
            this.T = t;
        }
        
        boolean A(final boolean b, final boolean b2, final n<? super rx.observables.d<K, V>> n, final Queue<?> queue) {
            if (b) {
                final Throwable y = this.Y;
                if (y != null) {
                    this.D(n, queue, y);
                    return true;
                }
                if (b2) {
                    this.L.c();
                    return true;
                }
            }
            return false;
        }
        
        void C() {
            if (this.a0.getAndIncrement() != 0) {
                return;
            }
            final Queue<e<K, V>> r = this.R;
            final n<? super rx.observables.d<K, V>> l = this.L;
            int addAndGet = 1;
            while (!this.A(this.Z, r.isEmpty(), l, r)) {
                long value = this.W.get();
                final boolean b = value == Long.MAX_VALUE;
                long delta;
                for (delta = 0L; value != 0L; --value, --delta) {
                    final boolean z = this.Z;
                    final e<K, V> e = r.poll();
                    final boolean b2 = e == null;
                    if (this.A(z, b2, l, r)) {
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    l.m(e);
                }
                if (delta != 0L) {
                    if (!b) {
                        this.W.addAndGet(delta);
                    }
                    this.U.v(-delta);
                }
                if ((addAndGet = this.a0.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        void D(final n<? super rx.observables.d<K, V>> n, final Queue<?> queue, final Throwable t) {
            queue.clear();
            final ArrayList<e> list = (ArrayList<e>)new ArrayList<Object>(this.Q.values());
            this.Q.clear();
            final Queue<e<K, V>> t2 = this.T;
            if (t2 != null) {
                t2.clear();
            }
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(t);
            }
            n.b(t);
        }
        
        public void F(final long lng) {
            if (lng >= 0L) {
                rx.internal.operators.a.b(this.W, lng);
                this.C();
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @Override
        public void b(final Throwable y) {
            if (this.Z) {
                rx.plugins.c.I(y);
                return;
            }
            this.Y = y;
            this.Z = true;
            this.X.decrementAndGet();
            this.C();
        }
        
        @Override
        public void c() {
            if (this.Z) {
                return;
            }
            final Iterator<e<K, V>> iterator = this.Q.values().iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).I7();
            }
            this.Q.clear();
            final Queue<e<K, V>> t = this.T;
            if (t != null) {
                t.clear();
            }
            this.Z = true;
            this.X.decrementAndGet();
            this.C();
        }
        
        @Override
        public void m(final T t) {
            if (this.Z) {
                return;
            }
            final Queue<e<K, V>> r = this.R;
            final n<? super rx.observables.d<K, V>> l = this.L;
            try {
                final K h = (K)this.M.h((Object)t);
                Object b0;
                if (h != null) {
                    b0 = h;
                }
                else {
                    b0 = d.b0;
                }
                e<K, V> h2;
                if ((h2 = (e<K, V>)this.Q.get(b0)) == null) {
                    if (this.V.get()) {
                        return;
                    }
                    h2 = e.H7(h, this.O, (d<?, K, V>)this, this.P);
                    this.Q.put((K)b0, h2);
                    this.X.getAndIncrement();
                    r.offer(h2);
                    this.C();
                }
                h2.m((V)this.N.h((Object)t));
                if (this.T != null) {
                    while (true) {
                        final e e = this.T.poll();
                        if (e == null) {
                            break;
                        }
                        e.I7();
                    }
                }
            }
            finally {
                this.i();
                final Throwable t2;
                this.D(l, r, t2);
            }
        }
        
        @Override
        public void s0(final i i) {
            this.U.c(i);
        }
        
        public void w() {
            if (this.V.compareAndSet(false, true) && this.X.decrementAndGet() == 0) {
                this.i();
            }
        }
        
        public void x(K b0) {
            if (b0 == null) {
                b0 = (K)d.b0;
            }
            if (this.Q.remove(b0) != null && this.X.decrementAndGet() == 0) {
                this.i();
            }
        }
    }
    
    static final class e<K, T> extends d<K, T>
    {
        final f<T, K> I;
        
        protected e(final K k, final f<T, K> i) {
            super(k, (a<Object>)i);
            this.I = i;
        }
        
        public static <T, K> e<K, T> H7(final K k, final int n, final n2.d<?, K, T> d, final boolean b) {
            return new e<K, T>(k, (f<T, K>)new f(n, (n2.d<?, Object, Object>)d, k, b));
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
    
    static final class f<T, K> extends AtomicInteger implements i, o, a<T>
    {
        private static final long Q = -3852313036005250360L;
        final K G;
        final Queue<Object> H;
        final d<?, K, T> I;
        final boolean J;
        final AtomicLong K;
        volatile boolean L;
        Throwable M;
        final AtomicBoolean N;
        final AtomicReference<n<? super T>> O;
        final AtomicBoolean P;
        
        public f(final int n, final d<?, K, T> i, final K g, final boolean j) {
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
                    long value = this.K.get();
                    final boolean b = value == Long.MAX_VALUE;
                    long delta;
                    for (delta = 0L; value != 0L; --value, --delta) {
                        final boolean l = this.L;
                        final Object poll = h.poll();
                        final boolean b2 = poll == null;
                        if (this.b(l, b2, n, j)) {
                            return;
                        }
                        if (b2) {
                            break;
                        }
                        n.m((Object)x.e(poll));
                    }
                    if (delta != 0L) {
                        if (!b) {
                            this.K.addAndGet(delta);
                        }
                        this.I.U.v(-delta);
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
                    rx.internal.operators.a.b(this.K, lng);
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
