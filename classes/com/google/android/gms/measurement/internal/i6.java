// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.i1;

final class i6 implements Runnable
{
    final /* synthetic */ i1 G;
    final /* synthetic */ AppMeasurementDynamiteService H;
    
    i6(final AppMeasurementDynamiteService h, final i1 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.e.J().Q(this.G);
    }
}
