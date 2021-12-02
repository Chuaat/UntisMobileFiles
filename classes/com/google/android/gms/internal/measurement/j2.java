// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class j2 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ String L;
    final /* synthetic */ boolean M;
    final /* synthetic */ b1 N;
    final /* synthetic */ j3 O;
    
    j2(final j3 o, final String k, final String l, final boolean m, final b1 n) {
        this.O = o;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        super(o, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.O)).getUserProperties(this.K, this.L, this.M, this.N);
    }
    
    @Override
    protected final void b() {
        this.N.G(null);
    }
}
