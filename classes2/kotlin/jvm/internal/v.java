// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import n6.p;
import n6.l;
import n6.a;
import java.lang.reflect.Array;
import java.util.Objects;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.Arrays;
import org.jetbrains.annotations.e;
import java.util.Collection;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0080\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\n2(\u0010\u000e\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\rH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011\"\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0015" }, d2 = { "", "collection", "", "", "a", "(Ljava/util/Collection;)[Ljava/lang/Object;", "b", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "Lkotlin/Function0;", "empty", "Lkotlin/Function1;", "", "alloc", "Lkotlin/Function2;", "trim", "c", "(Ljava/util/Collection;Ln6/a;Ln6/l;Ln6/p;)[Ljava/lang/Object;", "I", "MAX_SIZE", "[Ljava/lang/Object;", "EMPTY", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "CollectionToArray")
public final class v
{
    private static final Object[] a;
    private static final int b = 2147483645;
    
    static {
        a = new Object[0];
    }
    
    @g(name = "toArray")
    @e
    public static final Object[] a(@e final Collection<?> collection) {
        k0.p(collection, "collection");
        final int size = collection.size();
        if (size != 0) {
            final Iterator<?> iterator = collection.iterator();
            if (iterator.hasNext()) {
                Object[] array = new Object[size];
                int n = 0;
                while (true) {
                    final int newLength = n + 1;
                    array[n] = iterator.next();
                    Object[] copy;
                    if (newLength >= array.length) {
                        if (!iterator.hasNext()) {
                            return array;
                        }
                        int newLength2;
                        if ((newLength2 = newLength * 3 + 1 >>> 1) <= newLength) {
                            if (newLength >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            newLength2 = 2147483645;
                        }
                        copy = Arrays.copyOf(array, newLength2);
                        k0.o(copy, "Arrays.copyOf(result, newSize)");
                    }
                    else {
                        copy = array;
                        if (!iterator.hasNext()) {
                            array = Arrays.copyOf(array, newLength);
                            k0.o(array, "Arrays.copyOf(result, size)");
                            return array;
                        }
                    }
                    n = newLength;
                    array = copy;
                }
            }
        }
        return v.a;
    }
    
    @g(name = "toArray")
    @e
    public static final Object[] b(@e final Collection<?> collection, @f final Object[] obj) {
        k0.p(collection, "collection");
        Objects.requireNonNull(obj);
        final int size = collection.size();
        int n = 0;
        Object[] copy;
        if (size == 0) {
            copy = obj;
            if (obj.length > 0) {
                obj[0] = null;
                copy = obj;
            }
        }
        else {
            final Iterator<?> iterator = collection.iterator();
            if (!iterator.hasNext()) {
                copy = obj;
                if (obj.length > 0) {
                    obj[0] = null;
                    copy = obj;
                }
            }
            else {
                if (size <= obj.length) {
                    copy = obj;
                }
                else {
                    final Object instance = Array.newInstance(obj.getClass().getComponentType(), size);
                    Objects.requireNonNull(instance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    copy = (Object[])instance;
                }
                while (true) {
                    final int newLength = n + 1;
                    copy[n] = iterator.next();
                    Object[] copy2;
                    if (newLength >= copy.length) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        int newLength2;
                        if ((newLength2 = newLength * 3 + 1 >>> 1) <= newLength) {
                            if (newLength >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            newLength2 = 2147483645;
                        }
                        copy2 = Arrays.copyOf(copy, newLength2);
                        k0.o(copy2, "Arrays.copyOf(result, newSize)");
                    }
                    else {
                        copy2 = copy;
                        if (!iterator.hasNext()) {
                            if (copy == obj) {
                                obj[newLength] = null;
                                copy = obj;
                                break;
                            }
                            copy = Arrays.copyOf(copy, newLength);
                            k0.o(copy, "Arrays.copyOf(result, size)");
                            break;
                        }
                    }
                    n = newLength;
                    copy = copy2;
                }
            }
        }
        return copy;
    }
    
    private static final Object[] c(final Collection<?> collection, final a<Object[]> a, final l<? super Integer, Object[]> l, final p<? super Object[], ? super Integer, Object[]> p4) {
        final int size = collection.size();
        if (size != 0) {
            final Iterator<?> iterator = collection.iterator();
            if (iterator.hasNext()) {
                Object[] original = l.invoke(size);
                int n = 0;
                while (true) {
                    final int i = n + 1;
                    original[n] = iterator.next();
                    Object[] copy;
                    if (i >= original.length) {
                        if (!iterator.hasNext()) {
                            return original;
                        }
                        int newLength;
                        if ((newLength = i * 3 + 1 >>> 1) <= i) {
                            if (i >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            newLength = 2147483645;
                        }
                        copy = Arrays.copyOf(original, newLength);
                        k0.o(copy, "Arrays.copyOf(result, newSize)");
                    }
                    else {
                        copy = original;
                        if (!iterator.hasNext()) {
                            return p4.invoke(original, i);
                        }
                    }
                    n = i;
                    original = copy;
                }
            }
        }
        return a.invoke();
    }
}
