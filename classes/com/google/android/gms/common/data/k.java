// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import java.util.Iterator;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

public final class k
{
    @RecentlyNonNull
    public static <T, E extends j<T>> ArrayList<T> a(@RecentlyNonNull final ArrayList<E> list) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(list.get(i).B1());
        }
        return (ArrayList<T>)list2;
    }
    
    @RecentlyNonNull
    public static <T, E extends j<T>> ArrayList<T> b(@RecentlyNonNull final E[] array) {
        final ArrayList<T> list = new ArrayList<T>(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i].B1());
        }
        return list;
    }
    
    @RecentlyNonNull
    public static <T, E extends j<T>> ArrayList<T> c(@RecentlyNonNull final Iterable<E> iterable) {
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<T>();
        final Iterator<E> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().B1());
        }
        return (ArrayList<T>)list;
    }
}
