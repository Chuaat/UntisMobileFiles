// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

public final class JavaVersion
{
    private static final int majorJavaVersion;
    
    static {
        majorJavaVersion = determineMajorJavaVersion();
    }
    
    private JavaVersion() {
    }
    
    private static int determineMajorJavaVersion() {
        return getMajorJavaVersion(System.getProperty("java.version"));
    }
    
    private static int extractBeginningInt(final String s) {
        try {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                if (!Character.isDigit(char1)) {
                    break;
                }
                sb.append(char1);
            }
            return Integer.parseInt(sb.toString());
        }
        catch (NumberFormatException ex) {
            return -1;
        }
    }
    
    public static int getMajorJavaVersion() {
        return JavaVersion.majorJavaVersion;
    }
    
    static int getMajorJavaVersion(final String s) {
        int n;
        if ((n = parseDotted(s)) == -1) {
            n = extractBeginningInt(s);
        }
        if (n == -1) {
            return 6;
        }
        return n;
    }
    
    public static boolean isJava9OrLater() {
        return JavaVersion.majorJavaVersion >= 9;
    }
    
    private static int parseDotted(final String s) {
        try {
            final String[] split = s.split("[._]");
            final int int1 = Integer.parseInt(split[0]);
            if (int1 == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return int1;
        }
        catch (NumberFormatException ex) {
            return -1;
        }
    }
}
