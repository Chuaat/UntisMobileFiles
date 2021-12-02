// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal.bind.util;

import java.util.Calendar;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Date;
import java.util.TimeZone;

public class ISO8601Utils
{
    private static final TimeZone TIMEZONE_UTC;
    private static final String UTC_ID = "UTC";
    
    static {
        TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
    }
    
    private static boolean checkOffset(final String s, final int index, final char c) {
        return index < s.length() && s.charAt(index) == c;
    }
    
    public static String format(final Date date) {
        return format(date, false, ISO8601Utils.TIMEZONE_UTC);
    }
    
    public static String format(final Date date, final boolean b) {
        return format(date, b, ISO8601Utils.TIMEZONE_UTC);
    }
    
    public static String format(final Date time, final boolean b, final TimeZone zone) {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(zone, Locale.US);
        gregorianCalendar.setTime(time);
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        int n2;
        if (zone.getRawOffset() == 0) {
            n2 = 1;
        }
        else {
            n2 = 6;
        }
        final StringBuilder sb = new StringBuilder(19 + n + n2);
        padInt(sb, gregorianCalendar.get(1), 4);
        final char c = '-';
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (b) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        final int offset = zone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            final int n3 = offset / 60000;
            final int abs = Math.abs(n3 / 60);
            final int abs2 = Math.abs(n3 % 60);
            char c2;
            if (offset < 0) {
                c2 = c;
            }
            else {
                c2 = '+';
            }
            sb.append(c2);
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        }
        else {
            sb.append('Z');
        }
        return sb.toString();
    }
    
    private static int indexOfNonDigit(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 < '0' || char1 > '9') {
                return i;
            }
            ++i;
        }
        return s.length();
    }
    
    private static void padInt(final StringBuilder sb, int i, final int n) {
        final String string = Integer.toString(i);
        for (i = n - string.length(); i > 0; --i) {
            sb.append('0');
        }
        sb.append(string);
    }
    
    public static Date parse(String string, final ParsePosition parsePosition) throws ParseException {
        Serializable s = null;
        try {
            final int index = parsePosition.getIndex();
            final int n = index + 4;
            final int int1 = parseInt(string, index, n);
            int n2 = n;
            if (checkOffset(string, n, '-')) {
                n2 = n + 1;
            }
            final int n3 = n2 + 2;
            final int int2 = parseInt(string, n2, n3);
            int n4 = n3;
            if (checkOffset(string, n3, '-')) {
                n4 = n3 + 1;
            }
            int indexOfNonDigit = n4 + 2;
            final int int3 = parseInt(string, n4, indexOfNonDigit);
            final boolean checkOffset = checkOffset(string, indexOfNonDigit, 'T');
            if (!checkOffset && string.length() <= indexOfNonDigit) {
                s = new GregorianCalendar(int1, int2 - 1, int3);
                parsePosition.setIndex(indexOfNonDigit);
                return ((Calendar)s).getTime();
            }
            int int6 = 0;
            int value = 0;
            int value2 = 0;
            int value3 = 0;
            Label_0408: {
                if (checkOffset) {
                    final int n5 = indexOfNonDigit + 1;
                    final int n6 = n5 + 2;
                    final int int4 = parseInt(string, n5, n6);
                    int n7 = n6;
                    if (checkOffset(string, n6, ':')) {
                        n7 = n6 + 1;
                    }
                    final int n8 = n7 + 2;
                    final int int5 = parseInt(string, n7, n8);
                    int index2 = n8;
                    if (checkOffset(string, n8, ':')) {
                        index2 = n8 + 1;
                    }
                    if (string.length() > index2) {
                        final char char1 = string.charAt(index2);
                        if (char1 != 'Z' && char1 != '+' && char1 != '-') {
                            indexOfNonDigit = index2 + 2;
                            final int n9 = int6 = parseInt(string, index2, indexOfNonDigit);
                            if (n9 > 59 && (int6 = n9) < 63) {
                                int6 = 59;
                            }
                            if (checkOffset(string, indexOfNonDigit, '.')) {
                                final int n10 = indexOfNonDigit + 1;
                                indexOfNonDigit = indexOfNonDigit(string, n10 + 1);
                                final int min = Math.min(indexOfNonDigit, n10 + 3);
                                int int7 = parseInt(string, n10, min);
                                final int n11 = min - n10;
                                if (n11 != 1) {
                                    if (n11 == 2) {
                                        int7 *= 10;
                                    }
                                }
                                else {
                                    int7 *= 100;
                                }
                                final int n12 = int5;
                                value = int7;
                                value2 = int4;
                                value3 = n12;
                                break Label_0408;
                            }
                            value2 = int4;
                            final int n13 = 0;
                            value3 = int5;
                            value = n13;
                            break Label_0408;
                        }
                    }
                    indexOfNonDigit = index2;
                    value2 = int4;
                    value3 = int5;
                }
                else {
                    value2 = 0;
                    value3 = 0;
                }
                value = 0;
                int6 = 0;
            }
            if (string.length() > indexOfNonDigit) {
                final char char2 = string.charAt(indexOfNonDigit);
                if (char2 == 'Z') {
                    s = ISO8601Utils.TIMEZONE_UTC;
                    ++indexOfNonDigit;
                }
                else {
                    if (char2 != '+' && char2 != '-') {
                        s = new(java.lang.IndexOutOfBoundsException.class);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid time zone indicator '");
                        sb.append(char2);
                        sb.append("'");
                        new IndexOutOfBoundsException(sb.toString());
                        throw s;
                    }
                    s = string.substring(indexOfNonDigit);
                    if (((String)s).length() < 5) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append((String)s);
                        sb2.append("00");
                        s = sb2.toString();
                    }
                    indexOfNonDigit += ((String)s).length();
                    if (!"+0000".equals(s) && !"+00:00".equals(s)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("GMT");
                        sb3.append((String)s);
                        final String string2 = sb3.toString();
                        s = TimeZone.getTimeZone(string2);
                        final String id = ((TimeZone)s).getID();
                        if (!id.equals(string2) && !id.replace(":", "").equals(string2)) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Mismatching time zone indicator: ");
                            sb4.append(string2);
                            sb4.append(" given, resolves to ");
                            sb4.append(((TimeZone)s).getID());
                            throw new IndexOutOfBoundsException(sb4.toString());
                        }
                    }
                    else {
                        s = ISO8601Utils.TIMEZONE_UTC;
                    }
                }
                final GregorianCalendar gregorianCalendar = new GregorianCalendar((TimeZone)s);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, int1);
                gregorianCalendar.set(2, int2 - 1);
                gregorianCalendar.set(5, int3);
                gregorianCalendar.set(11, value2);
                gregorianCalendar.set(12, value3);
                gregorianCalendar.set(13, int6);
                gregorianCalendar.set(14, value);
                parsePosition.setIndex(indexOfNonDigit);
                return gregorianCalendar.getTime();
            }
            s = new IllegalArgumentException("No time zone indicator");
            throw s;
        }
        catch (IllegalArgumentException s) {}
        catch (NumberFormatException s) {}
        catch (IndexOutOfBoundsException ex2) {}
        if (string == null) {
            string = null;
        }
        else {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append('\"');
            sb5.append(string);
            sb5.append('\"');
            string = sb5.toString();
        }
        final String message = ((Throwable)s).getMessage();
        String string3 = null;
        Label_0980: {
            if (message != null) {
                string3 = message;
                if (!message.isEmpty()) {
                    break Label_0980;
                }
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("(");
            sb6.append(((IllegalArgumentException)s).getClass().getName());
            sb6.append(")");
            string3 = sb6.toString();
        }
        final StringBuilder sb7 = new StringBuilder();
        sb7.append("Failed to parse date [");
        sb7.append(string);
        sb7.append("]: ");
        sb7.append(string3);
        final ParseException ex = new ParseException(sb7.toString(), parsePosition.getIndex());
        ex.initCause((Throwable)s);
        throw ex;
    }
    
    private static int parseInt(final String s, final int beginIndex, final int n) throws NumberFormatException {
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
