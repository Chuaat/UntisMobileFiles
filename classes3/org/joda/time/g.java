// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.io.Serializable;

public abstract class g implements Serializable
{
    private static final g A0;
    private static final g B0;
    private static final long H = -42615285973990L;
    static final byte I = 1;
    static final byte J = 2;
    static final byte K = 3;
    static final byte L = 4;
    static final byte M = 5;
    static final byte N = 6;
    static final byte O = 7;
    static final byte P = 8;
    static final byte Q = 9;
    static final byte R = 10;
    static final byte S = 11;
    static final byte T = 12;
    static final byte U = 13;
    static final byte V = 14;
    static final byte W = 15;
    static final byte X = 16;
    static final byte Y = 17;
    static final byte Z = 18;
    static final byte a0 = 19;
    static final byte b0 = 20;
    static final byte c0 = 21;
    static final byte d0 = 22;
    static final byte e0 = 23;
    private static final g f0;
    private static final g g0;
    private static final g h0;
    private static final g i0;
    private static final g j0;
    private static final g k0;
    private static final g l0;
    private static final g m0;
    private static final g n0;
    private static final g o0;
    private static final g p0;
    private static final g q0;
    private static final g r0;
    private static final g s0;
    private static final g t0;
    private static final g u0;
    private static final g v0;
    private static final g w0;
    private static final g x0;
    private static final g y0;
    private static final g z0;
    private final String G;
    
    static {
        f0 = new a("era", (byte)1, m.c(), null);
        g0 = new a("yearOfEra", (byte)2, m.o(), m.c());
        h0 = new a("centuryOfEra", (byte)3, m.a(), m.c());
        i0 = new a("yearOfCentury", (byte)4, m.o(), m.a());
        j0 = new a("year", (byte)5, m.o(), null);
        k0 = new a("dayOfYear", (byte)6, m.b(), m.o());
        l0 = new a("monthOfYear", (byte)7, m.k(), m.o());
        m0 = new a("dayOfMonth", (byte)8, m.b(), m.k());
        n0 = new a("weekyearOfCentury", (byte)9, m.n(), m.a());
        o0 = new a("weekyear", (byte)10, m.n(), null);
        p0 = new a("weekOfWeekyear", (byte)11, m.m(), m.n());
        q0 = new a("dayOfWeek", (byte)12, m.b(), m.m());
        r0 = new a("halfdayOfDay", (byte)13, m.f(), m.b());
        s0 = new a("hourOfHalfday", (byte)14, m.g(), m.f());
        t0 = new a("clockhourOfHalfday", (byte)15, m.g(), m.f());
        u0 = new a("clockhourOfDay", (byte)16, m.g(), m.b());
        v0 = new a("hourOfDay", (byte)17, m.g(), m.b());
        w0 = new a("minuteOfDay", (byte)18, m.j(), m.b());
        x0 = new a("minuteOfHour", (byte)19, m.j(), m.g());
        y0 = new a("secondOfDay", (byte)20, m.l(), m.b());
        z0 = new a("secondOfMinute", (byte)21, m.l(), m.j());
        A0 = new a("millisOfDay", (byte)22, m.i(), m.b());
        B0 = new a("millisOfSecond", (byte)23, m.i(), m.l());
    }
    
    protected g(final String g) {
        this.G = g;
    }
    
    public static g B() {
        return g.m0;
    }
    
    public static g C() {
        return g.q0;
    }
    
    public static g D() {
        return g.k0;
    }
    
    public static g E() {
        return g.f0;
    }
    
    public static g J() {
        return g.r0;
    }
    
    public static g K() {
        return g.v0;
    }
    
    public static g L() {
        return g.s0;
    }
    
    public static g N() {
        return g.A0;
    }
    
    public static g O() {
        return g.B0;
    }
    
    public static g P() {
        return g.w0;
    }
    
    public static g Q() {
        return g.x0;
    }
    
