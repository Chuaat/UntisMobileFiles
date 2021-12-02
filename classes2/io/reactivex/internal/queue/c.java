// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.queue;

import io.reactivex.annotations.g;
import java.util.Objects;
import io.reactivex.internal.util.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLong;
import y5.n;

public final class c<T> implements n<T>
{
    static final int O;
    private static final Object P;
    final AtomicLong G;
    int H;
    long I;
    final int J;
    AtomicReferenceArray<Object> K;
    final int L;
    AtomicReferenceArray<Object> M;
    final AtomicLong N;
    
    static {
        O = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        P = new Object();
    }
    
    public c(int b) {
        this.G = new AtomicLong();
        this.N = new AtomicLong();
        b = t.b(Math.max(8, b));
        final int n = b - 1;
        final AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<Object>(b + 1);
        this.K = atomicReferenceArray;
        this.J = n;
        this.a(b);
        this.M = atomicReferenceArray;
        this.L = n;
        this.I = n - 1;
        this.u(0L);
    }
    
    private void a(final int n) {
        this.H = Math.min(n / 4, c.O);
    }
    
    private static int b(final int n) {
        return n;
    }
    
    private static int c(final long n, final int n2) {
        return b((int)n & n2);
    }
    
    private long d() {
        return this.N.get();
    }
    
    private long e() {
        return this.G.get();
    }
    
    private long f() {
        return this.N.get();
    }
    
    private static <E> Object g(final AtomicReferenceArray<Object> atomicReferenceArray, final int i) {
        return atomicReferenceArray.get(i);
    }
    
    private AtomicReferenceArray<Object> i(final AtomicReferenceArray<Object> atomicReferenceArray, int b) {
        b = b(b);
        final AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray)g(atomicReferenceArray, b);
        s(atomicReferenceArray, b, null);
        return (AtomicReferenceArray<Object>)atomicReferenceArray2;
    }
    
    private long j() {
        return this.G.get();
    }
    
    private T l(final AtomicReferenceArray<Object> m, final long n, final int n2) {
        this.M = m;
        return (T)g(m, c(n, n2));
    }
    
    private T m(final AtomicReferenceArray<Object> m, final long n, int c) {
        this.M = m;
        c = c(n, c);
        final Object g = g(m, c);
        if (g != null) {
            s(m, c, null);
            this.r(n + 1L);
        }
        return (T)g;
    }
    
    private void n(final AtomicReferenceArray<Object> atomicReferenceArray, final long n, final int n2, final T t, final long n3) {
        final AtomicReferenceArray k = new AtomicReferenceArray(atomicReferenceArray.length());
        this.K = (AtomicReferenceArray<Object>)k;
        this.I = n3 + n - 1L;
        s(k, n2, t);
        this.t(atomicReferenceArray, k);
        s(atomicReferenceArray, n2, c.P);
        this.u(n + 1L);
    }
    
    private void r(final long newValue) {
        this.N.lazySet(newValue);
    }
    
    private static void s(final AtomicReferenceArray<Object> atomicReferenceArray, final int i, final Object newValue) {
        atomicReferenceArray.lazySet(i, newValue);
    }
    
    private void t(final AtomicReferenceArray<Object> atomicReferenceArray, final AtomicReferenceArray<Object> atomicReferenceArray2) {
        s(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }
    
    private void u(final long newValue) {
        this.G.lazySet(newValue);
    }
    
    private boolean v(final AtomicReferenceArray<Object> atomicReferenceArray, final T t, final long n, final int n2) {
        s(atomicReferenceArray, n2, t);
        this.u(n + 1L);
        return true;
    }
    
    @Override
    public void clear() {
        while (true) {
            if (this.poll() == null) {
                if (!this.isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public boolean isEmpty() {
        return this.j() == this.f();
    }
    
    @Override
    public boolean offer(final T obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final AtomicReferenceArray<Object> k = this.K;
        final long e = this.e();
        final int j = this.J;
        final int c = c(e, j);
        if (e < this.I) {
            return this.v(k, obj, e, c);
        }
        final long n = this.H + e;
        if (g(k, c(n, j)) == null) {
            this.I = n - 1L;
            return this.v(k, obj, e, c);
        }
        if (g(k, c(1L + e, j)) == null) {
            return this.v(k, obj, e, c);
        }
        this.n(k, e, c, obj, j);
        return true;
    }
    
    @Override
    public boolean p(T p2, final T t) {
        final AtomicReferenceArray<Object> k = this.K;
        final long j = this.j();
        final int i = this.J;
        final long n = 2L + j;
        int n2;
        if (g(k, c(n, i)) == null) {
            n2 = c(j, i);
            s(k, n2 + 1, t);
        }
        else {
            final AtomicReferenceArray l = new AtomicReferenceArray<Object>(k.length());
            this.K = (AtomicReferenceArray<Object>)l;
            n2 = c(j, i);
            s((AtomicReferenceArray<Object>)l, n2 + 1, t);
            s((AtomicReferenceArray<Object>)l, n2, p2);
            this.t(k, (AtomicReferenceArray<Object>)l);
            p2 = (T)c.P;
        }
        s(k, n2, p2);
        this.u(n);
        return true;
    }
    
    public T peek() {
        final AtomicReferenceArray<Object> m = this.M;
        final long d = this.d();
        final int l = this.L;
        final Object g = g(m, c(d, l));
        if (g == c.P) {
            return this.l(this.i(m, l + 1), d, l);
        }
        return (T)g;
    }
    
    @g
    @Override
    public T poll() {
        final AtomicReferenceArray<Object> m = this.M;
        final long d = this.d();
        final int l = this.L;
        final int c = c(d, l);
        final Object g = g(m, c);
        final boolean b = g == io.reactivex.internal.queue.c.P;
        if (g != null && !b) {
            s(m, c, null);
            this.r(d + 1L);
            return (T)g;
        }
        if (b) {
            return this.m(this.i(m, l + 1), d, l);
        }
        return null;
    }
    
    public int q() {
        long f = this.f();
        long j;
        long f2;
        while (true) {
            j = this.j();
            f2 = this.f();
            if (f == f2) {
                break;
            }
            f = f2;
        }
        return (int)(j - f2);
    }
}
