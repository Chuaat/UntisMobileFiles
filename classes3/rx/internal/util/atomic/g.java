// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.Collection;
import rx.internal.util.unsafe.p;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;

public final class g<T> implements Queue<T>
{
    static final int O;
    private static final Object P;
    final AtomicLong G;
    int H;
    long I;
    int J;
    AtomicReferenceArray<Object> K;
    int L;
    AtomicReferenceArray<Object> M;
    final AtomicLong N;
    
    static {
        O = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        P = new Object();
    }
    
    public g(int b) {
        b = p.b(b);
        final int n = b - 1;
        final AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<Object>(b + 1);
        this.K = atomicReferenceArray;
        this.J = n;
        this.b(b);
        this.M = atomicReferenceArray;
        this.L = n;
        this.I = n - 1;
        this.G = new AtomicLong();
        this.N = new AtomicLong();
    }
    
    private boolean A(final AtomicReferenceArray<Object> atomicReferenceArray, final T t, final long n, final int n2) {
        w(atomicReferenceArray, n2, t);
        this.z(n + 1L);
        return true;
    }
    
    private void b(final int n) {
        this.H = Math.min(n / 4, g.O);
    }
    
    private static int f(final int n) {
        return n;
    }
    
    private static int h(final long n, final int n2) {
        return f((int)n & n2);
    }
    
    private long i() {
        return this.N.get();
    }
    
    private long k() {
        return this.G.get();
    }
    
    private long l() {
        return this.N.get();
    }
    
    private static <E> Object m(final AtomicReferenceArray<Object> atomicReferenceArray, final int i) {
        return atomicReferenceArray.get(i);
    }
    
    private AtomicReferenceArray<Object> n(final AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray<Object>)m(atomicReferenceArray, f(atomicReferenceArray.length() - 1));
    }
    
    private long o() {
        return this.G.get();
    }
    
    private T p(final AtomicReferenceArray<Object> m, final long n, final int n2) {
        this.M = m;
        return (T)m(m, h(n, n2));
    }
    
    private T q(final AtomicReferenceArray<Object> m, final long n, int h) {
        this.M = m;
        h = h(n, h);
        final Object i = m(m, h);
        if (i == null) {
            return null;
        }
        w(m, h, null);
        this.v(n + 1L);
        return (T)i;
    }
    
    private void t(final AtomicReferenceArray<Object> atomicReferenceArray, final long n, final int n2, final T t, final long n3) {
        final AtomicReferenceArray k = new AtomicReferenceArray(atomicReferenceArray.length());
        this.K = (AtomicReferenceArray<Object>)k;
        this.I = n3 + n - 1L;
        w(k, n2, t);
        this.x(atomicReferenceArray, k);
        w(atomicReferenceArray, n2, g.P);
        this.z(n + 1L);
    }
    
    private void v(final long newValue) {
        this.N.lazySet(newValue);
    }
    
    private static void w(final AtomicReferenceArray<Object> atomicReferenceArray, final int i, final Object newValue) {
        atomicReferenceArray.lazySet(i, newValue);
    }
    
    private void x(final AtomicReferenceArray<Object> atomicReferenceArray, final AtomicReferenceArray<Object> atomicReferenceArray2) {
        w(atomicReferenceArray, f(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }
    
    private void z(final long newValue) {
        this.G.lazySet(newValue);
    }
    
    @Override
    public boolean add(final T t) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(final Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
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
    public boolean contains(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean containsAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public T element() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isEmpty() {
        return this.o() == this.l();
    }
    
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean offer(final T t) {
        final AtomicReferenceArray<Object> k = this.K;
        final long i = this.k();
        final int j = this.J;
        final int h = h(i, j);
        if (i < this.I) {
            return this.A(k, t, i, h);
        }
        final long n = this.H + i;
        if (m(k, h(n, j)) == null) {
            this.I = n - 1L;
            return this.A(k, t, i, h);
        }
        if (m(k, h(1L + i, j)) == null) {
            return this.A(k, t, i, h);
        }
        this.t(k, i, h, t, j);
        return true;
    }
    
    @Override
    public T peek() {
        final AtomicReferenceArray<Object> m = this.M;
        final long i = this.i();
        final int l = this.L;
        final Object j = m(m, h(i, l));
        if (j == g.P) {
            return this.p(this.n(m), i, l);
        }
        return (T)j;
    }
    
    @Override
    public T poll() {
        final AtomicReferenceArray<Object> m = this.M;
        final long i = this.i();
        final int l = this.L;
        final int h = h(i, l);
        final Object j = m(m, h);
        final boolean b = j == g.P;
        if (j != null && !b) {
            w(m, h, null);
            this.v(i + 1L);
            return (T)j;
        }
        if (b) {
            return this.q(this.n(m), i, l);
        }
        return null;
    }
    
    public boolean r(T p2, final T t) {
        final AtomicReferenceArray<Object> k = this.K;
        final long o = this.o();
        final int j = this.J;
        final long n = 2L + o;
        int n2;
        if (m(k, h(n, j)) == null) {
            n2 = h(o, j);
            w(k, n2 + 1, t);
        }
        else {
            final AtomicReferenceArray i = new AtomicReferenceArray<Object>(k.length());
            this.K = (AtomicReferenceArray<Object>)i;
            n2 = h(o, j);
            w((AtomicReferenceArray<Object>)i, n2 + 1, t);
            w((AtomicReferenceArray<Object>)i, n2, p2);
            this.x(k, (AtomicReferenceArray<Object>)i);
            p2 = (T)g.P;
        }
        w(k, n2, p2);
        this.z(n);
        return true;
    }
    
    @Override
    public T remove() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int size() {
        long l = this.l();
        long o;
        long i;
        while (true) {
            o = this.o();
            i = this.l();
            if (l == i) {
                break;
            }
            l = i;
        }
        return (int)(o - i);
    }
    
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public <E> E[] toArray(final E[] array) {
        throw new UnsupportedOperationException();
    }
}
