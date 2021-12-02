// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.io.Serializable;
import rx.exceptions.c;
import rx.observers.h;
import rx.n;
import rx.functions.a;
import rx.functions.b;
import rx.functions.p;
import rx.functions.o;
import rx.g;

public final class q1<T, Resource> implements g.a<T>
{
    private final o<Resource> G;
    private final p<? super Resource, ? extends g<? extends T>> H;
    private final b<? super Resource> I;
    private final boolean J;
    
    public q1(final o<Resource> g, final p<? super Resource, ? extends g<? extends T>> h, final b<? super Resource> i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    private Throwable b(final rx.functions.a a) {
        try {
            a.call();
            return null;
        }
        finally {
            return;
        }
    }
    
    public void a(final n<? super T> n) {
        try {
            final Resource call = this.G.call();
            Serializable s = new a<Object>(this.I, call);
            n.r((rx.o)s);
            try {
                final g g = (g)this.H.h((Object)call);
                g g2;
                if (this.J) {
                    g2 = g.W1((rx.functions.a)s);
                }
                else {
                    g2 = g.O1((rx.functions.a)s);
                }
                try {
                    g2.R6(h.f((n<? super T>)n));
                }
                finally {
                    final Throwable b = this.b((rx.functions.a)s);
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    rx.exceptions.c.e(b);
                    if (b != null) {
                        s = new rx.exceptions.b(new Throwable[] { t, b });
                        n.b((Throwable)s);
                        return;
                    }
                    n.b(t);
                }
            }
            finally {
                final Throwable b2 = this.b((rx.functions.a)s);
                final Throwable t2;
                rx.exceptions.c.e(t2);
                rx.exceptions.c.e(b2);
                if (b2 != null) {
                    n.b(new rx.exceptions.b(new Throwable[] { t2, b2 }));
                }
                else {
                    n.b(t2);
                }
            }
        }
        finally {
            final Throwable t3;
            rx.exceptions.c.f(t3, n);
        }
    }
    
    static final class a<Resource> extends AtomicBoolean implements rx.functions.a, o
    {
        private static final long I = 4262875056400218316L;
        private b<? super Resource> G;
        private Resource H;
        
        a(final b<? super Resource> g, final Resource h) {
            this.G = g;
            this.H = h;
            this.lazySet(false);
        }
        
        @Override
        public void call() {
            if (this.compareAndSet(false, true)) {
                try {
                    this.G.h((Object)this.H);
                }
                finally {
                    this.H = null;
                    this.G = null;
                }
            }
        }
        
        @Override
        public boolean g() {
            return this.get();
        }
        
        @Override
        public void i() {
            this.call();
        }
    }
}
