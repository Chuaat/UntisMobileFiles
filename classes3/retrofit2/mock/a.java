// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.mock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.e0;
import retrofit2.t;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import retrofit2.d;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import retrofit2.b;

final class a<T> implements b<T>
{
    final f G;
    final ExecutorService H;
    final b<T> I;
    private volatile Future<?> J;
    volatile boolean K;
    @d6.a("this")
    private boolean L;
    
    a(final f g, final ExecutorService h, final b<T> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public boolean G() {
        synchronized (this) {
            return this.L;
        }
    }
    
    @Override
    public boolean K() {
        return this.K;
    }
    
    @Override
    public b<T> M() {
        return new a(this.G, this.H, (b<Object>)this.I.M());
    }
    
    @Override
    public void N2(final d<T> obj) {
        Objects.requireNonNull(obj, "callback == null");
        synchronized (this) {
            if (!this.L) {
                this.L = true;
                // monitorexit(this)
                this.J = this.H.submit(new Runnable() {
                    boolean a() {
                        final long a = retrofit2.mock.a.this.G.a(TimeUnit.MILLISECONDS);
                        if (a > 0L) {
                            try {
                                Thread.sleep(a);
                            }
                            catch (InterruptedException ex) {
                                obj.a(retrofit2.mock.a.this, new IOException("canceled"));
                                return false;
                            }
                        }
                        return true;
                    }
                    
                    @Override
                    public void run() {
                        d d;
                        a a;
                        Throwable j;
                        if (retrofit2.mock.a.this.K) {
                            d = obj;
                            a = retrofit2.mock.a.this;
                            j = new IOException("canceled");
                        }
                        else if (retrofit2.mock.a.this.G.c()) {
                            if (!this.a()) {
                                return;
                            }
                            d = obj;
                            a = retrofit2.mock.a.this;
                            j = a.G.j();
                        }
                        else {
                            if (!retrofit2.mock.a.this.G.b()) {
                                retrofit2.mock.a.this.I.N2(new d<T>() {
                                    @Override
                                    public void a(final b<T> b, final Throwable t) {
                                        if (Runnable.this.a()) {
                                            obj.a(b, t);
                                        }
                                    }
                                    
                                    @Override
                                    public void b(final b<T> b, final t<T> t) {
                                        if (Runnable.this.a()) {
                                            obj.b(b, t);
                                        }
                                    }
                                });
                                return;
                            }
                            if (this.a()) {
                                final d g = obj;
                                final a h = retrofit2.mock.a.this;
                                g.b(h, h.G.g());
                            }
                            return;
                        }
                        d.a(a, j);
                    }
                });
                return;
            }
            throw new IllegalStateException("Already executed");
        }
    }
    
    @Override
    public void cancel() {
        this.K = true;
        final Future<?> j = this.J;
        if (j != null) {
            j.cancel(true);
        }
    }
    
    @Override
    public e0 k() {
        return this.I.k();
    }
    
    @Override
    public t<T> p() throws IOException {
        final AtomicReference<t<T>> atomicReference = new AtomicReference<t<T>>();
        final AtomicReference<Throwable> atomicReference2 = new AtomicReference<Throwable>();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.N2(new d<T>() {
            @Override
            public void a(final b<T> b, final Throwable newValue) {
                atomicReference2.set(newValue);
                countDownLatch.countDown();
            }
            
            @Override
            public void b(final b<T> b, final t<T> newValue) {
                atomicReference.set(newValue);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            final t<T> t = atomicReference.get();
            if (t != null) {
                return t;
            }
            final Throwable cause = atomicReference2.get();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            throw new RuntimeException(cause);
        }
        catch (InterruptedException ex) {
            throw new IOException("canceled");
        }
    }
}
