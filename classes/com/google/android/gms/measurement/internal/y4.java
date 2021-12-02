// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class y4 implements Runnable
{
    final /* synthetic */ c6 G;
    final /* synthetic */ z4 H;
    
    y4(final z4 h, final c6 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        z4.a(this.H, this.G);
        this.H.j(this.G.g);
    }
}
