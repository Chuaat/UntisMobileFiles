// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class g1 extends o0 implements i1
{
    g1(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    @Override
    public final void G(final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        this.y2(1, h);
    }
}
