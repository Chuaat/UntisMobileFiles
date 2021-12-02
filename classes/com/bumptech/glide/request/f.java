// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

import androidx.annotation.b1;
import com.bumptech.glide.load.a;
import android.graphics.drawable.Drawable;
import java.util.concurrent.TimeUnit;
import com.bumptech.glide.request.target.p;
import androidx.annotation.j0;
import com.bumptech.glide.request.target.o;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import com.bumptech.glide.util.m;
import com.bumptech.glide.load.engine.q;
import androidx.annotation.w;
import androidx.annotation.k0;

public class f<R> implements c<R>, g<R>
{
    private static final a Q;
    private final int G;
    private final int H;
    private final boolean I;
    private final a J;
    @k0
    @w("this")
    private R K;
    @k0
    @w("this")
    private d L;
    @w("this")
    private boolean M;
    @w("this")
    private boolean N;
    @w("this")
    private boolean O;
    @k0
    @w("this")
    private q P;
    
    static {
        Q = new a();
    }
    
    public f(final int n, final int n2) {
        this(n, n2, true, f.Q);
    }
    
    f(final int g, final int h, final boolean i, final a j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    private R j(final Long n) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            if (this.I && !this.isDone()) {
                m.a();
            }
            if (this.M) {
                throw new CancellationException();
            }
            if (this.O) {
                throw new ExecutionException(this.P);
            }
            if (this.N) {
                return this.K;
            }
            if (n == null) {
                this.J.b(this, 0L);
            }
            else if (n > 0L) {
                for (long n2 = System.currentTimeMillis(), n3 = n + n2; !this.isDone() && n2 < n3; n2 = System.currentTimeMillis()) {
                    this.J.b(this, n3 - n2);
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.O) {
                throw new ExecutionException(this.P);
            }
            if (this.M) {
                throw new CancellationException();
            }
            if (this.N) {
                return this.K;
            }
            throw new TimeoutException();
        }
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void b(@j0 final o o) {
    }
    
    @Override
    public void c(@j0 final R r, @k0 final com.bumptech.glide.request.transition.f<? super R> f) {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    @Override
    public boolean cancel(final boolean b) {
        synchronized (this) {
            if (this.isDone()) {
                return false;
            }
            this.M = true;
            this.J.a(this);
            d l = null;
            if (b) {
                l = this.L;
                this.L = null;
            }
            // monitorexit(this)
            if (l != null) {
                l.clear();
            }
            return true;
        }
    }
    
    @Override
    public boolean d(@k0 final q p4, final Object o, final p<R> p5, final boolean b) {
        synchronized (this) {
            this.O = true;
            this.P = p4;
            this.J.a(this);
            return false;
        }
    }
    
    @Override
    public void e(@k0 final d l) {
        synchronized (this) {
            this.L = l;
        }
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public R get() throws InterruptedException, ExecutionException {
        try {
            return this.j(null);
        }
        catch (TimeoutException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public R get(final long duration, @j0 final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.j(timeUnit.toMillis(duration));
    }
    
    @Override
    public void h(@k0 final Drawable drawable) {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    @Override
    public boolean i(final R k, final Object o, final p<R> p5, final com.bumptech.glide.load.a a, final boolean b) {
        synchronized (this) {
            this.N = true;
            this.K = k;
            this.J.a(this);
            return false;
        }
    }
    
    @Override
    public boolean isCancelled() {
        synchronized (this) {
            return this.M;
        }
    }
    
    @Override
    public boolean isDone() {
        synchronized (this) {
            return this.M || this.N || this.O;
        }
    }
    
    @Override
    public void k(@k0 final Drawable drawable) {
    }
    
    @k0
    @Override
    public d o() {
        synchronized (this) {
            return this.L;
        }
    }
    
    @Override
    public void onDestroy() {
    }
    
    @Override
    public void p(@k0 final Drawable drawable) {
    }
    
    @Override
    public void r(@j0 final o o) {
        o.f(this.G, this.H);
    }
    
    @b1
    static class a
    {
        void a(final Object o) {
            o.notifyAll();
        }
        
        void b(final Object o, final long n) throws InterruptedException {
            o.wait(n);
        }
    }
}
