// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.time.j;
import kotlin.time.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007" }, d2 = { "Lkotlinx/coroutines/flow/q0$a;", "Lkotlin/time/d;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/q0;", "a", "(Lkotlinx/coroutines/flow/q0$a;DD)Lkotlinx/coroutines/flow/q0;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class r0
{
    @j
    @e
    public static final q0 a(@e final q0.a a, final double n, final double n2) {
        return new u0(d.toLongMilliseconds-impl(n), d.toLongMilliseconds-impl(n2));
    }
}
