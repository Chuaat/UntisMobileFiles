// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.common;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public class b implements IInterface
{
    private final IBinder e;
    private final String f;
    
    protected b(final IBinder e, final String f) {
        this.e = e;
        this.f = f;
    }
    
    protected final Parcel H() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f);
        return obtain;
    }
    
    public IBinder asBinder() {
        return this.e;
    }
    
    protected final Parcel x2(final int n, final Parcel parcel) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.e.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (RuntimeException ex) {
            final Parcel parcel2;
            parcel2.recycle();
            throw ex;
        }
        parcel.recycle();
    }
    
    protected final void y2(final int n, final Parcel parcel) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        try {
            this.e.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
    
    protected final void z2(final int n, final Parcel parcel) throws RemoteException {
        try {
            this.e.transact(2, parcel, (Parcel)null, 1);
        }
        finally {
            parcel.recycle();
        }
    }
}
