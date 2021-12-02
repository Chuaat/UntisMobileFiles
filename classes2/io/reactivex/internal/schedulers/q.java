// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.f;
import io.reactivex.internal.util.k;
import io.reactivex.processors.h;
import x5.o;
import io.reactivex.disposables.d;
import io.reactivex.l;
import io.reactivex.disposables.c;
import io.reactivex.j0;

public class q extends j0 implements io.reactivex.disposables.c
{
    static final io.reactivex.disposables.c K;
    static final io.reactivex.disposables.c L;
    private final j0 H;
    private final io.reactivex.processors.c<l<io.reactivex.c>> I;
    private io.reactivex.disposables.c J;
    
    static {
        K = new g();
        L = io.reactivex.disposables.d.a();
    }
    
    public q(final o<l<l<io.reactivex.c>>, io.reactivex.c> o, final j0 h) {
        this.H = h;
        final io.reactivex.processors.c<l<io.reactivex.c>> t8 = h.V8().T8();
        this.I = t8;
        try {
            this.J = o.apply(t8).I0();
        }
        finally {
            final Throwable t9;
            throw k.f(t9);
        }
    }
    
    @io.reactivex.annotations.f
    @Override
    public j0.c c() {
        final j0.c c = this.H.c();
        final io.reactivex.processors.c<Object> t8 = h.V8().T8();
        final l<Object> n3 = t8.N3((o<? super Object, ?>)new a(c));
        final e e = new e((io.reactivex.processors.c<f>)t8, c);
        ((o7.c)this.I).m((Object)n3);
        return e;
    }
    
    @Override
    public void dispose() {
        this.J.dispose();
    }
    
    @Override
    public boolean i() {
        return this.J.i();
    }
    
    static final class a implements o<f, io.reactivex.c>
    {
        final j0.c G;
        
        a(final j0.c g) {
            this.G = g;
        }
        
        public io.reactivex.c a(final f f) {
            return new q.a.a(f);
        }
        
        final class a extends io.reactivex.c
        {
            final f G;
            
            a(final f g) {
                this.G = g;
            }
            
            @Override
            protected void L0(final io.reactivex.f f) {
                f.l(this.G);
                this.G.a(q.a.this.G, f);
            }
        }
    }
    
    static class b extends f
    {
        private final Runnable G;
        private final long H;
        private final TimeUnit I;
        
        b(final Runnable g, final long h, final TimeUnit i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        protected c b(final j0.c c, final io.reactivex.f f) {
            return c.c(new d(this.G, f), this.H, this.I);
        }
    }
    
    static class c extends f
    {
        private final Runnable G;
        
        c(final Runnable g) {
            this.G = g;
        }
        
        @Override
        protected io.reactivex.disposables.c b(final j0.c c, final io.reactivex.f f) {
            return c.b(new d(this.G, f));
        }
    }
    
    static class d implements Runnable
    {
        final io.reactivex.f G;
        final Runnable H;
        
        d(final Runnable h, final io.reactivex.f g) {
            this.H = h;
            this.G = g;
        }
        
        @Override
        public void run() {
            try {
                this.H.run();
            }
            finally {
                this.G.f();
            }
        }
    }
    
    static final class e extends j0.c
    {
        private final AtomicBoolean G;
        private final io.reactivex.processors.c<f> H;
        private final j0.c I;
        
        e(final io.reactivex.processors.c<f> h, final j0.c i) {
            this.H = h;
            this.I = i;
            this.G = new AtomicBoolean();
        }
        
        @io.reactivex.annotations.f
        @Override
        public c b(@io.reactivex.annotations.f final Runnable runnable) {
            final q.c c = new q.c(runnable);
            ((o7.c)this.H).m((Object)c);
            return c;
        }
        
        @io.reactivex.annotations.f
        @Override
        public c c(@io.reactivex.annotations.f final Runnable runnable, final long n, @io.reactivex.annotations.f final TimeUnit timeUnit) {
            final q.b b = new q.b(runnable, n, timeUnit);
            ((o7.c)this.H).m((Object)b);
            return b;
        }
        
        @Override
        public void dispose() {
            if (this.G.compareAndSet(false, true)) {
                ((o7.c)this.H).f();
                this.I.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return this.G.get();
        }
    }
    
    abstract static class f extends AtomicReference<c> implements c
    {
        f() {
            super(q.K);
        }
        
        void a(final j0.c c, final io.reactivex.f f) {
            final c c2 = this.get();
            if (c2 == q.L) {
                return;
            }
            final c k = q.K;
            if (c2 != k) {
                return;
            }
            final c b = this.b(c, f);
            if (!this.compareAndSet(k, b)) {
                b.dispose();
            }
        }
        
        protected abstract c b(final j0.c p0, final io.reactivex.f p1);
        
        @Override
        public void dispose() {
            c expectedValue;
            do {
                expectedValue = this.get();
                if (expectedValue == q.L) {
                    return;
                }
            } while (!this.compareAndSet(expectedValue, q.L));
            if (expectedValue != q.K) {
                expectedValue.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return this.get().i();
        }
    }
    
    static final class g implements c
    {
        @Override
        public void dispose() {
        }
        
        @Override
        public boolean i() {
            return false;
        }
    }
}
