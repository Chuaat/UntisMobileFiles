// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import androidx.annotation.j0;
import androidx.annotation.k0;

public class n<E> implements Cloneable
{
    private static final Object K;
    private boolean G;
    private int[] H;
    private Object[] I;
    private int J;
    
    static {
        K = new Object();
    }
    
    public n() {
        this(10);
    }
    
    public n(int e) {
        this.G = false;
        if (e == 0) {
            this.H = g.a;
            this.I = g.c;
        }
        else {
            e = g.e(e);
            this.H = new int[e];
            this.I = new Object[e];
        }
    }
    
    private void i() {
        final int j = this.J;
        final int[] h = this.H;
        final Object[] i = this.I;
        int k = 0;
        int l = 0;
        while (k < j) {
            final Object o = i[k];
            int n = l;
            if (o != androidx.collection.n.K) {
                if (k != l) {
                    h[l] = h[k];
                    i[l] = o;
                    i[k] = null;
                }
                n = l + 1;
            }
            ++k;
            l = n;
        }
        this.G = false;
        this.J = l;
    }
    
    public boolean A(int m, final E e, final E e2) {
        m = this.m(m);
        if (m >= 0) {
            final Object obj = this.I[m];
            if (obj == e || (e != null && e.equals(obj))) {
                this.I[m] = e2;
                return true;
            }
        }
        return false;
    }
    
    public void B(final int n, final E e) {
        if (this.G) {
            this.i();
        }
        this.I[n] = e;
    }
    
    public int C() {
        if (this.G) {
            this.i();
        }
        return this.J;
    }
    
    public E D(final int n) {
        if (this.G) {
            this.i();
        }
        return (E)this.I[n];
    }
    
    public void a(final int n, final E e) {
        final int j = this.J;
        if (j != 0 && n <= this.H[j - 1]) {
            this.s(n, e);
            return;
        }
        if (this.G && j >= this.H.length) {
            this.i();
        }
        final int i = this.J;
        if (i >= this.H.length) {
            final int e2 = g.e(i + 1);
            final int[] h = new int[e2];
            final Object[] k = new Object[e2];
            final int[] h2 = this.H;
            System.arraycopy(h2, 0, h, 0, h2.length);
            final Object[] l = this.I;
            System.arraycopy(l, 0, k, 0, l.length);
            this.H = h;
            this.I = k;
        }
        this.H[i] = n;
        this.I[i] = e;
        this.J = i + 1;
    }
    
    public void b() {
        final int j = this.J;
        final Object[] i = this.I;
        for (int k = 0; k < j; ++k) {
            i[k] = null;
        }
        this.J = 0;
        this.G = false;
    }
    
    public n<E> c() {
        try {
            final n n = (n)super.clone();
            n.H = this.H.clone();
            n.I = this.I.clone();
            return n;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public boolean d(final int n) {
        return this.m(n) >= 0;
    }
    
    public boolean f(final E e) {
        return this.n(e) >= 0;
    }
    
    @Deprecated
    public void g(final int n) {
        this.v(n);
    }
    
    @k0
    public E j(final int n) {
        return this.l(n, null);
    }
    
    public E l(int a, final E e) {
        a = g.a(this.H, this.J, a);
        if (a >= 0) {
            final Object[] i = this.I;
            if (i[a] != n.K) {
                return (E)i[a];
            }
        }
        return e;
    }
    
    public int m(final int n) {
        if (this.G) {
            this.i();
        }
        return g.a(this.H, this.J, n);
    }
    
    public int n(final E e) {
        if (this.G) {
            this.i();
        }
        for (int i = 0; i < this.J; ++i) {
            if (this.I[i] == e) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean q() {
        return this.C() == 0;
    }
    
    public int r(final int n) {
        if (this.G) {
            this.i();
        }
        return this.H[n];
    }
    
    public void s(final int n, final E e) {
        final int a = g.a(this.H, this.J, n);
        if (a >= 0) {
            this.I[a] = e;
        }
        else {
            final int n2 = ~a;
            final int j = this.J;
            if (n2 < j) {
                final Object[] i = this.I;
                if (i[n2] == n.K) {
                    this.H[n2] = n;
                    i[n2] = e;
                    return;
                }
            }
            int n3 = n2;
            if (this.G) {
                n3 = n2;
                if (j >= this.H.length) {
                    this.i();
                    n3 = ~g.a(this.H, this.J, n);
                }
            }
            final int k = this.J;
            if (k >= this.H.length) {
                final int e2 = g.e(k + 1);
                final int[] h = new int[e2];
                final Object[] l = new Object[e2];
                final int[] h2 = this.H;
                System.arraycopy(h2, 0, h, 0, h2.length);
                final Object[] m = this.I;
                System.arraycopy(m, 0, l, 0, m.length);
                this.H = h;
                this.I = l;
            }
            final int j2 = this.J;
            if (j2 - n3 != 0) {
                final int[] h3 = this.H;
                final int n4 = n3 + 1;
                System.arraycopy(h3, n3, h3, n4, j2 - n3);
                final Object[] i2 = this.I;
                System.arraycopy(i2, n3, i2, n4, this.J - n3);
            }
            this.H[n3] = n;
            this.I[n3] = e;
            ++this.J;
        }
    }
    
    public void t(@j0 final n<? extends E> n) {
        for (int c = n.C(), i = 0; i < c; ++i) {
            this.s(n.r(i), n.D(i));
        }
    }
    
    @Override
    public String toString() {
        if (this.C() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.J * 28);
        sb.append('{');
        for (int i = 0; i < this.J; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.r(i));
            sb.append('=');
            final E d = this.D(i);
            if (d != this) {
                sb.append(d);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
    
    @k0
    public E u(final int n, final E e) {
        final E j = this.j(n);
        if (j == null) {
            this.s(n, e);
        }
        return j;
    }
    
    public void v(int a) {
        a = g.a(this.H, this.J, a);
        if (a >= 0) {
            final Object[] i = this.I;
            final Object o = i[a];
            final Object k = n.K;
            if (o != k) {
                i[a] = k;
                this.G = true;
            }
        }
    }
    
    public boolean w(int m, final Object o) {
        m = this.m(m);
        if (m >= 0) {
            final Object d = this.D(m);
            if (o == d || (o != null && o.equals(d))) {
                this.x(m);
                return true;
            }
        }
        return false;
    }
    
    public void x(final int n) {
        final Object[] i = this.I;
        final Object o = i[n];
        final Object k = n.K;
        if (o != k) {
            i[n] = k;
            this.G = true;
        }
    }
    
    public void y(int i, int min) {
        for (min = Math.min(this.J, min + i); i < min; ++i) {
            this.x(i);
        }
    }
    
    @k0
    public E z(int m, final E e) {
        m = this.m(m);
        if (m >= 0) {
            final Object[] i = this.I;
            final Object o = i[m];
            i[m] = e;
            return (E)o;
        }
        return null;
    }
}
