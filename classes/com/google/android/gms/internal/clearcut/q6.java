// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.clearcut.g;
import android.os.IBinder;

public final class q6 extends a implements p6
{
    q6(final IBinder binder) {
        super(binder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }
    
    @Override
    public final void C0(final n6 n6, final g g) throws RemoteException {
        final Parcel h = this.H();
        c1.b(h, (IInterface)n6);
        c1.c(h, (Parcelable)g);
        this.x2(1, h);
    }
}
