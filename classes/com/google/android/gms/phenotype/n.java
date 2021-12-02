// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import h2.c;
import android.os.Parcel;
import android.util.Base64;
import java.util.Arrays;
import java.util.Comparator;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "FlagCreator")
@f({ 1 })
public final class n extends a implements Comparable<n>
{
    public static final Parcelable$Creator<n> CREATOR;
    private static final Comparator<n> O;
    @c(id = 2)
    public final String G;
    @c(id = 3)
    private final long H;
    @c(id = 4)
    private final boolean I;
    @c(id = 5)
    private final double J;
    @c(id = 6)
    private final String K;
    @c(id = 7)
    private final byte[] L;
    @c(id = 8)
    private final int M;
    @c(id = 9)
    public final int N;
    
    static {
        CREATOR = (Parcelable$Creator)new p();
        O = new o();
    }
    
    @b
    public n(@e(id = 2) final String g, @e(id = 3) final long h, @e(id = 4) final boolean i, @e(id = 5) final double j, @e(id = 6) final String k, @e(id = 7) final byte[] l, @e(id = 8) final int m, @e(id = 9) final int n) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    private static int M(final int n, final int n2) {
        if (n < n2) {
            return -1;
        }
        if (n == n2) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof n) {
            final n n = (n)o;
            if (s.a(this.G, n.G)) {
                final int m = this.M;
                if (m == n.M) {
                    if (this.N == n.N) {
                        if (m != 1) {
                            if (m == 2) {
                                return this.I == n.I;
                            }
                            if (m == 3) {
                                return this.J == n.J;
                            }
                            if (m == 4) {
                                return s.a(this.K, n.K);
                            }
                            if (m == 5) {
                                return Arrays.equals(this.L, n.L);
                            }
                            final int i = this.M;
                            final StringBuilder sb = new StringBuilder(31);
                            sb.append("Invalid enum value: ");
                            sb.append(i);
                            throw new AssertionError((Object)sb.toString());
                        }
                        else if (this.H == n.H) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Flag(");
        sb.append(this.G);
        sb.append(", ");
        final int m = this.M;
        Label_0224: {
            if (m != 1) {
                if (m != 2) {
                    if (m != 3) {
                        String str;
                        if (m != 4) {
                            if (m != 5) {
                                final String g = this.G;
                                final int i = this.M;
                                final StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 27);
                                sb2.append("Invalid type: ");
                                sb2.append(g);
                                sb2.append(", ");
                                sb2.append(i);
                                throw new AssertionError((Object)sb2.toString());
                            }
                            if (this.L == null) {
                                sb.append("null");
                                break Label_0224;
                            }
                            sb.append("'");
                            str = Base64.encodeToString(this.L, 3);
                        }
                        else {
                            sb.append("'");
                            str = this.K;
                        }
                        sb.append(str);
                        sb.append("'");
                    }
                    else {
                        sb.append(this.J);
                    }
                }
                else {
                    sb.append(this.I);
                }
            }
            else {
                sb.append(this.H);
            }
        }
        sb.append(", ");
        sb.append(this.M);
        sb.append(", ");
        sb.append(this.N);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 2, this.G, false);
        h2.c.K(parcel, 3, this.H);
        h2.c.g(parcel, 4, this.I);
        h2.c.r(parcel, 5, this.J);
        h2.c.X(parcel, 6, this.K, false);
        h2.c.m(parcel, 7, this.L, false);
        h2.c.F(parcel, 8, this.M);
        h2.c.F(parcel, 9, this.N);
        h2.c.b(parcel, a);
    }
}
