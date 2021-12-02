// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util.pool;

public final class b
{
    private static final boolean a = false;
    private static final int b = 127;
    
    private b() {
    }
    
    public static void a(final String s) {
    }
    
    public static void b(final String s, final Object o) {
    }
    
    public static void c(final String s, final Object o, final Object o2) {
    }
    
    public static void d(final String s, final Object o, final Object o2, final Object o3) {
    }
    
    public static void e() {
    }
    
    private static String f(final String s) {
        String substring = s;
        if (s.length() > 127) {
            substring = s.substring(0, 126);
        }
        return substring;
    }
}
