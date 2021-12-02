// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import org.bson.codecs.configuration.a;
import java.util.concurrent.ConcurrentHashMap;
import org.bson.codecs.n0;
import java.util.concurrent.ConcurrentMap;

final class c
{
    private final ConcurrentMap<Class<?>, g<? extends n0<?>>> a;
    
    c() {
        this.a = new ConcurrentHashMap<Class<?>, g<? extends n0<?>>>();
    }
    
    public boolean a(final Class<?> clazz) {
        return this.a.containsKey(clazz);
    }
    
    public <T> n0<T> b(final Class<T> clazz) {
        if (this.a.containsKey(clazz)) {
            final g<n0<T>> g = this.a.get(clazz);
            if (!g.d()) {
                return g.b();
            }
        }
        throw new a(String.format("Can't find a codec for %s.", clazz));
    }
    
    public void c(final Class<?> clazz, final n0<?> n0) {
        this.a.put(clazz, g.e(n0));
    }
}
