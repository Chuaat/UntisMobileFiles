// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

final class x implements Runnable
{
    private final /* synthetic */ y G;
    
    x(final y g) {
        this.G = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.G.b) {
            if (this.G.c != null) {
                this.G.c.a();
            }
        }
    }
}
