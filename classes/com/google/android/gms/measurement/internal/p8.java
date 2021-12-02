// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class p8 implements Runnable
{
    final /* synthetic */ ComponentName G;
    final /* synthetic */ t8 H;
    
    p8(final t8 h, final ComponentName g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        u8.K(this.H.e, this.G);
    }
}
