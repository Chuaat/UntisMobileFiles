// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class p2 extends x2
{
    final /* synthetic */ b1 K;
    final /* synthetic */ int L;
    final /* synthetic */ j3 M;
    
    p2(final j3 m, final b1 k, final int l) {
        this.M = m;
        this.K = k;
        this.L = l;
        super(m, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.M)).getTestFlag(this.K, this.L);
    }
    
    @Override
    protected final void b() {
        this.K.G(null);
    }
}
