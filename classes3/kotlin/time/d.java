// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.comparisons.a;
import n6.s;
import n6.r;
import n6.q;
import kotlin.jvm.internal.k0;
import n6.p;
import kotlin.ranges.g;
import kotlin.ranges.o;
import kotlin.ranges.n;
import kotlin.math.b;
import kotlin.z0;
import kotlin.i;
import kotlin.y0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import kotlin.e1;
import m6.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\bH\b\u0087@\u0018\u0000 \u0094\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0095\u0001B\u0016\b\u0000\u0012\u0007\u0010\u008c\u0001\u001a\u00020\u000b\u00f8\u0001\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u001e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u001b\u0010 \u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!J\u009d\u0001\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2u\u0010+\u001aq\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u00000#H\u0086\b\u00f8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b,\u0010-J\u0088\u0001\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2`\u0010+\u001a\\\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u00000.H\u0086\b\u00f8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b/\u00100Js\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2K\u0010+\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u000001H\u0086\b\u00f8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b2\u00103J^\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"26\u0010+\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u000004H\u0086\b\u00f8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u00020\u00152\n\u00109\u001a\u000607j\u0002`8¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u000b2\n\u00109\u001a\u000607j\u0002`8¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00112\n\u00109\u001a\u000607j\u0002`8¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000bH\u0007¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010A\u001a\u00020\u000bH\u0007¢\u0006\u0004\bA\u0010\u0007J\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u0015H\u0002¢\u0006\u0004\bF\u0010GJ#\u0010I\u001a\u00020B2\n\u00109\u001a\u000607j\u0002`82\b\b\u0002\u0010H\u001a\u00020\u0011¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020B¢\u0006\u0004\bK\u0010DJ\u0010\u0010L\u001a\u00020\u0011H\u00d6\u0001¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010NH\u00d6\u0003¢\u0006\u0004\bO\u0010PR\u001c\u0010T\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010\u0007R\u001c\u0010X\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bW\u0010S\u001a\u0004\bU\u0010VR\u001c\u0010[\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010S\u001a\u0004\bY\u0010VR\u001c\u0010^\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010S\u001a\u0004\b\\\u0010VR\u0017\u0010`\u001a\u00020\u00118\u00c2\u0002@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010MR\u001c\u0010b\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010S\u001a\u0004\b\"\u0010VR\u001c\u0010e\u001a\u00020\u00118@@\u0001X\u0081\u0004¢\u0006\f\u0012\u0004\bd\u0010S\u001a\u0004\bc\u0010MR\u001c\u0010h\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bg\u0010S\u001a\u0004\bf\u0010\u0007R\u0019\u0010j\u001a\u00020\u00008F@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010\u0007R\u001c\u0010m\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010S\u001a\u0004\bk\u0010\u0007R\u001c\u0010p\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010S\u001a\u0004\bn\u0010\u0007R\u001c\u0010s\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010S\u001a\u0004\bq\u0010\u0007R\u001c\u0010v\u001a\u00020\u00118@@\u0001X\u0081\u0004¢\u0006\f\u0012\u0004\bu\u0010S\u001a\u0004\bt\u0010MR\u001c\u0010y\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010S\u001a\u0004\bw\u0010VR\u001c\u0010|\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010S\u001a\u0004\bz\u0010\u0007R\u0016\u0010E\u001a\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0007R\u001d\u0010\u0080\u0001\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010S\u001a\u0004\b~\u0010VR\u001f\u0010\u0083\u0001\u001a\u00020\u000b8F@\u0007X\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010S\u001a\u0005\b\u0081\u0001\u0010\u0007R\u001f\u0010\u0086\u0001\u001a\u00020\u00118@@\u0001X\u0081\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010S\u001a\u0005\b\u0084\u0001\u0010MR\u001f\u0010\u0089\u0001\u001a\u00020\u00118@@\u0001X\u0081\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010S\u001a\u0005\b\u0087\u0001\u0010MR\u0019\u0010\u008c\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001f\u0010\u008f\u0001\u001a\u00020\u00158F@\u0007X\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010S\u001a\u0005\b\u008d\u0001\u0010VR\u0019\u0010\u0092\u0001\u001a\u0002078B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u0096\u0001" }, d2 = { "Lkotlin/time/d;", "", "", "O0", "(J)Z", "N0", "o1", "(J)J", "other", "U0", "(JJ)J", "", "thisMillis", "otherNanos", "g", "(JJJ)J", "T0", "", "scale", "X0", "(JI)J", "", "W0", "(JD)J", "o", "m", "l", "(JJ)D", "R0", "S0", "P0", "K0", "j", "(JJ)I", "T", "Lkotlin/Function5;", "Lkotlin/t0;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "c1", "(JLn6/s;)Ljava/lang/Object;", "Lkotlin/Function4;", "b1", "(JLn6/r;)Ljava/lang/Object;", "Lkotlin/Function3;", "Z0", "(JLn6/q;)Ljava/lang/Object;", "Lkotlin/Function2;", "Y0", "(JLn6/p;)Ljava/lang/Object;", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "unit", "e1", "(JLjava/util/concurrent/TimeUnit;)D", "h1", "(JLjava/util/concurrent/TimeUnit;)J", "f1", "(JLjava/util/concurrent/TimeUnit;)I", "j1", "i1", "", "l1", "(J)Ljava/lang/String;", "value", "V0", "(JD)I", "decimals", "m1", "(JLjava/util/concurrent/TimeUnit;I)Ljava/lang/String;", "g1", "J0", "(J)I", "", "p", "(JLjava/lang/Object;)Z", "t0", "getInWholeNanoseconds$annotations", "()V", "inWholeNanoseconds", "V", "(J)D", "getInSeconds$annotations", "inSeconds", "M", "getInMilliseconds$annotations", "inMilliseconds", "I", "getInMicroseconds$annotations", "inMicroseconds", "G0", "unitDiscriminator", "getInNanoseconds$annotations", "inNanoseconds", "E0", "getSecondsComponent$annotations", "secondsComponent", "l0", "getInWholeMicroseconds$annotations", "inWholeMicroseconds", "u", "absoluteValue", "v0", "getInWholeSeconds$annotations", "inWholeSeconds", "b0", "getInWholeDays$annotations", "inWholeDays", "r0", "getInWholeMinutes$annotations", "inWholeMinutes", "y", "getHoursComponent$annotations", "hoursComponent", "E", "getInHours$annotations", "inHours", "i0", "getInWholeHours$annotations", "inWholeHours", "I0", "A", "getInDays$annotations", "inDays", "o0", "getInWholeMilliseconds$annotations", "inWholeMilliseconds", "z0", "getMinutesComponent$annotations", "minutesComponent", "B0", "getNanosecondsComponent$annotations", "nanosecondsComponent", "G", "J", "rawValue", "P", "getInMinutes$annotations", "inMinutes", "F0", "(J)Ljava/util/concurrent/TimeUnit;", "storageUnit", "k", "K", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e
@e1(version = "1.3")
@j
public final class d implements Comparable<d>
{
    private static final long H;
    private static final long I;
    private static final long J;
    @org.jetbrains.annotations.e
    public static final a K;
    private final long G = g;
    
