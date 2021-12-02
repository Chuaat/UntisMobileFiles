// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class i
{
    @e
    public static final byte[] a(@e final String[] array) {
        k0.p((Object)array, "strings");
        final int length = array.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += array[i].length();
            ++i;
        }
        final byte[] array2 = new byte[n];
        final int length2 = array.length;
        int j = 0;
        int n2 = 0;
        while (j < length2) {
            final String s = array[j];
            final int n3 = j + 1;
            final int n4 = s.length() - 1;
            j = n3;
            if (n4 >= 0) {
                int index = 0;
                int n5 = n2;
                while (true) {
                    n2 = n5 + 1;
                    array2[n5] = (byte)s.charAt(index);
                    if (index == n4) {
                        break;
                    }
                    ++index;
                    n5 = n2;
                }
                j = n3;
            }
        }
        return array2;
    }
}
