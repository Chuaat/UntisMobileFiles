// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001c\u0010\b\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000f\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\r\u0010\u0005\u0012\u0004\b\u000e\u0010\u0007\"\u001c\u0010\u0012\u001a\u00020\u00038\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u0012\u0004\b\u0011\u0010\u0007\"\u001c\u0010\u0017\u001a\u00020\u00138\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0007\"\u001c\u0010\u001a\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u0012\u0004\b\u0019\u0010\u0007\"\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u000b\"\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000b\"\u001c\u0010 \u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u0012\u0004\b\u001f\u0010\u0007\"\u001c\u0010#\u001a\u00020\u00138\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u0012\u0004\b\"\u0010\u0007¨\u0006$" }, d2 = { "", "g", "o", "Lkotlinx/coroutines/internal/k0;", "d", "Lkotlinx/coroutines/internal/k0;", "getTOO_LATE_TO_CANCEL$annotations", "()V", "TOO_LATE_TO_CANCEL", "", "f", "I", "FALSE", "a", "getCOMPLETING_ALREADY$annotations", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "Lkotlinx/coroutines/o1;", "j", "Lkotlinx/coroutines/o1;", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "TRUE", "e", "RETRY", "h", "getSEALED$annotations", "SEALED", "i", "getEMPTY_NEW$annotations", "EMPTY_NEW", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class t2
{
    private static final k0 a;
    @d
    @e
    public static final k0 b;
    private static final k0 c;
    private static final k0 d;
    private static final int e = -1;
    private static final int f = 0;
    private static final int g = 1;
    private static final k0 h;
    private static final o1 i;
    private static final o1 j;
    
    static {
        a = new k0("COMPLETING_ALREADY");
        b = new k0("COMPLETING_WAITING_CHILDREN");
        c = new k0("COMPLETING_RETRY");
        d = new k0("TOO_LATE_TO_CANCEL");
        h = new k0("SEALED");
        i = new o1(false);
        j = new o1(true);
    }
    
    @f
    public static final Object g(@f final Object o) {
        Object o2 = o;
        if (o instanceof d2) {
            o2 = new e2((d2)o);
        }
        return o2;
    }
    
    @f
    public static final Object o(@f final Object o) {
        Object o2;
        if (!(o instanceof e2)) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        final e2 e2 = (e2)o2;
        Object o3 = o;
        if (e2 != null) {
            final d2 a = e2.a;
            o3 = o;
            if (a != null) {
                o3 = a;
            }
        }
        return o3;
    }
}
