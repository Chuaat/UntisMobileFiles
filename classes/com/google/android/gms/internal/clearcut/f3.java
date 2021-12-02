// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class f3
{
    private static final f3 c;
    private final l3 a;
    private final ConcurrentMap<Class<?>, k3<?>> b;
    
    static {
        c = new f3();
    }
    
    private f3() {
        this.b = new ConcurrentHashMap<Class<?>, k3<?>>();
        l3 l3 = null;
        l3 c;
        for (int i = 0; i <= 0; ++i, l3 = c) {
            c = c((new String[] { "com.google.protobuf.AndroidProto3SchemaFactory" })[0]);
            if ((l3 = c) != null) {
                break;
            }
        }
        l3 a;
        if ((a = l3) == null) {
            a = new h2();
        }
        this.a = a;
    }
    
    public static f3 a() {
        return f3.c;
    }
    
    private static l3 c(final String className) {
        try {
            return (l3)Class.forName(className).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        finally {
            return null;
        }
    }
    
    public final <T> k3<T> b(final Class<T> clazz) {
        l1.e(clazz, "messageType");
        k3<?> a;
        if ((a = this.b.get(clazz)) == null) {
            a = this.a.a(clazz);
            l1.e(clazz, "messageType");
            l1.e(a, "schema");
            final k3<?> k3 = this.b.putIfAbsent(clazz, a);
            if (k3 != null) {
                a = k3;
            }
        }
        return (k3<T>)a;
    }
    
    public final <T> k3<T> d(final T t) {
        return this.b(t.getClass());
    }
}
