// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import rx.functions.a;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.d;
import rx.subjects.c;
import rx.functions.p;
import rx.subscriptions.f;
import rx.b;
import rx.g;
import rx.h;
import rx.o;
import rx.j;

public class l extends j implements o
{
    static final o J;
    static final o K;
    private final j G;
    private final h<rx.g<b>> H;
    private final o I;
    
    static {
        J = new o() {
            @Override
            public boolean g() {
                return false;
            }
            
            @Override
            public void i() {
            }
        };
        K = rx.subscriptions.f.e();
    }
    
    public l(final p<rx.g<rx.g<b>>, b> p2, final j g) {
        this.G = g;
        final c<Object> g2 = c.G7();
        this.H = new rx.observers.f<rx.g<b>>((h<? super rx.g<b>>)g2);
        this.I = p2.h(g2.V3()).n0();
    }
    
    @Override
    public a a() {
        final a a = this.G.a();
        final rx.internal.operators.g<Object> g7 = rx.internal.operators.g.G7();
        final rx.observers.f f = new rx.observers.f((h<? super Object>)g7);
        final rx.g<Object> k3 = g7.k3((p<? super Object, ?>)new p<g, b>() {
            public b a(final g g) {
                return b.p((b.j0)new b.j0() {
                    public void a(final rx.d d) {
                        d.a(g);
                        g.b(a, d);
                    }
                });
            }
        });
        final a a2 = new a() {
            private final AtomicBoolean G = new AtomicBoolean();
            
            @Override
            public o c(final rx.functions.a a) {
                final e e = new e(a);
                f.m(e);
                return e;
            }
            
            @Override
            public o d(final rx.functions.a a, final long n, final TimeUnit timeUnit) {
                final d d = new d(a, n, timeUnit);
                f.m(d);
                return d;
            }
            
            @Override
            public boolean g() {
                return this.G.get();
            }
            
            @Override
            public void i() {
                if (this.G.compareAndSet(false, true)) {
                    a.i();
                    f.c();
                }
            }
        };
        this.H.m((rx.g<b>)k3);
        return a2;
    }
    
    @Override
    public boolean g() {
        return this.I.g();
    }
    
    @Override
    public void i() {
        this.I.i();
    }
    
    static class d extends g
    {
        private final rx.functions.a G;
        private final long H;
        private final TimeUnit I;
        
        public d(final rx.functions.a g, final long h, final TimeUnit i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        protected o c(final a a, final rx.d d) {
            return a.d(new f(this.G, d), this.H, this.I);
        }
    }
    
    static class e extends g
    {
        private final rx.functions.a G;
        
        public e(final rx.functions.a g) {
            this.G = g;
        }
        
        @Override
        protected o c(final a a, final rx.d d) {
            return a.c(new f(this.G, d));
        }
    }
    
    static class f implements a
    {
        private rx.d G;
        private a H;
        
        public f(final a h, final rx.d g) {
            this.H = h;
            this.G = g;
        }
        
        @Override
        public void call() {
            try {
                this.H.call();
            }
            finally {
                this.G.c();
            }
        }
    }
    
    abstract static class g extends AtomicReference<o> implements o
    {
        public g() {
            super(l.J);
        }
        
        private void b(final a a, final rx.d d) {
            final o o = this.get();
            if (o == l.K) {
                return;
            }
            final o j = l.J;
            if (o != j) {
                return;
            }
            final o c = this.c(a, d);
            if (!this.compareAndSet(j, c)) {
                c.i();
            }
        }
        
        protected abstract o c(final a p0, final rx.d p1);
        
        @Override
        public boolean g() {
            return this.get().g();
        }
        
        @Override
        public void i() {
            o expectedValue;
            do {
                expectedValue = this.get();
                if (expectedValue == l.K) {
                    return;
                }
            } while (!this.compareAndSet(expectedValue, l.K));
            if (expectedValue != l.J) {
                expectedValue.i();
            }
        }
    }
}
