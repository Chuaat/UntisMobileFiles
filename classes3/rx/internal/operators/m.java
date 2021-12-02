// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import rx.o;
import rx.subscriptions.f;
import rx.d;
import rx.b;

public final class m implements j0
{
    final Iterable<? extends b> G;
    
    public m(final Iterable<? extends b> g) {
        this.G = g;
    }
    
    public void a(final d d) {
        try {
            final Iterator<? extends b> iterator = this.G.iterator();
            if (iterator == null) {
                d.a(f.e());
                d.b(new NullPointerException("The iterator returned is null"));
                return;
            }
            final a a = new a(d, iterator);
            d.a(a.I);
            a.d();
        }
        finally {
            d.a(f.e());
            final Throwable t;
            d.b(t);
        }
    }
    
    static final class a extends AtomicInteger implements d
    {
        private static final long J = -7965400327305809232L;
        final d G;
        final Iterator<? extends b> H;
        final rx.internal.subscriptions.b I;
        
        public a(final d g, final Iterator<? extends b> h) {
            this.G = g;
            this.H = h;
            this.I = new rx.internal.subscriptions.b();
        }
        
        @Override
        public void a(final o o) {
            this.I.b(o);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void c() {
            this.d();
        }
        
        void d() {
            if (this.I.g()) {
                return;
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
            final Iterator<? extends b> h = this.H;
            while (!this.I.g()) {
                try {
                    if (!h.hasNext()) {
                        this.G.c();
                        return;
                    }
                    try {
                        final b b = (b)h.next();
                        if (b == null) {
                            this.G.b(new NullPointerException("The completable returned is null"));
                            return;
                        }
                        b.G0(this);
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        continue;
                    }
                    finally {
                        final Throwable t;
                        this.G.b(t);
                    }
                }
                finally {
                    this.G.b((Throwable)h);
                }
            }
        }
    }
}
