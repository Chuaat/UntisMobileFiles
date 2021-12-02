// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.app.Notification;
import android.os.RemoteException;
import android.os.IInterface;

public interface a extends IInterface
{
    void F0(final String p0) throws RemoteException;
    
    void m2(final String p0, final int p1, final String p2, final Notification p3) throws RemoteException;
    
    void y1(final String p0, final int p1, final String p2) throws RemoteException;
    
    public static class a implements android.support.v4.app.a
    {
        @Override
        public void F0(final String s) throws RemoteException {
        }
        
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void m2(final String s, final int n, final String s2, final Notification notification) throws RemoteException {
        }
        
        @Override
        public void y1(final String s, final int n, final String s2) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements android.support.v4.app.a
    {
        private static final String e = "android.support.v4.app.INotificationSideChannel";
        static final int f = 1;
        static final int g = 2;
        static final int h = 3;
        
        public b() {
            this.attachInterface((IInterface)this, "android.support.v4.app.INotificationSideChannel");
        }
        
        public static android.support.v4.app.a H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface != null && queryLocalInterface instanceof android.support.v4.app.a) {
                return (android.support.v4.app.a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static android.support.v4.app.a x2() {
            return a.f;
        }
        
        public static boolean y2(final android.support.v4.app.a f) {
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
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                final String string = parcel.readString();
                int1 = parcel.readInt();
                final String string2 = parcel.readString();
                Notification notification;
                if (parcel.readInt() != 0) {
                    notification = (Notification)Notification.CREATOR.createFromParcel(parcel);
                }
                else {
                    notification = null;
                }
                this.m2(string, int1, string2, notification);
                return true;
            }
            if (int1 == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                this.y1(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (int1 == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                this.F0(parcel.readString());
                return true;
            }
            if (int1 != 1598968902) {
                return super.onTransact(int1, parcel, parcel2, n);
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        }
        
        private static class a implements android.support.v4.app.a
        {
            public static android.support.v4.app.a f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            @Override
            public void F0(final String s) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(s);
                    if (!this.e.transact(3, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().F0(s);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public String H() {
                return "android.support.v4.app.INotificationSideChannel";
            }
            
            public IBinder asBinder() {
                return this.e;
            }
            
            @Override
            public void m2(final String s, final int n, final String s2, final Notification notification) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(s);
                    obtain.writeInt(n);
                    obtain.writeString(s2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(1, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().m2(s, n, s2, notification);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void y1(final String s, final int n, final String s2) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(s);
                    obtain.writeInt(n);
                    obtain.writeString(s2);
                    if (!this.e.transact(2, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().y1(s, n, s2);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}
