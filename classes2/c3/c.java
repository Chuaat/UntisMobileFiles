// 
// Decompiled by Procyon v0.5.36
// 

package c3;

import java.util.HashMap;

public class c implements d
{
    private final int a;
    
    public c() {
        this(1);
    }
    
    public c(final int a) {
        this.a = a;
    }
    
    private static boolean b(final StackTraceElement[] array, final int n, final int n2) {
        final int n3 = n2 - n;
        if (n2 + n3 > array.length) {
            return false;
        }
        for (int i = 0; i < n3; ++i) {
            if (!array[n + i].equals(array[n2 + i])) {
                return false;
            }
        }
        return true;
    }
    
    private static StackTraceElement[] c(StackTraceElement[] array, final int n) {
        final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        final StackTraceElement[] array2 = new StackTraceElement[array.length];
        int i = 0;
        int n2 = 0;
        int n3 = 1;
        while (i < array.length) {
            final StackTraceElement stackTraceElement = array[i];
            final Integer n4 = hashMap.get(stackTraceElement);
            int n9;
            if (n4 != null && b(array, n4, i)) {
                final int n5 = i - n4;
                int n6 = n2;
                int n7;
                if ((n7 = n3) < n) {
                    System.arraycopy(array, i, array2, n2, n5);
                    n6 = n2 + n5;
                    n7 = n3 + 1;
                }
                final int n8 = n5 - 1 + i;
                n2 = n6;
                n3 = n7;
                n9 = n8;
            }
            else {
                array2[n2] = array[i];
                ++n2;
                n9 = i;
                n3 = 1;
            }
            hashMap.put(stackTraceElement, i);
            i = n9 + 1;
        }
        array = new StackTraceElement[n2];
        System.arraycopy(array2, 0, array, 0, n2);
        return array;
    }
    
    @Override
    public StackTraceElement[] a(final StackTraceElement[] array) {
        final StackTraceElement[] c = c(array, this.a);
        if (c.length < array.length) {
            return c;
        }
        return array;
    }
}
