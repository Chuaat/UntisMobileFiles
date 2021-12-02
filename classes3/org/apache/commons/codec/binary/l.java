// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import org.apache.commons.codec.h;
import java.nio.ByteBuffer;
import org.apache.commons.codec.f;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import org.apache.commons.codec.a;
import org.apache.commons.codec.b;

public class l implements b, a
{
    public static final Charset b;
    public static final String c = "UTF-8";
    private static final char[] d;
    private static final char[] e;
    private final Charset a;
    
    static {
        b = StandardCharsets.UTF_8;
        d = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        e = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public l() {
        this.a = l.b;
    }
    
    public l(final String charsetName) {
        this(Charset.forName(charsetName));
    }
    
    public l(final Charset a) {
        this.a = a;
    }
    
    public static byte[] h(final String s) throws f {
        return i(s.toCharArray());
    }
    
    public static byte[] i(final char[] array) throws f {
        final int length = array.length;
        if ((length & 0x1) == 0x0) {
            final byte[] array2 = new byte[length >> 1];
            int x;
            int x2;
            for (int i = 0, n = 0; i < length; ++i, x2 = x(array[i], i), ++i, array2[n] = (byte)((x << 4 | x2) & 0xFF), ++n) {
                x = x(array[i], i);
            }
            return array2;
        }
        throw new f("Odd number of characters.");
    }
    
    public static char[] k(final ByteBuffer byteBuffer) {
        return l(byteBuffer, true);
    }
    
    public static char[] l(final ByteBuffer byteBuffer, final boolean b) {
        char[] array;
        if (b) {
            array = l.d;
        }
        else {
            array = l.e;
        }
        return m(byteBuffer, array);
    }
    
    protected static char[] m(final ByteBuffer byteBuffer, final char[] array) {
        return p(w(byteBuffer), array);
    }
    
    public static char[] n(final byte[] array) {
        return o(array, true);
    }
    
    public static char[] o(final byte[] array, final boolean b) {
        char[] array2;
        if (b) {
            array2 = l.d;
        }
        else {
            array2 = l.e;
        }
        return p(array, array2);
    }
    
    protected static char[] p(final byte[] array, final char[] array2) {
        final int length = array.length;
        final char[] array3 = new char[length << 1];
        int i = 0;
        int n = 0;
        while (i < length) {
            final int n2 = n + 1;
            array3[n] = array2[(array[i] & 0xF0) >>> 4];
            n = n2 + 1;
            array3[n2] = array2[array[i] & 0xF];
            ++i;
        }
        return array3;
    }
    
    public static String q(final ByteBuffer byteBuffer) {
        return new String(k(byteBuffer));
    }
    
    public static String r(final ByteBuffer byteBuffer, final boolean b) {
        return new String(l(byteBuffer, b));
    }
    
    public static String s(final byte[] array) {
        return new String(n(array));
    }
    
    public static String t(final byte[] array, final boolean b) {
        return new String(o(array, b));
    }
    
    private static byte[] w(final ByteBuffer byteBuffer) {
        final int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            final byte[] array = byteBuffer.array();
            if (remaining == array.length) {
                byteBuffer.position(remaining);
                return array;
            }
        }
        final byte[] dst = new byte[remaining];
        byteBuffer.get(dst);
        return dst;
    }
    
    protected static int x(final char c, final int i) throws f {
        final int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal hexadecimal character ");
        sb.append(c);
        sb.append(" at index ");
        sb.append(i);
        throw new f(sb.toString());
    }
    
    @Override
    public Object a(final Object o) throws h {
        Label_0045: {
            if (o instanceof String) {
                final byte[] array = ((String)o).getBytes(this.u());
                break Label_0045;
            }
            if (o instanceof ByteBuffer) {
                final byte[] array = w((ByteBuffer)o);
                break Label_0045;
            }
            try {
                final byte[] array = (byte[])o;
                return n(array);
            }
            catch (ClassCastException ex) {
                throw new h(ex.getMessage(), ex);
            }
        }
    }
    
    @Override
    public byte[] c(final byte[] bytes) throws f {
        return i(new String(bytes, this.u()).toCharArray());
    }
    
    @Override
    public byte[] e(final byte[] array) {
        return s(array).getBytes(this.u());
    }
    
    @Override
    public Object f(final Object o) throws f {
        if (o instanceof String) {
            return this.f(((String)o).toCharArray());
        }
        if (o instanceof byte[]) {
            return this.c((byte[])o);
        }
        if (o instanceof ByteBuffer) {
            return this.g((ByteBuffer)o);
        }
        try {
            return i((char[])o);
        }
        catch (ClassCastException ex) {
            throw new f(ex.getMessage(), ex);
        }
    }
    
    public byte[] g(final ByteBuffer byteBuffer) throws f {
        return i(new String(w(byteBuffer), this.u()).toCharArray());
    }
    
    public byte[] j(final ByteBuffer byteBuffer) {
        return q(byteBuffer).getBytes(this.u());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[charsetName=");
        sb.append(this.a);
        sb.append("]");
        return sb.toString();
    }
    
    public Charset u() {
        return this.a;
    }
    
    public String v() {
        return this.a.name();
    }
}
