// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class e9 implements qa
{
    private static final e9 a;
    
    static {
        a = new e9();
    }
    
    private e9() {
    }
    
    public static e9 c() {
        return e9.a;
    }
    
    @Override
    public final boolean a(final Class<?> clazz) {
        return j9.class.isAssignableFrom(clazz);
    }
    
    @Override
    public final pa b(final Class<?> clazz) {
        if (!j9.class.isAssignableFrom(clazz)) {
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
            return (pa)((j9)j9.q(clazz.asSubclass(j9.class))).u(3, null, null);
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
