// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.Collection;
import java.nio.charset.Charset;
import m6.g;
import kotlin.y0;
import kotlin.e1;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import java.util.Objects;
import java.lang.reflect.Array;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a(\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u001a#\u0010\u0014\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016" }, d2 = { "T", "", "d", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "Ljava/nio/charset/Charset;", "charset", "", "e", "", "f", "(Ljava/util/Collection;)[Ljava/lang/Object;", "reference", "", "size", "a", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "toIndex", "Lkotlin/j2;", "c", "b", "([Ljava/lang/Object;)I", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/ArraysKt")
class n
{
    public n() {
    }
    
    @e
    public static final <T> T[] a(@e final T[] array, final int length) {
        k0.p(array, "reference");
        final Object instance = Array.newInstance(array.getClass().getComponentType(), length);
        Objects.requireNonNull(instance, "null cannot be cast to non-null type kotlin.Array<T>");
        return (T[])instance;
    }
    
    @e1(version = "1.3")
    @y0
    @g(name = "contentDeepHashCode")
    public static final <T> int b(@f final T[] a) {
        return Arrays.deepHashCode(a);
    }
    
    @e1(version = "1.3")
    public static final void c(final int i, final int j) {
        if (i <= j) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("toIndex (");
        sb.append(i);
        sb.append(") is greater than size (");
        sb.append(j);
        sb.append(").");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @kotlin.internal.f
    private static final String e(final byte[] bytes, final Charset charset) {
        return new String(bytes, charset);
    }
}
