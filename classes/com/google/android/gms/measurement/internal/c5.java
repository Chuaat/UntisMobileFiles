// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class c5 implements Runnable
{
    final /* synthetic */ c G;
    final /* synthetic */ s5 H;
    
    c5(final s5 h, final c g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        s5.A2(this.H).a();
        if (this.G.I.M() == null) {
            s5.A2(this.H).o(this.G);
            return;
        }
        s5.A2(this.H).t(this.G);
    }
}
