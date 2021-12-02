// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import io.reactivex.schedulers.b;
import io.reactivex.annotations.f;
import java.util.concurrent.Executor;
import io.reactivex.j0;

public final class d extends j0
{
    static final j0 J;
    final boolean H;
    @f
    final Executor I;
    
    static {
        J = io.reactivex.schedulers.b.g();
    }
    
    public d(@f final Executor i, final boolean h) {
        this.I = i;
        this.H = h;
    }
    
    @f
    @Override
    public j0.c c() {
        return new c(this.I, this.H);
    }
    
    @f
    @Override
    public io.reactivex.disposables.c e(@f Runnable b0) {
        b0 = io.reactivex.plugins.a.b0(b0);
        try {
            if (this.I instanceof ExecutorService) {
                final m m = new m(b0);
                m.b(((ExecutorService)this.I).submit((Callable<Object>)m));
                return m;
            }
            if (this.H) {
                final c.b b2 = new c.b(b0, null);
                this.I.execute(b2);
                return b2;
            }
            final c.a a = new c.a(b0);
            this.I.execute(a);
            return a;
        }
        catch (RejectedExecutionException ex) {
            io.reactivex.plugins.a.Y(ex);
            return e.G;
        }
    }
    
    @f
    @Override
    public io.reactivex.disposables.c f(@f Runnable b0, final long n, final TimeUnit timeUnit) {
        b0 = io.reactivex.plugins.a.b0(b0);
        if (this.I instanceof ScheduledExecutorService) {
            try {
                final m m = new m(b0);
                m.b(((ScheduledExecutorService)this.I).schedule((Callable<Object>)m, n, timeUnit));
                return m;
            }
            catch (RejectedExecutionException ex) {
                io.reactivex.plugins.a.Y(ex);
                return e.G;
            }
        }
        final b b2 = new b(b0);
        b2.G.a(d.J.f(new a(b2), n, timeUnit));
        return b2;
    }
    
    @f
    @Override
    public io.reactivex.disposables.c g(@f final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        if (this.I instanceof ScheduledExecutorService) {
            final Runnable b0 = io.reactivex.plugins.a.b0(runnable);
            try {
                final l l = new l(b0);
                l.b(((ScheduledExecutorService)this.I).scheduleAtFixedRate(l, n, n2, timeUnit));
                return l;
            }
            catch (RejectedExecutionException ex) {
                io.reactivex.plugins.a.Y(ex);
                return e.G;
            }
        }
        return super.g(runnable, n, n2, timeUnit);
    }
    
    final class a implements Runnable
    {
        private final d.b G;
        
        a(final d.b g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            final d.b g = this.G;
            g.H.a(d.this.e(g));
        }
    }
    
    static final class b extends AtomicReference<Runnable> implements Runnable, c, io.reactivex.schedulers.a
    {
        private static final long I = -4101336210206799084L;
        final h G;
        final h H;
        
        b(final Runnable initialValue) {
            super(initialValue);
            this.G = new h();
            this.H = new h();
        }
        
        @Override
        public Runnable a() {
            Runnable b = this.get();
            if (b == null) {
                b = io.reactivex.internal.functions.a.b;
            }
            return b;
        }
        
        @Override
        public void dispose() {
            if (this.getAndSet(null) != null) {
                this.G.dispose();
                this.H.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == null;
        }
        
        @Override
        public void run() {
            final Runnable runnable = this.get();
            if (runnable != null) {
                try {
                    runnable.run();
                    this.lazySet(null);
                    final h g = this.G;
                    final io.reactivex.internal.disposables.d g2 = io.reactivex.internal.disposables.d.G;
                    ((AtomicReference<io.reactivex.internal.disposables.d>)g).lazySet(g2);
                    ((AtomicReference<io.reactivex.internal.disposables.d>)this.H).lazySet(g2);
                }
                finally {
                    this.lazySet(null);
                    ((AtomicReference<io.reactivex.internal.disposables.d>)this.G).lazySet(io.reactivex.internal.disposables.d.G);
                    ((AtomicReference<io.reactivex.internal.disposables.d>)this.H).lazySet(io.reactivex.internal.disposables.d.G);
                }
            }
        }
    }
    
    public static final class c extends j0.c implements Runnable
    {
        final boolean G;
        final Executor H;
        final io.reactivex.internal.queue.a<Runnable> I;
        volatile boolean J;
        final AtomicInteger K;
        final io.reactivex.disposables.b L;
        
        public c(final Executor h, final boolean g) {
            this.K = new AtomicInteger();
            this.L = new io.reactivex.disposables.b();
            this.H = h;
            this.I = new io.reactivex.internal.queue.a<Runnable>();
            this.G = g;
        }
        
