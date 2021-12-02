// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.j0;
import org.joda.time.a;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.f;

public final class z extends c
{
    private static final long S0 = -3663823829888L;
    public static final int T0 = 1;
    private static final f U0;
    public static final a V0;
    public static final a W0;
    public static final a X0;
    public static final a Y0;
    private static final int Z0 = -292269337;
    private static final int a1 = 292271022;
    private static final int b1 = 59;
    private static final int c1 = 30;
    private static final int d1 = 29;
    private static final long e1 = 5097600000L;
    private static final long f1 = 2551440384L;
    private static final long g1 = 2592000000L;
    private static final long h1 = 30617280288L;
    private static final long i1 = 30585600000L;
    private static final long j1 = 30672000000L;
    private static final long k1 = -42521587200000L;
    private static final int l1 = 30;
    private static final long m1 = 918518400000L;
    private static final ConcurrentHashMap<i, z[]> n1;
    private static final z o1;
    private final a R0;
    
    static {
        U0 = new org.joda.time.chrono.i("AH");
        V0 = new a(0, 623158436);
        W0 = new a(1, 623191204);
        X0 = new a(2, 690562340);
        Y0 = new a(3, 153692453);
        n1 = new ConcurrentHashMap<i, z[]>();
        o1 = W0(i.I);
    }
    
    z(final org.joda.time.a a, final Object o, final a r0) {
        super(a, o, 4);
        this.R0 = r0;
    }
    
    public static z V0() {
        return X0(i.n(), z.W0);
    }
    
    public static z W0(final i i) {
        return X0(i, z.W0);
    }
    
    public static z X0(i value, final a a) {
        Object n = value;
        if (value == null) {
            n = i.n();
        }
        final ConcurrentHashMap<i, z[]> n2 = z.n1;
        if ((value = n2.get(n)) == null) {
            value = new z[4];
            final z[] array = n2.putIfAbsent((i)n, (z[])value);
            if (array != null) {
                value = array;
            }
        }
        Serializable i;
        if ((i = value[a.G]) == null) {
            synchronized (value) {
                if ((i = value[a.G]) == null) {
                    i = org.joda.time.i.I;
                    if (n == i) {
                        final z z = new z(null, null, a);
                        i = new z(c0.f0(z, new org.joda.time.c(1, 1, 1, 0, 0, 0, 0, z), null), null, a);
                    }
                    else {
                        i = new z(e0.e0(X0((i)i, a), (i)n), null, a);
                    }
                    value[a.G] = i;
                }
            }
        }
        return (z)i;
    }
    
    public static z Y0() {
        return z.o1;
    }
    
    private Object a1() {
        final org.joda.time.a y = this.Y();
        z z;
        if (y == null) {
            z = Y0();
        }
        else {
            z = W0(y.s());
        }
        return z;
    }
    
    @Override
    int B0() {
        return 292271022;
    }
    
    @Override
    int D0() {
        return 1;
    }
    
    @Override
    int G0(final long n, int n2) {
        n2 = (int)((n - this.P0(n2)) / 86400000L);
        if (n2 == 354) {
            return 12;
        }
        return n2 * 2 / 59 + 1;
    }
    
    @Override
    long H0(int n, int n2) {
        n = n2 - 1;
        n2 = n / 2;
        if (n % 2 == 1) {
            return n2 * 5097600000L + 2592000000L;
        }
        return n2 * 5097600000L;
    }
    
    @Override
    int M0(long n) {
        final long n2 = n + 42521587200000L;
        n = n2 / 918518400000L;
        final long n3 = n2 % 918518400000L;
        int n5;
        final int n4 = n5 = (int)(n * 30L + 1L);
        n = n3;
    Label_0049_Outer:
        while (true) {
            if (!this.T0(n4)) {
                break Label_0056;
            }
            n = n3;
            n5 = n4;
            while (true) {
                long n6 = 30672000000L;
                Label_0060: {
                    break Label_0060;
                    n6 = 30585600000L;
                }
                if (n < n6) {
                    return n5;
                }
                final long n7 = n - n6;
                final int n8 = ++n5;
                n = n7;
                if (this.T0(n8)) {
                    n5 = n8;
                    n = n7;
                    continue;
                }
                break;
            }
            continue Label_0049_Outer;
        }
    }
    
