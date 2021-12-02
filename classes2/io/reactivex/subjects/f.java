// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.annotations.g;
import io.reactivex.internal.util.q;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.d;
import java.util.concurrent.atomic.AtomicReference;

public final class f<T> extends i<T>
{
    static final c[] J;
    static final c[] K;
    private static final Object[] L;
    final b<T> G;
    final AtomicReference<c<T>[]> H;
    boolean I;
    
    static {
        J = new c[0];
        K = new c[0];
        L = new Object[0];
    }
    
    f(final b<T> g) {
        this.G = g;
        this.H = new AtomicReference<c<T>[]>(f.J);
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> s8() {
        return new f<T>((b<T>)new g(16));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> t8(final int n) {
        return new f<T>((b<T>)new g(n));
    }
    
    static <T> f<T> u8() {
        return new f<T>((b<T>)new e(Integer.MAX_VALUE));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> v8(final int n) {
        return new f<T>((b<T>)new e(n));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> w8(final long n, final TimeUnit timeUnit, final j0 j0) {
        return new f<T>((b<T>)new d(Integer.MAX_VALUE, n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> f<T> x8(final long n, final TimeUnit timeUnit, final j0 j0, final int n2) {
        return new f<T>((b<T>)new d(n2, n, timeUnit, j0));
    }
    
    public T[] A8(final T[] array) {
        return this.G.c(array);
    }
    
    public boolean B8() {
        return this.G.size() != 0;
    }
    
    int C8() {
        return this.H.get().length;
    }
    
    void D8(final c<T> c) {
        c<T>[] expectedValue;
        c[] j;
        do {
            expectedValue = this.H.get();
            if (expectedValue == f.K) {
                break;
            }
            if (expectedValue == f.J) {
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
                j = f.J;
            }
            else {
                j = new c[length - 1];
                System.arraycopy(expectedValue, 0, j, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, j, n3, length - n3 - 1);
            }
        } while (!this.H.compareAndSet(expectedValue, j));
    }
    
    int E8() {
        return this.G.size();
    }
    
    c<T>[] F8(final Object o) {
        if (this.G.compareAndSet(null, o)) {
            return this.H.getAndSet(f.K);
        }
        return (c<T>[])f.K;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final c<T> c = new c<T>(i0, this);
        i0.l(c);
        if (!c.J) {
            if (this.q8(c) && c.J) {
                this.D8(c);
                return;
            }
            this.G.d(c);
        }
    }
    
    @Override
    public void b(final Throwable t) {
        io.reactivex.internal.functions.b.g(t, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.I) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.I = true;
        final Object j = q.j(t);
        final b<T> g = this.G;
        g.b(j);
        final c<T>[] f8 = this.F8(j);
        for (int length = f8.length, i = 0; i < length; ++i) {
            g.d(f8[i]);
        }
    }
    
    @Override
    public void f() {
        if (this.I) {
            return;
        }
        this.I = true;
        final Object h = q.h();
        final b<T> g = this.G;
        g.b(h);
        final c<T>[] f8 = this.F8(h);
        for (int length = f8.length, i = 0; i < length; ++i) {
            g.d(f8[i]);
        }
    }
    
    @Override
    public void l(final io.reactivex.disposables.c c) {
        if (this.I) {
            c.dispose();
        }
    }
    
    @io.reactivex.annotations.g
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
        if (this.I) {
            return;
        }
        final b<T> g = this.G;
        g.add(t);
        final c<T>[] array = this.H.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            g.d(array[i]);
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
    
    boolean q8(final c<T> c) {
        c<T>[] expectedValue;
        c[] newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue == f.K) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new c[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = c;
        } while (!this.H.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public void r8() {
        this.G.a();
    }
    
    @io.reactivex.annotations.g
    public T y8() {
        return this.G.getValue();
    }
    
    public Object[] z8() {
        final Object[] l = f.L;
        final Object[] a8 = this.A8(l);
        if (a8 == l) {
            return new Object[0];
        }
        return a8;
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
        
        void add(final T p0);
        
        void b(final Object p0);
        
        T[] c(final T[] p0);
        
        boolean compareAndSet(final Object p0, final Object p1);
        
        void d(final c<T> p0);
        
        Object get();
        
        @io.reactivex.annotations.g
        T getValue();
        
        int size();
    }
    
    static final class c<T> extends AtomicInteger implements io.reactivex.disposables.c
    {
        private static final long K = 466549804534799122L;
        final i0<? super T> G;
        final f<T> H;
        Object I;
        volatile boolean J;
        
        c(final i0<? super T> g, final f<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void dispose() {
            if (!this.J) {
                this.J = true;
                this.H.D8(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.J;
        }
    }
    
    static final class d<T> extends AtomicReference<Object> implements b<T>
    {
        private static final long O = -8056260896137901749L;
        final int G;
        final long H;
        final TimeUnit I;
        final j0 J;
        int K;
        volatile f<Object> L;
        f<Object> M;
        volatile boolean N;
        
        d(final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
            this.G = io.reactivex.internal.functions.b.h(n, "maxSize");
            this.H = io.reactivex.internal.functions.b.i(n2, "maxAge");
            this.I = io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
            this.J = io.reactivex.internal.functions.b.g(j0, "scheduler is null");
            final f f = new f(null, 0L);
            this.M = (f<Object>)f;
            this.L = (f<Object>)f;
        }
        
        @Override
        public void a() {
            final f<Object> l = this.L;
            if (l.G != null) {
                final f i = new f(null, 0L);
                i.lazySet(l.get());
                this.L = (f<Object>)i;
            }
        }
        
        @Override
        public void add(final T t) {
            final f f = new f<Object>((T)t, this.J.d(this.I));
            final f<Object> m = this.M;
            this.M = (f<Object>)f;
            ++this.K;
            m.set((f<Object>)f);
            this.g();
        }
        
        @Override
        public void b(final Object o) {
            final f f = new f<Object>((T)o, Long.MAX_VALUE);
            final f<Object> m = this.M;
            this.M = (f<Object>)f;
            ++this.K;
            m.lazySet((f<Object>)f);
            this.h();
            this.N = true;
        }
        
        @Override
        public T[] c(final T[] array) {
            final f<Object> e = this.e();
            final int f = this.f(e);
            final int n = 0;
            Object[] array2;
            if (f == 0) {
                array2 = array;
                if (array.length != 0) {
                    array[0] = null;
                    array2 = array;
                }
            }
            else {
                f<Object> f2 = e;
                int i = n;
                Object[] array3 = array;
                if (array.length < f) {
                    array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), f);
                    i = n;
                    f2 = e;
                }
                while (i != f) {
                    f2 = (f<Object>)f2.get();
                    array3[i] = f2.G;
                    ++i;
                }
                array2 = array3;
                if (array3.length > f) {
                    array3[f] = null;
                    array2 = array3;
                }
            }
            return (T[])array2;
        }
        
        @Override
        public void d(final c<T> c) {
            if (c.getAndIncrement() != 0) {
                return;
            }
            final i0<? super T> g = c.G;
            Serializable e;
            if ((e = (f)c.I) == null) {
                e = this.e();
            }
            int addAndGet = 1;
        Label_0037:
            while (!c.J) {
                while (!c.J) {
                    final f f = ((AtomicReference<f>)e).get();
                    if (f == null) {
                        if (((AtomicReference<f>)e).get() != null) {
                            continue Label_0037;
                        }
                        c.I = e;
                        if ((addAndGet = c.addAndGet(-addAndGet)) == 0) {
                            return;
                        }
                        continue Label_0037;
                    }
                    else {
                        final T g2 = ((f)f).G;
                        if (this.N && f.get() == null) {
                            if (q.p(g2)) {
                                g.f();
                            }
                            else {
                                g.b(q.l(g2));
                            }
                            c.I = null;
                            c.J = true;
                            return;
                        }
                        g.m(g2);
                        e = f;
                    }
                }
                c.I = null;
                return;
            }
            c.I = null;
        }
        
        f<Object> e() {
            f<Object> l = this.L;
            f f;
            AtomicReference<f> atomicReference;
            do {
                atomicReference = (AtomicReference<f>)l;
                f = atomicReference.get();
                if (f == null) {
                    break;
                }
                l = (f<Object>)f;
            } while (((f)f).H <= this.J.d(this.I) - this.H);
            return (f<Object>)atomicReference;
        }
        
        int f(f<Object> f) {
            int n = 0;
            int n2;
            while (true) {
                n2 = n;
                if (n == Integer.MAX_VALUE) {
                    break;
                }
                final f f2 = f.get();
                if (f2 == null) {
                    final T g = ((f)f).G;
                    if (!q.p(g)) {
                        n2 = n;
                        if (!q.u(g)) {
                            break;
                        }
                    }
                    n2 = n - 1;
                    break;
                }
                ++n;
                f = f2;
            }
            return n2;
        }
        
        void g() {
            final int k = this.K;
            if (k > this.G) {
                this.K = k - 1;
                this.L = (f<Object>)this.L.get();
            }
            final long d = this.J.d(this.I);
            final long h = this.H;
            f<Object> l = this.L;
            while (true) {
                final f f = l.get();
                if (f == null || ((f)f).H > d - h) {
                    break;
                }
                l = (f<Object>)f;
            }
            this.L = l;
        }
        
        @io.reactivex.annotations.g
        @Override
        public T getValue() {
            f<Object> l = this.L;
            f<Object> f = null;
            while (true) {
                final f f2 = l.get();
                if (f2 == null) {
                    break;
                }
                f = l;
                l = (f<Object>)f2;
            }
            if (l.H < this.J.d(this.I) - this.H) {
                return null;
            }
            final Object g = l.G;
            if (g == null) {
                return null;
            }
            if (!q.p(g) && !q.u(g)) {
                return (T)g;
            }
            return (T)f.G;
        }
        
        void h() {
            final long d = this.J.d(this.I);
            final long h = this.H;
            f<Object> l = this.L;
            Label_0079: {
                f i;
                while (true) {
                    final f<?> f = l.get();
                    if (f.get() == null) {
                        if (l.G != null) {
                            i = new f(null, 0L);
                            break;
                        }
                        break Label_0079;
                    }
                    else if (f.H > d - h) {
                        if (l.G != null) {
                            i = new f(null, 0L);
                            break;
                        }
                        break Label_0079;
                    }
                    else {
                        l = (f<Object>)f;
                    }
                }
                i.lazySet(l.get());
                this.L = (f<Object>)i;
                return;
            }
            this.L = l;
        }
        
        @Override
        public int size() {
            return this.f(this.e());
        }
    }
    
    static final class e<T> extends AtomicReference<Object> implements b<T>
    {
        private static final long L = 1107649250281456395L;
        final int G;
        int H;
        volatile a<Object> I;
        a<Object> J;
        volatile boolean K;
        
        e(final int n) {
            this.G = io.reactivex.internal.functions.b.h(n, "maxSize");
            final a a = new a(null);
            this.J = (a<Object>)a;
            this.I = (a<Object>)a;
        }
        
        @Override
        public void a() {
            final a<Object> i = this.I;
            if (i.G != null) {
                final a j = new a(null);
                j.lazySet(i.get());
                this.I = (a<Object>)j;
            }
        }
        
        @Override
        public void add(final T t) {
            final a a = new a<Object>((T)t);
            final a<Object> j = this.J;
            this.J = (a<Object>)a;
            ++this.H;
            j.set((a<Object>)a);
            this.e();
        }
        
        @Override
        public void b(final Object o) {
            final a a = new a<Object>((T)o);
            final a<Object> j = this.J;
            this.J = (a<Object>)a;
            ++this.H;
            j.lazySet((a<Object>)a);
            this.a();
            this.K = true;
        }
        
        @Override
        public T[] c(final T[] array) {
            final a<Object> i = this.I;
            final int size = this.size();
            final int n = 0;
            Object[] array2;
            if (size == 0) {
                array2 = array;
                if (array.length != 0) {
                    array[0] = null;
                    array2 = array;
                }
            }
            else {
                a<Object> a = i;
                int j = n;
                Object[] array3 = array;
                if (array.length < size) {
                    array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), size);
                    j = n;
                    a = i;
                }
                while (j != size) {
                    a = (a<Object>)a.get();
                    array3[j] = a.G;
                    ++j;
                }
                array2 = array3;
                if (array3.length > size) {
                    array3[size] = null;
                    array2 = array3;
                }
            }
            return (T[])array2;
        }
        
        @Override
        public void d(final c<T> c) {
            if (c.getAndIncrement() != 0) {
                return;
            }
            final i0<? super T> g = c.G;
            Serializable i;
            if ((i = (a)c.I) == null) {
                i = this.I;
            }
            int addAndGet = 1;
            while (!c.J) {
                final a a = ((AtomicReference<a>)i).get();
                if (a == null) {
                    if (((AtomicReference<a>)i).get() != null) {
                        continue;
                    }
                    c.I = i;
                    if ((addAndGet = c.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    final T g2 = ((a)a).G;
                    if (this.K && a.get() == null) {
                        if (q.p(g2)) {
                            g.f();
                        }
                        else {
                            g.b(q.l(g2));
                        }
                        c.I = null;
                        c.J = true;
                        return;
                    }
                    g.m(g2);
                    i = a;
                }
            }
            c.I = null;
        }
        
        void e() {
            final int h = this.H;
            if (h > this.G) {
                this.H = h - 1;
                this.I = (a<Object>)this.I.get();
            }
        }
        
        @io.reactivex.annotations.g
        @Override
        public T getValue() {
            a<Object> i = this.I;
            a<Object> a = null;
            while (true) {
                final a a2 = i.get();
                if (a2 == null) {
                    break;
                }
                a = i;
                i = (a<Object>)a2;
            }
            final Object g = i.G;
            if (g == null) {
                return null;
            }
            if (!q.p(g) && !q.u(g)) {
                return (T)g;
            }
            return (T)a.G;
        }
        
        @Override
        public int size() {
            a<Object> i = this.I;
            int n = 0;
            int n2;
            while (true) {
                n2 = n;
                if (n == Integer.MAX_VALUE) {
                    break;
                }
                final a a = i.get();
                if (a == null) {
                    final Object g = i.G;
                    if (!q.p(g)) {
                        n2 = n;
                        if (!q.u(g)) {
                            break;
                        }
                    }
                    n2 = n - 1;
                    break;
                }
                ++n;
                i = (a<Object>)a;
            }
            return n2;
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
    
    static final class g<T> extends AtomicReference<Object> implements b<T>
    {
        private static final long J = -733876083048047795L;
        final List<Object> G;
        volatile boolean H;
        volatile int I;
        
        g(final int n) {
            this.G = new ArrayList<Object>(io.reactivex.internal.functions.b.h(n, "capacityHint"));
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public void add(final T t) {
            this.G.add(t);
            ++this.I;
        }
        
        @Override
        public void b(final Object o) {
            this.G.add(o);
            this.a();
            ++this.I;
            this.H = true;
        }
        
        @Override
        public T[] c(final T[] array) {
            int i = this.I;
            final int n = 0;
            if (i == 0) {
                if (array.length != 0) {
                    array[0] = null;
                }
                return array;
            }
            final List<Object> g = this.G;
            final Object value = g.get(i - 1);
            int length = 0;
            Label_0080: {
                if (!q.p(value)) {
                    length = i;
                    if (!q.u(value)) {
                        break Label_0080;
                    }
                }
                length = --i;
                if (i == 0) {
                    if (array.length != 0) {
                        array[0] = null;
                    }
                    return array;
                }
            }
            int j = n;
            Object[] array2 = array;
            if (array.length < length) {
                array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), length);
                j = n;
            }
            while (j < length) {
                array2[j] = g.get(j);
                ++j;
            }
            if (array2.length > length) {
                array2[length] = null;
            }
            return (T[])array2;
        }
        
        @Override
        public void d(final c<T> c) {
            if (c.getAndIncrement() != 0) {
                return;
            }
            final List<Object> g = this.G;
            final i0<? super T> g2 = c.G;
            final Integer n = (Integer)c.I;
            int intValue = 0;
            if (n != null) {
                intValue = n;
            }
            else {
                c.I = 0;
            }
            final int n2 = 1;
            int i = intValue;
            int addAndGet = n2;
            while (!c.J) {
                int k;
                for (int j = this.I; j != i; ++i, j = k) {
                    if (c.J) {
                        c.I = null;
                        return;
                    }
                    final Object value = g.get(i);
                    k = j;
                    if (this.H) {
                        final int n3 = i + 1;
                        if (n3 == (k = j) && n3 == (k = this.I)) {
                            if (q.p(value)) {
                                g2.f();
                            }
                            else {
                                g2.b(q.l(value));
                            }
                            c.I = null;
                            c.J = true;
                            return;
                        }
                    }
                    g2.m(value);
                }
                if (i != this.I) {
                    continue;
                }
                c.I = i;
                if ((addAndGet = c.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            c.I = null;
        }
        
        @io.reactivex.annotations.g
        @Override
        public T getValue() {
            final int i = this.I;
            if (i == 0) {
                return null;
            }
            final List<Object> g = this.G;
            final Object value = g.get(i - 1);
            if (!q.p(value) && !q.u(value)) {
                return (T)value;
            }
            if (i == 1) {
                return null;
            }
            return (T)g.get(i - 2);
        }
        
        @Override
        public int size() {
            final int i = this.I;
            if (i == 0) {
                return 0;
            }
            final List<Object> g = this.G;
            final int n = i - 1;
            final Object value = g.get(n);
            if (!q.p(value) && !q.u(value)) {
                return i;
            }
            return n;
        }
    }
}
