// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class y8 implements Runnable
{
    final /* synthetic */ z9 G;
    final /* synthetic */ Runnable H;
    
    y8(final a9 a9, final z9 g, final Runnable h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        this.G.a();
        this.G.k0(this.H);
        this.G.x();
    }
}
