// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.internal.vision.f1;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;
import com.google.android.gms.internal.vision.b0;

public final class m extends b0 implements k
{
    m(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }
    
    @Override
    public final j H1(final d d, final h h) throws RemoteException {
        final Parcel h2 = this.H();
        f1.b(h2, (IInterface)d);
        f1.c(h2, (Parcelable)h);
        final Parcel x2 = this.x2(1, h2);
        final IBinder strongBinder = x2.readStrongBinder();
        j j;
        if (strongBinder == null) {
            j = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            if (queryLocalInterface instanceof j) {
                j = (j)queryLocalInterface;
            }
            else {
                j = new l(strongBinder);
            }
        }
        x2.recycle();
        return j;
    }
}
