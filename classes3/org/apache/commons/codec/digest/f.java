// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.security.SecureRandom;
import java.util.Random;
import java.nio.charset.StandardCharsets;

public class f
{
    static final String a = "$apr1$";
    private static final int b = 16;
    static final String c = "$1$";
    private static final int d = 1000;
    
    public static String a(final String s) {
        return c(s.getBytes(StandardCharsets.UTF_8));
    }
    
    public static String b(final String s, final String s2) {
        return d(s.getBytes(StandardCharsets.UTF_8), s2);
    }
    
    public static String c(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append("$apr1$");
        sb.append(org.apache.commons.codec.digest.a.b(8));
        return d(array, sb.toString());
    }
    
    public static String d(final byte[] array, final String str) {
        String string = str;
        if (str != null) {
            string = str;
            if (!str.startsWith("$apr1$")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("$apr1$");
                sb.append(str);
                string = sb.toString();
            }
        }
        return h(array, string, "$apr1$");
    }
    
    public static String e(final byte[] array, final Random random) {
        final StringBuilder sb = new StringBuilder();
        sb.append("$apr1$");
        sb.append(org.apache.commons.codec.digest.a.c(8, random));
        return d(array, sb.toString());
    }
    
    public static String f(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append("$1$");
        sb.append(org.apache.commons.codec.digest.a.b(8));
        return g(array, sb.toString());
    }
    
    public static String g(final byte[] array, final String s) {
        return h(array, s, "$1$");
    }
    
    public static String h(final byte[] array, final String s, final String s2) {
        return i(array, s, s2, new SecureRandom());
    }
    
    public static String i(final byte[] a, String str, final String str2, final Random random) {
        int i = a.length;
        if (str == null) {
            str = a.c(8, random);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("^");
            sb.append(str2.replace("$", "\\$"));
            sb.append("([\\.\\/a-zA-Z0-9]{1,8}).*");
            final Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
            if (!matcher.find()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid salt value: ");
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
            str = matcher.group(1);
        }
        final byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        final MessageDigest v = org.apache.commons.codec.digest.c.v();
        v.update(a);
        v.update(str2.getBytes(StandardCharsets.UTF_8));
        v.update(bytes);
        final MessageDigest v2 = org.apache.commons.codec.digest.c.v();
        v2.update(a);
        v2.update(bytes);
        v2.update(a);
        final byte[] digest = v2.digest();
        int n = i;
        while (true) {
            int len = 16;
            if (n <= 0) {
                break;
            }
            if (n <= 16) {
                len = n;
            }
            v.update(digest, 0, len);
            n -= 16;
        }
        Arrays.fill(digest, (byte)0);
        while (i > 0) {
            byte input;
            if ((i & 0x1) == 0x1) {
                input = digest[0];
            }
            else {
                input = a[0];
            }
            v.update(input);
            i >>= 1;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(str);
        sb3.append("$");
        final StringBuilder sb4 = new StringBuilder(sb3.toString());
        byte[] a2 = v.digest();
        int j = 0;
        MessageDigest v3 = v2;
        while (j < 1000) {
            v3 = org.apache.commons.codec.digest.c.v();
            final int n2 = j & 0x1;
            if (n2 != 0) {
                v3.update(a);
            }
            else {
                v3.update(a2, 0, 16);
            }
            if (j % 3 != 0) {
                v3.update(bytes);
            }
            if (j % 7 != 0) {
                v3.update(a);
            }
            if (n2 != 0) {
                v3.update(a2, 0, 16);
            }
            else {
                v3.update(a);
            }
            a2 = v3.digest();
            ++j;
        }
        a.a(a2[0], a2[6], a2[12], 4, sb4);
        a.a(a2[1], a2[7], a2[13], 4, sb4);
        a.a(a2[2], a2[8], a2[14], 4, sb4);
        a.a(a2[3], a2[9], a2[15], 4, sb4);
        a.a(a2[4], a2[10], a2[5], 4, sb4);
        a.a((byte)0, (byte)0, a2[11], 2, sb4);
        v.reset();
        v3.reset();
        Arrays.fill(a, (byte)0);
        Arrays.fill(bytes, (byte)0);
        Arrays.fill(a2, (byte)0);
        return sb4.toString();
    }
    
    public static String j(final byte[] array, final Random random) {
        final StringBuilder sb = new StringBuilder();
        sb.append("$1$");
        sb.append(org.apache.commons.codec.digest.a.c(8, random));
        return g(array, sb.toString());
    }
}
