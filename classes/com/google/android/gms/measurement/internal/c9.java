// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class c9 implements Runnable
{
    final /* synthetic */ long G;
    final /* synthetic */ j9 H;
    
    c9(final j9 h, final long g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        j9.n(this.H, this.G);
    }
}
