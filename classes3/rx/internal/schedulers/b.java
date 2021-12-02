// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import rx.subscriptions.f;
import rx.internal.util.q;
import java.util.concurrent.TimeUnit;
import rx.o;
import rx.functions.a;
import rx.internal.util.n;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import rx.j;

public final class b extends j implements k
{
    static final String I = "rx.scheduler.max-computation-threads";
    static final int J;
    static final c K;
    static final b L;
    final ThreadFactory G;
    final AtomicReference<b> H;
    
    static {
        final int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0);
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        int j;
        if (intValue <= 0 || (j = intValue) > availableProcessors) {
            j = availableProcessors;
        }
        J = j;
        (K = new c(n.I)).i();
        L = new b(null, 0);
    }
    
    public b(final ThreadFactory g) {
        this.G = g;
        this.H = new AtomicReference<b>(b.L);
        this.start();
    }
    
    @Override
    public j.a a() {
        return new a(this.H.get().a());
    }
    
    public o d(final rx.functions.a a) {
        return this.H.get().a().t(a, -1L, TimeUnit.NANOSECONDS);
    }
    
    @Override
    public void shutdown() {
        b expectedValue;
        b l;
        do {
            expectedValue = this.H.get();
            l = b.L;
            if (expectedValue == l) {
                return;
            }
        } while (!this.H.compareAndSet(expectedValue, l));
        expectedValue.b();
    }
    
    @Override
    public void start() {
        final b newValue = new b(this.G, b.J);
        if (!this.H.compareAndSet(b.L, newValue)) {
            newValue.b();
        }
    }
    
    static final class a extends j.a
    {
        private final q G;
        private final b H;
        private final q I;
        private final c J;
        
        a(final c j) {
            final q g = new q();
            this.G = g;
            final b h = new b();
            this.H = h;
            this.I = new q(new o[] { g, h });
            this.J = j;
        }
        
        @Override
        public o c(final rx.functions.a a) {
            if (this.g()) {
                return f.e();
            }
            return this.J.v(new rx.functions.a() {
                @Override
                public void call() {
                    if (a.this.g()) {
                        return;
                    }
                    a.call();
                }
            }, 0L, null, this.G);
        }
        
        @Override
        public o d(final rx.functions.a a, final long n, final TimeUnit timeUnit) {
            if (this.g()) {
                return f.e();
            }
            return this.J.w(new rx.functions.a() {
                @Override
                public void call() {
                    if (a.this.g()) {
                        return;
                    }
                    a.call();
                }
            }, n, timeUnit, this.H);
        }
        
        @Override
        public boolean g() {
            return this.I.g();
        }
        
        @Override
        public void i() {
            this.I.i();
        }
    }
    
    static final class b
    {
        final int a;
        final c[] b;
        long c;
        
        b(final ThreadFactory threadFactory, final int a) {
            this.a = a;
            this.b = new c[a];
            for (int i = 0; i < a; ++i) {
                this.b[i] = new c(threadFactory);
            }
        }
        
        public c a() {
            final int a = this.a;
            if (a == 0) {
                return rx.internal.schedulers.b.K;
            }
            final c[] b = this.b;
            final long c = this.c;
            this.c = 1L + c;
            return b[(int)(c % a)];
        }
        
        public void b() {
            final c[] b = this.b;
            for (int length = b.length, i = 0; i < length; ++i) {
                b[i].i();
            }
        }
    }
    
    static final class c extends h
    {
        c(final ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
