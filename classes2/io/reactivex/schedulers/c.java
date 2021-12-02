// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.schedulers;

import io.reactivex.internal.functions.b;
import io.reactivex.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.annotations.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.Queue;
import io.reactivex.j0;

public final class c extends j0
{
    final Queue<b> H;
    long I;
    volatile long J;
    
    public c() {
        this.H = new PriorityBlockingQueue<b>(11);
    }
    
    public c(final long duration, final TimeUnit timeUnit) {
        this.H = new PriorityBlockingQueue<b>(11);
        this.J = timeUnit.toNanos(duration);
    }
    
    private void o(final long j) {
        while (true) {
            final b b = this.H.peek();
            if (b == null) {
                break;
            }
            final long g = b.G;
            if (g > j) {
                break;
            }
            long i = g;
            if (g == 0L) {
                i = this.J;
            }
            this.J = i;
            this.H.remove(b);
            if (b.I.G) {
                continue;
            }
            b.H.run();
        }
        this.J = j;
    }
    
    @f
    @Override
    public j0.c c() {
        return new a();
    }
    
    @Override
    public long d(@f final TimeUnit timeUnit) {
        return timeUnit.convert(this.J, TimeUnit.NANOSECONDS);
    }
    
    public void l(final long duration, final TimeUnit timeUnit) {
        this.m(this.J + timeUnit.toNanos(duration), TimeUnit.NANOSECONDS);
    }
    
    public void m(final long duration, final TimeUnit timeUnit) {
        this.o(timeUnit.toNanos(duration));
    }
    
    public void n() {
        this.o(this.J);
    }
    
    final class a extends j0.c
    {
        volatile boolean G;
        
        @Override
        public long a(@f final TimeUnit timeUnit) {
            return c.this.d(timeUnit);
        }
        
        @f
        @Override
        public c b(@f final Runnable runnable) {
            if (this.G) {
                return e.G;
            }
            final c h = c.this;
            final long i = h.I;
            h.I = 1L + i;
            final b b = new b(this, 0L, runnable, i);
            c.this.H.add(b);
            return d.f(new a(b));
        }
        
        @f
        @Override
        public c c(@f final Runnable runnable, long nanos, @f final TimeUnit timeUnit) {
            if (this.G) {
                return e.G;
            }
            final long j = c.this.J;
            nanos = timeUnit.toNanos(nanos);
            final c h = c.this;
            final long i = h.I;
            h.I = 1L + i;
            final b b = new b(this, j + nanos, runnable, i);
            c.this.H.add(b);
            return d.f(new a(b));
        }
        
        @Override
        public void dispose() {
            this.G = true;
        }
        
        @Override
        public boolean i() {
            return this.G;
        }
        
        final class a implements Runnable
        {
            final b G;
            
            a(final b g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                c.this.H.remove(this.G);
            }
        }
    }
    
    static final class b implements Comparable<b>
    {
        final long G;
        final Runnable H;
        final c.a I;
        final long J;
        
        b(final c.a i, final long g, final Runnable h, final long j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public int b(final b b) {
            final long g = this.G;
            final long g2 = b.G;
            if (g == g2) {
                return b.b(this.J, b.J);
            }
            return b.b(g, g2);
        }
        
        @Override
        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", this.G, this.H.toString());
        }
    }
}
