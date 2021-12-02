// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import androidx.annotation.j0;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.nio.charset.Charset;
import android.util.Base64;

public class q
{
    private static final byte a;
    private static final byte b;
    private static final int c = 22;
    
    static {
        a = Byte.parseByte("01110000", 2);
        b = Byte.parseByte("00001111", 2);
    }
    
    private static String b(final byte[] array) {
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
    
    private static byte[] c(final UUID uuid, final byte[] array) {
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
    
    @j0
    public String a() {
        final byte[] c = c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte)((q.b & c[0]) | q.a);
        return b(c);
    }
}
