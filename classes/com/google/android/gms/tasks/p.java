// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import d6.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CancellationException;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import androidx.annotation.k0;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;

public final class p
{
    private p() {
    }
    
    public static <TResult> TResult a(@j0 final m<TResult> m) throws ExecutionException, InterruptedException {
        x.i();
        x.l(m, "Task must not be null");
        if (m.u()) {
            return (TResult)n((m<Object>)m);
        }
        final b b = new b(null);
        o((m<TResult>)m, b);
        b.b();
        return (TResult)n((m<T>)m);
    }
    
    public static <TResult> TResult b(@j0 final m<TResult> m, final long n, @j0 final TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        x.i();
        x.l(m, "Task must not be null");
        x.l(timeUnit, "TimeUnit must not be null");
        if (m.u()) {
            return n(m);
        }
        final b b = new b(null);
        o(m, b);
        if (b.e(n, timeUnit)) {
            return n(m);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    @Deprecated
    @j0
    public static <TResult> m<TResult> c(@j0 final Callable<TResult> callable) {
        return d(o.a, callable);
    }
    
    @Deprecated
    @j0
    public static <TResult> m<TResult> d(@j0 final Executor executor, @j0 final Callable<TResult> callable) {
        x.l(executor, "Executor must not be null");
        x.l(callable, "Callback must not be null");
        final l0<TResult> l0 = new l0<TResult>();
        executor.execute(new p0(l0, callable));
        return l0;
    }
    
    @j0
    public static <TResult> m<TResult> e() {
        final l0<TResult> l0 = new l0<TResult>();
        l0.A();
        return l0;
    }
    
    @j0
    public static <TResult> m<TResult> f(@j0 final Exception ex) {
        final l0<TResult> l0 = new l0<TResult>();
        l0.y(ex);
        return l0;
    }
    
    @j0
    public static <TResult> m<TResult> g(final TResult tResult) {
        final l0<TResult> l0 = new l0<TResult>();
        l0.z(tResult);
        return l0;
    }
    
    @j0
    public static m<Void> h(@k0 final Collection<? extends m<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            final Iterator<? extends m<?>> iterator = collection.iterator();
            while (iterator.hasNext()) {
                Objects.requireNonNull((m)iterator.next(), "null tasks are not accepted");
            }
            final l0<Void> l0 = new l0<Void>();
            final c c = new c(collection.size(), l0);
            final Iterator<? extends m<?>> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                o((m<Object>)iterator2.next(), c);
            }
            return l0;
        }
        return g((Void)null);
    }
    
    @j0
    public static m<Void> i(@k0 final m<?>... a) {
        if (a != null && a.length != 0) {
            return h(Arrays.asList(a));
        }
        return g((Void)null);
    }
    
    @j0
    public static m<List<m<?>>> j(@k0 final Collection<? extends m<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return h(collection).o((com.google.android.gms.tasks.c<Void, m<List<m<?>>>>)new q0(collection));
        }
        return g(Collections.emptyList());
    }
    
    @j0
    public static m<List<m<?>>> k(@k0 final m<?>... a) {
        if (a != null && a.length != 0) {
            return j(Arrays.asList(a));
        }
        return g(Collections.emptyList());
    }
    
    @j0
    public static <TResult> m<List<TResult>> l(@k0 final Collection<? extends m<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return h(collection).m((com.google.android.gms.tasks.c<Void, List<TResult>>)new r(collection));
        }
        return g(Collections.emptyList());
    }
    
    @j0
    public static <TResult> m<List<TResult>> m(@k0 final m<?>... a) {
        if (a != null && a.length != 0) {
            return l(Arrays.asList(a));
        }
        return g(Collections.emptyList());
    }
    
    private static <TResult> TResult n(@j0 final m<TResult> m) throws ExecutionException {
        if (m.v()) {
            return m.r();
        }
        if (m.t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(m.q());
    }
    
    private static <T> void o(final m<T> m, final a<? super T> a) {
        final Executor b = o.b;
        m.l(b, a);
        m.i(b, a);
        m.c(b, a);
    }
    
    interface a<T> extends e, g, h<T>
    {
    }
    
    private static final class b implements a
    {
        private final CountDownLatch a;
        
        private b() {
            this.a = new CountDownLatch(1);
        }
        
        @Override
        public final void a() {
            this.a.countDown();
        }
        
        public final void b() throws InterruptedException {
            this.a.await();
        }
        
        @Override
        public final void c(@j0 final Exception ex) {
            this.a.countDown();
        }
        
        @Override
        public final void d(final Object o) {
            this.a.countDown();
        }
        
        public final boolean e(final long timeout, final TimeUnit unit) throws InterruptedException {
            return this.a.await(timeout, unit);
        }
    }
    
    private static final class c implements a
    {
        private final Object a;
        private final int b;
        private final l0<Void> c;
        @d6.a("mLock")
        private int d;
        @d6.a("mLock")
        private int e;
        @d6.a("mLock")
        private int f;
        @d6.a("mLock")
        private Exception g;
        @d6.a("mLock")
        private boolean h;
        
        public c(final int b, final l0<Void> c) {
            this.a = new Object();
            this.b = b;
            this.c = c;
        }
        
        @d6.a("mLock")
        private final void b() {
            if (this.d + this.e + this.f == this.b) {
                if (this.g != null) {
                    final l0<Void> c = this.c;
                    final int e = this.e;
                    final int b = this.b;
                    final StringBuilder sb = new StringBuilder(54);
                    sb.append(e);
                    sb.append(" out of ");
                    sb.append(b);
                    sb.append(" underlying tasks failed");
                    c.y(new ExecutionException(sb.toString(), this.g));
                    return;
                }
                if (this.h) {
                    this.c.A();
                    return;
                }
                this.c.z(null);
            }
        }
        
        @Override
        public final void a() {
            synchronized (this.a) {
                ++this.f;
                this.h = true;
                this.b();
            }
        }
        
        @Override
        public final void c(@j0 final Exception g) {
            synchronized (this.a) {
                ++this.e;
                this.g = g;
                this.b();
            }
        }
        
        @Override
        public final void d(final Object o) {
            synchronized (this.a) {
                ++this.d;
                this.b();
            }
        }
    }
}
