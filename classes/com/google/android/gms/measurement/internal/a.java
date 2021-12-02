// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class a implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ long H;
    final /* synthetic */ d2 I;
    
    a(final d2 i, final String g, final long h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        d2.f(this.I, this.G, this.H);
    }
}
