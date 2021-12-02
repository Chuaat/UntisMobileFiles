// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "BarcodeDetectorOptionsCreator")
@f({ 1 })
public final class o7 extends a
{
    public static final Parcelable$Creator<o7> CREATOR;
    @c(id = 2)
    public int G;
    @c(id = 3)
    private boolean H;
    
    static {
        CREATOR = (Parcelable$Creator)new n6();
    }
    
    public o7() {
    }
    
    @b
    public o7(@e(id = 2) final int g, @e(id = 3) final boolean h) {
        this.G = g;
        this.H = h;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 2, this.G);
        h2.c.g(parcel, 3, this.H);
        h2.c.b(parcel, a);
    }
}
