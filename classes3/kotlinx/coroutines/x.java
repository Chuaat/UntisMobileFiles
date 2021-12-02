// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.g;
import kotlin.ranges.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import n6.a;
import kotlin.text.s;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u0010\u0019J&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u000f\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001e\u0010\u0019J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u0016H\u0016R\u0016\u0010\u000e\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020$8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\bR\u0018\u0010-\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u001f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010/¨\u00062" }, d2 = { "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/v1;", "T", "Lkotlin/Function0;", "block", "S", "(Ln6/a;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutorService;", "Z", "W", "Ljava/util/concurrent/Executor;", "a0", "Ljava/lang/Class;", "fjpClass", "executor", "", "e0", "(Ljava/lang/Class;Ljava/util/concurrent/ExecutorService;)Z", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/j2;", "H", "h0", "()V", "", "timeout", "g0", "(J)V", "f0", "", "toString", "close", "M", "()Ljava/util/concurrent/Executor;", "", "J", "I", "requestedParallelism", "d0", "()I", "parallelism", "K", "usePrivatePool", "pool", "Ljava/util/concurrent/Executor;", "Ljava/lang/String;", "DEFAULT_PARALLELISM_PROPERTY_NAME", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class x extends v1
{
    private static final String I = "kotlinx.coroutines.default.parallelism";
    private static final int J;
    private static boolean K;
    @e
    public static final x L;
    private static volatile Executor pool;
    
    static {
        L = new x();
        String str;
        try {
            System.getProperty("kotlinx.coroutines.default.parallelism");
        }
        finally {
            str = null;
        }
        int intValue;
        if (str != null) {
            final Integer x0 = s.X0(str);
            if (x0 == null || x0 < 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            intValue = x0;
        }
        else {
            intValue = -1;
        }
        J = intValue;
    }
    
    private x() {
    }
    
    private final <T> T S(final n6.a<? extends T> a) {
        T t;
        try {
            a.invoke();
        }
        finally {
            t = null;
        }
        return t;
    }
    
    private final ExecutorService W() {
        return Executors.newFixedThreadPool(this.d0(), new ThreadFactory() {
            final /* synthetic */ AtomicInteger G = new AtomicInteger();
            
            @Override
            public final Thread newThread(final Runnable target) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CommonPool-worker-");
                sb.append(this.G.incrementAndGet());
                final Thread thread = new Thread(target, sb.toString());
                thread.setDaemon(true);
                return thread;
            }
        });
    }
    
    private final ExecutorService Z() {
        if (System.getSecurityManager() != null) {
            return this.W();
        }
        final ExecutorService executorService = null;
        Class<?> clazz;
        try {
            Class.forName("java.util.concurrent.ForkJoinPool");
        }
        finally {
            clazz = null;
        }
        if (clazz == null) {
            return this.W();
        }
        if (!x.K && x.J < 0) {
            ExecutorService executorService3 = null;
            try {
                Object invoke;
                if (!((invoke = clazz.getMethod("commonPool", (Class<?>[])new Class[0]).invoke(null, new Object[0])) instanceof ExecutorService)) {
                    invoke = null;
                }
                final ExecutorService executorService2 = (ExecutorService)invoke;
            }
            finally {
                executorService3 = null;
            }
            if (executorService3 != null) {
                if (!x.L.e0(clazz, executorService3)) {
                    executorService3 = null;
                }
                if (executorService3 != null) {
                    return executorService3;
                }
            }
        }
        ExecutorService executorService5 = null;
        try {
            Object instance;
            if (!((instance = clazz.getConstructor(Integer.TYPE).newInstance(x.L.d0())) instanceof ExecutorService)) {
                instance = null;
            }
            final ExecutorService executorService4 = (ExecutorService)instance;
        }
        finally {
            executorService5 = executorService;
        }
        if (executorService5 != null) {
            return executorService5;
        }
        return this.W();
    }
    
    private final Executor a0() {
        synchronized (this) {
            Executor pool = x.pool;
            if (pool == null) {
                pool = (x.pool = this.Z());
            }
            return pool;
        }
    }
    
    private final int d0() {
        Integer value = x.J;
        if (value.intValue() <= 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = o.n(Runtime.getRuntime().availableProcessors() - 1, 1);
        }
        return n;
    }
    
    @Override
    public void H(@e final g g, @e final Runnable runnable) {
        try {
            Executor executor = x.pool;
            if (executor == null) {
                executor = this.a0();
            }
            final w3 b = x3.b();
            Runnable c = null;
            Label_0041: {
                if (b != null) {
                    c = b.c(runnable);
                    if (c != null) {
                        break Label_0041;
                    }
                }
                c = runnable;
            }
            executor.execute(c);
        }
        catch (RejectedExecutionException ex) {
            final w3 b2 = x3.b();
            if (b2 != null) {
                b2.e();
            }
            y0.T.L0(runnable);
        }
    }
    
    @e
    @Override
    public Executor M() {
        Executor executor = x.pool;
        if (executor == null) {
            executor = this.a0();
        }
        return executor;
    }
    
    @Override
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
    
    public final boolean e0(@e final Class<?> clazz, @e final ExecutorService obj) {
        obj.submit(x$b.G);
        final Integer n = null;
        final boolean b = false;
        Integer n3 = null;
        try {
            Object invoke;
            if (!((invoke = clazz.getMethod("getPoolSize", (Class[])new Class[0]).invoke(obj, new Object[0])) instanceof Integer)) {
                invoke = null;
            }
            final Integer n2 = (Integer)invoke;
        }
        finally {
            n3 = n;
        }
        boolean b2 = b;
        if (n3 != null) {
            b2 = b;
            if (n3 >= 1) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void f0() {
        synchronized (this) {
            this.g0(0L);
            x.K = false;
            x.pool = null;
        }
    }
    
    public final void g0(final long n) {
        synchronized (this) {
            Executor pool;
            if (!((pool = x.pool) instanceof ExecutorService)) {
                pool = null;
            }
            final ExecutorService executorService = (ExecutorService)pool;
            if (executorService != null) {
                executorService.shutdown();
                if (n > 0L) {
                    executorService.awaitTermination(n, TimeUnit.MILLISECONDS);
                }
                final Iterator<Object> iterator = executorService.shutdownNow().iterator();
                while (iterator.hasNext()) {
                    y0.T.L0(iterator.next());
                }
            }
            x.pool = x$c.G;
        }
    }
    
    public final void h0() {
        synchronized (this) {
            this.g0(0L);
            x.K = true;
            x.pool = null;
        }
    }
    
    @e
    @Override
    public String toString() {
        return "CommonPool";
    }
}
