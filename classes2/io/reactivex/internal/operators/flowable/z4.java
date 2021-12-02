// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import o7.d;
import io.reactivex.internal.subscriptions.g;
import o7.c;
import x5.o;
import o7.b;
import org.reactivestreams.Publisher;
import io.reactivex.l;

public final class z4<T, R> extends l<R>
{
    final Publisher<? extends T>[] H;
    final Iterable<? extends o7.b<? extends T>> I;
    final o<? super Object[], ? extends R> J;
    final int K;
    final boolean L;
    
    public z4(final Publisher<? extends T>[] h, final Iterable<? extends o7.b<? extends T>> i, final o<? super Object[], ? extends R> j, final int k, final boolean l) {
        this.H = (o7.b[])h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    public void n6(final c<? super R> c) {
        o7.b[] h = this.H;
        int length;
        if (h == null) {
            o7.b[] array = new o7.b[8];
            final Iterator<? extends o7.b<? extends T>> iterator = this.I.iterator();
            int n = 0;
            while (true) {
                h = array;
                length = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final o7.b b = (o7.b)iterator.next();
                o7.b[] array2 = array;
                if (n == array.length) {
                    array2 = new o7.b[(n >> 2) + n];
                    System.arraycopy(array, 0, array2, 0, n);
                }
                array2[n] = b;
                ++n;
                array = array2;
            }
        }
        else {
            length = h.length;
        }
        if (length == 0) {
            g.b(c);
            return;
        }
        final a a = new a((o7.c<? super Object>)c, this.J, length, this.K, this.L);
        c.z((d)a);
        a.d(h, length);
    }
    
    static final class a<T, R> extends AtomicInteger implements d
    {
        private static final long O = -2434867452883857743L;
        final c<? super R> G;
        final b<T, R>[] H;
        final o<? super Object[], ? extends R> I;
        final AtomicLong J;
        final io.reactivex.internal.util.c K;
        final boolean L;
        volatile boolean M;
        final Object[] N;
        
        a(final c<? super R> g, final o<? super Object[], ? extends R> i, final int n, final int n2, final boolean l) {
            this.G = g;
            this.I = i;
            this.L = l;
            final b[] h = new b[n];
            for (int j = 0; j < n; ++j) {
                h[j] = new b((a<Object, Object>)this, n2);
            }
            this.N = new Object[n];
            this.H = (b<T, R>[])h;
            this.J = new AtomicLong();
            this.K = new io.reactivex.internal.util.c();
        }
        
        void a() {
            final b<T, R>[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].cancel();
            }
        }
        
        void b() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super R> g = this.G;
            final b<T, R>[] h = this.H;
            final int length = h.length;
            final Object[] n = this.N;
            int addAndGet = 1;
            do {
                final long value = this.J.get();
                long n2 = 0L;
                Label_0083: {
                    Label_0079: {
                        long n3;
                        while (true) {
                            n3 = lcmp(value, n2);
                            if (n3 == 0) {
                                break;
                            }
                            if (this.M) {
                                return;
                            }
                            if (!this.L && this.K.get() != null) {
                                break Label_0079;
                            }
                            int n4 = 0;
                            int n5;
                            for (int i = 0; i < length; ++i, n4 = n5) {
                                final b<T, R> b = h[i];
                                n5 = n4;
                                if (n[i] == null) {
                                    try {
                                        final boolean l = b.L;
                                        final y5.o<T> j = b.J;
                                        Object poll;
                                        if (j != null) {
                                            poll = j.poll();
                                        }
                                        else {
                                            poll = null;
                                        }
                                        if (poll == null) {
                                            n5 = 1;
                                        }
                                        else {
                                            n5 = 0;
                                        }
                                        if (l && n5 != 0) {
                                            this.a();
                                            if (this.K.get() != null) {
                                                g.b(this.K.c());
                                            }
                                            else {
                                                g.f();
                                            }
                                            return;
                                        }
                                        if (n5 == 0) {
                                            n[i] = poll;
                                            n5 = n4;
                                            continue;
                                        }
                                    }
                                    finally {
                                        final Throwable t;
                                        io.reactivex.exceptions.b.b(t);
                                        this.K.a(t);
                                        if (!this.L) {
                                            break Label_0079;
                                        }
                                    }
                                    n5 = 1;
                                }
                            }
                            if (n4 != 0) {
                                break;
                            }
                            try {
                                g.m(io.reactivex.internal.functions.b.g((Object)this.I.apply(n.clone()), "The zipper returned a null value"));
                                ++n2;
                                Arrays.fill(n, null);
                                continue;
                            }
                            finally {
                                final Throwable t2;
                                io.reactivex.exceptions.b.b(t2);
                                this.a();
                                this.K.a(t2);
                                break Label_0083;
                            }
                            break;
                        }
                        if (n3 == 0) {
                            if (this.M) {
                                return;
                            }
                            if (!this.L && this.K.get() != null) {
                                break Label_0079;
                            }
                            for (int k = 0; k < length; ++k) {
                                final b<T, R> b2 = h[k];
                                if (n[k] == null) {
                                    try {
                                        final boolean m = b2.L;
                                        final y5.o<T> j2 = b2.J;
                                        Object poll2;
                                        if (j2 != null) {
                                            poll2 = j2.poll();
                                        }
                                        else {
                                            poll2 = null;
                                        }
                                        final boolean b3 = poll2 == null;
                                        if (m && b3) {
                                            this.a();
                                            if (this.K.get() != null) {
                                                g.b(this.K.c());
                                            }
                                            else {
                                                g.f();
                                            }
                                            return;
                                        }
                                        if (!b3) {
                                            n[k] = poll2;
                                        }
                                    }
                                    finally {
                                        final Throwable t3;
                                        io.reactivex.exceptions.b.b(t3);
                                        this.K.a(t3);
                                        if (!this.L) {
                                            break Label_0079;
                                        }
                                    }
                                }
                            }
                        }
                        if (n2 == 0L) {
                            continue;
                        }
                        for (int length2 = h.length, n6 = 0; n6 < length2; ++n6) {
                            h[n6].v(n2);
                        }
                        if (value != Long.MAX_VALUE) {
                            this.J.addAndGet(-n2);
                            continue;
                        }
                        continue;
                    }
                    this.a();
                }
                g.b(this.K.c());
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        void c(final b<T, R> b, final Throwable t) {
            if (this.K.a(t)) {
                b.L = true;
                this.b();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            if (!this.M) {
                this.M = true;
                this.a();
            }
        }
        
        void d(final Publisher<? extends T>[] array, final int n) {
            final b<T, R>[] h = this.H;
            for (int n2 = 0; n2 < n && !this.M && (this.L || this.K.get() == null); ++n2) {
                ((o7.b)array[n2]).e((c)h[n2]);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.b();
            }
        }
    }
    
    static final class b<T, R> extends AtomicReference<d> implements q<T>, d
    {
        private static final long N = -4627193790118206028L;
        final a<T, R> G;
        final int H;
        final int I;
        y5.o<T> J;
        long K;
        volatile boolean L;
        int M;
        
        b(final a<T, R> g, final int h) {
            this.G = g;
            this.H = h;
            this.I = h - (h >> 2);
        }
        
        public void b(final Throwable t) {
            this.G.c(this, t);
        }
        
        public void cancel() {
            j.b(this);
        }
        
        public void f() {
            this.L = true;
            this.G.b();
        }
        
        public void m(final T t) {
            if (this.M != 2) {
                this.J.offer(t);
            }
            this.G.b();
        }
        
        public void v(long k) {
            if (this.M != 1) {
                k += this.K;
                if (k >= this.I) {
                    this.K = 0L;
                    this.get().v(k);
                }
                else {
                    this.K = k;
                }
            }
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this, d)) {
                if (d instanceof y5.l) {
                    final y5.l l = (y5.l)d;
                    final int e = l.E(7);
                    if (e == 1) {
                        this.M = e;
                        this.J = (y5.o<T>)l;
                        this.L = true;
                        this.G.b();
                        return;
                    }
                    if (e == 2) {
                        this.M = e;
                        this.J = (y5.o<T>)l;
                        d.v((long)this.H);
                        return;
                    }
                }
                this.J = new io.reactivex.internal.queue.b<T>(this.H);
                d.v((long)this.H);
            }
        }
    }
}
