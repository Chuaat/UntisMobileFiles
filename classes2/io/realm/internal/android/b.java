// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.android;

import java.util.Calendar;
import java.io.Serializable;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.ParsePosition;
import java.util.TimeZone;

public class b
{
    private static final String a = "UTC";
    private static final TimeZone b;
    private static final TimeZone c;
    
    static {
        c = (b = TimeZone.getTimeZone("UTC"));
    }
    
    private static boolean a(final String s, final int index, final char c) {
        return index < s.length() && s.charAt(index) == c;
    }
    
    private static int b(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 < '0' || char1 > '9') {
                return i;
            }
            ++i;
        }
        return s.length();
    }
    
    public static Date c(String string, final ParsePosition parsePosition) throws ParseException {
        Serializable cause = null;
        try {
            final int index = parsePosition.getIndex();
            final int n = index + 4;
            final int d = d(string, index, n);
            int n2 = n;
            if (a(string, n, '-')) {
                n2 = n + 1;
            }
            final int n3 = n2 + 2;
            final int d2 = d(string, n2, n3);
            int n4 = n3;
            if (a(string, n3, '-')) {
                n4 = n3 + 1;
            }
            int index2 = n4 + 2;
            final int d3 = d(string, n4, index2);
            final boolean a = a(string, index2, 'T');
            if (!a && string.length() <= index2) {
                cause = new GregorianCalendar(d, d2 - 1, d3);
                parsePosition.setIndex(index2);
                return ((Calendar)cause).getTime();
            }
            int d5 = 0;
            int n9 = 0;
            int value = 0;
            int value2 = 0;
            int value3 = 0;
            Label_0397: {
                int n14;
                if (a) {
                    final int n5 = index2 + 1;
                    final int n6 = n5 + 2;
                    final int d4 = d(string, n5, n6);
                    int n7 = n6;
                    if (a(string, n6, ':')) {
                        n7 = n6 + 1;
                    }
                    final int n8 = n7 + 2;
                    d5 = d(string, n7, n8);
                    int index3 = n8;
                    if (a(string, n8, ':')) {
                        index3 = n8 + 1;
                    }
                    if (string.length() > index3) {
                        final char char1 = string.charAt(index3);
                        if (char1 != 'Z' && char1 != '+' && char1 != '-') {
                            n9 = index3 + 2;
                            int d6;
                            final int n10 = d6 = d(string, index3, n9);
                            if (n10 > 59 && (d6 = n10) < 63) {
                                d6 = 59;
                            }
                            if (a(string, n9, '.')) {
                                final int n11 = n9 + 1;
                                final int b = b(string, n11 + 1);
                                final int min = Math.min(b, n11 + 3);
                                int d7 = d(string, n11, min);
                                final int n12 = min - n11;
                                if (n12 != 1) {
                                    if (n12 == 2) {
                                        d7 *= 10;
                                    }
                                }
                                else {
                                    d7 *= 100;
                                }
                                final int n13 = d4;
                                value = d7;
                                value2 = n13;
                                n9 = b;
                                value3 = d6;
                                break Label_0397;
                            }
                            value2 = d4;
                            value = 0;
                            value3 = d6;
                            break Label_0397;
                        }
                    }
                    index2 = index3;
                    value2 = d4;
                    n14 = d5;
                }
                else {
                    value2 = 0;
                    n14 = 0;
                }
                value = 0;
                value3 = 0;
                d5 = n14;
                n9 = index2;
            }
            if (string.length() > n9) {
                final char char2 = string.charAt(n9);
                int index4;
                if (char2 == 'Z') {
                    cause = io.realm.internal.android.b.c;
                    index4 = n9 + 1;
                }
                else {
                    if (char2 != '+' && char2 != '-') {
                        cause = new StringBuilder();
                        ((StringBuilder)cause).append("Invalid time zone indicator '");
                        ((StringBuilder)cause).append(char2);
                        ((StringBuilder)cause).append("'");
                        throw new IndexOutOfBoundsException(((StringBuilder)cause).toString());
                    }
                    final String substring = string.substring(n9);
                    index4 = n9 + substring.length();
                    cause = substring;
                    if (substring.length() == 3) {
                        cause = new StringBuilder();
                        ((StringBuilder)cause).append(substring);
                        ((StringBuilder)cause).append("00");
                        cause = ((StringBuilder)cause).toString();
                    }
                    if (!"+0000".equals(cause) && !"+00:00".equals(cause)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("GMT");
                        sb.append((String)cause);
                        final String string2 = sb.toString();
                        cause = TimeZone.getTimeZone(string2);
                        final String id = ((TimeZone)cause).getID();
                        if (!id.equals(string2) && !id.replace(":", "").equals(string2)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Mismatching time zone indicator: ");
                            sb2.append(string2);
                            sb2.append(" given, resolves to ");
                            sb2.append(((TimeZone)cause).getID());
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                    }
                    else {
                        cause = io.realm.internal.android.b.c;
                    }
                }
                final GregorianCalendar gregorianCalendar = new GregorianCalendar((TimeZone)cause);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, d);
                gregorianCalendar.set(2, d2 - 1);
                gregorianCalendar.set(5, d3);
                gregorianCalendar.set(11, value2);
                gregorianCalendar.set(12, d5);
                gregorianCalendar.set(13, value3);
                gregorianCalendar.set(14, value);
                parsePosition.setIndex(index4);
                return gregorianCalendar.getTime();
            }
            cause = new IllegalArgumentException("No time zone indicator");
            throw cause;
        }
        catch (IllegalArgumentException cause) {}
        catch (NumberFormatException cause) {}
        catch (IndexOutOfBoundsException ex2) {}
        if (string == null) {
            string = null;
        }
        else {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append('\"');
            sb3.append(string);
            sb3.append("'");
            string = sb3.toString();
        }
        final String message = ((Throwable)cause).getMessage();
        String string3 = null;
        Label_0971: {
            if (message != null) {
                string3 = message;
                if (!message.isEmpty()) {
                    break Label_0971;
                }
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("(");
            sb4.append(((IllegalArgumentException)cause).getClass().getName());
            sb4.append(")");
            string3 = sb4.toString();
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("Failed to parse date [");
        sb5.append(string);
        sb5.append("]: ");
        sb5.append(string3);
        final ParseException ex = new ParseException(sb5.toString(), parsePosition.getIndex());
        ex.initCause((Throwable)cause);
        throw ex;
    }
    
    private static int d(final String s, final int beginIndex, final int n) throws NumberFormatException {
        if (beginIndex >= 0 && n <= s.length() && beginIndex <= n) {
            int i;
            int n2;
            if (beginIndex < n) {
                i = beginIndex + 1;
                final int digit = Character.digit(s.charAt(beginIndex), 10);
                if (digit < 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid number: ");
                    sb.append(s.substring(beginIndex, n));
                    throw new NumberFormatException(sb.toString());
                }
                n2 = -digit;
            }
            else {
                i = beginIndex;
                n2 = 0;
            }
            while (i < n) {
                final int digit2 = Character.digit(s.charAt(i), 10);
                if (digit2 < 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid number: ");
                    sb2.append(s.substring(beginIndex, n));
                    throw new NumberFormatException(sb2.toString());
                }
                n2 = n2 * 10 - digit2;
                ++i;
            }
            return -n2;
        }
        throw new NumberFormatException(s);
    }
}
