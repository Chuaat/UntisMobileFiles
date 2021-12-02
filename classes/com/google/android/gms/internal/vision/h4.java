// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ImageMetadataParcelCreator")
public final class h4 extends a
{
    public static final Parcelable$Creator<h4> CREATOR;
    @c(getter = "getImageFormat", id = 1)
    private final int G;
    @c(getter = "getWidth", id = 2)
    private final int H;
    @c(getter = "getHeight", id = 3)
    private final int I;
    @c(getter = "getRotation", id = 4)
    private final int J;
    @c(getter = "getTimestampMs", id = 5)
    private final long K;
    
    static {
        CREATOR = (Parcelable$Creator)new g4();
    }
    
    @b
    public h4(@e(id = 1) final int g, @e(id = 2) final int h, @e(id = 3) final int i, @e(id = 4) final int j, @e(id = 5) final long k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public final int M() {
        return this.H;
    }
    
    public final int a() {
        return this.I;
    }
    
    public final int g1() {
        return this.J;
    }
    
    public final long q1() {
        return this.K;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.H);
        h2.c.F(parcel, 3, this.I);
        h2.c.F(parcel, 4, this.J);
        h2.c.K(parcel, 5, this.K);
        h2.c.b(parcel, a);
    }
    
    public final int zza() {
        return this.G;
    }
}
