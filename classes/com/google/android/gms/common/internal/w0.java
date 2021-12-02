// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.c;
import androidx.annotation.k0;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ResolveAccountResponseCreator")
public final class w0 extends a
{
    public static final Parcelable$Creator<w0> CREATOR;
    @g(id = 1)
    private final int G;
    @k0
    @c(id = 2)
    private IBinder H;
    @c(getter = "getConnectionResult", id = 3)
    private com.google.android.gms.common.c I;
    @c(getter = "getSaveDefaultAccount", id = 4)
    private boolean J;
    @c(getter = "isFromCrossClientAuth", id = 5)
    private boolean K;
    
    static {
        CREATOR = (Parcelable$Creator)new z0();
    }
    
    @b
    w0(@e(id = 1) final int g, @k0 @e(id = 2) final IBinder h, @e(id = 3) final com.google.android.gms.common.c i, @e(id = 4) final boolean j, @e(id = 5) final boolean k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @k0
    public final p M() {
        final IBinder h = this.H;
        if (h == null) {
            return null;
        }
        return p.a.x2(h);
    }
    
    public final boolean Q1() {
        return this.K;
    }
    
    @Override
    public final boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof w0)) {
            return false;
        }
        final w0 w0 = (w0)o;
        return this.I.equals(w0.I) && v.b(this.M(), w0.M());
    }
    
    public final com.google.android.gms.common.c g1() {
        return this.I;
    }
    
    public final boolean q1() {
        return this.J;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.B(parcel, 2, this.H, false);
        h2.c.S(parcel, 3, (Parcelable)this.I, n, false);
        h2.c.g(parcel, 4, this.J);
        h2.c.g(parcel, 5, this.K);
        h2.c.b(parcel, a);
    }
}
