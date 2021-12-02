// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.vision.f1;
import com.google.android.gms.dynamic.d;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.internal.vision.a;

public abstract class n extends a implements k
{
    public n() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }
    
    public static k x2(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface instanceof k) {
            return (k)queryLocalInterface;
        }
        return new m(binder);
    }
    
    @Override
    protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n == 1) {
            final j h1 = this.H1(d.a.x2(parcel.readStrongBinder()), f1.a(parcel, h.CREATOR));
            parcel2.writeNoException();
            f1.b(parcel2, (IInterface)h1);
            return true;
        }
        return false;
    }
}
