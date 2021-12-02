// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.x;
import android.app.Activity;

final class u1 extends x2
{
    final /* synthetic */ Activity K;
    final /* synthetic */ String L;
    final /* synthetic */ String M;
    final /* synthetic */ j3 N;
    
    u1(final j3 n, final Activity k, final String l, final String m) {
        this.N = n;
        this.K = k;
        this.L = l;
        this.M = m;
        super(n, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.N)).setCurrentScreen(f.z2(this.K), this.L, this.M, super.G);
    }
}
