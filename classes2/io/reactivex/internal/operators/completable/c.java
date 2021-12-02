// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i;
import io.reactivex.f;

public final class c extends io.reactivex.c implements f
{
    static final a[] K;
    static final a[] L;
    final i G;
    final AtomicReference<a[]> H;
    final AtomicBoolean I;
    Throwable J;
    
    static {
        K = new a[0];
        L = new a[0];
    }
    
    public c(final i g) {
        this.G = g;
        this.H = new AtomicReference<a[]>(c.K);
        this.I = new AtomicBoolean();
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f);
        f.l(a);
        if (this.k1(a)) {
            if (a.i()) {
                this.l1(a);
            }
            if (this.I.compareAndSet(false, true)) {
                this.G.c(this);
            }
        }
        else {
            final Throwable j = this.J;
            if (j != null) {
                f.b(j);
            }
            else {
                f.f();
            }
        }
    }
    
    @Override
    public void b(final Throwable j) {
        this.J = j;
        for (final a a : this.H.getAndSet(c.L)) {
            if (!a.get()) {
                a.G.b(j);
            }
        }
    }
    
    @Override
    public void f() {
        for (final a a : this.H.getAndSet(c.L)) {
            if (!a.get()) {
                a.G.f();
            }
        }
    }
    
    boolean k1(final a a) {
        a[] expectedValue;
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
    
    @Override
    public void l(final io.reactivex.disposables.c c) {
    }
    
    void l1(final a a) {
        a[] expectedValue;
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
    
    final class a extends AtomicBoolean implements io.reactivex.disposables.c
    {
        private static final long I = 8943152917179642732L;
        final f G;
        
        a(final f g) {
            this.G = g;
        }
        
        @Override
        public void dispose() {
            if (this.compareAndSet(false, true)) {
                c.this.l1(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get();
        }
    }
}
