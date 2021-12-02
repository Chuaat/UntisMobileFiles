// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.n1;
import kotlin.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.y0;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import kotlin.internal.f;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import n6.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0001\u001a\u001f\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u001a@\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00120\u0015\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0014*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00150\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017" }, d2 = { "T", "Lkotlin/Function0;", "", "iterator", "", "X", "", "Z", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "Y", "", "", "d0", "(Ljava/util/Collection;)Z", "source", "b0", "a0", "", "c0", "R", "Lkotlin/s0;", "e0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class y extends x
{
    public y() {
    }
    
    @f
    private static final <T> Iterable<T> X(final a<? extends Iterator<? extends T>> a) {
        return new Iterable<T>() {
            @e
            @Override
            public Iterator<T> iterator() {
                return a.invoke();
            }
        };
    }
    
    @y0
    public static <T> int Y(@e final Iterable<? extends T> iterable, int size) {
        k0.p(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            size = ((Collection)iterable).size();
        }
        return size;
    }
    
    @y0
    @org.jetbrains.annotations.f
    public static final <T> Integer Z(@e final Iterable<? extends T> iterable) {
        k0.p(iterable, "$this$collectionSizeOrNull");
        Integer value;
        if (iterable instanceof Collection) {
            value = ((Collection)iterable).size();
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static <T> Collection<T> a0(@e final Iterable<? extends T> iterable) {
        k0.p(iterable, "$this$convertToSetForSetOperation");
        Object g5;
        if (iterable instanceof Set) {
            g5 = iterable;
        }
        else {
            if (iterable instanceof Collection) {
                final Collection<? extends T> collection = (Collection<? extends T>)iterable;
                if (!d0((Collection<?>)collection)) {
                    g5 = collection;
                    return (Collection<T>)g5;
                }
            }
            g5 = v.G5((Iterable<?>)iterable);
        }
        return (Collection<T>)g5;
    }
    
    @e
    public static final <T> Collection<T> b0(@e final Iterable<? extends T> iterable, @e final Iterable<? extends T> iterable2) {
        k0.p(iterable, "$this$convertToSetForSetOperationWith");
        k0.p(iterable2, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (iterable2 instanceof Collection && ((Collection)iterable2).size() < 2) {
                    return (Collection<T>)iterable;
                }
                final Collection<? extends T> collection = (Collection<? extends T>)iterable;
                if (!d0((Collection<?>)collection)) {
                    final Object g5 = collection;
                    return (Collection<T>)g5;
                }
            }
            final Object g5 = v.G5((Iterable<?>)iterable);
            return (Collection<T>)g5;
        }
        final Object g5 = iterable;
        return (Collection<T>)g5;
    }
    
    @e
    public static <T> List<T> c0(@e final Iterable<? extends Iterable<? extends T>> iterable) {
        k0.p(iterable, "$this$flatten");
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<? extends Iterable<? extends T>> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection<? super Object>)list, (Iterable<?>)iterator.next());
        }
        return (List<T>)list;
    }
    
    private static final <T> boolean d0(final Collection<? extends T> collection) {
        return collection.size() > 2 && collection instanceof ArrayList;
    }
    
    @e
    public static final <T, R> s0<List<T>, List<R>> e0(@e final Iterable<? extends s0<? extends T, ? extends R>> iterable) {
        k0.p(iterable, "$this$unzip");
        final int y = v.Y((Iterable<?>)iterable, 10);
        final ArrayList list = new ArrayList<T>(y);
        final ArrayList list2 = new ArrayList<R>(y);
        for (final s0<Object, B> s0 : iterable) {
            list.add((T)s0.e());
            list2.add((R)s0.f());
        }
        return (s0<List<T>, List<R>>)n1.a(list, list2);
    }
}
