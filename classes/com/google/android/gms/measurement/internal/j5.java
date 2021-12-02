// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;

final class j5 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ s5 H;
    
    j5(final s5 h, final na g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        s5.A2(this.H).a();
        final z9 a2 = s5.A2(this.H);
        final na g = this.G;
        a2.b().e();
        a2.d();
        x.g(g.G);
        a2.Q(g);
    }
}
