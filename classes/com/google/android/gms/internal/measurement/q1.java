// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class q1 extends x2
{
    final /* synthetic */ Bundle K;
    final /* synthetic */ j3 L;
    
    q1(final j3 l, final Bundle k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).setConditionalUserProperty(this.K, super.G);
    }
}
