// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class s1 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ String L;
    final /* synthetic */ b1 M;
    final /* synthetic */ j3 N;
    
    s1(final j3 n, final String k, final String l, final b1 m) {
        this.N = n;
        this.K = k;
        this.L = l;
        this.M = m;
        super(n, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.N)).getConditionalUserProperties(this.K, this.L, this.M);
    }
    
    @Override
    protected final void b() {
        this.M.G(null);
    }
}
