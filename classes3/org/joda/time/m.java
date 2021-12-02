// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.io.Serializable;

public abstract class m implements Serializable
{
    private static final long H = 8765135187319L;
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
    static final m U;
    static final m V;
    static final m W;
    static final m X;
    static final m Y;
    static final m Z;
    static final m a0;
    static final m b0;
    static final m c0;
    static final m d0;
    static final m e0;
    static final m f0;
    private final String G;
    
    static {
        U = new a("eras", (byte)1);
        V = new a("centuries", (byte)2);
        W = new a("weekyears", (byte)3);
        X = new a("years", (byte)4);
        Y = new a("months", (byte)5);
        Z = new a("weeks", (byte)6);
        a0 = new a("days", (byte)7);
        b0 = new a("halfdays", (byte)8);
        c0 = new a("hours", (byte)9);
        d0 = new a("minutes", (byte)10);
        e0 = new a("seconds", (byte)11);
        f0 = new a("millis", (byte)12);
    }
    
    protected m(final String g) {
        this.G = g;
    }
    
    public static m a() {
        return m.V;
    }
    
    public static m b() {
        return m.a0;
    }
    
    public static m c() {
        return m.U;
    }
    
    public static m f() {
        return m.b0;
    }
    
    public static m g() {
        return m.c0;
    }
    
    public static m i() {
        return m.f0;
    }
    
    public static m j() {
        return m.d0;
    }
    
    public static m k() {
        return m.Y;
    }
    
    public static m l() {
        return m.e0;
    }
    
    public static m m() {
        return m.Z;
    }
    
    public static m n() {
        return m.W;
    }
    
    public static m o() {
        return m.X;
    }
    
    public abstract l d(final org.joda.time.a p0);
    
    public String e() {
        return this.G;
    }
    
    public boolean h(final org.joda.time.a a) {
        return this.d(a).z();
    }
    
    @Override
    public String toString() {
        return this.e();
    }
    
    private static class a extends m
    {
        private static final long h0 = 31156755687123L;
        private final byte g0;
        
        a(final String s, final byte b) {
            super(s);
            this.g0 = b;
        }
        
        private Object p() {
            switch (this.g0) {
                default: {
                    return this;
                }
                case 12: {
                    return m.f0;
                }
                case 11: {
                    return m.e0;
                }
                case 10: {
                    return m.d0;
                }
                case 9: {
                    return m.c0;
                }
                case 8: {
                    return m.b0;
                }
                case 7: {
                    return m.a0;
                }
                case 6: {
                    return m.Z;
                }
                case 5: {
                    return m.Y;
                }
                case 4: {
                    return m.X;
                }
                case 3: {
                    return m.W;
                }
                case 2: {
                    return m.V;
                }
                case 1: {
                    return m.U;
                }
            }
        }
        
        @Override
        public l d(org.joda.time.a e) {
            e = h.e(e);
            switch (this.g0) {
                default: {
                    throw new InternalError();
                }
                case 12: {
                    return e.y();
                }
                case 11: {
                    return e.J();
                }
                case 10: {
                    return e.E();
                }
                case 9: {
                    return e.x();
                }
                case 8: {
                    return e.u();
                }
                case 7: {
                    return e.j();
                }
                case 6: {
                    return e.N();
                }
                case 5: {
                    return e.G();
                }
                case 4: {
                    return e.W();
                }
                case 3: {
                    return e.Q();
                }
                case 2: {
                    return e.c();
                }
                case 1: {
                    return e.l();
                }
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof a) {
                if (this.g0 != ((a)o).g0) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return 1 << this.g0;
        }
    }
}
