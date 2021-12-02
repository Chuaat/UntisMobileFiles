// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import h2.b;
import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class v implements Parcelable$Creator<u>
{
    static void a(final u u, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.X(parcel, 2, u.G, false);
        c.S(parcel, 3, (Parcelable)u.H, n, false);
        c.X(parcel, 4, u.I, false);
        c.K(parcel, 5, u.J);
        c.b(parcel, a);
    }
}
