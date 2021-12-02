// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class j1 extends o0 implements l1
{
    j1(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    @Override
    public final void V(final String s, final String s2, final Bundle bundle, final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.d(h, (Parcelable)bundle);
        h.writeLong(n);
        this.y2(1, h);
    }
    
    @Override
    public final int c() throws RemoteException {
        final Parcel x2 = this.x2(2, this.H());
        final int int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
}
