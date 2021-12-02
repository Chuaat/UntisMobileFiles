// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.annotations.g;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicReference;

public final class e<T> extends i<T>
{
    static final a[] I;
    static final a[] J;
    final AtomicReference<a<T>[]> G;
    Throwable H;
    
    static {
        I = new a[0];
        J = new a[0];
    }
    
    e() {
        this.G = new AtomicReference<a<T>[]>(e.J);
    }
    
    @d
    @f
    public static <T> e<T> r8() {
        return new e<T>();
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<T> a = new a<T>(i0, this);
        i0.l(a);
        if (this.q8(a)) {
            if (a.i()) {
                this.s8(a);
            }
        }
        else {
            final Throwable h = this.H;
            if (h != null) {
                i0.b(h);
            }
            else {
                i0.f();
            }
        }
    }
    
    @Override
    public void b(final Throwable h) {
        b.g(h, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final a<T>[] value = this.G.get();
        final a[] i = e.I;
        if (value == i) {
            io.reactivex.plugins.a.Y(h);
            return;
        }
        this.H = h;
        final a<T>[] array = this.G.getAndSet(i);
        for (int length = array.length, j = 0; j < length; ++j) {
            array[j].b(h);
        }
    }
    
    @Override
    public void f() {
        final a<T>[] value = this.G.get();
        final a[] i = e.I;
        if (value == i) {
            return;
        }
        final a<T>[] array = this.G.getAndSet(i);
        for (int length = array.length, j = 0; j < length; ++j) {
            array[j].a();
        }
    }
    
    @Override
    public void l(final c c) {
        if (this.G.get() == e.I) {
            c.dispose();
        }
    }
    
    @g
    @Override
    public Throwable l8() {
        if (this.G.get() == e.I) {
            return this.H;
        }
        return null;
    }
    
    @Override
    public void m(final T t) {
        b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        final a<T>[] array = this.G.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].c(t);
        }
    }
    
    @Override
    public boolean m8() {
        return this.G.get() == e.I && this.H == null;
    }
    
    @Override
    public boolean n8() {
        return this.G.get().length != 0;
    }
    
    @Override
    public boolean o8() {
        return this.G.get() == e.I && this.H != null;
    }
    
    boolean q8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.G.get();
            if (expectedValue == e.I) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.G.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    void s8(final a<T> a) {
        a<T>[] expectedValue;
        a[] j;
        do {
            expectedValue = this.G.get();
            if (expectedValue == e.I) {
                break;
            }
            if (expectedValue == e.J) {
                break;
            }
            final int length = expectedValue.length;
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
                j = e.J;
            }
            else {
                j = new a[length - 1];
                System.arraycopy(expectedValue, 0, j, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, j, n3, length - n3 - 1);
            }
        } while (!this.G.compareAndSet(expectedValue, j));
    }
    
    static final class a<T> extends AtomicBoolean implements c
    {
        private static final long I = 3562861878281475070L;
        final i0<? super T> G;
        final e<T> H;
        
        a(final i0<? super T> g, final e<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            if (!this.get()) {
                this.G.f();
            }
        }
        
        public void b(final Throwable t) {
            if (this.get()) {
                io.reactivex.plugins.a.Y(t);
            }
            else {
                this.G.b(t);
            }
        }
        
        public void c(final T t) {
            if (!this.get()) {
                this.G.m((Object)t);
            }
        }
        
        @Override
        public void dispose() {
            if (this.compareAndSet(false, true)) {
                this.H.s8(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get();
        }
    }
}
