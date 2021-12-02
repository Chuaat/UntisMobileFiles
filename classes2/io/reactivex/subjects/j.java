// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.annotations.g;
import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.e;
import y5.o;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import io.reactivex.b0;
import io.reactivex.internal.observers.b;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.c;

public final class j<T> extends i<T>
{
    final c<T> G;
    final AtomicReference<i0<? super T>> H;
    final AtomicReference<Runnable> I;
    final boolean J;
    volatile boolean K;
    volatile boolean L;
    Throwable M;
    final AtomicBoolean N;
    final b<T> O;
    boolean P;
    
    j(final int n, final Runnable runnable) {
        this(n, runnable, true);
    }
    
    j(final int n, final Runnable runnable, final boolean j) {
        this.G = new c<T>(io.reactivex.internal.functions.b.h(n, "capacityHint"));
        this.I = new AtomicReference<Runnable>(io.reactivex.internal.functions.b.g(runnable, "onTerminate"));
        this.J = j;
        this.H = new AtomicReference<i0<? super T>>();
        this.N = new AtomicBoolean();
        this.O = new a();
    }
    
    j(final int n, final boolean j) {
        this.G = new c<T>(io.reactivex.internal.functions.b.h(n, "capacityHint"));
        this.I = new AtomicReference<Runnable>();
        this.J = j;
        this.H = new AtomicReference<i0<? super T>>();
        this.N = new AtomicBoolean();
        this.O = new a();
    }
    
    @d
    @f
    public static <T> j<T> q8() {
        return new j<T>(b0.X(), true);
    }
    
    @d
    @f
    public static <T> j<T> r8(final int n) {
        return new j<T>(n, true);
    }
    
    @d
    @f
    public static <T> j<T> s8(final int n, final Runnable runnable) {
        return new j<T>(n, runnable, true);
    }
    
    @d
    @f
    public static <T> j<T> t8(final int n, final Runnable runnable, final boolean b) {
        return new j<T>(n, runnable, b);
    }
    
    @d
    @f
    public static <T> j<T> u8(final boolean b) {
        return new j<T>(b0.X(), b);
    }
    
    boolean A8(final o<T> o, final i0<? super T> i0) {
        final Throwable m = this.M;
        if (m != null) {
            this.H.lazySet(null);
            o.clear();
            i0.b(m);
            return true;
        }
        return false;
    }
    
    @Override
    protected void L5(final i0<? super T> newValue) {
        if (!this.N.get() && this.N.compareAndSet(false, true)) {
            newValue.l(this.O);
            this.H.lazySet(newValue);
            if (this.K) {
                this.H.lazySet(null);
                return;
            }
            this.w8();
        }
        else {
            e.l(new IllegalStateException("Only a single observer allowed."), newValue);
        }
    }
    
    @Override
    public void b(final Throwable m) {
        io.reactivex.internal.functions.b.g(m, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.L && !this.K) {
            this.M = m;
            this.L = true;
            this.v8();
            this.w8();
            return;
        }
        io.reactivex.plugins.a.Y(m);
    }
    
    @Override
    public void f() {
        if (!this.L) {
            if (!this.K) {
                this.L = true;
                this.v8();
                this.w8();
            }
        }
    }
    
    @Override
    public void l(final io.reactivex.disposables.c c) {
        if (this.L || this.K) {
            c.dispose();
        }
    }
    
    @g
    @Override
    public Throwable l8() {
        if (this.L) {
            return this.M;
        }
        return null;
    }
    
    @Override
    public void m(final T t) {
        io.reactivex.internal.functions.b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.L) {
            if (!this.K) {
                this.G.offer(t);
                this.w8();
            }
        }
    }
    
    @Override
    public boolean m8() {
        return this.L && this.M == null;
    }
    
    @Override
    public boolean n8() {
        return this.H.get() != null;
    }
    
    @Override
    public boolean o8() {
        return this.L && this.M != null;
    }
    
    void v8() {
        final Runnable expectedValue = this.I.get();
        if (expectedValue != null && this.I.compareAndSet(expectedValue, null)) {
            expectedValue.run();
        }
    }
    
    void w8() {
        if (this.O.getAndIncrement() != 0) {
            return;
        }
        i0<? super T> i0 = this.H.get();
        int addAndGet = 1;
        while (i0 == null) {
            addAndGet = this.O.addAndGet(-addAndGet);
            if (addAndGet == 0) {
                return;
            }
            i0 = this.H.get();
        }
        if (this.P) {
            this.x8(i0);
        }
        else {
            this.y8(i0);
        }
    }
    
    void x8(final i0<? super T> i0) {
        final c<T> g = this.G;
        final boolean j = this.J;
        int addAndGet = 1;
        while (!this.K) {
            final boolean l = this.L;
            if ((j ^ true) && l && this.A8(g, i0)) {
                return;
            }
            i0.m((Object)null);
            if (l) {
                this.z8(i0);
                return;
            }
            if ((addAndGet = this.O.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
        this.H.lazySet(null);
        g.clear();
    }
    
    void y8(final i0<? super T> i0) {
        final c<T> g = this.G;
        final boolean j = this.J;
        int n = 1;
        int n2 = 1;
        while (!this.K) {
            final boolean l = this.L;
            final T poll = this.G.poll();
            final boolean b = poll == null;
            int n3 = n;
            if (l) {
                n3 = n;
                if ((j ^ true) && (n3 = n) != 0) {
                    if (this.A8(g, i0)) {
                        return;
                    }
                    n3 = 0;
                }
                if (b) {
                    this.z8(i0);
                    return;
                }
            }
            if (b) {
                final int addAndGet = this.O.addAndGet(-n2);
                n = n3;
                if ((n2 = addAndGet) == 0) {
                    return;
                }
                continue;
            }
            else {
                i0.m(poll);
                n = n3;
            }
        }
        this.H.lazySet(null);
        g.clear();
    }
    
    void z8(final i0<? super T> i0) {
        this.H.lazySet(null);
        final Throwable m = this.M;
        if (m != null) {
            i0.b(m);
        }
        else {
            i0.f();
        }
    }
    
    final class a extends b<T>
    {
        private static final long I = 7926949470189395511L;
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                j.this.P = true;
                return 2;
            }
            return 0;
        }
        
        @Override
        public void clear() {
            j.this.G.clear();
        }
        
        @Override
        public void dispose() {
            if (!j.this.K) {
                j.this.K = true;
                j.this.v8();
                j.this.H.lazySet(null);
                if (j.this.O.getAndIncrement() == 0) {
                    j.this.H.lazySet(null);
                    j.this.G.clear();
                }
            }
        }
        
        @Override
        public boolean i() {
            return j.this.K;
        }
        
        @Override
        public boolean isEmpty() {
            return j.this.G.isEmpty();
        }
        
        @g
        @Override
        public T poll() throws Exception {
            return j.this.G.poll();
        }
    }
}
