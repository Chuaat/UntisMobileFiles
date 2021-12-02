// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.annotations.g;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import io.reactivex.k0;

public final class h<T> extends k0<T> implements n0<T>
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
    
    h() {
        this.H = new AtomicBoolean();
        this.G = new AtomicReference<a<T>[]>(h.K);
    }
    
    @d
    @f
    public static <T> h<T> R1() {
        return new h<T>();
    }
    
    boolean Q1(@f final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.G.get();
            if (expectedValue == h.L) {
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
    public Throwable S1() {
        if (this.G.get() == h.L) {
            return this.J;
        }
        return null;
    }
    
    @g
    public T T1() {
        if (this.G.get() == h.L) {
            return this.I;
        }
        return null;
    }
    
    public boolean U1() {
        return this.G.get().length != 0;
    }
    
    public boolean V1() {
        return this.G.get() == h.L && this.J != null;
    }
    
    public boolean W1() {
        return this.G.get() == h.L && this.I != null;
    }
    
    int X1() {
        return this.G.get().length;
    }
    
    void Y1(@f final a<T> a) {
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
                k = h.K;
            }
            else {
                k = new a[length - 1];
                System.arraycopy(expectedValue, 0, k, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, k, n3, length - n3 - 1);
            }
        } while (!this.G.compareAndSet(expectedValue, k));
    }
    
    @Override
    public void b(@f final Throwable j) {
        b.g(j, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean h = this.H;
        int i = 0;
        if (h.compareAndSet(false, true)) {
            this.J = j;
            for (a<T>[] array = this.G.getAndSet(io.reactivex.subjects.h.L); i < array.length; ++i) {
                array[i].G.b(j);
            }
        }
        else {
            io.reactivex.plugins.a.Y(j);
        }
    }
    
    @Override
    public void d(@f final T i) {
        b.g(i, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean h = this.H;
        int j = 0;
        if (h.compareAndSet(false, true)) {
            this.I = i;
            for (a<T>[] array = this.G.getAndSet(io.reactivex.subjects.h.L); j < array.length; ++j) {
                array[j].G.d((Object)i);
            }
        }
    }
    
    @Override
    protected void e1(@f final n0<? super T> n0) {
        final a<T> a = new a<T>(n0, this);
        n0.l(a);
        if (this.Q1(a)) {
            if (a.i()) {
                this.Y1(a);
            }
        }
        else {
            final Throwable j = this.J;
            if (j != null) {
                n0.b(j);
            }
            else {
                n0.d(this.I);
            }
        }
    }
    
    @Override
    public void l(@f final c c) {
        if (this.G.get() == h.L) {
            c.dispose();
        }
    }
    
    static final class a<T> extends AtomicReference<h<T>> implements c
    {
        private static final long H = -7650903191002190468L;
        final n0<? super T> G;
        
        a(final n0<? super T> g, final h<T> newValue) {
            this.G = g;
            this.lazySet(newValue);
        }
        
        @Override
        public void dispose() {
            final h<T> h = this.getAndSet(null);
            if (h != null) {
                h.Y1(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == null;
        }
    }
}
