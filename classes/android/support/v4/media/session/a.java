// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media.session;

import android.os.Parcelable$Creator;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;

public interface a extends IInterface
{
    void A0() throws RemoteException;
    
    void B0(final Bundle p0) throws RemoteException;
    
    void C1(final int p0) throws RemoteException;
    
    void G0(final List<MediaSessionCompat.QueueItem> p0) throws RemoteException;
    
    void O1(final int p0) throws RemoteException;
    
    void S(final String p0, final Bundle p1) throws RemoteException;
    
    void a1(final boolean p0) throws RemoteException;
    
    void n1(final boolean p0) throws RemoteException;
    
    void p1(final CharSequence p0) throws RemoteException;
    
    void s2(final PlaybackStateCompat p0) throws RemoteException;
    
    void v1() throws RemoteException;
    
    void v2(final ParcelableVolumeInfo p0) throws RemoteException;
    
    void x1(final MediaMetadataCompat p0) throws RemoteException;
    
    public static class a implements android.support.v4.media.session.a
    {
        @Override
        public void A0() throws RemoteException {
        }
        
        @Override
        public void B0(final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void C1(final int n) throws RemoteException {
        }
        
        @Override
        public void G0(final List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        }
        
        @Override
        public void O1(final int n) throws RemoteException {
        }
        
        @Override
        public void S(final String s, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void a1(final boolean b) throws RemoteException {
        }
        
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void n1(final boolean b) throws RemoteException {
        }
        
        @Override
        public void p1(final CharSequence charSequence) throws RemoteException {
        }
        
        @Override
        public void s2(final PlaybackStateCompat playbackStateCompat) throws RemoteException {
        }
        
        @Override
        public void v1() throws RemoteException {
        }
        
        @Override
        public void v2(final ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        }
        
        @Override
        public void x1(final MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements android.support.v4.media.session.a
    {
        private static final String e = "android.support.v4.media.session.IMediaControllerCallback";
        static final int f = 1;
        static final int g = 2;
        static final int h = 3;
        static final int i = 4;
        static final int j = 5;
        static final int k = 6;
        static final int l = 7;
        static final int m = 8;
        static final int n = 9;
        static final int o = 10;
        static final int p = 11;
        static final int q = 12;
        static final int r = 13;
        
        public b() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaControllerCallback");
        }
        
        public static android.support.v4.media.session.a H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof android.support.v4.media.session.a) {
                return (android.support.v4.media.session.a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static android.support.v4.media.session.a x2() {
            return a.f;
        }
        
        public static boolean y2(final android.support.v4.media.session.a f) {
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
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            final boolean b = false;
            boolean b2 = false;
            final Bundle bundle = null;
            final CharSequence charSequence = null;
            final MediaMetadataCompat mediaMetadataCompat = null;
            final PlaybackStateCompat playbackStateCompat = null;
            final Bundle bundle2 = null;
            final ParcelableVolumeInfo parcelableVolumeInfo = null;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 13: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.A0();
                    return true;
                }
                case 12: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.O1(parcel.readInt());
                    return true;
                }
                case 11: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        b2 = true;
                    }
                    this.a1(b2);
                    return true;
                }
                case 10: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    boolean b3 = b;
                    if (parcel.readInt() != 0) {
                        b3 = true;
                    }
                    this.n1(b3);
                    return true;
                }
                case 9: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.C1(parcel.readInt());
                    return true;
                }
                case 8: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ParcelableVolumeInfo parcelableVolumeInfo2 = parcelableVolumeInfo;
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfo2 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    this.v2(parcelableVolumeInfo2);
                    return true;
                }
                case 7: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    Bundle bundle3 = bundle;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.B0(bundle3);
                    return true;
                }
                case 6: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    CharSequence charSequence2 = charSequence;
                    if (parcel.readInt() != 0) {
                        charSequence2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    this.p1(charSequence2);
                    return true;
                }
                case 5: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.G0(parcel.createTypedArrayList((Parcelable$Creator)MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                }
                case 4: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat;
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompat2 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.x1(mediaMetadataCompat2);
                    return true;
                }
                case 3: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    PlaybackStateCompat playbackStateCompat2 = playbackStateCompat;
                    if (parcel.readInt() != 0) {
                        playbackStateCompat2 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.s2(playbackStateCompat2);
                    return true;
                }
                case 2: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.v1();
                    return true;
                }
                case 1: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    final String string = parcel.readString();
                    Bundle bundle4 = bundle2;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.S(string, bundle4);
                    return true;
                }
            }
        }
        
        private static class a implements android.support.v4.media.session.a
        {
            public static android.support.v4.media.session.a f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            @Override
            public void A0() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.e.transact(13, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().A0();
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void B0(final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(7, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().B0(bundle);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void C1(final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(n);
                    if (!this.e.transact(9, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().C1(n);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void G0(final List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList((List)list);
                    if (!this.e.transact(5, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().G0(list);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public String H() {
                return "android.support.v4.media.session.IMediaControllerCallback";
            }
            
            @Override
            public void O1(final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(n);
                    if (!this.e.transact(12, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().O1(n);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void S(final String s, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(1, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().S(s, bundle);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void a1(final boolean b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (!this.e.transact(11, obtain, (Parcel)null, 1) && android.support.v4.media.session.a.b.x2() != null) {
                        android.support.v4.media.session.a.b.x2().a1(b);
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
            public void n1(final boolean b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (!this.e.transact(10, obtain, (Parcel)null, 1) && android.support.v4.media.session.a.b.x2() != null) {
                        android.support.v4.media.session.a.b.x2().n1(b);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void p1(final CharSequence charSequence) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(6, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().p1(charSequence);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void s2(final PlaybackStateCompat playbackStateCompat) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(3, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().s2(playbackStateCompat);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void v1() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.e.transact(2, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().v1();
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void v2(final ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(8, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().v2(parcelableVolumeInfo);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void x1(final MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(4, obtain, (Parcel)null, 1) && b.x2() != null) {
                        b.x2().x1(mediaMetadataCompat);
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}
