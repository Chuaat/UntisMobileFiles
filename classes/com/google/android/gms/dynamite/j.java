// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;
import com.google.android.gms.internal.common.b;

public final class j extends b implements k
{
    j(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    @Override
    public final d D1(d x2, final String s, final boolean b) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)x2);
        h.writeString(s);
        com.google.android.gms.internal.common.d.d(h, b);
        final Parcel x3 = this.x2(7, h);
        x2 = d.a.x2(x3.readStrongBinder());
        x3.recycle();
        return x2;
    }
    
    @Override
    public final int F1(final d d, final String s, final boolean b) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)d);
        h.writeString(s);
        com.google.android.gms.internal.common.d.d(h, b);
        final Parcel x2 = this.x2(3, h);
        final int int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final d N1(d x2, final String s, final int n) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)x2);
        h.writeString(s);
        h.writeInt(n);
        final Parcel x3 = this.x2(4, h);
        x2 = d.a.x2(x3.readStrongBinder());
        x3.recycle();
        return x2;
    }
    
    @Override
    public final d P0(d x2, final String s, final int n) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)x2);
        h.writeString(s);
        h.writeInt(n);
        final Parcel x3 = this.x2(2, h);
        x2 = d.a.x2(x3.readStrongBinder());
        x3.recycle();
        return x2;
    }
    
    @Override
    public final d f(final d d, final String s, final int n, final d d2) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)d);
        h.writeString(s);
        h.writeInt(n);
        com.google.android.gms.internal.common.d.b(h, (IInterface)d2);
        final Parcel x2 = this.x2(8, h);
        final d x3 = d.a.x2(x2.readStrongBinder());
        x2.recycle();
        return x3;
    }
    
    @Override
    public final int m1(final d d, final String s, final boolean b) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)d);
        h.writeString(s);
        com.google.android.gms.internal.common.d.d(h, b);
        final Parcel x2 = this.x2(5, h);
        final int int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final int zzb() throws RemoteException {
        final Parcel x2 = this.x2(6, this.H());
        final int int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
}
