// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.util.Iterator;
import java.util.Collection;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;
import java.lang.reflect.Array;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@d0
@a
public final class b
{
    private b() {
    }
    
    @RecentlyNonNull
    @a
    public static <T> T[] a(@RecentlyNonNull final T[] original, @RecentlyNonNull final T t) {
        if (original == null && t == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        Object[] copy;
        if (original == null) {
            copy = (Object[])Array.newInstance(t.getClass(), 1);
        }
        else {
            copy = Arrays.copyOf(original, original.length + 1);
        }
        copy[copy.length - 1] = t;
        return (T[])copy;
    }
    
    @RecentlyNonNull
    @a
    public static <T> T[] b(@RecentlyNonNull final T[]... array) {
        if (array.length == 0) {
            return (T[])Array.newInstance(array.getClass(), 0);
        }
        int i = 0;
        int newLength = 0;
        while (i < array.length) {
            newLength += array[i].length;
            ++i;
        }
        final T[] copy = Arrays.copyOf(array[0], newLength);
        int length = array[0].length;
        for (int j = 1; j < array.length; ++j) {
            final T[] array2 = array[j];
            System.arraycopy(array2, 0, copy, length, array2.length);
            length += array2.length;
        }
        return copy;
    }
    
    @RecentlyNonNull
    @a
    public static byte[] c(@RecentlyNonNull final byte[]... array) {
        if (array.length == 0) {
            return new byte[0];
        }
        int i = 0;
        int newLength = 0;
        while (i < array.length) {
            newLength += array[i].length;
            ++i;
        }
        final byte[] copy = Arrays.copyOf(array[0], newLength);
        int length = array[0].length;
        for (int j = 1; j < array.length; ++j) {
            final byte[] array2 = array[j];
            System.arraycopy(array2, 0, copy, length, array2.length);
            length += array2.length;
        }
        return copy;
    }
    
    @RecentlyNonNull
    @a
    public static boolean d(@RecentlyNonNull final int[] array, @RecentlyNonNull final int n) {
        if (array == null) {
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    @RecentlyNonNull
    @a
    public static <T> boolean e(@RecentlyNonNull final T[] array, @RecentlyNonNull final T t) {
        int length;
        if (array != null) {
            length = array.length;
        }
        else {
            length = 0;
        }
        for (int i = 0; i < length; ++i) {
            if (v.b(array[i], t)) {
                return i >= 0;
            }
        }
        int i = -1;
        return i >= 0;
    }
    
    @RecentlyNonNull
    @a
    public static <T> ArrayList<T> f() {
        return new ArrayList<T>();
    }
    
    @RecentlyNullable
    @a
    public static <T> T[] g(@RecentlyNonNull final T[] original, @RecentlyNonNull final T... array) {
        if (original == null) {
            return null;
        }
        if (array == null || array.length == 0) {
            return Arrays.copyOf(original, original.length);
        }
        final Object[] original2 = (Object[])Array.newInstance(array.getClass().getComponentType(), original.length);
        final int length = array.length;
        int i = 0;
        int newLength;
        if (length == 1) {
            final int length2 = original.length;
            int n = 0;
            int n2 = 0;
            while (true) {
                newLength = n2;
                if (n >= length2) {
                    break;
                }
                final T t = original[n];
                int n3 = n2;
                if (!v.b(array[0], t)) {
                    original2[n2] = t;
                    n3 = n2 + 1;
                }
                ++n;
                n2 = n3;
            }
        }
        else {
            final int length3 = original.length;
            int n4 = 0;
            while (i < length3) {
                final T t2 = original[i];
                int n5 = n4;
                if (!e(array, t2)) {
                    original2[n4] = t2;
                    n5 = n4 + 1;
                }
                ++i;
                n4 = n5;
            }
            newLength = n4;
        }
        if (original2 == null) {
            return null;
        }
        T[] copy = (T[])original2;
        if (newLength != ((T[])original2).length) {
            copy = Arrays.copyOf(original2, newLength);
        }
        return copy;
    }
    
    @RecentlyNonNull
    @a
    public static <T> ArrayList<T> h(@RecentlyNonNull final T[] array) {
        final int length = array.length;
        final ArrayList list = new ArrayList<T>(length);
        for (int i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return (ArrayList<T>)list;
    }
    
    @RecentlyNonNull
    @a
    public static int[] i(@RecentlyNonNull final Collection<Integer> collection) {
        int n = 0;
        if (collection != null && collection.size() != 0) {
            final int[] array = new int[collection.size()];
            final Iterator<Integer> iterator = collection.iterator();
            while (iterator.hasNext()) {
                array[n] = iterator.next();
                ++n;
            }
            return array;
        }
        return new int[0];
    }
    
    @RecentlyNullable
    @a
    public static Integer[] j(@RecentlyNonNull final int[] array) {
        if (array == null) {
            return null;
        }
        final int length = array.length;
        final Integer[] array2 = new Integer[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    @a
    public static void k(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final double[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(array[i]));
        }
    }
    
    @a
    public static void l(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final float[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(array[i]));
        }
    }
    
    @a
    public static void m(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final int[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(array[i]));
        }
    }
    
    @a
    public static void n(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final long[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(array[i]));
        }
    }
    
    @a
    public static <T> void o(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final T[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(array[i]);
        }
    }
    
    @a
    public static void p(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final boolean[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(array[i]));
        }
    }
    
    @a
    public static void q(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final String[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(array[i]);
            sb.append("\"");
        }
    }
}
