// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.RandomAccess;
import java.util.Iterator;
import kotlin.q;
import kotlin.o2;
import kotlin.e1;
import java.util.NoSuchElementException;
import java.util.HashSet;
import kotlin.sequences.p;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.q1;
import java.util.Objects;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.util.List;
import kotlin.sequences.m;
import kotlin.internal.f;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\r\u001a/\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\t\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\b\u001a.\u0010\n\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\b\u001a*\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\n\u001a0\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\n\u001a*\u0010\u0015\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0015\u0010\r\u001a)\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\n\u001a0\u0010\u0017\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0012\u001a)\u0010\u0018\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\n\u001a&\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a&\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u001a/\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u001d\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a&\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u001a/\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001f\u0010\u001c\u001a&\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a/\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b!\u0010\u001c\u001a&\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u001a\u0017\u0010#\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a*\u0010(\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a*\u0010)\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a;\u0010+\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,\u001a(\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010/\u001a\u00020.H\u0087\b¢\u0006\u0004\b0\u00101\u001a\u001f\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b4\u00103\u001a\u001f\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b5\u00103\u001a!\u00106\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b6\u00103\u001a*\u00107\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a*\u00108\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a;\u00109\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:¨\u0006;" }, d2 = { "Lkotlin/internal/i;", "T", "", "element", "", "E0", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "", "elements", "H0", "R0", "Lkotlin/j2;", "A0", "(Ljava/util/Collection;Ljava/lang/Object;)V", "", "z0", "", "C0", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "Lkotlin/sequences/m;", "B0", "w0", "v0", "y0", "x0", "q0", "r0", "s0", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "G0", "I0", "J0", "Q0", "T0", "S0", "V0", "(Ljava/util/Collection;)Z", "", "Lkotlin/Function1;", "predicate", "F0", "P0", "predicateResultToRemove", "t0", "(Ljava/lang/Iterable;Ln6/l;Z)Z", "", "", "index", "D0", "(Ljava/util/List;I)Ljava/lang/Object;", "L0", "(Ljava/util/List;)Ljava/lang/Object;", "M0", "N0", "O0", "K0", "U0", "u0", "(Ljava/util/List;Ln6/l;Z)Z", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class c0 extends b0
{
    public c0() {
    }
    
    @f
    private static final <T> void A0(final Collection<? super T> collection, final T t) {
        k0.p(collection, "$this$plusAssign");
        collection.add(t);
    }
    
    @f
    private static final <T> void B0(final Collection<? super T> collection, final m<? extends T> m) {
        k0.p(collection, "$this$plusAssign");
        v.r0((Collection<? super Object>)collection, (kotlin.sequences.m<?>)m);
    }
    
    @f
    private static final <T> void C0(final Collection<? super T> collection, final T[] array) {
        k0.p(collection, "$this$plusAssign");
        v.s0(collection, array);
    }
    
    @i(level = k.H, message = "Use removeAt(index) instead.", replaceWith = @z0(expression = "removeAt(index)", imports = {}))
    @f
    private static final <T> T D0(final List<T> list, final int n) {
        return list.remove(n);
    }
    
    @f
    private static final <T> boolean E0(final Collection<? extends T> obj, final T t) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return q1.a(obj).remove(t);
    }
    
    public static final <T> boolean F0(@e final Iterable<? extends T> iterable, @e final l<? super T, Boolean> l) {
        k0.p(iterable, "$this$removeAll");
        k0.p(l, "predicate");
        return t0((Iterable<?>)iterable, (l<? super Object, Boolean>)l, true);
    }
    
    public static final <T> boolean G0(@e final Collection<? super T> collection, @e final Iterable<? extends T> iterable) {
        k0.p(collection, "$this$removeAll");
        k0.p(iterable, "elements");
        return q1.a(collection).removeAll(y.b0((Iterable<?>)iterable, (Iterable<?>)collection));
    }
    
    @f
    private static final <T> boolean H0(final Collection<? extends T> obj, final Collection<? extends T> collection) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return q1.a(obj).removeAll(collection);
    }
    
    public static final <T> boolean I0(@e final Collection<? super T> collection, @e final m<? extends T> m) {
        k0.p(collection, "$this$removeAll");
        k0.p(m, "elements");
        final HashSet u2 = p.U2((m)m);
        final boolean empty = u2.isEmpty();
        boolean b = true;
        if (!(empty ^ true) || !collection.removeAll(u2)) {
            b = false;
        }
        return b;
    }
    
    public static final <T> boolean J0(@e final Collection<? super T> collection, @e final T[] array) {
        k0.p(collection, "$this$removeAll");
        k0.p(array, "elements");
        final int length = array.length;
        final boolean b = false;
        final boolean b2 = length == 0;
        boolean b3 = b;
        if (b2 ^ true) {
            b3 = b;
            if (collection.removeAll(kotlin.collections.m.Ux(array))) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public static final <T> boolean K0(@e final List<T> list, @e final l<? super T, Boolean> l) {
        k0.p(list, "$this$removeAll");
        k0.p(l, "predicate");
        return u0(list, l, true);
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    public static final <T> T L0(@e final List<T> list) {
        k0.p(list, "$this$removeFirst");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @org.jetbrains.annotations.f
    public static final <T> T M0(@e final List<T> list) {
        k0.p(list, "$this$removeFirstOrNull");
        T remove;
        if (list.isEmpty()) {
            remove = null;
        }
        else {
            remove = list.remove(0);
        }
        return remove;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    public static <T> T N0(@e final List<T> list) {
        k0.p(list, "$this$removeLast");
        if (!list.isEmpty()) {
            return list.remove(v.G((List<?>)list));
        }
        throw new NoSuchElementException("List is empty.");
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @org.jetbrains.annotations.f
    public static final <T> T O0(@e final List<T> list) {
        k0.p(list, "$this$removeLastOrNull");
        T remove;
        if (list.isEmpty()) {
            remove = null;
        }
        else {
            remove = list.remove(v.G((List<?>)list));
        }
        return remove;
    }
    
    public static <T> boolean P0(@e final Iterable<? extends T> iterable, @e final l<? super T, Boolean> l) {
        k0.p(iterable, "$this$retainAll");
        k0.p(l, "predicate");
        return t0((Iterable<?>)iterable, (l<? super Object, Boolean>)l, false);
    }
    
    public static final <T> boolean Q0(@e final Collection<? super T> collection, @e final Iterable<? extends T> iterable) {
        k0.p(collection, "$this$retainAll");
        k0.p(iterable, "elements");
        return q1.a(collection).retainAll(y.b0((Iterable<?>)iterable, (Iterable<?>)collection));
    }
    
    @f
    private static final <T> boolean R0(final Collection<? extends T> obj, final Collection<? extends T> collection) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return q1.a(obj).retainAll(collection);
    }
    
    public static final <T> boolean S0(@e final Collection<? super T> collection, @e final m<? extends T> m) {
        k0.p(collection, "$this$retainAll");
        k0.p(m, "elements");
        final HashSet u2 = p.U2((m)m);
        if (u2.isEmpty() ^ true) {
            return collection.retainAll(u2);
        }
        return V0(collection);
    }
    
    public static final <T> boolean T0(@e final Collection<? super T> collection, @e final T[] array) {
        k0.p(collection, "$this$retainAll");
        k0.p(array, "elements");
        if (array.length == 0 ^ true) {
            return collection.retainAll(kotlin.collections.m.Ux(array));
        }
        return V0(collection);
    }
    
    public static final <T> boolean U0(@e final List<T> list, @e final l<? super T, Boolean> l) {
        k0.p(list, "$this$retainAll");
        k0.p(l, "predicate");
        return u0(list, l, false);
    }
    
    private static final boolean V0(final Collection<?> collection) {
        final boolean empty = collection.isEmpty();
        collection.clear();
        return empty ^ true;
    }
    
    public static <T> boolean q0(@e final Collection<? super T> collection, @e final Iterable<? extends T> iterable) {
        k0.p(collection, "$this$addAll");
        k0.p(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection<? extends T>)iterable);
        }
        boolean b = false;
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (collection.add((Object)iterator.next())) {
                b = true;
            }
        }
        return b;
    }
    
    public static <T> boolean r0(@e final Collection<? super T> collection, @e final m<? extends T> m) {
        k0.p(collection, "$this$addAll");
        k0.p(m, "elements");
        final Iterator iterator = m.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            if (collection.add(iterator.next())) {
                b = true;
            }
        }
        return b;
    }
    
    public static <T> boolean s0(@e final Collection<? super T> collection, @e final T[] array) {
        k0.p(collection, "$this$addAll");
        k0.p(array, "elements");
        return collection.addAll((Collection<? extends T>)kotlin.collections.m.t(array));
    }
    
    private static final <T> boolean t0(final Iterable<? extends T> iterable, final l<? super T, Boolean> l, final boolean b) {
        final Iterator<? extends T> iterator = iterable.iterator();
        boolean b2 = false;
        while (iterator.hasNext()) {
            if (l.invoke((Object)iterator.next()) == b) {
                iterator.remove();
                b2 = true;
            }
        }
        return b2;
    }
    
    private static final <T> boolean u0(final List<T> obj, final l<? super T, Boolean> l, final boolean b) {
        if (!(obj instanceof RandomAccess)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
            return t0((Iterable<?>)q1.c(obj), (l<? super Object, Boolean>)l, b);
        }
        final int g = v.G((List<?>)obj);
        int n3;
        if (g >= 0) {
            int n = 0;
            int n2 = 0;
            while (true) {
                final T value = obj.get(n);
                if (l.invoke(value) != b) {
                    if (n2 != n) {
                        obj.set(n2, value);
                    }
                    ++n2;
                }
                n3 = n2;
                if (n == g) {
                    break;
                }
                ++n;
            }
        }
        else {
            n3 = 0;
        }
        if (n3 < obj.size()) {
            int g2 = v.G((List<?>)obj);
            if (g2 >= n3) {
                while (true) {
                    obj.remove(g2);
                    if (g2 == n3) {
                        break;
                    }
                    --g2;
                }
            }
            return true;
        }
        return false;
    }
    
    @f
    private static final <T> void v0(final Collection<? super T> collection, final Iterable<? extends T> iterable) {
        k0.p(collection, "$this$minusAssign");
        G0((Collection<? super Object>)collection, (Iterable<?>)iterable);
    }
    
    @f
    private static final <T> void w0(final Collection<? super T> collection, final T t) {
        k0.p(collection, "$this$minusAssign");
        collection.remove(t);
    }
    
    @f
    private static final <T> void x0(final Collection<? super T> collection, final m<? extends T> m) {
        k0.p(collection, "$this$minusAssign");
        I0((Collection<? super Object>)collection, (kotlin.sequences.m<?>)m);
    }
    
    @f
    private static final <T> void y0(final Collection<? super T> collection, final T[] array) {
        k0.p(collection, "$this$minusAssign");
        J0(collection, array);
    }
    
    @f
    private static final <T> void z0(final Collection<? super T> collection, final Iterable<? extends T> iterable) {
        k0.p(collection, "$this$plusAssign");
        v.q0((Collection<? super Object>)collection, (Iterable<?>)iterable);
    }
}
