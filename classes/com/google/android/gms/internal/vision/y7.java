// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class y7
{
    private static final w7 a;
    private static final w7 b;
    
    static {
        a = c();
        b = new v7();
    }
    
    static w7 a() {
        return y7.a;
    }
    
    static w7 b() {
        return y7.b;
    }
    
    private static w7 c() {
        try {
            return (w7)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
