// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.base;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

final class n implements m
{
    private n() {
    }
    
    @Override
    public final ExecutorService a(final int n, final int n2) {
        return this.b(4, Executors.defaultThreadFactory(), n2);
    }
    
    @Override
    public final ExecutorService b(final int n, final ThreadFactory threadFactory, final int n2) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(n, n, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
        executor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(executor);
    }
    
    @Override
    public final ExecutorService c(final ThreadFactory threadFactory, final int n) {
        return this.b(1, threadFactory, n);
    }
}
