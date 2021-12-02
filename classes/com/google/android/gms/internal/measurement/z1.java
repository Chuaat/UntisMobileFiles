// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class z1 extends x2
{
    final /* synthetic */ long K;
    final /* synthetic */ j3 L;
    
    z1(final j3 l, final long k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).setSessionTimeoutDuration(this.K);
    }
}