    public static g R() {
        return g.l0;
    }
    
    public static g S() {
        return g.y0;
    }
    
    public static g T() {
        return g.z0;
    }
    
    public static g U() {
        return g.p0;
    }
    
    public static g V() {
        return g.o0;
    }
    
    public static g W() {
        return g.n0;
    }
    
    public static g X() {
        return g.j0;
    }
    
    public static g Y() {
        return g.i0;
    }
    
    public static g Z() {
        return g.g0;
    }
    
    public static g x() {
        return g.h0;
    }
    
    public static g y() {
        return g.u0;
    }
    
    public static g z() {
        return g.t0;
    }
    
    public abstract m F();
    
    public abstract f G(final org.joda.time.a p0);
    
    public String H() {
        return this.G;
    }
    
    public abstract m I();
    
    public boolean M(final org.joda.time.a a) {
        return this.G(a).M();
    }
    
    @Override
    public String toString() {
        return this.H();
    }
    
    private static class a extends g
    {
        private static final long F0 = -9937958251642L;
        private final byte C0;
        private final transient m D0;
        private final transient m E0;
        
        a(final String s, final byte b, final m d0, final m e0) {
            super(s);
            this.C0 = b;
            this.D0 = d0;
            this.E0 = e0;
        }
        
        private Object a0() {
            switch (this.C0) {
                default: {
                    return this;
                }
                case 23: {
                    return g.B0;
                }
                case 22: {
                    return g.A0;
                }
                case 21: {
                    return g.z0;
                }
                case 20: {
                    return g.y0;
                }
                case 19: {
                    return g.x0;
                }
                case 18: {
                    return g.w0;
                }
                case 17: {
                    return g.v0;
                }
                case 16: {
                    return g.u0;
                }
                case 15: {
                    return g.t0;
                }
                case 14: {
                    return g.s0;
                }
                case 13: {
                    return g.r0;
                }
                case 12: {
                    return g.q0;
                }
                case 11: {
                    return g.p0;
                }
                case 10: {
                    return g.o0;
                }
                case 9: {
                    return g.n0;
                }
                case 8: {
                    return g.m0;
                }
                case 7: {
                    return g.l0;
                }
                case 6: {
                    return g.k0;
                }
                case 5: {
                    return g.j0;
                }
                case 4: {
                    return g.i0;
                }
                case 3: {
                    return g.h0;
                }
                case 2: {
                    return g.g0;
                }
                case 1: {
                    return g.f0;
                }
            }
        }
        
        @Override
        public m F() {
            return this.D0;
        }
        
        @Override
        public f G(org.joda.time.a e) {
            e = h.e(e);
            switch (this.C0) {
                default: {
                    throw new InternalError();
                }
                case 23: {
                    return e.B();
                }
                case 22: {
                    return e.z();
                }
                case 21: {
                    return e.I();
                }
                case 20: {
                    return e.H();
                }
                case 19: {
                    return e.D();
                }
                case 18: {
                    return e.C();
                }
                case 17: {
                    return e.v();
                }
                case 16: {
                    return e.e();
                }
                case 15: {
                    return e.f();
                }
                case 14: {
                    return e.w();
                }
                case 13: {
                    return e.t();
                }
                case 12: {
                    return e.h();
                }
                case 11: {
                    return e.M();
                }
                case 10: {
                    return e.O();
                }
                case 9: {
                    return e.P();
                }
                case 8: {
                    return e.g();
                }
                case 7: {
                    return e.F();
                }
                case 6: {
                    return e.i();
                }
                case 5: {
                    return e.T();
                }
                case 4: {
                    return e.U();
                }
                case 3: {
                    return e.d();
                }
                case 2: {
                    return e.V();
                }
                case 1: {
                    return e.k();
                }
            }
        }
        
        @Override
        public m I() {
            return this.E0;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof a) {
                if (this.C0 != ((a)o).C0) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return 1 << this.C0;
        }
    }
}
