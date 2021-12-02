// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.internal.common.i;
import androidx.annotation.RecentlyNonNull;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

@f2.a
public class a implements Executor
{
    private final Handler G;
    
    @f2.a
    public a(@RecentlyNonNull final Looper looper) {
        this.G = new i(looper);
    }
    
    @Override
    public void execute(@RecentlyNonNull final Runnable runnable) {
        this.G.post(runnable);
    }
}
