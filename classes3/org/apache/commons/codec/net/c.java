// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.f;
import org.apache.commons.codec.h;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.BitSet;
import org.apache.commons.codec.j;
import org.apache.commons.codec.k;

public class c extends e implements k, j
{
    private static final BitSet f;
    private static final byte g = 32;
    private static final byte h = 95;
    private final Charset d;
    private boolean e;
    
    static {
        final BitSet f2 = new BitSet(256);
        (f = f2).set(32);
        f2.set(33);
        f2.set(34);
        f2.set(35);
        f2.set(36);
        f2.set(37);
        f2.set(38);
        f2.set(39);
        f2.set(40);
        f2.set(41);
        f2.set(42);
        f2.set(43);
        f2.set(44);
        f2.set(45);
        f2.set(46);
        f2.set(47);
        for (int i = 48; i <= 57; ++i) {
            c.f.set(i);
        }
        final BitSet f3 = c.f;
        f3.set(58);
        f3.set(59);
        f3.set(60);
        f3.set(62);
        f3.set(64);
        for (int j = 65; j <= 90; ++j) {
            c.f.set(j);
        }
        final BitSet f4 = c.f;
        f4.set(91);
        f4.set(92);
        f4.set(93);
        f4.set(94);
        f4.set(96);
        for (int k = 97; k <= 122; ++k) {
            c.f.set(k);
        }
        final BitSet f5 = c.f;
        f5.set(123);
        f5.set(124);
        f5.set(125);
        f5.set(126);
    }
    
    public c() {
        this(StandardCharsets.UTF_8);
    }
    
    public c(final String charsetName) {
        this(Charset.forName(charsetName));
    }
    
    public c(final Charset d) {
        this.e = false;
        this.d = d;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o == null) {
            return null;
        }
        if (o instanceof String) {
            return this.d((String)o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Objects of type ");
        sb.append(o.getClass().getName());
        sb.append(" cannot be encoded using Q codec");
        throw new h(sb.toString());
    }
    
    @Override
    public String b(String g) throws f {
        if (g == null) {
            return null;
        }
        try {
            g = this.g(g);
            return g;
        }
        catch (UnsupportedEncodingException ex) {
            throw new f(ex.getMessage(), ex);
        }
    }
    
    @Override
    public String d(final String s) throws h {
        if (s == null) {
            return null;
        }
        return this.n(s, this.o());
    }
    
    @Override
    public Object f(final Object o) throws f {
        if (o == null) {
            return null;
        }
        if (o instanceof String) {
            return this.b((String)o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Objects of type ");
        sb.append(o.getClass().getName());
        sb.append(" cannot be decoded using Q codec");
        throw new f(sb.toString());
    }
    
    @Override
    protected byte[] h(final byte[] array) throws f {
        if (array == null) {
            return null;
        }
        final int length = array.length;
        final int n = 0;
        int i = 0;
        while (true) {
            while (i < length) {
                if (array[i] == 95) {
                    final boolean b = true;
                    if (b) {
                        final byte[] array2 = new byte[array.length];
                        for (int j = n; j < array.length; ++j) {
                            final byte b2 = array[j];
                            if (b2 != 95) {
                                array2[j] = b2;
                            }
                            else {
                                array2[j] = 32;
                            }
                        }
                        return org.apache.commons.codec.net.d.i(array2);
                    }
                    return org.apache.commons.codec.net.d.i(array);
                }
                else {
                    ++i;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    @Override
    protected byte[] i(byte[] n) {
        if (n == null) {
            return null;
        }
        n = org.apache.commons.codec.net.d.n(c.f, n);
        if (this.e) {
            for (int i = 0; i < n.length; ++i) {
                if (n[i] == 32) {
                    n[i] = 95;
                }
            }
        }
        return n;
    }
    
    @Override
    protected String l() {
        return "Q";
    }
    
    public String m(String j, final String s) throws h {
        if (j == null) {
            return null;
        }
        try {
            j = this.j(j, s);
            return j;
        }
        catch (UnsupportedEncodingException ex) {
            throw new h(ex.getMessage(), ex);
        }
    }
    
    public String n(final String s, final Charset charset) throws h {
        if (s == null) {
            return null;
        }
        return this.k(s, charset);
    }
    
    public Charset o() {
        return this.d;
    }
    
    public String p() {
        return this.d.name();
    }
    
    public boolean q() {
        return this.e;
    }
    
    public void r(final boolean e) {
        this.e = e;
    }
}
