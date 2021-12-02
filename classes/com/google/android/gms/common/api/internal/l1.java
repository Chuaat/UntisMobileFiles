// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.c;

final class l1 implements Runnable
{
    private final /* synthetic */ c G;
    private final /* synthetic */ i.a H;
    
    l1(final i.a h, final c g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.onConnectionFailed(this.G);
    }
}
