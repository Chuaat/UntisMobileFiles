// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.apache.commons.codec.binary.g;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.a;

public class r0
{
    private static final long a = 30000L;
    
    public static long a(final long n, final String s) {
        if (s == null) {
            return 0L;
        }
        if (s.isEmpty()) {
            return 0L;
        }
        try {
            return b(((g)new a()).c(s.toUpperCase().getBytes()), n / 30000L);
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    private static int b(byte[] doFinal, long n) throws NoSuchAlgorithmException, InvalidKeyException {
        final int n2 = 0;
        if (doFinal != null && doFinal.length != 0) {
            final byte[] input = new byte[8];
            int n3 = 8;
            while (true) {
                final int n4 = n3 - 1;
                if (n3 <= 0) {
                    break;
                }
                input[n4] = (byte)n;
                n >>>= 8;
                n3 = n4;
            }
            final SecretKeySpec key = new SecretKeySpec(doFinal, "HmacSHA1");
            final Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(key);
            doFinal = instance.doFinal(input);
            final byte b = doFinal[19];
            n = 0L;
            for (int i = n2; i < 4; ++i) {
                n = (n << 8 | (long)(doFinal[(b & 0xF) + i] & 0xFF));
            }
            return (int)((0x7FFFFFFFL & n) % 1000000L);
        }
        return 0;
    }
}
