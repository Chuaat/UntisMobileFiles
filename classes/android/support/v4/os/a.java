// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.os;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;

public interface a extends IInterface
{
    void u2(final int p0, final Bundle p1) throws RemoteException;
    
    public static class a implements android.support.v4.os.a
    {
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void u2(final int n, final Bundle bundle) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements android.support.v4.os.a
    {
        private static final String e = "android.support.v4.os.IResultReceiver";
        static final int f = 1;
        
        public b() {
            this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
        }
        
        public static android.support.v4.os.a H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && queryLocalInterface instanceof android.support.v4.os.a) {
                return (android.support.v4.os.a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static android.support.v4.os.a x2() {
            return a.f;
        }
        
        public static boolean y2(final android.support.v4.os.a f) {
            if (a.f != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (f != null) {
                a.f = f;
                return true;
            }
            return false;
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
            if (int1 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int1 = parcel.readInt();
                Bundle bundle;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle = null;
                }
                this.u2(int1, bundle);
                return true;
            }
            if (int1 != 1598968902) {
                return super.onTransact(int1, parcel, parcel2, n);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        
        private static class a implements android.support.v4.os.a
        {
            public static android.support.v4.os.a f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            public String H() {
                return "android.support.v4.os.IResultReceiver";
            }
            
            public IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public void u2(final int n, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(1, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().u2(n, bundle);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}
