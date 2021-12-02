// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public final class p
{
    static final String a = "rx2.purge-enabled";
    public static final boolean b;
    static final String c = "rx2.purge-period-seconds";
    public static final int d;
    static final AtomicReference<ScheduledExecutorService> e;
    static final Map<ScheduledThreadPoolExecutor, Object> f;
    
    static {
        e = new AtomicReference<ScheduledExecutorService>();
        f = new ConcurrentHashMap<ScheduledThreadPoolExecutor, Object>();
        final Properties properties = System.getProperties();
        final a a = new a();
        a.a(properties);
        b = a.a;
        d = a.b;
        c();
    }
    
    private p() {
        throw new IllegalStateException("No instances!");
    }
    
    public static ScheduledExecutorService a(final ThreadFactory threadFactory) {
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        d(p.b, scheduledThreadPool);
        return scheduledThreadPool;
    }
    
    public static void b() {
        final ScheduledExecutorService scheduledExecutorService = p.e.getAndSet(null);
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        p.f.clear();
    }
    
    public static void c() {
        e(p.b);
    }
    
    static void d(final boolean b, final ScheduledExecutorService scheduledExecutorService) {
        if (b && scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
            p.f.put((ScheduledThreadPoolExecutor)scheduledExecutorService, scheduledExecutorService);
        }
    }
    
    static void e(final boolean b) {
        if (!b) {
            return;
        }
        while (true) {
            final AtomicReference<ScheduledExecutorService> e = p.e;
            final ScheduledExecutorService expectedValue = e.get();
            if (expectedValue != null) {
                return;
            }
            final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, new k("RxSchedulerPurge"));
            if (e.compareAndSet(expectedValue, scheduledThreadPool)) {
                final b b2 = new b();
                final int d = p.d;
                scheduledThreadPool.scheduleAtFixedRate(b2, d, d, TimeUnit.SECONDS);
                return;
            }
            scheduledThreadPool.shutdownNow();
        }
    }
    
    static final class a
    {
        boolean a;
        int b;
        
        void a(final Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            }
            else {
                this.a = true;
            }
            while (true) {
                if (!this.a || !properties.containsKey("rx2.purge-period-seconds")) {
                    break Label_0062;
                }
                try {
                    this.b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                    this.b = 1;
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    static final class b implements Runnable
    {
        @Override
        public void run() {
            for (final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList<ScheduledThreadPoolExecutor>(p.f.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    p.f.remove(scheduledThreadPoolExecutor);
                }
                else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
