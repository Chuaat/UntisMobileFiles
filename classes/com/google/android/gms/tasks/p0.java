// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class p0 implements Runnable
{
    private final /* synthetic */ l0 G;
    private final /* synthetic */ Callable H;
    
    p0(final l0 g, final Callable h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        try {
            this.G.z(this.H.call());
        }
        catch (Exception ex) {
            this.G.y(ex);
        }
        finally {
            final Throwable cause;
            this.G.y(new RuntimeException(cause));
        }
    }
}
