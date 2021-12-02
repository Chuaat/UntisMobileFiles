// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import org.apache.commons.codec.k;

public class l implements k
{
    public static final char d = '-';
    public static final String e = "01230120022455012623010202";
    private static final char[] f;
    public static final l g;
    public static final l h;
    public static final l i;
    @Deprecated
    private int a;
    private final char[] b;
    private final boolean c;
    
    static {
        f = "01230120022455012623010202".toCharArray();
        g = new l();
        h = new l("01230120022455012623010202", false);
        i = new l("-123-12--22455-12623-1-2-2");
    }
    
    public l() {
        this.a = 4;
        this.b = l.f;
        this.c = true;
    }
    
    public l(final String s) {
        this.a = 4;
        final char[] charArray = s.toCharArray();
        this.b = charArray;
        this.c = (this.f(charArray) ^ true);
    }
    
    public l(final String s, final boolean c) {
        this.a = 4;
        this.b = s.toCharArray();
        this.c = c;
    }
    
    public l(final char[] array) {
        this.a = 4;
        final char[] b = new char[array.length];
        System.arraycopy(array, 0, this.b = b, 0, array.length);
        this.c = (this.f(b) ^ true);
    }
    
    private boolean f(final char[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == '-') {
                return true;
            }
        }
        return false;
    }
    
    private char g(final char c) {
        final int i = c - 'A';
        if (i >= 0) {
            final char[] b = this.b;
            if (i < b.length) {
                return b[i];
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The character is not mapped: ");
        sb.append(c);
        sb.append(" (index=");
        sb.append(i);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.i((String)o);
        }
        throw new h("Parameter supplied to Soundex encode is not of type java.lang.String");
    }
    
    public int b(final String s, final String s2) throws h {
        return m.b(this, s, s2);
    }
    
    @Deprecated
    public int c() {
        return this.a;
    }
    
    @Override
    public String d(final String s) {
        return this.i(s);
    }
    
    @Deprecated
    public void h(final int a) {
        this.a = a;
    }
    
    public String i(final String s) {
        if (s == null) {
            return null;
        }
        final String a = m.a(s);
        if (a.length() == 0) {
            return a;
        }
        final char[] array;
        final char[] value = array = new char[4];
        array[1] = (array[0] = '0');
        array[3] = (array[2] = '0');
        final char char1 = a.charAt(0);
        value[0] = char1;
        int g = this.g(char1);
        int g2;
        int n2;
        for (int index = 1, n = 1; index < a.length() && n < 4; ++index, g = g2, n = n2) {
            final char char2 = a.charAt(index);
            if (this.c) {
                g2 = g;
                n2 = n;
                if (char2 == 'H') {
                    continue;
                }
                if (char2 == 'W') {
                    g2 = g;
                    n2 = n;
                    continue;
                }
            }
            g2 = this.g(char2);
            if (g2 == 45) {
                g2 = g;
                n2 = n;
            }
            else {
                n2 = n;
                if (g2 != 48) {
                    n2 = n;
                    if (g2 != g) {
                        value[n] = (char)g2;
                        n2 = n + 1;
                    }
                }
            }
        }
        return new String(value);
    }
}
