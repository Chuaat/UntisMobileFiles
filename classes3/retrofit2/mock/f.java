// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.mock;

import java.util.concurrent.TimeUnit;
import java.util.Objects;
import okhttp3.y;
import okhttp3.h0;
import retrofit2.t;
import java.util.concurrent.Callable;
import java.util.Random;

public final class f
{
    private static final int h = 2000;
    private static final int i = 40;
    private static final int j = 3;
    private static final int k = 0;
    private final Random a;
    private volatile long b;
    private volatile int c;
    private volatile int d;
    private volatile Throwable e;
    private volatile int f;
    private volatile Callable<t<?>> g;
    
    private f(final Random a) {
        this.b = 2000L;
        this.c = 40;
        this.d = 3;
        this.f = 0;
        this.g = new Callable<t<?>>() {
            public t<?> a() {
                return t.c(500, h0.create(null, new byte[0]));
            }
        };
        this.a = a;
        (this.e = new e()).setStackTrace(new StackTraceElement[0]);
    }
    
    private static void d(final int n, final String s) {
        if (n >= 0 && n <= 100) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static f e() {
        return new f(new Random());
    }
    
    public static f f(final Random obj) {
        Objects.requireNonNull(obj, "random == null");
        return new f(obj);
    }
    
    public long a(final TimeUnit sourceUnit) {
        final float n = this.c / 100.0f;
        final float n2 = 1.0f - n;
        return TimeUnit.MILLISECONDS.convert((long)(this.b * (n2 + this.a.nextFloat() * (n + 1.0f - n2))), sourceUnit);
    }
    
    public boolean b() {
        return this.a.nextInt(100) < this.f;
    }
    
    public boolean c() {
        return this.a.nextInt(100) < this.d;
    }
    
    public t<?> g() {
        try {
            final t<?> t = this.g.call();
            if (t == null) {
                throw new IllegalStateException("Error factory returned null.");
            }
            if (!t.g()) {
                return t;
            }
            throw new IllegalStateException("Error factory returned successful response.");
        }
        catch (Exception cause) {
            throw new IllegalStateException("Error factory threw an exception.", cause);
        }
    }
    
    public long h(final TimeUnit sourceUnit) {
        return TimeUnit.MILLISECONDS.convert(this.b, sourceUnit);
    }
    
    public int i() {
        return this.f;
    }
    
    public Throwable j() {
        return this.e;
    }
    
    public int k() {
        return this.d;
    }
    
    public void l(final long duration, final TimeUnit timeUnit) {
        if (duration >= 0L) {
            this.b = timeUnit.toMillis(duration);
            return;
        }
        throw new IllegalArgumentException("Amount must be positive value.");
    }
    
    public void m(final Callable<t<?>> callable) {
        Objects.requireNonNull(callable, "errorFactory == null");
        this.g = callable;
    }
    
    public void n(final int f) {
        d(f, "Error percentage must be between 0 and 100.");
        this.f = f;
    }
    
    public void o(final Throwable t) {
        Objects.requireNonNull(t, "exception == null");
        this.e = t;
    }
    
    public void p(final int d) {
        d(d, "Failure percentage must be between 0 and 100.");
        this.d = d;
    }
    
    public void q(final int c) {
        d(c, "Variance percentage must be between 0 and 100.");
        this.c = c;
    }
    
    public int r() {
        return this.c;
    }
}
