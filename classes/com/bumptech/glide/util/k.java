// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import java.util.Objects;
import java.util.Collection;
import android.text.TextUtils;
import androidx.annotation.k0;
import androidx.annotation.j0;

public final class k
{
    private k() {
    }
    
    public static void a(final boolean b, @j0 final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    @j0
    public static String b(@k0 final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
    
    @j0
    public static <T extends Collection<Y>, Y> T c(@j0 final T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
    
    @j0
    public static <T> T d(@k0 final T t) {
        return e(t, "Argument must not be null");
    }
    
    @j0
    public static <T> T e(@k0 final T obj, @j0 final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
}
