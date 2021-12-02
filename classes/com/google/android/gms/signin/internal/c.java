// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import androidx.annotation.k0;
import android.content.Intent;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.api.t;
import h2.a;

@h2.d.a(creator = "AuthAccountResultCreator")
public final class c extends a implements t
{
    public static final Parcelable$Creator<c> CREATOR;
    @g(id = 1)
    private final int G;
    @h2.d.c(getter = "getConnectionResultCode", id = 2)
    private int H;
    @k0
    @h2.d.c(getter = "getRawAuthResolutionIntent", id = 3)
    private Intent I;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.signin.internal.b();
    }
    
    public c() {
        this(0, null);
    }
    
    @b
    c(@e(id = 1) final int g, @e(id = 2) final int h, @k0 @e(id = 3) final Intent i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private c(final int n, @k0 final Intent intent) {
        this(2, 0, null);
    }
    
    @Override
    public final Status h() {
        if (this.H == 0) {
            return Status.L;
        }
        return Status.P;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.H);
        h2.c.S(parcel, 3, (Parcelable)this.I, n, false);
        h2.c.b(parcel, a);
    }
}
