// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.x;
import android.app.Activity;
import android.os.Bundle;

final class a3 extends x2
{
    final /* synthetic */ Bundle K;
    final /* synthetic */ Activity L;
    final /* synthetic */ i3 M;
    
    a3(final i3 m, final Bundle k, final Activity l) {
        this.M = m;
        this.K = k;
        this.L = l;
        super(m.G, true);
    }
    
    @Override
    final void a() throws RemoteException {
        Bundle bundle2;
        if (this.K != null) {
            final Bundle bundle = bundle2 = new Bundle();
            if (this.K.containsKey("com.google.app_measurement.screen_service")) {
                final Object value = this.K.get("com.google.app_measurement.screen_service");
                bundle2 = bundle;
                if (value instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle)value);
                    bundle2 = bundle;
                }
            }
        }
        else {
            bundle2 = null;
        }
        x.k(j3.A(this.M.G)).onActivityCreated(f.z2(this.L), bundle2, super.H);
    }
}
