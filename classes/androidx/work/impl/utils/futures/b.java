// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils.futures;

import androidx.annotation.t0;
import java.util.concurrent.Executor;

@t0({ t0.a.H })
enum b implements Executor
{
    G;
    
    @Override
    public void execute(final Runnable runnable) {
        runnable.run();
    }
    
    @Override
    public String toString() {
        return "DirectExecutor";
    }
}
