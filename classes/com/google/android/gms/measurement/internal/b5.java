// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class b5 implements Runnable
{
    final /* synthetic */ c G;
    final /* synthetic */ na H;
    final /* synthetic */ s5 I;
    
    b5(final s5 i, final c g, final na h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        s5.A2(this.I).a();
        if (this.G.I.M() == null) {
            s5.A2(this.I).p(this.G, this.H);
            return;
        }
        s5.A2(this.I).u(this.G, this.H);
    }
}
