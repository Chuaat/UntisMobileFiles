// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import h2.a;
import com.google.android.gms.common.internal.x;

final class v7 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ boolean H;
    final /* synthetic */ ca I;
    final /* synthetic */ u8 J;
    
    v7(final u8 j, final na g, final boolean h, final ca i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final void run() {
        final d3 e = u8.E(this.J);
        if (e == null) {
            this.J.a.c().o().a("Discarding data. Failed to set user property");
            return;
        }
        x.k(this.G);
        final u8 j = this.J;
        a i;
        if (this.H) {
            i = null;
        }
        else {
            i = this.I;
        }
        j.o(e, i, this.G);
        u8.M(this.J);
    }
}
