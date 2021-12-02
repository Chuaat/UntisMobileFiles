// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import n6.p;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.w;
import kotlin.i0;
import java.util.Comparator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Random;
import kotlin.internal.f;
import kotlin.e1;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0003H\u0087\b\u001a6\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0087\b\u00f8\u0001\u0000\u001a \u0010\f\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a2\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0003\u001a(\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a!\u0010\u0014\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015" }, d2 = { "T", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Lkotlin/j2;", "n0", "Lkotlin/Function2;", "", "comparison", "o0", "", "m0", "p0", "value", "j0", "(Ljava/util/List;Ljava/lang/Object;)V", "k0", "Ljava/util/Random;", "random", "l0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class b0 extends a0
{
    public b0() {
    }
    
    @e1(version = "1.2")
    @f
    private static final <T> void j0(final List<T> list, final T obj) {
        Collections.fill(list, obj);
    }
    
    @e1(version = "1.2")
    @f
    private static final <T> void k0(final List<T> list) {
        Collections.shuffle(list);
    }
    
    @e1(version = "1.2")
    @f
    private static final <T> void l0(final List<T> list, final Random rnd) {
        Collections.shuffle(list, rnd);
    }
    
    public static <T extends Comparable<? super T>> void m0(@e final List<T> list) {
        k0.p(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
    
    @i(level = k.H, message = "Use sortWith(comparator) instead.", replaceWith = @z0(expression = "this.sortWith(comparator)", imports = {}))
    @f
    private static final <T> void n0(final List<T> list, final Comparator<? super T> comparator) {
        throw new i0(null, 1, null);
    }
    
    @i(level = k.H, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @z0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @f
    private static final <T> void o0(final List<T> list, final p<? super T, ? super T, Integer> p2) {
        throw new i0(null, 1, null);
    }
    
    public static <T> void p0(@e final List<T> list, @e final Comparator<? super T> c) {
        k0.p(list, "$this$sortWith");
        k0.p(c, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, c);
        }
    }
}
