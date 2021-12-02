// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

public class k
{
    static boolean a(final CharSequence charSequence, final boolean ignoreCase, final int toffset, final CharSequence charSequence2, final int ooffset, final int len) {
        int n = toffset;
        int n2 = ooffset;
        int i = len;
        if (charSequence instanceof String) {
            n = toffset;
            n2 = ooffset;
            i = len;
            if (charSequence2 instanceof String) {
                return ((String)charSequence).regionMatches(ignoreCase, toffset, (String)charSequence2, ooffset, len);
            }
        }
        while (i > 0) {
            final char char1 = charSequence.charAt(n);
            final char char2 = charSequence2.charAt(n2);
            if (char1 != char2) {
                if (!ignoreCase) {
                    return false;
                }
                if (Character.toUpperCase(char1) != Character.toUpperCase(char2) && Character.toLowerCase(char1) != Character.toLowerCase(char2)) {
                    return false;
                }
            }
            ++n;
            --i;
            ++n2;
        }
        return true;
    }
}
