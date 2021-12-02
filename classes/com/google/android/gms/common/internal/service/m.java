// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import android.os.Parcel;
import com.google.android.gms.internal.base.a;

public abstract class m extends a implements j
{
    public m() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }
    
    @Override
    protected final boolean x2(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n == 1) {
            this.h(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
