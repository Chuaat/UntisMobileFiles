// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import android.graphics.Rect;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.b0;
import h2.a;

@b0
@h2.d.a(creator = "RecognitionOptionsCreator")
@f({ 1 })
public final class k extends a
{
    public static final Parcelable$Creator<k> CREATOR;
    @c(id = 2)
    public final Rect G;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    public k() {
        this.G = new Rect();
    }
    
    @b
    public k(@e(id = 2) final Rect g) {
        this.G = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.S(parcel, 2, (Parcelable)this.G, n, false);
        h2.c.b(parcel, a);
    }
}
