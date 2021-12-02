// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;

public final class la extends b0 implements ja
{
    la(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }
    
    @Override
    public final p8 O0(final d d, final o7 o7) throws RemoteException {
        final Parcel h = this.H();
        f1.b(h, (IInterface)d);
        f1.c(h, (Parcelable)o7);
        final Parcel x2 = this.x2(1, h);
        final IBinder strongBinder = x2.readStrongBinder();
        p8 p2;
        if (strongBinder == null) {
            p2 = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof p8) {
                p2 = (p8)queryLocalInterface;
            }
            else {
                p2 = new ka(strongBinder);
            }
        }
        x2.recycle();
        return p2;
    }
}
