// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.b;

public class v1 implements b
{
    private final Map<Class<?>, n0<?>> a;
    
    public v1() {
        this.a = new HashMap<Class<?>, n0<?>>();
        this.c();
    }
    
    private <T> void a(final n0<T> n0) {
        this.a.put(n0.g(), n0);
    }
    
    private void c() {
        this.a((n0<Object>)new e());
        this.a((n0<Object>)new f());
        this.a((n0<Object>)new p0());
        this.a((n0<Object>)new v0());
        this.a((n0<Object>)new a1());
        this.a((n0<Object>)new d1());
        this.a((n0<Object>)new h1());
        this.a((n0<Object>)new g1());
        this.a((n0<Object>)new l0());
        this.a((n0<Object>)new q0());
        this.a((n0<Object>)new d());
        this.a((n0<Object>)new j1());
        this.a((n0<Object>)new k0());
        this.a((n0<Object>)new q1());
        this.a((n0<Object>)new r1());
        this.a((n0<Object>)new m1());
        this.a((n0<Object>)new j0());
        this.a((n0<Object>)new n1());
        this.a((n0<Object>)new p1());
        this.a((n0<Object>)new i0());
        this.a((n0<Object>)new y0());
        this.a((n0<Object>)new a());
        this.a((n0<Object>)new org.bson.codecs.b());
        this.a((n0<Object>)new c());
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final org.bson.codecs.configuration.d d) {
        return (n0<T>)this.a.get(clazz);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
}
