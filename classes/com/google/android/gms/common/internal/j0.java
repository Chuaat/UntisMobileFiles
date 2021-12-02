// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.m;
import android.content.Intent;

final class j0 extends f0
{
    private final /* synthetic */ Intent G;
    private final /* synthetic */ m H;
    private final /* synthetic */ int I;
    
    j0(final Intent g, final m h, final int n) {
        this.G = g;
        this.H = h;
        this.I = 2;
    }
    
    public final void d() {
        final Intent g = this.G;
        if (g != null) {
            this.H.startActivityForResult(g, this.I);
        }
    }
}
