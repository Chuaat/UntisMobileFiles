// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.x;
import java.util.concurrent.Executors;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import java.util.concurrent.ThreadFactory;

@a
public class b implements ThreadFactory
{
    private final String G;
    private final int H;
    private final ThreadFactory I;
    
    @a
    public b(@RecentlyNonNull final String s) {
        this(s, 0);
    }
    
    private b(final String s, final int n) {
        this.I = Executors.defaultThreadFactory();
        this.G = x.l(s, "Name must not be null");
        this.H = 0;
    }
    
    @RecentlyNonNull
    @Override
    public Thread newThread(@RecentlyNonNull final Runnable runnable) {
        final Thread thread = this.I.newThread(new d(runnable, 0));
        thread.setName(this.G);
        return thread;
    }
}
