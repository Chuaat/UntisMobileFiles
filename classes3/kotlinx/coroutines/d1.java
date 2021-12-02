// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g$c;
import kotlin.coroutines.g;
import kotlin.time.j;
import kotlin.j2;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\bH\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013" }, d2 = { "", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/j2;", "b", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/d;", "duration", "c", "(DLkotlin/coroutines/d;)Ljava/lang/Object;", "e", "(D)J", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/c1;", "d", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/c1;", "delay", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class d1
{
    @f
    public static final Object a(@e final d<?> d) {
        final p p = new p((d<? super T>)b.d((d)d), 1);
        p.H();
        final Object y = p.y();
        if (y == b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @f
    public static final Object b(final long n, @e final d<? super j2> d) {
        if (n <= 0L) {
            return j2.a;
        }
        final p<Object> p2 = new p<Object>((kotlin.coroutines.d<? super Object>)b.d((d)d), 1);
        p2.H();
        if (n < Long.MAX_VALUE) {
            d(((d)p2).getContext()).e(n, p2);
        }
        final Object y = p2.y();
        if (y == b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @j
    @f
    public static final Object c(final double n, @e final d<? super j2> d) {
        final Object b = b(e(n), d);
        if (b == kotlin.coroutines.intrinsics.b.h()) {
            return b;
        }
        return j2.a;
    }
    
    @e
    public static final c1 d(@e final g g) {
        Object value;
        if (!((value = g.get((g$c)kotlin.coroutines.e.q)) instanceof c1)) {
            value = null;
        }
        c1 a = (c1)value;
        if (a == null) {
            a = z0.a();
        }
        return a;
    }
    
    @j
    public static final long e(final double n) {
        long o;
        if (kotlin.time.d.compareTo-LRDsOJo(n, kotlin.time.d.K.getZERO-UwyO8pc()) > 0) {
            o = kotlin.ranges.o.o(kotlin.time.d.toLongMilliseconds-impl(n), 1L);
        }
        else {
            o = 0L;
        }
        return o;
    }
}
