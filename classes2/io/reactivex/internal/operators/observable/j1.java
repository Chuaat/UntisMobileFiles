// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.e;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;
import io.reactivex.observables.b;

public final class j1<T, K, V> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.observables.b<K, V>>
{
    final o<? super T, ? extends K> H;
    final o<? super T, ? extends V> I;
    final int J;
    final boolean K;
    
    public j1(final g0<T> g0, final o<? super T, ? extends K> h, final o<? super T, ? extends V> i, final int j, final boolean k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(final i0<? super io.reactivex.observables.b<K, V>> i0) {
        super.G.c(new a<Object, Object, Object>((i0<? super io.reactivex.observables.b<?, ?>>)i0, (o<? super T, ?>)this.H, (o<? super T, ?>)this.I, this.J, this.K));
    }
    
    public static final class a<T, K, V> extends AtomicInteger implements i0<T>, c
    {
        private static final long O = -3688291656102519502L;
        static final Object P;
        final i0<? super io.reactivex.observables.b<K, V>> G;
        final o<? super T, ? extends K> H;
        final o<? super T, ? extends V> I;
        final int J;
        final boolean K;
        final Map<Object, b<K, V>> L;
        c M;
        final AtomicBoolean N;
        
        static {
            P = new Object();
        }
        
        public a(final i0<? super io.reactivex.observables.b<K, V>> g, final o<? super T, ? extends K> h, final o<? super T, ? extends V> i, final int j, final boolean k) {
            this.N = new AtomicBoolean();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = new ConcurrentHashMap<Object, b<K, V>>();
            this.lazySet(1);
        }
        
        public void a(K p) {
            if (p == null) {
                p = (K)a.P;
            }
            this.L.remove(p);
            if (this.decrementAndGet() == 0) {
                this.M.dispose();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            final ArrayList<b> list = (ArrayList<b>)new ArrayList<Object>(this.L.values());
            this.L.clear();
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(t);
            }
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            if (this.N.compareAndSet(false, true) && this.decrementAndGet() == 0) {
                this.M.dispose();
            }
        }
        
        @Override
        public void f() {
            final ArrayList<b> list = (ArrayList<b>)new ArrayList<Object>(this.L.values());
            this.L.clear();
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().f();
            }
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.N.get();
        }
        
        @Override
        public void l(final c m) {
            if (d.l(this.M, m)) {
                this.M = m;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            try {
                final K apply = (K)this.H.apply((Object)t);
                Object p;
                if (apply != null) {
                    p = apply;
                }
                else {
                    p = a.P;
                }
                b<K, V> m8;
                if ((m8 = (b<K, V>)this.L.get(p)) == null) {
                    if (this.N.get()) {
                        return;
                    }
                    m8 = b.m8(apply, this.J, (a<?, K, V>)this, this.K);
                    this.L.put(p, m8);
                    this.getAndIncrement();
                    this.G.m(m8);
                }
                m8.m(io.reactivex.internal.functions.b.g((V)this.I.apply((Object)t), "The value supplied is null"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.M.dispose();
                this.b(t2);
            }
        }
    }
    
    static final class b<K, T> extends io.reactivex.observables.b<K, T>
    {
        final c<T, K> H;
        
        protected b(final K k, final c<T, K> h) {
            super(k);
            this.H = h;
        }
        
        public static <T, K> b<K, T> m8(final K k, final int n, final a<?, K, T> a, final boolean b) {
            return new b<K, T>(k, (c<T, K>)new c(n, (a<?, Object, Object>)a, k, b));
        }
        
        @Override
        protected void L5(final i0<? super T> i0) {
            this.H.c(i0);
        }
        
        public void b(final Throwable t) {
            this.H.e(t);
        }
        
        public void f() {
            this.H.d();
        }
        
        public void m(final T t) {
            this.H.f(t);
        }
    }
    
    static final class c<T, K> extends AtomicInteger implements io.reactivex.disposables.c, g0<T>
    {
        private static final long P = -3852313036005250360L;
        final K G;
        final io.reactivex.internal.queue.c<T> H;
        final a<?, K, T> I;
        final boolean J;
        volatile boolean K;
        Throwable L;
        final AtomicBoolean M;
        final AtomicBoolean N;
        final AtomicReference<i0<? super T>> O;
        
        c(final int n, final a<?, K, T> i, final K g, final boolean j) {
            this.M = new AtomicBoolean();
            this.N = new AtomicBoolean();
            this.O = new AtomicReference<i0<? super T>>();
            this.H = new io.reactivex.internal.queue.c<T>(n);
            this.I = i;
            this.G = g;
            this.J = j;
        }
        
        boolean a(final boolean b, final boolean b2, final i0<? super T> i0, final boolean b3) {
            if (this.M.get()) {
                this.H.clear();
                this.I.a(this.G);
                this.O.lazySet(null);
                return true;
            }
            if (b) {
                if (b3) {
                    if (b2) {
                        final Throwable l = this.L;
                        this.O.lazySet(null);
                        if (l != null) {
                            i0.b(l);
                        }
                        else {
                            i0.f();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable j = this.L;
                    if (j != null) {
                        this.H.clear();
                        this.O.lazySet(null);
                        i0.b(j);
                        return true;
                    }
                    if (b2) {
                        this.O.lazySet(null);
                        i0.f();
                        return true;
                    }
                }
            }
            return false;
        }
        
        void b() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final io.reactivex.internal.queue.c<T> h = this.H;
            final boolean j = this.J;
            i0<? super T> i0 = this.O.get();
            int n = 1;
            while (true) {
                if (i0 != null) {
                    while (true) {
                        final boolean k = this.K;
                        final T poll = h.poll();
                        final boolean b = poll == null;
                        if (this.a(k, b, i0, j)) {
                            return;
                        }
                        if (b) {
                            break;
                        }
                        i0.m(poll);
                    }
                }
                final int addAndGet = this.addAndGet(-n);
                if (addAndGet == 0) {
                    return;
                }
                n = addAndGet;
                if (i0 != null) {
                    continue;
                }
                i0 = this.O.get();
                n = addAndGet;
            }
        }
        
        @Override
        public void c(final i0<? super T> newValue) {
            if (this.N.compareAndSet(false, true)) {
                newValue.l(this);
                this.O.lazySet(newValue);
                if (this.M.get()) {
                    this.O.lazySet(null);
                }
                else {
                    this.b();
                }
            }
            else {
                e.l(new IllegalStateException("Only one Observer allowed!"), newValue);
            }
        }
        
        public void d() {
            this.K = true;
            this.b();
        }
        
        @Override
        public void dispose() {
            if (this.M.compareAndSet(false, true) && this.getAndIncrement() == 0) {
                this.O.lazySet(null);
                this.I.a(this.G);
            }
        }
        
        public void e(final Throwable l) {
            this.L = l;
            this.K = true;
            this.b();
        }
        
        public void f(final T t) {
            this.H.offer(t);
            this.b();
        }
        
        @Override
        public boolean i() {
            return this.M.get();
        }
    }
}
