// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class n8
{
    private static final n8 c;
    private final v8 a;
    private final ConcurrentMap<Class<?>, s8<?>> b;
    
    static {
        c = new n8();
    }
    
    private n8() {
        this.b = new ConcurrentHashMap<Class<?>, s8<?>>();
        this.a = new q7();
    }
    
    public static n8 a() {
        return n8.c;
    }
    
    public final <T> s8<T> b(final Class<T> clazz) {
        t6.f(clazz, "messageType");
        s8<?> a;
        if ((a = this.b.get(clazz)) == null) {
            a = this.a.a(clazz);
            t6.f(clazz, "messageType");
            t6.f(a, "schema");
            final s8<?> s8 = this.b.putIfAbsent(clazz, a);
            if (s8 != null) {
                a = s8;
            }
        }
        return (s8<T>)a;
    }
    
    public final <T> s8<T> c(final T t) {
        return this.b(t.getClass());
    }
}
