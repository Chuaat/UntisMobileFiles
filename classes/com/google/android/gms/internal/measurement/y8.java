// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class y8
{
    private static final w8<?> a;
    private static final w8<?> b;
    
    static {
        a = new x8();
        w8<?> b2;
        try {
            b2 = (w8<?>)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            b2 = null;
        }
        b = b2;
    }
    
    static w8<?> a() {
        final w8<?> b = y8.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    
    static w8<?> b() {
        return y8.a;
    }
}
