// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.e;
import io.reactivex.disposables.c;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import io.reactivex.j0;

public final class b extends j0 implements o
{
    static final b J;
    private static final String K = "RxComputationThreadPool";
    static final k L;
    static final String M = "rx2.computation-threads";
    static final int N;
    static final c O;
    private static final String P = "rx2.computation-priority";
    final ThreadFactory H;
    final AtomicReference<b> I;
    
    static {
        N = l(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0));
        (O = new c(new k("RxComputationShutdown"))).dispose();
        (J = new b(0, L = new k("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5))), true))).c();
    }
    
    public b() {
        this(b.L);
    }
    
    public b(final ThreadFactory h) {
        this.H = h;
        this.I = new AtomicReference<b>(b.J);
        this.j();
    }
    
    static int l(final int n, final int n2) {
        int n3 = n;
        if (n2 > 0) {
            if (n2 > n) {
                n3 = n;
            }
            else {
                n3 = n2;
            }
        }
        return n3;
    }
    
    @Override
    public void a(final int n, final o.a a) {
        b.h(n, "number > 0 required");
        this.I.get().a(n, a);
    }
    
    @f
    @Override
    public j0.c c() {
        return new a(this.I.get().b());
    }
    
    @f
    @Override
    public io.reactivex.disposables.c f(@f final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.I.get().b().f(runnable, n, timeUnit);
    }
    
    @f
    @Override
    public io.reactivex.disposables.c g(@f final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.I.get().b().g(runnable, n, n2, timeUnit);
    }
    
    @Override
    public void h() {
        b expectedValue;
        b j;
        do {
            expectedValue = this.I.get();
            j = b.J;
            if (expectedValue == j) {
                return;
            }
        } while (!this.I.compareAndSet(expectedValue, j));
        expectedValue.c();
    }
    
    @Override
    public void j() {
        final b newValue = new b(b.N, this.H);
        if (!this.I.compareAndSet(b.J, newValue)) {
            newValue.c();
        }
    }
    
    static final class a extends j0.c
    {
        private final io.reactivex.internal.disposables.f G;
        private final io.reactivex.disposables.b H;
        private final io.reactivex.internal.disposables.f I;
        private final c J;
        volatile boolean K;
        
        a(final c j) {
            this.J = j;
            final io.reactivex.internal.disposables.f g = new io.reactivex.internal.disposables.f();
            this.G = g;
            final io.reactivex.disposables.b h = new io.reactivex.disposables.b();
            this.H = h;
            final io.reactivex.internal.disposables.f i = new io.reactivex.internal.disposables.f();
            (this.I = i).b(g);
            i.b(h);
        }
        
        @f
        @Override
        public c b(@f final Runnable runnable) {
            if (this.K) {
                return e.G;
            }
            return this.J.e(runnable, 0L, TimeUnit.MILLISECONDS, this.G);
        }
        
        @f
        @Override
        public c c(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
            if (this.K) {
                return e.G;
            }
            return this.J.e(runnable, n, timeUnit, this.H);
        }
        
        @Override
        public void dispose() {
            if (!this.K) {
                this.K = true;
                this.I.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return this.K;
        }
    }
    
    static final class b implements o
    {
        final int G;
        final c[] H;
        long I;
        
        b(final int g, final ThreadFactory threadFactory) {
            this.G = g;
            this.H = new c[g];
            for (int i = 0; i < g; ++i) {
                this.H[i] = new c(threadFactory);
            }
        }
        
        @Override
        public void a(final int n, final o.a a) {
            final int g = this.G;
            int i = 0;
            if (g == 0) {
                while (i < n) {
                    a.a(i, io.reactivex.internal.schedulers.b.O);
                    ++i;
                }
            }
            else {
                int n2 = (int)this.I % g;
                for (int j = 0; j < n; ++j) {
                    a.a(j, new io.reactivex.internal.schedulers.b.a(this.H[n2]));
                    if (++n2 == g) {
                        n2 = 0;
                    }
                }
                this.I = n2;
            }
        }
        
        public c b() {
            final int g = this.G;
            if (g == 0) {
                return io.reactivex.internal.schedulers.b.O;
            }
            final c[] h = this.H;
            final long i = this.I;
            this.I = 1L + i;
            return h[(int)(i % g)];
        }
        
        public void c() {
            final c[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].dispose();
            }
        }
    }
    
    static final class c extends i
    {
        c(final ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
