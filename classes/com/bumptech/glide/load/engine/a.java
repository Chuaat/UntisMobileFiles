// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.k;
import java.lang.ref.WeakReference;
import com.bumptech.glide.util.e;
import java.util.concurrent.ExecutorService;
import java.util.HashMap;
import java.util.concurrent.Executors;
import android.os.Process;
import androidx.annotation.j0;
import java.util.concurrent.ThreadFactory;
import androidx.annotation.k0;
import java.lang.ref.ReferenceQueue;
import androidx.annotation.b1;
import com.bumptech.glide.load.g;
import java.util.Map;
import java.util.concurrent.Executor;

final class a
{
    private final boolean a;
    private final Executor b;
    @b1
    final Map<g, d> c;
    private final ReferenceQueue<p<?>> d;
    private p.a e;
    private volatile boolean f;
    @k0
    private volatile c g;
    
    a(final boolean b) {
        this(b, Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(@j0 final Runnable runnable) {
                return new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }
    
    @b1
    a(final boolean a, final Executor b) {
        this.c = new HashMap<g, d>();
        this.d = new ReferenceQueue<p<?>>();
        this.a = a;
        (this.b = b).execute(new Runnable() {
            @Override
            public void run() {
                com.bumptech.glide.load.engine.a.this.b();
            }
        });
    }
    
    void a(final g g, final p<?> p2) {
        synchronized (this) {
            final d d = this.c.put(g, new d(g, p2, this.d, this.a));
            if (d != null) {
                d.a();
            }
        }
    }
    
    void b() {
        while (!this.f) {
            try {
                this.c((d)this.d.remove());
                final c g = this.g;
                if (g == null) {
                    continue;
                }
                g.a();
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    void c(@j0 final d d) {
        synchronized (this) {
            this.c.remove(d.a);
            if (d.b) {
                final v<?> c = d.c;
                if (c != null) {
                    // monitorexit(this)
                    this.e.d(d.a, new p<Object>((v<Object>)c, true, false, d.a, this.e));
                }
            }
        }
    }
    
    void d(final g g) {
        synchronized (this) {
            final d d = this.c.remove(g);
            if (d != null) {
                d.a();
            }
        }
    }
    
    @k0
    p<?> e(final g g) {
        synchronized (this) {
            final d d = this.c.get(g);
            if (d == null) {
                return null;
            }
            final p<?> p = d.get();
            if (p == null) {
                this.c(d);
            }
            return p;
        }
    }
    
    @b1
    void f(final c g) {
        this.g = g;
    }
    
    void g(final p.a e) {
        synchronized (e) {
            synchronized (this) {
                this.e = e;
            }
        }
    }
    
    @b1
    void h() {
        this.f = true;
        final Executor b = this.b;
        if (b instanceof ExecutorService) {
            com.bumptech.glide.util.e.c((ExecutorService)b);
        }
    }
    
    @b1
    interface c
    {
        void a();
    }
    
    @b1
    static final class d extends WeakReference<p<?>>
    {
        final g a;
        final boolean b;
        @k0
        v<?> c;
        
        d(@j0 final g g, @j0 final p<?> referent, @j0 final ReferenceQueue<? super p<?>> q, final boolean b) {
            super(referent, q);
            this.a = k.d(g);
            v<?> c;
            if (referent.d() && b) {
                c = k.d(referent.c());
            }
            else {
                c = null;
            }
            this.c = c;
            this.b = referent.d();
        }
        
        void a() {
            this.c = null;
            this.clear();
        }
    }
}
