// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.internal.observers.l;
import java.util.Arrays;
import io.reactivex.annotations.g;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> extends i<T>
{
    static final a[] J;
    static final a[] K;
    final AtomicReference<a<T>[]> G;
    Throwable H;
    T I;
    
    static {
        J = new a[0];
        K = new a[0];
    }
    
    a() {
        this.G = new AtomicReference<a<T>[]>(a.J);
    }
    
    @d
    @f
    public static <T> a<T> r8() {
        return new a<T>();
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<T> a = new a<T>(i0, this);
        i0.l(a);
        if (this.q8(a)) {
            if (a.i()) {
                this.w8(a);
            }
        }
        else {
            final Throwable h = this.H;
            if (h != null) {
                i0.b(h);
            }
            else {
                final T j = this.I;
                if (j != null) {
                    a.c(j);
                }
                else {
                    a.f();
                }
            }
        }
    }
    
    @Override
    public void b(final Throwable h) {
        b.g(h, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final a<T>[] value = this.G.get();
        final a[] k = a.K;
        if (value == k) {
            a.Y(h);
            return;
        }
        this.I = null;
        this.H = h;
        final a<T>[] array = this.G.getAndSet(k);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].b(h);
        }
    }
    
    @Override
    public void f() {
        final a<T>[] value = this.G.get();
        final a[] k = a.K;
        if (value == k) {
            return;
        }
        final T i = this.I;
        final a<T>[] array = this.G.getAndSet(k);
        final int n = 0;
        int j = 0;
        if (i == null) {
            while (j < array.length) {
                array[j].f();
                ++j;
            }
        }
        else {
            for (int length = array.length, l = n; l < length; ++l) {
                array[l].c(i);
            }
        }
    }
    
    @Override
    public void l(final c c) {
        if (this.G.get() == a.K) {
            c.dispose();
        }
    }
    
    @Override
    public Throwable l8() {
        Throwable h;
        if (this.G.get() == a.K) {
            h = this.H;
        }
        else {
            h = null;
        }
        return h;
    }
    
    @Override
    public void m(final T i) {
        b.g(i, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.G.get() == a.K) {
            return;
        }
        this.I = i;
    }
    
    @Override
    public boolean m8() {
        return this.G.get() == a.K && this.H == null;
    }
    
    @Override
    public boolean n8() {
        return this.G.get().length != 0;
    }
    
    @Override
    public boolean o8() {
        return this.G.get() == a.K && this.H != null;
    }
    
    boolean q8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.G.get();
            if (expectedValue == a.K) {
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
    public T s8() {
        T i;
        if (this.G.get() == a.K) {
            i = this.I;
        }
        else {
            i = null;
        }
        return i;
    }
    
    @Deprecated
    public Object[] t8() {
        final Object s8 = this.s8();
        Object[] array;
        if (s8 != null) {
            array = new Object[] { s8 };
        }
        else {
            array = new Object[0];
        }
        return array;
    }
    
    @Deprecated
    public T[] u8(final T[] original) {
        final T s8 = this.s8();
        if (s8 == null) {
            if (original.length != 0) {
                original[0] = null;
            }
            return original;
        }
        T[] copy = original;
        if (original.length == 0) {
            copy = Arrays.copyOf(original, 1);
        }
        copy[0] = s8;
        if (copy.length != 1) {
            copy[1] = null;
        }
        return copy;
    }
    
    public boolean v8() {
        return this.G.get() == a.K && this.I != null;
    }
    
    void w8(final a<T> a) {
        a<T>[] expectedValue;
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
                j = a.J;
            }
            else {
                j = new a[length - 1];
                System.arraycopy(expectedValue, 0, j, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, j, n3, length - n3 - 1);
            }
        } while (!this.G.compareAndSet(expectedValue, j));
    }
    
    static final class a<T> extends l<T>
    {
        private static final long Q = 5629876084736248016L;
        final io.reactivex.subjects.a<T> P;
        
        a(final i0<? super T> i0, final io.reactivex.subjects.a<T> p2) {
            super(i0);
            this.P = p2;
        }
        
        void b(final Throwable t) {
            if (this.i()) {
                io.reactivex.plugins.a.Y(t);
            }
            else {
                super.H.b(t);
            }
        }
        
        @Override
        public void dispose() {
            if (super.g()) {
                this.P.w8(this);
            }
        }
        
        void f() {
            if (!this.i()) {
                super.H.f();
            }
        }
    }
}
