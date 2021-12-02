// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.chrono.x;
import org.joda.time.field.j;
import org.joda.time.format.q;
import org.joda.convert.FromString;
import org.joda.time.format.k;
import java.io.Serializable;
import org.joda.time.base.l;

public final class d0 extends l implements o0, Serializable
{
    public static final d0 K;
    private static final long L = 741052353876488155L;
    
    static {
        K = new d0();
    }
    
    public d0() {
        super(0L, null, null);
    }
    
    public d0(final int n, final int n2, final int n3, final int n4) {
        super(0, 0, 0, 0, n, n2, n3, n4, e0.q());
    }
    
    public d0(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        super(n, n2, n3, n4, n5, n6, n7, n8, e0.q());
    }
    
    public d0(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final e0 e0) {
        super(n, n2, n3, n4, n5, n6, n7, n8, e0);
    }
    
    public d0(final long n) {
        super(n);
    }
    
    public d0(final long n, final long n2) {
        super(n, n2, null, null);
    }
    
    public d0(final long n, final long n2, final a a) {
        super(n, n2, null, a);
    }
    
    public d0(final long n, final long n2, final e0 e0) {
        super(n, n2, e0, null);
    }
    
    public d0(final long n, final long n2, final e0 e0, final a a) {
        super(n, n2, e0, a);
    }
    
    public d0(final long n, final a a) {
        super(n, null, a);
    }
    
    public d0(final long n, final e0 e0) {
        super(n, e0, null);
    }
    
    public d0(final long n, final e0 e0, final a a) {
        super(n, e0, a);
    }
    
    public d0(final Object o) {
        super(o, null, null);
    }
    
    public d0(final Object o, final a a) {
        super(o, null, a);
    }
    
    public d0(final Object o, final e0 e0) {
        super(o, e0, null);
    }
    
    public d0(final Object o, final e0 e0, final a a) {
        super(o, e0, a);
    }
    
    public d0(final k0 k0, final l0 l0) {
        super(k0, l0, null);
    }
    
    public d0(final k0 k0, final l0 l0, final e0 e0) {
        super(k0, l0, e0);
    }
    
    public d0(final l0 l0, final k0 k0) {
        super(l0, k0, null);
    }
    
    public d0(final l0 l0, final k0 k0, final e0 e0) {
        super(l0, k0, e0);
    }
    
    public d0(final l0 l0, final l0 l2) {
        super(l0, l2, null);
    }
    
    public d0(final l0 l0, final l0 l2, final e0 e0) {
        super(l0, l2, e0);
    }
    
    public d0(final n0 n0, final n0 n2) {
        super(n0, n2, null);
    }
    
    public d0(final n0 n0, final n0 n2, final e0 e0) {
        super(n0, n2, e0);
    }
    
    private d0(final int[] array, final e0 e0) {
        super(array, e0);
    }
    
    public static d0 E0(final int n) {
        return new d0(new int[] { 0, 0, 0, 0, 0, n, 0, 0 }, e0.q());
    }
    
    public static d0 F0(final int n) {
        return new d0(new int[] { 0, n, 0, 0, 0, 0, 0, 0 }, e0.q());
    }
    
    @FromString
    public static d0 K0(final String s) {
        return L0(s, k.e());
    }
    
    public static d0 L0(final String s, final q q) {
        return q.l(s);
    }
    
    public static d0 V0(final int n) {
        return new d0(new int[] { 0, 0, 0, 0, 0, 0, n, 0 }, e0.q());
    }
    
    public static d0 c1(final int n) {
        return new d0(new int[] { 0, 0, n, 0, 0, 0, 0, 0 }, e0.q());
    }
    
    private void f0(final String s) {
        if (this.p0() != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot convert to ");
            sb.append(s);
            sb.append(" as this period contains months and months vary in length");
            throw new UnsupportedOperationException(sb.toString());
        }
        if (this.s0() == 0) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot convert to ");
        sb2.append(s);
        sb2.append(" as this period contains years and years vary in length");
        throw new UnsupportedOperationException(sb2.toString());
    }
    
    public static d0 i0(final int n) {
        return new d0(new int[] { 0, 0, 0, n, 0, 0, 0, 0 }, e0.q());
    }
    
