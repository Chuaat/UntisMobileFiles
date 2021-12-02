// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

final class e0 implements Runnable
{
    private final /* synthetic */ m G;
    private final /* synthetic */ d0 H;
    
    e0(final d0 h, final m g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.H.b) {
            if (this.H.c != null) {
                this.H.c.d(this.G.r());
            }
        }
    }
}
