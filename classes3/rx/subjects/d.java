// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import java.lang.reflect.Array;
import java.util.List;
import rx.h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.io.Serializable;
import rx.internal.operators.a;
import java.util.concurrent.atomic.AtomicLong;
import rx.n;
import rx.o;
import rx.i;
import java.util.concurrent.atomic.AtomicInteger;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.schedulers.c;
import rx.g;

public final class d<T> extends rx.subjects.f<T, T>
{
    private static final Object[] I;
    final e<T> H;
    
    static {
        I = new Object[0];
    }
    
    d(final e<T> h) {
        super(h);
        this.H = h;
    }
    
    public static <T> d<T> G7() {
        return H7(16);
    }
    
    public static <T> d<T> H7(final int i) {
        if (i > 0) {
            return new d<T>(new e<T>(new f<T>(i)));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("capacity > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static <T> d<T> I7() {
        return new d<T>(new e<T>(new d<T>(Integer.MAX_VALUE)));
    }
    
    static <T> d<T> J7() {
        return new d<T>(new e<T>(new c<T>(Integer.MAX_VALUE, Long.MAX_VALUE, rx.schedulers.c.d())));
    }
    
    public static <T> d<T> K7(final int n) {
        return new d<T>(new e<T>(new d<T>(n)));
    }
    
    public static <T> d<T> L7(final long n, final TimeUnit timeUnit, final j j) {
        return M7(n, timeUnit, Integer.MAX_VALUE, j);
    }
    
    public static <T> d<T> M7(final long duration, final TimeUnit timeUnit, final int n, final j j) {
        return new d<T>(new e<T>(new c<T>(n, timeUnit.toMillis(duration), j)));
    }
    
    @Override
    public boolean E7() {
        return ((b[])this.H.get()).length != 0;
    }
    
    public Throwable N7() {
        if (this.H.r()) {
            return this.H.G.c();
        }
        return null;
    }
    
    public T O7() {
        return this.H.G.f1();
    }
    
    public Object[] P7() {
        final Object[] i = d.I;
        final Object[] q7 = this.Q7(i);
        if (q7 == i) {
            return new Object[0];
        }
        return q7;
    }
    
    public T[] Q7(final T[] array) {
        return this.H.G.toArray(array);
    }
    
    public boolean R7() {
        return this.H.G.isEmpty() ^ true;
    }
    
    public boolean S7() {
        return this.H.r() && this.H.G.c() == null;
    }
    
    public boolean T7() {
        return this.H.r() && this.H.G.c() != null;
    }
    
    public boolean U7() {
        return this.R7();
    }
    
    public int V7() {
        return this.H.G.size();
    }
    
    int W7() {
        return ((b[])this.H.get()).length;
    }
    
    @Override
    public void b(final Throwable t) {
        this.H.b(t);
    }
    
    @Override
    public void c() {
        this.H.c();
    }
    
    @Override
    public void m(final T t) {
        this.H.m(t);
    }
    
    interface a<T>
    {
        void a(final b<T> p0);
        
        void b();
        
        Throwable c();
        
        boolean d();
        
        void f(final T p0);
        
        T f1();
        
        void i(final Throwable p0);
        
        boolean isEmpty();
        
        int size();
        
        T[] toArray(final T[] p0);
    }
    
    static final class b<T> extends AtomicInteger implements i, o
    {
        private static final long M = -5006209596735204567L;
        final n<? super T> G;
        final AtomicLong H;
        final e<T> I;
        int J;
        int K;
        Object L;
        
        public b(final n<? super T> g, final e<T> i) {
            this.G = g;
            this.H = new AtomicLong();
            this.I = i;
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            this.I.t(this);
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n > 0) {
                a.b(this.H, lng);
                this.I.G.a(this);
            }
            else if (n < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("n >= required but it was ");
                sb.append(lng);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
    
    static final class c<T> implements rx.subjects.d.a<T>
    {
        final int a;
        final long b;
        final j c;
        volatile a<T> d;
        a<T> e;
        int f;
        volatile boolean g;
        Throwable h;
        
        public c(final int a, final long b, final j c) {
            this.a = a;
            final a<T> a2 = new a<T>(null, 0L);
            this.e = a2;
            this.d = a2;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public void a(final b<T> b) {
            if (b.getAndIncrement() != 0) {
                return;
            }
            final n<? super T> g = b.G;
            int addAndGet = 1;
            do {
                final long value = b.H.get();
                a<T> g2;
                if ((g2 = (a<T>)b.L) == null) {
                    g2 = this.g();
                }
                long n = 0L;
                int n2;
                long n3;
                while (true) {
                    n2 = 0;
                    n3 = lcmp(n, value);
                    if (n3 == 0) {
                        break;
                    }
                    if (g.g()) {
                        b.L = null;
                        return;
                    }
                    final boolean g3 = this.g;
                    final a<T> a = g2.get();
                    final boolean b2 = a == null;
                    if (g3 && b2) {
                        b.L = null;
                        final Throwable h = this.h;
                        if (h != null) {
                            g.b(h);
                        }
                        else {
                            g.c();
                        }
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    g.m((T)a.G);
                    ++n;
                    g2 = a;
                }
                if (n3 == 0) {
                    if (g.g()) {
                        b.L = null;
                        return;
                    }
                    final boolean g4 = this.g;
                    int n4 = n2;
                    if (g2.get() == null) {
                        n4 = 1;
                    }
                    if (g4 && n4 != 0) {
                        b.L = null;
                        final Throwable h2 = this.h;
                        if (h2 != null) {
                            g.b(h2);
                        }
                        else {
                            g.c();
                        }
                        return;
                    }
                }
                if (n != 0L && value != Long.MAX_VALUE) {
                    rx.internal.operators.a.i(b.H, n);
                }
                b.L = g2;
            } while ((addAndGet = b.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void b() {
            this.e();
            this.g = true;
        }
        
        @Override
        public Throwable c() {
            return this.h;
        }
        
        @Override
        public boolean d() {
            return this.g;
        }
        
        void e() {
            final long b = this.c.b();
            final long b2 = this.b;
            a<T> d;
            final a<T> a = d = this.d;
            while (true) {
                final a<T> a2 = d.get();
                if (a2 == null || a2.H > b - b2) {
                    break;
                }
                d = a2;
            }
            if (a != d) {
                this.d = d;
            }
        }
        
        @Override
        public void f(final T t) {
            final long b = this.c.b();
            final a a = new a<T>(t, b);
            this.e.set(a);
            this.e = (a<T>)a;
            final long b2 = this.b;
            int f = this.f;
            final a<T> d = this.d;
            Serializable d2;
            if (f == this.a) {
                d2 = d.get();
            }
            else {
                ++f;
                d2 = d;
            }
            while (true) {
                final a<T> a2 = ((AtomicReference<a<T>>)d2).get();
                if (a2 == null || a2.H > b - b2) {
                    break;
                }
                --f;
                d2 = a2;
            }
            this.f = f;
            if (d2 != d) {
                this.d = (a<T>)d2;
            }
        }
        
        @Override
        public T f1() {
            a<T> g = this.g();
            while (true) {
                final a<T> a = g.get();
                if (a == null) {
                    break;
                }
                g = a;
            }
            return g.G;
        }
        
        a<T> g() {
            final long b = this.c.b();
            final long b2 = this.b;
            Serializable d = this.d;
            while (true) {
                final a a = ((AtomicReference<a>)d).get();
                if (a == null || a.H > b - b2) {
                    break;
                }
                d = a;
            }
            return (a<T>)d;
        }
        
        @Override
        public void i(final Throwable h) {
            this.e();
            this.h = h;
            this.g = true;
        }
        
        @Override
        public boolean isEmpty() {
            return this.g().get() == null;
        }
        
        @Override
        public int size() {
            a a;
            int n;
            for (a = this.g().get(), n = 0; a != null && n != Integer.MAX_VALUE; a = a.get(), ++n) {}
            return n;
        }
        
        @Override
        public T[] toArray(final T[] array) {
            final ArrayList<Object> list = new ArrayList<Object>();
            a<T> g = this.g();
            while (true) {
                g = g.get();
                if (g == null) {
                    break;
                }
                list.add(g.G);
            }
            return list.toArray(array);
        }
        
        static final class a<T> extends AtomicReference<a<T>>
        {
            private static final long I = 3713592843205853725L;
            final T G;
            final long H;
            
            public a(final T g, final long h) {
                this.G = g;
                this.H = h;
            }
        }
    }
    
    static final class d<T> implements rx.subjects.d.a<T>
    {
        final int a;
        volatile a<T> b;
        a<T> c;
        int d;
        volatile boolean e;
        Throwable f;
        
        public d(final int a) {
            this.a = a;
            final a<T> a2 = new a<T>(null);
            this.c = a2;
            this.b = a2;
        }
        
        @Override
        public void a(final b<T> b) {
            if (b.getAndIncrement() != 0) {
                return;
            }
            final n<? super T> g = b.G;
            int addAndGet = 1;
            do {
                final long value = b.H.get();
                a<T> b2;
                if ((b2 = (a<T>)b.L) == null) {
                    b2 = this.b;
                }
                long n = 0L;
                int n2;
                long n3;
                while (true) {
                    n2 = 0;
                    n3 = lcmp(n, value);
                    if (n3 == 0) {
                        break;
                    }
                    if (g.g()) {
                        b.L = null;
                        return;
                    }
                    final boolean e = this.e;
                    final a<T> a = b2.get();
                    final boolean b3 = a == null;
                    if (e && b3) {
                        b.L = null;
                        final Throwable f = this.f;
                        if (f != null) {
                            g.b(f);
                        }
                        else {
                            g.c();
                        }
                        return;
                    }
                    if (b3) {
                        break;
                    }
                    g.m((T)a.G);
                    ++n;
                    b2 = a;
                }
                if (n3 == 0) {
                    if (g.g()) {
                        b.L = null;
                        return;
                    }
                    final boolean e2 = this.e;
                    int n4 = n2;
                    if (b2.get() == null) {
                        n4 = 1;
                    }
                    if (e2 && n4 != 0) {
                        b.L = null;
                        final Throwable f2 = this.f;
                        if (f2 != null) {
                            g.b(f2);
                        }
                        else {
                            g.c();
                        }
                        return;
                    }
                }
                if (n != 0L && value != Long.MAX_VALUE) {
                    rx.internal.operators.a.i(b.H, n);
                }
                b.L = b2;
            } while ((addAndGet = b.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void b() {
            this.e = true;
        }
        
        @Override
        public Throwable c() {
            return this.f;
        }
        
        @Override
        public boolean d() {
            return this.e;
        }
        
        @Override
        public void f(final T t) {
            final a<T> a = new a<T>(t);
            this.c.set((a<T>)a);
            this.c = a;
            final int d = this.d;
            if (d == this.a) {
                this.b = (a<T>)this.b.get();
            }
            else {
                this.d = d + 1;
            }
        }
        
        @Override
        public T f1() {
            a<T> b = this.b;
            while (true) {
                final a<T> a = b.get();
                if (a == null) {
                    break;
                }
                b = a;
            }
            return b.G;
        }
        
        @Override
        public void i(final Throwable f) {
            this.f = f;
            this.e = true;
        }
        
        @Override
        public boolean isEmpty() {
            return this.b.get() == null;
        }
        
        @Override
        public int size() {
            a a;
            int n;
            for (a = this.b.get(), n = 0; a != null && n != Integer.MAX_VALUE; a = a.get(), ++n) {}
            return n;
        }
        
        @Override
        public T[] toArray(final T[] array) {
            final ArrayList<Object> list = new ArrayList<Object>();
            a<T> b = this.b;
            while (true) {
                b = b.get();
                if (b == null) {
                    break;
                }
                list.add(b.G);
            }
            return list.toArray(array);
        }
        
        static final class a<T> extends AtomicReference<a<T>>
        {
            private static final long H = 3713592843205853725L;
            final T G;
            
            public a(final T g) {
                this.G = g;
            }
        }
    }
    
    static final class e<T> extends AtomicReference<b<T>[]> implements g.a<T>, h<T>
    {
        private static final long H = 5952362471246910544L;
        static final b[] I;
        static final b[] J;
        final a<T> G;
        
        static {
            I = new b[0];
            J = new b[0];
        }
        
        public e(final a<T> g) {
            this.G = g;
            this.lazySet(e.I);
        }
        
        @Override
        public void b(Throwable t) {
            final a<T> g = this.G;
            g.i(t);
            final b[] array = this.getAndSet(e.J);
            final int length = array.length;
            t = null;
            for (final b b : array) {
                try {
                    g.a(b);
                }
                finally {
                    Object o = t;
                    if (t == null) {
                        o = new ArrayList<Throwable>();
                    }
                    final Throwable t2;
                    ((List<Throwable>)o).add(t2);
                    t = (Throwable)o;
                }
            }
            rx.exceptions.c.d((List<? extends Throwable>)t);
        }
        
        @Override
        public void c() {
            final a<T> g = this.G;
            g.b();
            final b[] array = this.getAndSet(e.J);
            for (int length = array.length, i = 0; i < length; ++i) {
                g.a(array[i]);
            }
        }
        
        @Override
        public void m(final T t) {
            final a<T> g = this.G;
            g.f(t);
            final b[] array = this.get();
            for (int length = array.length, i = 0; i < length; ++i) {
                g.a(array[i]);
            }
        }
        
        boolean n(final b<T> b) {
            b[] expectedValue;
            b[] newValue;
            do {
                expectedValue = (b[])this.get();
                if (expectedValue == e.J) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new b[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = b;
            } while (!this.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        public void q(final n<? super T> n) {
            final b b = new b(n, (e)this);
            n.r(b);
            n.s0(b);
            if (this.n((b<T>)b) && b.g()) {
                this.t((b<T>)b);
                return;
            }
            this.G.a((b<T>)b);
        }
        
        boolean r() {
            return this.get() == e.J;
        }
        
        void t(final b<T> b) {
            b[] expectedValue;
            b[] i;
            do {
                expectedValue = (b[])this.get();
                if (expectedValue == e.J) {
                    break;
                }
                if (expectedValue == e.I) {
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
                    if (expectedValue[n2] == b) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    i = e.I;
                }
                else {
                    i = new b[length - 1];
                    System.arraycopy(expectedValue, 0, i, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, i, n3, length - n3 - 1);
                }
            } while (!this.compareAndSet(expectedValue, i));
        }
    }
    
    static final class f<T> implements a<T>
    {
        final int a;
        volatile int b;
        final Object[] c;
        Object[] d;
        int e;
        volatile boolean f;
        Throwable g;
        
        public f(final int a) {
            this.a = a;
            final Object[] array = new Object[a + 1];
            this.c = array;
            this.d = array;
        }
        
        @Override
        public void a(final b<T> b) {
            if (b.getAndIncrement() != 0) {
                return;
            }
            final n<? super T> g = b.G;
            final int a = this.a;
            int addAndGet = 1;
            do {
                final long value = b.H.get();
                Object[] c;
                if ((c = (Object[])b.L) == null) {
                    c = this.c;
                }
                int k = b.K;
                int j = b.J;
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (g.g()) {
                        b.L = null;
                        return;
                    }
                    final boolean f = this.f;
                    final boolean b2 = j == this.b;
                    if (f && b2) {
                        b.L = null;
                        final Throwable g2 = this.g;
                        if (g2 != null) {
                            g.b(g2);
                        }
                        else {
                            g.c();
                        }
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    Object[] array = c;
                    int n3;
                    if ((n3 = k) == a) {
                        array = (Object[])c[k];
                        n3 = 0;
                    }
                    g.m(array[n3]);
                    ++n;
                    k = n3 + 1;
                    ++j;
                    c = array;
                }
                if (n2 == 0) {
                    if (g.g()) {
                        b.L = null;
                        return;
                    }
                    final boolean f2 = this.f;
                    final boolean b3 = j == this.b;
                    if (f2 && b3) {
                        b.L = null;
                        final Throwable g3 = this.g;
                        if (g3 != null) {
                            g.b(g3);
                        }
                        else {
                            g.c();
                        }
                        return;
                    }
                }
                if (n != 0L && value != Long.MAX_VALUE) {
                    rx.internal.operators.a.i(b.H, n);
                }
                b.J = j;
                b.K = k;
                b.L = c;
            } while ((addAndGet = b.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void b() {
            this.f = true;
        }
        
        @Override
        public Throwable c() {
            return this.g;
        }
        
        @Override
        public boolean d() {
            return this.f;
        }
        
        @Override
        public void f(final T t) {
            if (this.f) {
                return;
            }
            final int e = this.e;
            final Object[] d = this.d;
            if (e == d.length - 1) {
                final Object[] d2 = new Object[d.length];
                d2[0] = t;
                this.e = 1;
                d[e] = d2;
                this.d = d2;
            }
            else {
                d[e] = t;
                this.e = e + 1;
            }
            ++this.b;
        }
        
        @Override
        public T f1() {
            int i = this.b;
            if (i == 0) {
                return null;
            }
            Object[] c = this.c;
            for (int a = this.a; i >= a; i -= a) {
                c = (Object[])c[a];
            }
            return (T)c[i - 1];
        }
        
        @Override
        public void i(final Throwable g) {
            if (this.f) {
                rx.plugins.c.I(g);
                return;
            }
            this.g = g;
            this.f = true;
        }
        
        @Override
        public boolean isEmpty() {
            return this.b == 0;
        }
        
        @Override
        public int size() {
            return this.b;
        }
        
        @Override
        public T[] toArray(final T[] array) {
            final int b = this.b;
            Object[] array2 = array;
            if (array.length < b) {
                array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), b);
            }
            Object[] c = this.c;
            final int a = this.a;
            int n = 0;
            while (true) {
                final int n2 = n + a;
                if (n2 >= b) {
                    break;
                }
                System.arraycopy(c, 0, array2, n, a);
                c = (Object[])c[a];
                n = n2;
            }
            System.arraycopy(c, 0, array2, n, b - n);
            if (array2.length > b) {
                array2[b] = null;
            }
            return (T[])array2;
        }
    }
}
