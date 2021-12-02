// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import java.util.regex.Pattern;
import org.apache.commons.codec.k;

public class j implements k
{
    private static final char[] b;
    private static final char[] c;
    private static final char[] d;
    private static final char[] e;
    private static final char[] f;
    private static final char[] g;
    private static final char[] h;
    private static final char[] i;
    private static final char[] j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    private static final Pattern n;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static final char r = ' ';
    private static final int s = 6;
    private final boolean a;
    
    static {
        b = new char[] { 'A' };
        c = new char[] { 'A', 'F' };
        d = new char[] { 'C' };
        e = new char[] { 'F', 'F' };
        f = new char[] { 'G' };
        g = new char[] { 'N' };
        h = new char[] { 'N', 'N' };
        i = new char[] { 'S' };
        j = new char[] { 'S', 'S', 'S' };
        k = Pattern.compile("^MAC");
        l = Pattern.compile("^KN");
        m = Pattern.compile("^K");
        n = Pattern.compile("^(PH|PF)");
        o = Pattern.compile("^SCH");
        p = Pattern.compile("(EE|IE)$");
        q = Pattern.compile("(DT|RT|RD|NT|ND)$");
    }
    
    public j() {
        this(true);
    }
    
    public j(final boolean a) {
        this.a = a;
    }
    
    private static boolean c(final char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
    private static char[] g(final char c, final char c2, final char c3, final char c4) {
        if (c2 == 'E' && c3 == 'V') {
            return org.apache.commons.codec.language.j.c;
        }
        if (c(c2)) {
            return org.apache.commons.codec.language.j.b;
        }
        if (c2 == 'Q') {
            return org.apache.commons.codec.language.j.f;
        }
        if (c2 == 'Z') {
            return org.apache.commons.codec.language.j.i;
        }
        if (c2 == 'M') {
            return org.apache.commons.codec.language.j.g;
        }
        if (c2 == 'K') {
            if (c3 == 'N') {
                return org.apache.commons.codec.language.j.h;
            }
            return org.apache.commons.codec.language.j.d;
        }
        else {
            if (c2 == 'S' && c3 == 'C' && c4 == 'H') {
                return org.apache.commons.codec.language.j.j;
            }
            if (c2 == 'P' && c3 == 'H') {
                return org.apache.commons.codec.language.j.e;
            }
            if (c2 == 'H' && (!c(c) || !c(c3))) {
                return new char[] { c };
            }
            if (c2 == 'W' && c(c)) {
                return new char[] { c };
            }
            return new char[] { c2 };
        }
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.f((String)o);
        }
        throw new h("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }
    
    public boolean b() {
        return this.a;
    }
    
    @Override
    public String d(final String s) {
        return this.f(s);
    }
    
    public String f(String input) {
        if (input == null) {
            return null;
        }
        input = org.apache.commons.codec.language.m.a(input);
        if (input.length() == 0) {
            return input;
        }
        input = org.apache.commons.codec.language.j.k.matcher(input).replaceFirst("MCC");
        input = org.apache.commons.codec.language.j.l.matcher(input).replaceFirst("NN");
        input = org.apache.commons.codec.language.j.m.matcher(input).replaceFirst("C");
        input = org.apache.commons.codec.language.j.n.matcher(input).replaceFirst("FF");
        input = org.apache.commons.codec.language.j.o.matcher(input).replaceFirst("SSS");
        input = org.apache.commons.codec.language.j.p.matcher(input).replaceFirst("Y");
        final String replaceFirst = org.apache.commons.codec.language.j.q.matcher(input).replaceFirst("D");
        final StringBuilder sb = new StringBuilder(replaceFirst.length());
        sb.append(replaceFirst.charAt(0));
        final char[] charArray = replaceFirst.toCharArray();
        for (int length = charArray.length, i = 1; i < length; ++i) {
            final char c = ' ';
            char c2;
            if (i < length - 1) {
                c2 = charArray[i + 1];
            }
            else {
                c2 = ' ';
            }
            char c3 = c;
            if (i < length - 2) {
                c3 = charArray[i + 2];
            }
            final int n = i - 1;
            final char[] g = g(charArray[n], charArray[i], c2, c3);
            System.arraycopy(g, 0, charArray, i, g.length);
            if (charArray[i] != charArray[n]) {
                sb.append(charArray[i]);
            }
        }
        if (sb.length() > 1) {
            char c4;
            if ((c4 = sb.charAt(sb.length() - 1)) == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                c4 = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && c4 == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (c4 == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        final String s = input = sb.toString();
        if (this.b()) {
            input = s.substring(0, Math.min(6, s.length()));
        }
        return input;
    }
}
