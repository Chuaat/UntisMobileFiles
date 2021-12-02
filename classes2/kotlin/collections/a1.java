// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.Properties;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Comparator;
import java.util.Collections;
import kotlin.s0;
import n6.a;
import java.util.concurrent.ConcurrentMap;
import kotlin.internal.f;
import kotlin.j2;
import n6.l;
import kotlin.y0;
import kotlin.q;
import kotlin.e1;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u001a2\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001aI\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012#\u0010\n\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\b\u00f8\u0001\u0000\u001aQ\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\r\u001a\u00020\f2#\u0010\n\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\b\u00f8\u0001\u0000\u001a \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u001a(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\r\u001a\u00020\fH\u0001\u001a4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0001\u001aE\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a:\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u001a@\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c\u001a[\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0001\u0010\u00012*\u0010 \u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u001f\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b!\u0010\"\u001ac\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c2*\u0010 \u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u001f\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010'\u001a\u00020&*\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u0004H\u0087\b\u001a1\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0081\b\u001a2\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u001a\u0010\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0001\"\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/" }, d2 = { "K", "V", "Lkotlin/s0;", "pair", "", "k", "Lkotlin/Function1;", "", "Lkotlin/j2;", "Lkotlin/s;", "builderAction", "f", "", "capacity", "e", "g", "h", "builder", "d", "Ljava/util/concurrent/ConcurrentMap;", "key", "Lkotlin/Function0;", "defaultValue", "i", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "", "Ljava/util/SortedMap;", "q", "Ljava/util/Comparator;", "comparator", "r", "", "pairs", "m", "([Lkotlin/s0;)Ljava/util/SortedMap;", "l", "(Ljava/util/Comparator;[Lkotlin/s0;)Ljava/util/SortedMap;", "", "Ljava/util/Properties;", "n", "p", "o", "expectedSize", "j", "a", "I", "INT_MAX_POWER_OF_TWO", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/MapsKt")
class a1 extends z0
{
    private static final int a = 1073741824;
    
    public a1() {
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static <K, V> Map<K, V> d(@e final Map<K, V> map) {
        k0.p(map, "builder");
        return ((d<K, V>)map).p();
    }
    
    @e1(version = "1.3")
    @f
    @q
    @y0
    private static final <K, V> Map<K, V> e(final int n, final l<? super Map<K, V>, j2> l) {
        final Map<K, V> h = h(n);
        l.invoke(h);
        return kotlin.collections.y0.d(h);
    }
    
    @e1(version = "1.3")
    @f
    @q
    @y0
    private static final <K, V> Map<K, V> f(final l<? super Map<K, V>, j2> l) {
        final Map<K, V> g = kotlin.collections.y0.g();
        l.invoke(g);
        return kotlin.collections.y0.d(g);
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static <K, V> Map<K, V> g() {
        return new d<K, V>();
    }
    
    @e1(version = "1.3")
    @q
    @y0
    @e
    public static final <K, V> Map<K, V> h(final int n) {
        return new d<K, V>(n);
    }
    
    public static final <K, V> V i(@e final ConcurrentMap<K, V> concurrentMap, final K k, @e final a<? extends V> a) {
        k0.p(concurrentMap, "$this$getOrPut");
        k0.p(a, "defaultValue");
        final V value = concurrentMap.get(k);
        V putIfAbsent;
        if (value != null) {
            putIfAbsent = value;
        }
        else {
            final V invoke = (V)a.invoke();
            putIfAbsent = concurrentMap.putIfAbsent((K)k, invoke);
            if (putIfAbsent == null) {
                putIfAbsent = invoke;
            }
        }
        return putIfAbsent;
    }
    
    @y0
    public static int j(int n) {
        if (n >= 0) {
            if (n < 3) {
                ++n;
            }
            else if (n < 1073741824) {
                n = (int)(n / 0.75f + 1.0f);
            }
            else {
                n = Integer.MAX_VALUE;
            }
        }
        return n;
    }
    
    @e
    public static <K, V> Map<K, V> k(@e final s0<? extends K, ? extends V> s0) {
        k0.p(s0, "pair");
        final Map<? extends K, ? extends V> singletonMap = Collections.singletonMap(s0.e(), s0.f());
        k0.o(singletonMap, "java.util.Collections.si\u2026(pair.first, pair.second)");
        return (Map<K, V>)singletonMap;
    }
    
    @e1(version = "1.4")
    @e
    public static final <K, V> SortedMap<K, V> l(@e final Comparator<? super K> comparator, @e final s0<? extends K, ? extends V>... array) {
        k0.p(comparator, "comparator");
        k0.p(array, "pairs");
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>((Comparator<? super Object>)comparator);
        b1.y0((Map<? super Object, ? super Object>)treeMap, (s0<?, ?>[])array);
        return (SortedMap<K, V>)treeMap;
    }
    
    @e
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@e final s0<? extends K, ? extends V>... array) {
        k0.p(array, "pairs");
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
        b1.y0((Map<? super Object, ? super Object>)treeMap, (s0<?, ?>[])array);
        return (SortedMap<K, V>)treeMap;
    }
    
    @f
    private static final Properties n(final Map<String, String> t) {
        final Properties properties = new Properties();
        properties.putAll(t);
        return properties;
    }
    
    @e
    public static final <K, V> Map<K, V> o(@e final Map<? extends K, ? extends V> map) {
        k0.p(map, "$this$toSingletonMap");
        final Map.Entry<? extends K, ? extends V> entry = map.entrySet().iterator().next();
        final Map<K, V> singletonMap = Collections.singletonMap((K)entry.getKey(), (V)entry.getValue());
        k0.o(singletonMap, "with(entries.iterator().\u2026ingletonMap(key, value) }");
        return (Map<K, V>)singletonMap;
    }
    
    @f
    private static final <K, V> Map<K, V> p(final Map<K, ? extends V> map) {
        return (Map<K, V>)o((Map<?, ?>)map);
    }
    
    @e
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> q(@e final Map<? extends K, ? extends V> m) {
        k0.p(m, "$this$toSortedMap");
        return new TreeMap<K, V>(m);
    }
    
    @e
    public static <K, V> SortedMap<K, V> r(@e final Map<? extends K, ? extends V> map, @e final Comparator<? super K> comparator) {
        k0.p(map, "$this$toSortedMap");
        k0.p(comparator, "comparator");
        final TreeMap<K, V> treeMap = new TreeMap<K, V>(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
