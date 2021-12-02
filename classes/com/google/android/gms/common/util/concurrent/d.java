// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class d implements Runnable
{
    private final Runnable G;
    private final int H;
    
    public d(final Runnable g, final int n) {
        this.G = g;
        this.H = 0;
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(this.H);
        this.G.run();
    }
}
