// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.ads_identifier;

import android.os.IInterface;
import android.os.IBinder;

public abstract class f extends b implements e
{
    public static e H(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof e) {
            return (e)queryLocalInterface;
        }
        return new g(binder);
    }
}
