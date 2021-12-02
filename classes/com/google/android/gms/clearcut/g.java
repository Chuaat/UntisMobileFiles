// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.clearcut;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import java.util.Arrays;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.clearcut.i6;
import com.google.android.gms.phenotype.b;
import com.google.android.gms.internal.clearcut.t6;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "LogEventParcelableCreator")
@f({ 1 })
public final class g extends a
{
    public static final Parcelable$Creator<g> CREATOR;
    @c(id = 2)
    public t6 G;
    @c(id = 3)
    public byte[] H;
    @c(id = 4)
    private int[] I;
    @c(id = 5)
    private String[] J;
    @c(id = 6)
    private int[] K;
    @c(id = 7)
    private byte[][] L;
    @c(id = 9)
    private com.google.android.gms.phenotype.b[] M;
    @c(defaultValue = "true", id = 8)
    private boolean N;
    public final i6 O;
    public final com.google.android.gms.clearcut.a.c P;
    public final com.google.android.gms.clearcut.a.c Q;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public g(final t6 g, final i6 o, final com.google.android.gms.clearcut.a.c p10, final com.google.android.gms.clearcut.a.c c, final int[] i, final String[] array, final int[] k, final byte[][] array2, final com.google.android.gms.phenotype.b[] array3, final boolean n) {
        this.G = g;
        this.O = o;
        this.P = p10;
        this.Q = null;
        this.I = i;
        this.J = null;
        this.K = k;
        this.L = null;
        this.M = null;
        this.N = n;
    }
    
    @b
    g(@e(id = 2) final t6 g, @e(id = 3) final byte[] h, @e(id = 4) final int[] i, @e(id = 5) final String[] j, @e(id = 6) final int[] k, @e(id = 7) final byte[][] l, @e(id = 8) final boolean n, @e(id = 9) final com.google.android.gms.phenotype.b[] m) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof g) {
            final g g = (g)o;
            if (v.b(this.G, g.G) && Arrays.equals(this.H, g.H) && Arrays.equals(this.I, g.I) && Arrays.equals(this.J, g.J) && v.b(this.O, g.O) && v.b(this.P, g.P) && v.b(this.Q, g.Q) && Arrays.equals(this.K, g.K) && Arrays.deepEquals(this.L, g.L) && Arrays.equals(this.M, g.M) && this.N == g.N) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return v.c(this.G, this.H, this.I, this.J, this.O, this.P, this.Q, this.K, this.L, this.M, this.N);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.G);
        sb.append(", LogEventBytes: ");
        final byte[] h = this.H;
        String str;
        if (h == null) {
            str = null;
        }
        else {
            str = new String(h);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.I));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.J));
        sb.append(", LogEvent: ");
        sb.append(this.O);
        sb.append(", ExtensionProducer: ");
        sb.append(this.P);
        sb.append(", VeProducer: ");
        sb.append(this.Q);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.K));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.L));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.M));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.N);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.S(parcel, 2, (Parcelable)this.G, n, false);
        h2.c.m(parcel, 3, this.H, false);
        h2.c.G(parcel, 4, this.I, false);
        h2.c.Y(parcel, 5, this.J, false);
        h2.c.G(parcel, 6, this.K, false);
        h2.c.n(parcel, 7, this.L, false);
        h2.c.g(parcel, 8, this.N);
        h2.c.b0(parcel, 9, this.M, n, false);
        h2.c.b(parcel, a);
    }
}
