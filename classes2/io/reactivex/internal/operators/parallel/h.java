// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import y5.l;
import io.reactivex.internal.subscriptions.j;
import y5.o;
import o7.d;
import java.util.concurrent.atomic.AtomicLongArray;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import o7.c;
import org.reactivestreams.Subscriber;
import io.reactivex.parallel.b;

public final class h<T> extends b<T>
{
    final o7.b<? extends T> a;
    final int b;
    final int c;
    
    public h(final o7.b<? extends T> a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int F() {
        return this.b;
    }
    
    @Override
    public void Q(final Subscriber<? super T>[] array) {
        if (!this.U((c[])array)) {
            return;
        }
        this.a.e((c)new a((c[])array, this.c));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>
    {
        private static final long U = -4470634016609963609L;
        final Subscriber<? super T>[] G;
        final AtomicLongArray H;
        final long[] I;
        final int J;
        final int K;
        d L;
        o<T> M;
        Throwable N;
        volatile boolean O;
        int P;
        volatile boolean Q;
        final AtomicInteger R;
        int S;
        int T;
        
        a(final Subscriber<? super T>[] g, int n) {
            this.R = new AtomicInteger();
            this.G = (c[])g;
            this.J = n;
            this.K = n - (n >> 2);
            final int length = g.length;
            n = length + length;
            (this.H = new AtomicLongArray(n + 1)).lazySet(n, length);
            this.I = new long[length];
        }
        
        void a(final int i) {
            if (this.H.decrementAndGet(i) == 0L) {
                this.Q = true;
                this.L.cancel();
                if (this.getAndIncrement() == 0) {
                    this.M.clear();
                }
            }
        }
        
        public void b(final Throwable n) {
            this.N = n;
            this.O = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            if (this.T == 1) {
                this.e();
            }
            else {
                this.d();
            }
        }
        
        void d() {
            final o<T> m = this.M;
            final c[] g = this.G;
            final AtomicLongArray h = this.H;
            final long[] i = this.I;
            final int length = i.length;
            int p = this.P;
            int s = this.S;
            int length2 = 1;
        Label_0041:
            while (true) {
                final int n = 0;
                final int n2 = 0;
                final int n3 = 0;
                int n4 = 0;
                while (!this.Q) {
                    final boolean o = this.O;
                    if (o) {
                        final Throwable n5 = this.N;
                        if (n5 != null) {
                            m.clear();
                            for (int length3 = g.length, j = n3; j < length3; ++j) {
                                g[j].b(n5);
                            }
                            return;
                        }
                    }
                    final boolean empty = m.isEmpty();
                    if (o && empty) {
                        for (int length4 = g.length, k = n; k < length4; ++k) {
                            g[k].f();
                        }
                        return;
                    }
                    int l = 0;
                    Label_0402: {
                        if (empty) {
                            l = p;
                        }
                        else {
                            final long value = h.get(p);
                            final long n6 = i[p];
                            int addAndGet = 0;
                            int n8 = 0;
                            Label_0362: {
                                if (value != n6 && h.get(length + p) == 0L) {
                                    try {
                                        final T poll = m.poll();
                                        if (poll == null) {
                                            break Label_0402;
                                        }
                                        g[p].m((Object)poll);
                                        i[p] = n6 + 1L;
                                        final int n7 = s + 1;
                                        if ((addAndGet = n7) == this.K) {
                                            this.L.v((long)n7);
                                            addAndGet = 0;
                                        }
                                        n8 = 0;
                                        break Label_0362;
                                    }
                                    finally {
                                        io.reactivex.exceptions.b.b((Throwable)h);
                                        this.L.cancel();
                                        for (length2 = g.length, l = n2; l < length2; ++l) {
                                            g[l].b((Throwable)h);
                                        }
                                        return;
                                    }
                                }
                                n8 = n4 + 1;
                                addAndGet = s;
                            }
                            l = ++p;
                            if (p == length) {
                                l = 0;
                            }
                            p = l;
                            s = addAndGet;
                            if ((n4 = n8) != length) {
                                continue;
                            }
                            s = addAndGet;
                        }
                    }
                    final int value2 = this.get();
                    if (value2 != length2) {
                        length2 = value2;
                        p = l;
                        continue Label_0041;
                    }
                    this.P = l;
                    this.S = s;
                    int addAndGet = this.addAndGet(-length2);
                    p = l;
                    if ((length2 = addAndGet) == 0) {
                        return;
                    }
                    continue Label_0041;
                }
                m.clear();
            }
        }
        
        void e() {
            final o<T> m = this.M;
            final c[] g = this.G;
            final AtomicLongArray h = this.H;
            final long[] i = this.I;
            final int length = i.length;
            int p = this.P;
            int length2 = 1;
        Label_0035:
            while (true) {
                final int n = 0;
                final int n2 = 0;
                final int n3 = 0;
                int n4 = 0;
                int j = p;
                while (!this.Q) {
                    if (m.isEmpty()) {
                        for (int length3 = g.length, k = n3; k < length3; ++k) {
                            g[k].f();
                        }
                        return;
                    }
                    final long value = h.get(j);
                    final long n5 = i[j];
                    int n6 = 0;
                    Label_0264: {
                        if (value != n5 && h.get(length + j) == 0L) {
                            try {
                                final T poll = m.poll();
                                if (poll == null) {
                                    for (int length4 = g.length, l = n; l < length4; ++l) {
                                        g[l].f();
                                    }
                                    return;
                                }
                                g[j].m((Object)poll);
                                i[j] = n5 + 1L;
                                n6 = 0;
                                break Label_0264;
                            }
                            finally {
                                io.reactivex.exceptions.b.b((Throwable)h);
                                this.L.cancel();
                                length2 = g.length;
                                for (int n7 = n2; n7 < length2; ++n7) {
                                    g[n7].b((Throwable)h);
                                }
                                return;
                            }
                        }
                        n6 = n4 + 1;
                    }
                    p = ++j;
                    if (j == length) {
                        p = 0;
                    }
                    j = p;
                    if ((n4 = n6) != length) {
                        continue;
                    }
                    n6 = this.get();
                    if (n6 != length2) {
                        length2 = n6;
                        continue Label_0035;
                    }
                    this.P = p;
                    n6 = this.addAndGet(-length2);
                    if ((length2 = n6) == 0) {
                        return;
                    }
                    continue Label_0035;
                }
                m.clear();
            }
        }
        
        public void f() {
            this.O = true;
            this.c();
        }
        
        void g() {
            final c[] g = this.G;
            int newValue;
            for (int length = g.length, i = 0; i < length; i = newValue) {
                if (this.Q) {
                    return;
                }
                final AtomicInteger r = this.R;
                newValue = i + 1;
                r.lazySet(newValue);
                g[i].z((d)new h.a.a(i, length));
            }
        }
        
        public void m(final T t) {
            if (this.T == 0 && !this.M.offer(t)) {
                this.L.cancel();
                this.b(new io.reactivex.exceptions.c("Queue is full?"));
                return;
            }
            this.c();
        }
        
        @Override
        public void z(final d l) {
            if (j.o(this.L, l)) {
                this.L = l;
                if (l instanceof l) {
                    final l i = (l)l;
                    final int e = i.E(7);
                    if (e == 1) {
                        this.T = e;
                        this.M = (o<T>)i;
                        this.O = true;
                        this.g();
                        this.c();
                        return;
                    }
                    if (e == 2) {
                        this.T = e;
                        this.M = (o<T>)i;
                        this.g();
                        l.v((long)this.J);
                        return;
                    }
                }
                this.M = new io.reactivex.internal.queue.b<T>(this.J);
                this.g();
                l.v((long)this.J);
            }
        }
        
        final class a implements d
        {
            final int G;
            final int H;
            
            a(final int g, final int h) {
                this.G = g;
                this.H = h;
            }
            
            public void cancel() {
                if (h.a.this.H.compareAndSet(this.G + this.H, 0L, 1L)) {
                    final h.a i = h.a.this;
                    final int h = this.H;
                    i.a(h + h);
                }
            }
            
            public void v(final long n) {
                if (j.m(n)) {
                    final AtomicLongArray h = io.reactivex.internal.operators.parallel.h.a.this.H;
                    long value;
                    do {
                        value = h.get(this.G);
                        if (value == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!h.compareAndSet(this.G, value, io.reactivex.internal.util.d.c(value, n)));
                    if (io.reactivex.internal.operators.parallel.h.a.this.R.get() == this.H) {
                        io.reactivex.internal.operators.parallel.h.a.this.c();
                    }
                }
            }
        }
    }
}
