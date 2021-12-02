// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Binder;

public class b0 extends Binder implements IInterface
{
    private static d2 e;
    
    protected b0(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    protected boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        return false;
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        boolean onTransact;
        if (n > 16777215) {
            onTransact = super.onTransact(n, parcel, parcel2, n2);
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            onTransact = false;
        }
        return onTransact || this.H(n, parcel, parcel2, n2);
    }
}
