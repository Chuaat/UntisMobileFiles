// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class b2 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ j3 L;
    
    b2(final j3 l, final String k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).beginAdUnitExposure(this.K, super.H);
    }
}
