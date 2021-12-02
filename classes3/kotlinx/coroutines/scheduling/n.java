// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.o;
import kotlinx.coroutines.internal.m0;
import m6.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0016\u0010\u0003\u001a\u00020\u00008\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00048\u00c0\u0002@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0016\u0010\n\u001a\u00020\u00008\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0016\u0010\u0011\u001a\u00020\u000f8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u000f8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0016\u0010\u0017\u001a\u00020\u00148\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0016\u0010\u0019\u001a\u00020\u00148\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0016\u0010\u001d\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001f\u001a\u00020\u00008\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002¨\u0006 " }, d2 = { "", "d", "I", "BLOCKING_DEFAULT_PARALLELISM", "Lkotlinx/coroutines/scheduling/k;", "", "a", "(Lkotlinx/coroutines/scheduling/k;)Z", "isBlocking", "e", "CORE_POOL_SIZE", "j", "TASK_PROBABLY_BLOCKING", "i", "TASK_NON_BLOCKING", "", "Ljava/lang/String;", "DEFAULT_DISPATCHER_NAME", "b", "DEFAULT_SCHEDULER_NAME", "", "g", "J", "IDLE_WORKER_KEEP_ALIVE_NS", "c", "WORK_STEALING_TIME_RESOLUTION_NS", "Lkotlinx/coroutines/scheduling/j;", "h", "Lkotlinx/coroutines/scheduling/j;", "schedulerTimeSource", "f", "MAX_POOL_SIZE", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class n
{
    @e
    public static final String a = "Dispatchers.Default";
    @e
    public static final String b = "DefaultDispatcher";
    @d
    public static final long c;
    @d
    public static final int d;
    @d
    public static final int e;
    @d
    public static final int f;
    @d
    public static final long g;
    @d
    @e
    public static j h;
    public static final int i = 0;
    public static final int j = 1;
    
    static {
        c = m0.g("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        d = m0.f("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f = m0.f("kotlinx.coroutines.scheduler.max.pool.size", o.B(m0.a() * 128, e = m0.f("kotlinx.coroutines.scheduler.core.pool.size", o.n(m0.a(), 2), 1, 0, 8, null), 2097150), 0, 2097150, 4, null);
        g = TimeUnit.SECONDS.toNanos(m0.g("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        n.h = kotlinx.coroutines.scheduling.h.a;
    }
    
    public static final boolean a(@e final k k) {
        final int t = k.H.t();
        boolean b = true;
        if (t != 1) {
            b = false;
        }
        return b;
    }
}
