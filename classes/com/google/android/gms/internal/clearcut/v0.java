// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class v0
{
    private static volatile boolean b = false;
    private static final Class<?> c;
    static final v0 d;
    private final Map<Object, j1.f<?, ?>> a;
    
    static {
        c = a();
        d = new v0(true);
    }
    
    v0() {
        this.a = new HashMap<Object, j1.f<?, ?>>();
    }
    
    private v0(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
    public static v0 b() {
        return u0.b();
    }
}
