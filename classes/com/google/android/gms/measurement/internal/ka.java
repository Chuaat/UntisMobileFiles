// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.i1;

final class ka implements Runnable
{
    final /* synthetic */ i1 G;
    final /* synthetic */ AppMeasurementDynamiteService H;
    
    ka(final AppMeasurementDynamiteService h, final i1 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.e.M().z(this.G, this.H.e.k());
    }
}
