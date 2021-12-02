// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class v6 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ e7 H;
    
    v6(final e7 h, final AtomicReference g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final AtomicReference g = this.G;
        // monitorenter(g)
        try {
            this.G.set(this.H.a.w().l(this.H.a.y().p(), a3.O));
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
