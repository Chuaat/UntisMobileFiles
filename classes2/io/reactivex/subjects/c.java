// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.annotations.g;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;

public final class c extends io.reactivex.c implements f
{
    static final a[] J;
    static final a[] K;
    final AtomicReference<a[]> G;
    final AtomicBoolean H;
    Throwable I;
    
    static {
        J = new a[0];
        K = new a[0];
    }
    
    c() {
        this.H = new AtomicBoolean();
        this.G = new AtomicReference<a[]>(c.J);
    }
    
    @d
    @io.reactivex.annotations.f
    public static c l1() {
        return new c();
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f, this);
        f.l(a);
        if (this.k1(a)) {
            if (a.i()) {
                this.r1(a);
            }
        }
        else {
            final Throwable i = this.I;
            if (i != null) {
                f.b(i);
            }
            else {
                f.f();
            }
        }
    }
    
    @Override
    public void b(final Throwable i) {
        b.g(i, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean h = this.H;
        int j = 0;
        if (h.compareAndSet(false, true)) {
            this.I = i;
            for (a[] array = this.G.getAndSet(c.K); j < array.length; ++j) {
                array[j].G.b(i);
            }
        }
        else {
            io.reactivex.plugins.a.Y(i);
        }
    }
    
    @Override
    public void f() {
        final AtomicBoolean h = this.H;
        int i = 0;
        if (h.compareAndSet(false, true)) {
            for (a[] array = this.G.getAndSet(c.K); i < array.length; ++i) {
                array[i].G.f();
            }
        }
    }
    
    boolean k1(final a a) {
        a[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.G.get();
            if (expectedValue == c.K) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.G.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    @Override
    public void l(final io.reactivex.disposables.c c) {
        if (this.G.get() == c.K) {
            c.dispose();
        }
    }
    
    @g
    public Throwable m1() {
        if (this.G.get() == c.K) {
            return this.I;
        }
        return null;
    }
    
    public boolean n1() {
        return this.G.get() == c.K && this.I == null;
    }
    
    public boolean o1() {
        return this.G.get().length != 0;
    }
    
    public boolean p1() {
        return this.G.get() == c.K && this.I != null;
    }
    
    int q1() {
        return this.G.get().length;
    }
    
    void r1(final a a) {
        a[] expectedValue;
        a[] j;
        do {
            expectedValue = this.G.get();
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
                j = c.J;
            }
            else {
                j = new a[length - 1];
                System.arraycopy(expectedValue, 0, j, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, j, n3, length - n3 - 1);
            }
        } while (!this.G.compareAndSet(expectedValue, j));
    }
    
    static final class a extends AtomicReference<c> implements io.reactivex.disposables.c
    {
        private static final long H = -7650903191002190468L;
        final f G;
        
        a(final f g, final c newValue) {
            this.G = g;
            this.lazySet(newValue);
        }
        
        @Override
        public void dispose() {
            final c c = this.getAndSet(null);
            if (c != null) {
                c.r1(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == null;
        }
    }
}
