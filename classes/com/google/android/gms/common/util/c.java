// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public final class c
{
    @RecentlyNonNull
    @a
    public static byte[] a(@RecentlyNonNull final String s) {
        if (s == null) {
            return null;
        }
        return Base64.decode(s, 0);
    }
    
    @RecentlyNonNull
    @a
    public static byte[] b(@RecentlyNonNull final String s) {
        if (s == null) {
            return null;
        }
        return Base64.decode(s, 10);
    }
    
    @RecentlyNonNull
    @a
    public static byte[] c(@RecentlyNonNull final String s) {
        if (s == null) {
            return null;
        }
        return Base64.decode(s, 11);
    }
    
    @RecentlyNonNull
    @a
    public static String d(@RecentlyNonNull final byte[] array) {
        if (array == null) {
            return null;
        }
        return Base64.encodeToString(array, 0);
    }
    
    @RecentlyNonNull
    @a
    public static String e(@RecentlyNonNull final byte[] array) {
        if (array == null) {
            return null;
        }
        return Base64.encodeToString(array, 10);
    }
    
    @RecentlyNonNull
    @a
    public static String f(@RecentlyNonNull final byte[] array) {
        if (array == null) {
            return null;
        }
        return Base64.encodeToString(array, 11);
    }
}
