// 
// Decompiled by Procyon v0.5.36
// 

package z1;

import android.util.Log;

public final class a
{
    private a() {
    }
    
    public static void a(final String s, final String s2) {
        Log.d(f(s), s2);
    }
    
    public static void b(final String s, final String format, final Object o) {
        Log.d(f(s), String.format(format, o));
    }
    
    public static void c(final String s, final String format, final Object o, final Object o2) {
        Log.d(f(s), String.format(format, o, o2));
    }
    
    public static void d(final String s, final String format, final Object... args) {
        Log.d(f(s), String.format(format, args));
    }
    
    public static void e(final String s, final String s2, final Throwable t) {
        Log.e(f(s), s2, t);
    }
    
    private static String f(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("TransportRuntime.");
        sb.append(str);
        return sb.toString();
    }
    
    public static void g(final String s, final String s2) {
        Log.i(f(s), s2);
    }
    
    public static void h(final String s, final String format, final Object o) {
        Log.w(f(s), String.format(format, o));
    }
}
