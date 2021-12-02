// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class x
{
    private static final Class<?> a;
    private static final boolean b;
    
    static {
        a = a("libcore.io.Memory");
        b = (a("org.robolectric.Robolectric") != null);
    }
    
    private static <T> Class<T> a(final String className) {
        try {
            return (Class<T>)Class.forName(className);
        }
        finally {
            return null;
        }
    }
    
    static boolean b() {
        return x.a != null && !x.b;
    }
    
    static Class<?> c() {
        return x.a;
    }
}
