// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.fragment.app.Fragment;
import android.content.Intent;

final class h0 extends f0
{
    private final /* synthetic */ Intent G;
    private final /* synthetic */ Fragment H;
    private final /* synthetic */ int I;
    
    h0(final Intent g, final Fragment h, final int i) {
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
