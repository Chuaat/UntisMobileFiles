// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class e6
{
    private static final d6<?> a;
    private static final d6<?> b;
    
    static {
        a = new c6();
        b = c();
    }
    
    static d6<?> a() {
        return e6.a;
    }
    
    static d6<?> b() {
        final d6<?> b = e6.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    
    private static d6<?> c() {
        try {
            return (d6<?>)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
