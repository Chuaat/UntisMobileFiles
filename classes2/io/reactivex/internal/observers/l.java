// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.annotations.g;
import io.reactivex.plugins.a;
import io.reactivex.i0;

public class l<T> extends b<T>
{
    private static final long J = -5502432239815349361L;
    static final int K = 2;
    static final int L = 4;
    static final int M = 8;
    static final int N = 16;
    static final int O = 32;
    protected final i0<? super T> H;
    protected T I;
    
    public l(final i0<? super T> h) {
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
    
    public final void a() {
        if ((this.get() & 0x36) != 0x0) {
            return;
        }
        this.lazySet(2);
        this.H.f();
    }
    
    public final void c(T i) {
        final int value = this.get();
        if ((value & 0x36) != 0x0) {
            return;
        }
        final i0<? super T> h = this.H;
        if (value == 8) {
            this.I = i;
            this.lazySet(16);
            i = null;
        }
        else {
            this.lazySet(2);
        }
        h.m(i);
        if (this.get() != 4) {
            h.f();
        }
    }
    
    @Override
    public final void clear() {
        this.lazySet(32);
        this.I = null;
    }
    
    @Override
    public void dispose() {
        this.set(4);
        this.I = null;
    }
    
    public final void e(final Throwable t) {
        if ((this.get() & 0x36) != 0x0) {
            a.Y(t);
            return;
        }
        this.lazySet(2);
        this.H.b(t);
    }
    
    public final boolean g() {
        return this.getAndSet(4) != 4;
    }
    
    @Override
    public final boolean i() {
        return this.get() == 4;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.get() != 16;
    }
    
    @g
    @Override
    public final T poll() throws Exception {
        if (this.get() == 16) {
            final T i = this.I;
            this.I = null;
            this.lazySet(32);
            return i;
        }
        return null;
    }
}
