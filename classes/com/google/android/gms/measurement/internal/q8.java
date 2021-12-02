// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class q8 implements Runnable
{
    final /* synthetic */ d3 G;
    final /* synthetic */ t8 H;
    
    q8(final t8 h, final d3 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.H) {
            t8.a(this.H, false);
            if (!this.H.e.w()) {
                this.H.e.a.c().n().a("Connected to remote service");
                this.H.e.u(this.G);
            }
        }
    }
}
