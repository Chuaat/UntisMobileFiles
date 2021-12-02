// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.annotation.k0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.reflect.Array;
import androidx.annotation.j0;

public class f0<T>
{
    public static final int j = -1;
    private static final int k = 10;
    private static final int l = 10;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 4;
    T[] a;
    private T[] b;
    private int c;
    private int d;
    private int e;
    private b f;
    private a g;
    private int h;
    private final Class<T> i;
    
    public f0(@j0 final Class<T> clazz, @j0 final b<T> b) {
        this(clazz, b, 10);
    }
    
    public f0(@j0 final Class<T> clazz, @j0 final b<T> f, final int length) {
        this.i = clazz;
        this.a = (T[])Array.newInstance(clazz, length);
        this.f = f;
        this.h = 0;
    }
    
    private void A(@j0 final T[] array) {
        final boolean b = this.f instanceof a ^ true;
        if (b) {
            this.h();
        }
        this.c = 0;
        this.d = this.h;
        this.b = this.a;
        this.e = 0;
        final int d = this.D(array);
        this.a = (T[])Array.newInstance(this.i, d);
        while (true) {
            final int e = this.e;
            if (e >= d && this.c >= this.d) {
                break;
            }
            final int c = this.c;
            final int d2 = this.d;
            if (c >= d2) {
                final int n = d - e;
                System.arraycopy(array, e, this.a, e, n);
                this.e += n;
                this.h += n;
                this.f.b(e, n);
                break;
            }
            if (e >= d) {
                final int n2 = d2 - c;
                this.h -= n2;
                this.f.c(e, n2);
                break;
            }
            final T t = this.b[c];
            final T t2 = array[e];
            final int compare = this.f.compare(t, t2);
            if (compare < 0) {
                this.B();
            }
            else {
                if (compare <= 0) {
                    if (!this.f.f(t, t2)) {
                        this.B();
                    }
                    else {
                        final T[] a = this.a;
                        final int e2 = this.e;
                        a[e2] = t2;
                        ++this.c;
                        this.e = e2 + 1;
                        if (!this.f.e(t, t2)) {
                            final b f = this.f;
                            f.d(this.e - 1, 1, f.g(t, t2));
                            continue;
                        }
                        continue;
                    }
                }
                this.z(t2);
            }
        }
        this.b = null;
        if (b) {
            this.k();
        }
    }
    
    private void B() {
        --this.h;
        ++this.c;
        this.f.c(this.e, 1);
    }
    
    private int D(@j0 final T[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a, this.f);
        int i = 1;
        int n = 1;
        int n2 = 0;
        while (i < a.length) {
            final T t = a[i];
            if (this.f.compare(a[n2], t) == 0) {
                final int m = this.m(t, a, n2, n);
                if (m != -1) {
                    a[m] = t;
                }
                else {
                    if (n != i) {
                        a[n] = t;
                    }
                    ++n;
                }
            }
            else {
                if (n != i) {
                    a[n] = t;
                }
                n2 = n;
                ++n;
            }
            ++i;
        }
        return n;
    }
    
    private void E() {
        if (this.b == null) {
            return;
        }
        throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }
    
    private int b(final T t, final boolean b) {
        final int l = this.l(t, this.a, 0, this.h, 1);
        int n;
        if (l == -1) {
            n = 0;
        }
        else if ((n = l) < this.h) {
            final T t2 = this.a[l];
            n = l;
            if (this.f.f(t2, t)) {
                if (this.f.e(t2, t)) {
                    this.a[l] = t;
                    return l;
                }
                this.a[l] = t;
                final b f = this.f;
                f.d(l, 1, f.g(t2, t));
                return l;
            }
        }
        this.g(n, t);
        if (b) {
            this.f.b(n, 1);
        }
        return n;
    }
    
    private void f(final T[] a) {
        if (a.length < 1) {
            return;
        }
        final int d = this.D(a);
        if (this.h == 0) {
            this.a = a;
            this.h = d;
            this.f.b(0, d);
        }
        else {
            this.q(a, d);
        }
    }
    
