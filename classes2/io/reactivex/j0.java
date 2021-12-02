// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.internal.disposables.h;
import io.reactivex.internal.util.k;
import io.reactivex.exceptions.b;
import io.reactivex.internal.schedulers.i;
import io.reactivex.annotations.g;
import io.reactivex.internal.schedulers.q;
import x5.o;
import io.reactivex.internal.disposables.e;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.annotations.f;
import java.util.concurrent.TimeUnit;

public abstract class j0
{
    static final long G;
    
    static {
        G = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L));
    }
    
    public static long b() {
        return j0.G;
    }
    
    @f
    public abstract c c();
    
    public long d(@f final TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    @f
    public io.reactivex.disposables.c e(@f final Runnable runnable) {
        return this.f(runnable, 0L, TimeUnit.NANOSECONDS);
    }
    
    @f
    public io.reactivex.disposables.c f(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
        final c c = this.c();
        final a a = new a(io.reactivex.plugins.a.b0(runnable), c);
        c.c(a, n, timeUnit);
        return a;
    }
    
    @f
    public io.reactivex.disposables.c g(@f final Runnable runnable, final long n, final long n2, @f final TimeUnit timeUnit) {
        final c c = this.c();
        final b b = new b(io.reactivex.plugins.a.b0(runnable), c);
        final io.reactivex.disposables.c d = c.d(b, n, n2, timeUnit);
        if (d == e.G) {
            return d;
        }
        return b;
    }
    
    public void h() {
    }
    
    public void j() {
    }
    
    @f
    public <S extends io.reactivex.j0> S k(@f final o<l<l<io.reactivex.c>>, io.reactivex.c> o) {
        return (S)new q(o, this);
    }
    
    static final class a implements c, Runnable, io.reactivex.schedulers.a
    {
        @f
        final Runnable G;
        @f
        final j0.c H;
        @g
        Thread I;
        
        a(@f final Runnable g, @f final j0.c h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public Runnable a() {
            return this.G;
        }
        
        @Override
        public void dispose() {
            if (this.I == Thread.currentThread()) {
                final j0.c h = this.H;
                if (h instanceof i) {
                    ((i)h).h();
                    return;
                }
            }
            this.H.dispose();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void run() {
            this.I = Thread.currentThread();
            try {
                this.G.run();
            }
            finally {
                this.dispose();
                this.I = null;
            }
        }
    }
    
    static final class b implements c, Runnable, io.reactivex.schedulers.a
    {
        @f
        final Runnable G;
        @f
        final j0.c H;
        volatile boolean I;
        
        b(@f final Runnable g, @f final j0.c h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public Runnable a() {
            return this.G;
        }
        
        @Override
        public void dispose() {
            this.I = true;
            this.H.dispose();
        }
        
        @Override
        public boolean i() {
            return this.I;
        }
        
        @Override
        public void run() {
            if (!this.I) {
                try {
                    this.G.run();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    this.H.dispose();
                    throw k.f(t);
                }
            }
        }
    }
    
    public abstract static class c implements io.reactivex.disposables.c
    {
        public long a(@f final TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        
        @f
        public io.reactivex.disposables.c b(@f final Runnable runnable) {
            return this.c(runnable, 0L, TimeUnit.NANOSECONDS);
        }
        
        @f
        public abstract io.reactivex.disposables.c c(@f final Runnable p0, final long p1, @f final TimeUnit p2);
        
        @f
        public io.reactivex.disposables.c d(@f Runnable b0, final long duration, long nanos, @f final TimeUnit timeUnit) {
            final h h = new h();
            final h h2 = new h(h);
            b0 = io.reactivex.plugins.a.b0(b0);
            nanos = timeUnit.toNanos(nanos);
            final long a = this.a(TimeUnit.NANOSECONDS);
            final io.reactivex.disposables.c c = this.c(new a(a + timeUnit.toNanos(duration), b0, a, h2, nanos), duration, timeUnit);
            if (c == e.G) {
                return c;
            }
            h.a(c);
            return h2;
        }
        
        final class a implements Runnable, io.reactivex.schedulers.a
        {
            @f
            final Runnable G;
            @f
            final h H;
            final long I;
            long J;
            long K;
            long L;
            
            a(@f final long l, final Runnable g, @f final long k, final h h, final long i) {
                this.G = g;
                this.H = h;
                this.I = i;
                this.K = k;
                this.L = l;
            }
            
            @Override
            public Runnable a() {
                return this.G;
            }
            
            @Override
            public void run() {
                this.G.run();
                if (!this.H.i()) {
                    final c m = c.this;
                    final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
                    final long a = m.a(nanoseconds);
                    final long g = j0.G;
                    final long k = this.K;
                    long n = 0L;
                    Label_0148: {
                        if (a + g >= k) {
                            final long i = this.I;
                            if (a < k + i + g) {
                                final long l = this.L;
                                final long j = this.J + 1L;
                                this.J = j;
                                n = l + j * i;
                                break Label_0148;
                            }
                        }
                        final long i2 = this.I;
                        n = a + i2;
                        final long j2 = this.J + 1L;
                        this.J = j2;
                        this.L = n - i2 * j2;
                    }
                    this.K = a;
                    this.H.a(c.this.c(this, n - a, nanoseconds));
                }
            }
        }
    }
}
