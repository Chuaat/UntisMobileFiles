// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.b0;
import h2.a;

@b0
@h2.d.a(creator = "FieldMapPairCreator")
public final class r extends a
{
    public static final Parcelable$Creator<r> CREATOR;
    @g(id = 1)
    private final int G;
    @c(id = 2)
    final String H;
    @c(id = 3)
    final com.google.android.gms.common.server.response.a.a<?, ?> I;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    @b
    r(@e(id = 1) final int g, @e(id = 2) final String h, @e(id = 3) final com.google.android.gms.common.server.response.a.a<?, ?> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    r(final String h, final com.google.android.gms.common.server.response.a.a<?, ?> i) {
        this.G = 1;
        this.H = h;
        this.I = i;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.X(parcel, 2, this.H, false);
        h2.c.S(parcel, 3, (Parcelable)this.I, n, false);
        h2.c.b(parcel, a);
    }
}
