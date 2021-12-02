// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "BoundingBoxParcelCreator")
@f({ 1 })
public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    @h2.d.c(id = 2)
    public final int G;
    @h2.d.c(id = 3)
    public final int H;
    @h2.d.c(id = 4)
    public final int I;
    @h2.d.c(id = 5)
    public final int J;
    @h2.d.c(id = 6)
    public final float K;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.internal.vision.b();
    }
    
    @b
    public c(@e(id = 2) final int g, @e(id = 3) final int h, @e(id = 4) final int i, @e(id = 5) final int j, @e(id = 6) final float k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 2, this.G);
        h2.c.F(parcel, 3, this.H);
        h2.c.F(parcel, 4, this.I);
        h2.c.F(parcel, 5, this.J);
        h2.c.w(parcel, 6, this.K);
        h2.c.b(parcel, a);
    }
}
