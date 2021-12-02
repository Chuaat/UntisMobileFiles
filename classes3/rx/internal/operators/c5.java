// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import rx.o;
import rx.subscriptions.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.NoSuchElementException;
import rx.m;
import rx.functions.y;
import rx.k;

public final class c5
{
    private c5() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, R> k<R> a(final k<? extends T>[] array, final y<? extends R> y) {
        return k.n((k.t<R>)new k.t<R>() {
            public void a(final m<? super R> m) {
                if (array.length == 0) {
                    m.b(new NoSuchElementException("Can't zip 0 Singles."));
                    return;
                }
                final AtomicInteger atomicInteger = new AtomicInteger(array.length);
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final Object[] array = new Object[array.length];
                final rx.subscriptions.b b = new rx.subscriptions.b();
                m.d(b);
                for (int n = 0; n < array.length && !b.g(); ++n) {
                    if (atomicBoolean.get()) {
                        break;
                    }
                    final m<T> i = new m<T>() {
                        @Override
                        public void b(final Throwable t) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                m.b(t);
                            }
                            else {
                                c.I(t);
                            }
                        }
                        
                        @Override
                        public void e(final T t) {
                            array[n] = t;
                            if (atomicInteger.decrementAndGet() == 0) {
                                try {
                                    m.e(y.call(array));
                                }
                                finally {
                                    final Throwable t2;
                                    rx.exceptions.c.e(t2);
                                    this.b(t2);
                                }
                            }
                        }
                    };
                    b.a(i);
                    if (b.g()) {
                        break;
                    }
                    if (atomicBoolean.get()) {
                        break;
                    }
                    array[n].j0(i);
                }
            }
        });
    }
}
