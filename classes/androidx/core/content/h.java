// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import java.util.ArrayList;
import androidx.annotation.j0;
import androidx.annotation.k0;

public final class h
{
    private h() {
    }
    
    @k0
    public static String a(@k0 String s, @j0 final String[] array) {
        if (s == null) {
            return null;
        }
        final String[] split = s.split("/");
        for (int length = array.length, i = 0; i < length; ++i) {
            s = array[i];
            if (e(split, s.split("/"))) {
                return s;
            }
        }
        return null;
    }
    
    @k0
    public static String b(@k0 final String[] array, @j0 String s) {
        if (array == null) {
            return null;
        }
        final String[] split = s.split("/");
        for (int length = array.length, i = 0; i < length; ++i) {
            s = array[i];
            if (e(s.split("/"), split)) {
                return s;
            }
        }
        return null;
    }
    
    public static boolean c(@k0 final String s, @j0 final String s2) {
        return s != null && e(s.split("/"), s2.split("/"));
    }
    
    @j0
    public static String[] d(@k0 final String[] array, @j0 final String s) {
        int i = 0;
        if (array == null) {
            return new String[0];
        }
        final ArrayList<String> list = new ArrayList<String>();
        final String[] split = s.split("/");
        while (i < array.length) {
            final String e = array[i];
            if (e(e.split("/"), split)) {
                list.add(e);
            }
            ++i;
        }
        return list.toArray(new String[list.size()]);
    }
    
    private static boolean e(@j0 final String[] array, @j0 final String[] array2) {
        if (array2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (!array2[0].isEmpty() && !array2[1].isEmpty()) {
            return array.length == 2 && ("*".equals(array2[0]) || array2[0].equals(array[0])) && ("*".equals(array2[1]) || array2[1].equals(array[1]));
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
    }
}
