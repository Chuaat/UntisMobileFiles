// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class k6 implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ String H;
    final /* synthetic */ Object I;
    final /* synthetic */ long J;
    final /* synthetic */ e7 K;
    
    k6(final e7 k, final String g, final String h, final Object i, final long j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        this.K.J(this.G, this.H, this.I, this.J);
    }
}
