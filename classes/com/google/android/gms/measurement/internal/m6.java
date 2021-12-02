// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class m6 implements Runnable
{
    final /* synthetic */ long G;
    final /* synthetic */ e7 H;
    
    m6(final e7 h, final long g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.v(this.G, true);
        this.H.a.J().R(new AtomicReference<String>());
    }
}
