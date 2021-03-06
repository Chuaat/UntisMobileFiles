// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common;

public final class StringUtil
{
    private StringUtil() {
    }
    
    public static String removeAll(final String s, final char c) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 != c) {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String removePrefix(final String s, final String prefix) {
        String substring = s;
        if (s.startsWith(prefix)) {
            substring = s.substring(prefix.length());
        }
        return substring;
    }
    
    public static String removePrefix(final String s, final String s2, final String s3) {
        if (s != s3) {
            return s3;
        }
        return removePrefix(s, s2);
    }
}
