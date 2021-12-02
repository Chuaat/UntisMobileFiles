// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import org.apache.commons.codec.k;
import java.util.Locale;

final class m
{
    static String a(String s) {
        if (s != null && s.length() != 0) {
            final int length = s.length();
            final char[] value = new char[length];
            int i = 0;
            int count = 0;
            while (i < length) {
                int n = count;
                if (Character.isLetter(s.charAt(i))) {
                    value[count] = s.charAt(i);
                    n = count + 1;
                }
                ++i;
                count = n;
            }
            if (count != length) {
                s = new String(value, 0, count);
            }
            return s.toUpperCase(Locale.ENGLISH);
        }
        return s;
    }
    
    static int b(final k k, final String s, final String s2) throws h {
        return c(k.d(s), k.d(s2));
    }
    
    static int c(final String s, final String s2) {
        int i = 0;
        if (s != null && s2 != null) {
            final int min = Math.min(s.length(), s2.length());
            int n = 0;
            while (i < min) {
                int n2 = n;
                if (s.charAt(i) == s2.charAt(i)) {
                    n2 = n + 1;
                }
                ++i;
                n = n2;
            }
            return n;
        }
        return 0;
    }
}
