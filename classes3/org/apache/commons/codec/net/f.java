// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import org.apache.commons.codec.binary.m;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.h;
import java.io.ByteArrayOutputStream;
import java.util.BitSet;
import org.apache.commons.codec.j;
import org.apache.commons.codec.k;
import org.apache.commons.codec.a;
import org.apache.commons.codec.b;

public class f implements b, a, k, j
{
    protected static final byte b = 37;
    @Deprecated
    protected static final BitSet c;
    private static final BitSet d;
    @Deprecated
    protected volatile String a;
    
    static {
        d = new BitSet(256);
        for (int i = 97; i <= 122; ++i) {
            f.d.set(i);
        }
        for (int j = 65; j <= 90; ++j) {
            f.d.set(j);
        }
        for (int k = 48; k <= 57; ++k) {
            f.d.set(k);
        }
        final BitSet d2 = f.d;
        d2.set(45);
        d2.set(95);
        d2.set(46);
        d2.set(42);
        d2.set(32);
        c = (BitSet)d2.clone();
    }
    
    public f() {
        this("UTF-8");
    }
    
    public f(final String a) {
        this.a = a;
    }
    
    public static final byte[] h(final byte[] array) throws org.apache.commons.codec.f {
        if (array == null) {
            return null;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            int b2;
            if (b == 43) {
                b2 = 32;
            }
            else if ((b2 = b) == 37) {
                ++i;
                try {
                    final int a = org.apache.commons.codec.net.g.a(array[i]);
                    ++i;
                    try {
                        byteArrayOutputStream.write((char)((a << 4) + org.apache.commons.codec.net.g.a(array[i])));
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        throw new org.apache.commons.codec.f("Invalid URL encoding: ", ex);
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex2) {}
                continue;
            }
            byteArrayOutputStream.write(b2);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static final byte[] j(final BitSet set, final byte[] array) {
        if (array == null) {
            return null;
        }
        BitSet d;
        if ((d = set) == null) {
            d = f.d;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (final byte b : array) {
            int bitIndex;
            if ((bitIndex = b) < 0) {
                bitIndex = b + 256;
            }
            int b2;
            if (d.get(bitIndex)) {
                if ((b2 = bitIndex) == 32) {
                    b2 = 43;
                }
            }
            else {
                byteArrayOutputStream.write(37);
                final char b3 = org.apache.commons.codec.net.g.b(bitIndex >> 4);
                b2 = org.apache.commons.codec.net.g.b(bitIndex);
                byteArrayOutputStream.write(b3);
            }
            byteArrayOutputStream.write(b2);
        }
        return byteArrayOutputStream.toByteArray();
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
        sb.append(" cannot be URL encoded");
        throw new h(sb.toString());
    }
    
    @Override
    public String b(String g) throws org.apache.commons.codec.f {
        if (g == null) {
            return null;
        }
        try {
            g = this.g(g, this.k());
            return g;
        }
        catch (UnsupportedEncodingException ex) {
            throw new org.apache.commons.codec.f(ex.getMessage(), ex);
        }
    }
    
    @Override
    public byte[] c(final byte[] array) throws org.apache.commons.codec.f {
        return h(array);
    }
    
    @Override
    public String d(String i) throws h {
        if (i == null) {
            return null;
        }
        try {
            i = this.i(i, this.k());
            return i;
        }
        catch (UnsupportedEncodingException ex) {
            throw new h(ex.getMessage(), ex);
        }
    }
    
    @Override
    public byte[] e(final byte[] array) {
        return j(f.d, array);
    }
    
    @Override
    public Object f(final Object o) throws org.apache.commons.codec.f {
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
        sb.append(" cannot be URL decoded");
        throw new org.apache.commons.codec.f(sb.toString());
    }
    
    public String g(final String s, final String charsetName) throws org.apache.commons.codec.f, UnsupportedEncodingException {
        if (s == null) {
            return null;
        }
        return new String(this.c(m.g(s)), charsetName);
    }
    
    public String i(final String s, final String charsetName) throws UnsupportedEncodingException {
        if (s == null) {
            return null;
        }
        return m.p(this.e(s.getBytes(charsetName)));
    }
    
    public String k() {
        return this.a;
    }
    
    @Deprecated
    public String l() {
        return this.a;
    }
}
