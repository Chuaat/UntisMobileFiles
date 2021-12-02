// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.configuration;

import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import org.bson.codecs.n0;
import java.util.Map;

final class e implements b
{
    private final Map<Class<?>, n0<?>> a;
    
    e(final List<? extends n0<?>> list) {
        this.a = new HashMap<Class<?>, n0<?>>();
        for (final n0<?> n0 : list) {
            this.a.put(n0.g(), n0);
        }
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        return (n0<T>)this.a.get(clazz);
    }
}
