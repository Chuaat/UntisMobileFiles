// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.graphics.PointF;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ContourParcelCreator")
@f({ 1 })
public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    @h2.d.c(id = 2)
    public final PointF[] G;
    @h2.d.c(id = 3)
    public final int H;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.face.internal.client.e();
    }
    
    @b
    public c(@e(id = 2) final PointF[] g, @e(id = 3) final int h) {
        this.G = g;
        this.H = h;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.b0(parcel, 2, this.G, n, false);
        h2.c.F(parcel, 3, this.H);
        h2.c.b(parcel, a);
    }
}
