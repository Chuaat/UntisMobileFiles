// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import com.google.android.gms.common.internal.v0;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "SignInRequestCreator")
public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getResolveAccountRequest", id = 2)
    private final v0 H;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    @b
    l(@e(id = 1) final int g, @e(id = 2) final v0 h) {
        this.G = g;
        this.H = h;
    }
    
    public l(final v0 v0) {
        this(1, v0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.S(parcel, 2, (Parcelable)this.H, n, false);
        h2.c.b(parcel, a);
    }
}
