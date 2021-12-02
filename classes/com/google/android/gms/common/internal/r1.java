// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.common.d;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.internal.common.a;

public abstract class r1 extends a implements p1
{
    public r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }
    
    public static p1 x2(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof p1) {
            return (p1)queryLocalInterface;
        }
        return new q1(binder);
    }
    
    @Override
    protected final boolean H(int a, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
        if (a != 1) {
            if (a != 2) {
                return false;
            }
            a = this.a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        else {
            final com.google.android.gms.dynamic.d zzb = this.zzb();
            parcel2.writeNoException();
            d.b(parcel2, (IInterface)zzb);
        }
        return true;
    }
}
