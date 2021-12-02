// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import androidx.annotation.j0;
import androidx.annotation.k0;

public class h<E> implements Cloneable
{
    private static final Object K;
    private boolean G;
    private long[] H;
    private Object[] I;
    private int J;
    
    static {
        K = new Object();
    }
    
    public h() {
        this(10);
    }
    
    public h(int f) {
        this.G = false;
        if (f == 0) {
            this.H = g.b;
            this.I = g.c;
        }
        else {
            f = g.f(f);
            this.H = new long[f];
            this.I = new Object[f];
        }
    }
    
    private void i() {
        final int j = this.J;
        final long[] h = this.H;
        final Object[] i = this.I;
        int k = 0;
        int l = 0;
        while (k < j) {
            final Object o = i[k];
            int n = l;
            if (o != androidx.collection.h.K) {
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
    
    public void A(final int n, final E e) {
        if (this.G) {
            this.i();
        }
        this.I[n] = e;
    }
    
    public int B() {
        if (this.G) {
            this.i();
        }
        return this.J;
    }
    
    public E C(final int n) {
        if (this.G) {
            this.i();
        }
        return (E)this.I[n];
    }
    
    public void a(final long n, final E e) {
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
            final int f = g.f(i + 1);
            final long[] h = new long[f];
            final Object[] k = new Object[f];
            final long[] h2 = this.H;
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
    
    public h<E> c() {
        try {
            final h h = (h)super.clone();
            h.H = this.H.clone();
            h.I = this.I.clone();
            return h;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public boolean d(final long n) {
        return this.m(n) >= 0;
    }
    
    public boolean f(final E e) {
        return this.n(e) >= 0;
    }
    
    @Deprecated
    public void g(final long n) {
        this.v(n);
    }
    
    @k0
    public E j(final long n) {
        return this.l(n, null);
    }
    
    public E l(final long n, final E e) {
        final int b = g.b(this.H, this.J, n);
        if (b >= 0) {
            final Object[] i = this.I;
            if (i[b] != h.K) {
                return (E)i[b];
            }
        }
        return e;
    }
    
    public int m(final long n) {
        if (this.G) {
            this.i();
        }
        return g.b(this.H, this.J, n);
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
        return this.B() == 0;
    }
    
    public long r(final int n) {
        if (this.G) {
            this.i();
        }
        return this.H[n];
    }
    
    public void s(final long n, final E e) {
        final int b = g.b(this.H, this.J, n);
        if (b >= 0) {
            this.I[b] = e;
        }
        else {
            final int n2 = ~b;
            final int j = this.J;
            if (n2 < j) {
                final Object[] i = this.I;
                if (i[n2] == h.K) {
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
                    n3 = ~g.b(this.H, this.J, n);
                }
            }
            final int k = this.J;
            if (k >= this.H.length) {
                final int f = g.f(k + 1);
                final long[] h = new long[f];
                final Object[] l = new Object[f];
                final long[] h2 = this.H;
                System.arraycopy(h2, 0, h, 0, h2.length);
                final Object[] m = this.I;
                System.arraycopy(m, 0, l, 0, m.length);
                this.H = h;
                this.I = l;
            }
            final int j2 = this.J;
            if (j2 - n3 != 0) {
                final long[] h3 = this.H;
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
    
    public void t(@j0 final h<? extends E> h) {
        for (int b = h.B(), i = 0; i < b; ++i) {
            this.s(h.r(i), h.C(i));
        }
    }
    
    @Override
    public String toString() {
        if (this.B() <= 0) {
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
            final E c = this.C(i);
            if (c != this) {
                sb.append(c);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
    
    @k0
    public E u(final long n, final E e) {
        final E j = this.j(n);
        if (j == null) {
            this.s(n, e);
        }
        return j;
    }
    
    public void v(final long n) {
        final int b = g.b(this.H, this.J, n);
        if (b >= 0) {
            final Object[] i = this.I;
            final Object o = i[b];
            final Object k = h.K;
            if (o != k) {
                i[b] = k;
                this.G = true;
            }
        }
    }
    
    public boolean w(final long n, final Object o) {
        final int m = this.m(n);
        if (m >= 0) {
            final E c = this.C(m);
            if (o == c || (o != null && o.equals(c))) {
                this.x(m);
                return true;
            }
        }
        return false;
    }
    
    public void x(final int n) {
        final Object[] i = this.I;
        final Object o = i[n];
        final Object k = h.K;
        if (o != k) {
            i[n] = k;
            this.G = true;
        }
    }
    
    @k0
    public E y(final long n, final E e) {
        final int m = this.m(n);
        if (m >= 0) {
            final Object[] i = this.I;
            final Object o = i[m];
            i[m] = e;
            return (E)o;
        }
        return null;
    }
    
    public boolean z(final long n, final E e, final E e2) {
        final int m = this.m(n);
        if (m >= 0) {
            final Object obj = this.I[m];
            if (obj == e || (e != null && e.equals(obj))) {
                this.I[m] = e2;
                return true;
            }
        }
        return false;
    }
}
