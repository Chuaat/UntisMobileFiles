// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import h2.c;
import android.os.Parcel;
import android.os.Bundle;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "InitializationParamsCreator")
public final class o1 extends a
{
    public static final Parcelable$Creator<o1> CREATOR;
    @c(id = 1)
    public final long G;
    @c(id = 2)
    public final long H;
    @c(id = 3)
    public final boolean I;
    @k0
    @c(id = 4)
    public final String J;
    @k0
    @c(id = 5)
    public final String K;
    @k0
    @c(id = 6)
    public final String L;
    @k0
    @c(id = 7)
    public final Bundle M;
    @k0
    @c(id = 8)
    public final String N;
    
    static {
        CREATOR = (Parcelable$Creator)new p1();
    }
    
    @b
    public o1(@e(id = 1) final long g, @e(id = 2) final long h, @e(id = 3) final boolean i, @k0 @e(id = 4) final String j, @k0 @e(id = 5) final String k, @k0 @e(id = 6) final String l, @k0 @e(id = 7) final Bundle m, @k0 @e(id = 8) final String n) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.K(parcel, 1, this.G);
        h2.c.K(parcel, 2, this.H);
        h2.c.g(parcel, 3, this.I);
        h2.c.X(parcel, 4, this.J, false);
        h2.c.X(parcel, 5, this.K, false);
        h2.c.X(parcel, 6, this.L, false);
        h2.c.k(parcel, 7, this.M, false);
        h2.c.X(parcel, 8, this.N, false);
        h2.c.b(parcel, a);
    }
}
