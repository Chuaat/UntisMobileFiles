// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class u4
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
        return u4.a != null && !u4.b;
    }
    
    static Class<?> c() {
        return u4.a;
    }
}
