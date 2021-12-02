// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.HashSet;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.internal.f;
import kotlin.e1;
import kotlin.b;
import kotlin.j2;
import java.util.Set;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0087\b\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000H\u0087\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\f\"\u0004\b\u0000\u0010\u0000H\u0087\b\u001a7\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\f\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0010j\b\u0012\u0004\u0012\u00028\u0000`\u0011\"\u0004\b\u0000\u0010\u0000H\u0087\b\u001a7\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0010j\b\u0012\u0004\u0012\u00028\u0000`\u0011\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00152\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0003\"\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u0006\u001aF\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u001a2\u001f\b\u0001\u0010\u001e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001dH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aN\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u001a2\u0006\u0010!\u001a\u00020 2\u001f\b\u0001\u0010\u001e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001dH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a!\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%" }, d2 = { "T", "", "k", "", "elements", "u", "([Ljava/lang/Object;)Ljava/util/Set;", "t", "", "p", "q", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "l", "m", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "n", "o", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "", "element", "v", "(Ljava/lang/Object;)Ljava/util/Set;", "w", "E", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlin/s;", "builderAction", "j", "", "capacity", "i", "s", "r", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/SetsKt")
class l1 extends k1
{
    public l1() {
    }
    
    @e1(version = "1.3")
    @f
    @q
    private static final <E> Set<E> i(final int n, @b final l<? super Set<E>, j2> l) {
        final Set<E> e = k1.e(n);
        l.invoke(e);
        return k1.a(e);
    }
    
    @e1(version = "1.3")
    @f
    @q
    private static final <E> Set<E> j(@b final l<? super Set<E>, j2> l) {
        final Set<E> d = k1.d();
        l.invoke(d);
        return k1.a(d);
    }
    
    @e
    public static <T> Set<T> k() {
        return (Set<T>)k0.H;
    }
    
    @e1(version = "1.1")
    @f
    private static final <T> HashSet<T> l() {
        return new HashSet<T>();
    }
    
    @e
    public static final <T> HashSet<T> m(@e final T... array) {
        kotlin.jvm.internal.k0.p(array, "elements");
        return kotlin.collections.q.Jx(array, new HashSet<T>(y0.j(array.length)));
    }
    
    @e1(version = "1.1")
    @f
    private static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<T>();
    }
    
    @e
    public static <T> LinkedHashSet<T> o(@e final T... array) {
        kotlin.jvm.internal.k0.p(array, "elements");
        return kotlin.collections.q.Jx(array, new LinkedHashSet<T>(y0.j(array.length)));
    }
    
    @e1(version = "1.1")
    @f
    private static final <T> Set<T> p() {
        return new LinkedHashSet<T>();
    }
    
    @e
    public static final <T> Set<T> q(@e final T... array) {
        kotlin.jvm.internal.k0.p(array, "elements");
        return kotlin.collections.q.Jx(array, new LinkedHashSet<T>(y0.j(array.length)));
    }
    
    @e
    public static <T> Set<T> r(@e Set<? extends T> o) {
        kotlin.jvm.internal.k0.p(o, "$this$optimizeReadOnlySet");
        final int size = ((Set)o).size();
        if (size != 0) {
            if (size == 1) {
                o = j1.f(((Set<T>)o).iterator().next());
            }
        }
        else {
            o = j1.k();
        }
        return (Set<T>)o;
    }
    
    @f
    private static final <T> Set<T> s(Set<? extends T> k) {
        if (k == null) {
            k = j1.k();
        }
        return k;
    }
    
    @f
    private static final <T> Set<T> t() {
        return j1.k();
    }
    
    @e
    public static <T> Set<T> u(@e final T... array) {
        kotlin.jvm.internal.k0.p(array, "elements");
        Set<T> set;
        if (array.length > 0) {
            set = m.Gy(array);
        }
        else {
            set = j1.k();
        }
        return set;
    }
    
    @e1(version = "1.4")
    @e
    public static final <T> Set<T> v(@org.jetbrains.annotations.f final T t) {
        Set<T> set;
        if (t != null) {
            set = j1.f(t);
        }
        else {
            set = j1.k();
        }
        return set;
    }
    
    @e1(version = "1.4")
    @e
    public static final <T> Set<T> w(@e final T... array) {
        kotlin.jvm.internal.k0.p(array, "elements");
        return kotlin.collections.q.ra(array, new LinkedHashSet<T>());
    }
}
