// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@f2.a
@h2.d.a(creator = "ConnectionTelemetryConfigurationCreator")
public class h extends a
{
    @RecentlyNonNull
    @f2.a
    public static final Parcelable$Creator<h> CREATOR;
    @c(getter = "getRootTelemetryConfiguration", id = 1)
    private final z G;
    @c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean H;
    @c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean I;
    @k0
    @c(getter = "getMethodInvocationMethodKeyWhitelist", id = 4)
    private final int[] J;
    @c(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int K;
    
    static {
        CREATOR = (Parcelable$Creator)new g1();
    }
    
    @b
    h(@e(id = 1) final z g, @e(id = 2) final boolean h, @e(id = 3) final boolean i, @k0 @e(id = 4) final int[] j, @e(id = 5) final int k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.S(parcel, 1, (Parcelable)this.G, n, false);
        h2.c.g(parcel, 2, this.H);
        h2.c.g(parcel, 3, this.I);
        h2.c.G(parcel, 4, this.J, false);
        h2.c.F(parcel, 5, this.K);
        h2.c.b(parcel, a);
    }
}
