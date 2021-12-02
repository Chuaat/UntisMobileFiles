// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import h2.a;
import com.google.android.gms.common.internal.x;

final class j8 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ boolean H;
    final /* synthetic */ c I;
    final /* synthetic */ c J;
    final /* synthetic */ u8 K;
    
    j8(final u8 k, final boolean b, final na g, final boolean h, final c i, final c j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        final d3 e = u8.E(this.K);
        if (e == null) {
            this.K.a.c().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        x.k(this.G);
        final u8 k = this.K;
        a i;
        if (this.H) {
            i = null;
        }
        else {
            i = this.I;
        }
        k.o(e, i, this.G);
        u8.M(this.K);
    }
}
