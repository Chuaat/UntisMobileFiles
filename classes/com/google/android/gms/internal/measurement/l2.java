// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class l2 extends x2
{
    final /* synthetic */ Bundle K;
    final /* synthetic */ b1 L;
    final /* synthetic */ j3 M;
    
    l2(final j3 m, final Bundle k, final b1 l) {
        this.M = m;
        this.K = k;
        this.L = l;
        super(m, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.M)).performAction(this.K, this.L, super.G);
    }
    
    @Override
    protected final void b() {
        this.L.G(null);
    }
}
