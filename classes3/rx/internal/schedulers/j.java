// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.g;
import rx.plugins.c;
import java.util.concurrent.Future;
import rx.subscriptions.b;
import rx.functions.a;
import rx.internal.util.q;
import rx.o;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends AtomicReference<Thread> implements Runnable, o
{
    private static final long I = -3962399486978279857L;
    final q G;
    final rx.functions.a H;
    
    public j(final rx.functions.a h) {
        this.H = h;
        this.G = new q();
    }
    
    public j(final rx.functions.a h, final q q) {
        this.H = h;
        this.G = new q(new b(this, q));
    }
    
    public j(final rx.functions.a h, final rx.subscriptions.b b) {
        this.H = h;
        this.G = new q(new c(this, b));
    }
    
    public void a(final Future<?> future) {
        this.G.a(new a(future));
    }
    
    public void b(final o o) {
        this.G.a(o);
    }
    
    public void c(final q q) {
        this.G.a(new b(this, q));
    }
    
    public void d(final rx.subscriptions.b b) {
        this.G.a(new c(this, b));
    }
    
    void e(final Throwable t) {
        rx.plugins.c.I(t);
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
    
    @Override
    public boolean g() {
        return this.G.g();
    }
    
    @Override
    public void i() {
        if (!this.G.g()) {
            this.G.i();
        }
    }
    
    @Override
    public void run() {
        while (true) {
            Label_0035: {
                final Throwable t2;
                try {
                    this.lazySet(Thread.currentThread());
                    this.H.call();
                    this.i();
                    return;
                }
                catch (g cause) {
                    new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", cause);
                    break Label_0035;
                }
                finally {
                    final String s = "Fatal Exception thrown on Scheduler.Worker thread.";
                    final Throwable t = t2;
                    final IllegalStateException ex2;
                    final IllegalStateException ex = ex2 = new IllegalStateException(s, t);
                }
                try {
                    final String s = "Fatal Exception thrown on Scheduler.Worker thread.";
                    final Throwable t = t2;
                    final IllegalStateException ex2 = new IllegalStateException(s, t);
                    this.e(ex2);
                    continue;
                }
                finally {
                    this.i();
                }
            }
            break;
        }
    }
    
    final class a implements o
    {
        private final Future<?> G;
        
        a(final Future<?> g) {
            this.G = g;
        }
        
        @Override
        public boolean g() {
            return this.G.isCancelled();
        }
        
        @Override
        public void i() {
            Future<?> future;
            boolean b;
            if (j.this.get() != Thread.currentThread()) {
                future = this.G;
                b = true;
            }
            else {
                future = this.G;
                b = false;
            }
            future.cancel(b);
        }
    }
    
    static final class b extends AtomicBoolean implements o
    {
        private static final long I = 247232374289553518L;
        final j G;
        final q H;
        
        public b(final j g, final q h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            if (this.compareAndSet(false, true)) {
                this.H.d(this.G);
            }
        }
    }
    
    static final class c extends AtomicBoolean implements o
    {
        private static final long I = 247232374289553518L;
        final j G;
        final rx.subscriptions.b H;
        
        public c(final j g, final rx.subscriptions.b h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            if (this.compareAndSet(false, true)) {
                this.H.e(this.G);
            }
        }
    }
}
