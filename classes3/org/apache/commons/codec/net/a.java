// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import org.apache.commons.codec.binary.d;
import org.apache.commons.codec.f;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.h;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import org.apache.commons.codec.j;
import org.apache.commons.codec.k;

public class a extends e implements k, j
{
    private final Charset d;
    
    public a() {
        this(StandardCharsets.UTF_8);
    }
    
    public a(final String charsetName) {
        this(Charset.forName(charsetName));
    }
    
    public a(final Charset d) {
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
        sb.append(" cannot be encoded using BCodec");
        throw new h(sb.toString());
    }
    
    @Override
    public String b(String g) throws f {
        if (g == null) {
            return null;
        }
        try {
            g = this.g((String)g);
            return (String)g;
        }
        catch (IllegalArgumentException g) {}
        catch (UnsupportedEncodingException ex) {}
        throw new f(((Throwable)g).getMessage(), (Throwable)g);
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
        sb.append(" cannot be decoded using BCodec");
        throw new f(sb.toString());
    }
    
    @Override
    protected byte[] h(final byte[] array) {
        if (array == null) {
            return null;
        }
        return org.apache.commons.codec.binary.d.B(array);
    }
    
    @Override
    protected byte[] i(final byte[] array) {
        if (array == null) {
            return null;
        }
        return org.apache.commons.codec.binary.d.D(array);
    }
    
    @Override
    protected String l() {
        return "B";
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
}
