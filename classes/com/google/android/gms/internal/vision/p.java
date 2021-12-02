// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "WordBoxParcelCreator")
@f({ 1 })
public final class p extends a
{
    public static final Parcelable$Creator<p> CREATOR;
    @c(id = 2)
    private final m[] G;
    @c(id = 3)
    public final com.google.android.gms.internal.vision.c H;
    @c(id = 4)
    private final com.google.android.gms.internal.vision.c I;
    @c(id = 5)
    public final String J;
    @c(id = 6)
    private final float K;
    @c(id = 7)
    public final String L;
    @c(id = 8)
    private final boolean M;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    @b
    public p(@e(id = 2) final m[] g, @e(id = 3) final com.google.android.gms.internal.vision.c h, @e(id = 4) final com.google.android.gms.internal.vision.c i, @e(id = 5) final String j, @e(id = 6) final float k, @e(id = 7) final String l, @e(id = 8) final boolean m) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.b0(parcel, 2, this.G, n, false);
        h2.c.S(parcel, 3, (Parcelable)this.H, n, false);
        h2.c.S(parcel, 4, (Parcelable)this.I, n, false);
        h2.c.X(parcel, 5, this.J, false);
        h2.c.w(parcel, 6, this.K);
        h2.c.X(parcel, 7, this.L, false);
        h2.c.g(parcel, 8, this.M);
        h2.c.b(parcel, a);
    }
}
