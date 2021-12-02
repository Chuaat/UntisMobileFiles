// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.n;

final class i2 implements Runnable
{
    private final /* synthetic */ n G;
    private final /* synthetic */ h2 H;
    
    i2(final h2 h, final n g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.C2(this.G);
    }
}
