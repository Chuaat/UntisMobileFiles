// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.internal.f;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\u0002\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0087\u0002\u001aB\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u000b\"\u0018\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0003*\u00028\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0087\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¨\u0006\u0017" }, d2 = { "", "T", "that", "Lkotlin/ranges/g;", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/g;", "", "Lkotlin/ranges/f;", "c", "", "d", "", "", "R", "element", "", "b", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "isPositive", "", "step", "Lkotlin/j2;", "a", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/ranges/RangesKt")
class p
{
    public p() {
    }
    
    public static final void a(final boolean b, @e final Number obj) {
        k0.p(obj, "step");
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.3")
    @f
    private static final <T, R extends Iterable> boolean b(final R r, final T t) {
        k0.p(r, "$this$contains");
        return t != null && ((g)r).f((Comparable)t);
    }
    
    @e1(version = "1.1")
    @e
    public static final kotlin.ranges.f<Double> c(final double n, final double n2) {
        return new d(n, n2);
    }
    
    @e1(version = "1.1")
    @e
    public static final kotlin.ranges.f<Float> d(final float n, final float n2) {
        return new kotlin.ranges.e(n, n2);
    }
    
    @e
    public static final <T extends Comparable<? super T>> g<T> e(@e final T t, @e final T t2) {
        k0.p(t, "$this$rangeTo");
        k0.p(t2, "that");
        return new h<T>(t, t2);
    }
}
