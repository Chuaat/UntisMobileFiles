// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class v2 extends x2
{
    final /* synthetic */ Long K;
    final /* synthetic */ String L;
    final /* synthetic */ String M;
    final /* synthetic */ Bundle N;
    final /* synthetic */ boolean O;
    final /* synthetic */ boolean P;
    final /* synthetic */ j3 Q;
    
    v2(final j3 q, final Long k, final String l, final String m, final Bundle n, final boolean o, final boolean p7) {
        this.Q = q;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p7;
        super(q, true);
    }
    
    @Override
    final void a() throws RemoteException {
        final Long k = this.K;
        long n;
        if (k == null) {
            n = super.G;
        }
        else {
            n = k;
        }
        x.k(j3.A(this.Q)).logEvent(this.L, this.M, this.N, this.O, this.P, n);
    }
}
