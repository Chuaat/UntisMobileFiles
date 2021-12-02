// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

public final class t
{
    private final Class<?> a;
    private final int b;
    private final int c;
    
    private t(final Class<?> clazz, final int b, final int c) {
        this.a = g0.c(clazz, "Null dependency anInterface.");
        this.b = b;
        this.c = c;
    }
    
    public static t a(final Class<?> clazz) {
        return new t(clazz, 0, 2);
    }
    
    private static String b(final int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported injection: ");
        sb.append(i);
        throw new AssertionError((Object)sb.toString());
    }
    
    @Deprecated
    public static t h(final Class<?> clazz) {
        return new t(clazz, 0, 0);
    }
    
    public static t i(final Class<?> clazz) {
        return new t(clazz, 0, 1);
    }
    
    public static t j(final Class<?> clazz) {
        return new t(clazz, 1, 0);
    }
    
    public static t k(final Class<?> clazz) {
        return new t(clazz, 1, 1);
    }
    
    public static t l(final Class<?> clazz) {
        return new t(clazz, 2, 0);
    }
    
    public static t m(final Class<?> clazz) {
        return new t(clazz, 2, 1);
    }
    
    public Class<?> c() {
        return this.a;
    }
    
    public boolean d() {
        return this.c == 2;
    }
    
    public boolean e() {
        return this.c == 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof t;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final t t = (t)o;
            b3 = b2;
            if (this.a == t.a) {
                b3 = b2;
                if (this.b == t.b) {
                    b3 = b2;
                    if (this.c == t.c) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public boolean f() {
        final int b = this.b;
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        return b2;
    }
    
    public boolean g() {
        return this.b == 2;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        final int b = this.b;
        String str;
        if (b == 1) {
            str = "required";
        }
        else if (b == 0) {
            str = "optional";
        }
        else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }
}
