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

public final class p0 extends m
{
    public static final p0 J;
    public static final p0 K;
    public static final p0 L;
    public static final p0 M;
    public static final p0 N;
    public static final p0 O;
    private static final q P;
    private static final long Q = 87525275727380862L;
    
    static {
        J = new p0(0);
        K = new p0(1);
        L = new p0(2);
        M = new p0(3);
        N = new p0(Integer.MAX_VALUE);
        O = new p0(Integer.MIN_VALUE);
        P = k.e().q(e0.n());
    }
    
    private p0(final int n) {
        super(n);
    }
    
    @FromString
    public static p0 l0(final String s) {
        if (s == null) {
            return p0.J;
        }
        return r0(p0.P.l(s).q0());
    }
    
    private Object q0() {
        return r0(this.G());
    }
    
    public static p0 r0(final int n) {
        if (n == Integer.MIN_VALUE) {
            return p0.O;
        }
        if (n == Integer.MAX_VALUE) {
            return p0.N;
        }
        if (n == 0) {
            return p0.J;
        }
        if (n == 1) {
            return p0.K;
        }
        if (n == 2) {
            return p0.L;
        }
        if (n != 3) {
            return new p0(n);
        }
        return p0.M;
    }
    
    public static p0 s0(final l0 l0, final l0 l2) {
        return r0(m.h(l0, l2, org.joda.time.m.l()));
    }
    
    public static p0 t0(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof v && n2 instanceof v) {
            n3 = h.e(n0.t()).J().f(((v)n2).u(), ((v)n0).u());
        }
        else {
            n3 = m.k(n0, n2, p0.J);
        }
        return r0(n3);
    }
    
    public static p0 u0(final m0 m0) {
        if (m0 == null) {
            return p0.J;
        }
        return r0(m.h(m0.b(), m0.s(), org.joda.time.m.l()));
    }
    
    public static p0 v0(final o0 o0) {
        return r0(m.M(o0, 1000L));
    }
    
    public n A0() {
        return n.V(this.G() / 3600);
    }
    
    public w B0() {
        return w.i0(this.G() / 60);
    }
    
    public s0 C0() {
        return s0.z0(this.G() / 604800);
    }
    
    @Override
    public e0 I() {
        return e0.n();
    }
    
    public p0 T(final int n) {
        if (n == 1) {
            return this;
        }
        return r0(this.G() / n);
    }
    
    public int U() {
        return this.G();
    }
    
    public boolean V(final p0 p) {
        final boolean b = true;
        boolean b2 = true;
        if (p == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > p.G() && b;
    }
    
    public boolean a0(final p0 p) {
        final boolean b = true;
        boolean b2 = true;
        if (p == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < p.G() && b;
    }
    
    public p0 b0(final int n) {
        return this.n0(j.l(n));
    }
    
    public p0 c0(final p0 p) {
        if (p == null) {
            return this;
        }
        return this.b0(p.G());
    }
    
    public p0 i0(final int n) {
        return r0(j.h(this.G(), n));
    }
    
    public p0 k0() {
        return r0(j.l(this.G()));
    }
    
    public p0 n0(final int n) {
        if (n == 0) {
            return this;
        }
        return r0(j.d(this.G(), n));
    }
    
    public p0 o0(final p0 p) {
        if (p == null) {
            return this;
        }
        return this.n0(p.G());
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.l();
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PT");
        sb.append(String.valueOf(this.G()));
        sb.append("S");
        return sb.toString();
    }
    
    public org.joda.time.j x0() {
        return org.joda.time.j.T(this.G() / 86400);
    }
    
    public org.joda.time.k z0() {
        return new org.joda.time.k(this.G() * 1000L);
    }
}
