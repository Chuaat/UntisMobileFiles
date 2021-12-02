// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class f6 extends a5<f6> implements Cloneable
{
    private String[] I;
    private String[] J;
    private int[] K;
    private long[] L;
    private long[] M;
    
    public f6() {
        final String[] j = i5.j;
        this.I = j;
        this.J = j;
        this.K = i5.e;
        final long[] f = i5.f;
        this.L = f;
        this.M = f;
        super.H = null;
        super.G = -1;
    }
    
    private final f6 i() {
        try {
            final f6 f6 = super.g();
            final String[] i = this.I;
            if (i != null && i.length > 0) {
                f6.I = i.clone();
            }
            final String[] j = this.J;
            if (j != null && j.length > 0) {
                f6.J = j.clone();
            }
            final int[] k = this.K;
            if (k != null && k.length > 0) {
                f6.K = k.clone();
            }
            final long[] l = this.L;
            if (l != null && l.length > 0) {
                f6.L = l.clone();
            }
            final long[] m = this.M;
            if (m != null && m.length > 0) {
                f6.M = m.clone();
            }
            return f6;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public final void a(final y4 y4) throws IOException {
        final String[] i = this.I;
        final int n = 0;
        if (i != null && i.length > 0) {
            int n2 = 0;
            while (true) {
                final String[] j = this.I;
                if (n2 >= j.length) {
                    break;
                }
                final String s = j[n2];
                if (s != null) {
                    y4.c(1, s);
                }
                ++n2;
            }
        }
        final String[] k = this.J;
        if (k != null && k.length > 0) {
            int n3 = 0;
            while (true) {
                final String[] l = this.J;
                if (n3 >= l.length) {
                    break;
                }
                final String s2 = l[n3];
                if (s2 != null) {
                    y4.c(2, s2);
                }
                ++n3;
            }
        }
        final int[] m = this.K;
        if (m != null && m.length > 0) {
            int n4 = 0;
            while (true) {
                final int[] k2 = this.K;
                if (n4 >= k2.length) {
                    break;
                }
                y4.l(3, k2[n4]);
                ++n4;
            }
        }
        final long[] l2 = this.L;
        if (l2 != null && l2.length > 0) {
            int n5 = 0;
            while (true) {
                final long[] l3 = this.L;
                if (n5 >= l3.length) {
                    break;
                }
                y4.u(4, l3[n5]);
                ++n5;
            }
        }
        final long[] m2 = this.M;
        if (m2 != null && m2.length > 0) {
            int n6 = n;
            while (true) {
                final long[] m3 = this.M;
                if (n6 >= m3.length) {
                    break;
                }
                y4.u(5, m3[n6]);
                ++n6;
            }
        }
        super.a(y4);
    }
    
    @Override
    protected final int d() {
        final int d = super.d();
        final String[] i = this.I;
        final int n = 0;
        int n2 = d;
        if (i != null) {
            n2 = d;
            if (i.length > 0) {
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    final String[] j = this.I;
                    if (n3 >= j.length) {
                        break;
                    }
                    final String s = j[n3];
                    int n6 = n4;
                    int n7 = n5;
                    if (s != null) {
                        n7 = n5 + 1;
                        n6 = n4 + y4.r(s);
                    }
                    ++n3;
                    n4 = n6;
                    n5 = n7;
                }
                n2 = d + n4 + n5 * 1;
            }
        }
        final String[] k = this.J;
        int n8 = n2;
        if (k != null) {
            n8 = n2;
            if (k.length > 0) {
                int n9 = 0;
                int n10 = 0;
                int n11 = 0;
                while (true) {
                    final String[] l = this.J;
                    if (n9 >= l.length) {
                        break;
                    }
                    final String s2 = l[n9];
                    int n12 = n10;
                    int n13 = n11;
                    if (s2 != null) {
                        n13 = n11 + 1;
                        n12 = n10 + y4.r(s2);
                    }
                    ++n9;
                    n10 = n12;
                    n11 = n13;
                }
                n8 = n2 + n10 + n11 * 1;
            }
        }
        final int[] m = this.K;
        int n14 = n8;
        if (m != null) {
            n14 = n8;
            if (m.length > 0) {
                int n15 = 0;
                int n16 = 0;
                int[] k2;
                while (true) {
                    k2 = this.K;
                    if (n15 >= k2.length) {
                        break;
                    }
                    n16 += y4.z(k2[n15]);
                    ++n15;
                }
                n14 = n8 + n16 + k2.length * 1;
            }
        }
        final long[] l2 = this.L;
        int n17 = n14;
        if (l2 != null) {
            n17 = n14;
            if (l2.length > 0) {
                int n18 = 0;
                int n19 = 0;
                long[] l3;
                while (true) {
                    l3 = this.L;
                    if (n18 >= l3.length) {
                        break;
                    }
                    n19 += y4.x(l3[n18]);
                    ++n18;
                }
                n17 = n14 + n19 + l3.length * 1;
            }
        }
        final long[] m2 = this.M;
        int n20 = n17;
        if (m2 != null) {
            n20 = n17;
            if (m2.length > 0) {
                int n21 = 0;
                int n22 = n;
                long[] m3;
                while (true) {
                    m3 = this.M;
                    if (n22 >= m3.length) {
                        break;
                    }
                    n21 += y4.x(m3[n22]);
                    ++n22;
                }
                n20 = n17 + n21 + m3.length * 1;
            }
        }
        return n20;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof f6)) {
            return false;
        }
        final f6 f6 = (f6)o;
        if (!e5.c(this.I, f6.I)) {
            return false;
        }
        if (!e5.c(this.J, f6.J)) {
            return false;
        }
        if (!e5.a(this.K, f6.K)) {
            return false;
        }
        if (!e5.b(this.L, f6.L)) {
            return false;
        }
        if (!e5.b(this.M, f6.M)) {
            return false;
        }
        final c5 h = super.H;
        if (h != null && !h.a()) {
            return super.H.equals(f6.H);
        }
        final c5 h2 = f6.H;
        return h2 == null || h2.a();
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = f6.class.getName().hashCode();
        final int f = e5.f(this.I);
        final int f2 = e5.f(this.J);
        final int d = e5.d(this.K);
        final int e = e5.e(this.L);
        final int e2 = e5.e(this.M);
        final c5 h = super.H;
        int hashCode2;
        if (h != null && !h.a()) {
            hashCode2 = super.H.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return ((((((hashCode + 527) * 31 + f) * 31 + f2) * 31 + d) * 31 + e) * 31 + e2) * 31 + hashCode2;
    }
}
