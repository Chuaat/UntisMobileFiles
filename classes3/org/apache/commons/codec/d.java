// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec;

import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public class d
{
    @Deprecated
    public static final Charset a;
    @Deprecated
    public static final Charset b;
    @Deprecated
    public static final Charset c;
    @Deprecated
    public static final Charset d;
    @Deprecated
    public static final Charset e;
    @Deprecated
    public static final Charset f;
    
    static {
        a = StandardCharsets.ISO_8859_1;
        b = StandardCharsets.US_ASCII;
        c = StandardCharsets.UTF_16;
        d = StandardCharsets.UTF_16BE;
        e = StandardCharsets.UTF_16LE;
        f = StandardCharsets.UTF_8;
    }
    
    public static Charset a(final String charsetName) {
        Charset charset;
        if (charsetName == null) {
            charset = Charset.defaultCharset();
        }
        else {
            charset = Charset.forName(charsetName);
        }
        return charset;
    }
    
    public static Charset b(final Charset charset) {
        Charset defaultCharset = charset;
        if (charset == null) {
            defaultCharset = Charset.defaultCharset();
        }
        return defaultCharset;
    }
}
