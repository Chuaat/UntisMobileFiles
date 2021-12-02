// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.j0;
import android.os.Bundle;

public final class w5
{
    public static <T> T a(@j0 final Bundle bundle, final String s, final Class<T> clazz, final T t) {
        final Object value = bundle.get(s);
        if (value == null) {
            return t;
        }
        if (clazz.isAssignableFrom(value.getClass())) {
            return (T)value;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", s, clazz.getCanonicalName(), value.getClass().getCanonicalName()));
    }
    
    public static void b(@j0 final Bundle bundle, @j0 final Object o) {
        if (o instanceof Double) {
            bundle.putDouble("value", (double)o);
            return;
        }
        if (o instanceof Long) {
            bundle.putLong("value", (long)o);
            return;
        }
        bundle.putString("value", o.toString());
    }
}
