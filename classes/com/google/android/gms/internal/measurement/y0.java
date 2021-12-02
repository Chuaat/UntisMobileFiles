// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

final class y0 implements w0
{
    private y0() {
    }
    
    public static final ExecutorService a(final int n, final ThreadFactory threadFactory, final int n2) {
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
        executor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(executor);
    }
    
    @Override
    public final ExecutorService d(final int n) {
        return a(1, Executors.defaultThreadFactory(), 1);
    }
    
    @Override
    public final ExecutorService e(final ThreadFactory threadFactory, final int n) {
        return a(1, threadFactory, 1);
    }
}
