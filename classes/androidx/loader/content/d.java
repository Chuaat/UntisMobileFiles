// 
// Decompiled by Procyon v0.5.36
// 

package androidx.loader.content;

import android.os.Message;
import android.os.Looper;
import java.util.concurrent.TimeoutException;
import androidx.annotation.t0;
import android.os.Handler;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Callable;
import android.os.Binder;
import android.os.Process;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Executor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

abstract class d<Params, Progress, Result>
{
    private static final String L = "AsyncTask";
    private static final int M = 5;
    private static final int N = 128;
    private static final int O = 1;
    private static final ThreadFactory P;
    private static final BlockingQueue<Runnable> Q;
    public static final Executor R;
    private static final int S = 1;
    private static final int T = 2;
    private static f U;
    private static volatile Executor V;
    private final h<Params, Result> G;
    private final FutureTask<Result> H;
    private volatile g I;
    final AtomicBoolean J;
    final AtomicBoolean K;
    
    static {
        d.V = (R = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, Q = new LinkedBlockingQueue<Runnable>(10), P = new ThreadFactory() {
            private final AtomicInteger G = new AtomicInteger(1);
            
            @Override
            public Thread newThread(final Runnable target) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ModernAsyncTask #");
                sb.append(this.G.getAndIncrement());
                return new Thread(target, sb.toString());
            }
        }));
    }
    
    d() {
        this.I = g.G;
        this.J = new AtomicBoolean();
        this.K = new AtomicBoolean();
        final h<Params, Result> g = new h<Params, Result>() {
            @Override
            public Result call() throws Exception {
                d.this.K.set(true);
                Result b = null;
                try {
                    Process.setThreadPriority(10);
                    b = b;
                    final Result result = b = d.this.b((Params[])super.G);
                    Binder.flushPendingCommands();
                    d.this.q(result);
                    return result;
                }
                finally {
                    try {
                        d.this.J.set(true);
                    }
                    finally {
                        d.this.q(b);
                    }
                }
            }
        };
        this.G = (h<Params, Result>)g;
        this.H = new FutureTask<Result>(g) {
            @Override
            protected void done() {
                try {
                    d.this.r(this.get());
                }
                catch (CancellationException ex3) {
                    d.this.r(null);
                }
                catch (ExecutionException ex) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", ex.getCause());
                }
                catch (InterruptedException ex2) {
                    Log.w("AsyncTask", (Throwable)ex2);
                }
                finally {
                    final Throwable cause;
                    throw new RuntimeException("An error occurred while executing doInBackground()", cause);
                }
            }
        };
    }
    
    public static void d(final Runnable runnable) {
        d.V.execute(runnable);
    }
    
    private static Handler i() {
        synchronized (d.class) {
            if (d.U == null) {
                d.U = new f();
            }
            return d.U;
        }
    }
    
    @t0({ t0.a.H })
    public static void t(final Executor v) {
        d.V = v;
    }
    
    public final boolean a(final boolean mayInterruptIfRunning) {
        this.J.set(true);
        return this.H.cancel(mayInterruptIfRunning);
    }
    
    protected abstract Result b(final Params... p0);
    
    public final d<Params, Progress, Result> c(final Params... array) {
        return this.e(d.V, array);
    }
    
    public final d<Params, Progress, Result> e(final Executor executor, final Params... g) {
        if (this.I == d.g.G) {
            this.I = d.g.H;
            this.o();
            this.G.G = g;
            executor.execute(this.H);
            return this;
        }
        final int n = d$d.a[this.I.ordinal()];
        if (n == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (n != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }
    
    void f(final Result result) {
        if (this.k()) {
            this.m(result);
        }
        else {
            this.n(result);
        }
        this.I = g.I;
    }
    
    public final Result g() throws InterruptedException, ExecutionException {
        return this.H.get();
    }
    
    public final Result h(final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.H.get(timeout, unit);
    }
    
    public final g j() {
        return this.I;
    }
    
    public final boolean k() {
        return this.J.get();
    }
    
    protected void l() {
    }
    
    protected void m(final Result result) {
        this.l();
    }
    
    protected void n(final Result result) {
    }
    
    protected void o() {
    }
    
    protected void p(final Progress... array) {
    }
    
    Result q(final Result result) {
        i().obtainMessage(1, (Object)new e(this, new Object[] { result })).sendToTarget();
        return result;
    }
    
    void r(final Result result) {
        if (!this.K.get()) {
            this.q(result);
        }
    }
    
    protected final void s(final Progress... array) {
        if (!this.k()) {
            i().obtainMessage(2, (Object)new e(this, (Object[])array)).sendToTarget();
        }
    }
    
    private static class e<Data>
    {
        final d a;
        final Data[] b;
        
        e(final d a, final Data... b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static class f extends Handler
    {
        f() {
            super(Looper.getMainLooper());
        }
        
        public void handleMessage(final Message message) {
            final e e = (e)message.obj;
            final int what = message.what;
            if (what != 1) {
                if (what == 2) {
                    e.a.p(e.b);
                }
            }
            else {
                e.a.f(e.b[0]);
            }
        }
    }
    
    public enum g
    {
        G, 
        H, 
        I;
    }
    
    private abstract static class h<Params, Result> implements Callable<Result>
    {
        Params[] G;
        
        h() {
        }
    }
}
