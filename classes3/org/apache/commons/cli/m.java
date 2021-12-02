// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

class m
{
    private static boolean a(final char ch) {
        return Character.isJavaIdentifierPart(ch);
    }
    
    private static boolean b(final char c) {
        return a(c) || c == ' ' || c == '?' || c == '@';
    }
    
    static void c(final String s) throws IllegalArgumentException {
        if (s == null) {
            return;
        }
        final int length = s.length();
        int i = 0;
        if (length == 1) {
            final char char1 = s.charAt(0);
            if (!b(char1)) {
                final StringBuffer sb = new StringBuffer();
                sb.append("illegal option value '");
                sb.append(char1);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        else {
            for (char[] charArray = s.toCharArray(); i < charArray.length; ++i) {
                if (!a(charArray[i])) {
                    final StringBuffer sb2 = new StringBuffer();
                    sb2.append("opt contains illegal character value '");
                    sb2.append(charArray[i]);
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    }
}
