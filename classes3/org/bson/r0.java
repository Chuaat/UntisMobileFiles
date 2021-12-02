// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Arrays;
import e7.a;

public final class r0 extends y0
{
    private final String a;
    private final String b;
    
    public r0(final String s) {
        this(s, null);
    }
    
    public r0(String z0, final String s) {
        this.a = e7.a.e("pattern", z0);
        if (s == null) {
            z0 = "";
        }
        else {
            z0 = this.Z0(s);
        }
        this.b = z0;
    }
    
    private String Z0(final String s) {
        final char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    public String X0() {
        return this.b;
    }
    
    public String Y0() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && r0.class == o.getClass()) {
            final r0 r0 = (r0)o;
            return this.b.equals(r0.b) && this.a.equals(r0.a);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.S;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonRegularExpression{pattern='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", options='");
        sb.append(this.b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
