// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable$Creator;
import com.google.android.gms.internal.common.d;
import android.os.Parcel;
import com.google.android.gms.internal.common.a;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;

public interface r extends IInterface
{
    void R1(final int p0, final IBinder p1, final f1 p2) throws RemoteException;
    
    void c1(@RecentlyNonNull final int p0, @RecentlyNonNull final Bundle p1) throws RemoteException;
    
    void j1(@RecentlyNonNull final int p0, @RecentlyNonNull final IBinder p1, @RecentlyNonNull final Bundle p2) throws RemoteException;
    
    public abstract static class a extends com.google.android.gms.internal.common.a implements r
    {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }
        
        @Override
        protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return false;
                    }
                    this.R1(parcel.readInt(), parcel.readStrongBinder(), d.a(parcel, f1.CREATOR));
                }
                else {
                    this.c1(parcel.readInt(), d.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR));
                }
            }
            else {
                this.j1(parcel.readInt(), parcel.readStrongBinder(), d.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
