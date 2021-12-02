// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.plugins.a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import o7.c;
import java.util.Comparator;
import java.util.List;
import io.reactivex.parallel.b;
import io.reactivex.l;

public final class p<T> extends l<T>
{
    final io.reactivex.parallel.b<List<T>> H;
    final Comparator<? super T> I;
    
    public p(final io.reactivex.parallel.b<List<T>> h, final Comparator<? super T> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final b b = new b((c<? super T>)c, this.H.F(), (Comparator<? super T>)this.I);
        c.z((d)b);
        this.H.Q((c[])b.H);
    }
    
    static final class a<T> extends AtomicReference<d> implements q<List<T>>
    {
        private static final long I = 6751017204873808094L;
        final b<T> G;
        final int H;
        
        a(final b<T> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            this.G.c(t);
        }
        
        public void c(final List<T> list) {
            this.G.d(list, this.H);
        }
        
        public void f() {
        }
        
        @Override
        public void z(final d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
    
    static final class b<T> extends AtomicInteger implements d
    {
        private static final long P = 3481980673745556697L;
        final c<? super T> G;
        final a<T>[] H;
        final List<T>[] I;
        final int[] J;
        final Comparator<? super T> K;
        final AtomicLong L;
        volatile boolean M;
        final AtomicInteger N;
        final AtomicReference<Throwable> O;
        
        b(final c<? super T> g, final int newValue, final Comparator<? super T> k) {
            this.L = new AtomicLong();
            this.N = new AtomicInteger();
            this.O = new AtomicReference<Throwable>();
            this.G = g;
            this.K = k;
            final a[] h = new a[newValue];
            for (int i = 0; i < newValue; ++i) {
                h[i] = new a((b<Object>)this, i);
            }
            this.H = (a<T>[])h;
            this.I = (List<T>[])new List[newValue];
            this.J = new int[newValue];
            this.N.lazySet(newValue);
        }
        
        void a() {
            final a<T>[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].a();
            }
        }
        
        void b() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super T> g = this.G;
            final List<T>[] i = this.I;
            final int[] j = this.J;
            final int length = j.length;
            int n = 1;
            while (true) {
                final long value = this.L.get();
                long n2 = 0L;
                while (true) {
                    final long n3 = lcmp(n2, value);
                    if (n3 != 0) {
                        if (this.M) {
                            Arrays.fill(i, null);
                            return;
                        }
                        final Throwable t = this.O.get();
                        if (t != null) {
                            this.a();
                            Arrays.fill(i, null);
                            g.b(t);
                            return;
                        }
                        int n4 = -1;
                        Throwable t2 = null;
                        Object value2;
                        int compare;
                        for (int k = 0; k < length; ++k, t2 = (Throwable)value2, n4 = compare) {
                            final List<T> list = i[k];
                            final int n5 = j[k];
                            value2 = t2;
                            compare = n4;
                            if (list.size() != n5) {
                                Label_0166: {
                                    if (t2 != null) {
                                        final T value3 = list.get(n5);
                                        try {
                                            compare = this.K.compare((Object)t2, (Object)value3);
                                            final boolean b = compare > 0;
                                            compare = n4;
                                            if (b) {
                                                break Label_0166;
                                            }
                                        }
                                        finally {
                                            io.reactivex.exceptions.b.b((Throwable)value2);
                                            this.a();
                                            Arrays.fill(i, null);
                                            if (!this.O.compareAndSet(null, (Throwable)value2)) {
                                                io.reactivex.plugins.a.Y((Throwable)value2);
                                            }
                                            g.b((Throwable)this.O.get());
                                            return;
                                        }
                                        continue;
                                    }
                                    value2 = list.get(n5);
                                }
                                compare = k;
                            }
                        }
                        if (t2 == null) {
                            Arrays.fill(i, null);
                            g.f();
                            return;
                        }
                        g.m((Object)t2);
                        ++j[n4];
                        ++n2;
                    }
                    else {
                        Label_0453: {
                            if (n3 == 0) {
                                if (this.M) {
                                    Arrays.fill(i, null);
                                    return;
                                }
                                final Throwable t3 = this.O.get();
                                if (t3 != null) {
                                    this.a();
                                    Arrays.fill(i, null);
                                    g.b(t3);
                                    return;
                                }
                                int l = 0;
                                while (true) {
                                    while (l < length) {
                                        if (j[l] != i[l].size()) {
                                            final boolean b2 = false;
                                            if (b2) {
                                                Arrays.fill(i, null);
                                                g.f();
                                                return;
                                            }
                                            break Label_0453;
                                        }
                                        else {
                                            ++l;
                                        }
                                    }
                                    final boolean b2 = true;
                                    continue;
                                }
                            }
                        }
                        if (n2 != 0L && value != Long.MAX_VALUE) {
                            this.L.addAndGet(-n2);
                        }
                        int n6;
                        if ((n6 = this.get()) == n && (n6 = this.addAndGet(-n)) == 0) {
                            return;
                        }
                        n = n6;
                        break;
                    }
                }
            }
        }
        
        void c(final Throwable newValue) {
            if (this.O.compareAndSet(null, newValue)) {
                this.b();
            }
            else if (newValue != this.O.get()) {
                io.reactivex.plugins.a.Y(newValue);
            }
        }
        
        public void cancel() {
            if (!this.M) {
                this.M = true;
                this.a();
                if (this.getAndIncrement() == 0) {
                    Arrays.fill(this.I, null);
                }
            }
        }
        
        void d(final List<T> list, final int n) {
            this.I[n] = list;
            if (this.N.decrementAndGet() == 0) {
                this.b();
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.L, n);
                if (this.N.get() == 0) {
                    this.b();
                }
            }
        }
    }
}
