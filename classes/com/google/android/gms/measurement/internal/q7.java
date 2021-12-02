// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class q7 implements Runnable
{
    final /* synthetic */ long G;
    final /* synthetic */ t7 H;
    
    q7(final t7 h, final long g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.a.v().k(this.G);
        this.H.e = null;
    }
}
