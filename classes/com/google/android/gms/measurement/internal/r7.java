// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class r7 implements Runnable
{
    final /* synthetic */ m7 G;
    final /* synthetic */ long H;
    final /* synthetic */ t7 I;
    
    r7(final t7 i, final m7 g, final long h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        t7.v(this.I, this.G, false, this.H);
        final t7 i = this.I;
        i.e = null;
        i.a.J().r(null);
    }
}
