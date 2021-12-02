// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.x;

final class w2 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ String L;
    final /* synthetic */ Object M;
    final /* synthetic */ boolean N;
    final /* synthetic */ j3 O;
    
    w2(final j3 o, final String k, final String l, final Object m, final boolean n) {
        this.O = o;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        super(o, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.O)).setUserProperty(this.K, this.L, f.z2(this.M), this.N, super.G);
    }
}
