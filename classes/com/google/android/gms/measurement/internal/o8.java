// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class o8 implements Runnable
{
    final /* synthetic */ d3 G;
    final /* synthetic */ t8 H;
    
    o8(final t8 h, final d3 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.H) {
            t8.a(this.H, false);
            if (!this.H.e.w()) {
                this.H.e.a.c().s().a("Connected to service");
                this.H.e.u(this.G);
            }
        }
    }
}
