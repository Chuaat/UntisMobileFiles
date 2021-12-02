// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class t1 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ j3 L;
    
    t1(final j3 l, final String k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).setUserId(this.K, super.G);
    }
}
