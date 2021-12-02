// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.annotations.g;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicReference;

public final class e<T> extends c<T>
{
    static final a[] J;
    static final a[] K;
    final AtomicReference<a<T>[]> H;
    Throwable I;
    
    static {
        J = new a[0];
        K = new a[0];
    }
    
    e() {
        this.H = new AtomicReference<a<T>[]>(e.K);
    }
    
    @d
    @f
    public static <T> e<T> V8() {
        return new e<T>();
    }
    
    @g
    @Override
    public Throwable P8() {
        if (this.H.get() == e.J) {
            return this.I;
        }
        return null;
    }
    
    @Override
    public boolean Q8() {
        return this.H.get() == e.J && this.I == null;
    }
    
    @Override
    public boolean R8() {
        return this.H.get().length != 0;
    }
    
    @Override
    public boolean S8() {
        return this.H.get() == e.J && this.I != null;
    }
    
    boolean U8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == e.J) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.H.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public boolean W8(final T t) {
        if (t == null) {
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        final a<T>[] array = this.H.get();
        final int length = array.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            if (array[i].b()) {
                return false;
            }
        }
        for (int length2 = array.length, j = n; j < length2; ++j) {
            array[j].e(t);
        }
        return true;
    }
    
    void X8(final a<T> a) {
        a<T>[] expectedValue;
        a[] k;
        do {
            expectedValue = this.H.get();
            if (expectedValue == e.J) {
                break;
            }
            if (expectedValue == e.K) {
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
                k = e.K;
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
        final a[] j = e.J;
        if (value == j) {
            io.reactivex.plugins.a.Y(i);
            return;
        }
        this.I = i;
        final a<T>[] array = this.H.getAndSet(j);
        for (int length = array.length, k = 0; k < length; ++k) {
            array[k].d(i);
        }
    }
    
    public void f() {
        final a<T>[] value = this.H.get();
        final a[] j = e.J;
        if (value == j) {
            return;
        }
        final a<T>[] array = this.H.getAndSet(j);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].c();
        }
    }
    
    public void m(final T t) {
        b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        final a<T>[] array = this.H.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].e(t);
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final a a = new a((o7.c<? super T>)c, (e<T>)this);
        c.z((o7.d)a);
        if (this.U8(a)) {
            if (a.a()) {
                this.X8(a);
            }
        }
        else {
            final Throwable i = this.I;
            if (i != null) {
                c.b(i);
            }
            else {
                c.f();
            }
        }
    }
    
    public void z(final o7.d d) {
        if (this.H.get() == e.J) {
            d.cancel();
            return;
        }
        d.v(Long.MAX_VALUE);
    }
    
    static final class a<T> extends AtomicLong implements o7.d
    {
        private static final long I = 3562861878281475070L;
        final o7.c<? super T> G;
        final e<T> H;
        
        a(final o7.c<? super T> g, final e<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public boolean a() {
            return this.get() == Long.MIN_VALUE;
        }
        
        boolean b() {
            return this.get() == 0L;
        }
        
        public void c() {
            if (this.get() != Long.MIN_VALUE) {
                this.G.f();
            }
        }
        
        public void cancel() {
            if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.H.X8(this);
            }
        }
        
        public void d(final Throwable t) {
            if (this.get() != Long.MIN_VALUE) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void e(final T t) {
            final long value = this.get();
            if (value == Long.MIN_VALUE) {
                return;
            }
            if (value != 0L) {
                this.G.m((Object)t);
                io.reactivex.internal.util.d.f(this, 1L);
            }
            else {
                this.cancel();
                this.G.b((Throwable)new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.b(this, n);
            }
        }
    }
}
