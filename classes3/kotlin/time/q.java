// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.internal.f;
import kotlin.e1;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007" }, d2 = { "Lkotlin/time/o;", "other", "Lkotlin/time/d;", "b", "(Lkotlin/time/o;Lkotlin/time/o;)J", "", "a", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class q
{
    @i(level = k.H, message = "Comparing one TimeMark to another is not a well defined operation because these time marks could have been obtained from the different time sources.")
    @e1(version = "1.3")
    @f
    @j
    private static final int a(final o o, final o o2) {
        k0.p((Object)o, "$this$compareTo");
        throw new Error("Operation is disallowed.");
    }
    
    @i(level = k.H, message = "Subtracting one TimeMark from another is not a well defined operation because these time marks could have been obtained from the different time sources.")
    @e1(version = "1.3")
    @f
    @j
    private static final long b(final o o, final o o2) {
        k0.p((Object)o, "$this$minus");
        throw new Error("Operation is disallowed.");
    }
}
