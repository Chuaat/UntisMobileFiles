// 
// Decompiled by Procyon v0.5.36
// 

package rx.singles;

import rx.exceptions.c;
import rx.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.operators.e;
import java.util.concurrent.Future;
import rx.k;

public final class a<T>
{
    private final k<? extends T> a;
    
    private a(final k<? extends T> a) {
        this.a = a;
    }
    
    public static <T> a<T> a(final k<? extends T> k) {
        return new a<T>(k);
    }
    
    public Future<T> b() {
        return e.a(this.a.z0());
    }
    
    public T c() {
        final AtomicReference<T> atomicReference = new AtomicReference<T>();
        final AtomicReference<Throwable> atomicReference2 = new AtomicReference<Throwable>();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        rx.internal.util.e.a(countDownLatch, this.a.j0(new m<T>() {
            @Override
            public void b(final Throwable newValue) {
                atomicReference2.set(newValue);
                countDownLatch.countDown();
            }
            
            @Override
            public void e(final T newValue) {
                atomicReference.set(newValue);
                countDownLatch.countDown();
            }
        }));
        final Throwable t = atomicReference2.get();
        if (t == null) {
            return atomicReference.get();
        }
        throw c.c(t);
    }
}
