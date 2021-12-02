// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.q0;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.util.List;
import android.os.RemoteException;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.o0;

public final class b3 extends o0 implements d3
{
    b3(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    @Override
    public final void D0(final c c) throws RemoteException {
        throw null;
    }
    
    @Override
    public final List<c> E0(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel h = this.H();
        h.writeString((String)null);
        h.writeString(s2);
        h.writeString(s3);
        final Parcel x2 = this.x2(17, h);
        final ArrayList typedArrayList = x2.createTypedArrayList((Parcelable$Creator)c.CREATOR);
        x2.recycle();
        return (List<c>)typedArrayList;
    }
    
    @Override
    public final byte[] L0(final u u, final String s) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)u);
        h.writeString(s);
        final Parcel x2 = this.x2(9, h);
        final byte[] byteArray = x2.createByteArray();
        x2.recycle();
        return byteArray;
    }
    
    @Override
    public final void U0(final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)na);
        this.y2(4, h);
    }
    
    @Override
    public final List<c> W0(final String s, final String s2, final na na) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.d(h, (Parcelable)na);
        final Parcel x2 = this.x2(16, h);
        final ArrayList typedArrayList = x2.createTypedArrayList((Parcelable$Creator)c.CREATOR);
        x2.recycle();
        return (List<c>)typedArrayList;
    }
    
    @Override
    public final List<ca> W1(final na na, final boolean b) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)na);
        q0.c(h, b);
        final Parcel x2 = this.x2(7, h);
        final ArrayList typedArrayList = x2.createTypedArrayList((Parcelable$Creator)ca.CREATOR);
        x2.recycle();
        return (List<ca>)typedArrayList;
    }
    
    @Override
    public final void X(final Bundle bundle, final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        q0.d(h, (Parcelable)na);
        this.y2(19, h);
    }
    
    @Override
    public final void b1(final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)na);
        this.y2(6, h);
    }
    
    @Override
    public final void c0(final c c, final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)c);
        q0.d(h, (Parcelable)na);
        this.y2(12, h);
    }
    
    @Override
    public final void c2(final u u, final String s, final String s2) throws RemoteException {
        throw null;
    }
    
    @Override
    public final List<ca> i0(final String s, final String s2, final String s3, final boolean b) throws RemoteException {
        final Parcel h = this.H();
        h.writeString((String)null);
        h.writeString(s2);
        h.writeString(s3);
        q0.c(h, b);
        final Parcel x2 = this.x2(15, h);
        final ArrayList typedArrayList = x2.createTypedArrayList((Parcelable$Creator)ca.CREATOR);
        x2.recycle();
        return (List<ca>)typedArrayList;
    }
    
    @Override
    public final void k1(final u u, final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)u);
        q0.d(h, (Parcelable)na);
        this.y2(1, h);
    }
    
    @Override
    public final void l0(final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)na);
        this.y2(18, h);
    }
    
    @Override
    public final void q1(final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)na);
        this.y2(20, h);
    }
    
    @Override
    public final void s1(final long n, final String s, final String s2, final String s3) throws RemoteException {
        final Parcel h = this.H();
        h.writeLong(n);
        h.writeString(s);
        h.writeString(s2);
        h.writeString(s3);
        this.y2(10, h);
    }
    
    @Override
    public final void t2(final ca ca, final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)ca);
        q0.d(h, (Parcelable)na);
        this.y2(2, h);
    }
    
    @Override
    public final List<ca> u1(final String s, final String s2, final boolean b, final na na) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.c(h, b);
        q0.d(h, (Parcelable)na);
        final Parcel x2 = this.x2(14, h);
        final ArrayList typedArrayList = x2.createTypedArrayList((Parcelable$Creator)ca.CREATOR);
        x2.recycle();
        return (List<ca>)typedArrayList;
    }
    
    @Override
    public final String x0(final na na) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)na);
        final Parcel x2 = this.x2(11, h);
        final String string = x2.readString();
        x2.recycle();
        return string;
    }
}
