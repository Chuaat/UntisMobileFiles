// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.convert.ToString;
import org.joda.convert.FromString;
import org.joda.time.format.k;
import org.joda.time.format.q;
import org.joda.time.base.m;

public final class j extends m
{
    public static final j J;
    public static final j K;
    public static final j L;
    public static final j M;
    public static final j N;
    public static final j O;
    public static final j P;
    public static final j Q;
    public static final j R;
    public static final j S;
    private static final q T;
    private static final long U = 87525275727380865L;
    
    static {
        J = new j(0);
        K = new j(1);
        L = new j(2);
        M = new j(3);
        N = new j(4);
        O = new j(5);
        P = new j(6);
        Q = new j(7);
        R = new j(Integer.MAX_VALUE);
        S = new j(Integer.MIN_VALUE);
        T = k.e().q(e0.c());
    }
    
    private j(final int n) {
        super(n);
    }
    
    public static j T(final int n) {
        if (n == Integer.MIN_VALUE) {
            return j.S;
        }
        if (n == Integer.MAX_VALUE) {
            return j.R;
        }
        switch (n) {
            default: {
                return new j(n);
            }
            case 7: {
                return j.Q;
            }
            case 6: {
                return j.P;
            }
            case 5: {
                return j.O;
            }
            case 4: {
                return j.N;
            }
            case 3: {
                return j.M;
            }
            case 2: {
                return j.L;
            }
            case 1: {
                return j.K;
            }
            case 0: {
                return j.J;
            }
        }
    }
    
    public static j U(final l0 l0, final l0 l2) {
        return T(m.h(l0, l2, org.joda.time.m.b()));
    }
    
    public static j V(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof t && n2 instanceof t) {
            n3 = h.e(n0.t()).j().f(((t)n2).u(), ((t)n0).u());
        }
        else {
            n3 = m.k(n0, n2, j.J);
        }
        return T(n3);
    }
    
    public static j a0(final m0 m0) {
        if (m0 == null) {
            return j.J;
        }
        return T(m.h(m0.b(), m0.s(), org.joda.time.m.b()));
    }
    
    @FromString
    public static j r0(final String s) {
        if (s == null) {
            return j.J;
        }
        return T(j.T.l(s).k0());
    }
    
    private Object u0() {
        return T(this.G());
    }
    
    public static j v0(final o0 o0) {
        return T(m.M(o0, 86400000L));
    }
    
    public w A0() {
        return w.i0(org.joda.time.field.j.h(this.G(), 1440));
    }
    
    public p0 B0() {
        return p0.r0(org.joda.time.field.j.h(this.G(), 86400));
    }
    
    public s0 C0() {
        return s0.z0(this.G() / 7);
    }
    
    @Override
    public e0 I() {
        return e0.c();
    }
    
    public j b0(final int n) {
        if (n == 1) {
            return this;
        }
        return T(this.G() / n);
    }
    
    public int c0() {
        return this.G();
    }
    
    public boolean i0(final j j) {
        final boolean b = true;
        boolean b2 = true;
        if (j == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > j.G() && b;
    }
    
    public boolean k0(final j j) {
        final boolean b = true;
        boolean b2 = true;
        if (j == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < j.G() && b;
    }
    
    public j l0(final int n) {
        return this.s0(org.joda.time.field.j.l(n));
    }
    
    public j n0(final j j) {
        if (j == null) {
            return this;
        }
        return this.l0(j.G());
    }
    
    public j o0(final int n) {
        return T(org.joda.time.field.j.h(this.G(), n));
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.b();
    }
    
    public j q0() {
        return T(org.joda.time.field.j.l(this.G()));
    }
    
    public j s0(final int n) {
        if (n == 0) {
            return this;
        }
        return T(org.joda.time.field.j.d(this.G(), n));
    }
    
    public j t0(final j j) {
        if (j == null) {
            return this;
        }
        return this.s0(j.G());
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append(String.valueOf(this.G()));
        sb.append("D");
        return sb.toString();
    }
    
    public org.joda.time.k x0() {
        return new org.joda.time.k(this.G() * 86400000L);
    }
    
    public n z0() {
        return n.V(org.joda.time.field.j.h(this.G(), 24));
    }
}
