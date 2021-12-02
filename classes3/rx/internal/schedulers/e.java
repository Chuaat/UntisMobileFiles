// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import rx.functions.o;
import rx.plugins.c;
import java.util.concurrent.ScheduledExecutorService;
import rx.internal.util.n;

enum e
{
    static final String G = "RxScheduledExecutorPool-";
    static final n H;
    
    static {
        H = new n("RxScheduledExecutorPool-");
    }
    
    public static ScheduledExecutorService b() {
        final o<? extends ScheduledExecutorService> j = c.j();
        if (j == null) {
            return d();
        }
        return (ScheduledExecutorService)j.call();
    }
    
    static ScheduledExecutorService d() {
        return Executors.newScheduledThreadPool(1, f());
    }
    
    static ThreadFactory f() {
        return e.H;
    }
}
