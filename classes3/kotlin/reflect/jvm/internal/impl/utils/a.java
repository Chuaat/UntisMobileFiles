// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.v;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.util.Collection;

public final class a
{
    public static final <T> void a(@e final Collection<T> collection, @f final T t) {
        k0.p((Object)collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }
    
    private static final int b(int n) {
        final int n2 = 3;
        if (n < 3) {
            n = n2;
        }
        else {
            n = n + n / 3 + 1;
        }
        return n;
    }
    
    @e
    public static final <T> List<T> c(@e ArrayList<T> list) {
        k0.p((Object)list, "<this>");
        final int size = ((ArrayList)list).size();
        if (size != 0) {
            if (size != 1) {
                ((ArrayList)list).trimToSize();
            }
            else {
                list = v.k(v.o2(list));
            }
        }
        else {
            list = v.E();
        }
        return (List<T>)list;
    }
    
    @e
    public static final <K> Map<K, Integer> d(@e final Iterable<? extends K> iterable) {
        k0.p((Object)iterable, "<this>");
        final LinkedHashMap<Object, Integer> linkedHashMap = (LinkedHashMap<Object, Integer>)new LinkedHashMap<K, Integer>();
        final Iterator<? extends K> iterator = iterable.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            linkedHashMap.put(iterator.next(), i);
            ++i;
        }
        return (Map<K, Integer>)linkedHashMap;
    }
    
    @e
    public static final <K, V> HashMap<K, V> e(final int n) {
        return new HashMap<K, V>(b(n));
    }
    
    @e
    public static final <E> HashSet<E> f(final int n) {
        return new HashSet<E>(b(n));
    }
    
    @e
    public static final <E> LinkedHashSet<E> g(final int n) {
        return new LinkedHashSet<E>(b(n));
    }
}
