// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;

public final class d implements k
{
    private static final ScheduledExecutorService[] H;
    private static final ScheduledExecutorService I;
    public static final d J;
    private static int K;
    private final AtomicReference<ScheduledExecutorService[]> G;
    
    static {
        H = new ScheduledExecutorService[0];
        (I = Executors.newScheduledThreadPool(0)).shutdown();
        J = new d();
    }
    
    private d() {
        this.G = new AtomicReference<ScheduledExecutorService[]>(d.H);
        this.start();
    }
    
    public static ScheduledExecutorService a() {
        final ScheduledExecutorService[] array = d.J.G.get();
        if (array == d.H) {
            return d.I;
        }
        int k;
        if ((k = d.K + 1) >= array.length) {
            k = 0;
        }
        d.K = k;
        return array[k];
    }
    
    @Override
    public void shutdown() {
        ScheduledExecutorService[] expectedValue;
        ScheduledExecutorService[] h;
        do {
            expectedValue = this.G.get();
            h = d.H;
            if (expectedValue == h) {
                return;
            }
        } while (!this.G.compareAndSet(expectedValue, h));
        for (final ScheduledExecutorService scheduledExecutorService : expectedValue) {
            rx.internal.schedulers.h.m(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }
    
    @Override
    public void start() {
        int availableProcessors;
        final int n = availableProcessors = Runtime.getRuntime().availableProcessors();
        if (n > 4) {
            availableProcessors = n / 2;
        }
        int n2;
        if ((n2 = availableProcessors) > 8) {
            n2 = 8;
        }
        final ScheduledExecutorService[] newValue = new ScheduledExecutorService[n2];
        final int n3 = 0;
        final int n4 = 0;
        for (int i = 0; i < n2; ++i) {
            newValue[i] = e.b();
        }
        int j = n3;
        if (this.G.compareAndSet(d.H, newValue)) {
            for (int k = n4; k < n2; ++k) {
                final ScheduledExecutorService scheduledExecutorService = newValue[k];
                if (!h.x(scheduledExecutorService) && scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                    h.r((ScheduledThreadPoolExecutor)scheduledExecutorService);
                }
            }
        }
        else {
            while (j < n2) {
                newValue[j].shutdownNow();
                ++j;
            }
        }
    }
}
