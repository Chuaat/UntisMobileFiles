// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.cloudmessaging;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

final class c implements b
{
    private c() {
    }
    
    @Override
    public final ScheduledExecutorService a(final int n, final ThreadFactory threadFactory, final int n2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
    
    @Override
    public final ExecutorService b(final ThreadFactory threadFactory, final int n) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
        executor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(executor);
    }
}
