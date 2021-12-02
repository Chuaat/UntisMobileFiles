// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.android;

import c6.h;
import java.util.regex.Matcher;
import java.text.ParseException;
import io.realm.exceptions.RealmException;
import java.util.Date;
import android.util.Base64;
import java.text.ParsePosition;
import java.util.regex.Pattern;

public class c
{
    private static Pattern a;
    private static Pattern b;
    private static ParsePosition c;
    
    static {
        io.realm.internal.android.c.a = Pattern.compile("/Date\\((\\d*)(?:[+-]\\d*)?\\)/");
        io.realm.internal.android.c.b = Pattern.compile("-?\\d+");
        io.realm.internal.android.c.c = new ParsePosition(0);
    }
    
    public static byte[] a(final String s) {
        if (s != null && s.length() != 0) {
            return Base64.decode(s, 0);
        }
        return new byte[0];
    }
    
    @h
    public static Date b(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                final Matcher matcher = io.realm.internal.android.c.a.matcher(s);
                if (matcher.find()) {
                    return new Date(Long.parseLong(matcher.group(1)));
                }
                if (io.realm.internal.android.c.b.matcher(s).matches()) {
                    try {
                        return new Date(Long.parseLong(s));
                    }
                    catch (NumberFormatException ex) {
                        throw new RealmException(ex.getMessage(), ex);
                    }
                }
                try {
                    io.realm.internal.android.c.c.setIndex(0);
                    return io.realm.internal.android.b.c(s, io.realm.internal.android.c.c);
                }
                catch (ParseException ex2) {
                    throw new RealmException(ex2.getMessage(), ex2);
                }
            }
        }
        return null;
    }
}
