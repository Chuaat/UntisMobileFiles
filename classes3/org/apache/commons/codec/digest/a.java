// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import java.util.Random;
import java.security.SecureRandom;

class a
{
    static final String a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final char[] b;
    
    static {
        b = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    }
    
    static void a(final byte b, final byte b2, final byte b3, int i, final StringBuilder sb) {
        int n = (b << 16 & 0xFFFFFF) | (b2 << 8 & 0xFFFF) | (b3 & 0xFF);
        while (i > 0) {
            sb.append(org.apache.commons.codec.digest.a.b[n & 0x3F]);
            n >>= 6;
            --i;
        }
    }
    
    static String b(final int n) {
        return c(n, new SecureRandom());
    }
    
    static String c(final int capacity, final Random random) {
        final StringBuilder sb = new StringBuilder(capacity);
        for (int i = 1; i <= capacity; ++i) {
            sb.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(64)));
        }
        return sb.toString();
    }
}
