// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.IInterface;

public interface a1 extends IInterface
{
    void t0(final String[] p0) throws RemoteException;
    
    public static class a implements a1
    {
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void t0(final String[] array) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements a1
    {
        private static final String e = "androidx.room.IMultiInstanceInvalidationCallback";
        static final int f = 1;
        
        public b() {
            this.attachInterface((IInterface)this, "androidx.room.IMultiInstanceInvalidationCallback");
        }
        
        public static a1 H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof a1) {
                return (a1)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static a1 x2() {
            return a.f;
        }
        
        public static boolean y2(final a1 f) {
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
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                this.t0(parcel.createStringArray());
                return true;
            }
            if (n != 1598968902) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
        
        private static class a implements a1
        {
            public static a1 f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            public String H() {
                return "androidx.room.IMultiInstanceInvalidationCallback";
            }
            
            public IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public void t0(final String[] array) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(array);
                    if (!this.e.transact(1, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().t0(array);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}
