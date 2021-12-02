// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server;

import h2.c;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@f2.a
@h2.d.a(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends a implements ReflectedParcelable
{
    @RecentlyNonNull
    @f2.a
    public static final Parcelable$Creator<FavaDiagnosticsEntity> CREATOR;
    @g(id = 1)
    private final int G;
    @c(id = 2)
    private final String H;
    @c(id = 3)
    private final int I;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.common.server.a();
    }
    
    @b
    public FavaDiagnosticsEntity(@RecentlyNonNull @e(id = 1) final int g, @RecentlyNonNull @e(id = 2) final String h, @RecentlyNonNull @e(id = 3) final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @f2.a
    public FavaDiagnosticsEntity(@RecentlyNonNull final String h, @RecentlyNonNull final int i) {
        this.G = 1;
        this.H = h;
        this.I = i;
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.X(parcel, 2, this.H, false);
        h2.c.F(parcel, 3, this.I);
        h2.c.b(parcel, a);
    }
}
