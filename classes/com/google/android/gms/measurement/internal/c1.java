// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class c1 implements Runnable
{
    final /* synthetic */ long G;
    final /* synthetic */ d2 H;
    
    c1(final d2 h, final long g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        d2.h(this.H, this.G);
    }
}
