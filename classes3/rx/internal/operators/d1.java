// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.n;
import rx.subscriptions.f;
import rx.functions.a;
import rx.o;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;
import rx.subscriptions.b;
import rx.observables.c;
import rx.g;

public final class d1<T> implements a<T>
{
    private final rx.observables.c<? extends T> G;
    volatile b H;
    final AtomicInteger I;
    final ReentrantLock J;
    
    public d1(final rx.observables.c<? extends T> g) {
        this.H = new b();
        this.I = new AtomicInteger(0);
        this.J = new ReentrantLock();
        this.G = g;
    }
    
    private o c(final b b) {
        return f.a(new rx.functions.a() {
            @Override
            public void call() {
                d1.this.J.lock();
                try {
                    if (d1.this.H == b && d1.this.I.decrementAndGet() == 0) {
                        if (d1.this.G instanceof o) {
                            ((o)d1.this.G).i();
                        }
                        d1.this.H.i();
                        d1.this.H = new b();
                    }
                }
                finally {
                    d1.this.J.unlock();
                }
            }
        });
    }
    
    private rx.functions.b<o> e(final n<? super T> n, final AtomicBoolean atomicBoolean) {
        return new rx.functions.b<o>() {
            public void a(final o o) {
                try {
                    d1.this.H.a(o);
                    final d1 i = d1.this;
                    i.d(n, i.H);
                }
                finally {
                    d1.this.J.unlock();
                    atomicBoolean.set(false);
                }
            }
        };
    }
    
    public void b(final n<? super T> n) {
        this.J.lock();
        if (this.I.incrementAndGet() == 1) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.G.I7(this.e(n, atomicBoolean));
                if (atomicBoolean.get()) {
                    return;
                }
                return;
            }
            finally {
                if (atomicBoolean.get()) {
                    this.J.unlock();
                }
            }
        }
        try {
            this.d(n, this.H);
        }
        finally {
            this.J.unlock();
        }
    }
    
    void d(final n<? super T> n, final b b) {
        n.r(this.c(b));
        this.G.R6(new n<T>(n) {
            @Override
            public void b(final Throwable t) {
                this.w();
                n.b(t);
            }
            
            @Override
            public void c() {
                this.w();
                n.c();
            }
            
            @Override
            public void m(final T t) {
                n.m(t);
            }
            
            void w() {
                d1.this.J.lock();
                try {
                    if (d1.this.H == b) {
                        if (d1.this.G instanceof o) {
                            ((o)d1.this.G).i();
                        }
                        d1.this.H.i();
                        d1.this.H = new b();
                        d1.this.I.set(0);
                    }
                }
                finally {
                    d1.this.J.unlock();
                }
            }
        });
    }
}
