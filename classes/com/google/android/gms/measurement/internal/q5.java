// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class q5 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ s5 H;
    
    q5(final s5 h, final na g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        s5.A2(this.H).a();
        s5.A2(this.H).m(this.G);
    }
}
