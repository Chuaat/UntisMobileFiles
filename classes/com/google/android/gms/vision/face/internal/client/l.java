// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.internal.vision.f1;
import com.google.android.gms.internal.vision.oa;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;
import com.google.android.gms.internal.vision.b0;

public final class l extends b0 implements j
{
    l(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }
    
    @Override
    public final a[] A1(final d d, final d d2, final d d3, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final oa oa) throws RemoteException {
        final Parcel h = this.H();
        f1.b(h, (IInterface)d);
        f1.b(h, (IInterface)d2);
        f1.b(h, (IInterface)d3);
        h.writeInt(n);
        h.writeInt(n2);
        h.writeInt(n3);
        h.writeInt(n4);
        h.writeInt(n5);
        h.writeInt(n6);
        f1.c(h, (Parcelable)oa);
        final Parcel x2 = this.x2(4, h);
        final a[] array = (a[])x2.createTypedArray((Parcelable$Creator)a.CREATOR);
        x2.recycle();
        return array;
    }
    
    @Override
    public final boolean d(final int n) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(n);
        final Parcel x2 = this.x2(2, h);
        final boolean e = f1.e(x2);
        x2.recycle();
        return e;
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
