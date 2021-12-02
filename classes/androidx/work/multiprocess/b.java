// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.multiprocess;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.IInterface;

public interface b extends IInterface
{
    void Y1(final byte[] p0) throws RemoteException;
    
    void d1(final String p0) throws RemoteException;
    
    public static class a implements b
    {
        @Override
        public void Y1(final byte[] array) throws RemoteException {
        }
        
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void d1(final String s) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements androidx.work.multiprocess.b
    {
        private static final String e = "androidx.work.multiprocess.IWorkManagerImplCallback";
        static final int f = 1;
        static final int g = 2;
        
        public b() {
            this.attachInterface((IInterface)this, "androidx.work.multiprocess.IWorkManagerImplCallback");
        }
        
        public static androidx.work.multiprocess.b H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof androidx.work.multiprocess.b) {
                return (androidx.work.multiprocess.b)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static androidx.work.multiprocess.b x2() {
            return a.f;
        }
        
        public static boolean y2(final androidx.work.multiprocess.b f) {
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
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
            if (n == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                this.Y1(parcel.createByteArray());
                return true;
            }
            if (n == 2) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                this.d1(parcel.readString());
                return true;
            }
            if (n != 1598968902) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            parcel2.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
            return true;
        }
        
        private static class a implements b
        {
            public static b f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            public String H() {
                return "androidx.work.multiprocess.IWorkManagerImplCallback";
            }
            
            @Override
            public void Y1(final byte[] array) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    obtain.writeByteArray(array);
                    if (!this.e.transact(1, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().Y1(array);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public void d1(final String s) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    obtain.writeString(s);
                    if (!this.e.transact(2, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().d1(s);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}
