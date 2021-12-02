// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class r5 implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ String H;
    final /* synthetic */ String I;
    final /* synthetic */ long J;
    final /* synthetic */ s5 K;
    
    r5(final s5 k, final String g, final String h, final String i, final long j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        final String g = this.G;
        if (g == null) {
            s5.A2(this.K).b0().I().D(this.H, null);
            return;
        }
        s5.A2(this.K).b0().I().D(this.H, new m7(this.I, g, this.J));
    }
}
