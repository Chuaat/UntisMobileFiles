// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class v9 implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ String H;
    final /* synthetic */ Bundle I;
    final /* synthetic */ w9 J;
    
    v9(final w9 j, final String g, final String s, final Bundle i) {
        this.J = j;
        this.G = g;
        this.H = "_err";
        this.I = i;
    }
    
    @Override
    public final void run() {
        this.J.a.g(x.k(this.J.a.g0().w0(this.G, this.H, this.I, "auto", this.J.a.F().a(), false, true)), this.G);
    }
}
