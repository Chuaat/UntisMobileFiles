// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Iterator;
import rx.functions.a;
import rx.observers.h;
import rx.functions.b;
import java.util.ArrayList;
import rx.n;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.subjects.f;
import rx.functions.o;
import rx.g;
import rx.observables.c;

public final class t2<T, R> extends c<R>
{
    final g<? extends T> H;
    final Object I;
    final o<? extends f<? super T, ? extends R>> J;
    final AtomicReference<f<? super T, ? extends R>> K;
    final List<n<? super R>> L;
    n<T> M;
    rx.o N;
    
    private t2(final Object i, final AtomicReference<f<? super T, ? extends R>> k, final List<n<? super R>> l, final g<? extends T> h, final o<? extends f<? super T, ? extends R>> j) {
        super(new a<R>() {
            public void a(final n<? super R> n) {
                synchronized (i) {
                    if (k.get() == null) {
                        l.add(n);
                    }
                    else {
                        k.get().R6(n);
                    }
                }
            }
        });
        this.I = i;
        this.K = k;
        this.L = l;
        this.H = h;
        this.J = j;
    }
    
    public t2(final g<? extends T> g, final o<? extends f<? super T, ? extends R>> o) {
        this(new Object(), (AtomicReference)new AtomicReference(), (List)new ArrayList(), g, o);
    }
    
    @Override
    public void I7(final rx.functions.b<? super rx.o> b) {
        synchronized (this.I) {
            if (this.M != null) {
                b.h(this.N);
                return;
            }
            final f newValue = (f)this.J.call();
            this.M = h.e((rx.h<? super T>)newValue);
            final AtomicReference<rx.o> atomicReference = new AtomicReference<rx.o>();
            atomicReference.set(rx.subscriptions.f.a(new rx.functions.a() {
                @Override
                public void call() {
                    synchronized (t2.this.I) {
                        if (t2.this.N == atomicReference.get()) {
                            final t2 h = t2.this;
                            final n<T> m = h.M;
                            h.M = null;
                            h.N = null;
                            h.K.set(null);
                            // monitorexit(this.H.I)
                            if (m != null) {
                                m.i();
                            }
                        }
                    }
                }
            }));
            this.N = atomicReference.get();
            for (final n<? super Object> n : this.L) {
                newValue.R6(new n<R>(n) {
                    @Override
                    public void b(final Throwable t) {
                        n.b(t);
                    }
                    
                    @Override
                    public void c() {
                        n.c();
                    }
                    
                    @Override
                    public void m(final R r) {
                        n.m(r);
                    }
                });
            }
            this.L.clear();
            this.K.set(newValue);
            // monitorexit(this.I)
            b.h(this.N);
            synchronized (this.I) {
                final n<T> m = this.M;
                // monitorexit(this.I)
                if (m != null) {
                    this.H.z5(m);
                }
            }
        }
    }
}
