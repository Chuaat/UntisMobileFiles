// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class b extends e implements d
{
    b(final IBinder binder) {
        super(binder, "com.android.vending.billing.IInAppBillingService");
    }
    
    @Override
    public final Bundle G1(final int n, final String s, final String s2, final String s3, final String s4, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(n);
        h.writeString(s);
        h.writeString(s2);
        h.writeString(s3);
        h.writeString((String)null);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(8, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
    
    @Override
    public final Bundle J1(final int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(3);
        h.writeString(s);
        h.writeString(s2);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(2, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
    
    @Override
    public final Bundle K0(final int n, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(8);
        h.writeString(s);
        h.writeString(s2);
        h.writeString("subs");
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(801, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
    
    @Override
    public final Bundle S0(final int n, final String s, final String s2, final String s3) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(3);
        h.writeString(s);
        h.writeString(s2);
        h.writeString(s3);
        final Parcel x2 = this.x2(4, h);
        final Bundle bundle = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle;
    }
    
    @Override
    public final Bundle Y0(final int n, final String s, final String s2, final String s3, final String s4) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(3);
        h.writeString(s);
        h.writeString(s2);
        h.writeString(s3);
        h.writeString((String)null);
        final Parcel x2 = this.x2(3, h);
        final Bundle bundle = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle;
    }
    
    @Override
    public final Bundle Z(final int n, final String s, final String s2, final Bundle bundle, final Bundle bundle2) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(10);
        h.writeString(s);
        h.writeString(s2);
        g.b(h, (Parcelable)bundle);
        g.b(h, (Parcelable)bundle2);
        final Parcel x2 = this.x2(901, h);
        final Bundle bundle3 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle3;
    }
    
    @Override
    public final int d0(int int1, final String s, final String s2) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(3);
        h.writeString(s);
        h.writeString(s2);
        final Parcel x2 = this.x2(5, h);
        int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final int e2(int int1, final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(7);
        h.writeString(s);
        h.writeString(s2);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(10, h);
        int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final int g1(int int1, final String s, final String s2) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(int1);
        h.writeString(s);
        h.writeString(s2);
        final Parcel x2 = this.x2(1, h);
        int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final Bundle j2(final int n, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(9);
        h.writeString(s);
        h.writeString(s2);
        h.writeString(s3);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(11, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
    
    @Override
    public final Bundle k0(final int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(9);
        h.writeString(s);
        h.writeString(s2);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(12, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
    
    @Override
    public final Bundle r2(final int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(9);
        h.writeString(s);
        h.writeString(s2);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(902, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
    
    @Override
    public final Bundle w0(final int n, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(6);
        h.writeString(s);
        h.writeString(s2);
        h.writeString(s3);
        g.b(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(9, h);
        final Bundle bundle2 = g.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
}
