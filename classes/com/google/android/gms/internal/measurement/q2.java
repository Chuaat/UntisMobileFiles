// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class q2 extends x2
{
    final /* synthetic */ boolean K;
    final /* synthetic */ j3 L;
    
    q2(final j3 l, final boolean k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).setDataCollectionEnabled(this.K);
    }
}
