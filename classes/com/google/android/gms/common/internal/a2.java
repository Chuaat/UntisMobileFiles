// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@Deprecated
@h2.d.a(creator = "ValidateAccountRequestCreator")
public final class a2 extends a
{
    public static final Parcelable$Creator<a2> CREATOR;
    @g(id = 1)
    private final int G;
    
    static {
        CREATOR = (Parcelable$Creator)new z1();
    }
    
    @b
    a2(@e(id = 1) final int g) {
        this.G = g;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.b(parcel, a);
    }
}
