// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class h6 implements Runnable
{
    final /* synthetic */ long G;
    final /* synthetic */ e7 H;
    
    h6(final e7 h, final long g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.a.C().k.b(this.G);
        this.H.a.c().n().b("Session timeout duration set", this.G);
    }
}
