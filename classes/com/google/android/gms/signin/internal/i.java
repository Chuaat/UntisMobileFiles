// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.internal.p;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.IBinder;
import com.google.android.gms.internal.base.b;

public final class i extends b implements f
{
    i(final IBinder binder) {
        super(binder, "com.google.android.gms.signin.internal.ISignInService");
    }
    
    @Override
    public final void K1(final l l, final d d) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.base.d.c(h, (Parcelable)l);
        com.google.android.gms.internal.base.d.b(h, (IInterface)d);
        this.y2(12, h);
    }
    
    @Override
    public final void T0(final p p3, final int n, final boolean b) throws RemoteException {
        final Parcel h = this.H();
        com.google.android.gms.internal.base.d.b(h, (IInterface)p3);
        h.writeInt(n);
        com.google.android.gms.internal.base.d.d(h, b);
        this.y2(9, h);
    }
    
    @Override
    public final void h(final int n) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(n);
        this.y2(7, h);
    }
}
