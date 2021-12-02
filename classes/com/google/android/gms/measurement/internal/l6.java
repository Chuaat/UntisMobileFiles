// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class l6 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ boolean H;
    final /* synthetic */ e7 I;
    
    l6(final e7 i, final AtomicReference g, final boolean h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        this.I.a.J().U(this.G, this.H);
    }
}
