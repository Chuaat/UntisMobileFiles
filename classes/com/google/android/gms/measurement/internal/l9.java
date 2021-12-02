// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class l9 implements Runnable
{
    final /* synthetic */ la G;
    final /* synthetic */ AppMeasurementDynamiteService H;
    
    l9(final AppMeasurementDynamiteService h, final la g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.e.G().D(this.G);
    }
}
