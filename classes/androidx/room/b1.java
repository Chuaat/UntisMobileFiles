// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.IInterface;

public interface b1 extends IInterface
{
    int I0(final a1 p0, final String p1) throws RemoteException;
    
    void l2(final int p0, final String[] p1) throws RemoteException;
    
    void p2(final a1 p0, final int p1) throws RemoteException;
    
    public static class a implements b1
    {
        @Override
        public int I0(final a1 a1, final String s) throws RemoteException {
            return 0;
        }
        
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void l2(final int n, final String[] array) throws RemoteException {
        }
        
        @Override
        public void p2(final a1 a1, final int n) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements b1
    {
        private static final String e = "androidx.room.IMultiInstanceInvalidationService";
        static final int f = 1;
        static final int g = 2;
        static final int h = 3;
        
        public b() {
            this.attachInterface((IInterface)this, "androidx.room.IMultiInstanceInvalidationService");
        }
        
        public static b1 H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && queryLocalInterface instanceof b1) {
                return (b1)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static b1 x2() {
            return a.f;
        }
        
        public static boolean y2(final b1 f) {
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
        
        public boolean onTransact(int i0, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
            if (i0 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                i0 = this.I0(a1.b.H(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i0);
                return true;
            }
            if (i0 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                this.p2(a1.b.H(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i0 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                this.l2(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i0 != 1598968902) {
                return super.onTransact(i0, parcel, parcel2, n);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        
        private static class a implements b1
        {
            public static b1 f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            public String H() {
                return "androidx.room.IMultiInstanceInvalidationService";
            }
            
            @Override
            public int I0(final a1 a1, final String s) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    IBinder binder;
                    if (a1 != null) {
                        binder = ((IInterface)a1).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    obtain.writeString(s);
                    if (!this.e.transact(1, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().I0(a1, s);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            public IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public void l2(final int n, final String[] array) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(n);
                    obtain.writeStringArray(array);
                    if (!this.e.transact(3, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().l2(n, array);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void p2(final a1 a1, final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    IBinder binder;
                    if (a1 != null) {
                        binder = ((IInterface)a1).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    obtain.writeInt(n);
                    if (!this.e.transact(2, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().p2(a1, n);
                        return;
                    }
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
