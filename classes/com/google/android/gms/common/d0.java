// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import h2.c;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.r1;
import android.os.IBinder;
import c6.h;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "GoogleCertificatesQueryCreator")
public final class d0 extends a
{
    public static final Parcelable$Creator<d0> CREATOR;
    @c(getter = "getCallingPackage", id = 1)
    private final String G;
    @h
    @c(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    private final x H;
    @c(getter = "getAllowTestKeys", id = 3)
    private final boolean I;
    @c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean J;
    
    static {
        CREATOR = (Parcelable$Creator)new g0();
    }
    
    @b
    d0(@e(id = 1) final String g, @h @e(id = 2) final IBinder binder, @e(id = 3) final boolean i, @e(id = 4) final boolean j) {
        this.G = g;
        this.H = M(binder);
        this.I = i;
        this.J = j;
    }
    
    d0(final String g, @h final x h, final boolean i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @h
    private static x M(@h final IBinder binder) {
        final x x = null;
        if (binder == null) {
            return null;
        }
        try {
            final com.google.android.gms.dynamic.d zzb = r1.x2(binder).zzb();
            byte[] array;
            if (zzb == null) {
                array = null;
            }
            else {
                array = com.google.android.gms.dynamic.f.y2(zzb);
            }
            x x2;
            if (array != null) {
                x2 = new a0(array);
            }
            else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                x2 = x;
            }
            return x2;
        }
        catch (RemoteException ex) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)ex);
            return null;
        }
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 1, this.G, false);
        final x h = this.H;
        IBinder binder;
        if (h == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            binder = null;
        }
        else {
            binder = h.asBinder();
        }
        h2.c.B(parcel, 2, binder, false);
        h2.c.g(parcel, 3, this.I);
        h2.c.g(parcel, 4, this.J);
        h2.c.b(parcel, a);
    }
}
