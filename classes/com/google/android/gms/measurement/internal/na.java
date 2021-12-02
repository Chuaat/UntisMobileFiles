// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import h2.c;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.x;
import java.util.List;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "AppMetadataCreator")
@f({ 1, 17, 20 })
public final class na extends a
{
    public static final Parcelable$Creator<na> CREATOR;
    @k0
    @c(id = 2)
    public final String G;
    @k0
    @c(id = 3)
    public final String H;
    @k0
    @c(id = 4)
    public final String I;
    @k0
    @c(id = 5)
    public final String J;
    @c(id = 6)
    public final long K;
    @c(id = 7)
    public final long L;
    @k0
    @c(id = 8)
    public final String M;
    @c(defaultValue = "true", id = 9)
    public final boolean N;
    @c(id = 10)
    public final boolean O;
    @c(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long P;
    @k0
    @c(id = 12)
    public final String Q;
    @c(id = 13)
    public final long R;
    @c(id = 14)
    public final long S;
    @c(id = 15)
    public final int T;
    @c(defaultValue = "true", id = 16)
    public final boolean U;
    @c(id = 18)
    public final boolean V;
    @k0
    @c(id = 19)
    public final String W;
    @k0
    @c(id = 21)
    public final Boolean X;
    @c(id = 22)
    public final long Y;
    @k0
    @c(id = 23)
    public final List<String> Z;
    @k0
    @c(id = 24)
    public final String a0;
    @c(defaultValue = "", id = 25)
    public final String b0;
    
    static {
        CREATOR = (Parcelable$Creator)new oa();
    }
    
    na(@k0 final String g, @k0 String h, @k0 final String i, final long p22, @k0 final String j, final long k, final long l, @k0 final String m, final boolean n, final boolean o, @k0 final String q, final long r, final long s, final int t, final boolean u, final boolean v, @k0 final String w, @k0 final Boolean x, final long y, @k0 final List<String> z, @k0 final String a0, final String b0) {
        x.g(g);
        this.G = g;
        if (TextUtils.isEmpty((CharSequence)h)) {
            h = null;
        }
        this.H = h;
        this.I = i;
        this.P = p22;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
        this.V = v;
        this.W = w;
        this.X = x;
        this.Y = y;
        this.Z = z;
        this.a0 = a0;
        this.b0 = b0;
    }
    
    @b
    na(@k0 @e(id = 2) final String g, @k0 @e(id = 3) final String h, @k0 @e(id = 4) final String i, @k0 @e(id = 5) final String j, @e(id = 6) final long k, @e(id = 7) final long l, @k0 @e(id = 8) final String m, @e(id = 9) final boolean n, @e(id = 10) final boolean o, @e(id = 11) final long p22, @k0 @e(id = 12) final String q, @e(id = 13) final long r, @e(id = 14) final long s, @e(id = 15) final int t, @e(id = 16) final boolean u, @e(id = 18) final boolean v, @k0 @e(id = 19) final String w, @k0 @e(id = 21) final Boolean x, @e(id = 22) final long y, @k0 @e(id = 23) final List<String> z, @k0 @e(id = 24) final String a0, @e(id = 25) final String b0) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.P = p22;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
        this.V = v;
        this.W = w;
        this.X = x;
        this.Y = y;
        this.Z = z;
        this.a0 = a0;
        this.b0 = b0;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 2, this.G, false);
        h2.c.X(parcel, 3, this.H, false);
        h2.c.X(parcel, 4, this.I, false);
        h2.c.X(parcel, 5, this.J, false);
        h2.c.K(parcel, 6, this.K);
        h2.c.K(parcel, 7, this.L);
        h2.c.X(parcel, 8, this.M, false);
        h2.c.g(parcel, 9, this.N);
        h2.c.g(parcel, 10, this.O);
        h2.c.K(parcel, 11, this.P);
        h2.c.X(parcel, 12, this.Q, false);
        h2.c.K(parcel, 13, this.R);
        h2.c.K(parcel, 14, this.S);
        h2.c.F(parcel, 15, this.T);
        h2.c.g(parcel, 16, this.U);
        h2.c.g(parcel, 18, this.V);
        h2.c.X(parcel, 19, this.W, false);
        h2.c.j(parcel, 21, this.X, false);
        h2.c.K(parcel, 22, this.Y);
        h2.c.Z(parcel, 23, this.Z, false);
        h2.c.X(parcel, 24, this.a0, false);
        h2.c.X(parcel, 25, this.b0, false);
        h2.c.b(parcel, a);
    }
}
