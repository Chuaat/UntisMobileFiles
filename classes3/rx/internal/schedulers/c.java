// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import rx.subscriptions.f;
import rx.o;
import rx.functions.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx.subscriptions.b;
import java.util.concurrent.Executor;
import rx.j;

public final class c extends j
{
    final Executor a;
    
    public c(final Executor a) {
        this.a = a;
    }
    
    @Override
    public j.a a() {
        return new a(this.a);
    }
    
    static final class a extends j.a implements Runnable
    {
        final Executor G;
        final b H;
        final ConcurrentLinkedQueue<rx.internal.schedulers.j> I;
        final AtomicInteger J;
        final ScheduledExecutorService K;
        
        public a(final Executor g) {
            this.G = g;
            this.I = new ConcurrentLinkedQueue<rx.internal.schedulers.j>();
            this.J = new AtomicInteger();
            this.H = new b();
            this.K = d.a();
        }
        
        @Override
        public o c(final rx.functions.a a) {
            if (this.g()) {
                return f.e();
            }
            final rx.internal.schedulers.j e = new rx.internal.schedulers.j(rx.plugins.c.P(a), this.H);
            this.H.a(e);
            this.I.offer(e);
            if (this.J.getAndIncrement() == 0) {
                try {
                    this.G.execute(this);
                }
                catch (RejectedExecutionException ex) {
                    this.H.e(e);
                    this.J.decrementAndGet();
                    rx.plugins.c.I(ex);
                    throw ex;
                }
            }
            return e;
        }
        
        @Override
        public o d(final rx.functions.a a, final long n, final TimeUnit timeUnit) {
            if (n <= 0L) {
                return this.c(a);
            }
            if (this.g()) {
                return f.e();
            }
            final rx.functions.a p3 = rx.plugins.c.P(a);
            final rx.subscriptions.c c = new rx.subscriptions.c();
            final rx.subscriptions.c c2 = new rx.subscriptions.c();
            c2.b(c);
            this.H.a(c2);
            final o a2 = f.a(new rx.functions.a() {
                @Override
                public void call() {
                    c.a.this.H.e(c2);
                }
            });
            final rx.internal.schedulers.j j = new rx.internal.schedulers.j(new rx.functions.a() {
                @Override
                public void call() {
                    if (c2.g()) {
                        return;
                    }
                    final o c = rx.internal.schedulers.c.a.this.c(p3);
                    c2.b(c);
                    if (((rx.internal.schedulers.j)c).getClass() == rx.internal.schedulers.j.class) {
                        ((rx.internal.schedulers.j)c).b(a2);
                    }
                }
            });
            c.b(j);
            try {
                j.a(this.K.schedule(j, n, timeUnit));
                return a2;
            }
            catch (RejectedExecutionException ex) {
                rx.plugins.c.I(ex);
                throw ex;
            }
        }
        
        @Override
        public boolean g() {
            return this.H.g();
        }
        
        @Override
        public void i() {
            this.H.i();
            this.I.clear();
        }
        
        @Override
        public void run() {
            while (!this.H.g()) {
                final rx.internal.schedulers.j j = this.I.poll();
                if (j == null) {
                    return;
                }
                if (!j.g()) {
                    if (this.H.g()) {
                        break;
                    }
                    j.run();
                }
                if (this.J.decrementAndGet() == 0) {
                    return;
                }
            }
            this.I.clear();
        }
    }
}
