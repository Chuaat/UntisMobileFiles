// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class m implements Runnable
{
    final /* synthetic */ v5 G;
    final /* synthetic */ n H;
    
    m(final n h, final v5 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.G.L();
        if (b.a()) {
            this.G.b().w(this);
            return;
        }
        final boolean e = this.H.e();
        n.a(this.H, 0L);
        if (e) {
            this.H.c();
        }
    }
}
