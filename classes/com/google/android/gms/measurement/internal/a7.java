// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class a7 implements Runnable
{
    final /* synthetic */ h G;
    final /* synthetic */ int H;
    final /* synthetic */ long I;
    final /* synthetic */ boolean J;
    final /* synthetic */ e7 K;
    
    a7(final e7 k, final h g, final int h, final long i, final boolean j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        this.K.G(this.G);
        e7.b0(this.K, this.G, this.H, this.I, false, this.J);
    }
}
