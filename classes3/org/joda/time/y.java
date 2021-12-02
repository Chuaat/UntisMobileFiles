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

public final class y extends m
{
    public static final y J;
    public static final y K;
    public static final y L;
    public static final y M;
    public static final y N;
    public static final y O;
    public static final y P;
    public static final y Q;
    public static final y R;
    public static final y S;
    public static final y T;
    public static final y U;
    public static final y V;
    public static final y W;
    public static final y X;
    private static final q Y;
    private static final long Z = 87525275727380867L;
    
    static {
        J = new y(0);
        K = new y(1);
        L = new y(2);
        M = new y(3);
        N = new y(4);
        O = new y(5);
        P = new y(6);
        Q = new y(7);
        R = new y(8);
        S = new y(9);
        T = new y(10);
        U = new y(11);
        V = new y(12);
        W = new y(Integer.MAX_VALUE);
        X = new y(Integer.MIN_VALUE);
        Y = k.e().q(e0.m());
    }
    
    private y(final int n) {
        super(n);
    }
    
    public static y i0(final int n) {
        if (n == Integer.MIN_VALUE) {
            return y.X;
        }
        if (n == Integer.MAX_VALUE) {
            return y.W;
        }
        switch (n) {
            default: {
                return new y(n);
            }
            case 12: {
                return y.V;
            }
            case 11: {
                return y.U;
            }
            case 10: {
                return y.T;
            }
            case 9: {
                return y.S;
            }
            case 8: {
                return y.R;
            }
            case 7: {
                return y.Q;
            }
            case 6: {
                return y.P;
            }
            case 5: {
                return y.O;
            }
            case 4: {
                return y.N;
            }
            case 3: {
                return y.M;
            }
            case 2: {
                return y.L;
            }
            case 1: {
                return y.K;
            }
            case 0: {
                return y.J;
            }
        }
    }
    
    public static y k0(final l0 l0, final l0 l2) {
        return i0(m.h(l0, l2, org.joda.time.m.k()));
    }
    
    public static y l0(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof t && n2 instanceof t) {
            n3 = h.e(n0.t()).G().f(((t)n2).u(), ((t)n0).u());
        }
        else {
            n3 = m.k(n0, n2, y.J);
        }
        return i0(n3);
    }
    
    public static y n0(final m0 m0) {
        if (m0 == null) {
            return y.J;
        }
        return i0(m.h(m0.b(), m0.s(), org.joda.time.m.k()));
    }
    
    @FromString
    public static y r0(final String s) {
        if (s == null) {
            return y.J;
        }
        return i0(y.Y.l(s).p0());
    }
    
    private Object u0() {
        return i0(this.G());
    }
    
    @Override
    public e0 I() {
        return e0.m();
    }
    
    public y T(final int n) {
        if (n == 1) {
            return this;
        }
        return i0(this.G() / n);
    }
    
    public int U() {
        return this.G();
    }
    
    public boolean V(final y y) {
        final boolean b = true;
        boolean b2 = true;
        if (y == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > y.G() && b;
    }
    
    public boolean a0(final y y) {
        final boolean b = true;
        boolean b2 = true;
        if (y == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < y.G() && b;
    }
    
    public y b0(final int n) {
        return this.s0(j.l(n));
    }
    
    public y c0(final y y) {
        if (y == null) {
            return this;
        }
        return this.b0(y.G());
    }
    
    public y o0(final int n) {
        return i0(j.h(this.G(), n));
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.k();
    }
    
    public y q0() {
        return i0(j.l(this.G()));
    }
    
    public y s0(final int n) {
        if (n == 0) {
            return this;
        }
        return i0(j.d(this.G(), n));
    }
    
    public y t0(final y y) {
        if (y == null) {
            return this;
        }
        return this.s0(y.G());
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append(String.valueOf(this.G()));
        sb.append("M");
        return sb.toString();
    }
}
