// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.plugins.a;
import io.reactivex.internal.subscriptions.j;
import y5.n;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import o7.d;
import o7.c;
import io.reactivex.parallel.b;
import io.reactivex.l;

public final class i<T> extends l<T>
{
    final io.reactivex.parallel.b<? extends T> H;
    final int I;
    final boolean J;
    
    public i(final io.reactivex.parallel.b<? extends T> h, final int i, final boolean j) {
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        AtomicInteger atomicInteger;
        if (this.J) {
            atomicInteger = new d<Object>(c, this.H.F(), this.I);
        }
        else {
            atomicInteger = new b<Object>(c, this.H.F(), this.I);
        }
        c.z((o7.d)atomicInteger);
        this.H.Q((o7.c[])((c)atomicInteger).H);
    }
    
    static final class a<T> extends AtomicReference<o7.d> implements q<T>
    {
        private static final long L = 8410034718427740355L;
        final c<T> G;
        final int H;
        final int I;
        long J;
        volatile n<T> K;
        
        a(final c<T> g, final int h) {
            this.G = g;
            this.H = h;
            this.I = h - (h >> 2);
        }
        
        public boolean a() {
            return j.b(this);
        }
        
        public void b(final Throwable t) {
            this.G.e(t);
        }
        
        n<T> c() {
            n<T> k;
            if ((k = this.K) == null) {
                k = new io.reactivex.internal.queue.b<T>(this.H);
                this.K = k;
            }
            return k;
        }
        
        public void d(long j) {
            j += this.J;
            if (j >= this.I) {
                this.J = 0L;
                this.get().v(j);
            }
            else {
                this.J = j;
            }
        }
        
        public void e() {
            final long j = this.J + 1L;
            if (j == this.I) {
                this.J = 0L;
                this.get().v(j);
            }
            else {
                this.J = j;
            }
        }
        
        public void f() {
            this.G.d();
        }
        
