// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.f2;
import kotlin.z1;
import kotlin.v1;
import kotlin.r1;
import java.util.Collection;
import kotlin.e2;
import kotlin.y1;
import m6.g;
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.q1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u001c\u0010\u0017\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\r0\u0011H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "", "Lkotlin/q1;", "Lkotlin/r1;", "e", "(Ljava/util/Collection;)[B", "Lkotlin/u1;", "Lkotlin/v1;", "f", "(Ljava/util/Collection;)[I", "Lkotlin/y1;", "Lkotlin/z1;", "g", "(Ljava/util/Collection;)[J", "Lkotlin/e2;", "Lkotlin/f2;", "h", "(Ljava/util/Collection;)[S", "", "b", "(Ljava/lang/Iterable;)I", "c", "(Ljava/lang/Iterable;)J", "a", "d", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/UCollectionsKt")
class u1
{
    public u1() {
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfUByte")
    public static final int a(@e final Iterable<q1> iterable) {
        k0.p(iterable, "$this$sum");
        final Iterator<q1> iterator = iterable.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            k = kotlin.u1.k(k + kotlin.u1.k(iterator.next().O0() & 0xFF));
        }
        return k;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfUInt")
    public static final int b(@e final Iterable<kotlin.u1> iterable) {
        k0.p(iterable, "$this$sum");
        final Iterator<kotlin.u1> iterator = iterable.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            k = kotlin.u1.k(k + iterator.next().R0());
        }
        return k;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfULong")
    public static final long c(@e final Iterable<y1> iterable) {
        k0.p(iterable, "$this$sum");
        final Iterator<y1> iterator = iterable.iterator();
        long k = 0L;
        while (iterator.hasNext()) {
            k = y1.k(k + iterator.next().R0());
        }
        return k;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { r.class })
    @g(name = "sumOfUShort")
    public static final int d(@e final Iterable<e2> iterable) {
        k0.p(iterable, "$this$sum");
        final Iterator<e2> iterator = iterable.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            k = kotlin.u1.k(k + kotlin.u1.k(iterator.next().O0() & 0xFFFF));
        }
        return k;
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final byte[] e(@e final Collection<q1> collection) {
        k0.p(collection, "$this$toUByteArray");
        final byte[] h = r1.h(collection.size());
        final Iterator<q1> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            r1.B(h, n, iterator.next().O0());
            ++n;
        }
        return h;
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final int[] f(@e final Collection<kotlin.u1> collection) {
        k0.p(collection, "$this$toUIntArray");
        final int[] h = v1.h(collection.size());
        final Iterator<kotlin.u1> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            v1.B(h, n, iterator.next().R0());
            ++n;
        }
        return h;
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final long[] g(@e final Collection<y1> collection) {
        k0.p(collection, "$this$toULongArray");
        final long[] h = z1.h(collection.size());
        final Iterator<y1> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            z1.B(h, n, iterator.next().R0());
            ++n;
        }
        return h;
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final short[] h(@e final Collection<e2> collection) {
        k0.p(collection, "$this$toUShortArray");
        final short[] h = f2.h(collection.size());
        final Iterator<e2> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            f2.B(h, n, iterator.next().O0());
            ++n;
        }
        return h;
    }
}
