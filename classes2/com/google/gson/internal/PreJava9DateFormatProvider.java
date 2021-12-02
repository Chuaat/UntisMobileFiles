// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;

public class PreJava9DateFormatProvider
{
    private static String getDateFormatPattern(final int i) {
        if (i == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i == 1) {
            return "MMMM d, y";
        }
        if (i == 2) {
            return "MMM d, y";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static String getDatePartOfDateTimePattern(final int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static String getTimePartOfDateTimePattern(final int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static DateFormat getUSDateFormat(final int n) {
        return new SimpleDateFormat(getDateFormatPattern(n), Locale.US);
    }
    
    public static DateFormat getUSDateTimeFormat(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(getDatePartOfDateTimePattern(n));
        sb.append(" ");
        sb.append(getTimePartOfDateTimePattern(n2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}
