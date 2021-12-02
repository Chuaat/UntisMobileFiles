// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

public abstract class h1 extends p0 implements i1
{
    public h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    @Override
    protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n == 1) {
            this.G(q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
