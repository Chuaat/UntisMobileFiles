// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.m0;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.SortedSet;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.r0;
import kotlin.internal.f;
import kotlin.e1;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import java.math.BigInteger;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001aC\u0010\b\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\b\u0010\t\u001a&\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0010\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u000f\u001a7\u0010\u0014\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019" }, d2 = { "R", "Lkotlin/sequences/m;", "Ljava/lang/Class;", "klass", "x", "", "C", "destination", "y", "(Lkotlin/sequences/m;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "", "T", "Ljava/util/SortedSet;", "B", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "selector", "z", "(Lkotlin/sequences/m;Ln6/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "A", "(Lkotlin/sequences/m;Ln6/l;)Ljava/math/BigInteger;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/sequences/SequencesKt")
class t extends s
{
    public t() {
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @g(name = "sumOfBigInteger")
    private static final <T> BigInteger A(final m<? extends T> m, final l<? super T, ? extends BigInteger> l) {
        final BigInteger value = BigInteger.valueOf(0);
        k0.o((Object)value, "BigInteger.valueOf(this.toLong())");
        final Iterator<? extends T> iterator = m.iterator();
        BigInteger add = value;
        while (iterator.hasNext()) {
            add = add.add((BigInteger)l.invoke((Object)iterator.next()));
            k0.o((Object)add, "this.add(other)");
        }
        return add;
    }
    
    @e
    public static final <T extends Comparable<? super T>> SortedSet<T> B(@e final m<? extends T> m) {
        k0.p((Object)m, "$this$toSortedSet");
        return u.T2((m<?>)m, new TreeSet<T>());
    }
    
    @e
    public static final <T> SortedSet<T> C(@e final m<? extends T> m, @e final Comparator<? super T> comparator) {
        k0.p((Object)m, "$this$toSortedSet");
        k0.p((Object)comparator, "comparator");
        return u.T2((m<?>)m, new TreeSet<T>(comparator));
    }
    
    @e
    public static final <R> m<R> x(@e final m<?> m, @e final Class<R> clazz) {
        k0.p((Object)m, "$this$filterIsInstance");
        k0.p((Object)clazz, "klass");
        final m<R> i0 = p.i0((m<? extends R>)m, (n6.l<? super R, Boolean>)new l<Object, Boolean>() {
            public final boolean a(@org.jetbrains.annotations.f final Object o) {
                return clazz.isInstance(o);
            }
        });
        Objects.requireNonNull(i0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
        return i0;
    }
    
    @e
    public static final <C extends Collection<? super R>, R> C y(@e final m<?> m, @e final C c, @e final Class<R> clazz) {
        k0.p((Object)m, "$this$filterIsInstanceTo");
        k0.p((Object)c, "destination");
        k0.p((Object)clazz, "klass");
        for (final Object next : m) {
            if (clazz.isInstance(next)) {
                c.add((Object)next);
            }
        }
        return c;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @g(name = "sumOfBigDecimal")
    private static final <T> BigDecimal z(final m<? extends T> m, final l<? super T, ? extends BigDecimal> l) {
        final BigDecimal value = BigDecimal.valueOf(0);
        k0.o((Object)value, "BigDecimal.valueOf(this.toLong())");
        final Iterator<? extends T> iterator = m.iterator();
        BigDecimal add = value;
        while (iterator.hasNext()) {
            add = add.add((BigDecimal)l.invoke((Object)iterator.next()));
            k0.o((Object)add, "this.add(other)");
        }
        return add;
    }
}
