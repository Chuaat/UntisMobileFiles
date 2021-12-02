// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Parcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.common.d0;
import android.os.IBinder;
import com.google.android.gms.internal.common.b;

public final class v1 extends b implements u1
{
    v1(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }
    
    @Override
    public final boolean d2(final d0 d0, final d d2) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.c(h, (Parcelable)d0);
        com.google.android.gms.internal.common.d.b(h, (IInterface)d2);
        final Parcel x2 = this.x2(5, h);
        final boolean e = com.google.android.gms.internal.common.d.e(x2);
        x2.recycle();
        return e;
    }
}
