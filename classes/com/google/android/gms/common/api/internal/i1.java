// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

final class i1 implements Runnable
{
    private final /* synthetic */ int G;
    private final /* synthetic */ i.a H;
    
    i1(final i.a h, final int g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.H.d(this.G);
    }
}
