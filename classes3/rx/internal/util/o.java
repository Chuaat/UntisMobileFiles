// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.a;
import rx.internal.schedulers.b;
import rx.j;
import rx.observers.h;
import rx.functions.p;
import rx.internal.producers.f;
import rx.i;
import rx.n;
import rx.plugins.c;
import rx.g;

public final class o<T> extends rx.g<T>
{
    static final boolean I;
    final T H;
    
    static {
        I = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false"));
    }
    
    protected o(final T h) {
        super(rx.plugins.c.G(new d<T>(h)));
        this.H = h;
    }
    
    public static <T> o<T> E7(final T t) {
        return new o<T>(t);
    }
    
    static <T> i F7(final n<? super T> n, final T t) {
        if (o.I) {
            return new rx.internal.producers.f<Object>(n, t);
        }
        return new g<Object>(n, t);
    }
    
    public T G7() {
        return this.H;
    }
    
    public <R> rx.g<R> H7(final p<? super T, ? extends rx.g<? extends R>> p) {
        return rx.g.Q6((a<R>)new a<R>() {
            public void a(final n<? super R> n) {
                final g<Object> g = p.h(o.this.H);
                if (g instanceof o) {
                    n.s0(o.F7((n<? super T>)n, (T)((o<Object>)g).H));
                }
                else {
                    g.R6(h.f((n<? super Object>)n));
                }
            }
        });
    }
    
    public rx.g<T> I7(final j j) {
        p<rx.functions.a, rx.o> p;
        if (j instanceof rx.internal.schedulers.b) {
            p = new p<rx.functions.a, rx.o>() {
                final /* synthetic */ rx.internal.schedulers.b G = (rx.internal.schedulers.b)j;
                
                public rx.o a(final rx.functions.a a) {
                    return this.G.d(a);
                }
            };
        }
        else {
            p = new p<rx.functions.a, rx.o>() {
                public rx.o a(final rx.functions.a a) {
                    final j.a a2 = j.a();
                    a2.c(new rx.functions.a() {
                        @Override
                        public void call() {
                            try {
                                a.call();
                            }
                            finally {
                                a2.i();
                            }
                        }
                    });
                    return a2;
                }
            };
        }
        return rx.g.Q6((a<T>)new e(this.H, p));
    }
    
    static final class d<T> implements a<T>
    {
        final T G;
        
        d(final T g) {
            this.G = g;
        }
        
        public void a(final n<? super T> n) {
            n.s0(o.F7(n, this.G));
        }
    }
    
    static final class e<T> implements a<T>
    {
        final T G;
        final p<rx.functions.a, rx.o> H;
        
        e(final T g, final p<rx.functions.a, rx.o> h) {
            this.G = g;
            this.H = h;
        }
        
        public void a(final n<? super T> n) {
            n.s0(new f<Object>(n, this.G, this.H));
        }
    }
    
    static final class f<T> extends AtomicBoolean implements i, a
    {
        private static final long J = -2466317989629281651L;
        final n<? super T> G;
        final T H;
        final p<a, rx.o> I;
        
        public f(final n<? super T> g, final T h, final p<a, rx.o> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void call() {
            final n<? super T> g = this.G;
            if (g.g()) {
                return;
            }
            final T h = this.H;
            try {
                g.m(h);
                if (g.g()) {
                    return;
                }
                g.c();
            }
            finally {
                final Throwable t;
                rx.exceptions.c.g(t, g, h);
            }
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ScalarAsyncProducer[");
            sb.append(this.H);
            sb.append(", ");
            sb.append(this.get());
            sb.append("]");
            return sb.toString();
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n != 0 && this.compareAndSet(false, true)) {
                    this.G.r(this.I.h(this));
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class g<T> implements i
    {
        final n<? super T> G;
        final T H;
        boolean I;
        
        public g(final n<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void v(final long lng) {
            if (this.I) {
                return;
            }
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n == 0) {
                    return;
                }
                this.I = true;
                final n<? super T> g = this.G;
                if (g.g()) {
                    return;
                }
                final T h = this.H;
                try {
                    g.m(h);
                    if (g.g()) {
                        return;
                    }
                    g.c();
                    return;
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.g(t, g, h);
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= required but it was ");
            sb.append(lng);
            throw new IllegalStateException(sb.toString());
        }
    }
}
