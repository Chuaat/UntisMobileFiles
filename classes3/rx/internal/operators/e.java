// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import rx.o;
import rx.n;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import rx.g;

public final class e
{
    private e() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> Future<T> a(final g<? extends T> g) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        return new Future<T>() {
            private volatile boolean G;
            final /* synthetic */ o I = g.Y4().z5(new n<T>(countDownLatch, atomicReference2, atomicReference) {
                final /* synthetic */ CountDownLatch L;
                final /* synthetic */ AtomicReference M;
                final /* synthetic */ AtomicReference N;
                
                @Override
                public void b(final Throwable newValue) {
                    this.M.compareAndSet(null, newValue);
                    this.L.countDown();
                }
                
                @Override
                public void c() {
                    this.L.countDown();
                }
                
                @Override
                public void m(final T newValue) {
                    this.N.set(newValue);
                }
            });
            
            private T a() throws ExecutionException {
                final Throwable cause = atomicReference2.get();
                if (cause != null) {
                    throw new ExecutionException("Observable onError", cause);
                }
                if (!this.G) {
                    return atomicReference.get();
                }
                throw new CancellationException("Subscription unsubscribed");
            }
            
            @Override
            public boolean cancel(final boolean b) {
                if (countDownLatch.getCount() > 0L) {
                    this.G = true;
                    this.I.i();
                    countDownLatch.countDown();
                    return true;
                }
                return false;
            }
            
            @Override
            public T get() throws InterruptedException, ExecutionException {
                countDownLatch.await();
                return this.a();
            }
            
            @Override
            public T get(final long n, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                if (countDownLatch.await(n, unit)) {
                    return this.a();
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Timed out after ");
                sb.append(unit.toMillis(n));
                sb.append("ms waiting for underlying Observable.");
                throw new TimeoutException(sb.toString());
            }
            
            @Override
            public boolean isCancelled() {
                return this.G;
            }
            
            @Override
            public boolean isDone() {
                return countDownLatch.getCount() == 0L;
            }
        };
    }
}
