// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class v1 extends x2
{
    final /* synthetic */ Boolean K;
    final /* synthetic */ j3 L;
    
    v1(final j3 l, final Boolean k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        if (this.K != null) {
            x.k(j3.A(this.L)).setMeasurementEnabled(this.K, super.G);
            return;
        }
        x.k(j3.A(this.L)).clearMeasurementEnabled(super.G);
    }
}
