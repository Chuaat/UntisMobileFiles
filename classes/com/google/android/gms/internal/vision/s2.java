// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Map;

public final class s2<K, V> extends r2<K, V>
{
    public final t2<K, V> a() {
        final Set<Map.Entry<K, Collection<V>>> entrySet = super.a.entrySet();
        if (entrySet.isEmpty()) {
            return (t2<K, V>)f2.K;
        }
        final p2 p2 = new p2(entrySet.size());
        final Iterator<Map.Entry<Object, V>> iterator = entrySet.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            final Object key = entry.getKey();
            final Collection collection = (Collection)entry.getValue();
            q2<?> n2 = null;
            Label_0407: {
                if (collection instanceof q2 && !(collection instanceof SortedSet)) {
                    n2 = (q2<?>)collection;
                    if (!n2.m()) {
                        break Label_0407;
                    }
                }
                final Object[] array = collection.toArray();
                int n5;
                for (int i = array.length; i != 0; i = n5) {
                    if (i == 1) {
                        n2 = new e3<Object>(array[0]);
                        break Label_0407;
                    }
                    final int n3 = q2.n(i);
                    final Object[] array2 = new Object[n3];
                    final int n4 = n3 - 1;
                    int j = 0;
                    n5 = 0;
                    int n6 = 0;
                    while (j < i) {
                        final Object a = x2.a(array[j], j);
                        final int hashCode = a.hashCode();
                        int a2 = j2.a(hashCode);
                        int n8;
                        int n9;
                        while (true) {
                            final int n7 = a2 & n4;
                            final Object o = array2[n7];
                            if (o == null) {
                                array2[n7] = (array[n5] = a);
                                n8 = n6 + hashCode;
                                n9 = n5 + 1;
                                break;
                            }
                            n9 = n5;
                            n8 = n6;
                            if (o.equals(a)) {
                                break;
                            }
                            ++a2;
                        }
                        ++j;
                        n5 = n9;
                        n6 = n8;
                    }
                    Arrays.fill(array, n5, i, null);
                    if (n5 == 1) {
                        n2 = new e3<Object>(array[0], n6);
                        break Label_0407;
                    }
                    if (q2.n(n5) >= n3 / 2) {
                        final int length = array.length;
                        Object[] copy = array;
                        if (n5 < (length >> 1) + (length >> 2)) {
                            copy = Arrays.copyOf(array, n5);
                        }
                        n2 = new c3<Object>(copy, n6, array2, n4, n5);
                        break Label_0407;
                    }
                }
                n2 = c3.N;
            }
            if (!n2.isEmpty()) {
                final int n10 = p2.b + 1 << 1;
                final Object[] a3 = p2.a;
                if (n10 > a3.length) {
                    final int length2 = a3.length;
                    if (n10 < 0) {
                        throw new AssertionError((Object)"cannot store more than MAX_VALUE elements");
                    }
                    int n11;
                    if ((n11 = length2 + (length2 >> 1) + 1) < n10) {
                        n11 = Integer.highestOneBit(n10 - 1) << 1;
                    }
                    int newLength;
                    if ((newLength = n11) < 0) {
                        newLength = Integer.MAX_VALUE;
                    }
                    p2.a = Arrays.copyOf(a3, newLength);
                    p2.c = false;
                }
                w1.a(key, n2);
                final Object[] a4 = p2.a;
                final int b = p2.b;
                a4[b * 2] = key;
                a4[b * 2 + 1] = n2;
                p2.b = b + 1;
                n += n2.size();
            }
        }
        p2.c = true;
        return new t2<K, V>((m2<Object, q2<Object>>)z2.d(p2.b, p2.a), n, null);
    }
}
