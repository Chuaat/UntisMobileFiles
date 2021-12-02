// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.x;

final class k2 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ Object L;
    final /* synthetic */ j3 M;
    
    k2(final j3 m, final boolean b, final int n, final String k, final Object l, final Object o, final Object o2) {
        this.M = m;
        this.K = k;
        this.L = l;
        super(m, false);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.M)).logHealthData(5, this.K, f.z2(this.L), f.z2((Object)null), f.z2((Object)null));
    }
}
