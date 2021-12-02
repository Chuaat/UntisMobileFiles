// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.ranges.o;
import kotlin.jvm.internal.k0;
import kotlin.internal.f;
import kotlin.e1;
import kotlin.z0;
import kotlin.i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bI\u001a\"\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\b\u001a\u00020\u0004*\u00020\u00072\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\u000b\u001a\u00020\u0004*\u00020\n2\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u0004*\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0007H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u001a\"\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0000H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001a\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0018\u001a\u001a\u0010 \u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H\u0003\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u0018\"#\u0010%\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"#\u0010(\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\"\"#\u0010+\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\"\"#\u0010(\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b'\u0010.\u001a\u0004\b,\u0010-\"#\u0010%\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b#\u00100\u001a\u0004\b/\u0010\u0018\"#\u00103\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b2\u0010$\u001a\u0004\b1\u0010\"\"#\u00106\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u0018\"#\u00106\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b5\u0010.\u001a\u0004\b7\u0010-\"#\u00103\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b2\u00100\u001a\u0004\b8\u0010\u0018\"#\u0010+\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b*\u00100\u001a\u0004\b9\u0010\u0018\"\u0016\u0010<\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010;\"#\u0010?\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010-\"#\u0010%\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b#\u0010.\u001a\u0004\b@\u0010-\"#\u0010C\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\bB\u0010$\u001a\u0004\bA\u0010\"\"#\u0010C\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\bB\u0010.\u001a\u0004\bD\u0010-\"#\u0010?\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b>\u00100\u001a\u0004\bE\u0010\u0018\"#\u0010?\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b>\u0010$\u001a\u0004\bF\u0010\"\"\u0016\u0010H\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010;\"\u0016\u0010K\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010J\"#\u00103\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b2\u0010.\u001a\u0004\bL\u0010-\"#\u0010C\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00100\u001a\u0004\bM\u0010\u0018\"#\u0010+\u001a\u00020\u0004*\u00020\u00008F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010.\u001a\u0004\bN\u0010-\"#\u00106\u001a\u00020\u0004*\u00020\n8F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b5\u0010$\u001a\u0004\bO\u0010\"\"#\u0010(\u001a\u00020\u0004*\u00020\u00078F@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b'\u00100\u001a\u0004\bP\u0010\u0018\"\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S" }, d2 = { "", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/d;", "h0", "(ILjava/util/concurrent/TimeUnit;)J", "", "i0", "(JLjava/util/concurrent/TimeUnit;)J", "", "g0", "(DLjava/util/concurrent/TimeUnit;)J", "duration", "f0", "(IJ)J", "e0", "(DJ)J", "nanos", "d0", "millis", "c0", "normalNanos", "k", "(J)J", "normalMillis", "i", "normalValue", "unitDiscriminator", "h", "(JI)J", "l", "j", "W", "(D)J", "getSeconds$annotations", "(D)V", "seconds", "m", "getDays$annotations", "days", "Q", "getNanoseconds$annotations", "nanoseconds", "n", "(I)J", "(I)V", "Y", "(J)V", "E", "getMilliseconds$annotations", "milliseconds", "u", "getHours$annotations", "hours", "t", "G", "S", "c", "J", "MAX_MILLIS", "L", "getMinutes$annotations", "minutes", "X", "y", "getMicroseconds$annotations", "microseconds", "z", "M", "K", "b", "MAX_NANOS", "a", "I", "NANOS_IN_MILLIS", "F", "A", "R", "s", "o", "d", "MAX_NANOS_IN_MILLIS", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    public static final int a = 1000000;
    public static final long b = 4611686018426999999L;
    public static final long c = 4611686018427387903L;
    private static final long d = 4611686018426L;
    
    public static final long A(final long n) {
        return i0(n, TimeUnit.MICROSECONDS);
    }
    
    public static final long E(final double n) {
        return g0(n, TimeUnit.MILLISECONDS);
    }
    
    public static final long F(final int n) {
        return h0(n, TimeUnit.MILLISECONDS);
    }
    
    public static final long G(final long n) {
        return i0(n, TimeUnit.MILLISECONDS);
    }
    
    public static final long K(final double n) {
        return g0(n, TimeUnit.MINUTES);
    }
    
    public static final long L(final int n) {
        return h0(n, TimeUnit.MINUTES);
    }
    
    public static final long M(final long n) {
        return i0(n, TimeUnit.MINUTES);
    }
    
    public static final long Q(final double n) {
        return g0(n, TimeUnit.NANOSECONDS);
    }
    
    public static final long R(final int n) {
        return h0(n, TimeUnit.NANOSECONDS);
    }
    
    public static final long S(final long n) {
        return i0(n, TimeUnit.NANOSECONDS);
    }
    
    public static final long W(final double n) {
        return g0(n, TimeUnit.SECONDS);
    }
    
    public static final long X(final int n) {
        return h0(n, TimeUnit.SECONDS);
    }
    
    public static final long Y(final long n) {
        return i0(n, TimeUnit.SECONDS);
    }
    
    private static final long c0(final long n) {
        return n * 1000000;
    }
    
    private static final long d0(final long n) {
        return n / 1000000;
    }
    
    @e1(version = "1.3")
    @f
    @j
    private static final long e0(final double n, final long n2) {
        return kotlin.time.d.W0(n2, n);
    }
    
    @e1(version = "1.3")
    @f
    @j
    private static final long f0(final int n, final long n2) {
        return kotlin.time.d.X0(n2, n);
    }
    
    @e1(version = "1.3")
    @j
    public static final long g0(final double n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        final double b = h.b(n, timeUnit, TimeUnit.NANOSECONDS);
        if (Double.isNaN(b) ^ true) {
            final long n2 = (long)b;
            if (-4611686018426999999L <= n2) {
                if (4611686018426999999L >= n2) {
                    return k(n2);
                }
            }
            return j((long)h.b(n, timeUnit, TimeUnit.MILLISECONDS));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
    
    @j
    private static final long h(final long n, final int n2) {
        return kotlin.time.d.k((n << 1) + n2);
    }
    
    @e1(version = "1.3")
    @j
    public static final long h0(final int n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        long n2;
        if (timeUnit.compareTo(TimeUnit.SECONDS) <= 0) {
            n2 = k(h.d(n, timeUnit, TimeUnit.NANOSECONDS));
        }
        else {
            n2 = i0(n, timeUnit);
        }
        return n2;
    }
    
    @j
    private static final long i(final long n) {
        return kotlin.time.d.k((n << 1) + 1L);
    }
    
    @e1(version = "1.3")
    @j
    public static final long i0(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        final long d = h.d(4611686018426999999L, nanoseconds, timeUnit);
        if (-d <= n) {
            if (d >= n) {
                return k(h.d(n, timeUnit, nanoseconds));
            }
        }
        return i(o.D(h.c(n, timeUnit, TimeUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
    
    @j
    private static final long j(long n) {
        if (-4611686018426L <= n) {
            if (4611686018426L >= n) {
                n = k(c0(n));
                return n;
            }
        }
        n = i(o.D(n, -4611686018427387903L, 4611686018427387903L));
        return n;
    }
    
    @j
    private static final long k(final long n) {
        return kotlin.time.d.k(n << 1);
    }
    
    @j
    private static final long l(long n) {
        if (-4611686018426999999L <= n) {
            if (4611686018426999999L >= n) {
                n = k(n);
                return n;
            }
        }
        n = i(d0(n));
        return n;
    }
    
    public static final long m(final double n) {
        return g0(n, TimeUnit.DAYS);
    }
    
    public static final long n(final int n) {
        return h0(n, TimeUnit.DAYS);
    }
    
    public static final long o(final long n) {
        return i0(n, TimeUnit.DAYS);
    }
    
    public static final long s(final double n) {
        return g0(n, TimeUnit.HOURS);
    }
    
    public static final long t(final int n) {
        return h0(n, TimeUnit.HOURS);
    }
    
    public static final long u(final long n) {
        return i0(n, TimeUnit.HOURS);
    }
    
    public static final long y(final double n) {
        return g0(n, TimeUnit.MICROSECONDS);
    }
    
    public static final long z(final int n) {
        return h0(n, TimeUnit.MICROSECONDS);
    }
}
