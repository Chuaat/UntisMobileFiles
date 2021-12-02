// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.dynamic.d;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import com.google.android.gms.internal.common.b;

public final class q1 extends b implements p1
{
    q1(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.ICertData");
    }
    
    @Override
    public final int a() throws RemoteException {
        final Parcel x2 = this.x2(2, this.H());
        final int int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final d zzb() throws RemoteException {
        final Parcel x2 = this.x2(1, this.H());
        final d x3 = d.a.x2(x2.readStrongBinder());
        x2.recycle();
        return x3;
    }
}
