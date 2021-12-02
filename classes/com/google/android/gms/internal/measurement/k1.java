// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

public abstract class k1 extends p0 implements l1
{
    public k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    @Override
    protected final boolean H(int c, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
        if (c != 1) {
            if (c != 2) {
                return false;
            }
            c = this.c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        else {
            this.V(parcel.readString(), parcel.readString(), q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        }
        return true;
    }
}
