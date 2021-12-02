// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class q6 implements a8
{
    private static final q6 a;
    
    static {
        a = new q6();
    }
    
    private q6() {
    }
    
    public static q6 c() {
        return q6.a;
    }
    
    @Override
    public final boolean a(final Class<?> clazz) {
        return p6.class.isAssignableFrom(clazz);
    }
    
    @Override
    public final x7 b(final Class<?> clazz) {
        if (!p6.class.isAssignableFrom(clazz)) {
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
            return (x7)((p6)p6.t(clazz.asSubclass(p6.class))).v(p6.g.c, null, null);
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
