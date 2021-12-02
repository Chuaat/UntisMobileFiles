// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class ya
{
    private static final xa a;
    private static final xa b;
    
    static {
        xa a2;
        try {
            a2 = (xa)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            a2 = null;
        }
        a = a2;
        b = new xa();
    }
    
    static xa a() {
        return ya.a;
    }
    
    static xa b() {
        return ya.b;
    }
}
