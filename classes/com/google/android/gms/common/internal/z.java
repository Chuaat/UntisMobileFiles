// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import h2.c;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@f2.a
@h2.d.a(creator = "RootTelemetryConfigurationCreator")
public class z extends a
{
    @RecentlyNonNull
    @f2.a
    public static final Parcelable$Creator<z> CREATOR;
    @c(getter = "getVersion", id = 1)
    private final int G;
    @c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean H;
    @c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean I;
    @c(getter = "getBatchPeriodMillis", id = 4)
    private final int J;
    @c(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int K;
    
    static {
        CREATOR = (Parcelable$Creator)new y1();
    }
    
    @b
    public z(@RecentlyNonNull @e(id = 1) final int g, @RecentlyNonNull @e(id = 2) final boolean h, @RecentlyNonNull @e(id = 3) final boolean i, @RecentlyNonNull @e(id = 4) final int j, @RecentlyNonNull @e(id = 5) final int k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.g(parcel, 2, this.H);
        h2.c.g(parcel, 3, this.I);
        h2.c.F(parcel, 4, this.J);
        h2.c.F(parcel, 5, this.K);
        h2.c.b(parcel, a);
    }
}
