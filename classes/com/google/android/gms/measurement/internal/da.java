// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.lang.constant.Constable;
import h2.b;
import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class da implements Parcelable$Creator<ca>
{
    static void a(final ca ca, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.F(parcel, 1, ca.G);
        c.X(parcel, 2, ca.H, false);
        c.K(parcel, 3, ca.I);
        c.N(parcel, 4, ca.J, false);
        c.z(parcel, 5, null, false);
        c.X(parcel, 6, ca.K, false);
        c.X(parcel, 7, ca.L, false);
        c.u(parcel, 8, ca.M, false);
        c.b(parcel, a);
    }
}
