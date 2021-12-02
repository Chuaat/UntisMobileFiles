// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.IInterface;
import android.os.IBinder;

public final class d extends b0 implements e
{
    d(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }
    
    @Override
    public final i[] i2(final com.google.android.gms.dynamic.d d, final oa oa, final k k) throws RemoteException {
        final Parcel h = this.H();
        f1.b(h, (IInterface)d);
        f1.c(h, (Parcelable)oa);
        f1.c(h, (Parcelable)k);
        final Parcel x2 = this.x2(3, h);
        final i[] array = (i[])x2.createTypedArray((Parcelable$Creator)i.CREATOR);
        x2.recycle();
        return array;
    }
    
    @Override
    public final void zzb() throws RemoteException {
        this.y2(2, this.H());
    }
}
