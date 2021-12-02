// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.field.r;
import org.joda.time.field.i;
import org.joda.time.field.n;
import org.joda.time.field.y;
import org.joda.time.field.o;
import org.joda.time.g;
import org.joda.time.field.q;
import org.joda.time.field.m;
import org.joda.time.f;
import org.joda.time.l;

abstract class c extends org.joda.time.chrono.a
{
    private static final l A0;
    private static final l B0;
    private static final l C0;
    private static final l D0;
    private static final f E0;
    private static final f F0;
    private static final f G0;
    private static final f H0;
    private static final f I0;
    private static final f J0;
    private static final f K0;
    private static final f L0;
    private static final f M0;
    private static final f N0;
    private static final f O0;
    private static final int P0 = 1024;
    private static final int Q0 = 1023;
    private static final long w0 = 8283225332206808863L;
    private static final l x0;
    private static final l y0;
    private static final l z0;
    private final transient b[] u0;
    private final int v0;
    
    static {
        final l l = x0 = m.H;
        final l i = y0 = new q(org.joda.time.m.l(), 1000L);
        final l j = z0 = new q(org.joda.time.m.j(), 60000L);
        final l k = A0 = new q(org.joda.time.m.g(), 3600000L);
        final l m = B0 = new q(org.joda.time.m.f(), 43200000L);
        final l l2 = C0 = new q(org.joda.time.m.b(), 86400000L);
        D0 = new q(org.joda.time.m.m(), 604800000L);
        E0 = new o(g.O(), l, i);
        F0 = new o(g.N(), l, l2);
        G0 = new o(g.T(), i, j);
        H0 = new o(g.S(), i, l2);
        I0 = new o(g.Q(), j, k);
        J0 = new o(g.P(), j, l2);
        final f f = K0 = new o(g.K(), k, l2);
        final f f2 = L0 = new o(g.L(), k, m);
        M0 = new y(f, g.y());
        N0 = new y(f2, g.z());
        O0 = new a();
    }
    
