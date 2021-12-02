// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Utf8Charset
{
    public static final Charset INSTANCE;
    public static final String NAME = "UTF-8";
    
    static {
        INSTANCE = Charset.forName("UTF-8");
    }
    
    public static String decodeUTF8(final byte[] bytes) {
        return new String(bytes, Utf8Charset.INSTANCE);
    }
    
    public static byte[] encodeUTF8(final String s) {
        try {
            return s.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException cause) {
            throw new RuntimeException(cause);
        }
    }
}
