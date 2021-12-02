// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.concurrent.Executor;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.y1;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007" }, d2 = { "Landroidx/room/r2;", "Lkotlinx/coroutines/m0;", "a", "(Landroidx/room/r2;)Lkotlinx/coroutines/m0;", "queryDispatcher", "b", "transactionDispatcher", "room-ktx_release" }, k = 2, mv = { 1, 4, 2 })
public final class k0
{
    @e
    public static final m0 a(@e final r2 r2) {
        kotlin.jvm.internal.k0.p((Object)r2, "$this$queryDispatcher");
        final Map<String, Object> l = r2.l();
        kotlin.jvm.internal.k0.o((Object)l, "backingFieldMap");
        Object obj;
        if ((obj = l.get("QueryDispatcher")) == null) {
            final Executor p = r2.p();
            kotlin.jvm.internal.k0.o((Object)p, "queryExecutor");
            obj = y1.b(p);
            l.put("QueryDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (m0)obj;
    }
    
    @e
    public static final m0 b(@e final r2 r2) {
        kotlin.jvm.internal.k0.p((Object)r2, "$this$transactionDispatcher");
        final Map<String, Object> l = r2.l();
        kotlin.jvm.internal.k0.o((Object)l, "backingFieldMap");
        Object obj;
        if ((obj = l.get("TransactionDispatcher")) == null) {
            final Executor s = r2.s();
            kotlin.jvm.internal.k0.o((Object)s, "transactionExecutor");
            obj = y1.b(s);
            l.put("TransactionDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (m0)obj;
    }
}
