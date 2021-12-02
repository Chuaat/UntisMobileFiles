// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class i0 extends f0
{
    private final /* synthetic */ Intent G;
    private final /* synthetic */ Activity H;
    private final /* synthetic */ int I;
    
    i0(final Intent g, final Activity h, final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public final void d() {
        final Intent g = this.G;
        if (g != null) {
            this.H.startActivityForResult(g, this.I);
        }
    }
}
