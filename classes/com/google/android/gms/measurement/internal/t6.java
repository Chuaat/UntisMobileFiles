// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class t6 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ e7 H;
    
    t6(final e7 h, final AtomicReference g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final AtomicReference g = this.G;
        // monitorenter(g)
        try {
            this.G.set(this.H.a.w().u(this.H.a.y().p(), a3.M));
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
