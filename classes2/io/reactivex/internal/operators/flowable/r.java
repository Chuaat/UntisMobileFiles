// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicInteger;
import o7.d;
import o7.c;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.q;

public final class r<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements q<T>
{
    static final a[] R;
    static final a[] S;
    final AtomicBoolean I;
    final int J;
    final AtomicReference<a<T>[]> K;
    volatile long L;
    final b<T> M;
    b<T> N;
    int O;
    Throwable P;
    volatile boolean Q;
    
    static {
        R = new a[0];
        S = new a[0];
    }
    
    public r(final l<T> l, final int j) {
        super(l);
        this.J = j;
        this.I = new AtomicBoolean();
        final b<T> b = new b<T>(j);
        this.M = b;
        this.N = b;
        this.K = new AtomicReference<a<T>[]>(r.R);
    }
    
    void P8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.K.get();
            if (expectedValue == r.S) {
                return;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.K.compareAndSet(expectedValue, newValue));
    }
    
    long Q8() {
        return this.L;
    }
    
    boolean R8() {
        return this.K.get().length != 0;
    }
    
    boolean S8() {
        return this.I.get();
    }
    
    void T8(final a<T> a) {
        a<T>[] expectedValue;
        a[] r;
        do {
            expectedValue = this.K.get();
            final int length = expectedValue.length;
            if (length == 0) {
                return;
            }
            final int n = -1;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (expectedValue[n2] == a) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                return;
            }
            if (length == 1) {
                r = io.reactivex.internal.operators.flowable.r.R;
            }
            else {
                r = new a[length - 1];
                System.arraycopy(expectedValue, 0, r, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, r, n3, length - n3 - 1);
            }
        } while (!this.K.compareAndSet(expectedValue, r));
    }
    
    void U8(final a<T> a) {
        if (a.getAndIncrement() != 0) {
            return;
        }
        long l = a.L;
        int k = a.K;
        b<T> j = a.J;
        final AtomicLong i = a.I;
        final o7.c<? super T> g = a.G;
        final int m = this.J;
        int addAndGet = 1;
        while (true) {
            final boolean q = this.Q;
            final boolean b = this.L == l;
            if (q && b) {
                a.J = null;
                final Throwable p = this.P;
                if (p != null) {
                    g.b(p);
                }
                else {
                    g.f();
                }
                return;
            }
            if (!b) {
                final long value = i.get();
                if (value == Long.MIN_VALUE) {
                    a.J = null;
                    return;
                }
                if (value != l) {
                    int n = k;
                    b b2 = (b)j;
                    if (k == m) {
                        b2 = j.b;
                        n = 0;
                    }
                    g.m((Object)b2.a[n]);
                    k = n + 1;
                    ++l;
                    j = (b<T>)b2;
                    continue;
                }
            }
            a.L = l;
            a.K = k;
            a.J = j;
            if ((addAndGet = a.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    public void b(final Throwable p) {
        if (this.Q) {
            io.reactivex.plugins.a.Y(p);
            return;
        }
        this.P = p;
        this.Q = true;
        final a<T>[] array = this.K.getAndSet(r.S);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.U8(array[i]);
        }
    }
    
    public void f() {
        this.Q = true;
        final a<T>[] array = this.K.getAndSet(r.S);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.U8(array[i]);
        }
    }
    
    public void m(final T t) {
        final int o = this.O;
        final int j = this.J;
        int i = 0;
        if (o == j) {
            final b b = new b<T>(o);
            b.a[0] = (T)t;
            this.O = 1;
            this.N.b = (b<T>)b;
            this.N = (b<T>)b;
        }
        else {
            this.N.a[o] = t;
            this.O = o + 1;
        }
        ++this.L;
        for (a<T>[] array = this.K.get(); i < array.length; ++i) {
            this.U8(array[i]);
        }
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c, (r<T>)this);
        c.z((d)a);
        this.P8(a);
        if (!this.I.get() && this.I.compareAndSet(false, true)) {
            super.H.m6(this);
        }
        else {
            this.U8(a);
        }
    }
    
    @Override
    public void z(final d d) {
        d.v(Long.MAX_VALUE);
    }
    
    static final class a<T> extends AtomicInteger implements d
    {
        private static final long M = 6770240836423125754L;
        final c<? super T> G;
        final r<T> H;
        final AtomicLong I;
        b<T> J;
        int K;
        long L;
        
        a(final c<? super T> g, final r<T> h) {
            this.G = g;
            this.H = h;
            this.J = h.M;
            this.I = new AtomicLong();
        }
        
        public void cancel() {
            if (this.I.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.H.T8(this);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.b(this.I, n);
                this.H.U8(this);
            }
        }
    }
    
    static final class b<T>
    {
        final T[] a;
        volatile b<T> b;
        
        b(final int n) {
            this.a = (T[])new Object[n];
        }
    }
}