        @f
        @Override
        public c b(@f Runnable b0) {
            if (this.J) {
                return e.G;
            }
            b0 = io.reactivex.plugins.a.b0(b0);
            Runnable runnable;
            if (this.G) {
                runnable = new b(b0, this.L);
                this.L.b((c)runnable);
            }
            else {
                runnable = new a(b0);
            }
            this.I.offer(runnable);
            if (this.K.getAndIncrement() == 0) {
                try {
                    this.H.execute(this);
                }
                catch (RejectedExecutionException ex) {
                    this.J = true;
                    this.I.clear();
                    io.reactivex.plugins.a.Y(ex);
                    return e.G;
                }
            }
            return (c)runnable;
        }
        
        @f
        @Override
        public c c(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
            if (n <= 0L) {
                return this.b(runnable);
            }
            if (this.J) {
                return e.G;
            }
            final h h = new h();
            final h h2 = new h(h);
            final n n2 = new n(new d.c.c(h2, io.reactivex.plugins.a.b0(runnable)), this.L);
            this.L.b(n2);
            final Executor h3 = this.H;
            Label_0148: {
                if (h3 instanceof ScheduledExecutorService) {
                    try {
                        n2.a(((ScheduledExecutorService)h3).schedule((Callable<Object>)n2, n, timeUnit));
                        break Label_0148;
                    }
                    catch (RejectedExecutionException ex) {
                        this.J = true;
                        io.reactivex.plugins.a.Y(ex);
                        return e.G;
                    }
                }
                n2.a(new c(d.J.f(n2, n, timeUnit)));
            }
            h.a(n2);
            return h2;
        }
        
        @Override
        public void dispose() {
            if (!this.J) {
                this.J = true;
                this.L.dispose();
                if (this.K.getAndIncrement() == 0) {
                    this.I.clear();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.J;
        }
        
        @Override
        public void run() {
            final io.reactivex.internal.queue.a<Runnable> i = this.I;
            int addAndGet = 1;
        Label_0007:
            while (!this.J) {
                do {
                    final Runnable runnable = i.poll();
                    if (runnable == null) {
                        if (this.J) {
                            i.clear();
                            return;
                        }
                        if ((addAndGet = this.K.addAndGet(-addAndGet)) == 0) {
                            return;
                        }
                        continue Label_0007;
                    }
                    else {
                        runnable.run();
                    }
                } while (!this.J);
                i.clear();
                return;
            }
            i.clear();
        }
        
        static final class a extends AtomicBoolean implements Runnable, c
        {
            private static final long H = -2421395018820541164L;
            final Runnable G;
            
            a(final Runnable g) {
                this.G = g;
            }
            
            @Override
            public void dispose() {
                this.lazySet(true);
            }
            
            @Override
            public boolean i() {
                return this.get();
            }
            
            @Override
            public void run() {
                if (this.get()) {
                    return;
                }
                try {
                    this.G.run();
                }
                finally {
                    this.lazySet(true);
                }
            }
        }
        
        static final class b extends AtomicInteger implements Runnable, c
        {
            private static final long J = -3603436687413320876L;
            static final int K = 0;
            static final int L = 1;
            static final int M = 2;
            static final int N = 3;
            static final int O = 4;
            final Runnable G;
            final io.reactivex.internal.disposables.c H;
            volatile Thread I;
            
            b(final Runnable g, final io.reactivex.internal.disposables.c h) {
                this.G = g;
                this.H = h;
            }
            
            void a() {
                final io.reactivex.internal.disposables.c h = this.H;
                if (h != null) {
                    h.c(this);
                }
            }
            
            @Override
            public void dispose() {
                while (true) {
                    Block_2: {
                        while (true) {
                            final int value = this.get();
                            if (value >= 2) {
                                return;
                            }
                            if (value == 0) {
                                if (this.compareAndSet(0, 4)) {
                                    break;
                                }
                                continue;
                            }
                            else {
                                if (this.compareAndSet(1, 3)) {
                                    break Block_2;
                                }
                                continue;
                            }
                        }
                        this.a();
                        return;
                    }
                    final Thread i = this.I;
                    if (i != null) {
                        i.interrupt();
                        this.I = null;
                    }
                    this.set(4);
                    continue;
                }
            }
            
            @Override
            public boolean i() {
                return this.get() >= 2;
            }
            
            @Override
            public void run() {
                if (this.get() == 0) {
                    this.I = Thread.currentThread();
                    if (this.compareAndSet(0, 1)) {
                        try {
                            this.G.run();
                            this.I = null;
                            if (this.compareAndSet(1, 2)) {
                                this.a();
                                return;
                            }
                            while (this.get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        }
                        finally {
                            this.I = null;
                            if (!this.compareAndSet(1, 2)) {
                                while (this.get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            else {
                                this.a();
                            }
                        }
                    }
                    this.I = null;
                }
            }
        }
        
        final class c implements Runnable
        {
            private final h G;
            private final Runnable H;
            
            c(final h g, final Runnable h) {
                this.G = g;
                this.H = h;
            }
            
            @Override
            public void run() {
                this.G.a(d.c.this.b(this.H));
            }
        }
    }
}
