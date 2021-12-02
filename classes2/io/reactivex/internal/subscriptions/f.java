// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.g;

public class f<T> extends c<T>
{
    private static final long J = -2151279923272604993L;
    static final int K = 0;
    static final int L = 1;
    static final int M = 2;
    static final int N = 3;
    static final int O = 4;
    static final int P = 8;
    static final int Q = 16;
    static final int R = 32;
    protected final o7.c<? super T> H;
    protected T I;
    
    public f(final o7.c<? super T> h) {
        this.H = h;
    }
    
    @Override
    public final int E(final int n) {
        if ((n & 0x2) != 0x0) {
            this.lazySet(8);
            return 2;
        }
        return 0;
    }
    
    public void cancel() {
        this.set(4);
        this.I = null;
    }
    
    public final void clear() {
        this.lazySet(32);
        this.I = null;
    }
    
    public final void g(final T t) {
        int i = this.get();
        while (i != 8) {
            if ((i & 0xFFFFFFFD) != 0x0) {
                return;
            }
            if (i == 2) {
                this.lazySet(3);
                final o7.c<? super T> h = this.H;
                h.m((Object)t);
                if (this.get() != 4) {
                    h.f();
                }
                return;
            }
            this.I = t;
            if (this.compareAndSet(0, 1)) {
                return;
            }
            if ((i = this.get()) == 4) {
                this.I = null;
                return;
            }
        }
        this.I = t;
        this.lazySet(16);
        final o7.c<? super T> h2 = this.H;
        h2.m((Object)t);
        if (this.get() != 4) {
            h2.f();
        }
    }
    
    public final boolean i() {
        return this.get() == 4;
    }
    
    public final boolean isEmpty() {
        return this.get() != 16;
    }
    
    public final boolean j() {
        return this.getAndSet(4) != 4;
    }
    
    @g
    public final T poll() {
        if (this.get() == 16) {
            this.lazySet(32);
            final T i = this.I;
            this.I = null;
            return i;
        }
        return null;
    }
    
    public final void v(final long n) {
        if (j.m(n)) {
            do {
                final int value = this.get();
                if ((value & 0xFFFFFFFE) != 0x0) {
                    return;
                }
                if (value == 1) {
                    if (this.compareAndSet(1, 3)) {
                        final T i = this.I;
                        if (i != null) {
                            this.I = null;
                            final o7.c<? super T> h = this.H;
                            h.m((Object)i);
                            if (this.get() != 4) {
                                h.f();
                            }
                        }
                    }
                }
            } while (!this.compareAndSet(0, 2));
        }
    }
}