    private void g(final int i, final T t) {
        final int h = this.h;
        if (i <= h) {
            final T[] a = this.a;
            if (h == a.length) {
                final Object[] a2 = (Object[])Array.newInstance(this.i, a.length + 10);
                System.arraycopy(this.a, 0, a2, 0, i);
                a2[i] = t;
                System.arraycopy(this.a, i, a2, i + 1, this.h - i);
                this.a = (T[])a2;
            }
            else {
                System.arraycopy(a, i, a, i + 1, h - i);
                this.a[i] = t;
            }
            ++this.h;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("cannot add item to ");
        sb.append(i);
        sb.append(" because size is ");
        sb.append(this.h);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    private T[] j(final T[] array) {
        final Object[] array2 = (Object[])Array.newInstance(this.i, array.length);
        System.arraycopy(array, 0, array2, 0, array.length);
        return (T[])array2;
    }
    
    private int l(final T t, final T[] array, int i, int n, final int n2) {
        while (i < n) {
            int n3 = (i + n) / 2;
            final T t2 = array[n3];
            final int compare = this.f.compare(t2, t);
            if (compare < 0) {
                i = n3 + 1;
            }
            else if (compare == 0) {
                if (this.f.f(t2, t)) {
                    return n3;
                }
                i = this.p(t, n3, i, n);
                if (n2 == 1) {
                    if (i != -1) {
                        n3 = i;
                    }
                    return n3;
                }
                return i;
            }
            else {
                n = n3;
            }
        }
        if (n2 != 1) {
            i = -1;
        }
        return i;
    }
    
    private int m(final T t, final T[] array, int i, final int n) {
        while (i < n) {
            if (this.f.f(array[i], t)) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    private int p(final T t, int n, final int n2, final int n3) {
        int n4 = n - 1;
        int n5;
        while (true) {
            n5 = n;
            if (n4 < n2) {
                break;
            }
            final T t2 = this.a[n4];
            if (this.f.compare(t2, t) != 0) {
                n5 = n;
                break;
            }
            if (this.f.f(t2, t)) {
                return n4;
            }
            --n4;
        }
        T t3;
        do {
            n = n5 + 1;
            if (n < n3) {
                t3 = this.a[n];
                if (this.f.compare(t3, t) == 0) {
                    n5 = n;
                    continue;
                }
            }
            return -1;
        } while (!this.f.f(t3, t));
        return n;
    }
    
    private void q(final T[] array, int n) {
        final boolean b = this.f instanceof a ^ true;
        if (b) {
            this.h();
        }
        this.b = this.a;
        int n2 = 0;
        this.c = 0;
        final int h = this.h;
        this.d = h;
        this.a = (T[])Array.newInstance(this.i, h + n + 10);
        this.e = 0;
        while (true) {
            final int c = this.c;
            final int d = this.d;
            if (c >= d && n2 >= n) {
                break;
            }
            if (c == d) {
                n -= n2;
                System.arraycopy(array, n2, this.a, this.e, n);
                final int e = this.e + n;
                this.e = e;
                this.h += n;
                this.f.b(e - n, n);
                break;
            }
            if (n2 == n) {
                n = d - c;
                System.arraycopy(this.b, c, this.a, this.e, n);
                this.e += n;
                break;
            }
            final T t = this.b[c];
            final T t2 = array[n2];
            final int compare = this.f.compare(t, t2);
            if (compare > 0) {
                final T[] a = this.a;
                final int e2 = this.e;
                final int e3 = e2 + 1;
                this.e = e3;
                a[e2] = t2;
                ++this.h;
                ++n2;
                this.f.b(e3 - 1, 1);
            }
            else if (compare == 0 && this.f.f(t, t2)) {
                this.a[this.e++] = t2;
                final int n3 = n2 + 1;
                ++this.c;
                n2 = n3;
                if (this.f.e(t, t2)) {
                    continue;
                }
                final b f = this.f;
                f.d(this.e - 1, 1, f.g(t, t2));
                n2 = n3;
            }
            else {
                this.a[this.e++] = t;
                ++this.c;
            }
        }
        this.b = null;
        if (b) {
            this.k();
        }
    }
    
    private boolean t(final T t, final boolean b) {
        final int l = this.l(t, this.a, 0, this.h, 2);
        if (l == -1) {
            return false;
        }
        this.v(l, b);
        return true;
    }
    
    private void v(final int n, final boolean b) {
        final T[] a = this.a;
        System.arraycopy(a, n + 1, a, n, this.h - n - 1);
        final int h = this.h - 1;
        this.h = h;
        this.a[h] = null;
        if (b) {
            this.f.c(n, 1);
        }
    }
    
    private void z(final T t) {
        final T[] a = this.a;
        int e = this.e;
        a[e] = t;
        ++e;
        this.e = e;
        ++this.h;
        this.f.b(e - 1, 1);
    }
    
    public int C() {
        return this.h;
    }
    
    public void F(final int n, final T t) {
        this.E();
        final T n2 = this.n(n);
        final boolean b = n2 == t || !this.f.e(n2, t);
        if (n2 != t && this.f.compare(n2, t) == 0) {
            this.a[n] = t;
            if (b) {
                final b f = this.f;
                f.d(n, 1, f.g(n2, t));
            }
            return;
        }
        if (b) {
            final b f2 = this.f;
            f2.d(n, 1, f2.g(n2, t));
        }
        this.v(n, false);
        final int b2 = this.b(t, false);
        if (n != b2) {
            this.f.a(n, b2);
        }
    }
    
    public int a(final T t) {
        this.E();
        return this.b(t, true);
    }
    
    public void c(@j0 final Collection<T> collection) {
        this.e(collection.toArray((T[])Array.newInstance(this.i, collection.size())), true);
    }
    
    public void d(@j0 final T... array) {
        this.e(array, false);
    }
    
    public void e(@j0 final T[] array, final boolean b) {
        this.E();
        if (array.length == 0) {
            return;
        }
        if (b) {
            this.f(array);
        }
        else {
            this.f(this.j(array));
        }
    }
    
    public void h() {
        this.E();
        final b f = this.f;
        if (f instanceof a) {
            return;
        }
        if (this.g == null) {
            this.g = new a(f);
        }
        this.f = (b)this.g;
    }
    
    public void i() {
        this.E();
        final int h = this.h;
        if (h == 0) {
            return;
        }
        Arrays.fill(this.a, 0, h, null);
        this.h = 0;
        this.f.c(0, h);
    }
    
    public void k() {
        this.E();
        final b f = this.f;
        if (f instanceof a) {
            ((a)f).i();
        }
        final b f2 = this.f;
        final a g = this.g;
        if (f2 == g) {
            this.f = (b)g.G;
        }
    }
    
    public T n(final int i) throws IndexOutOfBoundsException {
        if (i < this.h && i >= 0) {
            final T[] b = this.b;
            if (b != null) {
                final int e = this.e;
                if (i >= e) {
                    return b[i - e + this.c];
                }
            }
            return this.a[i];
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Asked to get item at ");
        sb.append(i);
        sb.append(" but size is ");
        sb.append(this.h);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public int o(final T t) {
        if (this.b == null) {
            return this.l(t, this.a, 0, this.h, 4);
        }
        final int l = this.l(t, this.a, 0, this.e, 4);
        if (l != -1) {
            return l;
        }
        final int i = this.l(t, this.b, this.c, this.d, 4);
        if (i != -1) {
            return i - this.c + this.e;
        }
        return -1;
    }
    
    public void r(final int n) {
        this.E();
        final T n2 = this.n(n);
        this.v(n, false);
        final int b = this.b(n2, false);
        if (n != b) {
            this.f.a(n, b);
        }
    }
    
    public boolean s(final T t) {
        this.E();
        return this.t(t, true);
    }
    
    public T u(final int n) {
        this.E();
        final T n2 = this.n(n);
        this.v(n, true);
        return n2;
    }
    
    public void w(@j0 final Collection<T> collection) {
        this.y(collection.toArray((T[])Array.newInstance(this.i, collection.size())), true);
    }
    
    public void x(@j0 final T... array) {
        this.y(array, false);
    }
    
    public void y(@j0 final T[] array, final boolean b) {
        this.E();
        if (b) {
            this.A(array);
        }
        else {
            this.A(this.j(array));
        }
    }
    
    public static class a<T2> extends b<T2>
    {
        final b<T2> G;
        private final f H;
        
        public a(final b<T2> g) {
            this.G = g;
            this.H = new f(g);
        }
        
        @Override
        public void a(final int n, final int n2) {
            this.H.a(n, n2);
        }
        
        @Override
        public void b(final int n, final int n2) {
            this.H.b(n, n2);
        }
        
        @Override
        public void c(final int n, final int n2) {
            this.H.c(n, n2);
        }
        
        @Override
        public int compare(final T2 t2, final T2 t3) {
            return this.G.compare(t2, t3);
        }
        
        @Override
        public void d(final int n, final int n2, final Object o) {
            this.H.d(n, n2, o);
        }
        
        @Override
        public boolean e(final T2 t2, final T2 t3) {
            return this.G.e(t2, t3);
        }
        
        @Override
        public boolean f(final T2 t2, final T2 t3) {
            return this.G.f(t2, t3);
        }
        
        @k0
        @Override
        public Object g(final T2 t2, final T2 t3) {
            return this.G.g(t2, t3);
        }
        
        @Override
        public void h(final int n, final int n2) {
            this.H.d(n, n2, null);
        }
        
        public void i() {
            this.H.e();
        }
    }
    
    public abstract static class b<T2> implements Comparator<T2>, v
    {
        @Override
        public abstract int compare(final T2 p0, final T2 p1);
        
        @Override
        public void d(final int n, final int n2, final Object o) {
            this.h(n, n2);
        }
        
        public abstract boolean e(final T2 p0, final T2 p1);
        
        public abstract boolean f(final T2 p0, final T2 p1);
        
        @k0
        public Object g(final T2 t2, final T2 t3) {
            return null;
        }
        
        public abstract void h(final int p0, final int p1);
    }
}
