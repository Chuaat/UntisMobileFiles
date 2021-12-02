// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import java.lang.reflect.Array;
import io.reactivex.annotations.g;
import io.reactivex.internal.util.q;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.k;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> extends i<T>
{
    private static final Object[] N;
    static final a[] O;
    static final a[] P;
    final AtomicReference<Object> G;
    final AtomicReference<a<T>[]> H;
    final ReadWriteLock I;
    final Lock J;
    final Lock K;
    final AtomicReference<Throwable> L;
    long M;
    
    static {
        N = new Object[0];
        O = new a[0];
        P = new a[0];
    }
    
    b() {
        final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
        this.I = i;
        this.J = i.readLock();
        this.K = i.writeLock();
        this.H = new AtomicReference<a<T>[]>(b.O);
        this.G = new AtomicReference<Object>();
        this.L = new AtomicReference<Throwable>();
    }
    
    b(final T t) {
        this();
        this.G.lazySet(io.reactivex.internal.functions.b.g(t, "defaultValue is null"));
    }
    
    @d
    @f
    public static <T> b<T> r8() {
        return new b<T>();
    }
    
    @d
    @f
    public static <T> b<T> s8(final T t) {
        return new b<T>(t);
    }
    
    a<T>[] A8(final Object o) {
        final AtomicReference<a<T>[]> h = this.H;
        final a[] p = b.P;
        final a[] array = h.getAndSet(p);
        if (array != p) {
            this.y8(o);
        }
        return (a<T>[])array;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<T> a = new a<T>(i0, this);
        i0.l(a);
        if (this.q8(a)) {
            if (a.M) {
                this.x8(a);
            }
            else {
                a.b();
            }
        }
        else {
            final Throwable t = this.L.get();
            if (t == k.a) {
                i0.f();
            }
            else {
                i0.b(t);
            }
        }
    }
    
    @Override
    public void b(final Throwable newValue) {
        io.reactivex.internal.functions.b.g(newValue, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.L.compareAndSet(null, newValue)) {
            io.reactivex.plugins.a.Y(newValue);
            return;
        }
        final Object j = q.j(newValue);
        final a<T>[] a8 = this.A8(j);
        for (int length = a8.length, i = 0; i < length; ++i) {
            a8[i].d(j, this.M);
        }
    }
    
    @Override
    public void f() {
        if (!this.L.compareAndSet(null, k.a)) {
            return;
        }
        final Object h = q.h();
        final a<T>[] a8 = this.A8(h);
        for (int length = a8.length, i = 0; i < length; ++i) {
            a8[i].d(h, this.M);
        }
    }
    
    @Override
    public void l(final c c) {
        if (this.L.get() != null) {
            c.dispose();
        }
    }
    
    @g
    @Override
    public Throwable l8() {
        final Object value = this.G.get();
        if (q.u(value)) {
            return q.l(value);
        }
        return null;
    }
    
    @Override
    public void m(final T t) {
        io.reactivex.internal.functions.b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.L.get() != null) {
            return;
        }
        final Object y = q.y(t);
        this.y8(y);
        final a<T>[] array = this.H.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].d(y, this.M);
        }
    }
    
    @Override
    public boolean m8() {
        return q.p(this.G.get());
    }
    
    @Override
    public boolean n8() {
        return this.H.get().length != 0;
    }
    
    @Override
    public boolean o8() {
        return q.u(this.G.get());
    }
    
    boolean q8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == b.P) {
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
    public T t8() {
        final Object value = this.G.get();
        if (!q.p(value) && !q.u(value)) {
            return (T)q.o(value);
        }
        return null;
    }
    
    @Deprecated
    public Object[] u8() {
        final Object[] n = b.N;
        final Object[] v8 = this.v8(n);
        if (v8 == n) {
            return new Object[0];
        }
        return v8;
    }
    
    @Deprecated
    public T[] v8(final T[] array) {
        final Object value = this.G.get();
        if (value != null && !q.p(value) && !q.u(value)) {
            final Object o = q.o(value);
            Object[] array2;
            if (array.length != 0) {
                array[0] = (T)o;
                array2 = array;
                if (array.length != 1) {
                    array[1] = null;
                    array2 = array;
                }
            }
            else {
                array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), 1);
                array2[0] = o;
            }
            return (T[])array2;
        }
        if (array.length != 0) {
            array[0] = null;
        }
        return array;
    }
    
    public boolean w8() {
        final Object value = this.G.get();
        return value != null && !q.p(value) && !q.u(value);
    }
    
    void x8(final a<T> a) {
        a<T>[] expectedValue;
        a[] o;
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
                o = b.O;
            }
            else {
                o = new a[length - 1];
                System.arraycopy(expectedValue, 0, o, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, o, n3, length - n3 - 1);
            }
        } while (!this.H.compareAndSet(expectedValue, o));
    }
    
    void y8(final Object newValue) {
        this.K.lock();
        ++this.M;
        this.G.lazySet(newValue);
        this.K.unlock();
    }
    
    int z8() {
        return this.H.get().length;
    }
    
    static final class a<T> implements c, io.reactivex.internal.util.a.a<Object>
    {
        final i0<? super T> G;
        final b<T> H;
        boolean I;
        boolean J;
        io.reactivex.internal.util.a<Object> K;
        boolean L;
        volatile boolean M;
        long N;
        
        a(final i0<? super T> g, final b<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean a(final Object o) {
            return this.M || q.b(o, (i0<? super Object>)this.G);
        }
        
        void b() {
            if (this.M) {
                return;
            }
            synchronized (this) {
                if (this.M) {
                    return;
                }
                if (this.I) {
                    return;
                }
                final b<T> h = this.H;
                final Lock j = h.J;
                j.lock();
                this.N = h.M;
                final Object value = h.G.get();
                j.unlock();
                this.J = (value != null);
                this.I = true;
                // monitorexit(this)
                if (value != null) {
                    if (this.a(value)) {
                        return;
                    }
                    this.c();
                }
            }
        }
        
        void c() {
            while (!this.M) {
                synchronized (this) {
                    final io.reactivex.internal.util.a<Object> k = this.K;
                    if (k == null) {
                        this.J = false;
                        return;
                    }
                    this.K = null;
                    // monitorexit(this)
                    k.d((io.reactivex.internal.util.a.a<? super Object>)this);
                }
            }
        }
        
        void d(final Object o, final long n) {
            if (this.M) {
                return;
            }
            if (!this.L) {
                synchronized (this) {
                    if (this.M) {
                        return;
                    }
                    if (this.N == n) {
                        return;
                    }
                    if (this.J) {
                        io.reactivex.internal.util.a<Object> k;
                        if ((k = this.K) == null) {
                            k = new io.reactivex.internal.util.a<Object>(4);
                            this.K = k;
                        }
                        k.c(o);
                        return;
                    }
                    this.I = true;
                    // monitorexit(this)
                    this.L = true;
                }
            }
            this.a(o);
        }
        
        @Override
        public void dispose() {
            if (!this.M) {
                this.M = true;
                this.H.x8(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.M;
        }
    }
}
