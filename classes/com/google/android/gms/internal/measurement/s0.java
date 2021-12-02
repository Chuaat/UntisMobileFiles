// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.IBinder;

public abstract class s0 extends p0 implements t0
{
    public static t0 x2(final IBinder binder) {
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof t0) {
            return (t0)queryLocalInterface;
        }
        return new r0(binder);
    }
}
