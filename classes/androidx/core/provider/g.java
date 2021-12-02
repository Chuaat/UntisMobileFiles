// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import java.util.concurrent.RejectedExecutionException;
import androidx.core.util.n;
import android.os.Process;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutorService;
import androidx.core.util.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import android.os.Handler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import androidx.annotation.b0;
import androidx.annotation.j0;

class g
{
    private g() {
    }
    
    static ThreadPoolExecutor a(@j0 final String s, final int n, @b0(from = 0L) final int n2) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, n2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), new a(s, n));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
    
    static Executor b(@j0 final Handler handler) {
        return new b(handler);
    }
    
    static <T> void c(@j0 final Executor executor, @j0 final Callable<T> callable, @j0 final androidx.core.util.c<T> c) {
        executor.execute(new c<Object>(androidx.core.provider.b.a(), callable, c));
    }
    
    static <T> T d(@j0 final ExecutorService executorService, @j0 final Callable<T> callable, @b0(from = 0L) final int n) throws InterruptedException {
        final Future<T> submit = executorService.submit(callable);
        final long n2 = n;
        try {
            return submit.get(n2, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException ex2) {
            throw new InterruptedException("timeout");
        }
        catch (InterruptedException ex) {
            throw ex;
        }
        catch (ExecutionException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    private static class a implements ThreadFactory
    {
        private String G;
        private int H;
        
        a(@j0 final String g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public Thread newThread(final Runnable runnable) {
            return new g.a.a(runnable, this.G, this.H);
        }
        
        private static class a extends Thread
        {
            private final int G;
            
            a(final Runnable target, final String name, final int g) {
                super(target, name);
                this.G = g;
            }
            
            @Override
            public void run() {
                Process.setThreadPriority(this.G);
                super.run();
            }
        }
    }
    
    private static class b implements Executor
    {
        private final Handler G;
        
        b(@j0 final Handler handler) {
            this.G = n.g(handler);
        }
        
        @Override
        public void execute(@j0 final Runnable runnable) {
            if (this.G.post((Runnable)n.g(runnable))) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.G);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }
    
    private static class c<T> implements Runnable
    {
        @j0
        private Callable<T> G;
        @j0
        private androidx.core.util.c<T> H;
        @j0
        private Handler I;
        
        c(@j0 final Handler i, @j0 final Callable<T> g, @j0 final androidx.core.util.c<T> h) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void run() {
            Object call;
            try {
                call = this.G.call();
            }
            catch (Exception ex) {
                call = null;
            }
            this.I.post((Runnable)new Runnable() {
                final /* synthetic */ androidx.core.util.c G = c.this.H;
                
                @Override
                public void run() {
                    this.G.accept(call);
                }
            });
        }
    }
}
