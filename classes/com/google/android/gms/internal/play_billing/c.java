// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import android.os.IInterface;
import android.os.IBinder;

public abstract class c extends f implements d
{
    public static d H(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof d) {
            return (d)queryLocalInterface;
        }
        return new b(binder);
    }
}
