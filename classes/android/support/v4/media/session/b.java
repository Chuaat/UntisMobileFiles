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
import android.app.PendingIntent;
import android.view.KeyEvent;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import java.util.List;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.IInterface;

public interface b extends IInterface
{
    void A(final MediaDescriptionCompat p0) throws RemoteException;
    
    int B() throws RemoteException;
    
    CharSequence C() throws RemoteException;
    
    void D() throws RemoteException;
    
    Bundle E() throws RemoteException;
    
    String J() throws RemoteException;
    
    void K(final boolean p0) throws RemoteException;
    
    int L() throws RemoteException;
    
    void L1(final int p0) throws RemoteException;
    
    boolean M() throws RemoteException;
    
    void M0(final String p0, final Bundle p1) throws RemoteException;
    
    void N0(final android.support.v4.media.session.a p0) throws RemoteException;
    
    List<MediaSessionCompat.QueueItem> O() throws RemoteException;
    
    void P(final int p0) throws RemoteException;
    
    int Q() throws RemoteException;
    
    void Q0(final String p0, final Bundle p1) throws RemoteException;
    
    void Q1() throws RemoteException;
    
    void R(final int p0) throws RemoteException;
    
    void R0(final String p0, final Bundle p1) throws RemoteException;
    
    void T(final String p0, final Bundle p1) throws RemoteException;
    
    void U1(final String p0, final Bundle p1, final MediaSessionCompat.ResultReceiverWrapper p2) throws RemoteException;
    
    void V0() throws RemoteException;
    
    void V1() throws RemoteException;
    
    void W(final android.support.v4.media.session.a p0) throws RemoteException;
    
    void X0(final Uri p0, final Bundle p1) throws RemoteException;
    
    void Z0(final long p0) throws RemoteException;
    
    boolean a0() throws RemoteException;
    
    void b0(final RatingCompat p0) throws RemoteException;
    
    void e0(final int p0, final int p1, final String p2) throws RemoteException;
    
    void f2(final long p0) throws RemoteException;
    
    void g0(final Uri p0, final Bundle p1) throws RemoteException;
    
    void g2(final boolean p0) throws RemoteException;
    
    Bundle getExtras() throws RemoteException;
    
    ParcelableVolumeInfo h2() throws RemoteException;
    
    void i1(final float p0) throws RemoteException;
    
    boolean l1(final KeyEvent p0) throws RemoteException;
    
    boolean n0() throws RemoteException;
    
    void next() throws RemoteException;
    
    void previous() throws RemoteException;
    
    PendingIntent r0() throws RemoteException;
    
    void r1(final int p0, final int p1, final String p2) throws RemoteException;
    
    void stop() throws RemoteException;
    
    void t1(final RatingCompat p0, final Bundle p1) throws RemoteException;
    
    MediaMetadataCompat u() throws RemoteException;
    
    void u0(final String p0, final Bundle p1) throws RemoteException;
    
    PlaybackStateCompat v() throws RemoteException;
    
    long w() throws RemoteException;
    
    void w1(final MediaDescriptionCompat p0, final int p1) throws RemoteException;
    
    String x() throws RemoteException;
    
    void z(final MediaDescriptionCompat p0) throws RemoteException;
    
    void z0() throws RemoteException;
    
    public static class a implements b
    {
        @Override
        public void A(final MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        }
        
        @Override
        public int B() throws RemoteException {
            return 0;
        }
        
        @Override
        public CharSequence C() throws RemoteException {
            return null;
        }
        
        @Override
        public void D() throws RemoteException {
        }
        
        @Override
        public Bundle E() throws RemoteException {
            return null;
        }
        
        @Override
        public String J() throws RemoteException {
            return null;
        }
        
        @Override
        public void K(final boolean b) throws RemoteException {
        }
        
        @Override
        public int L() throws RemoteException {
            return 0;
        }
        
        @Override
        public void L1(final int n) throws RemoteException {
        }
        
        @Override
        public boolean M() throws RemoteException {
            return false;
        }
        
