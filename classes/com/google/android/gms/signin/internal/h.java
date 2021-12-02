// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import h2.c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import androidx.annotation.k0;
import java.util.List;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.api.t;
import h2.a;

@h2.d.a(creator = "RecordConsentByConsentResultResponseCreator")
public final class h extends a implements t
{
    public static final Parcelable$Creator<h> CREATOR;
    @c(getter = "getGrantedScopes", id = 1)
    private final List<String> G;
    @k0
    @c(getter = "getToken", id = 2)
    private final String H;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    @b
    public h(@e(id = 1) final List<String> g, @k0 @e(id = 2) final String h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final Status h() {
        if (this.H != null) {
            return Status.L;
        }
        return Status.P;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.Z(parcel, 1, this.G, false);
        h2.c.X(parcel, 2, this.H, false);
        h2.c.b(parcel, a);
    }
}
