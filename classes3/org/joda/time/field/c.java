// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.o;
import java.util.Locale;
import org.joda.time.l;
import org.joda.time.n0;
import org.joda.time.g;
import org.joda.time.f;

public abstract class c extends f
{
    private final g a;
    
    protected c(final g a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }
    
    @Override
    public int B(final n0 n0) {
        return this.y();
    }
    
    @Override
    public int C(final n0 n0, final int[] array) {
        return this.B(n0);
    }
    
    @Override
    public abstract int D();
    
    @Override
    public int E(final long n) {
        return this.D();
    }
    
    @Override
    public int F(final n0 n0) {
        return this.D();
    }
    
    @Override
    public int G(final n0 n0, final int[] array) {
        return this.F(n0);
    }
    
    @Override
    public final String H() {
        return this.a.H();
    }
    
    @Override
    public abstract l I();
    
    @Override
    public final g J() {
        return this.a;
    }
    
    @Override
    public boolean K(final long n) {
        return false;
    }
    
    @Override
    public final boolean M() {
        return true;
    }
    
    @Override
    public long N(final long n) {
        return n - this.P(n);
    }
    
    @Override
    public long O(final long n) {
        final long p = this.P(n);
        long a = n;
        if (p != n) {
            a = this.a(p, 1);
        }
        return a;
    }
    
    @Override
    public abstract long P(final long p0);
    
    @Override
    public long Q(final long n) {
        final long p = this.P(n);
        final long o = this.O(n);
        if (o - n <= n - p) {
            return o;
        }
        return p;
    }
    
    @Override
    public long R(long n) {
        final long p = this.P(n);
        final long o = this.O(n);
        final long n2 = n - p;
        n = o - n;
        if (n2 < n) {
            return p;
        }
        if (n < n2) {
            return o;
        }
        if ((this.g(o) & 0x1) == 0x0) {
            return o;
        }
        return p;
    }
    
    @Override
    public long S(final long n) {
        final long p = this.P(n);
        final long o = this.O(n);
        if (n - p <= o - n) {
            return p;
        }
        return o;
    }
    
    @Override
    public abstract long T(final long p0, final int p1);
    
    @Override
    public final long U(final long n, final String s) {
        return this.V(n, s, null);
    }
    
    @Override
    public long V(final long n, final String s, final Locale locale) {
        return this.T(n, this.Z(s, locale));
    }
    
    @Override
    public int[] W(final n0 n0, int n2, final int[] array, int n3) {
        j.p(this, n3, this.G(n0, array), this.C(n0, array));
        array[n2] = n3;
        while (true) {
            n3 = n2 + 1;
            if (n3 >= n0.size()) {
                break;
            }
            final f q3 = n0.Q3(n3);
            if (array[n3] > q3.C(n0, array)) {
                array[n3] = q3.C(n0, array);
            }
            n2 = n3;
            if (array[n3] >= q3.G(n0, array)) {
                continue;
            }
            array[n3] = q3.G(n0, array);
            n2 = n3;
        }
        return array;
    }
    
    @Override
    public int[] X(final n0 n0, final int n2, final int[] array, final String s, final Locale locale) {
        return this.W(n0, n2, array, this.Z(s, locale));
    }
    
