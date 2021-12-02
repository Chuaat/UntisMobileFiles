// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import androidx.annotation.j0;
import java.util.concurrent.CountDownLatch;
import android.util.Log;
import androidx.annotation.b1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import com.google.android.gms.tasks.h;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import androidx.annotation.k0;
import com.google.android.gms.tasks.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import androidx.annotation.w;
import java.util.Map;
import androidx.annotation.d;

@d
public class f
{
    static final long d = 5L;
    @w("ConfigCacheClient.class")
    private static final Map<String, f> e;
    private static final Executor f;
    private final ExecutorService a;
    private final p b;
    @k0
    @w("this")
    private m<g> c;
    
    static {
        e = new HashMap<String, f>();
        f = com.google.firebase.remoteconfig.internal.e.a();
    }
    
    private f(final ExecutorService a, final p b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    private static <TResult> TResult a(final m<TResult> m, final long n, final TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        final b b = new b();
        final Executor f = com.google.firebase.remoteconfig.internal.f.f;
        m.l(f, (h)b);
        m.i(f, (com.google.android.gms.tasks.g)b);
        m.c(f, (com.google.android.gms.tasks.e)b);
        if (!b.e(n, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (m.v()) {
            return (TResult)m.r();
        }
        throw new ExecutionException(m.q());
    }
    
    @b1
    public static void c() {
        synchronized (f.class) {
            com.google.firebase.remoteconfig.internal.f.e.clear();
        }
    }
    
    public static f h(final ExecutorService executorService, final p p2) {
        synchronized (f.class) {
            final String c = p2.c();
            final Map<String, f> e = com.google.firebase.remoteconfig.internal.f.e;
            if (!e.containsKey(c)) {
                e.put(c, new f(executorService, p2));
            }
            return e.get(c);
        }
    }
    
    private void m(final g g) {
        synchronized (this) {
            this.c = (m<g>)com.google.android.gms.tasks.p.g((Object)g);
        }
    }
    
    public void b() {
        synchronized (this) {
            this.c = (m<g>)com.google.android.gms.tasks.p.g((Object)null);
            // monitorexit(this)
            this.b.a();
        }
    }
    
    public m<g> d() {
        synchronized (this) {
            final m<g> c = this.c;
            if (c == null || (c.u() && !this.c.v())) {
                final ExecutorService a = this.a;
                final p b = this.b;
                b.getClass();
                this.c = (m<g>)com.google.android.gms.tasks.p.d((Executor)a, com.google.firebase.remoteconfig.internal.d.a(b));
            }
            return this.c;
        }
    }
    
    @k0
    public g e() {
        return this.f(5L);
    }
    
    @b1
    @k0
    g f(final long n) {
        synchronized (this) {
            Object c = this.c;
            if (c != null && ((m)c).v()) {
                return (g)this.c.r();
            }
            // monitorexit(this)
            try {
                c = a(this.d(), n, TimeUnit.SECONDS);
                return (g)c;
            }
            catch (TimeoutException c) {}
            catch (ExecutionException c) {}
            catch (InterruptedException ex) {}
            Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", (Throwable)c);
            return null;
        }
    }
    
    @b1
    @k0
    m<g> g() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public m<g> k(final g g) {
        return this.l(g, true);
    }
    
    public m<g> l(final g g, final boolean b) {
        return (m<g>)com.google.android.gms.tasks.p.d((Executor)this.a, b.a(this, g)).x((Executor)this.a, com.google.firebase.remoteconfig.internal.c.b(this, b, g));
    }
    
    private static class b<TResult> implements h<TResult>, com.google.android.gms.tasks.g, com.google.android.gms.tasks.e
    {
        private final CountDownLatch a;
        
        private b() {
            this.a = new CountDownLatch(1);
        }
        
        public void a() {
            this.a.countDown();
        }
        
        public void b() throws InterruptedException {
            this.a.await();
        }
        
        public void c(@j0 final Exception ex) {
            this.a.countDown();
        }
        
        public void d(final TResult tResult) {
            this.a.countDown();
        }
        
        public boolean e(final long timeout, final TimeUnit unit) throws InterruptedException {
            return this.a.await(timeout, unit);
        }
    }
}
