// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.configuration.a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Map;

final class m
{
    private final Map<String, Class<?>> a;
    private final Set<String> b;
    
    m(final Map<Class<?>, b<?>> map, final Set<String> b) {
        this.a = new ConcurrentHashMap<String, Class<?>>();
        for (final b<?> b2 : map.values()) {
            if (b2.b() != null) {
                this.a.put(b2.b(), b2.l());
            }
        }
        this.b = b;
    }
    
    private Class<?> b(final String className) {
        Class<?> forName;
        try {
            forName = Class.forName(className);
        }
        catch (ClassNotFoundException ex) {
            forName = null;
        }
        return forName;
    }
    
    private Class<?> d(final String str) {
        final Iterator<String> iterator = this.b.iterator();
        Class<?> clazz = null;
        while (iterator.hasNext()) {
            final String str2 = iterator.next();
            final StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".");
            sb.append(str);
            final Class<?> b = this.b(sb.toString());
            if ((clazz = b) != null) {
                clazz = b;
                break;
            }
        }
        return clazz;
    }
    
    void a(final b<?> b) {
        if (b.b() != null) {
            this.a.put(b.b(), b.l());
        }
    }
    
    public Class<?> c(final String s) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        Class<?> clazz;
        if ((clazz = this.b(s)) == null) {
            clazz = this.d(s);
        }
        if (clazz != null) {
            this.a.put(s, clazz);
            return clazz;
        }
        throw new a(String.format("A class could not be found for the discriminator: '%s'.", s));
    }
}
