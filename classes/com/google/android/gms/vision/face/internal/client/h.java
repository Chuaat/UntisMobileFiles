// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "FaceSettingsParcelCreator")
@f({ 1 })
public final class h extends a
{
    public static final Parcelable$Creator<h> CREATOR;
    @c(id = 2)
    public int G;
    @c(id = 3)
    public int H;
    @c(id = 4)
    public int I;
    @c(id = 5)
    public boolean J;
    @c(id = 6)
    public boolean K;
    @c(defaultValue = "-1", id = 7)
    public float L;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.face.internal.client.g();
    }
    
    public h() {
    }
    
    @b
    public h(@e(id = 2) final int g, @e(id = 3) final int h, @e(id = 4) final int i, @e(id = 5) final boolean j, @e(id = 6) final boolean k, @e(id = 7) final float l) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 2, this.G);
        h2.c.F(parcel, 3, this.H);
        h2.c.F(parcel, 4, this.I);
        h2.c.g(parcel, 5, this.J);
        h2.c.g(parcel, 6, this.K);
        h2.c.w(parcel, 7, this.L);
        h2.c.b(parcel, a);
    }
}
