// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class f6 implements Runnable
{
    final /* synthetic */ boolean G;
    final /* synthetic */ e7 H;
    
    f6(final e7 h, final boolean g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final boolean l = this.H.a.l();
        final boolean k = this.H.a.k();
        this.H.a.h(this.G);
        if (k == this.G) {
            this.H.a.c().s().b("Default data collection state already set to", this.G);
        }
        if (this.H.a.l() == l || this.H.a.l() != this.H.a.k()) {
            this.H.a.c().u().c("Default data collection is different than actual status", this.G, l);
        }
        e7.d0(this.H);
    }
}
