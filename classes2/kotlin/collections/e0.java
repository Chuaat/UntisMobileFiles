// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.SortedSet;
import java.math.BigInteger;
import m6.g;
import kotlin.r0;
import kotlin.internal.f;
import kotlin.e1;
import java.math.BigDecimal;
import n6.l;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001aC\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0016\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f\u001a&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0014\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0012j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0013\u001a7\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a7\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e" }, d2 = { "R", "", "Ljava/lang/Class;", "klass", "", "c1", "", "C", "destination", "d1", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "T", "", "Lkotlin/j2;", "e1", "", "Ljava/util/SortedSet;", "h1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "i1", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "selector", "f1", "(Ljava/lang/Iterable;Ln6/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "g1", "(Ljava/lang/Iterable;Ln6/l;)Ljava/math/BigInteger;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class e0 extends d0
{
    public e0() {
    }
    
    @e
    public static <R> List<R> c1(@e final Iterable<?> iterable, @e final Class<R> clazz) {
        k0.p(iterable, "$this$filterIsInstance");
        k0.p(clazz, "klass");
        return d1(iterable, new ArrayList<R>(), clazz);
    }
    
    @e
    public static final <C extends Collection<? super R>, R> C d1(@e final Iterable<?> iterable, @e final C c, @e final Class<R> clazz) {
        k0.p(iterable, "$this$filterIsInstanceTo");
        k0.p(c, "destination");
        k0.p(clazz, "klass");
        for (final Object next : iterable) {
            if (clazz.isInstance(next)) {
                c.add((Object)next);
            }
        }
        return c;
    }
    
    public static <T> void e1(@e final List<T> list) {
        k0.p(list, "$this$reverse");
        Collections.reverse(list);
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @g(name = "sumOfBigDecimal")
    private static final <T> BigDecimal f1(final Iterable<? extends T> iterable, final l<? super T, ? extends BigDecimal> l) {
        final BigDecimal value = BigDecimal.valueOf(0);
        k0.o(value, "BigDecimal.valueOf(this.toLong())");
        final Iterator<? extends T> iterator = iterable.iterator();
        BigDecimal add = value;
        while (iterator.hasNext()) {
            add = add.add((BigDecimal)l.invoke((Object)iterator.next()));
            k0.o(add, "this.add(other)");
        }
        return add;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @g(name = "sumOfBigInteger")
    private static final <T> BigInteger g1(final Iterable<? extends T> iterable, final l<? super T, ? extends BigInteger> l) {
        final BigInteger value = BigInteger.valueOf(0);
        k0.o(value, "BigInteger.valueOf(this.toLong())");
        final Iterator<? extends T> iterator = iterable.iterator();
        BigInteger add = value;
        while (iterator.hasNext()) {
            add = add.add((BigInteger)l.invoke((Object)iterator.next()));
            k0.o(add, "this.add(other)");
        }
        return add;
    }
    
    @e
    public static <T extends Comparable<? super T>> SortedSet<T> h1(@e final Iterable<? extends T> iterable) {
        k0.p(iterable, "$this$toSortedSet");
        return f0.D5((Iterable<?>)iterable, new TreeSet<T>());
    }
    
    @e
    public static final <T> SortedSet<T> i1(@e final Iterable<? extends T> iterable, @e final Comparator<? super T> comparator) {
        k0.p(iterable, "$this$toSortedSet");
        k0.p(comparator, "comparator");
        return f0.D5((Iterable<?>)iterable, new TreeSet<T>(comparator));
    }
}
