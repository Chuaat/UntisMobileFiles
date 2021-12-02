// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.vision.barcode.a;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;

public final class ka extends b0 implements p8
{
    ka(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }
    
    @Override
    public final a[] H0(final d d, final oa oa) throws RemoteException {
        final Parcel h = this.H();
        f1.b(h, (IInterface)d);
        f1.c(h, (Parcelable)oa);
        final Parcel x2 = this.x2(2, h);
        final a[] array = (a[])x2.createTypedArray((Parcelable$Creator)a.CREATOR);
        x2.recycle();
        return array;
    }
    
    @Override
    public final a[] y(final d d, final oa oa) throws RemoteException {
        final Parcel h = this.H();
        f1.b(h, (IInterface)d);
        f1.c(h, (Parcelable)oa);
        final Parcel x2 = this.x2(1, h);
        final a[] array = (a[])x2.createTypedArray((Parcelable$Creator)a.CREATOR);
        x2.recycle();
        return array;
    }
    
    @Override
    public final void zza() throws RemoteException {
        this.y2(3, this.H());
    }
}
