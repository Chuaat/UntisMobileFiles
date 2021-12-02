// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class r1 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ String L;
    final /* synthetic */ Bundle M;
    final /* synthetic */ j3 N;
    
    r1(final j3 n, final String k, final String l, final Bundle m) {
        this.N = n;
        this.K = k;
        this.L = l;
        this.M = m;
        super(n, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.N)).clearConditionalUserProperty(this.K, this.L, this.M);
    }
}
