// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class n7 implements Runnable
{
    final /* synthetic */ Bundle G;
    final /* synthetic */ m7 H;
    final /* synthetic */ m7 I;
    final /* synthetic */ long J;
    final /* synthetic */ t7 K;
    
    n7(final t7 k, final Bundle g, final m7 h, final m7 i, final long j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        t7.u(this.K, this.G, this.H, this.I, this.J);
    }
}
