// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import com.google.android.gms.common.e;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ConnectionInfoCreator")
public final class f1 extends a
{
    public static final Parcelable$Creator<f1> CREATOR;
    @c(id = 1)
    Bundle G;
    @c(id = 2)
    com.google.android.gms.common.e[] H;
    @c(defaultValue = "0", id = 3)
    private int I;
    
    static {
        CREATOR = (Parcelable$Creator)new e1();
    }
    
    public f1() {
    }
    
    @b
    f1(@e(id = 1) final Bundle g, @e(id = 2) final com.google.android.gms.common.e[] h, @e(id = 3) final int i, @k0 @e(id = 4) final h h2) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.k(parcel, 1, this.G, false);
        h2.c.b0(parcel, 2, this.H, n, false);
        h2.c.F(parcel, 3, this.I);
        h2.c.S(parcel, 4, null, n, false);
        h2.c.b(parcel, a);
    }
}
