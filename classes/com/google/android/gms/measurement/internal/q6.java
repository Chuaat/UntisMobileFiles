// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class q6 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ String H;
    final /* synthetic */ String I;
    final /* synthetic */ e7 J;
    
    q6(final e7 j, final AtomicReference g, final String s, final String h, final String i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final void run() {
        this.J.a.J().T(this.G, null, this.H, this.I);
    }
}
