// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.math.RoundingMode;
import org.joda.time.field.j;
import org.joda.convert.FromString;
import java.io.Serializable;
import org.joda.time.base.h;

public final class k extends h implements k0, Serializable
{
    public static final k I;
    private static final long J = 2471658376918L;
    
    static {
        I = new k(0L);
    }
    
    public k(final long n) {
        super(n);
    }
    
    public k(final long n, final long n2) {
        super(n, n2);
    }
    
    public k(final Object o) {
        super(o);
    }
    
    public k(final l0 l0, final l0 l2) {
        super(l0, l2);
    }
    
    public static k B(final long n) {
        if (n == 0L) {
            return k.I;
        }
        return new k(n);
    }
    
    @FromString
    public static k M(final String s) {
        return new k(s);
    }
    
    public static k Q(final long n) {
        if (n == 0L) {
            return k.I;
        }
        return new k(j.i(n, 86400000));
    }
    
    public static k T(final long n) {
        if (n == 0L) {
            return k.I;
        }
        return new k(j.i(n, 3600000));
    }
    
    public static k U(final long n) {
        if (n == 0L) {
            return k.I;
        }
        return new k(j.i(n, 60000));
    }
    
    public static k V(final long n) {
        if (n == 0L) {
            return k.I;
        }
        return new k(j.i(n, 1000));
    }
    
    public k E(final long n) {
        return this.k0(n, -1);
    }
    
    public k G(final k0 k0) {
        if (k0 == null) {
            return this;
        }
        return this.k0(k0.n(), -1);
    }
    
    @Override
    public k H() {
        return this;
    }
    
    public k I(final long n) {
        if (n == 1L) {
            return this;
        }
        return new k(j.j(this.n(), n));
    }
    
    public k K() {
        if (this.n() != Long.MIN_VALUE) {
            return new k(-this.n());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }
    
    public k O(final long n) {
        return this.k0(n, 1);
    }
    
    public k P(final k0 k0) {
        if (k0 == null) {
            return this;
        }
        return this.k0(k0.n(), 1);
    }
    
    public org.joda.time.j a0() {
        return org.joda.time.j.T(j.n(this.u()));
    }
    
    public n b0() {
        return n.V(j.n(this.v()));
    }
    
    public w c0() {
        return w.i0(j.n(this.y()));
    }
    
    public p0 i0() {
        return p0.r0(j.n(this.z()));
    }
    
    public k k0(long i, final int n) {
        if (i != 0L && n != 0) {
            i = j.i(i, n);
            return new k(j.e(this.n(), i));
        }
        return this;
    }
    
    public k l0(final k0 k0, final int n) {
        if (k0 != null && n != 0) {
            return this.k0(k0.n(), n);
        }
        return this;
    }
    
    public k n0(final long n) {
        if (n == this.n()) {
            return this;
        }
        return new k(n);
    }
    
    public k o() {
        if (this.n() < 0L) {
            return this.K();
        }
        return this;
    }
    
    public k p(final long n) {
        if (n == 1L) {
            return this;
        }
        return new k(j.f(this.n(), n));
    }
    
    public k s(final long n, final RoundingMode roundingMode) {
        if (n == 1L) {
            return this;
        }
        return new k(j.g(this.n(), n, roundingMode));
    }
    
    public long u() {
        return this.n() / 86400000L;
    }
    
    public long v() {
        return this.n() / 3600000L;
    }
    
    public long y() {
        return this.n() / 60000L;
    }
    
    public long z() {
        return this.n() / 1000L;
    }
}
