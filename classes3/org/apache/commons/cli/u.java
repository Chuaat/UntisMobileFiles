// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

class u
{
    static String a(String substring) {
        String substring2 = substring;
        if (substring.startsWith("\"")) {
            substring2 = substring.substring(1, substring.length());
        }
        substring = substring2;
        if (substring2.endsWith("\"")) {
            substring = substring2.substring(0, substring2.length() - 1);
        }
        return substring;
    }
    
    static String b(final String s) {
        if (s == null) {
            return null;
        }
        int beginIndex;
        if (s.startsWith("--")) {
            beginIndex = 2;
        }
        else {
            if (!s.startsWith("-")) {
                return s;
            }
            beginIndex = 1;
        }
        return s.substring(beginIndex, s.length());
    }
}
