// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import h2.c;
import android.os.Parcel;
import java.util.Arrays;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@f2.a
@h2.d.a(creator = "ExperimentTokensCreator")
@f({ 1 })
public class b extends h2.a
{
    @f2.a
    public static final Parcelable$Creator<b> CREATOR;
    private static final byte[][] O;
    private static final b P;
    private static final a Q;
    private static final a R;
    private static final a S;
    private static final a T;
    @c(id = 2)
    private final String G;
    @c(id = 3)
    private final byte[] H;
    @c(id = 4)
    private final byte[][] I;
    @c(id = 5)
    private final byte[][] J;
    @c(id = 6)
    private final byte[][] K;
    @c(id = 7)
    private final byte[][] L;
    @c(id = 8)
    private final int[] M;
    @c(id = 9)
    private final byte[][] N;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
        final byte[][] array = O = new byte[0][];
        P = new b("", null, array, array, array, array, null, null);
        Q = (a)new i();
        R = (a)new j();
        S = (a)new k();
        T = (a)new l();
    }
    
    @h2.d.b
    public b(@e(id = 2) final String g, @e(id = 3) final byte[] h, @e(id = 4) final byte[][] i, @e(id = 5) final byte[][] j, @e(id = 6) final byte[][] k, @e(id = 7) final byte[][] l, @e(id = 8) final int[] m, @e(id = 9) final byte[][] n) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    private static List<Integer> M(final int[] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final ArrayList<Comparable> list = new ArrayList<Comparable>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        Collections.sort(list);
        return (List<Integer>)list;
    }
    
    private static List<String> g1(final byte[][] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final ArrayList<Comparable> list = new ArrayList<Comparable>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.encodeToString(array[i], 3));
        }
        Collections.sort(list);
        return (List<String>)list;
    }
    
    private static void q1(final StringBuilder sb, String s, final byte[][] array) {
        sb.append(s);
        sb.append("=");
        if (array == null) {
            s = "null";
        }
        else {
            sb.append("(");
            final int length = array.length;
            int n = 1;
            for (int i = 0; i < length; ++i, n = 0) {
                final byte[] array2 = array[i];
                if (n == 0) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(array2, 3));
                sb.append("'");
            }
            s = ")";
        }
        sb.append(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof b) {
            final b b = (b)o;
            if (s.a(this.G, b.G) && Arrays.equals(this.H, b.H) && s.a(g1(this.I), g1(b.I)) && s.a(g1(this.J), g1(b.J)) && s.a(g1(this.K), g1(b.K)) && s.a(g1(this.L), g1(b.L)) && s.a(M(this.M), M(b.M)) && s.a(g1(this.N), g1(b.N))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        final String g = this.G;
        String string;
        if (g == null) {
            string = "null";
        }
        else {
            final StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 2);
            sb2.append("'");
            sb2.append(g);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", ");
        final byte[] h = this.H;
        sb.append("direct");
        sb.append("=");
        if (h == null) {
            sb.append("null");
        }
        else {
            sb.append("'");
            sb.append(Base64.encodeToString(h, 3));
            sb.append("'");
        }
        sb.append(", ");
        q1(sb, "GAIA", this.I);
        sb.append(", ");
        q1(sb, "PSEUDO", this.J);
        sb.append(", ");
        q1(sb, "ALWAYS", this.K);
        sb.append(", ");
        q1(sb, "OTHER", this.L);
        sb.append(", ");
        final int[] m = this.M;
        sb.append("weak");
        sb.append("=");
        if (m == null) {
            sb.append("null");
        }
        else {
            sb.append("(");
            final int length = m.length;
            int n = 1;
            for (int i = 0; i < length; ++i, n = 0) {
                final int j = m[i];
                if (n == 0) {
                    sb.append(", ");
                }
                sb.append(j);
            }
            sb.append(")");
        }
        sb.append(", ");
        q1(sb, "directs", this.N);
        sb.append(")");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 2, this.G, false);
        h2.c.m(parcel, 3, this.H, false);
        h2.c.n(parcel, 4, this.I, false);
        h2.c.n(parcel, 5, this.J, false);
        h2.c.n(parcel, 6, this.K, false);
        h2.c.n(parcel, 7, this.L, false);
        h2.c.G(parcel, 8, this.M, false);
        h2.c.n(parcel, 9, this.N, false);
        h2.c.b(parcel, a);
    }
    
    private interface a
    {
    }
}
