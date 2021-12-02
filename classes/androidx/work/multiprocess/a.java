// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.multiprocess;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.IInterface;

public interface a extends IInterface
{
    void E1(final String p0, final androidx.work.multiprocess.b p1) throws RemoteException;
    
    void e1(final byte[] p0, final androidx.work.multiprocess.b p1) throws RemoteException;
    
    void j0(final String p0, final androidx.work.multiprocess.b p1) throws RemoteException;
    
    void k2(final String p0, final androidx.work.multiprocess.b p1) throws RemoteException;
    
    void s0(final byte[] p0, final androidx.work.multiprocess.b p1) throws RemoteException;
    
    void v0(final androidx.work.multiprocess.b p0) throws RemoteException;
    
    void w2(final byte[] p0, final androidx.work.multiprocess.b p1) throws RemoteException;
    
    public static class a implements androidx.work.multiprocess.a
    {
        @Override
        public void E1(final String s, final androidx.work.multiprocess.b b) throws RemoteException {
        }
        
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void e1(final byte[] array, final androidx.work.multiprocess.b b) throws RemoteException {
        }
        
        @Override
        public void j0(final String s, final androidx.work.multiprocess.b b) throws RemoteException {
        }
        
        @Override
        public void k2(final String s, final androidx.work.multiprocess.b b) throws RemoteException {
        }
        
        @Override
        public void s0(final byte[] array, final androidx.work.multiprocess.b b) throws RemoteException {
        }
        
        @Override
        public void v0(final androidx.work.multiprocess.b b) throws RemoteException {
        }
        
        @Override
        public void w2(final byte[] array, final androidx.work.multiprocess.b b) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements androidx.work.multiprocess.a
    {
        private static final String e = "androidx.work.multiprocess.IWorkManagerImpl";
        static final int f = 1;
        static final int g = 2;
        static final int h = 3;
        static final int i = 4;
        static final int j = 5;
        static final int k = 6;
        static final int l = 7;
        
        public b() {
            this.attachInterface((IInterface)this, "androidx.work.multiprocess.IWorkManagerImpl");
        }
        
        public static androidx.work.multiprocess.a H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
            if (queryLocalInterface != null && queryLocalInterface instanceof androidx.work.multiprocess.a) {
                return (androidx.work.multiprocess.a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static androidx.work.multiprocess.a x2() {
            return a.f;
        }
        
        public static boolean y2(final androidx.work.multiprocess.a f) {
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
            if (n == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 7: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.e1(parcel.createByteArray(), androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
                case 6: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.v0(androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
                case 5: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.j0(parcel.readString(), androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
                case 4: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.k2(parcel.readString(), androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
                case 3: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.E1(parcel.readString(), androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
                case 2: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.w2(parcel.createByteArray(), androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
                case 1: {
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    this.s0(parcel.createByteArray(), androidx.work.multiprocess.b.b.H(parcel.readStrongBinder()));
                    return true;
                }
            }
        }
        
        private static class a implements androidx.work.multiprocess.a
        {
            public static androidx.work.multiprocess.a f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            @Override
            public void E1(final String s, final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeString(s);
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(3, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().E1(s, b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public String H() {
                return "androidx.work.multiprocess.IWorkManagerImpl";
            }
            
            public IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public void e1(final byte[] array, final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(array);
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(7, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().e1(array, b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void j0(final String s, final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeString(s);
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(5, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().j0(s, b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void k2(final String s, final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeString(s);
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(4, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().k2(s, b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void s0(final byte[] array, final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(array);
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(1, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().s0(array, b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void v0(final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(6, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().v0(b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void w2(final byte[] array, final androidx.work.multiprocess.b b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(array);
                    IBinder binder;
                    if (b != null) {
                        binder = ((IInterface)b).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(2, obtain, (Parcel)null, 1) && androidx.work.multiprocess.a.b.x2() != null) {
                        androidx.work.multiprocess.a.b.x2().w2(array, b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}
