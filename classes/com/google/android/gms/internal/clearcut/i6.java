// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class i6 extends a5<i6> implements Cloneable
{
    public long I;
    public long J;
    private long K;
    private String L;
    public int M;
    private String N;
    private int O;
    private boolean P;
    private j6[] Q;
    private byte[] R;
    private l5.d S;
    public byte[] T;
    private String U;
    private String V;
    private f6 W;
    private String X;
    public long Y;
    private g6 Z;
    public byte[] a0;
    private String b0;
    private int c0;
    private int[] d0;
    private long e0;
    private l5.s f0;
    public boolean g0;
    
    public i6() {
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = "";
        this.M = 0;
        this.N = "";
        this.O = 0;
        this.P = false;
        this.Q = j6.i();
        final byte[] l = i5.l;
        this.R = l;
        this.S = null;
        this.T = l;
        this.U = "";
        this.V = "";
        this.W = null;
        this.X = "";
        this.Y = 180000L;
        this.Z = null;
        this.a0 = l;
        this.b0 = "";
        this.c0 = 0;
        this.d0 = i5.e;
        this.e0 = 0L;
        this.f0 = null;
        this.g0 = false;
        super.H = null;
        super.G = -1;
    }
    
    private final i6 i() {
        try {
            final i6 i6 = super.g();
            final j6[] q = this.Q;
            if (q != null && q.length > 0) {
                i6.Q = new j6[q.length];
                int n = 0;
                while (true) {
                    final j6[] q2 = this.Q;
                    if (n >= q2.length) {
                        break;
                    }
                    if (q2[n] != null) {
                        i6.Q[n] = (j6)q2[n].clone();
                    }
                    ++n;
                }
            }
            final l5.d s = this.S;
            if (s != null) {
                i6.S = s;
            }
            final f6 w = this.W;
            if (w != null) {
                i6.W = (f6)w.clone();
            }
            final g6 z = this.Z;
            if (z != null) {
                i6.Z = (g6)z.clone();
            }
            final int[] d0 = this.d0;
            if (d0 != null && d0.length > 0) {
                i6.d0 = d0.clone();
            }
            final l5.s f0 = this.f0;
            if (f0 != null) {
                i6.f0 = f0;
            }
            return i6;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public final void a(final y4 y4) throws IOException {
        final long i = this.I;
        if (i != 0L) {
            y4.u(1, i);
        }
        final String l = this.L;
        if (l != null && !l.equals("")) {
            y4.c(2, this.L);
        }
        final j6[] q = this.Q;
        final int n = 0;
        if (q != null && q.length > 0) {
            int n2 = 0;
            while (true) {
                final j6[] q2 = this.Q;
                if (n2 >= q2.length) {
                    break;
                }
                final j6 j6 = q2[n2];
                if (j6 != null) {
                    y4.b(3, j6);
                }
                ++n2;
            }
        }
        final byte[] r = this.R;
        final byte[] k = i5.l;
        if (!Arrays.equals(r, k)) {
            y4.d(4, this.R);
        }
        if (!Arrays.equals(this.T, k)) {
            y4.d(6, this.T);
        }
        final f6 w = this.W;
        if (w != null) {
            y4.b(7, w);
        }
        final String u = this.U;
        if (u != null && !u.equals("")) {
            y4.c(8, this.U);
        }
        final l5.d s = this.S;
        if (s != null) {
            y4.o(9, s);
        }
        final int m = this.M;
        if (m != 0) {
            y4.l(11, m);
        }
        final String v = this.V;
        if (v != null && !v.equals("")) {
            y4.c(13, this.V);
        }
        final String x = this.X;
        if (x != null && !x.equals("")) {
            y4.c(14, this.X);
        }
        final long y5 = this.Y;
        if (y5 != 180000L) {
            y4.j(15, 0);
            y4.w(y4.v(y5));
        }
        final g6 z = this.Z;
        if (z != null) {
            y4.b(16, z);
        }
        final long j7 = this.J;
        if (j7 != 0L) {
            y4.u(17, j7);
        }
        if (!Arrays.equals(this.a0, k)) {
            y4.d(18, this.a0);
        }
        final int[] d0 = this.d0;
        if (d0 != null && d0.length > 0) {
            int n3 = n;
            while (true) {
                final int[] d2 = this.d0;
                if (n3 >= d2.length) {
                    break;
                }
                y4.l(20, d2[n3]);
                ++n3;
            }
        }
        final l5.s f0 = this.f0;
        if (f0 != null) {
            y4.o(23, f0);
        }
        final String b0 = this.b0;
        if (b0 != null && !b0.equals("")) {
            y4.c(24, this.b0);
        }
        final boolean g0 = this.g0;
        if (g0) {
            y4.k(25, g0);
        }
        final String n4 = this.N;
        if (n4 != null && !n4.equals("")) {
            y4.c(26, this.N);
        }
        super.a(y4);
    }
    
    @Override
    protected final int d() {
        final int d = super.d();
        final long i = this.I;
        int n = d;
        if (i != 0L) {
            n = d + y4.m(1, i);
        }
        final String l = this.L;
        int n2 = n;
        if (l != null) {
            n2 = n;
            if (!l.equals("")) {
                n2 = n + y4.h(2, this.L);
            }
        }
        final j6[] q = this.Q;
        final int n3 = 0;
        int n4 = n2;
        if (q != null) {
            n4 = n2;
            if (q.length > 0) {
                int n5 = 0;
                while (true) {
                    final j6[] q2 = this.Q;
                    n4 = n2;
                    if (n5 >= q2.length) {
                        break;
                    }
                    final j6 j6 = q2[n5];
                    int n6 = n2;
                    if (j6 != null) {
                        n6 = n2 + y4.g(3, j6);
                    }
                    ++n5;
                    n2 = n6;
                }
            }
        }
        final byte[] r = this.R;
        final byte[] k = i5.l;
        int n7 = n4;
        if (!Arrays.equals(r, k)) {
            n7 = n4 + y4.i(4, this.R);
        }
        int n8 = n7;
        if (!Arrays.equals(this.T, k)) {
            n8 = n7 + y4.i(6, this.T);
        }
        final f6 w = this.W;
        int n9 = n8;
        if (w != null) {
            n9 = n8 + y4.g(7, w);
        }
        final String u = this.U;
        int n10 = n9;
        if (u != null) {
            n10 = n9;
            if (!u.equals("")) {
                n10 = n9 + y4.h(8, this.U);
            }
        }
        final l5.d s = this.S;
        int n11 = n10;
        if (s != null) {
            n11 = n10 + p0.O(9, s);
        }
        final int m = this.M;
        int n12 = n11;
        if (m != 0) {
            n12 = n11 + (y4.y(11) + y4.z(m));
        }
        final String v = this.V;
        int n13 = n12;
        if (v != null) {
            n13 = n12;
            if (!v.equals("")) {
                n13 = n12 + y4.h(13, this.V);
            }
        }
        final String x = this.X;
        int n14 = n13;
        if (x != null) {
            n14 = n13;
            if (!x.equals("")) {
                n14 = n13 + y4.h(14, this.X);
            }
        }
        final long y = this.Y;
        int n15 = n14;
        if (y != 180000L) {
            n15 = n14 + (y4.y(15) + y4.x(y4.v(y)));
        }
        final g6 z = this.Z;
        int n16 = n15;
        if (z != null) {
            n16 = n15 + y4.g(16, z);
        }
        final long j7 = this.J;
        int n17 = n16;
        if (j7 != 0L) {
            n17 = n16 + y4.m(17, j7);
        }
        int n18 = n17;
        if (!Arrays.equals(this.a0, k)) {
            n18 = n17 + y4.i(18, this.a0);
        }
        final int[] d2 = this.d0;
        int n19 = n18;
        if (d2 != null) {
            n19 = n18;
            if (d2.length > 0) {
                int n20 = 0;
                int n21 = n3;
                int[] d3;
                while (true) {
                    d3 = this.d0;
                    if (n21 >= d3.length) {
                        break;
                    }
                    n20 += y4.z(d3[n21]);
                    ++n21;
                }
                n19 = n18 + n20 + d3.length * 2;
            }
        }
        final l5.s f0 = this.f0;
        int n22 = n19;
        if (f0 != null) {
            n22 = n19 + p0.O(23, f0);
        }
        final String b0 = this.b0;
        int n23 = n22;
        if (b0 != null) {
            n23 = n22;
            if (!b0.equals("")) {
                n23 = n22 + y4.h(24, this.b0);
            }
        }
        int n24 = n23;
        if (this.g0) {
            n24 = n23 + (y4.y(25) + 1);
        }
        final String n25 = this.N;
        int n26 = n24;
        if (n25 != null) {
            n26 = n24;
            if (!n25.equals("")) {
                n26 = n24 + y4.h(26, this.N);
            }
        }
        return n26;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof i6)) {
            return false;
        }
        final i6 i6 = (i6)o;
        if (this.I != i6.I) {
            return false;
        }
        if (this.J != i6.J) {
            return false;
        }
        final String l = this.L;
        if (l == null) {
            if (i6.L != null) {
                return false;
            }
        }
        else if (!l.equals(i6.L)) {
            return false;
        }
        if (this.M != i6.M) {
            return false;
        }
        final String n = this.N;
        if (n == null) {
            if (i6.N != null) {
                return false;
            }
        }
        else if (!n.equals(i6.N)) {
            return false;
        }
        if (!e5.c(this.Q, i6.Q)) {
            return false;
        }
        if (!Arrays.equals(this.R, i6.R)) {
            return false;
        }
        final l5.d s = this.S;
        if (s == null) {
            if (i6.S != null) {
                return false;
            }
        }
        else if (!s.equals(i6.S)) {
            return false;
        }
        if (!Arrays.equals(this.T, i6.T)) {
            return false;
        }
        final String u = this.U;
        if (u == null) {
            if (i6.U != null) {
                return false;
            }
        }
        else if (!u.equals(i6.U)) {
            return false;
        }
        final String v = this.V;
        if (v == null) {
            if (i6.V != null) {
                return false;
            }
        }
        else if (!v.equals(i6.V)) {
            return false;
        }
        final f6 w = this.W;
        if (w == null) {
            if (i6.W != null) {
                return false;
            }
        }
        else if (!w.equals(i6.W)) {
            return false;
        }
        final String x = this.X;
        if (x == null) {
            if (i6.X != null) {
                return false;
            }
        }
        else if (!x.equals(i6.X)) {
            return false;
        }
        if (this.Y != i6.Y) {
            return false;
        }
        final g6 z = this.Z;
        if (z == null) {
            if (i6.Z != null) {
                return false;
            }
        }
        else if (!z.equals(i6.Z)) {
            return false;
        }
        if (!Arrays.equals(this.a0, i6.a0)) {
            return false;
        }
        final String b0 = this.b0;
        if (b0 == null) {
            if (i6.b0 != null) {
                return false;
            }
        }
        else if (!b0.equals(i6.b0)) {
            return false;
        }
        if (!e5.a(this.d0, i6.d0)) {
            return false;
        }
        final l5.s f0 = this.f0;
        if (f0 == null) {
            if (i6.f0 != null) {
                return false;
            }
        }
        else if (!f0.equals(i6.f0)) {
            return false;
        }
        if (this.g0 != i6.g0) {
            return false;
        }
        final c5 h = super.H;
        if (h != null && !h.a()) {
            return super.H.equals(i6.H);
        }
        final c5 h2 = i6.H;
        return h2 == null || h2.a();
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = i6.class.getName().hashCode();
        final long i = this.I;
        final int n = (int)(i ^ i >>> 32);
        final long j = this.J;
        final int n2 = (int)(j ^ j >>> 32);
        final String l = this.L;
        final int n3 = 0;
        int hashCode2;
        if (l == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = l.hashCode();
        }
        final int m = this.M;
        final String n4 = this.N;
        int hashCode3;
        if (n4 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = n4.hashCode();
        }
        int n5 = 1237;
        final int f = e5.f(this.Q);
        final int hashCode4 = Arrays.hashCode(this.R);
        final l5.d s = this.S;
        int hashCode5;
        if (s == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = s.hashCode();
        }
        final int hashCode6 = Arrays.hashCode(this.T);
        final String u = this.U;
        int hashCode7;
        if (u == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = u.hashCode();
        }
        final String v = this.V;
        int hashCode8;
        if (v == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = v.hashCode();
        }
        final f6 w = this.W;
        int hashCode9;
        if (w == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = w.hashCode();
        }
        final String x = this.X;
        int hashCode10;
        if (x == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = x.hashCode();
        }
        final long y = this.Y;
        final int n6 = (int)(y ^ y >>> 32);
        final g6 z = this.Z;
        int hashCode11;
        if (z == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = z.hashCode();
        }
        final int hashCode12 = Arrays.hashCode(this.a0);
        final String b0 = this.b0;
        int hashCode13;
        if (b0 == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = b0.hashCode();
        }
        final int d = e5.d(this.d0);
        final l5.s f2 = this.f0;
        int hashCode14;
        if (f2 == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = f2.hashCode();
        }
        if (this.g0) {
            n5 = 1231;
        }
        final c5 h = super.H;
        int hashCode15 = n3;
        if (h != null) {
            if (h.a()) {
                hashCode15 = n3;
            }
            else {
                hashCode15 = super.H.hashCode();
            }
        }
        return ((((((((((((((((((((((hashCode + 527) * 31 + n) * 31 + n2) * 31 * 31 + hashCode2) * 31 + m) * 31 + hashCode3) * 31 * 31 + 1237) * 31 + f) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + n6) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 * 31 + d) * 31 * 31 + hashCode14) * 31 + n5) * 31 + hashCode15;
    }
}
