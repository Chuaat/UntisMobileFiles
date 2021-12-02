// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.f;
import org.joda.time.field.j;
import org.joda.time.l;
import org.joda.time.g;

final class k extends org.joda.time.field.k
{
    private static final long f = 6215066916806820644L;
    private static final long g = 31449600000L;
    private final org.joda.time.chrono.c e;
    
    k(final org.joda.time.chrono.c e) {
        super(org.joda.time.g.V(), e.h0());
        this.e = e;
    }
    
    private Object b0() {
        return this.e.O();
    }
    
    @Override
    public int D() {
        return this.e.D0();
    }
    
    @Override
    public l I() {
        return null;
    }
    
    @Override
    public boolean K(final long n) {
        final org.joda.time.chrono.c e = this.e;
        return e.K0(e.L0(n)) > 52;
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
    public long P(long n) {
        final long p = this.e.M().P(n);
        final int i0 = this.e.I0(p);
        n = p;
        if (i0 > 1) {
            n = p - (i0 - 1) * 604800000L;
        }
        return n;
    }
    
    @Override
    public long T(long n, final int a) {
        j.p(this, Math.abs(a), this.e.D0(), this.e.B0());
        final int g = this.g(n);
        if (g == a) {
            return n;
        }
        final int o0 = this.e.o0(n);
        final int k0 = this.e.K0(g);
        final int k2 = this.e.K0(a);
        int n2;
        if (k2 < (n2 = k0)) {
            n2 = k2;
        }
        final int i0 = this.e.I0(n);
        if (i0 <= n2) {
            n2 = i0;
        }
        final long u0 = this.e.U0(n, a);
        final int g2 = this.g(u0);
        if (g2 < a) {
            n = u0 + 604800000L;
        }
        else {
            n = u0;
            if (g2 > a) {
                n = u0 - 604800000L;
            }
        }
        return this.e.h().T(n + (n2 - this.e.I0(n)) * 604800000L, o0);
    }
    
    @Override
    public long a(final long n, final int n2) {
        if (n2 == 0) {
            return n;
        }
        return this.T(n, this.g(n) + n2);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.a(n, j.n(n2));
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.a(n, n2);
    }
    
    @Override
    public int g(final long n) {
        return this.e.L0(n);
    }
    
    @Override
    public long s(long n, long n2) {
        if (n < n2) {
            return -this.r(n2, n);
        }
        final int g = this.g(n);
        final int g2 = this.g(n2);
        final long n3 = this.N(n);
        n2 = (n = this.N(n2));
        if (n2 >= 31449600000L) {
            n = n2;
            if (this.e.K0(g) <= 52) {
                n = n2 - 604800000L;
            }
        }
        int n4 = g - g2;
        if (n3 < n) {
            --n4;
        }
        return n4;
    }
    
    @Override
    public int u(final long n) {
        final org.joda.time.chrono.c e = this.e;
        return e.K0(e.L0(n)) - 52;
    }
    
    @Override
    public l v() {
        return this.e.N();
    }
    
    @Override
    public int y() {
        return this.e.B0();
    }
}
