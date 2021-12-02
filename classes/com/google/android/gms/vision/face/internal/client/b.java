// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import h2.c;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.apps.common.proguard.UsedByNative;
import h2.a;

@UsedByNative("wrapper.cc")
@h2.d.a(creator = "LandmarkParcelCreator")
public final class b extends a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<b> CREATOR;
    @g(id = 1)
    private final int G;
    @c(id = 2)
    public final float H;
    @c(id = 3)
    public final float I;
    @c(id = 4)
    public final int J;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    @UsedByNative("wrapper.cc")
    @h2.d.b
    public b(@e(id = 1) final int g, @e(id = 2) final float h, @e(id = 3) final float i, @e(id = 4) final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.w(parcel, 2, this.H);
        h2.c.w(parcel, 3, this.I);
        h2.c.F(parcel, 4, this.J);
        h2.c.b(parcel, a);
    }
}
