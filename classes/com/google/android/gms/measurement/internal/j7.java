// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.i1;

final class j7 implements Runnable
{
    final /* synthetic */ i1 G;
    final /* synthetic */ u H;
    final /* synthetic */ String I;
    final /* synthetic */ AppMeasurementDynamiteService J;
    
    j7(final AppMeasurementDynamiteService j, final i1 g, final u h, final String i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final void run() {
        this.J.e.J().m(this.G, this.H, this.I);
    }
}
