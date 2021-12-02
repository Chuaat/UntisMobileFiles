// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class m
{
    public static boolean a(final CharSequence charSequence, final CharSequence obj) {
        boolean b = true;
        if (charSequence == obj) {
            return true;
        }
        if (charSequence == null || obj == null) {
            return false;
        }
        if (charSequence instanceof String && obj instanceof String) {
            return charSequence.equals(obj);
        }
        if (charSequence.length() != obj.length() || !k.a(charSequence, false, 0, obj, 0, charSequence.length())) {
            b = false;
        }
        return b;
    }
    
    private static ByteBuffer b(final String s, final Charset charset) {
        if (s == null) {
            return null;
        }
        return ByteBuffer.wrap(s.getBytes(charset));
    }
    
    public static ByteBuffer c(final String s) {
        return b(s, StandardCharsets.UTF_8);
    }
    
    private static byte[] d(final String s, final Charset charset) {
        if (s == null) {
            return null;
        }
        return s.getBytes(charset);
    }
    
    public static byte[] e(final String s) {
        return d(s, StandardCharsets.ISO_8859_1);
    }
    
    public static byte[] f(final String s, final String charsetName) {
        if (s == null) {
            return null;
        }
        try {
            return s.getBytes(charsetName);
        }
        catch (UnsupportedEncodingException ex) {
            throw l(charsetName, ex);
        }
    }
    
    public static byte[] g(final String s) {
        return d(s, StandardCharsets.US_ASCII);
    }
    
    public static byte[] h(final String s) {
        return d(s, StandardCharsets.UTF_16);
    }
    
    public static byte[] i(final String s) {
        return d(s, StandardCharsets.UTF_16BE);
    }
    
    public static byte[] j(final String s) {
        return d(s, StandardCharsets.UTF_16LE);
    }
    
    public static byte[] k(final String s) {
        return d(s, StandardCharsets.UTF_8);
    }
    
    private static IllegalStateException l(final String str, final UnsupportedEncodingException obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }
    
    public static String m(final byte[] bytes, final String charsetName) {
        if (bytes == null) {
            return null;
        }
        try {
            return new String(bytes, charsetName);
        }
        catch (UnsupportedEncodingException ex) {
            throw l(charsetName, ex);
        }
    }
    
    private static String n(final byte[] bytes, final Charset charset) {
        String s;
        if (bytes == null) {
            s = null;
        }
        else {
            s = new String(bytes, charset);
        }
        return s;
    }
    
    public static String o(final byte[] array) {
        return n(array, StandardCharsets.ISO_8859_1);
    }
    
    public static String p(final byte[] array) {
        return n(array, StandardCharsets.US_ASCII);
    }
    
    public static String q(final byte[] array) {
        return n(array, StandardCharsets.UTF_16);
    }
    
    public static String r(final byte[] array) {
        return n(array, StandardCharsets.UTF_16BE);
    }
    
    public static String s(final byte[] array) {
        return n(array, StandardCharsets.UTF_16LE);
    }
    
    public static String t(final byte[] array) {
        return n(array, StandardCharsets.UTF_8);
    }
}
