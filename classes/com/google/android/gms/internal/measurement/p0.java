// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Binder;

public class p0 extends Binder implements IInterface
{
    protected p0(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    protected boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        throw null;
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.H(n, parcel, parcel2, n2);
    }
}
