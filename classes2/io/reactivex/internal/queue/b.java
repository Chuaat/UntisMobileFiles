// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.queue;

import io.reactivex.annotations.g;
import java.util.Objects;
import io.reactivex.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import y5.n;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class b<E> extends AtomicReferenceArray<E> implements n<E>
{
    private static final long L = -1296597691183856449L;
    private static final Integer M;
    final int G;
    final AtomicLong H;
    long I;
    final AtomicLong J;
    final int K;
    
    static {
        M = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    
    public b(final int n) {
        super(t.b(n));
        this.G = this.length() - 1;
        this.H = new AtomicLong();
        this.J = new AtomicLong();
        this.K = Math.min(n / 4, b.M);
    }
    
    int a(final long n) {
        return this.G & (int)n;
    }
    
    int b(final long n, final int n2) {
        return (int)n & n2;
    }
    
    E c(final int i) {
        return this.get(i);
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
    
    void d(final long newValue) {
        this.J.lazySet(newValue);
    }
    
    void e(final int i, final E newValue) {
        this.lazySet(i, newValue);
    }
    
    void f(final long newValue) {
        this.H.lazySet(newValue);
    }
    
    @Override
    public boolean isEmpty() {
        return this.H.get() == this.J.get();
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final int g = this.G;
        final long value = this.H.get();
        final int b = this.b(value, g);
        if (value >= this.I) {
            final long i = this.K + value;
            if (this.c(this.b(i, g)) == null) {
                this.I = i;
            }
            else if (this.c(b) != null) {
                return false;
            }
        }
        this.e(b, obj);
        this.f(value + 1L);
        return true;
    }
    
    @Override
    public boolean p(final E e, final E e2) {
        return this.offer(e) && this.offer(e2);
    }
    
    @g
    @Override
    public E poll() {
        final long value = this.J.get();
        final int a = this.a(value);
        final E c = this.c(a);
        if (c == null) {
            return null;
        }
        this.d(value + 1L);
        this.e(a, null);
        return c;
    }
}
