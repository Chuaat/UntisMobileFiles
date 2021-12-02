// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class u0
{
    private static final Class<?> a;
    
    static {
        a = a();
    }
    
    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
    public static v0 b() {
        final Class<?> a = u0.a;
        Label_0032: {
            if (a == null) {
                break Label_0032;
            }
            try {
                return (v0)a.getDeclaredMethod("getEmptyRegistry", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                return v0.d;
            }
            catch (Exception ex) {
                return v0.d;
            }
        }
    }
}
