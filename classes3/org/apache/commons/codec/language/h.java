// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.k;

public class h implements k
{
    private static final String a = " ";
    private static final String b = "";
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 6;
    private static final int i = 7;
    private static final int j = 11;
    private static final int k = 12;
    private static final String l = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final String m = "\u00c0\u00e0\u00c8\u00e8\u00cc\u00ec\u00d2\u00f2\u00d9\u00f9\u00c1\u00e1\u00c9\u00e9\u00cd\u00ed\u00d3\u00f3\u00da\u00fa\u00dd\u00fd\u00c2\u00e2\u00ca\u00ea\u00ce\u00ee\u00d4\u00f4\u00db\u00fb\u0176\u0177\u00c3\u00e3\u00d5\u00f5\u00d1\u00f1\u00c4\u00e4\u00cb\u00eb\u00cf\u00ef\u00d6\u00f6\u00dc\u00fc\u0178\u00ff\u00c5\u00e5\u00c7\u00e7\u0150\u0151\u0170\u0171";
    private static final String[] n;
    
    static {
        n = new String[] { "BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ" };
    }
    
    @Override
    public final Object a(final Object o) throws org.apache.commons.codec.h {
        if (o instanceof String) {
            return this.d((String)o);
        }
        throw new org.apache.commons.codec.h("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }
    
    String b(String s) {
        s = s.toUpperCase(Locale.ENGLISH);
        for (int i = 0; i < 5; ++i) {
            s = s.replaceAll((new String[] { "\\-", "[&]", "\\'", "\\.", "[\\,]" })[i], "");
        }
        return this.j(s).replaceAll("\\s+", "");
    }
    
    String c(String substring) {
        final int length = substring.length();
        String string = substring;
        if (length > 6) {
            final String substring2 = substring.substring(0, 3);
            substring = substring.substring(length - 3, length);
            final StringBuilder sb = new StringBuilder();
            sb.append(substring2);
            sb.append(substring);
            string = sb.toString();
        }
        return string;
    }
    
    @Override
    public final String d(final String s) {
        if (s != null && !"".equalsIgnoreCase(s) && !" ".equalsIgnoreCase(s) && s.length() != 1) {
            return this.c(this.k(this.l(this.b(s))));
        }
        return "";
    }
    
    int f(int n) {
        final int n2 = 4;
        if (n <= 4) {
            n = 5;
        }
        else if (n <= 7) {
            n = n2;
        }
        else if (n <= 11) {
            n = 3;
        }
        else if (n == 12) {
            n = 2;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public boolean g(String s, String anotherString) {
        boolean b2;
        final boolean b = b2 = false;
        if (s != null) {
            b2 = b;
            if (!"".equalsIgnoreCase(s)) {
                if (" ".equalsIgnoreCase(s)) {
                    b2 = b;
                }
                else {
                    b2 = b;
                    if (anotherString != null) {
                        b2 = b;
                        if (!"".equalsIgnoreCase(anotherString)) {
                            if (" ".equalsIgnoreCase(anotherString)) {
                                b2 = b;
                            }
                            else {
                                b2 = b;
                                if (s.length() != 1) {
                                    if (anotherString.length() == 1) {
                                        b2 = b;
                                    }
                                    else {
                                        if (s.equalsIgnoreCase(anotherString)) {
                                            return true;
                                        }
                                        s = this.b(s);
                                        anotherString = this.b(anotherString);
                                        s = this.l(s);
                                        anotherString = this.l(anotherString);
                                        s = this.k(s);
                                        anotherString = this.k(anotherString);
                                        s = this.c(s);
                                        anotherString = this.c(anotherString);
                                        if (Math.abs(s.length() - anotherString.length()) >= 3) {
                                            return false;
                                        }
                                        final int f = this.f(Math.abs(s.length() + anotherString.length()));
                                        b2 = b;
                                        if (this.i(s, anotherString) >= f) {
                                            b2 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    boolean h(final String s) {
        return s.equalsIgnoreCase("E") || s.equalsIgnoreCase("A") || s.equalsIgnoreCase("O") || s.equalsIgnoreCase("I") || s.equalsIgnoreCase("U");
    }
    
    int i(String replaceAll, String replaceAll2) {
        final char[] charArray = replaceAll.toCharArray();
        final char[] charArray2 = replaceAll2.toCharArray();
        final int length = replaceAll.length();
        int n3;
        for (int n = replaceAll2.length() - 1, n2 = 0; n2 < charArray.length && n2 <= n; n2 = n3) {
            n3 = n2 + 1;
            final String substring = replaceAll.substring(n2, n3);
            final int beginIndex = length - 1 - n2;
            final String substring2 = replaceAll.substring(beginIndex, beginIndex + 1);
            final String substring3 = replaceAll2.substring(n2, n3);
            final int beginIndex2 = n - n2;
            final String substring4 = replaceAll2.substring(beginIndex2, beginIndex2 + 1);
            if (substring.equals(substring3)) {
                charArray[n2] = 32;
                charArray2[n2] = 32;
            }
            if (substring2.equals(substring4)) {
                charArray[beginIndex] = 32;
                charArray2[beginIndex2] = 32;
            }
        }
        replaceAll = new String(charArray).replaceAll("\\s+", "");
        replaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        int n4;
        if (replaceAll.length() > replaceAll2.length()) {
            n4 = replaceAll.length();
        }
        else {
            n4 = replaceAll2.length();
        }
        return Math.abs(6 - n4);
    }
    
    String j(final String s) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            final int index = "\u00c0\u00e0\u00c8\u00e8\u00cc\u00ec\u00d2\u00f2\u00d9\u00f9\u00c1\u00e1\u00c9\u00e9\u00cd\u00ed\u00d3\u00f3\u00da\u00fa\u00dd\u00fd\u00c2\u00e2\u00ca\u00ea\u00ce\u00ee\u00d4\u00f4\u00db\u00fb\u0176\u0177\u00c3\u00e3\u00d5\u00f5\u00d1\u00f1\u00c4\u00e4\u00cb\u00eb\u00cf\u00ef\u00d6\u00f6\u00dc\u00fc\u0178\u00ff\u00c5\u00e5\u00c7\u00e7\u0150\u0151\u0170\u0171".indexOf(char1);
            char char2 = char1;
            if (index > -1) {
                char2 = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu".charAt(index);
            }
            sb.append(char2);
        }
        return sb.toString();
    }
    
    String k(String upperCase) {
        upperCase = upperCase.toUpperCase(Locale.ENGLISH);
        final String[] n = org.apache.commons.codec.language.h.n;
        String replace;
        for (int length = n.length, i = 0; i < length; ++i, upperCase = replace) {
            final String s = n[i];
            replace = upperCase;
            if (upperCase.contains(s)) {
                replace = upperCase.replace(s, s.substring(0, 1));
            }
        }
        return upperCase;
    }
    
    String l(String s) {
        final String substring = s.substring(0, 1);
        final String str = s = s.replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "").replaceAll("\\s{2,}\\b", " ");
        if (this.h(substring)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append(str);
            s = sb.toString();
        }
        return s;
    }
}