    static {
        K = new a(null);
        H = k(0L);
        I = kotlin.time.e.b(4611686018427387903L);
        J = kotlin.time.e.b(-4611686018427387903L);
    }
    
    public static final double A(final long n) {
        return e1(n, TimeUnit.DAYS);
    }
    
    public static final int B0(long n) {
        int n2;
        if (P0(n)) {
            n2 = 0;
        }
        else {
            final boolean n3 = N0(n);
            n = I0(n);
            if (n3) {
                n = kotlin.time.e.f(n % 1000);
            }
            else {
                n %= 1000000000;
            }
            n2 = (int)n;
        }
        return n2;
    }
    
    public static final double E(final long n) {
        return e1(n, TimeUnit.HOURS);
    }
    
    public static final int E0(final long n) {
        int n2;
        if (P0(n)) {
            n2 = 0;
        }
        else {
            n2 = (int)(v0(n) % 60);
        }
        return n2;
    }
    
    private static final TimeUnit F0(final long n) {
        TimeUnit timeUnit;
        if (O0(n)) {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        else {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return timeUnit;
    }
    
    private static final int G0(final long n) {
        return (int)n & 0x1;
    }
    
    public static final double I(final long n) {
        return e1(n, TimeUnit.MICROSECONDS);
    }
    
    private static final long I0(final long n) {
        return n >> 1;
    }
    
    public static int J0(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static final boolean K0(final long n) {
        return P0(n) ^ true;
    }
    
    public static final double M(final long n) {
        return e1(n, TimeUnit.MILLISECONDS);
    }
    
    private static final boolean N0(final long n) {
        final int n2 = (int)n;
        boolean b = true;
        if ((n2 & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    private static final boolean O0(final long n) {
        final int n2 = (int)n;
        boolean b = true;
        if ((n2 & 0x1) != 0x0) {
            b = false;
        }
        return b;
    }
    
    public static final double P(final long n) {
        return e1(n, TimeUnit.MINUTES);
    }
    
    public static final boolean P0(final long n) {
        return n == d.I || n == d.J;
    }
    
    public static final boolean R0(final long n) {
        return n < 0L;
    }
    
    public static final boolean S0(final long n) {
        return n > 0L;
    }
    
    public static final double T(final long n) {
        return e1(n, TimeUnit.NANOSECONDS);
    }
    
    public static final long T0(final long n, final long n2) {
        return U0(n, o1(n2));
    }
    
    public static final long U0(long n, long n2) {
        if (P0(n)) {
            if (!K0(n2) && (n2 ^ n) < 0L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return n;
        }
        else {
            if (P0(n2)) {
                return n2;
            }
            if (((int)n & 0x1) == ((int)n2 & 0x1)) {
                n2 = I0(n) + I0(n2);
                if (O0(n)) {
                    n = kotlin.time.e.e(n2);
                }
                else {
                    n = kotlin.time.e.c(n2);
                }
            }
            else if (N0(n)) {
                n = g(n, I0(n), I0(n2));
            }
            else {
                n = g(n, I0(n2), I0(n));
            }
            return n;
        }
    }
    
    public static final double V(final long n) {
        return e1(n, TimeUnit.SECONDS);
    }
    
    private static final int V0(final long n, final double n2) {
        int n3 = 1;
        if (n2 < 1) {
            n3 = 3;
        }
        else if (n2 < 10) {
            n3 = 2;
        }
        else if (n2 >= 100) {
            n3 = 0;
        }
        return n3;
    }
    
    public static final long W0(final long n, final double n2) {
        final int g0 = b.G0(n2);
        if (g0 == n2) {
            return X0(n, g0);
        }
        final TimeUnit f0 = F0(n);
        return kotlin.time.e.g0(e1(n, f0) * n2, f0);
    }
    
    public static final long X0(long n, final int n2) {
        if (P0(n)) {
            if (n2 != 0) {
                if (n2 <= 0) {
                    n = o1(n);
                }
                return n;
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        else {
            if (n2 == 0) {
                return d.H;
            }
            final long i0 = I0(n);
            final long n3 = n2;
            final long n4 = i0 * n3;
            n n6;
            if (O0(n)) {
                if (-2147483647L <= i0) {
                    if (2147483647L >= i0) {
                        n = kotlin.time.e.d(n4);
                        return n;
                    }
                }
                if (n4 / n3 == i0) {
                    n = kotlin.time.e.e(n4);
                    return n;
                }
                final long g = kotlin.time.e.g(i0);
                n = kotlin.time.e.f(g);
                final long n5 = g * n3;
                n = kotlin.time.e.g((i0 - n) * n3) + n5;
                if (n5 / n3 == g && (n ^ n5) >= 0L) {
                    n6 = new n(-4611686018427387903L, 4611686018427387903L);
                }
                else {
                    if (b.R(i0) * b.Q(n2) > 0) {
                        return d.I;
                    }
                    return d.J;
                }
            }
            else if (n4 / n3 == i0) {
                n6 = new n(-4611686018427387903L, 4611686018427387903L);
                n = n4;
            }
            else {
                if (b.R(i0) * b.Q(n2) > 0) {
                    return d.I;
                }
                return d.J;
            }
            n = kotlin.time.e.b(o.E(n, (g)n6));
            return n;
            n = d.I;
            return n;
            n = d.J;
            return n;
        }
    }
    
    public static final <T> T Y0(final long n, @org.jetbrains.annotations.e final p<? super Long, ? super Integer, ? extends T> p2) {
        k0.p((Object)p2, "action");
        return (T)p2.invoke((Object)v0(n), (Object)B0(n));
    }
    
    public static final <T> T Z0(final long n, @org.jetbrains.annotations.e final q<? super Integer, ? super Integer, ? super Integer, ? extends T> q) {
        k0.p((Object)q, "action");
        return (T)q.invoke((Object)f1(n, TimeUnit.MINUTES), (Object)E0(n), (Object)B0(n));
    }
    
    public static final /* synthetic */ long b() {
        return d.I;
    }
    
    public static final long b0(final long n) {
        return h1(n, TimeUnit.DAYS);
    }
    
    public static final <T> T b1(final long n, @org.jetbrains.annotations.e final r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> r) {
        k0.p((Object)r, "action");
        return (T)r.I((Object)f1(n, TimeUnit.HOURS), (Object)z0(n), (Object)E0(n), (Object)B0(n));
    }
    
    public static final <T> T c1(final long n, @org.jetbrains.annotations.e final s<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> s) {
        k0.p((Object)s, "action");
        return (T)s.U((Object)f1(n, TimeUnit.DAYS), (Object)y(n), (Object)z0(n), (Object)E0(n), (Object)B0(n));
    }
    
    public static final /* synthetic */ long d() {
        return d.J;
    }
    
    public static final double e1(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        double b;
        if (n == d.I) {
            b = Double.POSITIVE_INFINITY;
        }
        else if (n == d.J) {
            b = Double.NEGATIVE_INFINITY;
        }
        else {
            b = h.b((double)I0(n), F0(n), timeUnit);
        }
        return b;
    }
    
    public static final /* synthetic */ long f() {
        return d.H;
    }
    
    public static final int f1(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        return (int)o.D(h1(n, timeUnit), (long)Integer.MIN_VALUE, (long)Integer.MAX_VALUE);
    }
    
    private static final long g(long n, long f, final long n2) {
        final long g = kotlin.time.e.g(n2);
        n = f + g;
        if (-4611686018426L <= n) {
            if (4611686018426L >= n) {
                f = kotlin.time.e.f(g);
                n = kotlin.time.e.d(kotlin.time.e.f(n) + (n2 - f));
                return n;
            }
        }
        n = kotlin.time.e.b(o.D(n, -4611686018427387903L, 4611686018427387903L));
        return n;
    }
    
    @org.jetbrains.annotations.e
    public static final String g1(long u) {
        final StringBuilder sb = new StringBuilder();
        if (R0(u)) {
            sb.append('-');
        }
        sb.append("PT");
        u = u(u);
        final int f1 = f1(u, TimeUnit.HOURS);
        final int z0 = z0(u);
        final int e0 = E0(u);
        final int b0 = B0(u);
        final int n = 1;
        final boolean b2 = f1 != 0;
        final boolean b3 = e0 != 0 || b0 != 0;
        int n2 = n;
        if (z0 == 0) {
            if (b3 && b2) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (b2) {
            sb.append(f1);
            sb.append('H');
        }
        if (n2 != 0) {
            sb.append(z0);
            sb.append('M');
        }
        if (b3 || (!b2 && n2 == 0)) {
            sb.append(e0);
            Label_0268: {
                if (b0 != 0) {
                    sb.append('.');
                    final String t3 = kotlin.text.s.T3(String.valueOf(b0), 9, '0');
                    int end;
                    if (b0 % 1000000 == 0) {
                        end = 3;
                    }
                    else {
                        if (b0 % 1000 != 0) {
                            sb.append(t3);
                            break Label_0268;
                        }
                        end = 6;
                    }
                    sb.append(t3, 0, end);
                    k0.o((Object)sb, "this.append(value, startIndex, endIndex)");
                }
            }
            sb.append('S');
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static final long h1(long c, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        if (c == d.I) {
            c = Long.MAX_VALUE;
        }
        else if (c == d.J) {
            c = Long.MIN_VALUE;
        }
        else {
            c = h.c(I0(c), F0(c), timeUnit);
        }
        return c;
    }
    
    public static final long i0(final long n) {
        return h1(n, TimeUnit.HOURS);
    }
    
    @i(message = "Use inWholeMilliseconds property instead.", replaceWith = @z0(expression = "this.inWholeMilliseconds", imports = {}))
    public static final long i1(final long n) {
        return o0(n);
    }
    
    public static int j(final long n, final long n2) {
        final long n3 = n ^ n2;
        if (n3 >= 0L && ((int)n3 & 0x1) != 0x0) {
            int n4 = ((int)n & 0x1) - ((int)n2 & 0x1);
            if (R0(n)) {
                n4 = -n4;
            }
            return n4;
        }
        return lcmp(n, n2);
    }
    
    @i(message = "Use inWholeNanoseconds property instead.", replaceWith = @z0(expression = "this.inWholeNanoseconds", imports = {}))
    public static final long j1(final long n) {
        return t0(n);
    }
    
    public static long k(final long n) {
        if (O0(n)) {
            final long i0 = I0(n);
            if (-4611686018426999999L > i0 || 4611686018426999999L < i0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(I0(n));
                sb.append(" ns is out of nanoseconds range");
                throw new AssertionError((Object)sb.toString());
            }
        }
        else {
            final long i2 = I0(n);
            if (-4611686018427387903L > i2 || 4611686018427387903L < i2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(I0(n));
                sb2.append(" ms is out of milliseconds range");
                throw new AssertionError((Object)sb2.toString());
            }
            final long i3 = I0(n);
            if (-4611686018426L <= i3) {
                if (4611686018426L >= i3) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(I0(n));
                    sb3.append(" ms is denormalized");
                    throw new AssertionError((Object)sb3.toString());
                }
            }
        }
        return n;
    }
    
    public static final double l(final long n, final long n2) {
        final TimeUnit timeUnit = (TimeUnit)kotlin.comparisons.a.O((Comparable)F0(n), (Comparable)F0(n2));
        return e1(n, timeUnit) / e1(n2, timeUnit);
    }
    
    public static final long l0(final long n) {
        return h1(n, TimeUnit.MICROSECONDS);
    }
    
    @org.jetbrains.annotations.e
    public static String l1(final long n) {
        String string;
        if (n == 0L) {
            string = "0s";
        }
        else if (n == d.I) {
            string = "Infinity";
        }
        else if (n == d.J) {
            string = "-Infinity";
        }
        else {
            final long u = u(n);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            final double e1 = e1(u, timeUnit);
            boolean b = false;
            int n2 = 0;
            Label_0217: {
                Label_0075: {
                    if (e1 < 1.0E-6) {
                        timeUnit = TimeUnit.SECONDS;
                    }
                    else {
                        if (e1 < 1) {
                            n2 = 7;
                            break Label_0217;
                        }
                        if (e1 >= 1000.0) {
                            if (e1 < 1000000.0) {
                                timeUnit = TimeUnit.MICROSECONDS;
                            }
                            else if (e1 < 1.0E9) {
                                timeUnit = TimeUnit.MILLISECONDS;
                            }
                            else if (e1 < 1.0E12) {
                                timeUnit = TimeUnit.SECONDS;
                            }
                            else if (e1 < 6.0E13) {
                                timeUnit = TimeUnit.MINUTES;
                            }
                            else if (e1 < 3.6E15) {
                                timeUnit = TimeUnit.HOURS;
                            }
                            else {
                                final TimeUnit days = TimeUnit.DAYS;
                                n2 = 0;
                                timeUnit = days;
                                if (e1 < 8.64E20) {
                                    timeUnit = days;
                                    break Label_0217;
                                }
                                break Label_0075;
                            }
                        }
                        n2 = 0;
                        break Label_0217;
                    }
                }
                n2 = 0;
                b = true;
            }
            final double e2 = e1(n, timeUnit);
            final StringBuilder sb = new StringBuilder();
            String str;
            if (b) {
                str = k.b(e2);
            }
            else if (n2 > 0) {
                str = k.d(e2, n2);
            }
            else {
                str = k.c(e2, V0(n, Math.abs(e2)));
            }
            sb.append(str);
            sb.append(kotlin.time.i.e(timeUnit));
            string = sb.toString();
        }
        return string;
    }
    
    public static final long m(final long n, final double n2) {
        final int g0 = b.G0(n2);
        if (g0 == n2 && g0 != 0) {
            return o(n, g0);
        }
        final TimeUnit f0 = F0(n);
        return kotlin.time.e.g0(e1(n, f0) / n2, f0);
    }
    
    @org.jetbrains.annotations.e
    public static final String m1(final long n, @org.jetbrains.annotations.e final TimeUnit timeUnit, final int i) {
        k0.p((Object)timeUnit, "unit");
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("decimals must be not negative, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        final double e1 = e1(n, timeUnit);
        if (Double.isInfinite(e1)) {
            return String.valueOf(e1);
        }
        final StringBuilder sb2 = new StringBuilder();
        String str;
        if (Math.abs(e1) < 1.0E14) {
            str = k.c(e1, o.u(i, 12));
        }
        else {
            str = k.b(e1);
        }
        sb2.append(str);
        sb2.append(i.e(timeUnit));
        return sb2.toString();
    }
    
    public static final long o(long n, final int n2) {
        if (n2 == 0) {
            if (S0(n)) {
                n = d.I;
            }
            else {
                if (!R0(n)) {
                    throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
                }
                n = d.J;
            }
            return n;
        }
        if (O0(n)) {
            return kotlin.time.e.d(I0(n) / n2);
        }
        if (P0(n)) {
            return X0(n, b.Q(n2));
        }
        final long i0 = I0(n);
        final long n3 = n2;
        final long n4 = i0 / n3;
        if (-4611686018426L <= n4) {
            if (4611686018426L >= n4) {
                n = kotlin.time.e.f(I0(n) - n4 * n3) / n3;
                return kotlin.time.e.d(kotlin.time.e.f(n4) + n);
            }
        }
        return kotlin.time.e.b(n4);
    }
    
    public static final long o0(long n) {
        if (N0(n) && K0(n)) {
            n = I0(n);
        }
        else {
            n = h1(n, TimeUnit.MILLISECONDS);
        }
        return n;
    }
    
    public static final long o1(final long n) {
        return kotlin.time.e.a(-I0(n), (int)n & 0x1);
    }
    
    public static boolean p(final long n, final Object o) {
        return o instanceof d && n == ((d)o).q1();
    }
    
    public static final long r0(final long n) {
        return h1(n, TimeUnit.MINUTES);
    }
    
    public static final boolean s(final long n, final long n2) {
        return n == n2;
    }
    
    public static final long t0(long f) {
        final long i0 = I0(f);
        if (O0(f)) {
            f = i0;
        }
        else if (i0 > 9223372036854L) {
            f = Long.MAX_VALUE;
        }
        else if (i0 < -9223372036854L) {
            f = Long.MIN_VALUE;
        }
        else {
            f = kotlin.time.e.f(i0);
        }
        return f;
    }
    
    public static final long u(final long n) {
        long o1 = n;
        if (R0(n)) {
            o1 = o1(n);
        }
        return o1;
    }
    
    public static final long v0(final long n) {
        return h1(n, TimeUnit.SECONDS);
    }
    
    public static final int y(final long n) {
        int n2;
        if (P0(n)) {
            n2 = 0;
        }
        else {
            n2 = (int)(i0(n) % 24);
        }
        return n2;
    }
    
    public static final int z0(final long n) {
        int n2;
        if (P0(n)) {
            n2 = 0;
        }
        else {
            n2 = (int)(r0(n) % 60);
        }
        return n2;
    }
    
    @Override
    public boolean equals(final Object o) {
        return p(this.G, o);
    }
    
    @Override
    public int hashCode() {
        return J0(this.G);
    }
    
    public int i(final long n) {
        return j(this.G, n);
    }
    
    public final /* synthetic */ long q1() {
        return this.G;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return l1(this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J&\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001b\u0010\fJ\u001d\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u000fJ\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u000fJ\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b \u0010\u0011J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b!\u0010\fJ\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b#\u0010\u0011R\"\u0010$\u001a\u00020\n8\u0000@\u0000X\u0080\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010(\u001a\u00020\n8\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001f\u0010*\u001a\u00020\n8\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006." }, d2 = { "kotlin/time/d$a", "", "", "value", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "a", "", "Lkotlin/time/d;", "u", "(I)J", "", "v", "(J)J", "t", "(D)J", "l", "m", "k", "o", "p", "n", "x", "y", "w", "r", "s", "q", "i", "j", "h", "c", "d", "b", "NEG_INFINITE", "J", "f", "()J", "ZERO", "g", "INFINITE", "e", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final double a(final double n, @org.jetbrains.annotations.e final TimeUnit timeUnit, @org.jetbrains.annotations.e final TimeUnit timeUnit2) {
            k0.p((Object)timeUnit, "sourceUnit");
            k0.p((Object)timeUnit2, "targetUnit");
            return h.b(n, timeUnit, timeUnit2);
        }
        
        @e1(version = "1.5")
        public final long b(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.DAYS);
        }
        
        @e1(version = "1.5")
        public final long c(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.DAYS);
        }
        
        @e1(version = "1.5")
        public final long d(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.DAYS);
        }
        
        public final long e() {
            return d.b();
        }
        
        public final long f() {
            return d.d();
        }
        
        public final long g() {
            return d.f();
        }
        
        @e1(version = "1.5")
        public final long h(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.HOURS);
        }
        
        @e1(version = "1.5")
        public final long i(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.HOURS);
        }
        
        @e1(version = "1.5")
        public final long j(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.HOURS);
        }
        
        @e1(version = "1.5")
        public final long k(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.MICROSECONDS);
        }
        
        @e1(version = "1.5")
        public final long l(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.MICROSECONDS);
        }
        
        @e1(version = "1.5")
        public final long m(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.MICROSECONDS);
        }
        
        @e1(version = "1.5")
        public final long n(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.MILLISECONDS);
        }
        
        @e1(version = "1.5")
        public final long o(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.MILLISECONDS);
        }
        
        @e1(version = "1.5")
        public final long p(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.MILLISECONDS);
        }
        
        @e1(version = "1.5")
        public final long q(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.MINUTES);
        }
        
        @e1(version = "1.5")
        public final long r(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.MINUTES);
        }
        
        @e1(version = "1.5")
        public final long s(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.MINUTES);
        }
        
        @e1(version = "1.5")
        public final long t(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.NANOSECONDS);
        }
        
        @e1(version = "1.5")
        public final long u(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.NANOSECONDS);
        }
        
        @e1(version = "1.5")
        public final long v(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.NANOSECONDS);
        }
        
        @e1(version = "1.5")
        public final long w(final double n) {
            return kotlin.time.e.g0(n, TimeUnit.SECONDS);
        }
        
        @e1(version = "1.5")
        public final long x(final int n) {
            return kotlin.time.e.h0(n, TimeUnit.SECONDS);
        }
        
        @e1(version = "1.5")
        public final long y(final long n) {
            return kotlin.time.e.i0(n, TimeUnit.SECONDS);
        }
    }
}
