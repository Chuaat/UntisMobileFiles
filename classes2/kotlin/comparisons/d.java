// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.comparisons;

import kotlin.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\u001aI\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\b\u001aA\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\n\u001aM\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012" }, d2 = { "T", "a", "b", "c", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "p0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "q0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "", "other", "r0", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "s0", "t0", "u0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/comparisons/ComparisonsKt")
class d extends c
{
    public d() {
    }
    
    @e1(version = "1.1")
    public static final <T> T p0(final T t, final T t2, final T t3, @e final Comparator<? super T> comparator) {
        k0.p(comparator, "comparator");
        return q0(t, q0(t2, t3, comparator), comparator);
    }
    
    @e1(version = "1.1")
    public static final <T> T q0(T t, final T t2, @e final Comparator<? super T> comparator) {
        k0.p(comparator, "comparator");
        if (comparator.compare(t, t2) < 0) {
            t = t2;
        }
        return t;
    }
    
    @e1(version = "1.4")
    public static final <T> T r0(T t, @e final T[] array, @e final Comparator<? super T> comparator) {
        k0.p(array, "other");
        k0.p(comparator, "comparator");
        T t3;
        for (int length = array.length, i = 0; i < length; ++i, t = t3) {
            final T t2 = array[i];
            t3 = t;
            if (comparator.compare(t, t2) < 0) {
                t3 = t2;
            }
        }
        return t;
    }
    
    @e1(version = "1.1")
    public static final <T> T s0(final T t, final T t2, final T t3, @e final Comparator<? super T> comparator) {
        k0.p(comparator, "comparator");
        return t0(t, t0(t2, t3, comparator), comparator);
    }
    
    @e1(version = "1.1")
    public static final <T> T t0(T t, final T t2, @e final Comparator<? super T> comparator) {
        k0.p(comparator, "comparator");
        if (comparator.compare(t, t2) > 0) {
            t = t2;
        }
        return t;
    }
    
    @e1(version = "1.4")
    public static final <T> T u0(T t, @e final T[] array, @e final Comparator<? super T> comparator) {
        k0.p(array, "other");
        k0.p(comparator, "comparator");
        T t3;
        for (int length = array.length, i = 0; i < length; ++i, t = t3) {
            final T t2 = array[i];
            t3 = t;
            if (comparator.compare(t, t2) > 0) {
                t3 = t2;
            }
        }
        return t;
    }
}
