// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class ab
{
    private static final ab c;
    private final eb a;
    private final ConcurrentMap<Class<?>, db<?>> b;
    
    static {
        c = new ab();
    }
    
    private ab() {
        this.b = new ConcurrentHashMap<Class<?>, db<?>>();
        this.a = new ja();
    }
    
    public static ab a() {
        return ab.c;
    }
    
    public final <T> db<T> b(final Class<T> clazz) {
        s9.f(clazz, "messageType");
        db<?> a;
        if ((a = this.b.get(clazz)) == null) {
            a = this.a.a(clazz);
            s9.f(clazz, "messageType");
            s9.f(a, "schema");
            final db<?> db = this.b.putIfAbsent(clazz, a);
            if (db != null) {
                return (db<T>)db;
            }
        }
        return (db<T>)a;
    }
}
