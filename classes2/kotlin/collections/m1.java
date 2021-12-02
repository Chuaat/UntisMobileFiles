// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.Iterator;
import kotlin.sequences.m;
import kotlin.internal.f;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\u0002\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002\u001a.\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u0004\u001a.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\b\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\u0002\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0004¨\u0006\u0013" }, d2 = { "T", "", "element", "y", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "A", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "x", "Lkotlin/sequences/m;", "z", "B", "D", "F", "C", "E", "G", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/SetsKt")
class m1 extends l1
{
    public m1() {
    }
    
    @e
    public static final <T> Set<T> A(@e final Set<? extends T> c, @e final T[] array) {
        k0.p(c, "$this$minus");
        k0.p(array, "elements");
        final LinkedHashSet<Object> set = new LinkedHashSet<Object>(c);
        c0.J0(set, array);
        return (Set<T>)set;
    }
    
    @f
    private static final <T> Set<T> B(final Set<? extends T> set, final T t) {
        return (Set<T>)y(set, (Object)t);
    }
    
    @e
    public static <T> Set<T> C(@e final Set<? extends T> c, @e final Iterable<? extends T> iterable) {
        k0.p(c, "$this$plus");
        k0.p(iterable, "elements");
        final Integer z = y.Z((Iterable<?>)iterable);
        int n;
        if (z != null) {
            n = c.size() + z.intValue();
        }
        else {
            n = c.size() * 2;
        }
        final LinkedHashSet set = new LinkedHashSet<Object>(y0.j(n));
        set.addAll((Collection<?>)c);
        v.q0((Collection<? super Object>)set, (Iterable<?>)iterable);
        return (Set<T>)set;
    }
    
    @e
    public static <T> Set<T> D(@e final Set<? extends T> c, final T e) {
        k0.p(c, "$this$plus");
        final LinkedHashSet set = new LinkedHashSet<T>(y0.j(c.size() + 1));
        set.addAll(c);
        set.add(e);
        return (Set<T>)set;
    }
    
    @e
    public static final <T> Set<T> E(@e final Set<? extends T> c, @e final m<? extends T> m) {
        k0.p(c, "$this$plus");
        k0.p(m, "elements");
        final LinkedHashSet set = new LinkedHashSet(y0.j(c.size() * 2));
        set.addAll(c);
        v.r0((Collection<? super Object>)set, (kotlin.sequences.m<?>)m);
        return (Set<T>)set;
    }
    
    @e
    public static final <T> Set<T> F(@e final Set<? extends T> c, @e final T[] array) {
        k0.p(c, "$this$plus");
        k0.p(array, "elements");
        final LinkedHashSet set = new LinkedHashSet(y0.j(c.size() + array.length));
        set.addAll(c);
        v.s0(set, array);
        return (Set<T>)set;
    }
    
    @f
    private static final <T> Set<T> G(final Set<? extends T> set, final T t) {
        return j1.D(set, t);
    }
    
    @e
    public static <T> Set<T> x(@e final Set<? extends T> c, @e final Iterable<? extends T> iterable) {
        k0.p(c, "$this$minus");
        k0.p(iterable, "elements");
        final Collection<?> b0 = y.b0((Iterable<?>)iterable, (Iterable<?>)c);
        if (b0.isEmpty()) {
            return v.N5((Iterable<? extends T>)c);
        }
        if (b0 instanceof Set) {
            final LinkedHashSet<Object> set = new LinkedHashSet<Object>();
            for (final T next : c) {
                if (!b0.contains(next)) {
                    set.add(next);
                }
            }
            return (Set<T>)set;
        }
        final LinkedHashSet<T> set2 = new LinkedHashSet<T>(c);
        set2.removeAll(b0);
        return set2;
    }
    
    @e
    public static final <T> Set<T> y(@e final Set<? extends T> set, final T t) {
        k0.p(set, "$this$minus");
        final LinkedHashSet<T> set2 = new LinkedHashSet<T>(y0.j(set.size()));
        final Iterator<T> iterator = (Iterator<T>)set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final T next = iterator.next();
            final boolean b = true;
            int n2 = n;
            int n3 = b ? 1 : 0;
            if (n == 0) {
                n2 = n;
                n3 = (b ? 1 : 0);
                if (k0.g(next, t)) {
                    n2 = 1;
                    n3 = 0;
                }
            }
            n = n2;
            if (n3 != 0) {
                set2.add(next);
                n = n2;
            }
        }
        return set2;
    }
    
    @e
    public static final <T> Set<T> z(@e final Set<? extends T> c, @e final m<? extends T> m) {
        k0.p(c, "$this$minus");
        k0.p(m, "elements");
        final LinkedHashSet<Object> set = new LinkedHashSet<Object>(c);
        c0.I0((Collection<? super Object>)set, (kotlin.sequences.m<?>)m);
        return (Set<T>)set;
    }
}
