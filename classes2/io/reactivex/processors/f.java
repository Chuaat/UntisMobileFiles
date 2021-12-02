// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.annotations.g;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicReference;

public final class f<T> extends io.reactivex.processors.c<T>
{
    private static final Object[] K;
    static final c[] L;
    static final c[] M;
    final b<T> H;
    boolean I;
    final AtomicReference<c<T>[]> J;
    
    static {
        K = new Object[0];
        L = new c[0];
        M = new c[0];
    }
    
    f(final b<T> h) {
        this.H = h;
        this.J = new AtomicReference<c<T>[]>(f.L);
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> W8() {
        return new f<T>((b<T>)new g(16));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> X8(final int n) {
        return new f<T>((b<T>)new g(n));
    }
    
    static <T> f<T> Y8() {
        return new f<T>((b<T>)new e(Integer.MAX_VALUE));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> Z8(final int n) {
        return new f<T>((b<T>)new e(n));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> a9(final long n, final TimeUnit timeUnit, final j0 j0) {
        return new f<T>((b<T>)new d(Integer.MAX_VALUE, n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> b9(final long n, final TimeUnit timeUnit, final j0 j0, final int n2) {
        return new f<T>((b<T>)new d(n2, n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.g
    @Override
    public Throwable P8() {
        final b<T> h = this.H;
        if (h.isDone()) {
            return h.d();
        }
        return null;
    }
    
    @Override
    public boolean Q8() {
        final b<T> h = this.H;
        return h.isDone() && h.d() == null;
    }
    
    @Override
    public boolean R8() {
        return this.J.get().length != 0;
    }
    
    @Override
    public boolean S8() {
        final b<T> h = this.H;
        return h.isDone() && h.d() != null;
    }
    
    boolean U8(final c<T> c) {
        c<T>[] expectedValue;
        c[] newValue;
        do {
            expectedValue = this.J.get();
            if (expectedValue == f.M) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new c[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = c;
        } while (!this.J.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public void V8() {
        this.H.a();
    }
    
    public void b(final Throwable t) {
        io.reactivex.internal.functions.b.g(t, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.I) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.I = true;
        final b<T> h = this.H;
        h.i(t);
        final c<T>[] array = this.J.getAndSet(f.M);
        for (int length = array.length, i = 0; i < length; ++i) {
            h.e(array[i]);
        }
    }
    
    public T c9() {
        return this.H.getValue();
    }
    
    public Object[] d9() {
        final Object[] k = f.K;
        final Object[] e9 = this.e9(k);
        if (e9 == k) {
            return new Object[0];
        }
        return e9;
    }
    
    public T[] e9(final T[] array) {
        return this.H.c(array);
    }
    
    public void f() {
        if (this.I) {
            return;
        }
        this.I = true;
        final b<T> h = this.H;
        h.b();
        final c<T>[] array = this.J.getAndSet(f.M);
        for (int length = array.length, i = 0; i < length; ++i) {
            h.e(array[i]);
        }
    }
    
    public boolean f9() {
        return this.H.size() != 0;
    }
    
    void g9(final c<T> c) {
        c<T>[] expectedValue;
        c[] l;
        do {
            expectedValue = this.J.get();
            if (expectedValue == f.M) {
                break;
            }
            if (expectedValue == f.L) {
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
                if (expectedValue[n2] == c) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                return;
            }
            if (length == 1) {
                l = f.L;
            }
            else {
                l = new c[length - 1];
                System.arraycopy(expectedValue, 0, l, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, l, n3, length - n3 - 1);
            }
        } while (!this.J.compareAndSet(expectedValue, l));
    }
    
    int h9() {
        return this.H.size();
    }
    
    int i9() {
        return this.J.get().length;
    }
    
    public void m(final T t) {
        io.reactivex.internal.functions.b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.I) {
            return;
        }
        final b<T> h = this.H;
        h.f(t);
        final c<T>[] array = this.J.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            h.e(array[i]);
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final c c2 = new c((o7.c<? super T>)c, (f<T>)this);
        c.z((o7.d)c2);
        if (this.U8(c2) && c2.K) {
            this.g9(c2);
            return;
        }
        this.H.e(c2);
    }
    
    public void z(final o7.d d) {
        if (this.I) {
            d.cancel();
            return;
        }
        d.v(Long.MAX_VALUE);
    }
    
    static final class a<T> extends AtomicReference<a<T>>
    {
        private static final long H = 6404226426336033100L;
        final T G;
        
        a(final T g) {
            this.G = g;
        }
    }
    
    interface b<T>
    {
        void a();
        
        void b();
        
        T[] c(final T[] p0);
        
        Throwable d();
        
        void e(final c<T> p0);
        
        void f(final T p0);
        
        @io.reactivex.annotations.g
        T getValue();
        
        void i(final Throwable p0);
        
        boolean isDone();
        
        int size();
    }
    
    static final class c<T> extends AtomicInteger implements o7.d
    {
        private static final long M = 466549804534799122L;
        final o7.c<? super T> G;
        final f<T> H;
        Object I;
        final AtomicLong J;
        volatile boolean K;
        long L;
        
        c(final o7.c<? super T> g, final f<T> h) {
            this.G = g;
            this.H = h;
            this.J = new AtomicLong();
        }
        
        public void cancel() {
            if (!this.K) {
                this.K = true;
                this.H.g9(this);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.H.H.e(this);
            }
        }
    }
    
    static final class d<T> implements b<T>
    {
        final int a;
        final long b;
        final TimeUnit c;
        final j0 d;
        int e;
        volatile f<T> f;
        f<T> g;
        Throwable h;
        volatile boolean i;
        
        d(final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
            this.a = io.reactivex.internal.functions.b.h(n, "maxSize");
            this.b = io.reactivex.internal.functions.b.i(n2, "maxAge");
            this.c = io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
            this.d = io.reactivex.internal.functions.b.g(j0, "scheduler is null");
            final f f = new f(null, 0L);
            this.g = (f<T>)f;
            this.f = (f<T>)f;
        }
        
        @Override
        public void a() {
            if (this.f.G != null) {
                final f f = new f(null, 0L);
                f.lazySet(this.f.get());
                this.f = (f<T>)f;
            }
        }
        
        @Override
        public void b() {
            this.k();
            this.i = true;
        }
        
        @Override
        public T[] c(final T[] array) {
            final f<T> g = this.g();
            final int h = this.h(g);
            final int n = 0;
            Object[] array2;
            if (h == 0) {
                array2 = array;
                if (array.length != 0) {
                    array[0] = null;
                    array2 = array;
                }
            }
            else {
                f<T> f = g;
                int i = n;
                Object[] array3 = array;
                if (array.length < h) {
                    array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), h);
                    i = n;
                    f = g;
                }
                while (i != h) {
                    f = (f<T>)f.get();
                    array3[i] = f.G;
                    ++i;
                }
                array2 = array3;
                if (array3.length > h) {
                    array3[h] = null;
                    array2 = array3;
                }
            }
            return (T[])array2;
        }
        
        @Override
        public Throwable d() {
            return this.h;
        }
        
        @Override
        public void e(final c<T> c) {
            if (c.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super T> g = c.G;
            f<T> g2;
            if ((g2 = (f<T>)c.I) == null) {
                g2 = this.g();
            }
            long l = c.L;
            int addAndGet = 1;
            do {
                final long value = c.J.get();
                long n;
                while (true) {
                    n = lcmp(l, value);
                    if (n == 0) {
                        break;
                    }
                    if (c.K) {
                        c.I = null;
                        return;
                    }
                    final boolean i = this.i;
                    final f<T> f = g2.get();
                    final boolean b = f == null;
                    if (i && b) {
                        c.I = null;
                        c.K = true;
                        final Throwable h = this.h;
                        if (h == null) {
                            g.f();
                        }
                        else {
                            g.b(h);
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m((Object)f.G);
                    ++l;
                    g2 = f;
                }
                if (n == 0) {
                    if (c.K) {
                        c.I = null;
                        return;
                    }
                    if (this.i && g2.get() == null) {
                        c.I = null;
                        c.K = true;
                        final Throwable h2 = this.h;
                        if (h2 == null) {
                            g.f();
                        }
                        else {
                            g.b(h2);
                        }
                        return;
                    }
                }
                c.I = g2;
                c.L = l;
            } while ((addAndGet = c.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void f(final T t) {
            final f f = new f<Object>((T)t, this.d.d(this.c));
            final f<T> g = this.g;
            this.g = (f<T>)f;
            ++this.e;
            g.set((f<T>)f);
            this.j();
        }
        
        f<T> g() {
            f<T> f = this.f;
            f f2;
            AtomicReference<f> atomicReference;
            do {
                atomicReference = (AtomicReference<f>)f;
                f2 = atomicReference.get();
                if (f2 == null) {
                    break;
                }
                f = (f<T>)f2;
            } while (((f)f2).H <= this.d.d(this.c) - this.b);
            return (f<T>)atomicReference;
        }
        
        @io.reactivex.annotations.g
        @Override
        public T getValue() {
            f<T> f = this.f;
            while (true) {
                final f f2 = f.get();
                if (f2 == null) {
                    break;
                }
                f = (f<T>)f2;
            }
            if (f.H < this.d.d(this.c) - this.b) {
                return null;
            }
            return f.G;
        }
        
        int h(f<T> f) {
            int i;
            for (i = 0; i != Integer.MAX_VALUE; ++i) {
                f = f.get();
                if (f == null) {
                    break;
                }
            }
            return i;
        }
        
        @Override
        public void i(final Throwable h) {
            this.k();
            this.h = h;
            this.i = true;
        }
        
        @Override
        public boolean isDone() {
            return this.i;
        }
        
        void j() {
            final int e = this.e;
            if (e > this.a) {
                this.e = e - 1;
                this.f = (f<T>)this.f.get();
            }
            final long d = this.d.d(this.c);
            final long b = this.b;
            f<T> f = this.f;
            while (true) {
                final f f2 = f.get();
                if (f2 == null || ((f)f2).H > d - b) {
                    break;
                }
                f = (f<T>)f2;
            }
            this.f = f;
        }
        
        void k() {
            final long d = this.d.d(this.c);
            final long b = this.b;
            AtomicReference<f<T>> f = this.f;
            Label_0066: {
                f<f<T>> f3;
                while (true) {
                    final f<?> f2 = f.get();
                    if (f2 == null) {
                        if (((f)f).G != null) {
                            f3 = new f<f<T>>(null, 0L);
                            break;
                        }
                        break Label_0066;
                    }
                    else if (f2.H > d - b) {
                        if (((f)f).G != null) {
                            final f<f<T>> f4 = new f<f<T>>(null, 0L);
                            f4.lazySet(f.get());
                            f3 = f4;
                            break;
                        }
                        break Label_0066;
                    }
                    else {
                        f = f2;
                    }
                }
                this.f = (f<T>)f3;
                return;
            }
            this.f = (f<T>)f;
        }
        
        @Override
        public int size() {
            return this.h(this.g());
        }
    }
    
    static final class e<T> implements b<T>
    {
        final int a;
        int b;
        volatile a<T> c;
        a<T> d;
        Throwable e;
        volatile boolean f;
        
        e(final int n) {
            this.a = io.reactivex.internal.functions.b.h(n, "maxSize");
            final a a = new a(null);
            this.d = (a<T>)a;
            this.c = (a<T>)a;
        }
        
        @Override
        public void a() {
            if (this.c.G != null) {
                final a c = new a(null);
                c.lazySet(this.c.get());
                this.c = (a<T>)c;
            }
        }
        
        @Override
        public void b() {
            this.a();
            this.f = true;
        }
        
        @Override
        public T[] c(final T[] array) {
            final a<T> c = this.c;
            final int n = 0;
            a<T> a = c;
            int length = 0;
            while (true) {
                a = (a<T>)a.get();
                if (a == null) {
                    break;
                }
                ++length;
            }
            a<T> a2 = c;
            int i = n;
            Object[] array2 = array;
            if (array.length < length) {
                array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), length);
                i = n;
                a2 = c;
            }
            while (i < length) {
                a2 = (a<T>)a2.get();
                array2[i] = a2.G;
                ++i;
            }
            if (array2.length > length) {
                array2[length] = null;
            }
            return (T[])array2;
        }
        
        @Override
        public Throwable d() {
            return this.e;
        }
        
        @Override
        public void e(final c<T> c) {
            if (c.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super T> g = c.G;
            a<T> c2;
            if ((c2 = (a<T>)c.I) == null) {
                c2 = this.c;
            }
            long l = c.L;
            int addAndGet = 1;
            do {
                final long value = c.J.get();
                long n;
                while (true) {
                    n = lcmp(l, value);
                    if (n == 0) {
                        break;
                    }
                    if (c.K) {
                        c.I = null;
                        return;
                    }
                    final boolean f = this.f;
                    final a<T> a = c2.get();
                    final boolean b = a == null;
                    if (f && b) {
                        c.I = null;
                        c.K = true;
                        final Throwable e = this.e;
                        if (e == null) {
                            g.f();
                        }
                        else {
                            g.b(e);
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m((Object)a.G);
                    ++l;
                    c2 = a;
                }
                if (n == 0) {
                    if (c.K) {
                        c.I = null;
                        return;
                    }
                    if (this.f && c2.get() == null) {
                        c.I = null;
                        c.K = true;
                        final Throwable e2 = this.e;
                        if (e2 == null) {
                            g.f();
                        }
                        else {
                            g.b(e2);
                        }
                        return;
                    }
                }
                c.I = c2;
                c.L = l;
            } while ((addAndGet = c.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void f(final T t) {
            final a a = new a<Object>((T)t);
            final a<T> d = this.d;
            this.d = (a<T>)a;
            ++this.b;
            d.set((a<T>)a);
            this.g();
        }
        
        void g() {
            final int b = this.b;
            if (b > this.a) {
                this.b = b - 1;
                this.c = (a<T>)this.c.get();
            }
        }
        
        @Override
        public T getValue() {
            a<T> c = this.c;
            while (true) {
                final a a = c.get();
                if (a == null) {
                    break;
                }
                c = (a<T>)a;
            }
            return c.G;
        }
        
        @Override
        public void i(final Throwable e) {
            this.e = e;
            this.a();
            this.f = true;
        }
        
        @Override
        public boolean isDone() {
            return this.f;
        }
        
        @Override
        public int size() {
            a<T> c = this.c;
            int i;
            for (i = 0; i != Integer.MAX_VALUE; ++i) {
                c = (a<T>)c.get();
                if (c == null) {
                    break;
                }
            }
            return i;
        }
    }
    
    static final class f<T> extends AtomicReference<f<T>>
    {
        private static final long I = 6404226426336033100L;
        final T G;
        final long H;
        
        f(final T g, final long h) {
            this.G = g;
            this.H = h;
        }
    }
    
    static final class g<T> implements b<T>
    {
        final List<T> a;
        Throwable b;
        volatile boolean c;
        volatile int d;
        
        g(final int n) {
            this.a = new ArrayList<T>(io.reactivex.internal.functions.b.h(n, "capacityHint"));
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public void b() {
            this.c = true;
        }
        
        @Override
        public T[] c(final T[] array) {
            final int d = this.d;
            final int n = 0;
            if (d == 0) {
                if (array.length != 0) {
                    array[0] = null;
                }
                return array;
            }
            final List<T> a = this.a;
            int i = n;
            Object[] array2 = array;
            if (array.length < d) {
                array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), d);
                i = n;
            }
            while (i < d) {
                array2[i] = a.get(i);
                ++i;
            }
            if (array2.length > d) {
                array2[d] = null;
            }
            return (T[])array2;
        }
        
        @Override
        public Throwable d() {
            return this.b;
        }
        
        @Override
        public void e(final c<T> c) {
            if (c.getAndIncrement() != 0) {
                return;
            }
            final List<T> a = this.a;
            final o7.c<? super T> g = c.G;
            final Integer n = (Integer)c.I;
            int intValue = 0;
            if (n != null) {
                intValue = n;
            }
            else {
                c.I = 0;
            }
            long l = c.L;
            int addAndGet = 1;
            do {
                final long value = c.J.get();
                long n2;
                while (true) {
                    n2 = lcmp(l, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (c.K) {
                        c.I = null;
                        return;
                    }
                    final boolean c2 = this.c;
                    final int d = this.d;
                    if (c2 && intValue == d) {
                        c.I = null;
                        c.K = true;
                        final Throwable b = this.b;
                        if (b == null) {
                            g.f();
                        }
                        else {
                            g.b(b);
                        }
                        return;
                    }
                    if (intValue == d) {
                        break;
                    }
                    g.m((Object)a.get(intValue));
                    ++intValue;
                    ++l;
                }
                if (n2 == 0) {
                    if (c.K) {
                        c.I = null;
                        return;
                    }
                    final boolean c3 = this.c;
                    final int d2 = this.d;
                    if (c3 && intValue == d2) {
                        c.I = null;
                        c.K = true;
                        final Throwable b2 = this.b;
                        if (b2 == null) {
                            g.f();
                        }
                        else {
                            g.b(b2);
                        }
                        return;
                    }
                }
                c.I = intValue;
                c.L = l;
            } while ((addAndGet = c.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void f(final T t) {
            this.a.add(t);
            ++this.d;
        }
        
        @io.reactivex.annotations.g
        @Override
        public T getValue() {
            final int d = this.d;
            if (d == 0) {
                return null;
            }
            return this.a.get(d - 1);
        }
        
        @Override
        public void i(final Throwable b) {
            this.b = b;
            this.c = true;
        }
        
        @Override
        public boolean isDone() {
            return this.c;
        }
        
        @Override
        public int size() {
            return this.d;
        }
    }
}
