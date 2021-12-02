// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import java.util.concurrent.TimeUnit;
import androidx.annotation.b1;
import java.util.HashMap;
import java.util.concurrent.Executors;
import androidx.annotation.j0;
import androidx.work.q;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class r
{
    private static final String f;
    private final ThreadFactory a;
    private final ScheduledExecutorService b;
    final Map<String, c> c;
    final Map<String, b> d;
    final Object e;
    
    static {
        f = q.f("WorkTimer");
    }
    
    public r() {
        final ThreadFactory threadFactory = new ThreadFactory() {
            private int G = 0;
            
            @Override
            public Thread newThread(@j0 final Runnable runnable) {
                final Thread thread = Executors.defaultThreadFactory().newThread(runnable);
                final StringBuilder sb = new StringBuilder();
                sb.append("WorkManager-WorkTimer-thread-");
                sb.append(this.G);
                thread.setName(sb.toString());
                ++this.G;
                return thread;
            }
        };
        this.a = threadFactory;
        this.c = new HashMap<String, c>();
        this.d = new HashMap<String, b>();
        this.e = new Object();
        this.b = Executors.newSingleThreadScheduledExecutor(threadFactory);
    }
    
    @b1
    @j0
    public ScheduledExecutorService a() {
        return this.b;
    }
    
    @b1
    @j0
    public Map<String, b> b() {
        synchronized (this) {
            return this.d;
        }
    }
    
    @b1
    @j0
    public Map<String, c> c() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public void d() {
        if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }
    
    public void e(@j0 final String s, final long n, @j0 final b b) {
        synchronized (this.e) {
            q.c().a(r.f, String.format("Starting timer for %s", s), new Throwable[0]);
            this.f(s);
            final c c = new c(this, s);
            this.c.put(s, c);
            this.d.put(s, b);
            this.b.schedule(c, n, TimeUnit.MILLISECONDS);
        }
    }
    
    public void f(@j0 final String s) {
        synchronized (this.e) {
            if (this.c.remove(s) != null) {
                q.c().a(r.f, String.format("Stopping timer for %s", s), new Throwable[0]);
                this.d.remove(s);
            }
        }
    }
    
    @t0({ t0.a.H })
    public interface b
    {
        void a(@j0 final String p0);
    }
    
    @t0({ t0.a.H })
    public static class c implements Runnable
    {
        static final String I = "WrkTimerRunnable";
        private final r G;
        private final String H;
        
        c(@j0 final r g, @j0 final String h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            synchronized (this.G.e) {
                if (this.G.c.remove(this.H) != null) {
                    final b b = this.G.d.remove(this.H);
                    if (b != null) {
                        b.a(this.H);
                    }
                }
                else {
                    q.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.H), new Throwable[0]);
                }
            }
        }
    }
}
