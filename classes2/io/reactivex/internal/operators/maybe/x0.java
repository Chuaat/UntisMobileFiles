// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import y5.o;
import java.util.concurrent.atomic.AtomicReferenceArray;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.q;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.disposables.b;
import io.reactivex.annotations.g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.io.Serializable;
import io.reactivex.v;
import o7.d;
import o7.c;
import io.reactivex.y;
import io.reactivex.l;

public final class x0<T> extends l<T>
{
    final y<? extends T>[] H;
    
    public x0(final y<? extends T>[] h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final y<? extends T>[] h = this.H;
        final int length = h.length;
        Serializable s;
        if (length <= l.b0()) {
            s = new c<Object>(length);
        }
        else {
            s = new a<Object>();
        }
        final b b = new b<Object>((o7.c<? super Object>)c, length, (d<Object>)s);
        c.z((o7.d)b);
        final io.reactivex.internal.util.c l = b.L;
        for (final y<? extends T> y : h) {
            if (b.j()) {
                break;
            }
            if (l.get() != null) {
                break;
            }
            y.c((v<? super T>)b);
        }
    }
    
    static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T>
    {
        private static final long I = -4025173261791142821L;
        int G;
        final AtomicInteger H;
        
        a() {
            this.H = new AtomicInteger();
        }
        
        @Override
        public int h() {
            return this.H.get();
        }
        
        @Override
        public void k() {
            this.poll();
        }
        
        @Override
        public int o() {
            return this.G;
        }
        
        @Override
        public boolean offer(final T e) {
            this.H.getAndIncrement();
            return super.offer(e);
        }
        
        @Override
        public boolean p(final T t, final T t2) {
            throw new UnsupportedOperationException();
        }
        
        @g
        @Override
        public T poll() {
            final T poll = super.poll();
            if (poll != null) {
                ++this.G;
            }
            return poll;
        }
    }
    
    static final class b<T> extends io.reactivex.internal.subscriptions.c<T> implements v<T>
    {
        private static final long Q = -660395290758764731L;
        final c<? super T> H;
        final io.reactivex.disposables.b I;
        final AtomicLong J;
        final d<Object> K;
        final io.reactivex.internal.util.c L;
        final int M;
        volatile boolean N;
        boolean O;
        long P;
        
        b(final c<? super T> h, final int m, final d<Object> k) {
            this.H = h;
            this.M = m;
            this.I = new io.reactivex.disposables.b();
            this.J = new AtomicLong();
            this.L = new io.reactivex.internal.util.c();
            this.K = k;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.O = true;
                return 2;
            }
            return 0;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.L.a(t)) {
                this.I.dispose();
                this.K.offer(q.G);
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            if (this.O) {
                this.g();
            }
            else {
                this.i();
            }
        }
        
        public void cancel() {
            if (!this.N) {
                this.N = true;
                this.I.dispose();
                if (this.getAndIncrement() == 0) {
                    this.K.clear();
                }
            }
        }
        
        public void clear() {
            this.K.clear();
        }
        
        @Override
        public void d(final T t) {
            this.K.offer(t);
            this.c();
        }
        
        @Override
        public void f() {
            this.K.offer(q.G);
            this.c();
        }
        
        void g() {
            final c<? super T> h = this.H;
            final d<Object> k = this.K;
            int addAndGet = 1;
            while (!this.N) {
                final Throwable t = this.L.get();
                if (t != null) {
                    k.clear();
                    h.b(t);
                    return;
                }
                final boolean b = k.h() == this.M;
                if (!k.isEmpty()) {
                    h.m((Object)null);
                }
                if (b) {
                    h.f();
                    return;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            k.clear();
        }
        
        void i() {
            final c<? super T> h = this.H;
            final d<Object> k = this.K;
            long p = this.P;
            int addAndGet = 1;
            do {
                final long value = this.J.get();
                Label_0065: {
                    long n;
                    while (true) {
                        n = lcmp(p, value);
                        if (n == 0) {
                            break;
                        }
                        if (this.N) {
                            k.clear();
                            return;
                        }
                        if (this.L.get() != null) {
                            break Label_0065;
                        }
                        if (k.o() == this.M) {
                            h.f();
                            return;
                        }
                        final q poll = k.poll();
                        if (poll == null) {
                            break;
                        }
                        if (poll == q.G) {
                            continue;
                        }
                        h.m((Object)poll);
                        ++p;
                    }
                    if (n == 0) {
                        if (this.L.get() != null) {
                            break Label_0065;
                        }
                        while (k.peek() == q.G) {
                            k.k();
                        }
                        if (k.o() == this.M) {
                            h.f();
                            return;
                        }
                    }
                    this.P = p;
                    continue;
                }
                k.clear();
                h.b(this.L.c());
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public boolean isEmpty() {
            return this.K.isEmpty();
        }
        
        boolean j() {
            return this.N;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.I.b(c);
        }
        
        @g
        public T poll() throws Exception {
            q poll;
            do {
                poll = this.K.poll();
            } while (poll == q.G);
            return (T)poll;
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.c();
            }
        }
    }
    
    static final class c<T> extends AtomicReferenceArray<T> implements d<T>
    {
        private static final long I = -7969063454040569579L;
        final AtomicInteger G;
        int H;
        
        c(final int length) {
            super(length);
            this.G = new AtomicInteger();
        }
        
        @Override
        public void clear() {
            while (this.poll() != null && !this.isEmpty()) {}
        }
        
        @Override
        public int h() {
            return this.G.get();
        }
        
        @Override
        public boolean isEmpty() {
            return this.H == this.h();
        }
        
        @Override
        public void k() {
            final int h = this.H;
            this.lazySet(h, null);
            this.H = h + 1;
        }
        
        @Override
        public int o() {
            return this.H;
        }
        
        @Override
        public boolean offer(final T newValue) {
            io.reactivex.internal.functions.b.g(newValue, "value is null");
            final int andIncrement = this.G.getAndIncrement();
            if (andIncrement < this.length()) {
                this.lazySet(andIncrement, newValue);
                return true;
            }
            return false;
        }
        
        @Override
        public boolean p(final T t, final T t2) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public T peek() {
            final int h = this.H;
            if (h == this.length()) {
                return null;
            }
            return this.get(h);
        }
        
        @g
        @Override
        public T poll() {
            final int h = this.H;
            if (h == this.length()) {
                return null;
            }
            do {
                final T value = this.get(h);
                if (value != null) {
                    this.H = h + 1;
                    this.lazySet(h, null);
                    return value;
                }
            } while (this.G.get() != h);
            return null;
        }
    }
    
    interface d<T> extends o<T>
    {
        int h();
        
        void k();
        
        int o();
        
        T peek();
        
        @g
        T poll();
    }
}
