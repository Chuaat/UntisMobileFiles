// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.x;

final class b0 implements Runnable
{
    private final /* synthetic */ m G;
    private final /* synthetic */ c0 H;
    
    b0(final c0 h, final m g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.H.b) {
            if (this.H.c != null) {
                this.H.c.c(x.k(this.G.q()));
            }
        }
    }
}
