// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;
import com.google.android.gms.internal.base.b;

public final class p0 extends b implements q0
{
    p0(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
    
    @Override
    public final d Y(final d d, final y0 y0) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.base.d.b(h, (IInterface)d);
        com.google.android.gms.internal.base.d.c(h, (Parcelable)y0);
        final Parcel x2 = this.x2(2, h);
        final d x3 = d.a.x2(x2.readStrongBinder());
        x2.recycle();
        return x3;
    }
}