    public static d0 j0(final n0 n0, final n0 n2) {
        if (n0 == null || n2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (n0.size() == n2.size()) {
            final m[] array = new m[n0.size()];
            final int[] array2 = new int[n0.size()];
            for (int i = 0; i < n0.size(); ++i) {
                if (n0.N(i) != n2.N(i)) {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
                array[i] = n0.N(i).F();
                if (i > 0 && array[i - 1] == array[i]) {
                    throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
                }
                array2[i] = n2.e0(i) - n0.e0(i);
            }
            return new d0(array2, e0.d(array));
        }
        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
    }
    
    public static d0 r1(final int n) {
        return new d0(new int[] { n, 0, 0, 0, 0, 0, 0, 0 }, e0.q());
    }
    
    public static d0 t0(final int n) {
        return new d0(new int[] { 0, 0, 0, 0, n, 0, 0, 0 }, e0.q());
    }
    
    public static d0 u0(final int n) {
        return new d0(new int[] { 0, 0, 0, 0, 0, 0, 0, n }, e0.q());
    }
    
    public d0 A0(final int n) {
        return this.R0(-n);
    }
    
    public d0 B0(final int n) {
        return this.S0(-n);
    }
    
    public d0 C0(final int n) {
        return this.T0(-n);
    }
    
    public d0 D0(final int n) {
        return this.U0(-n);
    }
    
    public d0 G0(final int n) {
        if (this != d0.K && n != 1) {
            final int[] c = this.c();
            for (int i = 0; i < c.length; ++i) {
                c[i] = j.h(c[i], n);
            }
            return new d0(c, this.I());
        }
        return this;
    }
    
    public d0 H0() {
        return this.G0(-1);
    }
    
    public d0 I0() {
        return this.J0(e0.q());
    }
    
    public d0 J0(final e0 e0) {
        final e0 m = h.m(e0);
        final d0 d0 = new d0(this.n0() + this.q0() * 1000L + this.o0() * 60000L + this.l0() * 3600000L + this.k0() * 86400000L + this.r0() * 604800000L, m, x.e0());
        final int s0 = this.s0();
        final int p = this.p0();
        if (s0 == 0) {
            final d0 d2 = d0;
            if (p == 0) {
                return d2;
            }
        }
        final long n = s0 * 12L + p;
        d0 p2 = d0;
        long n2 = n;
        if (m.j(org.joda.time.m.X)) {
            final int n3 = j.n(n / 12L);
            p2 = d0.p1(n3);
            n2 = n - n3 * 12;
        }
        d0 l1 = p2;
        long n4 = n2;
        if (m.j(org.joda.time.m.Y)) {
            final int n5 = j.n(n2);
            l1 = p2.l1(n5);
            n4 = n2 - n5;
        }
        if (n4 != 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ");
            sb.append(this.toString());
            throw new UnsupportedOperationException(sb.toString());
        }
        return l1;
    }
    
    public d0 M0(final o0 o0) {
        if (o0 == null) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.L, c, o0.y(m.X));
        this.I().a(this, e0.M, c, o0.y(m.Y));
        this.I().a(this, e0.N, c, o0.y(m.Z));
        this.I().a(this, e0.O, c, o0.y(m.a0));
        this.I().a(this, e0.P, c, o0.y(m.c0));
        this.I().a(this, e0.Q, c, o0.y(m.d0));
        this.I().a(this, e0.R, c, o0.y(m.e0));
        this.I().a(this, e0.S, c, o0.y(m.f0));
        return new d0(c, this.I());
    }
    
    public d0 N0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.O, c, n);
        return new d0(c, this.I());
    }
    
    public d0 O0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.P, c, n);
        return new d0(c, this.I());
    }
    
    public d0 P0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.S, c, n);
        return new d0(c, this.I());
    }
    
    public d0 Q0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.Q, c, n);
        return new d0(c, this.I());
    }
    
    public d0 R0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.M, c, n);
        return new d0(c, this.I());
    }
    
    public d0 S0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.R, c, n);
        return new d0(c, this.I());
    }
    
    public d0 T0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.N, c, n);
        return new d0(c, this.I());
    }
    
    public d0 U0(final int n) {
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.L, c, n);
        return new d0(c, this.I());
    }
    
    public org.joda.time.j W0() {
        this.f0("Days");
        return org.joda.time.j.T(j.n(j.e(j.e((this.n0() + this.q0() * 1000L + this.o0() * 60000L + this.l0() * 3600000L) / 86400000L, this.k0()), this.r0() * 7L)));
    }
    
    public org.joda.time.k X0() {
        this.f0("Duration");
        return new org.joda.time.k(this.n0() + this.q0() * 1000L + this.o0() * 60000L + this.l0() * 3600000L + this.k0() * 86400000L + this.r0() * 604800000L);
    }
    
    public n Y0() {
        this.f0("Hours");
        return n.V(j.n(j.e(j.e(j.e((this.n0() + this.q0() * 1000L + this.o0() * 60000L) / 3600000L, this.l0()), this.k0() * 24L), this.r0() * 168L)));
    }
    
    public w Z0() {
        this.f0("Minutes");
        return w.i0(j.n(j.e(j.e(j.e(j.e((this.n0() + this.q0() * 1000L) / 60000L, this.o0()), this.l0() * 60L), this.k0() * 1440L), this.r0() * 10080L)));
    }
    
    public p0 a1() {
        this.f0("Seconds");
        return p0.r0(j.n(j.e(j.e(j.e(j.e(j.e(this.n0() / 1000, this.q0()), this.o0() * 60L), this.l0() * 3600L), this.k0() * 86400L), this.r0() * 604800L)));
    }
    
    public s0 b1() {
        this.f0("Weeks");
        return s0.z0(j.n(this.r0() + (this.n0() + this.q0() * 1000L + this.o0() * 60000L + this.l0() * 3600000L + this.k0() * 86400000L) / 604800000L));
    }
    
    public d0 d1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.O, c, n);
        return new d0(c, this.I());
    }
    
    public d0 e1(final m m, final int n) {
        if (m != null) {
            final int[] c = this.c();
            super.V(c, m, n);
            return new d0(c, this.I());
        }
        throw new IllegalArgumentException("Field must not be null");
    }
    
    public d0 f1(final m m, final int n) {
        if (m == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (n == 0) {
            return this;
        }
        final int[] c = this.c();
        super.C(c, m, n);
        return new d0(c, this.I());
    }
    
    public d0 h1(final o0 o0) {
        if (o0 == null) {
            return this;
        }
        return new d0(super.T(this.c(), o0), this.I());
    }
    
    public d0 i1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.P, c, n);
        return new d0(c, this.I());
    }
    
    public d0 j1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.S, c, n);
        return new d0(c, this.I());
    }
    
    public int k0() {
        return this.I().f(this, e0.O);
    }
    
    public d0 k1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.Q, c, n);
        return new d0(c, this.I());
    }
    
    public int l0() {
        return this.I().f(this, e0.P);
    }
    
    public d0 l1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.M, c, n);
        return new d0(c, this.I());
    }
    
    public d0 m1(e0 m) {
        m = h.m(m);
        if (m.equals(this.I())) {
            return this;
        }
        return new d0(this, m);
    }
    
    public int n0() {
        return this.I().f(this, e0.S);
    }
    
    public d0 n1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.R, c, n);
        return new d0(c, this.I());
    }
    
    public int o0() {
        return this.I().f(this, e0.Q);
    }
    
    public d0 o1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.N, c, n);
        return new d0(c, this.I());
    }
    
    public int p0() {
        return this.I().f(this, e0.M);
    }
    
    public d0 p1(final int n) {
        final int[] c = this.c();
        this.I().o(this, e0.L, c, n);
        return new d0(c, this.I());
    }
    
    public int q0() {
        return this.I().f(this, e0.R);
    }
    
    @Override
    public d0 r() {
        return this;
    }
    
    public int r0() {
        return this.I().f(this, e0.N);
    }
    
    public int s0() {
        return this.I().f(this, e0.L);
    }
    
    public d0 v0(final o0 o0) {
        if (o0 == null) {
            return this;
        }
        final int[] c = this.c();
        this.I().a(this, e0.L, c, -o0.y(m.X));
        this.I().a(this, e0.M, c, -o0.y(m.Y));
        this.I().a(this, e0.N, c, -o0.y(m.Z));
        this.I().a(this, e0.O, c, -o0.y(m.a0));
        this.I().a(this, e0.P, c, -o0.y(m.c0));
        this.I().a(this, e0.Q, c, -o0.y(m.d0));
        this.I().a(this, e0.R, c, -o0.y(m.e0));
        this.I().a(this, e0.S, c, -o0.y(m.f0));
        return new d0(c, this.I());
    }
    
    public d0 w0(final int n) {
        return this.N0(-n);
    }
    
    public d0 x0(final int n) {
        return this.O0(-n);
    }
    
    public d0 y0(final int n) {
        return this.P0(-n);
    }
    
    public d0 z0(final int n) {
        return this.Q0(-n);
    }
}
