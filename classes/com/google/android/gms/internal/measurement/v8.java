// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class v8
{
    private static volatile boolean b = false;
    private static volatile v8 c;
    private static volatile v8 d;
    static final v8 e;
    private final Map<u8, h9<?, ?>> a;
    
    static {
        e = new v8(true);
    }
    
    v8() {
        this.a = new HashMap<u8, h9<?, ?>>();
    }
    
    v8(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static v8 a() {
        final v8 c;
        if ((c = v8.c) == null) {
            synchronized (v8.class) {
                if (v8.c == null) {
                    v8.c = v8.e;
                }
            }
        }
        return c;
    }
    
    public static v8 b() {
        final v8 d = v8.d;
        if (d != null) {
            return d;
        }
        synchronized (v8.class) {
            final v8 d2 = v8.d;
            if (d2 != null) {
                return d2;
            }
            return v8.d = d9.b(v8.class);
        }
    }
    
    public final <ContainingType extends sa> h9<ContainingType, ?> c(final ContainingType containingType, final int n) {
        return (h9<ContainingType, ?>)this.a.get(new u8(containingType, n));
    }
}
