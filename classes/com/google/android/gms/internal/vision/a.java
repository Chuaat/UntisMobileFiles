// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Binder;

public class a extends Binder implements IInterface
{
    private static z0 e;
    
    protected a(final String s) {
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
