// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ComponentName;

final class r8 implements Runnable
{
    final /* synthetic */ t8 G;
    
    r8(final t8 g) {
        this.G = g;
    }
    
    @Override
    public final void run() {
        final u8 e = this.G.e;
        final Context x = e.a.X();
        this.G.e.a.L();
        u8.K(e, new ComponentName(x, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
