// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import o7.d;
import io.reactivex.internal.util.h;
import io.reactivex.q;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentHashMap;
import o7.c;
import io.reactivex.l;
import java.util.Map;
import x5.g;
import x5.o;
import io.reactivex.flowables.b;

public final class n1<T, K, V> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.flowables.b<K, V>>
{
    final o<? super T, ? extends K> I;
    final o<? super T, ? extends V> J;
    final int K;
    final boolean L;
    final o<? super g<Object>, ? extends Map<K, Object>> M;
    
    public n1(final l<T> l, final o<? super T, ? extends K> i, final o<? super T, ? extends V> j, final int k, final boolean m, final o<? super g<Object>, ? extends Map<K, Object>> m2) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
        this.M = m2;
    }
    
    @Override
    protected void n6(o7.c<? super io.reactivex.flowables.b<K, V>> b) {
        try {
            Queue<c<Object, Object>> queue;
            Map<Object, c<Object, Object>> map;
            if (this.M == null) {
                queue = null;
                map = new ConcurrentHashMap<Object, c<Object, Object>>();
            }
            else {
                queue = (Queue<c<Object, Object>>)new ConcurrentLinkedQueue<c<?, ?>>();
                map = (Map<Object, c<Object, Object>>)this.M.apply((Object)new a((Queue<c<K, V>>)queue));
            }
            b = new b<Object, Object, Object>((o7.c<? super io.reactivex.flowables.b<Object, Object>>)b, (o<? super Object, ?>)this.I, (o<? super Object, ?>)this.J, this.K, this.L, map, queue);
            super.H.m6(b);
        }
        catch (Exception ex) {
            io.reactivex.exceptions.b.b(ex);
            ((o7.c)b).z((o7.d)io.reactivex.internal.util.h.G);
            ((o7.c)b).b(ex);
        }
    }
    
    static final class a<K, V> implements g<c<K, V>>
    {
        final Queue<c<K, V>> G;
        
        a(final Queue<c<K, V>> g) {
            this.G = g;
        }
        
        public void a(final c<K, V> c) {
            this.G.offer(c);
        }
    }
    
    public static final class b<T, K, V> extends io.reactivex.internal.subscriptions.c<io.reactivex.flowables.b<K, V>> implements q<T>
    {
        private static final long X = -3688291656102519502L;
        static final Object Y;
        final c<? super io.reactivex.flowables.b<K, V>> H;
        final x5.o<? super T, ? extends K> I;
        final x5.o<? super T, ? extends V> J;
        final int K;
        final boolean L;
        final Map<Object, n1.c<K, V>> M;
        final io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> N;
        final Queue<n1.c<K, V>> O;
        o7.d P;
        final AtomicBoolean Q;
        final AtomicLong R;
        final AtomicInteger S;
        Throwable T;
        volatile boolean U;
        boolean V;
        boolean W;
        
        static {
            Y = new Object();
        }
        
        public b(final c<? super io.reactivex.flowables.b<K, V>> h, final x5.o<? super T, ? extends K> i, final x5.o<? super T, ? extends V> j, final int k, final boolean l, final Map<Object, n1.c<K, V>> m, final Queue<n1.c<K, V>> o) {
            this.Q = new AtomicBoolean();
            this.R = new AtomicLong();
            this.S = new AtomicInteger(1);
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
            this.O = o;
            this.N = new io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>>(k);
        }
        
        private void j() {
            if (this.O != null) {
                int n = 0;
                while (true) {
                    final n1.c c = this.O.poll();
                    if (c == null) {
                        break;
                    }
                    c.f();
                    ++n;
                }
                if (n != 0) {
                    this.S.addAndGet(-n);
                }
            }
        }
        
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.W = true;
                return 2;
            }
            return 0;
        }
        
        public void b(final Throwable t) {
            if (this.V) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.V = true;
            final Iterator<n1.c<K, V>> iterator = this.M.values().iterator();
            while (iterator.hasNext()) {
                ((n1.c)iterator.next()).b(t);
            }
            this.M.clear();
            final Queue<n1.c<K, V>> o = this.O;
            if (o != null) {
                o.clear();
            }
            this.T = t;
            this.U = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            if (this.W) {
                this.n();
            }
            else {
                this.q();
            }
        }
        
        public void cancel() {
            if (this.Q.compareAndSet(false, true)) {
                this.j();
                if (this.S.decrementAndGet() == 0) {
                    this.P.cancel();
                }
            }
        }
        
        public void clear() {
            this.N.clear();
        }
        
        public void f() {
            if (!this.V) {
                final Iterator<n1.c<K, V>> iterator = this.M.values().iterator();
                while (iterator.hasNext()) {
                    ((n1.c)iterator.next()).f();
                }
                this.M.clear();
                final Queue<n1.c<K, V>> o = this.O;
                if (o != null) {
                    o.clear();
                }
                this.V = true;
                this.U = true;
                this.c();
            }
        }
        
        public void g(K y) {
            if (y == null) {
                y = (K)b.Y;
            }
            this.M.remove(y);
            if (this.S.decrementAndGet() == 0) {
                this.P.cancel();
                if (this.getAndIncrement() == 0) {
                    this.N.clear();
                }
            }
        }
        
        boolean i(final boolean b, final boolean b2, final c<?> c, final io.reactivex.internal.queue.c<?> c2) {
            if (this.Q.get()) {
                c2.clear();
                return true;
            }
            if (this.L) {
                if (b && b2) {
                    final Throwable t = this.T;
                    if (t != null) {
                        c.b(t);
                    }
                    else {
                        c.f();
                    }
                    return true;
                }
            }
            else if (b) {
                final Throwable t2 = this.T;
                if (t2 != null) {
                    c2.clear();
                    c.b(t2);
                    return true;
                }
                if (b2) {
                    c.f();
                    return true;
                }
            }
            return false;
        }
        
        public boolean isEmpty() {
            return this.N.isEmpty();
        }
        
        public void m(final T t) {
            if (this.V) {
                return;
            }
            final io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> n = this.N;
            try {
                final K apply = (K)this.I.apply((Object)t);
                boolean b = false;
                Object y;
                if (apply != null) {
                    y = apply;
                }
                else {
                    y = n1.b.Y;
                }
                n1.c<K, V> q8;
                if ((q8 = (n1.c<K, V>)this.M.get(y)) == null) {
                    if (this.Q.get()) {
                        return;
                    }
                    q8 = n1.c.Q8(apply, this.K, (b<?, K, V>)this, this.L);
                    this.M.put(y, q8);
                    this.S.getAndIncrement();
                    b = true;
                }
                q8.m(io.reactivex.internal.functions.b.g((V)this.J.apply((Object)t), "The valueSelector returned null"));
                this.j();
                if (b) {
                    n.offer(q8);
                    this.c();
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.P.cancel();
                this.b(t2);
            }
        }
        
        void n() {
            final io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> n = this.N;
            final c<? super io.reactivex.flowables.b<K, V>> h = this.H;
            int addAndGet = 1;
            while (!this.Q.get()) {
                final boolean u = this.U;
                if (u && !this.L) {
                    final Throwable t = this.T;
                    if (t != null) {
                        n.clear();
                        h.b(t);
                        return;
                    }
                }
                h.m((Object)null);
                if (u) {
                    final Throwable t2 = this.T;
                    if (t2 != null) {
                        h.b(t2);
                    }
                    else {
                        h.f();
                    }
                    return;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            n.clear();
        }
        
        void q() {
            final io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> n = this.N;
            final c<? super io.reactivex.flowables.b<K, V>> h = this.H;
            int addAndGet = 1;
            do {
                final long value = this.R.get();
                long n2 = 0L;
                long n3;
                while (true) {
                    n3 = lcmp(n2, value);
                    if (n3 == 0) {
                        break;
                    }
                    final boolean u = this.U;
                    final io.reactivex.flowables.b<K, V> b = (io.reactivex.flowables.b<K, V>)n.poll();
                    final boolean b2 = b == null;
                    if (this.i(u, b2, h, n)) {
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    h.m((Object)b);
                    ++n2;
                }
                if (n3 == 0 && this.i(this.U, n.isEmpty(), h, n)) {
                    return;
                }
                if (n2 == 0L) {
                    continue;
                }
                if (value != Long.MAX_VALUE) {
                    this.R.addAndGet(-n2);
                }
                this.P.v(n2);
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        @io.reactivex.annotations.g
        public io.reactivex.flowables.b<K, V> r() {
            return this.N.poll();
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.R, n);
                this.c();
            }
        }
        
        @Override
        public void z(final o7.d p) {
            if (j.o(this.P, p)) {
                this.P = p;
                this.H.z((o7.d)this);
                p.v((long)this.K);
            }
        }
    }
    
    static final class c<K, T> extends b<K, T>
    {
        final d<T, K> I;
        
        protected c(final K k, final d<T, K> i) {
            super(k);
            this.I = i;
        }
        
        public static <T, K> c<K, T> Q8(final K k, final int n, final n1.b<?, K, T> b, final boolean b2) {
            return new c<K, T>(k, (d<T, K>)new d(n, (n1.b<?, Object, Object>)b, k, b2));
        }
        
        public void b(final Throwable t) {
            this.I.b(t);
        }
        
        public void f() {
            this.I.f();
        }
        
        public void m(final T t) {
            this.I.m(t);
        }
        
        @Override
        protected void n6(final o7.c<? super T> c) {
            this.I.e(c);
        }
    }
    
    static final class d<T, K> extends io.reactivex.internal.subscriptions.c<T> implements o7.b<T>
    {
        private static final long T = -3852313036005250360L;
        final K H;
        final io.reactivex.internal.queue.c<T> I;
        final b<?, K, T> J;
        final boolean K;
        final AtomicLong L;
        volatile boolean M;
        Throwable N;
        final AtomicBoolean O;
        final AtomicReference<c<? super T>> P;
        final AtomicBoolean Q;
        boolean R;
        int S;
        
        d(final int n, final b<?, K, T> j, final K h, final boolean k) {
            this.L = new AtomicLong();
            this.O = new AtomicBoolean();
            this.P = new AtomicReference<c<? super T>>();
            this.Q = new AtomicBoolean();
            this.I = new io.reactivex.internal.queue.c<T>(n);
            this.J = j;
            this.H = h;
            this.K = k;
        }
        
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.R = true;
                return 2;
            }
            return 0;
        }
        
        public void b(final Throwable n) {
            this.N = n;
            this.M = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            if (this.R) {
                this.i();
            }
            else {
                this.j();
            }
        }
        
        public void cancel() {
            if (this.O.compareAndSet(false, true)) {
                this.J.g(this.H);
            }
        }
        
        public void clear() {
            this.I.clear();
        }
        
        public void e(final c<? super T> newValue) {
            if (this.Q.compareAndSet(false, true)) {
                newValue.z((o7.d)this);
                this.P.lazySet(newValue);
                this.c();
            }
            else {
                io.reactivex.internal.subscriptions.g.d(new IllegalStateException("Only one Subscriber allowed!"), newValue);
            }
        }
        
        public void f() {
            this.M = true;
            this.c();
        }
        
        boolean g(final boolean b, final boolean b2, final c<? super T> c, final boolean b3) {
            if (this.O.get()) {
                this.I.clear();
                return true;
            }
            if (b) {
                if (b3) {
                    if (b2) {
                        final Throwable n = this.N;
                        if (n != null) {
                            c.b(n);
                        }
                        else {
                            c.f();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable n2 = this.N;
                    if (n2 != null) {
                        this.I.clear();
                        c.b(n2);
                        return true;
                    }
                    if (b2) {
                        c.f();
                        return true;
                    }
                }
            }
            return false;
        }
        
        void i() {
            final io.reactivex.internal.queue.c<T> i = this.I;
            c<? super T> c = this.P.get();
            int n = 1;
            while (true) {
                if (c != null) {
                    if (this.O.get()) {
                        i.clear();
                        return;
                    }
                    final boolean m = this.M;
                    if (m && !this.K) {
                        final Throwable n2 = this.N;
                        if (n2 != null) {
                            i.clear();
                            c.b(n2);
                            return;
                        }
                    }
                    c.m((Object)null);
                    if (m) {
                        final Throwable n3 = this.N;
                        if (n3 != null) {
                            c.b(n3);
                        }
                        else {
                            c.f();
                        }
                        return;
                    }
                }
                final int addAndGet = this.addAndGet(-n);
                if (addAndGet == 0) {
                    return;
                }
                n = addAndGet;
                if (c != null) {
                    continue;
                }
                c = this.P.get();
                n = addAndGet;
            }
        }
        
        public boolean isEmpty() {
            return this.I.isEmpty();
        }
        
        void j() {
            final io.reactivex.internal.queue.c<T> i = this.I;
            final boolean k = this.K;
            c<? super T> c = this.P.get();
            int n = 1;
            while (true) {
                if (c != null) {
                    final long value = this.L.get();
                    long n2 = 0L;
                    long n3;
                    while (true) {
                        n3 = lcmp(n2, value);
                        if (n3 == 0) {
                            break;
                        }
                        final boolean m = this.M;
                        final T poll = i.poll();
                        final boolean b = poll == null;
                        if (this.g(m, b, c, k)) {
                            return;
                        }
                        if (b) {
                            break;
                        }
                        c.m((Object)poll);
                        ++n2;
                    }
                    if (n3 == 0 && this.g(this.M, i.isEmpty(), c, k)) {
                        return;
                    }
                    if (n2 != 0L) {
                        if (value != Long.MAX_VALUE) {
                            this.L.addAndGet(-n2);
                        }
                        this.J.P.v(n2);
                    }
                }
                final int addAndGet = this.addAndGet(-n);
                if (addAndGet == 0) {
                    return;
                }
                n = addAndGet;
                if (c != null) {
                    continue;
                }
                c = this.P.get();
                n = addAndGet;
            }
        }
        
        public void m(final T t) {
            this.I.offer(t);
            this.c();
        }
        
        @io.reactivex.annotations.g
        public T poll() {
            final T poll = this.I.poll();
            if (poll != null) {
                ++this.S;
                return poll;
            }
            final int s = this.S;
            if (s != 0) {
                this.S = 0;
                this.J.P.v((long)s);
            }
            return null;
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.L, n);
                this.c();
            }
        }
    }
}
