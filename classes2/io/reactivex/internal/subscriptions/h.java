// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.g;
import o7.c;
import y5.l;
import java.util.concurrent.atomic.AtomicInteger;

public final class h<T> extends AtomicInteger implements l<T>
{
    private static final long I = -3830916580126663321L;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    final T G;
    final c<? super T> H;
    
    public h(final c<? super T> h, final T g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public int E(final int n) {
        return n & 0x1;
    }
    
    public boolean a() {
        return this.get() == 2;
    }
    
    public void cancel() {
        this.lazySet(2);
    }
    
    public void clear() {
        this.lazySet(1);
    }
    
    public boolean isEmpty() {
        return this.get() != 0;
    }
    
    public boolean offer(final T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public boolean p(final T t, final T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @g
    public T poll() {
        if (this.get() == 0) {
            this.lazySet(1);
            return this.G;
        }
        return null;
    }
    
    public void v(final long n) {
        if (!j.m(n)) {
            return;
        }
        if (this.compareAndSet(0, 1)) {
            final c<? super T> h = this.H;
            h.m((Object)this.G);
            if (this.get() != 2) {
                h.f();
            }
        }
    }
}
