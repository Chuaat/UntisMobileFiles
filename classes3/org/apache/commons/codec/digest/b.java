// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;

public class b
{
    public static String a(final String s) {
        return b(s, null);
    }
    
    public static String b(final String s, final String s2) {
        return d(s.getBytes(StandardCharsets.UTF_8), s2);
    }
    
    public static String c(final byte[] array) {
        return d(array, null);
    }
    
    public static String d(final byte[] array, final String s) {
        if (s == null) {
            return l.e(array);
        }
        if (s.startsWith("$6$")) {
            return l.f(array, s);
        }
        if (s.startsWith("$5$")) {
            return l.b(array, s);
        }
        if (s.startsWith("$1$")) {
            return f.g(array, s);
        }
        return m.f(array, s);
    }
}
