// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.bf;

final class l5 implements Runnable
{
    final /* synthetic */ u G;
    final /* synthetic */ na H;
    final /* synthetic */ s5 I;
    
    l5(final s5 i, final u g, final na h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        final u z2 = this.I.z2(this.G, this.H);
        bf.b();
        if (s5.A2(this.I).S().y(null, a3.x0)) {
            this.I.C2(z2, this.H);
            return;
        }
        s5.B2(this.I, z2, this.H);
    }
}
