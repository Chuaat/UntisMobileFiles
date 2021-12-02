// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.a;
import org.joda.time.n0;
import org.joda.time.f;
import org.joda.time.field.j;
import org.joda.time.l;
import org.joda.time.g;
import org.joda.time.field.k;

class h extends k
{
    private static final long h = -8258715387168736L;
    private static final int i = 1;
    private final org.joda.time.chrono.c e;
    private final int f;
    private final int g;
    
    h(final org.joda.time.chrono.c e, final int g) {
        super(org.joda.time.g.R(), e.g0());
        this.e = e;
        this.f = e.z0();
        this.g = g;
    }
    
    private Object b0() {
        return this.e.F();
    }
    
    @Override
    public int D() {
        return 1;
    }
    
    @Override
    public l I() {
        return this.e.W();
    }
    
    @Override
    public boolean K(final long n) {
        final int m0 = this.e.M0(n);
        final boolean t0 = this.e.T0(m0);
        boolean b = false;
        if (t0) {
            b = b;
            if (this.e.G0(n, m0) == this.g) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public boolean L() {
        return false;
    }
    
    @Override
    public long N(final long n) {
        return n - this.P(n);
    }
    
    @Override
    public long P(final long n) {
        final int m0 = this.e.M0(n);
        return this.e.R0(m0, this.e.G0(n, m0));
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, 1, this.f);
        final int m0 = this.e.M0(n);
        final int m2 = this.e.m0(n, m0);
        final int x0 = this.e.x0(m0, n2);
        int n3 = m2;
        if (m2 > x0) {
            n3 = x0;
        }
        return this.e.Q0(m0, n2, n3) + this.e.C0(n);
    }
    
    @Override
    public long a(final long n, int abs) {
        if (abs == 0) {
            return n;
        }
        final long n2 = this.e.C0(n);
        final int m0 = this.e.M0(n);
        final int g0 = this.e.G0(n, m0);
        final int n3 = g0 - 1;
        final int n4 = n3 + abs;
        int n10;
        if (g0 > 0 && n4 < 0) {
            int n7;
            if (Math.signum((float)(this.f + abs)) == Math.signum((float)abs)) {
                final int n5 = m0 - 1;
                final int n6 = abs + this.f;
                abs = n5;
                n7 = n6;
            }
            else {
                final int n8 = m0 + 1;
                n7 = abs - this.f;
                abs = n8;
            }
            final int n9 = n7 + n3;
            n10 = abs;
            abs = n9;
        }
        else {
            n10 = m0;
            abs = n4;
        }
        final int f = this.f;
        int n12;
        if (abs >= 0) {
            final int n11 = n10 + abs / f;
            n12 = abs % f + 1;
            abs = n11;
        }
        else {
            final int n13 = n10 + abs / f - 1;
            abs = Math.abs(abs);
            final int f2 = this.f;
            if ((abs %= f2) == 0) {
                abs = f2;
            }
            final int n14 = n12 = f2 - abs + 1;
            abs = n13;
            if (n14 == 1) {
                abs = n13 + 1;
                n12 = n14;
            }
        }
        final int n15 = this.e.n0(n, m0, g0);
        final int x0 = this.e.x0(abs, n12);
        int n16;
        if ((n16 = n15) > x0) {
            n16 = x0;
        }
        return this.e.Q0(abs, n12, n16) + n2;
    }
    
    @Override
    public long b(final long n, final long lng) {
        final int n2 = (int)lng;
        if (n2 == lng) {
            return this.a(n, n2);
        }
        final long n3 = this.e.C0(n);
        final int m0 = this.e.M0(n);
        final int g0 = this.e.G0(n, m0);
        final long a = g0 - 1 + lng;
        long n5;
        long n6;
        if (a >= 0L) {
            final long n4 = m0;
            final int f = this.f;
            n5 = n4 + a / f;
            n6 = a % f + 1L;
        }
        else {
            final long n7 = m0 + a / this.f - 1L;
            final long abs = Math.abs(a);
            final int f2 = this.f;
            int n8;
            if ((n8 = (int)(abs % f2)) == 0) {
                n8 = f2;
            }
            final long n9 = n6 = f2 - n8 + 1;
            n5 = n7;
            if (n9 == 1L) {
                n5 = n7 + 1L;
                n6 = n9;
            }
        }
        if (n5 >= this.e.D0() && n5 <= this.e.B0()) {
            final int n10 = (int)n5;
            final int n11 = (int)n6;
            final int n12 = this.e.n0(n, m0, g0);
            final int x0 = this.e.x0(n10, n11);
            int n13;
            if ((n13 = n12) > x0) {
                n13 = x0;
            }
            return this.e.Q0(n10, n11, n13) + n3;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Magnitude of add amount is too large: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public int[] c(final n0 n0, int i, final int[] array, final int n2) {
        if (n2 == 0) {
            return array;
        }
        final int size = n0.size();
        final int n3 = 0;
        if (size > 0 && n0.N(0).equals(org.joda.time.g.R()) && i == 0) {
            return this.W(n0, 0, array, (array[0] - 1 + n2 % 12 + 12) % 12 + 1);
        }
        if (org.joda.time.h.p(n0)) {
            long t = 0L;
            int size2;
            for (size2 = n0.size(), i = n3; i < size2; ++i) {
                t = n0.N(i).G(this.e).T(t, array[i]);
            }
            return this.e.m(n0, this.a(t, n2));
        }
        return super.c(n0, i, array, n2);
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.T(n, j.c(this.g(n), n2, 1, this.f));
    }
    
    @Override
    public int g(final long n) {
        return this.e.F0(n);
    }
    
    @Override
    public long s(final long n, long n2) {
        if (n < n2) {
            return -this.r(n2, n);
        }
        final int m0 = this.e.M0(n);
        final int g0 = this.e.G0(n, m0);
        final int m2 = this.e.M0(n2);
        final int g2 = this.e.G0(n2, m2);
        final long n3 = (m0 - m2) * (long)this.f + g0 - g2;
        final int n4 = this.e.n0(n, m0, g0);
        long t = n2;
        if (n4 == this.e.x0(m0, g0)) {
            t = n2;
            if (this.e.n0(n2, m2, g2) > n4) {
                t = this.e.g().T(n2, n4);
            }
        }
        n2 = n3;
        if (n - this.e.R0(m0, g0) < t - this.e.R0(m2, g2)) {
            n2 = n3 - 1L;
        }
        return n2;
    }
    
    @Override
    public int u(final long n) {
        return this.K(n) ? 1 : 0;
    }
    
    @Override
    public l v() {
        return this.e.j();
    }
    
    @Override
    public int y() {
        return this.f;
    }
}
