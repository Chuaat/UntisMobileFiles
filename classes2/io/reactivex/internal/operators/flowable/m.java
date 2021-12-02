// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import java.util.Queue;
import io.reactivex.internal.util.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayDeque;
import x5.e;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.functions.b;
import o7.d;
import java.io.Serializable;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import java.util.concurrent.Callable;
import java.util.Collection;

public final class m<T, C extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, C>
{
    final int I;
    final int J;
    final Callable<C> K;
    
    public m(final l<T> l, final int i, final int j, final Callable<C> k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void n6(final o7.c<? super C> c) {
        final int i = this.I;
        final int j = this.J;
        if (i == j) {
            super.H.m6(new a<Object, Object>((o7.c<? super Collection>)c, i, (Callable<Collection>)this.K));
        }
        else {
            l<T> l;
            Serializable s;
            if (j > i) {
                l = (l<T>)super.H;
                s = new c<Object, Object>(c, this.I, this.J, this.K);
            }
            else {
                l = (l<T>)super.H;
                s = new b<Object, Object>(c, this.I, this.J, this.K);
            }
            l.m6((q<? super T>)s);
        }
    }
    
    static final class a<T, C extends Collection<? super T>> implements q<T>, d
    {
        final o7.c<? super C> G;
        final Callable<C> H;
        final int I;
        C J;
        d K;
        boolean L;
        int M;
        
        a(final o7.c<? super C> g, final int i, final Callable<C> h) {
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.L) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.L = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.K.cancel();
        }
        
        public void f() {
            if (this.L) {
                return;
            }
            this.L = true;
            final Collection<? super T> j = this.J;
            if (j != null && !j.isEmpty()) {
                this.G.m((Object)j);
            }
            this.G.f();
        }
        
        public void m(final T t) {
            if (this.L) {
                return;
            }
            Collection<? super T> j;
            if ((j = this.J) == null) {
                try {
                    j = io.reactivex.internal.functions.b.g(this.H.call(), "The bufferSupplier returned a null buffer");
                    this.J = (C)j;
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)t);
                    this.cancel();
                    this.b((Throwable)t);
                    return;
                }
            }
            j.add(t);
            final int m = this.M + 1;
            if (m == this.I) {
                this.M = 0;
                this.J = null;
                this.G.m((Object)j);
            }
            else {
                this.M = m;
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                this.K.v(io.reactivex.internal.util.d.d(n, this.I));
            }
        }
        
        @Override
        public void z(final d k) {
            if (j.o(this.K, k)) {
                this.K = k;
                this.G.z((d)this);
            }
        }
    }
    
    static final class b<T, C extends Collection<? super T>> extends AtomicLong implements q<T>, d, e
    {
        private static final long R = -7370244972039324525L;
        final o7.c<? super C> G;
        final Callable<C> H;
        final int I;
        final int J;
        final ArrayDeque<C> K;
        final AtomicBoolean L;
        d M;
        boolean N;
        int O;
        volatile boolean P;
        long Q;
        
        b(final o7.c<? super C> g, final int i, final int j, final Callable<C> h) {
            this.G = g;
            this.I = i;
            this.J = j;
            this.H = h;
            this.L = new AtomicBoolean();
            this.K = new ArrayDeque<C>();
        }
        
        public boolean a() {
            return this.P;
        }
        
        public void b(final Throwable t) {
            if (this.N) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.N = true;
            this.K.clear();
            this.G.b(t);
        }
        
        public void cancel() {
            this.P = true;
            this.M.cancel();
        }
        
        public void f() {
            if (this.N) {
                return;
            }
            this.N = true;
            final long q = this.Q;
            if (q != 0L) {
                io.reactivex.internal.util.d.e(this, q);
            }
            v.g(this.G, this.K, this, this);
        }
        
        public void m(final T t) {
            if (this.N) {
                return;
            }
            final ArrayDeque<C> k = this.K;
            final int o = this.O;
            final int n = o + 1;
            if (o == 0) {
                try {
                    k.offer(io.reactivex.internal.functions.b.g(this.H.call(), "The bufferSupplier returned a null buffer"));
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)t);
                    this.cancel();
                    this.b((Throwable)t);
                    return;
                }
            }
            final Collection<? super T> collection = k.peek();
            if (collection != null && collection.size() + 1 == this.I) {
                k.poll();
                collection.add(t);
                ++this.Q;
                this.G.m((Object)collection);
            }
            final Iterator<C> iterator = k.iterator();
            while (iterator.hasNext()) {
                iterator.next().add((Object)t);
            }
            int o2;
            if ((o2 = n) == this.J) {
                o2 = 0;
            }
            this.O = o2;
        }
        
        public void v(long n) {
            if (j.m(n)) {
                if (v.i(n, this.G, this.K, this, this)) {
                    return;
                }
                if (!this.L.get() && this.L.compareAndSet(false, true)) {
                    n = io.reactivex.internal.util.d.d(this.J, n - 1L);
                    n = io.reactivex.internal.util.d.c(this.I, n);
                }
                else {
                    n = io.reactivex.internal.util.d.d(this.J, n);
                }
                this.M.v(n);
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.z((d)this);
            }
        }
    }
    
    static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements q<T>, d
    {
        private static final long O = -5616169793639412593L;
        final o7.c<? super C> G;
        final Callable<C> H;
        final int I;
        final int J;
        C K;
        d L;
        boolean M;
        int N;
        
        c(final o7.c<? super C> g, final int i, final int j, final Callable<C> h) {
            this.G = g;
            this.I = i;
            this.J = j;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.M = true;
            this.K = null;
            this.G.b(t);
        }
        
        public void cancel() {
            this.L.cancel();
        }
        
        public void f() {
            if (this.M) {
                return;
            }
            this.M = true;
            final Collection<? super T> k = this.K;
            this.K = null;
            if (k != null) {
                this.G.m((Object)k);
            }
            this.G.f();
        }
        
        public void m(final T t) {
            if (this.M) {
                return;
            }
            Collection<? super T> k = this.K;
            final int n = this.N;
            final int n2 = n + 1;
            if (n == 0) {
                try {
                    k = io.reactivex.internal.functions.b.g(this.H.call(), "The bufferSupplier returned a null buffer");
                    this.K = (C)k;
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)t);
                    this.cancel();
                    this.b((Throwable)t);
                    return;
                }
            }
            if (k != null) {
                k.add(t);
                if (k.size() == this.I) {
                    this.K = null;
                    this.G.m((Object)k);
                }
            }
            int n3;
            if ((n3 = n2) == this.J) {
                n3 = 0;
            }
            this.N = n3;
        }
        
        public void v(long d) {
            if (j.m(d)) {
                if (this.get() == 0 && this.compareAndSet(0, 1)) {
                    final long d2 = io.reactivex.internal.util.d.d(d, this.I);
                    d = io.reactivex.internal.util.d.d(this.J - this.I, d - 1L);
                    this.L.v(io.reactivex.internal.util.d.c(d2, d));
                }
                else {
                    this.L.v(io.reactivex.internal.util.d.d(this.J, d));
                }
            }
        }
        
        @Override
        public void z(final d l) {
            if (j.o(this.L, l)) {
                this.L = l;
                this.G.z((d)this);
            }
        }
    }
}
