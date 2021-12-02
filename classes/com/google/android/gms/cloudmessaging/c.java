// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import androidx.annotation.k0;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.j0;
import android.os.Message;
import android.os.IInterface;

interface c extends IInterface
{
    public static final String a = "com.google.android.gms.iid.IMessengerCompat";
    public static final int b = 1;
    
    void q0(@j0 final Message p0) throws RemoteException;
    
    public static class a extends Binder implements c
    {
        @j0
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, @j0 final Parcel parcel, @k0 final Parcel parcel2, final int n2) throws RemoteException {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            if (n == 1) {
                Message message;
                if (parcel.readInt() != 0) {
                    message = (Message)Message.CREATOR.createFromParcel(parcel);
                }
                else {
                    message = null;
                }
                this.q0(message);
                return true;
            }
            return false;
        }
        
        public void q0(@j0 final Message message) throws RemoteException {
            message.arg2 = Binder.getCallingUid();
            throw null;
        }
    }
    
    public static class b implements c
    {
        private final IBinder e;
        
        b(@j0 final IBinder e) {
            this.e = e;
        }
        
        @j0
        public IBinder asBinder() {
            return this.e;
        }
        
        @Override
        public void q0(@j0 final Message message) throws RemoteException {
            final Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.e.transact(1, obtain, (Parcel)null, 1);
            }
            finally {
                obtain.recycle();
            }
        }
    }
}
