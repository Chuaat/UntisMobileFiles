// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.ads_identifier;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class g extends a implements e
{
    g(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }
    
    @Override
    public final boolean F(final boolean b) throws RemoteException {
        final Parcel h = this.H();
        c.a(h, true);
        final Parcel x2 = this.x2(2, h);
        final boolean b2 = c.b(x2);
        x2.recycle();
        return b2;
    }
    
    @Override
    public final boolean a() throws RemoteException {
        final Parcel x2 = this.x2(6, this.H());
        final boolean b = c.b(x2);
        x2.recycle();
        return b;
    }
    
    @Override
    public final String b() throws RemoteException {
        final Parcel x2 = this.x2(1, this.H());
        final String string = x2.readString();
        x2.recycle();
        return string;
    }
}
