// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g;
import kotlinx.coroutines.q3;
import kotlin.coroutines.g$b;
import n6.p;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0016\u0010\u000b\u001a\u00020\t8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f" }, d2 = { "Lkotlin/coroutines/g;", "context", "", "b", "countOrElement", "c", "oldState", "Lkotlin/j2;", "a", "Lkotlinx/coroutines/internal/k0;", "Lkotlinx/coroutines/internal/k0;", "NO_THREAD_ELEMENTS", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class p0
{
    @d
    @e
    public static final k0 a;
    private static final p<Object, g$b, Object> b;
    private static final p<q3<?>, g$b, q3<?>> c;
    private static final p<v0, g$b, v0> d;
    
    static {
        a = new k0("NO_THREAD_ELEMENTS");
        b = (p)p0$a.G;
        c = (p)p0$b.G;
        d = (p)p0$c.G;
    }
    
    public static final void a(@e final g g, @f final Object o) {
        if (o == p0.a) {
            return;
        }
        if (o instanceof v0) {
            ((v0)o).b(g);
        }
        else {
            final Object fold = g.fold((Object)null, (p)p0.c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((q3<Object>)fold).Q(g, o);
        }
    }
    
    @e
    public static final Object b(@e final g g) {
        final Object fold = g.fold((Object)0, (p)p0.b);
        kotlin.jvm.internal.k0.m(fold);
        return fold;
    }
    
    @f
    public static final Object c(@e final g g, @f Object b) {
        if (b == null) {
            b = b(g);
        }
        Object o;
        if (b == Integer.valueOf(0)) {
            o = p0.a;
        }
        else if (b instanceof Integer) {
            o = g.fold((Object)new v0(g, ((Number)b).intValue()), (p)p0.d);
        }
        else {
            Objects.requireNonNull(b, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            o = ((q3)b).X(g);
        }
        return o;
    }
}
