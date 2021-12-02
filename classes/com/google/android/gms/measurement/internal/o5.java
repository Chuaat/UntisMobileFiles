// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class o5 implements Runnable
{
    final /* synthetic */ ca G;
    final /* synthetic */ na H;
    final /* synthetic */ s5 I;
    
    o5(final s5 i, final ca g, final na h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        s5.A2(this.I).a();
        if (this.G.M() == null) {
            s5.A2(this.I).q(this.G, this.H);
            return;
        }
        s5.A2(this.I).w(this.G, this.H);
    }
}
