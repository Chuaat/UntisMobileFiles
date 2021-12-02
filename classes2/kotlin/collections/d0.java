// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.ranges.k;
import m6.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "", "", "index", "a1", "(Ljava/util/List;I)I", "b1", "T", "Y0", "", "Z0", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class d0 extends c0
{
    public d0() {
    }
    
    @e
    public static final <T> List<T> Y0(@e final List<? extends T> list) {
        k0.p(list, "$this$asReversed");
        return new h1<T>(list);
    }
    
    @g(name = "asReversedMutable")
    @e
    public static <T> List<T> Z0(@e final List<T> list) {
        k0.p(list, "$this$asReversed");
        return new g1<T>(list);
    }
    
    private static final int a1(final List<?> list, final int i) {
        final int g = v.G(list);
        if (i >= 0 && g >= i) {
            return v.G(list) - i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new k(0, v.G(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    private static final int b1(final List<?> list, final int i) {
        final int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new k(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
