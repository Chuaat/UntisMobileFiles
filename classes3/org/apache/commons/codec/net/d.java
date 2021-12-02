// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.binary.m;
import org.apache.commons.codec.h;
import org.apache.commons.codec.f;
import java.io.ByteArrayOutputStream;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.BitSet;
import org.apache.commons.codec.j;
import org.apache.commons.codec.k;
import org.apache.commons.codec.a;
import org.apache.commons.codec.b;

public class d implements b, a, k, j
{
    private static final BitSet c;
    private static final byte d = 61;
    private static final byte e = 9;
    private static final byte f = 32;
    private static final byte g = 13;
    private static final byte h = 10;
    private static final int i = 73;
    private final Charset a;
    private final boolean b;
    
    static {
        c = new BitSet(256);
        for (int i = 33; i <= 60; ++i) {
            org.apache.commons.codec.net.d.c.set(i);
        }
        for (int j = 62; j <= 126; ++j) {
            org.apache.commons.codec.net.d.c.set(j);
        }
        final BitSet c2 = org.apache.commons.codec.net.d.c;
        c2.set(9);
        c2.set(32);
    }
    
    public d() {
        this(StandardCharsets.UTF_8, false);
    }
    
    public d(final String charsetName) throws IllegalCharsetNameException, IllegalArgumentException, UnsupportedCharsetException {
        this(Charset.forName(charsetName), false);
    }
    
    public d(final Charset charset) {
        this(charset, false);
    }
    
    public d(final Charset a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public d(final boolean b) {
        this(StandardCharsets.UTF_8, b);
    }
    
    public static final byte[] i(final byte[] array) throws f {
        if (array == null) {
            return null;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n;
        for (int i = 0; i < array.length; i = n + 1) {
            final byte b = array[i];
            if (b == 61) {
                n = i + 1;
                if (array[n] == 13) {
                    continue;
                }
                try {
                    final int a = org.apache.commons.codec.net.g.a(array[n]);
                    ++n;
                    try {
                        byteArrayOutputStream.write((char)((a << 4) + org.apache.commons.codec.net.g.a(array[n])));
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        throw new f("Invalid quoted-printable encoding", ex);
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex2) {}
            }
            n = i;
            if (b != 13) {
                n = i;
                if (b != 10) {
                    byteArrayOutputStream.write(b);
                    n = i;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    private static int l(final int b, final boolean b2, final ByteArrayOutputStream byteArrayOutputStream) {
        if (b2) {
            return m(b, byteArrayOutputStream);
        }
        byteArrayOutputStream.write(b);
        return 1;
    }
    
    private static final int m(int b, final ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        final char b2 = org.apache.commons.codec.net.g.b(b >> 4);
        b = org.apache.commons.codec.net.g.b(b);
        byteArrayOutputStream.write(b2);
        byteArrayOutputStream.write(b);
        return 3;
    }
    
    public static final byte[] n(final BitSet set, final byte[] array) {
        return o(set, array, false);
    }
    
    public static final byte[] o(final BitSet set, final byte[] array, final boolean b) {
        if (array == null) {
            return null;
        }
        BitSet c;
        if ((c = set) == null) {
            c = org.apache.commons.codec.net.d.c;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        if (b) {
            int j = 0;
            int n = 1;
            while (j < array.length - 3) {
                final int r = r(j, array);
                if (n < 73) {
                    n += l(r, c.get(r) ^ true, byteArrayOutputStream);
                }
                else {
                    l(r, !c.get(r) || s(r), byteArrayOutputStream);
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    n = 1;
                }
                ++j;
            }
            final int r2 = r(array.length - 3, array);
            if (n + l(r2, !c.get(r2) || (s(r2) && n > 68), byteArrayOutputStream) > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            for (int k = array.length - 2; k < array.length; ++k) {
                final int r3 = r(k, array);
                l(r3, !c.get(r3) || (k > array.length - 2 && s(r3)), byteArrayOutputStream);
            }
        }
        else {
            while (i < array.length) {
                final byte b2 = array[i];
                int n2;
                if ((n2 = b2) < 0) {
                    n2 = b2 + 256;
                }
                if (c.get(n2)) {
                    byteArrayOutputStream.write(n2);
                }
                else {
                    m(n2, byteArrayOutputStream);
                }
                ++i;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    private static int r(int n, final byte[] array) {
        final byte b = (byte)(n = array[n]);
        if (b < 0) {
            n = b + 256;
        }
        return n;
    }
    
    private static boolean s(final int n) {
        return n == 32 || n == 9;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o == null) {
            return null;
        }
        if (o instanceof byte[]) {
            return this.e((byte[])o);
        }
        if (o instanceof String) {
            return this.d((String)o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Objects of type ");
        sb.append(o.getClass().getName());
        sb.append(" cannot be quoted-printable encoded");
        throw new h(sb.toString());
    }
    
    @Override
    public String b(final String s) throws f {
        return this.h(s, this.p());
    }
    
    @Override
    public byte[] c(final byte[] array) throws f {
        return i(array);
    }
    
    @Override
    public String d(final String s) throws h {
        return this.k(s, this.p());
    }
    
    @Override
    public byte[] e(final byte[] array) {
        return o(org.apache.commons.codec.net.d.c, array, this.b);
    }
    
    @Override
    public Object f(final Object o) throws f {
        if (o == null) {
            return null;
        }
        if (o instanceof byte[]) {
            return this.c((byte[])o);
        }
        if (o instanceof String) {
            return this.b((String)o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Objects of type ");
        sb.append(o.getClass().getName());
        sb.append(" cannot be quoted-printable decoded");
        throw new f(sb.toString());
    }
    
    public String g(final String s, final String charsetName) throws f, UnsupportedEncodingException {
        if (s == null) {
            return null;
        }
        return new String(this.c(m.g(s)), charsetName);
    }
    
    public String h(final String s, final Charset charset) throws f {
        if (s == null) {
            return null;
        }
        return new String(this.c(m.g(s)), charset);
    }
    
    public String j(final String s, final String charsetName) throws UnsupportedEncodingException {
        if (s == null) {
            return null;
        }
        return m.p(this.e(s.getBytes(charsetName)));
    }
    
    public String k(final String s, final Charset charset) {
        if (s == null) {
            return null;
        }
        return m.p(this.e(s.getBytes(charset)));
    }
    
    public Charset p() {
        return this.a;
    }
    
    public String q() {
        return this.a.name();
    }
}
