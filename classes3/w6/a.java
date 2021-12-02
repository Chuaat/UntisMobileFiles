// 
// Decompiled by Procyon v0.5.36
// 

package w6;

import java.util.Objects;
import java.util.Iterator;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class a
{
    @e
    public static final String a(@e final String s) {
        k0.p((Object)s, "<this>");
        final int length = s.length();
        final boolean b = false;
        if (length == 0) {
            return s;
        }
        final char char1 = s.charAt(0);
        int n = b ? 1 : 0;
        if ('a' <= char1) {
            n = (b ? 1 : 0);
            if (char1 <= 'z') {
                n = 1;
            }
        }
        String string = s;
        if (n != 0) {
            final char upperCase = Character.toUpperCase(char1);
            final String substring = s.substring(1);
            k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
            final StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(upperCase));
            sb.append(substring);
            string = sb.toString();
        }
        return string;
    }
    
    @e
    public static final String b(@e final String s) {
        k0.p((Object)s, "<this>");
        final int length = s.length();
        final boolean b = false;
        if (length == 0) {
            return s;
        }
        final char char1 = s.charAt(0);
        int n = b ? 1 : 0;
        if ('A' <= char1) {
            n = (b ? 1 : 0);
            if (char1 <= 'Z') {
                n = 1;
            }
        }
        String string = s;
        if (n != 0) {
            final char lowerCase = Character.toLowerCase(char1);
            final String substring = s.substring(1);
            k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
            final StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(lowerCase));
            sb.append(substring);
            string = sb.toString();
        }
        return string;
    }
    
    @e
    public static final String c(@e String substring, final boolean b) {
        k0.p((Object)substring, "<this>");
        final boolean b2 = substring.length() == 0;
        String s = substring;
        if (!b2) {
            if (!d(substring, 0, b)) {
                s = substring;
            }
            else {
                if (substring.length() != 1 && d(substring, 1, b)) {
                    while (true) {
                        for (final Integer next : kotlin.text.s.h3(substring)) {
                            if (d(substring, next.intValue(), b) ^ true) {
                                final Integer n = next;
                                if (n == null) {
                                    return e(substring, b);
                                }
                                final int n2 = n - 1;
                                final String substring2 = substring.substring(0, n2);
                                k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                final String e = e(substring2, b);
                                substring = substring.substring(n2);
                                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                                return k0.C(e, (Object)substring);
                            }
                        }
                        Integer next = null;
                        continue;
                    }
                }
                if (b) {
                    s = b(substring);
                }
                else {
                    s = kotlin.text.s.A1(substring);
                }
            }
        }
        return s;
    }
    
    private static final boolean d(final String s, final int index, final boolean b) {
        final char char1 = s.charAt(index);
        final boolean b2 = false;
        boolean upperCase;
        if (b) {
            upperCase = b2;
            if ('A' <= char1) {
                upperCase = b2;
                if (char1 <= 'Z') {
                    upperCase = true;
                }
            }
        }
        else {
            upperCase = Character.isUpperCase(char1);
        }
        return upperCase;
    }
    
    private static final String e(String obj, final boolean b) {
        if (b) {
            obj = f(obj);
        }
        else {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            obj = obj.toLowerCase();
            k0.o((Object)obj, "(this as java.lang.String).toLowerCase()");
        }
        return obj;
    }
    
    @e
    public static final String f(@e String string) {
        k0.p((Object)string, "<this>");
        final StringBuilder sb = new StringBuilder(string.length());
        int n;
        for (int length = string.length(), i = 0; i < length; i = n) {
            final char char1 = string.charAt(i);
            n = i + 1;
            final boolean b = 'A' <= char1 && char1 <= 'Z';
            char lowerCase = char1;
            if (b) {
                lowerCase = Character.toLowerCase(char1);
            }
            sb.append(lowerCase);
        }
        string = sb.toString();
        k0.o((Object)string, "builder.toString()");
        return string;
    }
}
