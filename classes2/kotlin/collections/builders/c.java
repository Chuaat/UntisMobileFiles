// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import java.util.Objects;
import java.util.Arrays;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e" }, d2 = { "E", "", "size", "", "d", "(I)[Ljava/lang/Object;", "T", "offset", "length", "", "j", "([Ljava/lang/Object;II)Ljava/lang/String;", "i", "([Ljava/lang/Object;II)I", "", "other", "", "h", "([Ljava/lang/Object;IILjava/util/List;)Z", "newSize", "e", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "Lkotlin/j2;", "f", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "g", "([Ljava/lang/Object;II)V", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final <E> E[] d(final int n) {
        if (n >= 0) {
            return (E[])new Object[n];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
    
    @e
    public static final <T> T[] e(@e final T[] original, final int newLength) {
        k0.p(original, "$this$copyOfUninitializedElements");
        final T[] copy = Arrays.copyOf(original, newLength);
        k0.o(copy, "java.util.Arrays.copyOf(this, newSize)");
        Objects.requireNonNull(copy, "null cannot be cast to non-null type kotlin.Array<T>");
        return copy;
    }
    
    public static final <E> void f(@e final E[] array, final int n) {
        k0.p(array, "$this$resetAt");
        array[n] = null;
    }
    
    public static final <E> void g(@e final E[] array, int i, final int n) {
        k0.p(array, "$this$resetRange");
        while (i < n) {
            f(array, i);
            ++i;
        }
    }
    
    private static final <T> boolean h(final T[] array, final int n, final int n2, final List<?> list) {
        if (n2 != list.size()) {
            return false;
        }
        for (int i = 0; i < n2; ++i) {
            if (true ^ k0.g(array[n + i], list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    private static final <T> int i(final T[] array, final int n, final int n2) {
        int n3 = 1;
        for (int i = 0; i < n2; ++i) {
            final T t = array[n + i];
            int hashCode;
            if (t != null) {
                hashCode = t.hashCode();
            }
            else {
                hashCode = 0;
            }
            n3 = n3 * 31 + hashCode;
        }
        return n3;
    }
    
    private static final <T> String j(final T[] array, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder(n2 * 3 + 2);
        sb.append("[");
        for (int i = 0; i < n2; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[n + i]);
        }
        sb.append("]");
        final String string = sb.toString();
        k0.o(string, "sb.toString()");
        return string;
    }
}