        public void m(final T t) {
            this.G.f(this, t);
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, this.H);
        }
    }
    
    static final class b<T> extends c<T>
    {
        private static final long N = 6312374661811000451L;
        
        b(final o7.c<? super T> c, final int n, final int n2) {
            super(c, n, n2);
        }
        
        @Override
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            this.g();
        }
        
        public void d() {
            super.L.decrementAndGet();
            this.c();
        }
        
        public void e(final Throwable newValue) {
            if (super.I.compareAndSet(null, newValue)) {
                this.a();
                this.c();
            }
            else if (newValue != super.I.get()) {
                io.reactivex.plugins.a.Y(newValue);
            }
        }
        
        public void f(final a<T> a, final T t) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                if (super.J.get() != 0L) {
                    super.G.m((Object)t);
                    if (super.J.get() != Long.MAX_VALUE) {
                        super.J.decrementAndGet();
                    }
                    a.d(1L);
                }
                else if (!a.c().offer(t)) {
                    this.a();
                    final io.reactivex.exceptions.c newValue = new io.reactivex.exceptions.c("Queue full?!");
                    if (super.I.compareAndSet(null, newValue)) {
                        super.G.b((Throwable)newValue);
                    }
                    else {
                        a.Y(newValue);
                    }
                    return;
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                if (!a.c().offer(t)) {
                    this.a();
                    this.e(new io.reactivex.exceptions.c("Queue full?!"));
                    return;
                }
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.g();
        }
        
        void g() {
            final a<T>[] h = (a<T>[])super.H;
            final int length = h.length;
            final o7.c<? super T> g = (o7.c<? super T>)super.G;
            int n = 1;
            while (true) {
                final long value = super.J.get();
                long n2 = 0L;
                int i;
                long n3 = 0L;
            Label_0243:
                do {
                    n3 = n2;
                    if (n2 == value) {
                        break;
                    }
                    if (super.K) {
                        this.b();
                        return;
                    }
                    final Throwable t = super.I.get();
                    if (t != null) {
                        this.b();
                        g.b(t);
                        return;
                    }
                    final boolean b = super.L.get() == 0;
                    int j = 0;
                    i = 1;
                    n3 = n2;
                    while (j < h.length) {
                        final a<T> a = h[j];
                        final n<T> k = (n<T>)a.K;
                        long n4 = n3;
                        int n5 = i;
                        if (k != null) {
                            final T poll = k.poll();
                            n4 = n3;
                            n5 = i;
                            if (poll != null) {
                                g.m((Object)poll);
                                a.e();
                                n4 = n3 + 1L;
                                if (n4 == value) {
                                    n3 = n4;
                                    break Label_0243;
                                }
                                n5 = 0;
                            }
                        }
                        ++j;
                        n3 = n4;
                        i = n5;
                    }
                    if (b && i != 0) {
                        g.f();
                        return;
                    }
                    n2 = n3;
                } while (i == 0);
                Label_0377: {
                    if (n3 == value) {
                        if (super.K) {
                            this.b();
                            return;
                        }
                        final Throwable t2 = super.I.get();
                        if (t2 != null) {
                            this.b();
                            g.b(t2);
                            return;
                        }
                        final boolean b2 = super.L.get() == 0;
                        int l = 0;
                        while (true) {
                            while (l < length) {
                                final n<T> m = h[l].K;
                                if (m != null && !m.isEmpty()) {
                                    final boolean b3 = false;
                                    if (b2 && b3) {
                                        g.f();
                                        return;
                                    }
                                    break Label_0377;
                                }
                                else {
                                    ++l;
                                }
                            }
                            final boolean b3 = true;
                            continue;
                        }
                    }
                }
                if (n3 != 0L && value != Long.MAX_VALUE) {
                    super.J.addAndGet(-n3);
                }
                int n6;
                if ((n6 = this.get()) == n && (n6 = this.addAndGet(-n)) == 0) {
                    return;
                }
                n = n6;
            }
        }
    }
    
    abstract static class c<T> extends AtomicInteger implements o7.d
    {
        private static final long M = 3100232009247827843L;
        final o7.c<? super T> G;
        final a<T>[] H;
        final io.reactivex.internal.util.c I;
        final AtomicLong J;
        volatile boolean K;
        final AtomicInteger L;
        
        c(final o7.c<? super T> g, final int newValue, final int n) {
            this.I = new io.reactivex.internal.util.c();
            this.J = new AtomicLong();
            this.L = new AtomicInteger();
            this.G = g;
            final a[] h = new a[newValue];
            for (int i = 0; i < newValue; ++i) {
                h[i] = new a((c<Object>)this, n);
            }
            this.H = (a<T>[])h;
            this.L.lazySet(newValue);
        }
        
        void a() {
            final a<T>[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].a();
            }
        }
        
        void b() {
            final a<T>[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].K = null;
            }
        }
        
        abstract void c();
        
        public void cancel() {
            if (!this.K) {
                this.K = true;
                this.a();
                if (this.getAndIncrement() == 0) {
                    this.b();
                }
            }
        }
        
        abstract void d();
        
        abstract void e(final Throwable p0);
        
        abstract void f(final a<T> p0, final T p1);
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.c();
            }
        }
    }
    
    static final class d<T> extends c<T>
    {
        private static final long N = -5737965195918321883L;
        
        d(final o7.c<? super T> c, final int n, final int n2) {
            super(c, n, n2);
        }
        
        @Override
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            this.g();
        }
        
        @Override
        void d() {
            super.L.decrementAndGet();
            this.c();
        }
        
        @Override
        void e(final Throwable t) {
            super.I.a(t);
            super.L.decrementAndGet();
            this.c();
        }
        
        @Override
        void f(final a<T> a, final T t) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                if (super.J.get() != 0L) {
                    super.G.m((Object)t);
                    if (super.J.get() != Long.MAX_VALUE) {
                        super.J.decrementAndGet();
                    }
                    a.d(1L);
                }
                else if (!a.c().offer(t)) {
                    a.a();
                    super.I.a(new io.reactivex.exceptions.c("Queue full?!"));
                    super.L.decrementAndGet();
                    this.g();
                    return;
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                if (!a.c().offer(t) && a.a()) {
                    super.I.a(new io.reactivex.exceptions.c("Queue full?!"));
                    super.L.decrementAndGet();
                }
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.g();
        }
        
        void g() {
            final a<T>[] h = (a<T>[])super.H;
            final int length = h.length;
            final o7.c<? super T> g = (o7.c<? super T>)super.G;
            int n = 1;
            while (true) {
                final long value = super.J.get();
                long n2 = 0L;
                int i;
                long n3 = 0L;
            Label_0241:
                do {
                    n3 = n2;
                    if (n2 == value) {
                        break;
                    }
                    if (super.K) {
                        this.b();
                        return;
                    }
                    final boolean b = super.L.get() == 0;
                    int j = 0;
                    i = 1;
                    n3 = n2;
                    while (j < length) {
                        final a<T> a = h[j];
                        final n<T> k = (n<T>)a.K;
                        long n4 = n3;
                        int n5 = i;
                        if (k != null) {
                            final T poll = k.poll();
                            n4 = n3;
                            n5 = i;
                            if (poll != null) {
                                g.m((Object)poll);
                                a.e();
                                ++n3;
                                if (n3 == value) {
                                    break Label_0241;
                                }
                                n5 = 0;
                                n4 = n3;
                            }
                        }
                        ++j;
                        n3 = n4;
                        i = n5;
                    }
                    if (b && i != 0) {
                        if (super.I.get() != null) {
                            g.b(super.I.c());
                        }
                        else {
                            g.f();
                        }
                        return;
                    }
                    n2 = n3;
                } while (i == 0);
                Label_0374: {
                    if (n3 == value) {
                        if (super.K) {
                            this.b();
                            return;
                        }
                        final boolean b2 = super.L.get() == 0;
                        int l = 0;
                        while (true) {
                            while (l < length) {
                                final n<T> m = h[l].K;
                                if (m != null && !m.isEmpty()) {
                                    final boolean b3 = false;
                                    if (b2 && b3) {
                                        if (super.I.get() != null) {
                                            g.b(super.I.c());
                                        }
                                        else {
                                            g.f();
                                        }
                                        return;
                                    }
                                    break Label_0374;
                                }
                                else {
                                    ++l;
                                }
                            }
                            final boolean b3 = true;
                            continue;
                        }
                    }
                }
                if (n3 != 0L && value != Long.MAX_VALUE) {
                    super.J.addAndGet(-n3);
                }
                int n6;
                if ((n6 = this.get()) == n && (n6 = this.addAndGet(-n)) == 0) {
                    return;
                }
                n = n6;
            }
        }
    }
}
