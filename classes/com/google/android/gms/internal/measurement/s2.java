// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class s2 extends x2
{
    final /* synthetic */ y2 K;
    final /* synthetic */ j3 L;
    
    s2(final j3 l, final y2 k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).setEventInterceptor(this.K);
    }
}
