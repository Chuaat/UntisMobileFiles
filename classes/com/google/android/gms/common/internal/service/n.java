// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.internal.base.d;
import android.os.IBinder;
import com.google.android.gms.internal.base.b;

public final class n extends b implements l
{
    n(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.service.ICommonService");
    }
    
    @Override
    public final void o0(final j j) throws RemoteException {
        final Parcel h = this.H();
        d.b(h, (IInterface)j);
        this.z2(1, h);
    }
}
