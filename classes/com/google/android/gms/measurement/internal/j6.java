// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class j6 implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ String H;
    final /* synthetic */ long I;
    final /* synthetic */ Bundle J;
    final /* synthetic */ boolean K;
    final /* synthetic */ boolean L;
    final /* synthetic */ boolean M;
    final /* synthetic */ String N;
    final /* synthetic */ e7 O;
    
    j6(final e7 o, final String g, final String h, final long i, final Bundle j, final boolean k, final boolean l, final boolean m, final String n) {
        this.O = o;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    @Override
    public final void run() {
        this.O.s(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
