// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.convert.ToString;
import org.joda.time.field.j;
import org.joda.convert.FromString;
import org.joda.time.format.k;
import org.joda.time.format.q;
import org.joda.time.base.m;

public final class s0 extends m
{
    public static final s0 J;
    public static final s0 K;
    public static final s0 L;
    public static final s0 M;
    public static final s0 N;
    public static final s0 O;
    private static final q P;
    private static final long Q = 87525275727380866L;
    
    static {
        J = new s0(0);
        K = new s0(1);
        L = new s0(2);
        M = new s0(3);
        N = new s0(Integer.MAX_VALUE);
        O = new s0(Integer.MIN_VALUE);
        P = k.e().q(e0.s());
    }
    
    private s0(final int n) {
        super(n);
    }
    
    public static s0 A0(final l0 l0, final l0 l2) {
        return z0(m.h(l0, l2, org.joda.time.m.m()));
    }
    
    public static s0 B0(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof t && n2 instanceof t) {
            n3 = h.e(n0.t()).N().f(((t)n2).u(), ((t)n0).u());
        }
        else {
            n3 = m.k(n0, n2, s0.J);
        }
        return z0(n3);
    }
    
    public static s0 C0(final m0 m0) {
        if (m0 == null) {
            return s0.J;
        }
        return z0(m.h(m0.b(), m0.s(), org.joda.time.m.m()));
    }
    
    @FromString
    public static s0 l0(final String s) {
        if (s == null) {
            return s0.J;
        }
        return z0(s0.P.l(s).r0());
    }
    
    private Object q0() {
        return z0(this.G());
    }
    
    public static s0 r0(final o0 o0) {
        return z0(m.M(o0, 604800000L));
    }
    
    public static s0 z0(final int n) {
        if (n == Integer.MIN_VALUE) {
            return s0.O;
        }
        if (n == Integer.MAX_VALUE) {
            return s0.N;
        }
        if (n == 0) {
            return s0.J;
        }
        if (n == 1) {
            return s0.K;
        }
        if (n == 2) {
            return s0.L;
        }
        if (n != 3) {
            return new s0(n);
        }
        return s0.M;
    }
    
    @Override
    public e0 I() {
        return e0.s();
    }
    
    public s0 T(final int n) {
        if (n == 1) {
            return this;
        }
        return z0(this.G() / n);
    }
    
    public int U() {
        return this.G();
    }
    
    public boolean V(final s0 s0) {
        final boolean b = true;
        boolean b2 = true;
        if (s0 == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > s0.G() && b;
    }
    
    public boolean a0(final s0 s0) {
        final boolean b = true;
        boolean b2 = true;
        if (s0 == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < s0.G() && b;
    }
    
    public s0 b0(final int n) {
        return this.n0(j.l(n));
    }
    
    public s0 c0(final s0 s0) {
        if (s0 == null) {
            return this;
        }
        return this.b0(s0.G());
    }
    
    public s0 i0(final int n) {
        return z0(j.h(this.G(), n));
    }
    
    public s0 k0() {
        return z0(j.l(this.G()));
    }
    
    public s0 n0(final int n) {
        if (n == 0) {
            return this;
        }
        return z0(j.d(this.G(), n));
    }
    
    public s0 o0(final s0 s0) {
        if (s0 == null) {
            return this;
        }
        return this.n0(s0.G());
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.m();
    }
    
    public org.joda.time.j s0() {
        return org.joda.time.j.T(j.h(this.G(), 7));
    }
    
    public org.joda.time.k t0() {
        return new org.joda.time.k(this.G() * 604800000L);
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append(String.valueOf(this.G()));
        sb.append("W");
        return sb.toString();
    }
    
    public n u0() {
        return n.V(j.h(this.G(), 168));
    }
    
    public w v0() {
        return w.i0(j.h(this.G(), 10080));
    }
    
    public p0 x0() {
        return p0.r0(j.h(this.G(), 604800));
    }
}