    @Override
    long N0(final long n, final long n2) {
        final int m0 = this.M0(n);
        final int m2 = this.M0(n2);
        final long p2 = this.P0(m0);
        final long p3 = this.P0(m2);
        int n3 = m0 - m2;
        if (n - p2 < n2 - p3) {
            --n3;
        }
        return n3;
    }
    
    @Override
    public org.joda.time.a R() {
        return z.o1;
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.s()) {
            return this;
        }
        return W0(n);
    }
    
    @Override
    boolean T0(final int n) {
        return this.R0.a(n);
    }
    
    @Override
    long U0(final long n, final int n2) {
        final int q0 = this.q0(n, this.M0(n));
        final int c0 = this.C0(n);
        int n3 = q0;
        if (q0 > 354) {
            n3 = q0;
            if (!this.T0(n2)) {
                n3 = q0 - 1;
            }
        }
        return this.Q0(n2, 1, n3) + c0;
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        if (this.Y() == null) {
            super.X(a);
            a.I = z.U0;
            final h d = new h(this, 12);
            a.D = d;
            a.i = d.t();
        }
    }
    
    public a Z0() {
        return this.R0;
    }
    
    @Override
    long e0(int i) {
        if (i > 292271022) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Year is too large: ");
            sb.append(i);
            sb.append(" > ");
            sb.append(292271022);
            throw new ArithmeticException(sb.toString());
        }
        if (i >= -292269337) {
            final int n = i - 1;
            long n2 = n / 30 * 918518400000L - 42521587200000L;
            long n3;
            for (i = 1; i < n % 30 + 1; ++i) {
                if (this.T0(i)) {
                    n3 = 30672000000L;
                }
                else {
                    n3 = 30585600000L;
                }
                n2 += n3;
            }
            return n2;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Year is too small: ");
        sb2.append(i);
        sb2.append(" < ");
        sb2.append(-292269337);
        throw new ArithmeticException(sb2.toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof z) {
            if (this.Z0().G != ((z)o).Z0().G || !super.equals(o)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    long f0() {
        return 21260793600000L;
    }
    
    @Override
    long g0() {
        return 2551440384L;
    }
    
    @Override
    long h0() {
        return 30617280288L;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() * 13 + this.Z0().hashCode();
    }
    
    @Override
    long i0() {
        return 15308640144L;
    }
    
    @Override
    int l0(final long n) {
        final int n2 = this.p0(n) - 1;
        if (n2 == 354) {
            return 30;
        }
        return n2 % 59 % 30 + 1;
    }
    
    @Override
    int r0() {
        return 30;
    }
    
    @Override
    int s0(int n) {
        final int n2 = 30;
        if (n == 12) {
            return 30;
        }
        if ((n - 1) % 2 == 0) {
            n = n2;
        }
        else {
            n = 29;
        }
        return n;
    }
    
    @Override
    int v0(int n) {
        if (this.T0(n)) {
            n = 355;
        }
        else {
            n = 354;
        }
        return n;
    }
    
    @Override
    int w0() {
        return 355;
    }
    
    @Override
    int x0(int n, final int n2) {
        final int n3 = 30;
        if (n2 == 12 && this.T0(n)) {
            return 30;
        }
        if ((n2 - 1) % 2 == 0) {
            n = n3;
        }
        else {
            n = 29;
        }
        return n;
    }
    
    public static class a implements Serializable
    {
        private static final long I = 26581275372698L;
        final byte G;
        final int H;
        
        a(final int n, final int h) {
            this.G = (byte)n;
            this.H = h;
        }
        
        private Object b() {
            final byte g = this.G;
            if (g == 0) {
                return z.V0;
            }
            if (g == 1) {
                return z.W0;
            }
            if (g == 2) {
                return z.X0;
            }
            if (g != 3) {
                return this;
            }
            return z.Y0;
        }
        
        boolean a(final int n) {
            boolean b = true;
            if ((1 << n % 30 & this.H) <= 0) {
                b = false;
            }
            return b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                b2 = b2;
                if (this.G == ((a)o).G) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public int hashCode() {
            return this.G;
        }
    }
}
