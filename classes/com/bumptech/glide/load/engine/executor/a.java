// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;
import android.os.StrictMode;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.Process;
import androidx.annotation.b0;
import java.util.concurrent.PriorityBlockingQueue;
import android.text.TextUtils;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.Collection;
import androidx.annotation.j0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import androidx.annotation.b1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public final class a implements ExecutorService
{
    private static final String H = "source";
    private static final String I = "disk-cache";
    private static final int J = 1;
    private static final String K = "GlideExecutor";
    private static final String L = "source-unlimited";
    private static final String M = "animation";
    private static final long N;
    private static final int O = 4;
    private static volatile int P;
    private final ExecutorService G;
    
    static {
        N = TimeUnit.SECONDS.toMillis(10L);
    }
    
    @b1
    a(final ExecutorService g) {
        this.G = g;
    }
    
    public static int a() {
        if (a.P == 0) {
            a.P = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
        }
        return a.P;
    }
    
    public static a b() {
        int n;
        if (a() >= 4) {
            n = 2;
        }
        else {
            n = 1;
        }
        return new a(true).c(n).b("animation");
    }
    
    public static a c() {
        return b().a();
    }
    
    @Deprecated
    public static a d(final int n, final c c) {
        return b().c(n).e(c).a();
    }
    
    public static a e() {
        return new a(true).c(1).b("disk-cache");
    }
    
    public static a f() {
        return e().a();
    }
    
    @Deprecated
    public static a g(final int n, final String s, final c c) {
        return e().c(n).b(s).e(c).a();
    }
    
    @Deprecated
    public static a h(final c c) {
        return e().e(c).a();
    }
    
    public static a i() {
        return new a(false).c(a()).b("source");
    }
    
    public static a j() {
        return i().a();
    }
    
    @Deprecated
    public static a k(final int n, final String s, final c c) {
        return i().c(n).b(s).e(c).a();
    }
    
    @Deprecated
    public static a l(final c c) {
        return i().e(c).a();
    }
    
    public static a m() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, a.N, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), new b("source-unlimited", c.d, false)));
    }
    
    @Override
    public boolean awaitTermination(final long n, @j0 final TimeUnit timeUnit) throws InterruptedException {
        return this.G.awaitTermination(n, timeUnit);
    }
    
    @Override
    public void execute(@j0 final Runnable runnable) {
        this.G.execute(runnable);
    }
    
    @j0
    @Override
    public <T> List<Future<T>> invokeAll(@j0 final Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.G.invokeAll(collection);
    }
    
    @j0
    @Override
    public <T> List<Future<T>> invokeAll(@j0 final Collection<? extends Callable<T>> collection, final long n, @j0 final TimeUnit timeUnit) throws InterruptedException {
        return this.G.invokeAll(collection, n, timeUnit);
    }
    
    @j0
    @Override
    public <T> T invokeAny(@j0 final Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.G.invokeAny(collection);
    }
    
    @Override
    public <T> T invokeAny(@j0 final Collection<? extends Callable<T>> collection, final long n, @j0 final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.G.invokeAny(collection, n, timeUnit);
    }
    
    @Override
    public boolean isShutdown() {
        return this.G.isShutdown();
    }
    
    @Override
    public boolean isTerminated() {
        return this.G.isTerminated();
    }
    
    @Override
    public void shutdown() {
        this.G.shutdown();
    }
    
    @j0
    @Override
    public List<Runnable> shutdownNow() {
        return this.G.shutdownNow();
    }
    
    @j0
    @Override
    public Future<?> submit(@j0 final Runnable runnable) {
        return this.G.submit(runnable);
    }
    
    @j0
    @Override
    public <T> Future<T> submit(@j0 final Runnable runnable, final T t) {
        return this.G.submit(runnable, t);
    }
    
    @Override
    public <T> Future<T> submit(@j0 final Callable<T> callable) {
        return this.G.submit(callable);
    }
    
    @Override
    public String toString() {
        return this.G.toString();
    }
    
    public static final class a
    {
        public static final long g = 0L;
        private final boolean a;
        private int b;
        private int c;
        @j0
        private c d;
        private String e;
        private long f;
        
        a(final boolean a) {
            this.d = c.d;
            this.a = a;
        }
        
        public com.bumptech.glide.load.engine.executor.a a() {
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>(), new b(this.e, this.d, this.a));
                if (this.f != 0L) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new com.bumptech.glide.load.engine.executor.a(threadPoolExecutor);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Name must be non-null and non-empty, but given: ");
            sb.append(this.e);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public a b(final String e) {
            this.e = e;
            return this;
        }
        
        public a c(@b0(from = 1L) final int n) {
            this.b = n;
            this.c = n;
            return this;
        }
        
        public a d(final long f) {
            this.f = f;
            return this;
        }
        
        public a e(@j0 final c d) {
            this.d = d;
            return this;
        }
    }
    
    private static final class b implements ThreadFactory
    {
        private static final int K = 9;
        private final String G;
        final c H;
        final boolean I;
        private int J;
        
        b(final String g, final c h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public Thread newThread(@j0 final Runnable runnable) {
            synchronized (this) {
                final StringBuilder sb = new StringBuilder();
                sb.append("glide-");
                sb.append(this.G);
                sb.append("-thread-");
                sb.append(this.J);
                final Thread thread = new Thread(runnable, sb.toString()) {
                    @Override
                    public void run() {
                        Process.setThreadPriority(9);
                        if (b.this.I) {
                            StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder().detectNetwork().penaltyDeath().build());
                        }
                        try {
                            super.run();
                        }
                        finally {
                            final Throwable t;
                            b.this.H.a(t);
                        }
                    }
                };
                ++this.J;
                return thread;
            }
        }
    }
    
    public interface c
    {
        public static final c a = new c() {
            @Override
            public void a(final Throwable t) {
            }
        };
        public static final c b;
        public static final c c = new c() {
            @Override
            public void a(final Throwable cause) {
                if (cause == null) {
                    return;
                }
                throw new RuntimeException("Request threw uncaught throwable", cause);
            }
        };
        public static final c d = d2;
        
        default static {
            final c d2 = b = new c() {
                @Override
                public void a(final Throwable t) {
                    if (t != null && Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", t);
                    }
                }
            };
        }
        
        void a(final Throwable p0);
    }
}