        @Override
        public void M0(final String s, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void N0(final android.support.v4.media.session.a a) throws RemoteException {
        }
        
        @Override
        public List<MediaSessionCompat.QueueItem> O() throws RemoteException {
            return null;
        }
        
        @Override
        public void P(final int n) throws RemoteException {
        }
        
        @Override
        public int Q() throws RemoteException {
            return 0;
        }
        
        @Override
        public void Q0(final String s, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void Q1() throws RemoteException {
        }
        
        @Override
        public void R(final int n) throws RemoteException {
        }
        
        @Override
        public void R0(final String s, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void T(final String s, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void U1(final String s, final Bundle bundle, final MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
        }
        
        @Override
        public void V0() throws RemoteException {
        }
        
        @Override
        public void V1() throws RemoteException {
        }
        
        @Override
        public void W(final android.support.v4.media.session.a a) throws RemoteException {
        }
        
        @Override
        public void X0(final Uri uri, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void Z0(final long n) throws RemoteException {
        }
        
        @Override
        public boolean a0() throws RemoteException {
            return false;
        }
        
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void b0(final RatingCompat ratingCompat) throws RemoteException {
        }
        
        @Override
        public void e0(final int n, final int n2, final String s) throws RemoteException {
        }
        
        @Override
        public void f2(final long n) throws RemoteException {
        }
        
        @Override
        public void g0(final Uri uri, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public void g2(final boolean b) throws RemoteException {
        }
        
        @Override
        public Bundle getExtras() throws RemoteException {
            return null;
        }
        
        @Override
        public ParcelableVolumeInfo h2() throws RemoteException {
            return null;
        }
        
        @Override
        public void i1(final float n) throws RemoteException {
        }
        
        @Override
        public boolean l1(final KeyEvent keyEvent) throws RemoteException {
            return false;
        }
        
        @Override
        public boolean n0() throws RemoteException {
            return false;
        }
        
        @Override
        public void next() throws RemoteException {
        }
        
        @Override
        public void previous() throws RemoteException {
        }
        
        @Override
        public PendingIntent r0() throws RemoteException {
            return null;
        }
        
        @Override
        public void r1(final int n, final int n2, final String s) throws RemoteException {
        }
        
        @Override
        public void stop() throws RemoteException {
        }
        
        @Override
        public void t1(final RatingCompat ratingCompat, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public MediaMetadataCompat u() throws RemoteException {
            return null;
        }
        
        @Override
        public void u0(final String s, final Bundle bundle) throws RemoteException {
        }
        
        @Override
        public PlaybackStateCompat v() throws RemoteException {
            return null;
        }
        
        @Override
        public long w() throws RemoteException {
            return 0L;
        }
        
        @Override
        public void w1(final MediaDescriptionCompat mediaDescriptionCompat, final int n) throws RemoteException {
        }
        
        @Override
        public String x() throws RemoteException {
            return null;
        }
        
        @Override
        public void z(final MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        }
        
        @Override
        public void z0() throws RemoteException {
        }
    }
    
    public abstract static class b extends Binder implements android.support.v4.media.session.b
    {
        static final int A = 47;
        static final int B = 41;
        static final int C = 42;
        static final int D = 43;
        static final int E = 44;
        static final int F = 50;
        static final int G = 33;
        static final int H = 34;
        static final int I = 35;
        static final int J = 36;
        static final int K = 13;
        static final int L = 14;
        static final int M = 15;
        static final int N = 16;
        static final int O = 17;
        static final int P = 18;
        static final int Q = 19;
        static final int R = 20;
        static final int S = 21;
        static final int T = 22;
        static final int U = 23;
        static final int V = 24;
        static final int W = 25;
        static final int X = 51;
        static final int Y = 49;
        static final int Z = 46;
        static final int a0 = 39;
        static final int b0 = 40;
        static final int c0 = 48;
        static final int d0 = 26;
        private static final String e = "android.support.v4.media.session.IMediaSession";
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
        static final int r = 27;
        static final int s = 28;
        static final int t = 29;
        static final int u = 30;
        static final int v = 31;
        static final int w = 32;
        static final int x = 45;
        static final int y = 37;
        static final int z = 38;
        
        public b() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaSession");
        }
        
        public static android.support.v4.media.session.b H(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && queryLocalInterface instanceof android.support.v4.media.session.b) {
                return (android.support.v4.media.session.b)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static android.support.v4.media.session.b x2() {
            return a.f;
        }
        
        public static boolean y2(final android.support.v4.media.session.b f) {
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
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
            if (n == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            final boolean b = false;
            boolean b2 = false;
            final MediaDescriptionCompat mediaDescriptionCompat = null;
            final MediaDescriptionCompat mediaDescriptionCompat2 = null;
            final MediaDescriptionCompat mediaDescriptionCompat3 = null;
            final Bundle bundle = null;
            Bundle bundle2 = null;
            final Bundle bundle3 = null;
            final Bundle bundle4 = null;
            final RatingCompat ratingCompat = null;
            final Bundle bundle5 = null;
            final Bundle bundle6 = null;
            final Bundle bundle7 = null;
            final KeyEvent keyEvent = null;
            MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
            final Bundle bundle8 = null;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 51: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    RatingCompat ratingCompat2;
                    if (parcel.readInt() != 0) {
                        ratingCompat2 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        ratingCompat2 = null;
                    }
                    Bundle bundle9 = bundle8;
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.t1(ratingCompat2, bundle9);
                    parcel2.writeNoException();
                    return true;
                }
                case 50: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final Bundle e = this.E();
                    parcel2.writeNoException();
                    if (e != null) {
                        parcel2.writeInt(1);
                        e.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 49: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.i1(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                }
                case 48: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.R(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 47: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = this.L();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 46: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        b2 = true;
                    }
                    this.K(b2);
                    parcel2.writeNoException();
                    return true;
                }
                case 45: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = (this.M() ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 44: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.L1(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 43: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat4 = mediaDescriptionCompat;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat4 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.z(mediaDescriptionCompat4);
                    parcel2.writeNoException();
                    return true;
                }
                case 42: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat5 = mediaDescriptionCompat2;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat5 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.w1(mediaDescriptionCompat5, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 41: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat6 = mediaDescriptionCompat3;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat6 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.A(mediaDescriptionCompat6);
                    parcel2.writeNoException();
                    return true;
                }
                case 40: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean b3 = b;
                    if (parcel.readInt() != 0) {
                        b3 = true;
                    }
                    this.g2(b3);
                    parcel2.writeNoException();
                    return true;
                }
                case 39: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.P(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                case 38: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = (this.a0() ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 37: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = this.Q();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 36: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Uri uri;
                    if (parcel.readInt() != 0) {
                        uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        uri = null;
                    }
                    Bundle bundle10 = bundle;
                    if (parcel.readInt() != 0) {
                        bundle10 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.g0(uri, bundle10);
                    parcel2.writeNoException();
                    return true;
                }
                case 35: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.u0(string, bundle2);
                    parcel2.writeNoException();
                    return true;
                }
                case 34: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string2 = parcel.readString();
                    Bundle bundle11 = bundle3;
                    if (parcel.readInt() != 0) {
                        bundle11 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.M0(string2, bundle11);
                    parcel2.writeNoException();
                    return true;
                }
                case 33: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.z0();
                    parcel2.writeNoException();
                    return true;
                }
                case 32: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = this.B();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 31: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final Bundle extras = this.getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 30: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final CharSequence c = this.C();
                    parcel2.writeNoException();
                    if (c != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(c, parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 29: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final List<MediaSessionCompat.QueueItem> o = this.O();
                    parcel2.writeNoException();
                    parcel2.writeTypedList((List)o);
                    return true;
                }
                case 28: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final PlaybackStateCompat v = this.v();
                    parcel2.writeNoException();
                    if (v != null) {
                        parcel2.writeInt(1);
                        v.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 27: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final MediaMetadataCompat u = this.u();
                    parcel2.writeNoException();
                    if (u != null) {
                        parcel2.writeInt(1);
                        u.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 26: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string3 = parcel.readString();
                    Bundle bundle12 = bundle4;
                    if (parcel.readInt() != 0) {
                        bundle12 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.T(string3, bundle12);
                    parcel2.writeNoException();
                    return true;
                }
                case 25: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    RatingCompat ratingCompat3 = ratingCompat;
                    if (parcel.readInt() != 0) {
                        ratingCompat3 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.b0(ratingCompat3);
                    parcel2.writeNoException();
                    return true;
                }
                case 24: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.Z0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                }
                case 23: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.V1();
                    parcel2.writeNoException();
                    return true;
                }
                case 22: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.V0();
                    parcel2.writeNoException();
                    return true;
                }
                case 21: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.previous();
                    parcel2.writeNoException();
                    return true;
                }
                case 20: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.next();
                    parcel2.writeNoException();
                    return true;
                }
                case 19: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.stop();
                    parcel2.writeNoException();
                    return true;
                }
                case 18: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.D();
                    parcel2.writeNoException();
                    return true;
                }
                case 17: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.f2(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                }
                case 16: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Uri uri2;
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        uri2 = null;
                    }
                    Bundle bundle13 = bundle5;
                    if (parcel.readInt() != 0) {
                        bundle13 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.X0(uri2, bundle13);
                    parcel2.writeNoException();
                    return true;
                }
                case 15: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string4 = parcel.readString();
                    Bundle bundle14 = bundle6;
                    if (parcel.readInt() != 0) {
                        bundle14 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.R0(string4, bundle14);
                    parcel2.writeNoException();
                    return true;
                }
                case 14: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string5 = parcel.readString();
                    Bundle bundle15 = bundle7;
                    if (parcel.readInt() != 0) {
                        bundle15 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.Q0(string5, bundle15);
                    parcel2.writeNoException();
                    return true;
                }
                case 13: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.Q1();
                    parcel2.writeNoException();
                    return true;
                }
                case 12: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.e0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                case 11: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.r1(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                case 10: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final ParcelableVolumeInfo h2 = this.h2();
                    parcel2.writeNoException();
                    if (h2 != null) {
                        parcel2.writeInt(1);
                        h2.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 9: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final long w = this.w();
                    parcel2.writeNoException();
                    parcel2.writeLong(w);
                    return true;
                }
                case 8: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final PendingIntent r0 = this.r0();
                    parcel2.writeNoException();
                    if (r0 != null) {
                        parcel2.writeInt(1);
                        r0.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    return true;
                }
                case 7: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String j = this.J();
                    parcel2.writeNoException();
                    parcel2.writeString(j);
                    return true;
                }
                case 6: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String x = this.x();
                    parcel2.writeNoException();
                    parcel2.writeString(x);
                    return true;
                }
                case 5: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n = (this.n0() ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 4: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.N0(android.support.v4.media.session.a.b.H(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                case 3: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    this.W(android.support.v4.media.session.a.b.H(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                case 2: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    KeyEvent keyEvent2 = keyEvent;
                    if (parcel.readInt() != 0) {
                        keyEvent2 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    n = (this.l1(keyEvent2) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                }
                case 1: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final String string6 = parcel.readString();
                    Bundle bundle16;
                    if (parcel.readInt() != 0) {
                        bundle16 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle16 = null;
                    }
                    if (parcel.readInt() != 0) {
                        resultReceiverWrapper = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    this.U1(string6, bundle16, resultReceiverWrapper);
                    parcel2.writeNoException();
                    return true;
                }
            }
        }
        
        private static class a implements b
        {
            public static b f;
            private IBinder e;
            
            a(final IBinder e) {
                this.e = e;
            }
            
            @Override
            public void A(final MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(41, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().A(mediaDescriptionCompat);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int B() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(32, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().B();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public CharSequence C() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(30, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().C();
                    }
                    obtain2.readException();
                    CharSequence charSequence;
                    if (obtain2.readInt() != 0) {
                        charSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        charSequence = null;
                    }
                    return charSequence;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void D() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(18, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().D();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle E() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(50, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().E();
                    }
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            public String H() {
                return "android.support.v4.media.session.IMediaSession";
            }
            
            @Override
            public String J() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(7, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().J();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void K(final boolean b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (!this.e.transact(46, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().K(b);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int L() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(47, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().L();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void L1(final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    if (!this.e.transact(44, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().L1(n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean M() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    final IBinder e = this.e;
                    boolean b = false;
                    if (!e.transact(45, obtain, obtain2, 0) && android.support.v4.media.session.b.b.x2() != null) {
                        return android.support.v4.media.session.b.b.x2().M();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void M0(final String s, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(34, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().M0(s, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void N0(final android.support.v4.media.session.a a) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    IBinder binder;
                    if (a != null) {
                        binder = ((IInterface)a).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(4, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().N0(a);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public List<MediaSessionCompat.QueueItem> O() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(29, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().O();
                    }
                    obtain2.readException();
                    return (List<MediaSessionCompat.QueueItem>)obtain2.createTypedArrayList((Parcelable$Creator)MediaSessionCompat.QueueItem.CREATOR);
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void P(final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    if (!this.e.transact(39, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().P(n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int Q() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(37, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().Q();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void Q0(final String s, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(14, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().Q0(s, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void Q1() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(13, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().Q1();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void R(final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    if (!this.e.transact(48, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().R(n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void R0(final String s, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(15, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().R0(s, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void T(final String s, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(26, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().T(s, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void U1(final String s, final Bundle bundle, final MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(1, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().U1(s, bundle, resultReceiverWrapper);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void V0() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(22, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().V0();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void V1() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(23, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().V1();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void W(final android.support.v4.media.session.a a) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    IBinder binder;
                    if (a != null) {
                        binder = ((IInterface)a).asBinder();
                    }
                    else {
                        binder = null;
                    }
                    obtain.writeStrongBinder(binder);
                    if (!this.e.transact(3, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().W(a);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void X0(final Uri uri, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(16, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().X0(uri, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void Z0(final long n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(n);
                    if (!this.e.transact(24, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().Z0(n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean a0() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    final IBinder e = this.e;
                    boolean b = false;
                    if (!e.transact(38, obtain, obtain2, 0) && android.support.v4.media.session.b.b.x2() != null) {
                        return android.support.v4.media.session.b.b.x2().a0();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
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
            public void b0(final RatingCompat ratingCompat) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(25, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().b0(ratingCompat);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void e0(final int n, final int n2, final String s) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    obtain.writeInt(n2);
                    obtain.writeString(s);
                    if (!this.e.transact(12, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().e0(n, n2, s);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void f2(final long n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(n);
                    if (!this.e.transact(17, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().f2(n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void g0(final Uri uri, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(36, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().g0(uri, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void g2(final boolean b) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (!this.e.transact(40, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().g2(b);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle getExtras() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(31, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().getExtras();
                    }
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public ParcelableVolumeInfo h2() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(10, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().h2();
                    }
                    obtain2.readException();
                    ParcelableVolumeInfo parcelableVolumeInfo;
                    if (obtain2.readInt() != 0) {
                        parcelableVolumeInfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        parcelableVolumeInfo = null;
                    }
                    return parcelableVolumeInfo;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void i1(final float n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeFloat(n);
                    if (!this.e.transact(49, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().i1(n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean l1(final KeyEvent keyEvent) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean b = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(2, obtain, obtain2, 0) && android.support.v4.media.session.b.b.x2() != null) {
                        return android.support.v4.media.session.b.b.x2().l1(keyEvent);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        b = false;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean n0() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    final IBinder e = this.e;
                    boolean b = false;
                    if (!e.transact(5, obtain, obtain2, 0) && android.support.v4.media.session.b.b.x2() != null) {
                        return android.support.v4.media.session.b.b.x2().n0();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void next() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(20, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().next();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void previous() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(21, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().previous();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public PendingIntent r0() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(8, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().r0();
                    }
                    obtain2.readException();
                    PendingIntent pendingIntent;
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        pendingIntent = null;
                    }
                    return pendingIntent;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void r1(final int n, final int n2, final String s) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(n);
                    obtain.writeInt(n2);
                    obtain.writeString(s);
                    if (!this.e.transact(11, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().r1(n, n2, s);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void stop() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(19, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().stop();
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void t1(final RatingCompat ratingCompat, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(51, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().t1(ratingCompat, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public MediaMetadataCompat u() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(27, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().u();
                    }
                    obtain2.readException();
                    MediaMetadataCompat mediaMetadataCompat;
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        mediaMetadataCompat = null;
                    }
                    return mediaMetadataCompat;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void u0(final String s, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(35, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().u0(s, bundle);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public PlaybackStateCompat v() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(28, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().v();
                    }
                    obtain2.readException();
                    PlaybackStateCompat playbackStateCompat;
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        playbackStateCompat = null;
                    }
                    return playbackStateCompat;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public long w() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(9, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().w();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void w1(final MediaDescriptionCompat mediaDescriptionCompat, final int n) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(n);
                    if (!this.e.transact(42, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().w1(mediaDescriptionCompat, n);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public String x() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(6, obtain, obtain2, 0) && b.x2() != null) {
                        return b.x2().x();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void z(final MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.e.transact(43, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().z(mediaDescriptionCompat);
                        return;
                    }
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public void z0() throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.e.transact(33, obtain, obtain2, 0) && b.x2() != null) {
                        b.x2().z0();
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
