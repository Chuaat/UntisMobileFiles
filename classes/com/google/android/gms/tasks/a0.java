// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

final class a0 implements Runnable
{
    private final /* synthetic */ m G;
    private final /* synthetic */ z H;
    
    a0(final z h, final m g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.H.b) {
            if (this.H.c != null) {
                this.H.c.a(this.G);
            }
        }
    }
}
