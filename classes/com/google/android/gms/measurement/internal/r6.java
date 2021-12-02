// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class r6 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ String H;
    final /* synthetic */ String I;
    final /* synthetic */ boolean J;
    final /* synthetic */ e7 K;
    
    r6(final e7 k, final AtomicReference g, final String s, final String h, final String i, final boolean j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        this.K.a.J().W(this.G, null, this.H, this.I, this.J);
    }
}
