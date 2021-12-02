// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.l1;

final class la implements a6
{
    public final l1 a;
    final /* synthetic */ AppMeasurementDynamiteService b;
    
    la(final AppMeasurementDynamiteService b, final l1 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        try {
            this.a.V(s, s2, bundle, n);
        }
        catch (RemoteException ex) {
            final z4 e = this.b.e;
            if (e != null) {
                e.c().t().b("Event interceptor threw exception", ex);
            }
        }
    }
}
