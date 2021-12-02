// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import java.util.concurrent.Executor;

final class k0 implements Executor
{
    @Override
    public final void execute(@j0 final Runnable runnable) {
        runnable.run();
    }
}
