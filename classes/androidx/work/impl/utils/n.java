// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.annotation.j0;
import androidx.annotation.t0;
import java.util.concurrent.Executor;

@t0({ t0.a.H })
public class n implements Executor
{
    @Override
    public void execute(@j0 final Runnable runnable) {
        runnable.run();
    }
}
