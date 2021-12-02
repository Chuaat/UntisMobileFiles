// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.s;

public final class c<T> extends s<T> implements v<T>
{
    static final a[] K;
    static final a[] L;
    final AtomicReference<y<T>> G;
    final AtomicReference<a<T>[]> H;
    T I;
    Throwable J;
    
    static {
        K = new a[0];
        L = new a[0];
    }
    
    public c(final y<T> initialValue) {
        this.G = new AtomicReference<y<T>>(initialValue);
        this.H = new AtomicReference<a<T>[]>(c.K);
    }
    
    @Override
    public void b(final Throwable j) {
        this.J = j;
        for (final a<T> a : this.H.getAndSet(c.L)) {
            if (!a.i()) {
                a.G.b(j);
            }
        }
    }
    
    @Override
    public void d(final T i) {
        this.I = i;
        for (final a<T> a : this.H.getAndSet(c.L)) {
            if (!a.i()) {
                a.G.d((Object)i);
            }
        }
    }
    
    @Override
    public void f() {
        for (final a<T> a : this.H.getAndSet(c.L)) {
            if (!a.i()) {
                a.G.f();
            }
        }
    }
    
    boolean i2(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == c.L) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.H.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    void j2(final a<T> a) {
        a<T>[] expectedValue;
        a[] k;
        do {
            expectedValue = this.H.get();
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
                k = c.K;
            }
            else {
                k = new a[length - 1];
                System.arraycopy(expectedValue, 0, k, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, k, n3, length - n3 - 1);
            }
        } while (!this.H.compareAndSet(expectedValue, k));
    }
    
    @Override
    public void l(final io.reactivex.disposables.c c) {
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final a<T> a = new a<T>((v<? super Object>)v, (c<Object>)this);
        v.l(a);
        if (!this.i2(a)) {
            if (!a.i()) {
                final Throwable j = this.J;
                if (j != null) {
                    v.b(j);
                }
                else {
                    final T i = this.I;
                    if (i != null) {
                        v.d(i);
                    }
                    else {
                        v.f();
                    }
                }
            }
            return;
        }
        if (a.i()) {
            this.j2(a);
            return;
        }
        final y<T> y = this.G.getAndSet(null);
        if (y != null) {
            y.c(this);
        }
    }
    
    static final class a<T> extends AtomicReference<c<T>> implements c
    {
        private static final long H = -5791853038359966195L;
        final v<? super T> G;
        
        a(final v<? super T> g, final c<T> initialValue) {
            super(initialValue);
            this.G = g;
        }
        
        @Override
        public void dispose() {
            final c<T> c = this.getAndSet(null);
            if (c != null) {
                c.j2(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == null;
        }
    }
}
