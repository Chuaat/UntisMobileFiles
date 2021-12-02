// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.jsr310;

import java.util.HashMap;
import org.bson.codecs.n0;
import java.util.Map;
import org.bson.codecs.configuration.b;

public class c implements b
{
    private static final Map<Class<?>, n0<?>> a;
    
    static {
        a = new HashMap<Class<?>, n0<?>>();
        try {
            Class.forName("java.time.Instant");
            a(new org.bson.codecs.jsr310.b());
            a(new d());
            a(new e());
            a(new f());
        }
        catch (ClassNotFoundException ex) {}
    }
    
    private static void a(final n0<?> n0) {
        c.a.put(n0.g(), n0);
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final org.bson.codecs.configuration.d d) {
        return (n0<T>)c.a.get(clazz);
    }
}
