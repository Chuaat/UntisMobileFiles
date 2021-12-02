// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.b0;
import h2.a;

@b0
@h2.d.a(creator = "TextRecognizerOptionsCreator")
@f({ 1 })
public final class n extends a
{
    public static final Parcelable$Creator<n> CREATOR;
    @k0
    @c(getter = "getCustomModelsDir", id = 2)
    private final String G;
    
    static {
        CREATOR = (Parcelable$Creator)new q();
    }
    
    public n() {
        this(null);
    }
    
    @b
    public n(@k0 @e(id = 2) final String g) {
        this.G = g;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 2, this.G, false);
        h2.c.b(parcel, a);
    }
}
