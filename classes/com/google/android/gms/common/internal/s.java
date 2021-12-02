// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import f2.a;
import android.os.RemoteException;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;
import android.os.IInterface;

public interface s extends IInterface
{
    @f2.a
    void y0(@RecentlyNonNull final r p0, @k0 final k p1) throws RemoteException;
    
    public abstract static class a extends Binder implements s
    {
        public a() {
            this.attachInterface((IInterface)this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }
        
        @RecentlyNonNull
        @a
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        @RecentlyNonNull
        public boolean onTransact(@RecentlyNonNull final int n, @RecentlyNonNull final Parcel parcel, @k0 final Parcel parcel2, @RecentlyNonNull final int n2) throws RemoteException {
            if (n > 16777215) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            final IBinder strongBinder = parcel.readStrongBinder();
            k k = null;
            r r;
            if (strongBinder == null) {
                r = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof r) {
                    r = (r)queryLocalInterface;
                }
                else {
                    r = new s1(strongBinder);
                }
            }
            if (n == 46) {
                if (parcel.readInt() != 0) {
                    k = (k)com.google.android.gms.common.internal.k.CREATOR.createFromParcel(parcel);
                }
                this.y0(r, k);
                x.k(parcel2).writeNoException();
                return true;
            }
            if (n == 47) {
                if (parcel.readInt() != 0) {
                    final a2 a2 = (a2)com.google.android.gms.common.internal.a2.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (n != 4) {
                parcel.readString();
            }
            Label_0450: {
                if (n != 1) {
                    Label_0418: {
                        if (n != 2 && n != 23 && n != 25 && n != 27) {
                            if (n != 30) {
                                if (n == 34) {
                                    parcel.readString();
                                    throw new UnsupportedOperationException();
                                }
                                if (n == 41 || n == 43 || n == 37 || n == 38) {
                                    break Label_0418;
                                }
                                switch (n) {
                                    default: {
                                        throw new UnsupportedOperationException();
                                    }
                                    case 19: {
                                        parcel.readStrongBinder();
                                        if (parcel.readInt() != 0) {
                                            break Label_0450;
                                        }
                                        throw new UnsupportedOperationException();
                                    }
                                    case 10: {
                                        parcel.readString();
                                        parcel.createStringArray();
                                        throw new UnsupportedOperationException();
                                    }
                                    case 9: {
                                        parcel.readString();
                                        parcel.createStringArray();
                                        parcel.readString();
                                        parcel.readStrongBinder();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            break Label_0450;
                                        }
                                        throw new UnsupportedOperationException();
                                    }
                                    case 20: {
                                        break;
                                    }
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18: {
                                        break Label_0418;
                                    }
                                }
                            }
                            parcel.createStringArray();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                                break Label_0450;
                            }
                            throw new UnsupportedOperationException();
                        }
                    }
                    if (parcel.readInt() == 0) {
                        throw new UnsupportedOperationException();
                    }
                }
                else {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() == 0) {
                        throw new UnsupportedOperationException();
                    }
                }
            }
            final Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            throw new UnsupportedOperationException();
        }
        
        private static final class a implements s
        {
            private final IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            public final IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public final void y0(final r r, @k0 final k k) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    IBinder binder;
                    if (r != null) {
                        binder = ((IInterface)r).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (k != null) {
                        obtain.writeInt(1);
                        k.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.e.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
