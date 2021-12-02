// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import io.reactivex.annotations.g;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import io.reactivex.l;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class h<T> extends c<T>
{
    final io.reactivex.internal.queue.c<T> H;
    final AtomicReference<Runnable> I;
    final boolean J;
    volatile boolean K;
    Throwable L;
    final AtomicReference<o7.c<? super T>> M;
    volatile boolean N;
    final AtomicBoolean O;
    final io.reactivex.internal.subscriptions.c<T> P;
    final AtomicLong Q;
    boolean R;
    
    h(final int n) {
        this(n, null, true);
    }
    
    h(final int n, final Runnable runnable) {
        this(n, runnable, true);
    }
    
    h(final int n, final Runnable initialValue, final boolean j) {
        this.H = new io.reactivex.internal.queue.c<T>(b.h(n, "capacityHint"));
        this.I = new AtomicReference<Runnable>(initialValue);
        this.J = j;
        this.M = new AtomicReference<o7.c<? super T>>();
        this.O = new AtomicBoolean();
        this.P = new a();
        this.Q = new AtomicLong();
    }
    
    @d
    @f
    public static <T> h<T> V8() {
        return new h<T>(l.b0());
    }
    
    @d
    @f
    public static <T> h<T> W8(final int n) {
        return new h<T>(n);
    }
    
    @d
    @f
    public static <T> h<T> X8(final int n, final Runnable runnable) {
        b.g(runnable, "onTerminate");
        return new h<T>(n, runnable);
    }
    
    @d
    @f
    public static <T> h<T> Y8(final int n, final Runnable runnable, final boolean b) {
        b.g(runnable, "onTerminate");
        return new h<T>(n, runnable, b);
    }
    
    @d
    @f
    public static <T> h<T> Z8(final boolean b) {
        return new h<T>(l.b0(), null, b);
    }
    
    @g
    @Override
    public Throwable P8() {
        if (this.K) {
            return this.L;
        }
        return null;
    }
    
    @Override
    public boolean Q8() {
        return this.K && this.L == null;
    }
    
    @Override
    public boolean R8() {
        return this.M.get() != null;
    }
    
    @Override
    public boolean S8() {
        return this.K && this.L != null;
    }
    
    boolean U8(final boolean b, final boolean b2, final boolean b3, final o7.c<? super T> c, final io.reactivex.internal.queue.c<T> c2) {
        if (this.N) {
            c2.clear();
            this.M.lazySet(null);
            return true;
        }
        if (b2) {
            if (b && this.L != null) {
                c2.clear();
                this.M.lazySet(null);
                c.b(this.L);
                return true;
            }
            if (b3) {
                final Throwable l = this.L;
                this.M.lazySet(null);
                if (l != null) {
                    c.b(l);
                }
                else {
                    c.f();
                }
                return true;
            }
        }
        return false;
    }
    
    void a9() {
        final Runnable runnable = this.I.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
    
    public void b(final Throwable l) {
        b.g(l, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.K && !this.N) {
            this.L = l;
            this.K = true;
            this.a9();
            this.b9();
            return;
        }
        io.reactivex.plugins.a.Y(l);
    }
    
    void b9() {
        if (this.P.getAndIncrement() != 0) {
            return;
        }
        int addAndGet = 1;
        do {
            final o7.c<? super T> c = this.M.get();
            if (c != null) {
                if (this.R) {
                    this.c9(c);
                }
                else {
                    this.d9(c);
                }
            }
        } while ((addAndGet = this.P.addAndGet(-addAndGet)) != 0);
    }
    
    void c9(final o7.c<? super T> c) {
        final io.reactivex.internal.queue.c<T> h = this.H;
        final boolean j = this.J;
        int addAndGet = 1;
        while (!this.N) {
            final boolean k = this.K;
            if ((j ^ true) && k && this.L != null) {
                h.clear();
                this.M.lazySet(null);
                c.b(this.L);
                return;
            }
            c.m((Object)null);
            if (k) {
                this.M.lazySet(null);
                final Throwable l = this.L;
                if (l != null) {
                    c.b(l);
                }
                else {
                    c.f();
                }
                return;
            }
            if ((addAndGet = this.P.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
        h.clear();
        this.M.lazySet(null);
    }
    
    void d9(final o7.c<? super T> c) {
        final io.reactivex.internal.queue.c<T> h = this.H;
        final boolean b = this.J ^ true;
        int addAndGet = 1;
        while (true) {
            final long value = this.Q.get();
            long n = 0L;
            long n2;
            while (true) {
                n2 = lcmp(value, n);
                if (n2 == 0) {
                    break;
                }
                final boolean k = this.K;
                final T poll = h.poll();
                final boolean b2 = poll == null;
                if (this.U8(b, k, b2, c, h)) {
                    return;
                }
                if (b2) {
                    break;
                }
                c.m((Object)poll);
                ++n;
            }
            if (n2 == 0 && this.U8(b, this.K, h.isEmpty(), c, h)) {
                return;
            }
            if (n != 0L && value != Long.MAX_VALUE) {
                this.Q.addAndGet(-n);
            }
            addAndGet = this.P.addAndGet(-addAndGet);
            if (addAndGet == 0) {
                return;
            }
        }
    }
    
    public void f() {
        if (!this.K) {
            if (!this.N) {
                this.K = true;
                this.a9();
                this.b9();
            }
        }
    }
    
    public void m(final T t) {
        b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.K) {
            if (!this.N) {
                this.H.offer(t);
                this.b9();
            }
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> newValue) {
        if (!this.O.get() && this.O.compareAndSet(false, true)) {
            newValue.z((o7.d)this.P);
            this.M.set(newValue);
            if (this.N) {
                this.M.lazySet(null);
            }
            else {
                this.b9();
            }
        }
        else {
            io.reactivex.internal.subscriptions.g.d(new IllegalStateException("This processor allows only a single Subscriber"), newValue);
        }
    }
    
    public void z(final o7.d d) {
        if (!this.K && !this.N) {
            d.v(Long.MAX_VALUE);
        }
        else {
            d.cancel();
        }
    }
    
    final class a extends io.reactivex.internal.subscriptions.c<T>
    {
        private static final long I = -4896760517184205454L;
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                h.this.R = true;
                return 2;
            }
            return 0;
        }
        
        public void cancel() {
            if (h.this.N) {
                return;
            }
            h.this.N = true;
            h.this.a9();
            final h h = io.reactivex.processors.h.this;
            if (!h.R && h.P.getAndIncrement() == 0) {
                io.reactivex.processors.h.this.H.clear();
                io.reactivex.processors.h.this.M.lazySet(null);
            }
        }
        
        public void clear() {
            h.this.H.clear();
        }
        
        public boolean isEmpty() {
            return h.this.H.isEmpty();
        }
        
        @g
        public T poll() {
            return h.this.H.poll();
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(h.this.Q, n);
                h.this.b9();
            }
        }
    }
}
