// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.g0;
import io.reactivex.b0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.i0;

public final class r<T> extends io.reactivex.internal.operators.observable.a<T, T> implements i0<T>
{
    static final a[] Q;
    static final a[] R;
    final AtomicBoolean H;
    final int I;
    final AtomicReference<a<T>[]> J;
    volatile long K;
    final b<T> L;
    b<T> M;
    int N;
    Throwable O;
    volatile boolean P;
    
    static {
        Q = new a[0];
        R = new a[0];
    }
    
    public r(final b0<T> b0, final int i) {
        super(b0);
        this.I = i;
        this.H = new AtomicBoolean();
        final b<T> b2 = new b<T>(i);
        this.L = b2;
        this.M = b2;
        this.J = new AtomicReference<a<T>[]>(r.Q);
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<T> a = new a<T>(i0, this);
        i0.l(a);
        this.l8(a);
        if (!this.H.get() && this.H.compareAndSet(false, true)) {
            super.G.c(this);
        }
        else {
            this.q8(a);
        }
    }
    
    @Override
    public void b(final Throwable o) {
        this.O = o;
        this.P = true;
        final a<T>[] array = this.J.getAndSet(r.R);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.q8(array[i]);
        }
    }
    
    @Override
    public void f() {
        this.P = true;
        final a<T>[] array = this.J.getAndSet(r.R);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.q8(array[i]);
        }
    }
    
    @Override
    public void l(final c c) {
    }
    
    void l8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.J.get();
            if (expectedValue == r.R) {
                return;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.J.compareAndSet(expectedValue, newValue));
    }
    
    @Override
    public void m(final T t) {
        final int n = this.N;
        final int i = this.I;
        int j = 0;
        if (n == i) {
            final b b = new b<T>(n);
            b.a[0] = (T)t;
            this.N = 1;
            this.M.b = (b<T>)b;
            this.M = (b<T>)b;
        }
        else {
            this.M.a[n] = t;
            this.N = n + 1;
        }
        ++this.K;
        for (a<T>[] array = this.J.get(); j < array.length; ++j) {
            this.q8(array[j]);
        }
    }
    
    long m8() {
        return this.K;
    }
    
    boolean n8() {
        return this.J.get().length != 0;
    }
    
    boolean o8() {
        return this.H.get();
    }
    
    void p8(final a<T> a) {
        a<T>[] expectedValue;
        a[] q;
        do {
            expectedValue = this.J.get();
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
                q = r.Q;
            }
            else {
                q = new a[length - 1];
                System.arraycopy(expectedValue, 0, q, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, q, n3, length - n3 - 1);
            }
        } while (!this.J.compareAndSet(expectedValue, q));
    }
    
    void q8(final a<T> a) {
        if (a.getAndIncrement() != 0) {
            return;
        }
        long k = a.K;
        int j = a.J;
        b<T> i = a.I;
        final i0<? super T> g = a.G;
        final int l = this.I;
        int addAndGet = 1;
        while (!a.L) {
            final boolean p = this.P;
            final boolean b = this.K == k;
            if (p && b) {
                a.I = null;
                final Throwable o = this.O;
                if (o != null) {
                    g.b(o);
                }
                else {
                    g.f();
                }
                return;
            }
            if (!b) {
                int n = j;
                b b2 = (b)i;
                if (j == l) {
                    b2 = i.b;
                    n = 0;
                }
                g.m(b2.a[n]);
                j = n + 1;
                ++k;
                i = (b<T>)b2;
            }
            else {
                a.K = k;
                a.J = j;
                a.I = i;
                if ((addAndGet = a.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
        }
        a.I = null;
    }
    
    static final class a<T> extends AtomicInteger implements c
    {
        private static final long M = 6770240836423125754L;
        final i0<? super T> G;
        final r<T> H;
        b<T> I;
        int J;
        long K;
        volatile boolean L;
        
        a(final i0<? super T> g, final r<T> h) {
            this.G = g;
            this.H = h;
            this.I = h.L;
        }
        
        @Override
        public void dispose() {
            if (!this.L) {
                this.L = true;
                this.H.p8(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.L;
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
