// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "LineBoxParcelCreator")
@f({ 1 })
public final class i extends a
{
    public static final Parcelable$Creator<i> CREATOR;
    @c(id = 2)
    public final p[] G;
    @c(id = 3)
    public final com.google.android.gms.internal.vision.c H;
    @c(id = 4)
    private final com.google.android.gms.internal.vision.c I;
    @c(id = 5)
    private final com.google.android.gms.internal.vision.c J;
    @c(id = 6)
    public final String K;
    @c(id = 7)
    private final float L;
    @c(id = 8)
    public final String M;
    @c(id = 9)
    private final int N;
    @c(id = 10)
    public final boolean O;
    @c(id = 11)
    public final int P;
    @c(id = 12)
    public final int Q;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    @b
    public i(@e(id = 2) final p[] g, @e(id = 3) final com.google.android.gms.internal.vision.c h, @e(id = 4) final com.google.android.gms.internal.vision.c i, @e(id = 5) final com.google.android.gms.internal.vision.c j, @e(id = 6) final String k, @e(id = 7) final float l, @e(id = 8) final String m, @e(id = 9) final int n, @e(id = 10) final boolean o, @e(id = 11) final int p11, @e(id = 12) final int q) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p11;
        this.Q = q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.b0(parcel, 2, this.G, n, false);
        h2.c.S(parcel, 3, (Parcelable)this.H, n, false);
        h2.c.S(parcel, 4, (Parcelable)this.I, n, false);
        h2.c.S(parcel, 5, (Parcelable)this.J, n, false);
        h2.c.X(parcel, 6, this.K, false);
        h2.c.w(parcel, 7, this.L);
        h2.c.X(parcel, 8, this.M, false);
        h2.c.F(parcel, 9, this.N);
        h2.c.g(parcel, 10, this.O);
        h2.c.F(parcel, 11, this.P);
        h2.c.F(parcel, 12, this.Q);
        h2.c.b(parcel, a);
    }
}
