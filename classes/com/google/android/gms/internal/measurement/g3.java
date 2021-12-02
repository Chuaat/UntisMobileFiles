// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.x;
import android.app.Activity;

final class g3 extends x2
{
    final /* synthetic */ Activity K;
    final /* synthetic */ b1 L;
    final /* synthetic */ i3 M;
    
    g3(final i3 m, final Activity k, final b1 l) {
        this.M = m;
        this.K = k;
        this.L = l;
        super(m.G, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.M.G)).onActivitySaveInstanceState(f.z2(this.K), this.L, super.H);
    }
}
