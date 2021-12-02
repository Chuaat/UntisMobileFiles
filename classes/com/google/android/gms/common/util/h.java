// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.util.HashMap;
import java.util.HashSet;
import androidx.collection.c;
import java.util.Set;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import java.util.Collection;
import f2.a;

@a
public final class h
{
    private h() {
    }
    
    @RecentlyNonNull
    @a
    public static boolean a(@k0 final Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static <T> List<T> b() {
        return Collections.emptyList();
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static <T> List<T> c(@RecentlyNonNull final T o) {
        return Collections.singletonList(o);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static <T> List<T> d(@RecentlyNonNull final T... a) {
        final int length = a.length;
        if (length == 0) {
            return b();
        }
        if (length != 1) {
            return Collections.unmodifiableList((List<? extends T>)Arrays.asList((T[])a));
        }
        return c(a[0]);
    }
    
    @RecentlyNonNull
    @a
    public static <K, V> Map<K, V> e(@RecentlyNonNull final K k, @RecentlyNonNull final V v, @RecentlyNonNull final K i, @RecentlyNonNull final V v2, @RecentlyNonNull final K j, @RecentlyNonNull final V v3) {
        final Map<? extends K, ? extends V> l = l(3, false);
        l.put(k, v);
        l.put(i, v2);
        l.put(j, v3);
        return (Map<K, V>)Collections.unmodifiableMap((Map<?, ?>)l);
    }
    
    @RecentlyNonNull
    @a
    public static <K, V> Map<K, V> f(@RecentlyNonNull final K k, @RecentlyNonNull final V v, @RecentlyNonNull final K i, @RecentlyNonNull final V v2, @RecentlyNonNull final K j, @RecentlyNonNull final V v3, @RecentlyNonNull final K l, @RecentlyNonNull final V v4, @RecentlyNonNull final K m, @RecentlyNonNull final V v5, @RecentlyNonNull final K k2, @RecentlyNonNull final V v6) {
        final Map<? extends K, ? extends V> l2 = l(6, false);
        l2.put(k, v);
        l2.put(i, v2);
        l2.put(j, v3);
        l2.put(l, v4);
        l2.put(m, v5);
        l2.put(k2, v6);
        return (Map<K, V>)Collections.unmodifiableMap((Map<?, ?>)l2);
    }
    
    @RecentlyNonNull
    @a
    public static <K, V> Map<K, V> g(@RecentlyNonNull final K[] array, @RecentlyNonNull final V[] array2) {
        if (array.length != array2.length) {
            final int length = array.length;
            final int length2 = array2.length;
            final StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        final int length3 = array.length;
        if (length3 == 0) {
            return Collections.emptyMap();
        }
        int i = 0;
        if (length3 != 1) {
            final Map<? extends K, ? extends V> l = l(array.length, false);
            while (i < array.length) {
                l.put(array[i], array2[i]);
                ++i;
            }
            return (Map<K, V>)Collections.unmodifiableMap((Map<?, ?>)l);
        }
        return Collections.singletonMap(array[0], array2[0]);
    }
    
    @RecentlyNonNull
    @a
    public static <T> Set<T> h(@RecentlyNonNull final int n) {
        if (n == 0) {
            return new c<T>();
        }
        return k(n, true);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static <T> Set<T> i(@RecentlyNonNull final T t, @RecentlyNonNull final T t2, @RecentlyNonNull final T t3) {
        final Set<? extends T> k = k(3, false);
        k.add(t);
        k.add(t2);
        k.add(t3);
        return (Set<T>)Collections.unmodifiableSet((Set<?>)k);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static <T> Set<T> j(@RecentlyNonNull final T... elements) {
        final int length = elements.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(elements[0]);
        }
        if (length == 2) {
            final T t = elements[0];
            final T t2 = elements[1];
            final Set<? extends T> k = k(2, false);
            k.add(t);
            k.add(t2);
            return (Set<T>)Collections.unmodifiableSet((Set<?>)k);
        }
        if (length == 3) {
            return i(elements[0], elements[1], elements[2]);
        }
        if (length != 4) {
            final Set<? super T> i = k(elements.length, false);
            Collections.addAll(i, elements);
            return Collections.unmodifiableSet((Set<? extends T>)i);
        }
        final T t3 = elements[0];
        final T t4 = elements[1];
        final T t5 = elements[2];
        final T t6 = elements[3];
        final Set<? extends T> j = k(4, false);
        j.add(t3);
        j.add(t4);
        j.add(t5);
        j.add(t6);
        return (Set<T>)Collections.unmodifiableSet((Set<?>)j);
    }
    
    private static <T> Set<T> k(final int initialCapacity, final boolean b) {
        float loadFactor;
        if (b) {
            loadFactor = 0.75f;
        }
        else {
            loadFactor = 1.0f;
        }
        int n;
        if (b) {
            n = 128;
        }
        else {
            n = 256;
        }
        if (initialCapacity <= n) {
            return new c<T>(initialCapacity);
        }
        return new HashSet<T>(initialCapacity, loadFactor);
    }
    
    private static <K, V> Map<K, V> l(final int initialCapacity, final boolean b) {
        if (initialCapacity <= 256) {
            return new androidx.collection.a<K, V>(initialCapacity);
        }
        return new HashMap<K, V>(initialCapacity, 1.0f);
    }
}
