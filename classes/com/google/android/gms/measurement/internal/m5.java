// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class m5 implements Runnable
{
    final /* synthetic */ u G;
    final /* synthetic */ String H;
    final /* synthetic */ s5 I;
    
    m5(final s5 i, final u g, final String h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        s5.A2(this.I).a();
        s5.A2(this.I).g(this.G, this.H);
    }
}
