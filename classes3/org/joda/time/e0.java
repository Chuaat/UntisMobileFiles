// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.field.j;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class e0 implements Serializable
{
    private static final long J = 2274324892792009998L;
    private static final Map<e0, Object> K;
    static int L;
    static int M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    private static e0 T;
    private static e0 U;
    private static e0 V;
    private static e0 W;
    private static e0 X;
    private static e0 Y;
    private static e0 Z;
    private static e0 a0;
    private static e0 b0;
    private static e0 c0;
    private static e0 d0;
    private static e0 e0;
    private static e0 f0;
    private static e0 g0;
    private static e0 h0;
    private static e0 i0;
    private static e0 j0;
    private final String G;
    private final m[] H;
    private final int[] I;
    
    static {
        K = new HashMap<e0, Object>(32);
        org.joda.time.e0.L = 0;
        org.joda.time.e0.M = 1;
        org.joda.time.e0.N = 2;
        org.joda.time.e0.O = 3;
        org.joda.time.e0.P = 4;
        org.joda.time.e0.Q = 5;
        org.joda.time.e0.R = 6;
        org.joda.time.e0.S = 7;
    }
    
    protected e0(final String g, final m[] h, final int[] i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public static e0 D() {
        e0 z;
        if ((z = org.joda.time.e0.Z) == null) {
            z = (org.joda.time.e0.Z = new e0("YearDay", new m[] { m.o(), m.b() }, new int[] { 0, -1, -1, 1, -1, -1, -1, -1 }));
        }
        return z;
    }
    
    public static e0 E() {
        e0 y;
        if ((y = org.joda.time.e0.Y) == null) {
            y = (org.joda.time.e0.Y = new e0("YearDayTime", new m[] { m.o(), m.b(), m.g(), m.j(), m.l(), m.i() }, new int[] { 0, -1, -1, 1, 2, 3, 4, 5 }));
        }
        return y;
    }
    
    public static e0 F() {
        e0 v;
        if ((v = org.joda.time.e0.V) == null) {
            v = (org.joda.time.e0.V = new e0("YearMonthDay", new m[] { m.o(), m.k(), m.b() }, new int[] { 0, 1, -1, 2, -1, -1, -1, -1 }));
        }
        return v;
    }
    
    public static e0 G() {
        e0 u;
        if ((u = org.joda.time.e0.U) == null) {
            u = (org.joda.time.e0.U = new e0("YearMonthDayTime", new m[] { m.o(), m.k(), m.b(), m.g(), m.j(), m.l(), m.i() }, new int[] { 0, 1, -1, 2, 3, 4, 5, 6 }));
        }
        return u;
    }
    
    public static e0 H() {
        e0 x;
        if ((x = org.joda.time.e0.X) == null) {
            x = (org.joda.time.e0.X = new e0("YearWeekDay", new m[] { m.o(), m.m(), m.b() }, new int[] { 0, -1, 1, 2, -1, -1, -1, -1 }));
        }
        return x;
    }
    
    public static e0 I() {
        e0 w;
        if ((w = org.joda.time.e0.W) == null) {
            w = (org.joda.time.e0.W = new e0("YearWeekDayTime", new m[] { m.o(), m.m(), m.b(), m.g(), m.j(), m.l(), m.i() }, new int[] { 0, -1, 1, 2, 3, 4, 5, 6 }));
        }
        return w;
    }
    
    public static e0 J() {
        e0 c0;
        if ((c0 = org.joda.time.e0.c0) == null) {
            c0 = (org.joda.time.e0.c0 = new e0("Years", new m[] { m.o() }, new int[] { 0, -1, -1, -1, -1, -1, -1, -1 }));
        }
        return c0;
    }
    
    public static e0 b() {
        e0 a0;
        if ((a0 = org.joda.time.e0.a0) == null) {
            a0 = (org.joda.time.e0.a0 = new e0("DayTime", new m[] { m.b(), m.g(), m.j(), m.l(), m.i() }, new int[] { -1, -1, -1, 0, 1, 2, 3, 4 }));
        }
        return a0;
    }
    
    public static e0 c() {
        e0 f0;
        if ((f0 = org.joda.time.e0.f0) == null) {
            f0 = (org.joda.time.e0.f0 = new e0("Days", new m[] { m.b() }, new int[] { -1, -1, -1, 0, -1, -1, -1, -1 }));
        }
        return f0;
    }
    
    public static e0 d(final m[] a) {
        // monitorenter(e0.class)
        Label_0688: {
            if (a == null) {
                break Label_0688;
            }
            try {
                if (a.length == 0) {
                    throw new IllegalArgumentException("Types array must not be null or empty");
                }
                for (int i = 0; i < a.length; ++i) {
                    if (a[i] == null) {
                        throw new IllegalArgumentException("Types array must not contain null");
                    }
                }
                final Map<e0, Object> k = org.joda.time.e0.K;
                if (k.isEmpty()) {
                    k.put(q(), q());
                    k.put(G(), G());
                    k.put(F(), F());
                    k.put(I(), I());
                    k.put(H(), H());
                    k.put(E(), E());
                    k.put(D(), D());
                    k.put(b(), b());
                    k.put(r(), r());
                    k.put(J(), J());
                    k.put(m(), m());
                    k.put(s(), s());
                    k.put(c(), c());
                    k.put(h(), h());
                    k.put(l(), l());
                    k.put(n(), n());
                    k.put(k(), k());
                }
                final e0 e0 = new e0(null, a, null);
                final e0 value = k.get(e0);
                if (value instanceof e0) {
                    return value;
                }
                if (value != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("PeriodType does not support fields: ");
                    sb.append(value);
                    throw new IllegalArgumentException(sb.toString());
                }
                final e0 q = q();
                final ArrayList obj = new ArrayList(Arrays.asList(a));
                e0 c = q;
                if (!obj.remove(m.o())) {
                    c = q.C();
                }
                e0 y = c;
                if (!obj.remove(m.k())) {
                    y = c.y();
                }
                e0 b = y;
                if (!obj.remove(m.m())) {
                    b = y.B();
                }
                e0 t = b;
                if (!obj.remove(m.b())) {
                    t = b.t();
                }
                e0 v = t;
                if (!obj.remove(m.g())) {
                    v = t.v();
                }
                e0 x = v;
                if (!obj.remove(m.j())) {
                    x = v.x();
                }
                e0 z = x;
                if (!obj.remove(m.l())) {
                    z = x.z();
                }
                e0 w = z;
                if (!obj.remove(m.i())) {
                    w = z.w();
                }
                if (obj.size() > 0) {
                    k.put(e0, obj);
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("PeriodType does not support fields: ");
                    sb2.append(obj);
                    throw new IllegalArgumentException(sb2.toString());
                }
                final e0 e2 = new e0(null, w.H, null);
                final e0 e3 = k.get(e2);
                if (e3 != null) {
                    k.put(e2, e3);
                    return e3;
                }
                k.put(e2, w);
                return w;
            }
            finally {
            }
            // monitorexit(e0.class)
        }
    }
    
    public static e0 h() {
        e0 g0;
        if ((g0 = org.joda.time.e0.g0) == null) {
            g0 = (org.joda.time.e0.g0 = new e0("Hours", new m[] { m.g() }, new int[] { -1, -1, -1, -1, 0, -1, -1, -1 }));
        }
        return g0;
    }
    
    public static e0 k() {
        e0 j0;
        if ((j0 = org.joda.time.e0.j0) == null) {
            j0 = (org.joda.time.e0.j0 = new e0("Millis", new m[] { m.i() }, new int[] { -1, -1, -1, -1, -1, -1, -1, 0 }));
        }
        return j0;
    }
    
    public static e0 l() {
        e0 h0;
        if ((h0 = org.joda.time.e0.h0) == null) {
            h0 = (org.joda.time.e0.h0 = new e0("Minutes", new m[] { m.j() }, new int[] { -1, -1, -1, -1, -1, 0, -1, -1 }));
        }
        return h0;
    }
    
    public static e0 m() {
        e0 d0;
        if ((d0 = org.joda.time.e0.d0) == null) {
            d0 = (org.joda.time.e0.d0 = new e0("Months", new m[] { m.k() }, new int[] { -1, 0, -1, -1, -1, -1, -1, -1 }));
        }
        return d0;
    }
    
    public static e0 n() {
        e0 i0;
        if ((i0 = org.joda.time.e0.i0) == null) {
            i0 = (org.joda.time.e0.i0 = new e0("Seconds", new m[] { m.l() }, new int[] { -1, -1, -1, -1, -1, -1, 0, -1 }));
        }
        return i0;
    }
    
    public static e0 q() {
        e0 t;
        if ((t = org.joda.time.e0.T) == null) {
            t = (org.joda.time.e0.T = new e0("Standard", new m[] { m.o(), m.k(), m.m(), m.b(), m.g(), m.j(), m.l(), m.i() }, new int[] { 0, 1, 2, 3, 4, 5, 6, 7 }));
        }
        return t;
    }
    
    public static e0 r() {
        e0 b0;
        if ((b0 = org.joda.time.e0.b0) == null) {
            b0 = (org.joda.time.e0.b0 = new e0("Time", new m[] { m.g(), m.j(), m.l(), m.i() }, new int[] { -1, -1, -1, -1, 0, 1, 2, 3 }));
        }
        return b0;
    }
    
    public static e0 s() {
        e0 e0;
        if ((e0 = org.joda.time.e0.e0) == null) {
            e0 = (org.joda.time.e0.e0 = new e0("Weeks", new m[] { m.m() }, new int[] { -1, -1, 0, -1, -1, -1, -1, -1 }));
        }
        return e0;
    }
    
    private e0 u(final int n, final String str) {
        final int n2 = this.I[n];
        if (n2 == -1) {
            return this;
        }
        final m[] array = new m[this.p() - 1];
        final int n3 = 0;
        int n4 = 0;
        while (true) {
            final m[] h = this.H;
            if (n4 >= h.length) {
                break;
            }
            if (n4 < n2) {
                array[n4] = h[n4];
            }
            else if (n4 > n2) {
                array[n4 - 1] = h[n4];
            }
            ++n4;
        }
        final int[] array2 = new int[8];
        for (int i = n3; i < 8; ++i) {
            if (i < n) {
                array2[i] = this.I[i];
            }
            else if (i > n) {
                final int[] j = this.I;
                int n5;
                if (j[i] == -1) {
                    n5 = -1;
                }
                else {
                    n5 = j[i] - 1;
                }
                array2[i] = n5;
            }
            else {
                array2[i] = -1;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.g());
        sb.append(str);
        return new e0(sb.toString(), array, array2);
    }
    
    public e0 B() {
        return this.u(2, "NoWeeks");
    }
    
    public e0 C() {
        return this.u(0, "NoYears");
    }
    
    boolean a(final o0 o0, int n, final int[] array, final int n2) {
        if (n2 == 0) {
            return false;
        }
        n = this.I[n];
        if (n != -1) {
            array[n] = j.d(array[n], n2);
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }
    
    public m e(final int n) {
        return this.H[n];
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof e0 && Arrays.equals(this.H, ((e0)o).H));
    }
    
    int f(final o0 o0, int e0) {
        e0 = this.I[e0];
        if (e0 == -1) {
            e0 = 0;
        }
        else {
            e0 = o0.e0(e0);
        }
        return e0;
    }
    
    public String g() {
        return this.G;
    }
    
    @Override
    public int hashCode() {
        int n = 0;
        int n2 = 0;
        while (true) {
            final m[] h = this.H;
            if (n >= h.length) {
                break;
            }
            n2 += h[n].hashCode();
            ++n;
        }
        return n2;
    }
    
    public int i(final m m) {
        for (int p = this.p(), i = 0; i < p; ++i) {
            if (this.H[i] == m) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean j(final m m) {
        return this.i(m) >= 0;
    }
    
    boolean o(final o0 o0, int n, final int[] array, final int n2) {
        n = this.I[n];
        if (n != -1) {
            array[n] = n2;
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }
    
    public int p() {
        return this.H.length;
    }
    
    public e0 t() {
        return this.u(3, "NoDays");
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodType[");
        sb.append(this.g());
        sb.append("]");
        return sb.toString();
    }
    
    public e0 v() {
        return this.u(4, "NoHours");
    }
    
    public e0 w() {
        return this.u(7, "NoMillis");
    }
    
    public e0 x() {
        return this.u(5, "NoMinutes");
    }
    
    public e0 y() {
        return this.u(1, "NoMonths");
    }
    
    public e0 z() {
        return this.u(6, "NoSeconds");
    }
}
