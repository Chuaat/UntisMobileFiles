// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;

public class k implements org.apache.commons.codec.k
{
    public static final String b = "01360240043788015936020505";
    private static final char[] c;
    public static final k d;
    private final char[] a;
    
    static {
        c = "01360240043788015936020505".toCharArray();
        d = new k();
    }
    
    public k() {
        this.a = k.c;
    }
    
    public k(final String s) {
        this.a = s.toCharArray();
    }
    
    public k(final char[] array) {
        System.arraycopy(array, 0, this.a = new char[array.length], 0, array.length);
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.f((String)o);
        }
        throw new h("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }
    
    public int b(final String s, final String s2) throws h {
        return m.b(this, s, s2);
    }
    
    char c(final char c) {
        if (!Character.isLetter(c)) {
            return '\0';
        }
        return this.a[Character.toUpperCase(c) - 'A'];
    }
    
    @Override
    public String d(final String s) {
        return this.f(s);
    }
    
    public String f(String a) {
        if (a == null) {
            return null;
        }
        a = m.a(a);
        if (a.length() == 0) {
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append(a.charAt(0));
        char c = '*';
        while (i < a.length()) {
            final char c2 = this.c(a.charAt(i));
            if (c2 != c) {
                if (c2 != '\0') {
                    sb.append(c2);
                }
                c = c2;
            }
            ++i;
        }
        return sb.toString();
    }
}
