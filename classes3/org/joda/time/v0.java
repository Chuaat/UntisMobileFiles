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

public final class v0 extends m
{
    public static final v0 J;
    public static final v0 K;
    public static final v0 L;
    public static final v0 M;
    public static final v0 N;
    public static final v0 O;
    private static final q P;
    private static final long Q = 87525275727380868L;
    
    static {
        J = new v0(0);
        K = new v0(1);
        L = new v0(2);
        M = new v0(3);
        N = new v0(Integer.MAX_VALUE);
        O = new v0(Integer.MIN_VALUE);
        P = k.e().q(e0.J());
    }
    
    private v0(final int n) {
        super(n);
    }
    
    @FromString
    public static v0 l0(final String s) {
        if (s == null) {
            return v0.J;
        }
        return r0(v0.P.l(s).s0());
    }
    
    private Object q0() {
        return r0(this.G());
    }
    
    public static v0 r0(final int n) {
        if (n == Integer.MIN_VALUE) {
            return v0.O;
        }
        if (n == Integer.MAX_VALUE) {
            return v0.N;
        }
        if (n == 0) {
            return v0.J;
        }
        if (n == 1) {
            return v0.K;
        }
        if (n == 2) {
            return v0.L;
        }
        if (n != 3) {
            return new v0(n);
        }
        return v0.M;
    }
    
    public static v0 s0(final l0 l0, final l0 l2) {
        return r0(m.h(l0, l2, org.joda.time.m.o()));
    }
    
    public static v0 t0(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof t && n2 instanceof t) {
            n3 = h.e(n0.t()).W().f(((t)n2).u(), ((t)n0).u());
        }
        else {
            n3 = m.k(n0, n2, v0.J);
        }
        return r0(n3);
    }
    
    public static v0 u0(final m0 m0) {
        if (m0 == null) {
            return v0.J;
        }
        return r0(m.h(m0.b(), m0.s(), org.joda.time.m.o()));
    }
    
    @Override
    public e0 I() {
        return e0.J();
    }
    
    public v0 T(final int n) {
        if (n == 1) {
            return this;
        }
        return r0(this.G() / n);
    }
    
    public int U() {
        return this.G();
    }
    
    public boolean V(final v0 v0) {
        final boolean b = true;
        boolean b2 = true;
        if (v0 == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > v0.G() && b;
    }
    
    public boolean a0(final v0 v0) {
        final boolean b = true;
        boolean b2 = true;
        if (v0 == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < v0.G() && b;
    }
    
    public v0 b0(final int n) {
        return this.n0(j.l(n));
    }
    
    public v0 c0(final v0 v0) {
        if (v0 == null) {
            return this;
        }
        return this.b0(v0.G());
    }
    
    public v0 i0(final int n) {
        return r0(j.h(this.G(), n));
    }
    
    public v0 k0() {
        return r0(j.l(this.G()));
    }
    
    public v0 n0(final int n) {
        if (n == 0) {
            return this;
        }
        return r0(j.d(this.G(), n));
    }
    
    public v0 o0(final v0 v0) {
        if (v0 == null) {
            return this;
        }
        return this.n0(v0.G());
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.o();
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append(String.valueOf(this.G()));
        sb.append("Y");
        return sb.toString();
    }
}
