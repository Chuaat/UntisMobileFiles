// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.internal.subscriptions.a;
import rx.functions.n;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.c;
import rx.o;
import rx.m;
import rx.l;
import rx.functions.b;
import rx.k;

public final class r4<T> implements t<T>
{
    final b<l<T>> G;
    
    public r4(final b<l<T>> g) {
        this.G = g;
    }
    
    public void a(final m<? super T> m) {
        final a<T> a = new a<T>(m);
        m.d(a);
        try {
            this.G.h(a);
        }
        finally {
            final Throwable t;
            c.e(t);
            a.b(t);
        }
    }
    
    static final class a<T> extends AtomicBoolean implements l<T>, o
    {
        private static final long I = 8082834163465882809L;
        final m<? super T> G;
        final rx.internal.subscriptions.b H;
        
        a(final m<? super T> g) {
            this.G = g;
            this.H = new rx.internal.subscriptions.b();
        }
        
        @Override
        public void a(final o o) {
            this.H.d(o);
        }
        
        @Override
        public void b(final Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException();
            }
            if (this.compareAndSet(false, true)) {
                try {
                    this.G.b(t2);
                    return;
                }
                finally {
                    this.H.i();
                }
            }
            rx.plugins.c.I(t2);
        }
        
        @Override
        public void d(final T t) {
            if (this.compareAndSet(false, true)) {
                try {
                    this.G.e((Object)t);
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
