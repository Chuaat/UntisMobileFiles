// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.disposables.c;
import io.reactivex.annotations.g;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.annotations.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.s;

public final class d<T> extends s<T> implements v<T>
{
    static final a[] K;
    static final a[] L;
    final AtomicReference<a<T>[]> G;
    final AtomicBoolean H;
    T I;
    Throwable J;
    
    static {
        K = new a[0];
        L = new a[0];
    }
    
    d() {
        this.H = new AtomicBoolean();
        this.G = new AtomicReference<a<T>[]>(d.K);
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> d<T> j2() {
        return new d<T>();
    }
    
    @Override
    public void b(final Throwable j) {
        b.g(j, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean h = this.H;
        int i = 0;
        if (h.compareAndSet(false, true)) {
            this.J = j;
            for (a<T>[] array = this.G.getAndSet(d.L); i < array.length; ++i) {
                array[i].G.b(j);
            }
        }
        else {
            io.reactivex.plugins.a.Y(j);
        }
    }
    
    @Override
    public void d(final T i) {
        b.g(i, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean h = this.H;
        int j = 0;
        if (h.compareAndSet(false, true)) {
            this.I = i;
            for (a<T>[] array = this.G.getAndSet(d.L); j < array.length; ++j) {
                array[j].G.d((Object)i);
            }
        }
    }
    
    @Override
    public void f() {
        final AtomicBoolean h = this.H;
        int i = 0;
        if (h.compareAndSet(false, true)) {
            for (a<T>[] array = this.G.getAndSet(d.L); i < array.length; ++i) {
                array[i].G.f();
            }
        }
    }
    
    boolean i2(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.G.get();
            if (expectedValue == d.L) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.G.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    @g
    public Throwable k2() {
        if (this.G.get() == d.L) {
            return this.J;
        }
        return null;
    }
    
    @Override
    public void l(final c c) {
        if (this.G.get() == d.L) {
            c.dispose();
        }
    }
    
    @g
    public T l2() {
        if (this.G.get() == d.L) {
            return this.I;
        }
        return null;
    }
    
    public boolean m2() {
        return this.G.get() == d.L && this.I == null && this.J == null;
    }
    
    public boolean n2() {
        return this.G.get().length != 0;
    }
    
    public boolean o2() {
        return this.G.get() == d.L && this.J != null;
    }
    
    public boolean p2() {
        return this.G.get() == d.L && this.I != null;
    }
    
    int q2() {
        return this.G.get().length;
    }
    
    void r2(final a<T> a) {
        a<T>[] expectedValue;
        a[] k;
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
                k = d.K;
            }
            else {
                k = new a[length - 1];
                System.arraycopy(expectedValue, 0, k, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, k, n3, length - n3 - 1);
            }
        } while (!this.G.compareAndSet(expectedValue, k));
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final a<T> a = new a<T>((v<? super Object>)v, (d<Object>)this);
        v.l(a);
        if (this.i2(a)) {
            if (a.i()) {
                this.r2(a);
            }
        }
        else {
            final Throwable j = this.J;
            if (j != null) {
                v.b(j);
            }
            else {
                final T i = this.I;
                if (i == null) {
                    v.f();
                }
                else {
                    v.d(i);
                }
            }
        }
    }
    
    static final class a<T> extends AtomicReference<d<T>> implements c
    {
        private static final long H = -7650903191002190468L;
        final v<? super T> G;
        
        a(final v<? super T> g, final d<T> newValue) {
            this.G = g;
            this.lazySet(newValue);
        }
        
        @Override
        public void dispose() {
            final d<T> d = this.getAndSet(null);
            if (d != null) {
                d.r2(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == null;
        }
    }
}
