// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.async;

import android.os.Process;

public class b implements Runnable
{
    private final Runnable G;
    
    b(final Runnable g) {
        this.G = g;
    }
    
    @Override
    public void run() {
        Process.setThreadPriority(10);
        this.G.run();
    }
}
