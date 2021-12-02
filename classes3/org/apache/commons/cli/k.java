// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

public final class k
{
    private static String a;
    private static String b;
    private static String c;
    private static boolean d = false;
    private static int e = -1;
    private static Object f;
    private static boolean g;
    private static char h;
    private static k i;
    
    static {
        k.i = new k();
    }
    
    private k() {
    }
    
    public static j a() throws IllegalArgumentException {
        if (k.a != null) {
            return c(null);
        }
        m();
        throw new IllegalArgumentException("must specify longopt");
    }
    
    public static j b(final char c) throws IllegalArgumentException {
        return c(String.valueOf(c));
    }
    
    public static j c(final String s) throws IllegalArgumentException {
        try {
            final j j = new j(s, k.b);
            j.N(k.a);
            j.P(k.d);
            j.O(k.g);
            j.J(k.e);
            j.Q(k.f);
            j.R(k.h);
            j.I(k.c);
            return j;
        }
        finally {
            m();
        }
    }
    
    public static k d() {
        k.e = 1;
        return k.i;
    }
    
    public static k e(final boolean b) {
        int e;
        if (b) {
            e = 1;
        }
        else {
            e = -1;
        }
        k.e = e;
        return k.i;
    }
    
    public static k f() {
        k.e = -2;
        return k.i;
    }
    
    public static k g(final int e) {
        k.e = e;
        return k.i;
    }
    
    public static k h() {
        k.e = 1;
        k.g = true;
        return k.i;
    }
    
    public static k i() {
        k.e = -2;
        k.g = true;
        return k.i;
    }
    
    public static k j(final int e) {
        k.e = e;
        k.g = true;
        return k.i;
    }
    
    public static k k() {
        k.d = true;
        return k.i;
    }
    
    public static k l(final boolean d) {
        k.d = d;
        return k.i;
    }
    
    private static void m() {
        k.b = null;
        k.c = "arg";
        k.a = null;
        k.f = null;
        k.d = false;
        k.e = -1;
        k.g = false;
        k.h = 0;
    }
    
    public static k n(final String c) {
        k.c = c;
        return k.i;
    }
    
    public static k o(final String b) {
        k.b = b;
        return k.i;
    }
    
    public static k p(final String a) {
        k.a = a;
        return k.i;
    }
    
    public static k q(final Object f) {
        k.f = f;
        return k.i;
    }
    
    public static k r() {
        k.h = 61;
        return k.i;
    }
    
    public static k s(final char c) {
        k.h = c;
        return k.i;
    }
}