    protected int Z(final String s, final Locale locale) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            throw new o(this.J(), s);
        }
    }
    
    @Override
    public long a(final long n, final int n2) {
        return this.t().b(n, n2);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.t().d(n, n2);
    }
    
    @Override
    public int[] c(final n0 n0, final int n2, int[] c, int g) {
        if (g == 0) {
            return c;
        }
        f f = null;
        f f2;
        int[] c2;
        int i;
        while (true) {
            f2 = f;
            c2 = c;
            i = g;
            if (g <= 0) {
                break;
            }
            final int c3 = this.C(n0, c);
            final long n3 = c[n2] + g;
            if (n3 <= c3) {
                c[n2] = (int)n3;
                f2 = f;
                c2 = c;
                i = g;
                break;
            }
            f q3;
            if ((q3 = f) == null) {
                if (n2 == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                q3 = n0.Q3(n2 - 1);
                if (this.I().m() != q3.t().m()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            g -= c3 + 1 - c[n2];
            c = q3.c(n0, n2 - 1, c, 1);
            c[n2] = this.G(n0, c);
            f = q3;
        }
        while (i < 0) {
            g = this.G(n0, c2);
            final long n4 = c2[n2] + i;
            if (n4 >= g) {
                c2[n2] = (int)n4;
                break;
            }
            f q4;
            if ((q4 = f2) == null) {
                if (n2 == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                q4 = n0.Q3(n2 - 1);
                if (this.I().m() != q4.t().m()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i -= g - 1 - c2[n2];
            c2 = q4.c(n0, n2 - 1, c2, -1);
            c2[n2] = this.C(n0, c2);
            f2 = q4;
        }
        return this.W(n0, n2, c2, c2[n2]);
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.T(n, j.c(this.g(n), n2, this.E(n), this.z(n)));
    }
    
    @Override
    public int[] e(final n0 n0, final int n2, final int[] array, final int n3) {
        return this.W(n0, n2, array, j.c(array[n2], n3, this.F(n0), this.B(n0)));
    }
    
    @Override
    public int[] f(final n0 n0, final int n2, int[] f, int g) {
        if (g == 0) {
            return f;
        }
        f f2 = null;
        f f3;
        int[] f4;
        int i;
        while (true) {
            f3 = f2;
            f4 = f;
            i = g;
            if (g <= 0) {
                break;
            }
            final int c = this.C(n0, f);
            final long n3 = f[n2] + g;
            if (n3 <= c) {
                f[n2] = (int)n3;
                f3 = f2;
                f4 = f;
                i = g;
                break;
            }
            f q3;
            if ((q3 = f2) == null) {
                if (n2 == 0) {
                    g -= c + 1 - f[n2];
                    f[n2] = this.G(n0, f);
                    continue;
                }
                q3 = n0.Q3(n2 - 1);
                if (this.I().m() != q3.t().m()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            g -= c + 1 - f[n2];
            f = q3.f(n0, n2 - 1, f, 1);
            f[n2] = this.G(n0, f);
            f2 = q3;
        }
        while (i < 0) {
            g = this.G(n0, f4);
            final long n4 = f4[n2] + i;
            if (n4 >= g) {
                f4[n2] = (int)n4;
                break;
            }
            f q4;
            if ((q4 = f3) == null) {
                if (n2 == 0) {
                    i -= g - 1 - f4[n2];
                    f4[n2] = this.C(n0, f4);
                    continue;
                }
                q4 = n0.Q3(n2 - 1);
                if (this.I().m() != q4.t().m()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i -= g - 1 - f4[n2];
            f4 = q4.f(n0, n2 - 1, f4, -1);
            f4[n2] = this.C(n0, f4);
            f3 = q4;
        }
        return this.W(n0, n2, f4, f4[n2]);
    }
    
    @Override
    public abstract int g(final long p0);
    
    @Override
    public String h(final int n, final Locale locale) {
        return this.m(n, locale);
    }
    
    @Override
    public final String i(final long n) {
        return this.j(n, null);
    }
    
    @Override
    public String j(final long n, final Locale locale) {
        return this.h(this.g(n), locale);
    }
    
    @Override
    public String k(final n0 n0, final int n2, final Locale locale) {
        return this.h(n2, locale);
    }
    
    @Override
    public final String l(final n0 n0, final Locale locale) {
        return this.k(n0, n0.j0(this.J()), locale);
    }
    
    @Override
    public String m(final int i, final Locale locale) {
        return Integer.toString(i);
    }
    
    @Override
    public final String n(final long n) {
        return this.o(n, null);
    }
    
    @Override
    public String o(final long n, final Locale locale) {
        return this.m(this.g(n), locale);
    }
    
    @Override
    public String p(final n0 n0, final int n2, final Locale locale) {
        return this.m(n2, locale);
    }
    
    @Override
    public final String q(final n0 n0, final Locale locale) {
        return this.p(n0, n0.j0(this.J()), locale);
    }
    
    @Override
    public int r(final long n, final long n2) {
        return this.t().f(n, n2);
    }
    
    @Override
    public long s(final long n, final long n2) {
        return this.t().g(n, n2);
    }
    
    @Override
    public abstract l t();
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DateTimeField[");
        sb.append(this.H());
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public int u(final long n) {
        return 0;
    }
    
    @Override
    public l v() {
        return null;
    }
    
    @Override
    public int w(final Locale locale) {
        return this.x(locale);
    }
    
    @Override
    public int x(final Locale locale) {
        final int y = this.y();
        if (y >= 0) {
            if (y < 10) {
                return 1;
            }
            if (y < 100) {
                return 2;
            }
            if (y < 1000) {
                return 3;
            }
        }
        return Integer.toString(y).length();
    }
    
    @Override
    public abstract int y();
    
    @Override
    public int z(final long n) {
        return this.y();
    }
}
