// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import rx.subscriptions.b;
import rx.internal.util.q;
import java.util.concurrent.Future;
import rx.subscriptions.f;
import rx.functions.a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import rx.internal.util.n;
import java.util.Iterator;
import rx.exceptions.c;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import rx.internal.util.l;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ConcurrentHashMap;
import rx.o;
import rx.j;

public class h extends a implements o
{
    private static final String I = "rx.scheduler.jdk6.purge-frequency-millis";
    private static final String J = "rx.scheduler.jdk6.purge-force";
    private static final String K = "RxSchedulerPurge-";
    private static final boolean L;
    public static final int M;
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> N;
    private static final AtomicReference<ScheduledExecutorService> O;
    private static volatile Object P;
    private static final Object Q;
    private final ScheduledExecutorService G;
    volatile boolean H;
    
    static {
        Q = new Object();
        N = new ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor>();
        O = new AtomicReference<ScheduledExecutorService>();
        M = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000);
        final boolean boolean1 = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        final int a = l.a();
        L = (!boolean1 && (a == 0 || a >= 21));
    }
    
    public h(final ThreadFactory threadFactory) {
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!x(scheduledThreadPool) && scheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            r((ScheduledThreadPoolExecutor)scheduledThreadPool);
        }
        this.G = scheduledThreadPool;
    }
    
    public static void m(final ScheduledExecutorService key) {
        h.N.remove(key);
    }
    
    static Method n(final ScheduledExecutorService scheduledExecutorService) {
        for (final Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }
    
    static void q() {
        try {
            final Iterator<ScheduledThreadPoolExecutor> iterator = h.N.keySet().iterator();
            while (iterator.hasNext()) {
                final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = iterator.next();
                if (!scheduledThreadPoolExecutor.isShutdown()) {
                    scheduledThreadPoolExecutor.purge();
                }
                else {
                    iterator.remove();
                }
            }
        }
        finally {
            final Throwable t;
            c.e(t);
            rx.plugins.c.I(t);
        }
    }
    
    public static void r(final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            final AtomicReference<ScheduledExecutorService> o = h.O;
            if (o.get() != null) {
                break;
            }
            final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, new n("RxSchedulerPurge-"));
            if (o.compareAndSet(null, scheduledThreadPool)) {
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        h.q();
                    }
                };
                final int m = h.M;
                scheduledThreadPool.scheduleAtFixedRate(runnable, m, m, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledThreadPool.shutdownNow();
        }
        h.N.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }
    
    public static boolean x(final ScheduledExecutorService obj) {
        if (h.L) {
            Method method;
            if (obj instanceof ScheduledThreadPoolExecutor) {
                final Object p = h.P;
                Object q = h.Q;
                if (p == q) {
                    return false;
                }
                if (p == null) {
                    method = n((ScheduledExecutorService)obj);
                    if (method != null) {
                        q = method;
                    }
                    h.P = q;
                }
                else {
                    method = (Method)p;
                }
            }
            else {
                method = n((ScheduledExecutorService)obj);
            }
            if (method != null) {
                try {
                    method.invoke(obj, Boolean.TRUE);
                    return true;
                }
                catch (IllegalArgumentException obj) {}
                catch (IllegalAccessException obj) {}
                catch (InvocationTargetException ex) {}
                rx.plugins.c.I(obj);
            }
        }
        return false;
    }
    
    @Override
    public o c(final rx.functions.a a) {
        return this.d(a, 0L, null);
    }
    
    @Override
    public o d(final rx.functions.a a, final long n, final TimeUnit timeUnit) {
        if (this.H) {
            return f.e();
        }
        return this.t(a, n, timeUnit);
    }
    
    @Override
    public boolean g() {
        return this.H;
    }
    
    @Override
    public void i() {
        this.H = true;
        this.G.shutdownNow();
        m(this.G);
    }
    
    public rx.internal.schedulers.j t(final rx.functions.a a, final long n, final TimeUnit timeUnit) {
        final rx.internal.schedulers.j j = new rx.internal.schedulers.j(rx.plugins.c.P(a));
        Future<?> future;
        if (n <= 0L) {
            future = this.G.submit(j);
        }
        else {
            future = this.G.schedule(j, n, timeUnit);
        }
        j.a(future);
        return j;
    }
    
    public rx.internal.schedulers.j v(final rx.functions.a a, final long n, final TimeUnit timeUnit, final q q) {
        final rx.internal.schedulers.j j = new rx.internal.schedulers.j(rx.plugins.c.P(a), q);
        q.a(j);
        Future<?> future;
        if (n <= 0L) {
            future = this.G.submit(j);
        }
        else {
            future = this.G.schedule(j, n, timeUnit);
        }
        j.a(future);
        return j;
    }
    
    public rx.internal.schedulers.j w(final rx.functions.a a, final long n, final TimeUnit timeUnit, final b b) {
        final rx.internal.schedulers.j j = new rx.internal.schedulers.j(rx.plugins.c.P(a), b);
        b.a(j);
        Future<?> future;
        if (n <= 0L) {
            future = this.G.submit(j);
        }
        else {
            future = this.G.schedule(j, n, timeUnit);
        }
        j.a(future);
        return j;
    }
}
