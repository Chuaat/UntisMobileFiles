// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.internal.subscriptions.a;
import rx.functions.n;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;
import rx.d;
import rx.c;
import rx.b;

public final class j implements j0
{
    final rx.functions.b<c> G;
    
    public j(final rx.functions.b<c> g) {
        this.G = g;
    }
    
    public void a(final d d) {
        final a a = new a(d);
        d.a(a);
        try {
            this.G.h(a);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            a.b(t);
        }
    }
    
    static final class a extends AtomicBoolean implements c, o
    {
        private static final long I = 5539301318568668881L;
        final d G;
        final rx.internal.subscriptions.b H;
        
        public a(final d g) {
            this.G = g;
            this.H = new rx.internal.subscriptions.b();
        }
        
        @Override
        public void a(final o o) {
            this.H.d(o);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.compareAndSet(false, true)) {
                try {
                    this.G.b(t);
                    return;
                }
                finally {
                    this.H.i();
                }
            }
            rx.plugins.c.I(t);
        }
        
        @Override
        public void c() {
            if (this.compareAndSet(false, true)) {
                try {
                    this.G.c();
                }
                finally {
                    this.H.i();
                }
            }
        }
        
        @Override
        public void e(final n n) {
            this.a(new rx.internal.subscriptions.a(n));
        }
        
        @Override
        public boolean g() {
            return this.get();
        }
        
        @Override
        public void i() {
            if (this.compareAndSet(false, true)) {
                this.H.i();
            }
        }
    }
}
