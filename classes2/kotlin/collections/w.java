// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.Objects;
import java.util.Collection;
import kotlin.internal.f;
import kotlin.j2;
import n6.l;
import kotlin.y0;
import kotlin.q;
import kotlin.e1;
import kotlin.collections.builders.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\b\u00f8\u0001\u0000\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\f2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\b\u00f8\u0001\u0000\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\fH\u0001\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001\u001a\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\b\u001a\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u001a&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007\u001a$\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0081\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a6\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u00002\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0081\b¢\u0006\u0004\b!\u0010\"\u001a3\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0081\b\u001a\u0011\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0081\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+" }, d2 = { "T", "element", "", "k", "(Ljava/lang/Object;)Ljava/util/List;", "E", "Lkotlin/Function1;", "", "Lkotlin/j2;", "Lkotlin/s;", "builderAction", "c", "", "capacity", "b", "i", "j", "builder", "a", "Ljava/util/Enumeration;", "n", "", "l", "Ljava/util/Random;", "random", "m", "", "collection", "", "", "f", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "g", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "h", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "index", "e", "count", "d", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class w
{
    public w() {
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static <E> List<E> a(@e final List<E> list) {
        k0.p(list, "builder");
        return ((b<E>)list).t();
    }
    
    @e1(version = "1.3")
    @f
    @q
    @y0
    private static final <E> List<E> b(final int n, final l<? super List<E>, j2> l) {
        final List<E> j = v.j(n);
        l.invoke(j);
        return v.a(j);
    }
    
    @e1(version = "1.3")
    @f
    @q
    @y0
    private static final <E> List<E> c(final l<? super List<E>, j2> l) {
        final List<E> i = v.i();
        l.invoke(i);
        return v.a(i);
    }
    
    @e1(version = "1.3")
    @f
    @y0
    private static final int d(final int n) {
        if (n < 0) {
            if (!kotlin.internal.l.a(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            v.V();
        }
        return n;
    }
    
    @e1(version = "1.3")
    @f
    @y0
    private static final int e(final int n) {
        if (n < 0) {
            if (!kotlin.internal.l.a(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            v.W();
        }
        return n;
    }
    
    @f
    private static final Object[] f(final Collection<?> collection) {
        return kotlin.jvm.internal.v.a(collection);
    }
    
    @f
    private static final <T> T[] g(final Collection<?> collection, final T[] obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        final Object[] b = kotlin.jvm.internal.v.b(collection, obj);
        Objects.requireNonNull(b, "null cannot be cast to non-null type kotlin.Array<T>");
        return (T[])b;
    }
    
    @e
    public static final <T> Object[] h(@e T[] copy, final boolean b) {
        k0.p(copy, "$this$copyToArrayOfAny");
        if (!b || !k0.g(copy.getClass(), Object[].class)) {
            copy = Arrays.copyOf(copy, copy.length, (Class<? extends T[]>)Object[].class);
            k0.o(copy, "java.util.Arrays.copyOf(\u2026 Array<Any?>::class.java)");
        }
        return copy;
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static <E> List<E> i() {
        return new b<E>();
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static <E> List<E> j(final int n) {
        return new b<E>(n);
    }
    
    @e
    public static <T> List<T> k(final T o) {
        final List<T> singletonList = Collections.singletonList(o);
        k0.o(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }
    
    @e1(version = "1.2")
    @e
    public static final <T> List<T> l(@e final Iterable<? extends T> iterable) {
        k0.p(iterable, "$this$shuffled");
        final List<?> k5 = f0.K5(iterable);
        Collections.shuffle(k5);
        return (List<T>)k5;
    }
    
    @e1(version = "1.2")
    @e
    public static final <T> List<T> m(@e final Iterable<? extends T> iterable, @e final Random rnd) {
        k0.p(iterable, "$this$shuffled");
        k0.p(rnd, "random");
        final List<?> k5 = f0.K5(iterable);
        Collections.shuffle(k5, rnd);
        return (List<T>)k5;
    }
    
    @f
    private static final <T> List<T> n(final Enumeration<T> e) {
        final ArrayList<T> list = Collections.list(e);
        k0.o(list, "java.util.Collections.list(this)");
        return list;
    }
}
