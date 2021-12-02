// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.x;
import java.util.concurrent.Executors;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.atomic.AtomicInteger;
import f2.a;
import java.util.concurrent.ThreadFactory;

@a
public class c implements ThreadFactory
{
    private final String G;
    private final int H;
    private final AtomicInteger I;
    private final ThreadFactory J;
    
    @a
    public c(@RecentlyNonNull final String s) {
        this(s, 0);
    }
    
    private c(final String s, final int n) {
        this.I = new AtomicInteger();
        this.J = Executors.defaultThreadFactory();
        this.G = x.l(s, "Name must not be null");
        this.H = 0;
    }
    
    @RecentlyNonNull
    @Override
    public Thread newThread(@RecentlyNonNull final Runnable runnable) {
        final Thread thread = this.J.newThread(new d(runnable, 0));
        final String g = this.G;
        final int andIncrement = this.I.getAndIncrement();
        final StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 13);
        sb.append(g);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        thread.setName(sb.toString());
        return thread;
    }
}
