// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import io.reactivex.internal.functions.b;
import java.util.Arrays;
import io.reactivex.annotations.g;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> extends c<T>
{
    static final a[] K;
    static final a[] L;
    final AtomicReference<a<T>[]> H;
    Throwable I;
    T J;
    
    static {
        K = new a[0];
        L = new a[0];
    }
    
    a() {
        this.H = new AtomicReference<a<T>[]>(a.K);
    }
    
    @d
    @f
    public static <T> a<T> V8() {
        return new a<T>();
    }
    
    @g
    @Override
    public Throwable P8() {
        Throwable i;
        if (this.H.get() == a.L) {
            i = this.I;
        }
        else {
            i = null;
        }
        return i;
    }
    
    @Override
    public boolean Q8() {
        return this.H.get() == a.L && this.I == null;
    }
    
    @Override
    public boolean R8() {
        return this.H.get().length != 0;
    }
    
    @Override
    public boolean S8() {
        return this.H.get() == a.L && this.I != null;
    }
    
    boolean U8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == a.L) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.H.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    @g
    public T W8() {
        T j;
        if (this.H.get() == a.L) {
            j = this.J;
        }
        else {
            j = null;
        }
        return j;
    }
    
    @Deprecated
    public Object[] X8() {
        final Object w8 = this.W8();
        Object[] array;
        if (w8 != null) {
            array = new Object[] { w8 };
        }
        else {
            array = new Object[0];
        }
        return array;
    }
    
    @Deprecated
    public T[] Y8(final T[] original) {
        final T w8 = this.W8();
        if (w8 == null) {
            if (original.length != 0) {
                original[0] = null;
            }
            return original;
        }
        T[] copy = original;
        if (original.length == 0) {
            copy = Arrays.copyOf(original, 1);
        }
        copy[0] = w8;
        if (copy.length != 1) {
            copy[1] = null;
        }
        return copy;
    }
    
    public boolean Z8() {
        return this.H.get() == a.L && this.J != null;
    }
    
    void a9(final a<T> a) {
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
                k = a.K;
            }
            else {
                k = new a[length - 1];
                System.arraycopy(expectedValue, 0, k, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, k, n3, length - n3 - 1);
            }
        } while (!this.H.compareAndSet(expectedValue, k));
    }
    
    public void b(final Throwable i) {
        b.g(i, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final a<T>[] value = this.H.get();
        final a[] l = a.L;
        if (value == l) {
            a.Y(i);
            return;
        }
        this.J = null;
        this.I = i;
        final a<T>[] array = this.H.getAndSet(l);
        for (int length = array.length, j = 0; j < length; ++j) {
            array[j].b(i);
        }
    }
    
    public void f() {
        final a<T>[] value = this.H.get();
        final a[] l = a.L;
        if (value == l) {
            return;
        }
        final T j = this.J;
        final a<T>[] array = this.H.getAndSet(l);
        final int n = 0;
        int i = 0;
        if (j == null) {
            while (i < array.length) {
                array[i].f();
                ++i;
            }
        }
        else {
            for (int length = array.length, k = n; k < length; ++k) {
                array[k].g(j);
            }
        }
    }
    
    public void m(final T j) {
        b.g(j, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.H.get() == a.L) {
            return;
        }
        this.J = j;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final a a = new a((o7.c<? super T>)c, (a<T>)this);
        c.z((o7.d)a);
        if (this.U8(a)) {
            if (a.i()) {
                this.a9(a);
            }
        }
        else {
            final Throwable i = this.I;
            if (i != null) {
                c.b(i);
            }
            else {
                final T j = this.J;
                if (j != null) {
                    a.g(j);
                }
                else {
                    a.f();
                }
            }
        }
    }
    
    public void z(final o7.d d) {
        if (this.H.get() == a.L) {
            d.cancel();
            return;
        }
        d.v(Long.MAX_VALUE);
    }
    
    static final class a<T> extends f<T>
    {
        private static final long T = 5629876084736248016L;
        final io.reactivex.processors.a<T> S;
        
        a(final o7.c<? super T> c, final io.reactivex.processors.a<T> s) {
            super(c);
            this.S = s;
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
        public void cancel() {
            if (super.j()) {
                this.S.a9(this);
            }
        }
        
        void f() {
            if (!this.i()) {
                super.H.f();
            }
        }
    }
}
