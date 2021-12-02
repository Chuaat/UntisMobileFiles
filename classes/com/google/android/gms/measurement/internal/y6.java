// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class y6 implements Runnable
{
    final /* synthetic */ h G;
    final /* synthetic */ long H;
    final /* synthetic */ int I;
    final /* synthetic */ long J;
    final /* synthetic */ boolean K;
    final /* synthetic */ e7 L;
    
    y6(final e7 l, final h g, final long h, final int i, final long j, final boolean k) {
        this.L = l;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    public final void run() {
        this.L.G(this.G);
        this.L.v(this.H, false);
        e7.b0(this.L, this.G, this.I, this.J, true, this.K);
    }
}
