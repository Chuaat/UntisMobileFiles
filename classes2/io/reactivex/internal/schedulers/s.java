// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.disposables.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.PriorityBlockingQueue;
import io.reactivex.internal.functions.b;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.disposables.e;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.annotations.f;
import io.reactivex.j0;

public final class s extends j0
{
    private static final s H;
    
    static {
        H = new s();
    }
    
    s() {
    }
    
    public static s l() {
        return s.H;
    }
    
    @f
    @Override
    public j0.c c() {
        return new c();
    }
    
    @f
    @Override
    public io.reactivex.disposables.c e(@f final Runnable runnable) {
        io.reactivex.plugins.a.b0(runnable).run();
        return e.G;
    }
    
    @f
    @Override
    public io.reactivex.disposables.c f(@f final Runnable runnable, final long timeout, final TimeUnit timeUnit) {
        try {
            timeUnit.sleep(timeout);
            io.reactivex.plugins.a.b0(runnable).run();
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            io.reactivex.plugins.a.Y(ex);
        }
        return e.G;
    }
    
    static final class a implements Runnable
    {
        private final Runnable G;
        private final c H;
        private final long I;
        
        a(final Runnable g, final c h, final long i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void run() {
            if (!this.H.J) {
                final long a = ((j0.c)this.H).a(TimeUnit.MILLISECONDS);
                final long i = this.I;
                if (i > a) {
                    try {
                        Thread.sleep(i - a);
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        io.reactivex.plugins.a.Y(ex);
                        return;
                    }
                }
                if (!this.H.J) {
                    this.G.run();
                }
            }
        }
    }
    
    static final class b implements Comparable<b>
    {
        final Runnable G;
        final long H;
        final int I;
        volatile boolean J;
        
        b(final Runnable g, final Long n, final int i) {
            this.G = g;
            this.H = n;
            this.I = i;
        }
        
        public int b(final b b) {
            final int b2 = b.b(this.H, b.H);
            if (b2 == 0) {
                return b.a(this.I, b.I);
            }
            return b2;
        }
    }
    
    static final class c extends j0.c implements io.reactivex.disposables.c
    {
        final PriorityBlockingQueue<s.b> G;
        private final AtomicInteger H;
        final AtomicInteger I;
        volatile boolean J;
        
        c() {
            this.G = new PriorityBlockingQueue<s.b>();
            this.H = new AtomicInteger();
            this.I = new AtomicInteger();
        }
        
        @f
        @Override
        public io.reactivex.disposables.c b(@f final Runnable runnable) {
            return this.e(runnable, ((j0.c)this).a(TimeUnit.MILLISECONDS));
        }
        
        @f
        @Override
        public io.reactivex.disposables.c c(@f final Runnable runnable, long duration, @f final TimeUnit timeUnit) {
            duration = ((j0.c)this).a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(duration);
            return this.e(new s.a(runnable, this, duration), duration);
        }
        
        @Override
        public void dispose() {
            this.J = true;
        }
        
        io.reactivex.disposables.c e(final Runnable runnable, final long l) {
            if (this.J) {
                return e.G;
            }
            final s.b e = new s.b(runnable, l, this.I.incrementAndGet());
            this.G.add(e);
            if (this.H.getAndIncrement() == 0) {
                int addAndGet = 1;
                while (!this.J) {
                    final s.b b = this.G.poll();
                    if (b == null) {
                        if ((addAndGet = this.H.addAndGet(-addAndGet)) == 0) {
                            return io.reactivex.internal.disposables.e.G;
                        }
                        continue;
                    }
                    else {
                        if (b.J) {
                            continue;
                        }
                        b.G.run();
                    }
                }
                this.G.clear();
                return io.reactivex.internal.disposables.e.G;
            }
            return d.f(new a(e));
        }
        
        @Override
        public boolean i() {
            return this.J;
        }
        
        final class a implements Runnable
        {
            final s.b G;
            
            a(final s.b g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                this.G.J = true;
                c.this.G.remove(this.G);
            }
        }
    }
}
