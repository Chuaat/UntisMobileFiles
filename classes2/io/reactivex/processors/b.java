// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.k;
import io.reactivex.plugins.a;
import java.lang.reflect.Array;
import io.reactivex.annotations.g;
import io.reactivex.internal.util.q;
import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> extends c<T>
{
    static final Object[] O;
    static final a[] P;
    static final a[] Q;
    final AtomicReference<a<T>[]> H;
    final ReadWriteLock I;
    final Lock J;
    final Lock K;
    final AtomicReference<Object> L;
    final AtomicReference<Throwable> M;
    long N;
    
    static {
        O = new Object[0];
        P = new a[0];
        Q = new a[0];
    }
    
    b() {
        this.L = new AtomicReference<Object>();
        final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
        this.I = i;
        this.J = i.readLock();
        this.K = i.writeLock();
        this.H = new AtomicReference<a<T>[]>(b.P);
        this.M = new AtomicReference<Throwable>();
    }
    
    b(final T t) {
        this();
        this.L.lazySet(io.reactivex.internal.functions.b.g(t, "defaultValue is null"));
    }
    
    @d
    @f
    public static <T> b<T> V8() {
        return new b<T>();
    }
    
    @d
    @f
    public static <T> b<T> W8(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultValue is null");
        return new b<T>(t);
    }
    
    @g
    @Override
    public Throwable P8() {
        final Object value = this.L.get();
        if (io.reactivex.internal.util.q.u(value)) {
            return io.reactivex.internal.util.q.l(value);
        }
        return null;
    }
    
    @Override
    public boolean Q8() {
        return io.reactivex.internal.util.q.p(this.L.get());
    }
    
    @Override
    public boolean R8() {
        return this.H.get().length != 0;
    }
    
    @Override
    public boolean S8() {
        return io.reactivex.internal.util.q.u(this.L.get());
    }
    
    boolean U8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == b.Q) {
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
    public T X8() {
        final Object value = this.L.get();
        if (!io.reactivex.internal.util.q.p(value) && !io.reactivex.internal.util.q.u(value)) {
            return (T)io.reactivex.internal.util.q.o(value);
        }
        return null;
    }
    
    @Deprecated
    public Object[] Y8() {
        final Object[] o = b.O;
        final Object[] z8 = this.Z8(o);
        if (z8 == o) {
            return new Object[0];
        }
        return z8;
    }
    
    @Deprecated
    public T[] Z8(final T[] array) {
        final Object value = this.L.get();
        if (value != null && !io.reactivex.internal.util.q.p(value) && !io.reactivex.internal.util.q.u(value)) {
            final Object o = io.reactivex.internal.util.q.o(value);
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
    
    public boolean a9() {
        final Object value = this.L.get();
        return value != null && !io.reactivex.internal.util.q.p(value) && !io.reactivex.internal.util.q.u(value);
    }
    
    public void b(final Throwable newValue) {
        io.reactivex.internal.functions.b.g(newValue, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.M.compareAndSet(null, newValue)) {
            io.reactivex.plugins.a.Y(newValue);
            return;
        }
        final Object j = io.reactivex.internal.util.q.j(newValue);
        final a<T>[] f9 = this.f9(j);
        for (int length = f9.length, i = 0; i < length; ++i) {
            f9[i].d(j, this.N);
        }
    }
    
    public boolean b9(final T t) {
        if (t == null) {
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        final a<T>[] array = this.H.get();
        final int length = array.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            if (array[i].e()) {
                return false;
            }
        }
        final Object y = io.reactivex.internal.util.q.y(t);
        this.d9(y);
        for (int length2 = array.length, j = n; j < length2; ++j) {
            array[j].d(y, this.N);
        }
        return true;
    }
    
    void c9(final a<T> a) {
        a<T>[] expectedValue;
        a[] p;
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
                p = b.P;
            }
            else {
                p = new a[length - 1];
                System.arraycopy(expectedValue, 0, p, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, p, n3, length - n3 - 1);
            }
        } while (!this.H.compareAndSet(expectedValue, p));
    }
    
    void d9(final Object newValue) {
        final Lock k = this.K;
        k.lock();
        ++this.N;
        this.L.lazySet(newValue);
        k.unlock();
    }
    
    int e9() {
        return this.H.get().length;
    }
    
    public void f() {
        if (!this.M.compareAndSet(null, k.a)) {
            return;
        }
        final Object h = io.reactivex.internal.util.q.h();
        final a<T>[] f9 = this.f9(h);
        for (int length = f9.length, i = 0; i < length; ++i) {
            f9[i].d(h, this.N);
        }
    }
    
    a<T>[] f9(final Object o) {
        final a<T>[] array = this.H.get();
        final a[] q = b.Q;
        a<T>[] array2 = array;
        if (array != q) {
            final a<T>[] array3 = this.H.getAndSet(q);
            if ((array2 = array3) != q) {
                this.d9(o);
                array2 = array3;
            }
        }
        return array2;
    }
    
    public void m(final T t) {
        io.reactivex.internal.functions.b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.M.get() != null) {
            return;
        }
        final Object y = io.reactivex.internal.util.q.y(t);
        this.d9(y);
        final a<T>[] array = this.H.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].d(y, this.N);
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final a a = new a((o7.c<? super T>)c, (b<T>)this);
        c.z((o7.d)a);
        if (this.U8(a)) {
            if (a.M) {
                this.c9(a);
            }
            else {
                a.b();
            }
        }
        else {
            final Throwable t = this.M.get();
            if (t == k.a) {
                c.f();
            }
            else {
                c.b(t);
            }
        }
    }
    
    public void z(final o7.d d) {
        if (this.M.get() != null) {
            d.cancel();
            return;
        }
        d.v(Long.MAX_VALUE);
    }
    
    static final class a<T> extends AtomicLong implements o7.d, io.reactivex.internal.util.a.a<Object>
    {
        private static final long O = 3293175281126227086L;
        final o7.c<? super T> G;
        final b<T> H;
        boolean I;
        boolean J;
        io.reactivex.internal.util.a<Object> K;
        boolean L;
        volatile boolean M;
        long N;
        
        a(final o7.c<? super T> g, final b<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public boolean a(final Object o) {
            if (this.M) {
                return true;
            }
            if (io.reactivex.internal.util.q.p(o)) {
                this.G.f();
                return true;
            }
            if (io.reactivex.internal.util.q.u(o)) {
                this.G.b(io.reactivex.internal.util.q.l(o));
                return true;
            }
            final long value = this.get();
            if (value != 0L) {
                this.G.m(io.reactivex.internal.util.q.o(o));
                if (value != Long.MAX_VALUE) {
                    this.decrementAndGet();
                }
                return false;
            }
            this.cancel();
            this.G.b((Throwable)new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
            return true;
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
                this.N = h.N;
                final Object value = h.L.get();
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
        
        public void cancel() {
            if (!this.M) {
                this.M = true;
                this.H.c9(this);
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
        
        public boolean e() {
            return this.get() == 0L;
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
    }
}
