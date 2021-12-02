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

public final class n extends m
{
    public static final n J;
    public static final n K;
    public static final n L;
    public static final n M;
    public static final n N;
    public static final n O;
    public static final n P;
    public static final n Q;
    public static final n R;
    public static final n S;
    public static final n T;
    private static final q U;
    private static final long V = 87525275727380864L;
    
    static {
        J = new n(0);
        K = new n(1);
        L = new n(2);
        M = new n(3);
        N = new n(4);
        O = new n(5);
        P = new n(6);
        Q = new n(7);
        R = new n(8);
        S = new n(Integer.MAX_VALUE);
        T = new n(Integer.MIN_VALUE);
        U = k.e().q(e0.h());
    }
    
    private n(final int n) {
        super(n);
    }
    
    public static n V(final int n) {
        if (n == Integer.MIN_VALUE) {
            return n.T;
        }
        if (n == Integer.MAX_VALUE) {
            return n.S;
        }
        switch (n) {
            default: {
                return new n(n);
            }
            case 8: {
                return n.R;
            }
            case 7: {
                return n.Q;
            }
            case 6: {
                return n.P;
            }
            case 5: {
                return n.O;
            }
            case 4: {
                return n.N;
            }
            case 3: {
                return n.M;
            }
            case 2: {
                return n.L;
            }
            case 1: {
                return n.K;
            }
            case 0: {
                return n.J;
            }
        }
    }
    
    public static n a0(final l0 l0, final l0 l2) {
        return V(m.h(l0, l2, org.joda.time.m.g()));
    }
    
    public static n b0(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof v && n2 instanceof v) {
            n3 = h.e(n0.t()).x().f(((v)n2).u(), ((v)n0).u());
        }
        else {
            n3 = m.k(n0, n2, n.J);
        }
        return V(n3);
    }
    
    public static n c0(final m0 m0) {
        if (m0 == null) {
            return n.J;
        }
        return V(m.h(m0.b(), m0.s(), org.joda.time.m.g()));
    }
    
    @FromString
    public static n r0(final String s) {
        if (s == null) {
            return n.J;
        }
        return V(n.U.l(s).l0());
    }
    
    private Object u0() {
        return V(this.G());
    }
    
    public static n v0(final o0 o0) {
        return V(m.M(o0, 3600000L));
    }
    
    public w A0() {
        return w.i0(j.h(this.G(), 60));
    }
    
    public p0 B0() {
        return p0.r0(j.h(this.G(), 3600));
    }
    
    public s0 C0() {
        return s0.z0(this.G() / 168);
    }
    
    @Override
    public e0 I() {
        return e0.h();
    }
    
    public n T(final int n) {
        if (n == 1) {
            return this;
        }
        return V(this.G() / n);
    }
    
    public int U() {
        return this.G();
    }
    
    public boolean i0(final n n) {
        final boolean b = true;
        boolean b2 = true;
        if (n == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > n.G() && b;
    }
    
    public boolean k0(final n n) {
        final boolean b = true;
        boolean b2 = true;
        if (n == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < n.G() && b;
    }
    
    public n l0(final int n) {
        return this.s0(j.l(n));
    }
    
    public n n0(final n n) {
        if (n == null) {
            return this;
        }
        return this.l0(n.G());
    }
    
    public n o0(final int n) {
        return V(j.h(this.G(), n));
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.g();
    }
    
    public n q0() {
        return V(j.l(this.G()));
    }
    
    public n s0(final int n) {
        if (n == 0) {
            return this;
        }
        return V(j.d(this.G(), n));
    }
    
    public n t0(final n n) {
        if (n == null) {
            return this;
        }
        return this.s0(n.G());
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PT");
        sb.append(String.valueOf(this.G()));
        sb.append("H");
        return sb.toString();
    }
    
    public org.joda.time.j x0() {
        return org.joda.time.j.T(this.G() / 24);
    }
    
    public org.joda.time.k z0() {
        return new org.joda.time.k(this.G() * 3600000L);
    }
}
