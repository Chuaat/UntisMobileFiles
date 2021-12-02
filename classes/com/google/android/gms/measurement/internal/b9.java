// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class b9 implements Runnable
{
    final /* synthetic */ long G;
    final /* synthetic */ j9 H;
    
    b9(final j9 h, final long g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        j9.o(this.H, this.G);
    }
}
