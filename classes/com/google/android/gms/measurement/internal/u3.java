// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class u3 implements Runnable
{
    final /* synthetic */ boolean G;
    final /* synthetic */ v3 H;
    
    u3(final v3 h, final boolean g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        v3.a(this.H).k(this.G);
    }
}
