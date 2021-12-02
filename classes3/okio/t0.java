// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.jvm.internal.h0;
import kotlin.j2;
import n6.a;
import kotlin.jvm.internal.k0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086\b\u00f8\u0001\u0000R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f" }, d2 = { "Lokio/t0;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "j", "", "f", "d", "deadlineNanoTime", "e", "duration", "c", "b", "a", "Lkotlin/j2;", "h", "monitor", "k", "other", "Lkotlin/Function0;", "block", "g", "J", "timeoutNanos", "Z", "hasDeadline", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
public class t0
{
    @d
    @e
    public static final t0 d;
    @e
    public static final b e;
    private boolean a;
    private long b;
    private long c;
    
    static {
        e = new b(null);
        d = new t0() {
            @e
            @Override
            public t0 e(final long n) {
                return this;
            }
            
            @Override
            public void h() {
            }
            
            @e
            @Override
            public t0 i(final long n, @e final TimeUnit timeUnit) {
                k0.p((Object)timeUnit, "unit");
                return this;
            }
        };
    }
    
    @e
    public t0 a() {
        this.a = false;
        return this;
    }
    
    @e
    public t0 b() {
        this.c = 0L;
        return this;
    }
    
    @e
    public final t0 c(final long n, @e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        if (n > 0L) {
            return this.e(System.nanoTime() + timeUnit.toNanos(n));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("duration <= 0: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public long d() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }
    
    @e
    public t0 e(final long b) {
        this.a = true;
        this.b = b;
        return this;
    }
    
    public boolean f() {
        return this.a;
    }
    
    public final void g(@e final t0 t0, @e final a<j2> a) {
        k0.p((Object)t0, "other");
        k0.p((Object)a, "block");
        final long j = this.j();
        final long a2 = t0.e.a(t0.j(), this.j());
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        this.i(a2, nanoseconds);
        Label_0200: {
            if (this.f()) {
                final long d = this.d();
                if (t0.f()) {
                    this.e(Math.min(this.d(), t0.d()));
                }
                try {
                    a.invoke();
                    h0.d(1);
                    this.i(j, nanoseconds);
                    if (t0.f()) {
                        this.e(d);
                        break Label_0200;
                    }
                    break Label_0200;
                }
                finally {
                    h0.d(1);
                    this.i(j, TimeUnit.NANOSECONDS);
                    if (t0.f()) {
                        this.e(d);
                    }
                    h0.c(1);
                }
            }
            if (t0.f()) {
                this.e(t0.d());
            }
            try {
                a.invoke();
                h0.d(1);
                this.i(j, nanoseconds);
                if (t0.f()) {
                    this.a();
                }
                h0.c(1);
            }
            finally {
                h0.d(1);
                this.i(j, TimeUnit.NANOSECONDS);
                if (t0.f()) {
                    this.a();
                }
                h0.c(1);
            }
        }
    }
    
    public void h() throws IOException {
        final Thread currentThread = Thread.currentThread();
        k0.o((Object)currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
        }
    }
    
    @e
    public t0 i(final long n, @e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        if (n >= 0L) {
            this.c = timeUnit.toNanos(n);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("timeout < 0: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public long j() {
        return this.c;
    }
    
    public final void k(@e Object o) throws InterruptedIOException {
        k0.p(o, "monitor");
        try {
            final boolean f = this.f();
            long a = this.j();
            long n = 0L;
            if (!f && a == 0L) {
                o.wait();
                return;
            }
            final long nanoTime = System.nanoTime();
            if (f && a != 0L) {
                a = Math.min(a, this.d() - nanoTime);
            }
            else if (f) {
                a = this.d() - nanoTime;
            }
            if (a > 0L) {
                final long n2 = a / 1000000L;
                Long.signum(n2);
                o.wait(n2, (int)(a - 1000000L * n2));
                n = System.nanoTime() - nanoTime;
            }
            if (n < a) {
                return;
            }
            o = new InterruptedIOException("timeout");
            throw o;
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "okio/t0$b", "", "", "aNanos", "bNanos", "a", "Lokio/t0;", "NONE", "Lokio/t0;", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class b
    {
        private b() {
        }
        
        public final long a(long n, final long n2) {
            if (n != 0L) {
                if (n2 == 0L) {
                    return n;
                }
                if (n < n2) {
                    return n;
                }
            }
            n = n2;
            return n;
        }
    }
}
