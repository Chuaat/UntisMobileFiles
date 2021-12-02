// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.d;
import android.os.IBinder;
import com.google.android.gms.internal.common.b;

public final class s1 extends b implements r
{
    s1(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    @Override
    public final void R1(final int n, final IBinder binder, final f1 f1) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(n);
        h.writeStrongBinder(binder);
        d.c(h, (Parcelable)f1);
        this.y2(3, h);
    }
    
    @Override
    public final void c1(final int n, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(n);
        d.c(h, (Parcelable)bundle);
        this.y2(2, h);
    }
    
    @Override
    public final void j1(final int n, final IBinder binder, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(n);
        h.writeStrongBinder(binder);
        d.c(h, (Parcelable)bundle);
        this.y2(1, h);
    }
}