    c(final org.joda.time.a a, final Object o, final int n) {
        super(a, o);
        this.u0 = new b[1024];
        if (n >= 1 && n <= 7) {
            this.v0 = n;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid min days in first week: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private b O0(final int n) {
        final b[] u0 = this.u0;
        final int n2 = n & 0x3FF;
        final b b = u0[n2];
        if (b != null) {
            final b b2 = b;
            if (b.a == n) {
                return b2;
            }
        }
        final b b2 = new b(n, this.e0(n));
        this.u0[n2] = b2;
        return b2;
    }
    
    private long k0(int n, final int n2, final int n3, final int n4) {
        long n6;
        final long n5 = n6 = this.j0(n, n2, n3);
        int n7 = n4;
        if (n5 == Long.MIN_VALUE) {
            n6 = this.j0(n, n2, n3 + 1);
            n7 = n4 - 86400000;
        }
        final long n8 = n7 + n6;
        n = lcmp(n8, 0L);
        if (n < 0 && n6 > 0L) {
            return Long.MAX_VALUE;
        }
        if (n > 0 && n6 < 0L) {
            return Long.MIN_VALUE;
        }
        return n8;
    }
    
    int A0(final int n) {
        return this.z0();
    }
    
    abstract int B0();
    
    int C0(final long n) {
        if (n >= 0L) {
            return (int)(n % 86400000L);
        }
        return (int)((n + 1L) % 86400000L) + 86399999;
    }
    
    abstract int D0();
    
    public int E0() {
        return this.v0;
    }
    
    int F0(final long n) {
        return this.G0(n, this.M0(n));
    }
    
    abstract int G0(final long p0, final int p1);
    
    abstract long H0(final int p0, final int p1);
    
    int I0(final long n) {
        return this.J0(n, this.M0(n));
    }
    
    int J0(final long n, final int n2) {
        final long y0 = this.y0(n2);
        if (n < y0) {
            return this.K0(n2 - 1);
        }
        if (n >= this.y0(n2 + 1)) {
            return 1;
        }
        return (int)((n - y0) / 604800000L) + 1;
    }
    
    int K0(final int n) {
        return (int)((this.y0(n + 1) - this.y0(n)) / 604800000L);
    }
    
    int L0(long n) {
        final int m0 = this.M0(n);
        final int j0 = this.J0(n, m0);
        if (j0 == 1) {
            n += 604800000L;
        }
        else {
            if (j0 <= 51) {
                return m0;
            }
            n -= 1209600000L;
        }
        return this.M0(n);
    }
    
    int M0(final long n) {
        final long i0 = this.i0();
        long n3;
        final long n2 = n3 = (n >> 1) + this.f0();
        if (n2 < 0L) {
            n3 = n2 - i0 + 1L;
        }
        final int n4 = (int)(n3 / i0);
        final long p = this.P0(n4);
        final long n5 = n - p;
        int n6;
        if (n5 < 0L) {
            n6 = n4 - 1;
        }
        else {
            long n7 = 31536000000L;
            n6 = n4;
            if (n5 >= 31536000000L) {
                if (this.T0(n4)) {
                    n7 = 31622400000L;
                }
                n6 = n4;
                if (p + n7 <= n) {
                    n6 = n4 + 1;
                }
            }
        }
        return n6;
    }
    
    abstract long N0(final long p0, final long p1);
    
    long P0(final int n) {
        return this.O0(n).b;
    }
    
    long Q0(final int n, final int n2, final int n3) {
        return this.P0(n) + this.H0(n, n2) + (n3 - 1) * 86400000L;
    }
    
    long R0(final int n, final int n2) {
        return this.P0(n) + this.H0(n, n2);
    }
    
    boolean S0(final long n) {
        return false;
    }
    
    abstract boolean T0(final int p0);
    
    abstract long U0(final long p0, final int p1);
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        a.a = c.x0;
        a.b = c.y0;
        a.c = c.z0;
        a.d = c.A0;
        a.e = c.B0;
        a.f = c.C0;
        a.g = c.D0;
        a.m = c.E0;
        a.n = c.F0;
        a.o = c.G0;
        a.p = c.H0;
        a.q = c.I0;
        a.r = c.J0;
        a.s = c.K0;
        a.u = c.L0;
        a.t = c.M0;
        a.v = c.N0;
        a.w = c.O0;
        final org.joda.time.chrono.l e = new org.joda.time.chrono.l(this);
        a.E = e;
        final v f = new v(e, this);
        a.F = f;
        final i h = new i(new n(f, 99), g.x(), 100);
        a.H = h;
        a.k = h.t();
        a.G = new n(new r((i)a.H), g.Y(), 1);
        a.I = new s(this);
        a.x = new org.joda.time.chrono.r(this, a.f);
        a.y = new d(this, a.f);
        a.z = new e(this, a.f);
        a.D = new u(this);
        a.B = new k(this);
        a.A = new j(this, a.g);
        a.C = new n(new r(a.B, a.k, g.W(), 100), g.W(), 1);
        a.j = a.E.t();
        a.i = a.D.t();
        a.h = a.B.t();
    }
    
    abstract long e0(final int p0);
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final c c = (c)o;
            if (this.E0() != c.E0() || !this.s().equals(c.s())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    abstract long f0();
    
    abstract long g0();
    
    abstract long h0();
    
    @Override
    public int hashCode() {
        return this.getClass().getName().hashCode() * 11 + this.s().hashCode() + this.E0();
    }
    
    abstract long i0();
    
    long j0(final int n, int n2, final int n3) {
        org.joda.time.field.j.q(g.X(), n, this.D0() - 1, this.B0() + 1);
        org.joda.time.field.j.q(g.R(), n2, 1, this.A0(n));
        org.joda.time.field.j.q(g.B(), n3, 1, this.x0(n, n2));
        final long q0 = this.Q0(n, n2, n3);
        n2 = lcmp(q0, 0L);
        if (n2 < 0 && n == this.B0() + 1) {
            return Long.MAX_VALUE;
        }
        if (n2 > 0 && n == this.D0() - 1) {
            return Long.MIN_VALUE;
        }
        return q0;
    }
    
    int l0(final long n) {
        final int m0 = this.M0(n);
        return this.n0(n, m0, this.G0(n, m0));
    }
    
    int m0(final long n, final int n2) {
        return this.n0(n, n2, this.G0(n, n2));
    }
    
    int n0(final long n, final int n2, final int n3) {
        return (int)((n - (this.P0(n2) + this.H0(n2, n3))) / 86400000L) + 1;
    }
    
    int o0(long n) {
        if (n >= 0L) {
            n /= 86400000L;
        }
        else {
            final long n2 = n = (n - 86399999L) / 86400000L;
            if (n2 < -3L) {
                return (int)((n2 + 4L) % 7L) + 7;
            }
        }
        return (int)((n + 3L) % 7L) + 1;
    }
    
    @Override
    public long p(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        final org.joda.time.a y = this.Y();
        if (y != null) {
            return y.p(n, n2, n3, n4);
        }
        org.joda.time.field.j.q(g.N(), n4, 0, 86399999);
        return this.k0(n, n2, n3, n4);
    }
    
    int p0(final long n) {
        return this.q0(n, this.M0(n));
    }
    
    @Override
    public long q(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) throws IllegalArgumentException {
        final org.joda.time.a y = this.Y();
        if (y != null) {
            return y.q(n, n2, n3, n4, n5, n6, n7);
        }
        org.joda.time.field.j.q(g.K(), n4, 0, 23);
        org.joda.time.field.j.q(g.Q(), n5, 0, 59);
        org.joda.time.field.j.q(g.T(), n6, 0, 59);
        org.joda.time.field.j.q(g.O(), n7, 0, 999);
        return this.k0(n, n2, n3, n4 * 3600000 + n5 * 60000 + n6 * 1000 + n7);
    }
    
    int q0(final long n, final int n2) {
        return (int)((n - this.P0(n2)) / 86400000L) + 1;
    }
    
    int r0() {
        return 31;
    }
    
    @Override
    public org.joda.time.i s() {
        final org.joda.time.a y = this.Y();
        if (y != null) {
            return y.s();
        }
        return org.joda.time.i.I;
    }
    
    abstract int s0(final int p0);
    
    int t0(final long n) {
        final int m0 = this.M0(n);
        return this.x0(m0, this.G0(n, m0));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(60);
        final String name = this.getClass().getName();
        final int lastIndex = name.lastIndexOf(46);
        String substring = name;
        if (lastIndex >= 0) {
            substring = name.substring(lastIndex + 1);
        }
        sb.append(substring);
        sb.append('[');
        final org.joda.time.i s = this.s();
        if (s != null) {
            sb.append(s.q());
        }
        if (this.E0() != 4) {
            sb.append(",mdfw=");
            sb.append(this.E0());
        }
        sb.append(']');
        return sb.toString();
    }
    
    int u0(final long n, final int n2) {
        return this.t0(n);
    }
    
    int v0(int n) {
        if (this.T0(n)) {
            n = 366;
        }
        else {
            n = 365;
        }
        return n;
    }
    
    int w0() {
        return 366;
    }
    
    abstract int x0(final int p0, final int p1);
    
    long y0(int o0) {
        final long p = this.P0(o0);
        o0 = this.o0(p);
        if (o0 > 8 - this.v0) {
            return p + (8 - o0) * 86400000L;
        }
        return p - (o0 - 1) * 86400000L;
    }
    
    int z0() {
        return 12;
    }
    
    private static class a extends o
    {
        private static final long h = 581601443656929254L;
        
        a() {
            super(org.joda.time.g.J(), c.B0, c.C0);
        }
        
        @Override
        public long V(final long n, final String s, final Locale locale) {
            return this.T(n, t.h(locale).o(s));
        }
        
        @Override
        public String m(final int n, final Locale locale) {
            return t.h(locale).p(n);
        }
        
        @Override
        public int x(final Locale locale) {
            return t.h(locale).l();
        }
    }
    
    private static class b
    {
        public final int a;
        public final long b;
        
        b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
}
