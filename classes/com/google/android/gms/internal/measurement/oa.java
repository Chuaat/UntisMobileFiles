// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class oa
{
    private static final na a;
    private static final na b;
    
    static {
        na a2;
        try {
            a2 = (na)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            a2 = null;
        }
        a = a2;
        b = new na();
    }
    
    static na a() {
        return oa.a;
    }
    
    static na b() {
        return oa.b;
    }
}
