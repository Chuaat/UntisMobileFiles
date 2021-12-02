// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import org.apache.commons.codec.h;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.binary.m;
import org.apache.commons.codec.f;

abstract class e
{
    protected static final char a = '?';
    protected static final String b = "?=";
    protected static final String c = "=?";
    
    protected String g(final String s) throws f, UnsupportedEncodingException {
        if (s == null) {
            return null;
        }
        if (!s.startsWith("=?") || !s.endsWith("?=")) {
            throw new f("RFC 1522 violation: malformed encoded content");
        }
        final int n = s.length() - 2;
        final int index = s.indexOf(63, 2);
        if (index == n) {
            throw new f("RFC 1522 violation: charset token not found");
        }
        final String substring = s.substring(2, index);
        if (substring.equals("")) {
            throw new f("RFC 1522 violation: charset not specified");
        }
        final int n2 = index + 1;
        final int index2 = s.indexOf(63, n2);
        if (index2 == n) {
            throw new f("RFC 1522 violation: encoding token not found");
        }
        final String substring2 = s.substring(n2, index2);
        if (this.l().equalsIgnoreCase(substring2)) {
            final int n3 = index2 + 1;
            return new String(this.h(m.g(s.substring(n3, s.indexOf(63, n3)))), substring);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("This codec cannot decode ");
        sb.append(substring2);
        sb.append(" encoded content");
        throw new f(sb.toString());
    }
    
    protected abstract byte[] h(final byte[] p0) throws f;
    
    protected abstract byte[] i(final byte[] p0) throws h;
    
    protected String j(final String s, final String charsetName) throws h, UnsupportedEncodingException {
        if (s == null) {
            return null;
        }
        return this.k(s, Charset.forName(charsetName));
    }
    
    protected String k(final String s, final Charset charset) throws h {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("=?");
        sb.append(charset);
        sb.append('?');
        sb.append(this.l());
        sb.append('?');
        sb.append(m.p(this.i(s.getBytes(charset))));
        sb.append("?=");
        return sb.toString();
    }
    
    protected abstract String l();
}
