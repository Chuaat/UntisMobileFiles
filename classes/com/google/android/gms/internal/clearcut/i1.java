// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class i1 implements r2
{
    private static final i1 a;
    
    static {
        a = new i1();
    }
    
    private i1() {
    }
    
    public static i1 c() {
        return i1.a;
    }
    
    @Override
    public final boolean a(final Class<?> clazz) {
        return j1.class.isAssignableFrom(clazz);
    }
    
    @Override
    public final q2 b(final Class<?> clazz) {
        if (!j1.class.isAssignableFrom(clazz)) {
            final String name = clazz.getName();
            String concat;
            if (name.length() != 0) {
                concat = "Unsupported message type: ".concat(name);
            }
            else {
                concat = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(concat);
        }
        try {
            return (q2)((j1)j1.u(clazz.asSubclass(j1.class))).k(j1.g.c, null, null);
        }
        catch (Exception cause) {
            final String name2 = clazz.getName();
            String concat2;
            if (name2.length() != 0) {
                concat2 = "Unable to get message info for ".concat(name2);
            }
            else {
                concat2 = new String("Unable to get message info for ");
            }
            throw new RuntimeException(concat2, cause);
        }
    }
}
