// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.e2;
import kotlin.y1;
import m6.g;
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import java.util.Iterator;
import kotlin.u1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.q1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u001c\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "Lkotlin/sequences/m;", "Lkotlin/u1;", "b", "(Lkotlin/sequences/m;)I", "Lkotlin/y1;", "c", "(Lkotlin/sequences/m;)J", "Lkotlin/q1;", "a", "Lkotlin/e2;", "d", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/sequences/USequencesKt")
class b0
{
    public b0() {
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfUByte")
    public static final int a(@e final m<q1> m) {
        k0.p((Object)m, "$this$sum");
        final Iterator<q1> iterator = m.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            k = u1.k(k + u1.k(iterator.next().O0() & 0xFF));
        }
        return k;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfUInt")
    public static final int b(@e final m<u1> m) {
        k0.p((Object)m, "$this$sum");
        final Iterator<u1> iterator = m.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            k = u1.k(k + iterator.next().R0());
        }
        return k;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfULong")
    public static final long c(@e final m<y1> m) {
        k0.p((Object)m, "$this$sum");
        final Iterator<y1> iterator = m.iterator();
        long k = 0L;
        while (iterator.hasNext()) {
            k = y1.k(k + iterator.next().R0());
        }
        return k;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfUShort")
    public static final int d(@e final m<e2> m) {
        k0.p((Object)m, "$this$sum");
        final Iterator<e2> iterator = m.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            k = u1.k(k + u1.k(iterator.next().O0() & 0xFFFF));
        }
        return k;
    }
}
