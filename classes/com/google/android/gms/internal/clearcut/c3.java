// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class c3
{
    private static final a3 a;
    private static final a3 b;
    
    static {
        a = c();
        b = new b3();
    }
    
    static a3 a() {
        return c3.a;
    }
    
    static a3 b() {
        return c3.b;
    }
    
    private static a3 c() {
        try {
            return (a3)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
