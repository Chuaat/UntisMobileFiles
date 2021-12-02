// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import kotlin.internal.f;
import kotlin.j2;
import n6.l;
import kotlin.y0;
import kotlin.q;
import kotlin.e1;
import kotlin.collections.builders.h;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\b\u00f8\u0001\u0000\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\f2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\b\u00f8\u0001\u0000\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\fH\u0001\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aI\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u001a\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u00192\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d" }, d2 = { "T", "element", "", "f", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "Lkotlin/Function1;", "", "Lkotlin/j2;", "Lkotlin/s;", "builderAction", "c", "", "capacity", "b", "d", "e", "builder", "a", "", "elements", "Ljava/util/TreeSet;", "h", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "g", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/SetsKt")
class k1
{
    public k1() {
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static final <E> Set<E> a(@e final Set<E> set) {
        k0.p(set, "builder");
        return ((h<E>)set).f();
    }
    
    @e1(version = "1.3")
    @f
    @q
    @y0
    private static final <E> Set<E> b(final int n, final l<? super Set<E>, j2> l) {
        final Set<E> e = e(n);
        l.invoke(e);
        return a(e);
    }
    
    @e1(version = "1.3")
    @f
    @q
    @y0
    private static final <E> Set<E> c(final l<? super Set<E>, j2> l) {
        final Set<E> d = d();
        l.invoke(d);
        return a(d);
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static final <E> Set<E> d() {
        return new h<E>();
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static final <E> Set<E> e(final int n) {
        return new h<E>(n);
    }
    
    @e
    public static <T> Set<T> f(final T o) {
        final Set<T> singleton = Collections.singleton(o);
        k0.o(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }
    
    @e
    public static final <T> TreeSet<T> g(@e final Comparator<? super T> comparator, @e final T... array) {
        k0.p(comparator, "comparator");
        k0.p(array, "elements");
        return kotlin.collections.q.Jx(array, new TreeSet<T>(comparator));
    }
    
    @e
    public static final <T> TreeSet<T> h(@e final T... array) {
        k0.p(array, "elements");
        return kotlin.collections.q.Jx(array, new TreeSet<T>());
    }
}
