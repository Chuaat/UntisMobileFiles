// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import m6.h;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001f" }, d2 = { "Lokio/s0;", "", "", "g", "f", "nanosToWait", "Lkotlin/j2;", "k", "bytesPerSecond", "waitByteCount", "maxByteCount", "d", "byteCount", "j", "(J)J", "now", "a", "(JJ)J", "Lokio/r0;", "source", "i", "Lokio/p0;", "sink", "h", "J", "allocatedUntil", "b", "c", "<init>", "(J)V", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class s0
{
    private long a;
    private long b;
    private long c;
    private long d;
    
    public s0() {
        this(System.nanoTime());
    }
    
    public s0(final long d) {
        this.d = d;
        this.b = 8192L;
        this.c = 262144L;
    }
    
    public static /* synthetic */ void e(final s0 s0, final long n, long b, long c, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            b = s0.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = s0.c;
        }
        s0.d(n, b, c);
    }
    
    private final long f(final long n) {
        return n * 1000000000L / this.a;
    }
    
    private final long g(final long n) {
        return n * this.a / 1000000000L;
    }
    
    private final void k(final long n) {
        final long timeoutMillis = n / 1000000L;
        this.wait(timeoutMillis, (int)(n - 1000000L * timeoutMillis));
    }
    
    public final long a(long n, long min) {
        if (this.a == 0L) {
            return min;
        }
        final long max = Math.max(this.d - n, 0L);
        final long n2 = this.c - this.g(max);
        long n3;
        if (n2 >= min) {
            n += max;
            n3 = this.f(min);
        }
        else {
            final long b = this.b;
            if (n2 >= b) {
                this.d = n + this.f(this.c);
                return n2;
            }
            min = Math.min(b, min);
            final long n4 = max + this.f(min - this.c);
            if (n4 != 0L) {
                return -n4;
            }
            n3 = this.f(this.c);
        }
        this.d = n + n3;
        return min;
    }
    
    @h
    public final void b(final long n) {
        e(this, n, 0L, 0L, 6, null);
    }
    
    @h
    public final void c(final long n, final long n2) {
        e(this, n, n2, 0L, 4, null);
    }
    
    @h
    public final void d(final long a, final long b, final long c) {
        // monitorenter(this)
        final int n = 1;
        Label_0131: {
            if (a < 0L) {
                break Label_0131;
            }
            Label_0113: {
                if (b <= 0L) {
                    break Label_0113;
                }
                int n2;
                if (c >= b) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                Label_0095: {
                    if (n2 == 0) {
                        break Label_0095;
                    }
                    try {
                        this.a = a;
                        this.b = b;
                        this.c = c;
                        this.notifyAll();
                        final j2 a2 = j2.a;
                        return;
                        throw new IllegalArgumentException("Failed requirement.".toString());
                        throw new IllegalArgumentException("Failed requirement.".toString());
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    finally {
                    }
                    // monitorexit(this)
                }
            }
        }
    }
    
    @e
    public final p0 h(@e final p0 p) {
        k0.p((Object)p, "sink");
        return new u(p) {
            final /* synthetic */ s0 H;
            
            @Override
            public void t3(@e final m m, long n) throws IOException {
                k0.p((Object)m, "source");
                while (n > 0L) {
                    try {
                        final long j = this.H.j(n);
                        super.t3(m, j);
                        n -= j;
                        continue;
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                    break;
                }
            }
        };
    }
    
    @e
    public final r0 i(@e final r0 r0) {
        k0.p((Object)r0, "source");
        return new v(r0) {
            final /* synthetic */ s0 G;
            
            @Override
            public long read(@e final m m, long read) {
                k0.p((Object)m, "sink");
                try {
                    read = super.read(m, this.G.j(read));
                    return read;
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }
    
    public final long j(final long n) {
        if (n > 0L) {
            synchronized (this) {
                long a;
                while (true) {
                    a = this.a(System.nanoTime(), n);
                    if (a >= 0L) {
                        break;
                    }
                    this.k(-a);
                }
                return a;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
