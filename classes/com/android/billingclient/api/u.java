// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

final class u implements ThreadFactory
{
    private final ThreadFactory G;
    private final AtomicInteger H;
    
    u(final e e) {
        this.G = Executors.defaultThreadFactory();
        this.H = new AtomicInteger(1);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.G.newThread(runnable);
        final int andIncrement = this.H.getAndIncrement();
        final StringBuilder sb = new StringBuilder(30);
        sb.append("PlayBillingLibrary-");
        sb.append(andIncrement);
        thread.setName(sb.toString());
        return thread;
    }
}
