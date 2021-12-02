// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.Locale;
import com.google.firebase.crashlytics.internal.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public final class u
{
    private static final long a = 2L;
    
    private u() {
    }
    
    private static void a(final String s, final ExecutorService executorService) {
        b(s, executorService, 2L, TimeUnit.SECONDS);
    }
    
    private static void b(final String str, final ExecutorService executorService, final long n, final TimeUnit timeUnit) {
        final Runtime runtime = Runtime.getRuntime();
        final c target = new c() {
            public void a() {
                try {
                    final f f = com.google.firebase.crashlytics.internal.f.f();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Executing shutdown hook for ");
                    sb.append(str);
                    f.b(sb.toString());
                    executorService.shutdown();
                    if (!executorService.awaitTermination(n, timeUnit)) {
                        final f f2 = com.google.firebase.crashlytics.internal.f.f();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        f2.b(sb2.toString());
                        executorService.shutdownNow();
                    }
                }
                catch (InterruptedException ex) {
                    f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        };
        final StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(target, sb.toString()));
    }
    
    public static ExecutorService c(final String s) {
        final ExecutorService f = f(e(s), new ThreadPoolExecutor.DiscardPolicy());
        a(s, f);
        return f;
    }
    
    public static ScheduledExecutorService d(final String s) {
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(e(s));
        a(s, singleThreadScheduledExecutor);
        return singleThreadScheduledExecutor;
    }
    
    public static ThreadFactory e(final String s) {
        return new ThreadFactory() {
            final /* synthetic */ AtomicLong H = new AtomicLong(1L);
            
            @Override
            public Thread newThread(final Runnable runnable) {
                final Thread thread = Executors.defaultThreadFactory().newThread(new c() {
                    public void a() {
                        runnable.run();
                    }
                });
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(this.H.getAndIncrement());
                thread.setName(sb.toString());
                return thread;
            }
        };
    }
    
    private static ExecutorService f(final ThreadFactory threadFactory, final RejectedExecutionHandler handler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory, handler));
    }
}
