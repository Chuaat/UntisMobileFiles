// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class n2 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ b1 L;
    final /* synthetic */ j3 M;
    
    n2(final j3 m, final String k, final b1 l) {
        this.M = m;
        this.K = k;
        this.L = l;
        super(m, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.M)).getMaxUserProperties(this.K, this.L);
    }
    
    @Override
    protected final void b() {
        this.L.G(null);
    }
}
