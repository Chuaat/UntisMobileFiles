// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.i1;

final class k8 implements Runnable
{
    final /* synthetic */ i1 G;
    final /* synthetic */ String H;
    final /* synthetic */ String I;
    final /* synthetic */ boolean J;
    final /* synthetic */ AppMeasurementDynamiteService K;
    
    k8(final AppMeasurementDynamiteService k, final i1 g, final String h, final String i, final boolean j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        this.K.e.J().V(this.G, this.H, this.I, this.J);
    }
}
