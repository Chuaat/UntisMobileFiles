// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.y0;
import kotlin.internal.f;
import n6.l;
import kotlin.e1;
import java.util.Iterator;
import kotlin.jvm.internal.q1;
import java.util.Objects;
import kotlin.jvm.internal.j1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k0;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aZ\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u00020\tH\u0081\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r" }, d2 = { "T", "K", "Lkotlin/collections/m0;", "", "", "a", "V", "R", "", "Lkotlin/Function1;", "", "f", "b", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/GroupingKt")
class o0
{
    public o0() {
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K> Map<K, Integer> a(@e final m0<T, ? extends K> m0) {
        k0.p(m0, "$this$eachCount");
        final LinkedHashMap<Object, j1.f> linkedHashMap = new LinkedHashMap<Object, j1.f>();
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final K a = (K)m0.a(b.next());
            Object value = linkedHashMap.get(a);
            if (value == null && !linkedHashMap.containsKey(a)) {
                value = new j1.f();
            }
            final j1.f f = (j1.f)value;
            ++f.G;
            linkedHashMap.put(a, f);
        }
        for (final Map.Entry<K, j1.f> obj : linkedHashMap.entrySet()) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            q1.m(obj).setValue(obj.getValue().G);
        }
        return (Map<K, Integer>)q1.k(linkedHashMap);
    }
    
    @f
    @y0
    private static final <K, V, R> Map<K, R> b(final Map<K, V> map, final l<? super Map.Entry<? extends K, ? extends V>, ? extends R> l) {
        for (final Map.Entry<?, ?> obj : map.entrySet()) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            q1.m(obj).setValue(l.invoke((Object)obj));
        }
        return (Map<K, R>)q1.k(map);
    }
}
