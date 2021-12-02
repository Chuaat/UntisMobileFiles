// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class y1 extends x2
{
    final /* synthetic */ j3 K;
    
    y1(final j3 k) {
        this.K = k;
        super(k, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.K)).resetAnalyticsData(super.G);
    }
}
