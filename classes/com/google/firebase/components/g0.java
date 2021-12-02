// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Objects;

public final class g0
{
    public static void a(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static <T> T b(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    public static <T> T c(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    public static void d(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
}
