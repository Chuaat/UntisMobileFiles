// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class o7 implements Runnable
{
    final /* synthetic */ m7 G;
    final /* synthetic */ m7 H;
    final /* synthetic */ long I;
    final /* synthetic */ boolean J;
    final /* synthetic */ t7 K;
    
    o7(final t7 k, final m7 g, final m7 h, final long i, final boolean j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        t7.t(this.K, this.G, this.H, this.I, this.J, (Bundle)null);
    }
}
