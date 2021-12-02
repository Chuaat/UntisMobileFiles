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

public final class w extends m
{
    public static final w J;
    public static final w K;
    public static final w L;
    public static final w M;
    public static final w N;
    public static final w O;
    private static final q P;
    private static final long Q = 87525275727380863L;
    
    static {
        J = new w(0);
        K = new w(1);
        L = new w(2);
        M = new w(3);
        N = new w(Integer.MAX_VALUE);
        O = new w(Integer.MIN_VALUE);
        P = k.e().q(e0.l());
    }
    
    private w(final int n) {
        super(n);
    }
    
    public static w i0(final int n) {
        if (n == Integer.MIN_VALUE) {
            return w.O;
        }
        if (n == Integer.MAX_VALUE) {
            return w.N;
        }
        if (n == 0) {
            return w.J;
        }
        if (n == 1) {
            return w.K;
        }
        if (n == 2) {
            return w.L;
        }
        if (n != 3) {
            return new w(n);
        }
        return w.M;
    }
    
    public static w k0(final l0 l0, final l0 l2) {
        return i0(m.h(l0, l2, org.joda.time.m.j()));
    }
    
    public static w l0(final n0 n0, final n0 n2) {
        int n3;
        if (n0 instanceof v && n2 instanceof v) {
            n3 = h.e(n0.t()).E().f(((v)n2).u(), ((v)n0).u());
        }
        else {
            n3 = m.k(n0, n2, w.J);
        }
        return i0(n3);
    }
    
    public static w n0(final m0 m0) {
        if (m0 == null) {
            return w.J;
        }
        return i0(m.h(m0.b(), m0.s(), org.joda.time.m.j()));
    }
    
    @FromString
    public static w r0(final String s) {
        if (s == null) {
            return w.J;
        }
        return i0(w.P.l(s).o0());
    }
    
    private Object u0() {
        return i0(this.G());
    }
    
    public static w v0(final o0 o0) {
        return i0(m.M(o0, 60000L));
    }
    
    public n A0() {
        return n.V(this.G() / 60);
    }
    
    public p0 B0() {
        return p0.r0(j.h(this.G(), 60));
    }
    
    public s0 C0() {
        return s0.z0(this.G() / 10080);
    }
    
    @Override
    public e0 I() {
        return e0.l();
    }
    
    public w T(final int n) {
        if (n == 1) {
            return this;
        }
        return i0(this.G() / n);
    }
    
    public int U() {
        return this.G();
    }
    
    public boolean V(final w w) {
        final boolean b = true;
        boolean b2 = true;
        if (w == null) {
            if (this.G() <= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() > w.G() && b;
    }
    
    public boolean a0(final w w) {
        final boolean b = true;
        boolean b2 = true;
        if (w == null) {
            if (this.G() >= 0) {
                b2 = false;
            }
            return b2;
        }
        return this.G() < w.G() && b;
    }
    
    public w b0(final int n) {
        return this.s0(j.l(n));
    }
    
    public w c0(final w w) {
        if (w == null) {
            return this;
        }
        return this.b0(w.G());
    }
    
    public w o0(final int n) {
        return i0(j.h(this.G(), n));
    }
    
    @Override
    public org.joda.time.m p() {
        return org.joda.time.m.j();
    }
    
    public w q0() {
        return i0(j.l(this.G()));
    }
    
    public w s0(final int n) {
        if (n == 0) {
            return this;
        }
        return i0(j.d(this.G(), n));
    }
    
    public w t0(final w w) {
        if (w == null) {
            return this;
        }
        return this.s0(w.G());
    }
    
    @ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PT");
        sb.append(String.valueOf(this.G()));
        sb.append("M");
        return sb.toString();
    }
    
    public org.joda.time.j x0() {
        return org.joda.time.j.T(this.G() / 1440);
    }
    
    public org.joda.time.k z0() {
        return new org.joda.time.k(this.G() * 60000L);
    }
}
