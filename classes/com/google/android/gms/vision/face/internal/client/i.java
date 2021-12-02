// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import android.os.RemoteException;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.f1;
import com.google.android.gms.internal.vision.oa;
import com.google.android.gms.dynamic.d;
import android.os.Parcel;
import com.google.android.gms.internal.vision.a;

public abstract class i extends a implements j
{
    public i() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }
    
    @Override
    protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        return false;
                    }
                    final com.google.android.gms.vision.face.internal.client.a[] a1 = this.A1(d.a.x2(parcel.readStrongBinder()), d.a.x2(parcel.readStrongBinder()), d.a.x2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), f1.a(parcel, oa.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray((Parcelable[])a1, 1);
                }
                else {
                    this.zza();
                    parcel2.writeNoException();
                }
            }
            else {
                final boolean d = this.d(parcel.readInt());
                parcel2.writeNoException();
                f1.d(parcel2, d);
            }
        }
        else {
            final com.google.android.gms.vision.face.internal.client.a[] y = this.y(d.a.x2(parcel.readStrongBinder()), f1.a(parcel, oa.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedArray((Parcelable[])y, 1);
        }
        return true;
    }
}
