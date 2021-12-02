// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.async;

import android.os.Process;
import java.util.concurrent.Callable;

public class a<T> implements Callable<T>
{
    private final Callable<T> G;
    
    a(final Callable<T> g) {
        this.G = g;
    }
    
    @Override
    public T call() throws Exception {
        Process.setThreadPriority(10);
        return this.G.call();
    }
}
