// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001c\u0010\n\u001a\u00020\u00058\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\f\"\u0016\u0010\u0010\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0016\u0010\u0014\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u001c\u0010\u0017\u001a\u00020\u00058\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u0012\u0004\b\u0016\u0010\t\"\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\f\"\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\f*\u001e\b\u0002\u0010\u001d\u001a\u0004\b\u0000\u0010\u001b\"\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0012\u0004\u0012\u00028\u00000\u001c¨\u0006\u001e" }, d2 = { "", "timeMillis", "d", "timeNanos", "c", "Lkotlinx/coroutines/internal/k0;", "h", "Lkotlinx/coroutines/internal/k0;", "getCLOSED_EMPTY$annotations", "()V", "CLOSED_EMPTY", "", "I", "SCHEDULE_COMPLETED", "e", "J", "MS_TO_NS", "g", "MAX_DELAY_NS", "f", "MAX_MS", "a", "getDISPOSED_TASK$annotations", "DISPOSED_TASK", "b", "SCHEDULE_OK", "SCHEDULE_DISPOSED", "T", "Lkotlinx/coroutines/internal/w;", "Queue", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class t1
{
    private static final k0 a;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final long e = 1000000L;
    private static final long f = 9223372036854L;
    private static final long g = 4611686018427387903L;
    private static final k0 h;
    
    static {
        a = new k0("REMOVED_TASK");
        h = new k0("CLOSED_EMPTY");
    }
    
    public static final long c(final long n) {
        return n / 1000000L;
    }
    
    public static final long d(long n) {
        final long n2 = 0L;
        if (n <= 0L) {
            n = n2;
        }
        else if (n >= 9223372036854L) {
            n = Long.MAX_VALUE;
        }
        else {
            n *= 1000000L;
        }
        return n;
    }
}
