// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class p2
{
    private static final n2 a;
    private static final n2 b;
    
    static {
        a = c();
        b = new o2();
    }
    
    static n2 a() {
        return p2.a;
    }
    
    static n2 b() {
        return p2.b;
    }
    
    private static n2 c() {
        try {
            return (n2)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
