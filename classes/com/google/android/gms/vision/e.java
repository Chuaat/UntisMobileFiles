// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class e
{
    @RecentlyNonNull
    @a
    public static final String a = "Vision";
    
    @a
    public static int a(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (Log.isLoggable("Vision", 3)) {
            return Log.d("Vision", String.format(format, args));
        }
        return 0;
    }
    
    @a
    public static int b(@RecentlyNonNull final Throwable t, @RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (Log.isLoggable("Vision", 3)) {
            return Log.d("Vision", String.format(format, args), t);
        }
        return 0;
    }
    
    @a
    public static int c(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (Log.isLoggable("Vision", 6)) {
            return Log.e("Vision", String.format(format, args));
        }
        return 0;
    }
    
    @SuppressLint({ "LogTagMismatch" })
    @a
    public static int d(@RecentlyNonNull final Throwable obj, @RecentlyNonNull String format, @RecentlyNonNull final Object... args) {
        if (!Log.isLoggable("Vision", 6)) {
            return 0;
        }
        final boolean loggable = Log.isLoggable("Vision", 3);
        format = String.format(format, args);
        if (loggable) {
            return Log.e("Vision", format, obj);
        }
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + value.length());
        sb.append(format);
        sb.append(": ");
        sb.append(value);
        return Log.e("Vision", sb.toString());
    }
    
    @a
    public static int e(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (Log.isLoggable("Vision", 4)) {
            return Log.i("Vision", String.format(format, args));
        }
        return 0;
    }
    
    @a
    public static int f(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (Log.isLoggable("Vision", 2)) {
            return Log.v("Vision", String.format(format, args));
        }
        return 0;
    }
    
    @a
    public static int g(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (Log.isLoggable("Vision", 5)) {
            return Log.w("Vision", String.format(format, args));
        }
        return 0;
    }
    
    @SuppressLint({ "LogTagMismatch" })
    @a
    public static int h(@RecentlyNonNull final Throwable obj, @RecentlyNonNull String format, @RecentlyNonNull final Object... args) {
        if (!Log.isLoggable("Vision", 5)) {
            return 0;
        }
        final boolean loggable = Log.isLoggable("Vision", 3);
        format = String.format(format, args);
        if (loggable) {
            return Log.w("Vision", format, obj);
        }
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + value.length());
        sb.append(format);
        sb.append(": ");
        sb.append(value);
        return Log.w("Vision", sb.toString());
    }
}
