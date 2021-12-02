// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class z0
{
    private static final w0<?> a;
    private static final w0<?> b;
    
    static {
        a = new x0();
        b = a();
    }
    
    private static w0<?> a() {
        try {
            return (w0<?>)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    static w0<?> b() {
        return z0.a;
    }
    
    static w0<?> c() {
        final w0<?> b = z0.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
