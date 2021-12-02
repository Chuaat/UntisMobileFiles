// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class x6 implements Runnable
{
    final /* synthetic */ Boolean G;
    final /* synthetic */ e7 H;
    
    x6(final e7 h, final Boolean g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        e7.c0(this.H, this.G, true);
    }
}
