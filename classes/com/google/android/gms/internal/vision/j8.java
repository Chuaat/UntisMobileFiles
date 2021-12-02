// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class j8
{
    private static final h8 a;
    private static final h8 b;
    
    static {
        a = c();
        b = new k8();
    }
    
    static h8 a() {
        return j8.a;
    }
    
    static h8 b() {
        return j8.b;
    }
    
    private static h8 c() {
        try {
            return (h8)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
