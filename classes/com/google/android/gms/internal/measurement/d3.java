// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.x;
import android.app.Activity;

final class d3 extends x2
{
    final /* synthetic */ Activity K;
    final /* synthetic */ i3 L;
    
    d3(final i3 l, final Activity k) {
        this.L = l;
        this.K = k;
        super(l.G, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L.G)).onActivityPaused(f.z2(this.K), super.H);
    }
}
