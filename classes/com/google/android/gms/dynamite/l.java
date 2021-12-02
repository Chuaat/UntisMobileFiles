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

public final class l extends b implements m
{
    l(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }
    
    @Override
    public final d f(final d d, final String s, final int n, final d d2) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)d);
        h.writeString(s);
        h.writeInt(n);
        com.google.android.gms.internal.common.d.b(h, (IInterface)d2);
        final Parcel x2 = this.x2(2, h);
        final d x3 = d.a.x2(x2.readStrongBinder());
        x2.recycle();
        return x3;
    }
    
    @Override
    public final d m0(final d d, final String s, final int n, final d d2) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.common.d.b(h, (IInterface)d);
        h.writeString(s);
        h.writeInt(n);
        com.google.android.gms.internal.common.d.b(h, (IInterface)d2);
        final Parcel x2 = this.x2(3, h);
        final d x3 = d.a.x2(x2.readStrongBinder());
        x2.recycle();
        return x3;
    }
}
