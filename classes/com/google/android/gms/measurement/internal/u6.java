// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class u6 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ e7 H;
    
    u6(final e7 h, final AtomicReference g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final AtomicReference g = this.G;
        // monitorenter(g)
        try {
            this.G.set(this.H.a.w().o(this.H.a.y().p(), a3.N));
            return;
        }
        finally {
            this.G.notify();
        }
        try {}
        finally {
        }
        // monitorexit(g)
    }
}
