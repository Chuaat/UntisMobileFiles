// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class e9 implements Runnable
{
    final long G;
    final long H;
    final /* synthetic */ f9 I;
    
    e9(final f9 i, final long g, final long h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        this.I.b.a.b().w(new d9(this));
    }
}
