// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Objects;

public final class p
{
    private p() {
    }
    
    public static <T> void a(final T t, final Class<T> clazz) {
        if (t != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(clazz.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
    
    public static <T> T b(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    public static <T> T c(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    public static <T> T d(final T t, final String s, final Object obj) {
        if (t != null) {
            return t;
        }
        if (!s.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (s.indexOf("%s") == s.lastIndexOf("%s")) {
            String replacement;
            if (obj instanceof Class) {
                replacement = ((Class)obj).getCanonicalName();
            }
            else {
                replacement = String.valueOf(obj);
            }
            throw new NullPointerException(s.replace("%s", replacement));
        }
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    }
}
