// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class r0 extends o0 implements t0
{
    r0(final IBinder binder) {
        super(binder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }
    
    @Override
    public final Bundle G(final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        final Parcel x2 = this.x2(1, h);
        final Bundle bundle2 = q0.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
        x2.recycle();
        return bundle2;
    }
}
