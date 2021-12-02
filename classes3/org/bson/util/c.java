// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
public class c<T>
{
    private final Map<Class<?>, T> a;
    private final Map<Class<?>, T> b;
    
    public c() {
        this.a = (Map<Class<?>, T>)e.i();
        this.b = d.a((f<Class<?>, T>)new b());
    }
    
    public static <T> List<Class<?>> d(final Class<T> clazz) {
        return org.bson.util.b.c(clazz);
    }
    
    public void b() {
        this.a.clear();
        this.b.clear();
    }
    
    public T c(final Object o) {
        return this.b.get(o);
    }
    
    public boolean e() {
        return this.a.isEmpty();
    }
    
    public T f(final Class<?> clazz, final T t) {
        try {
            return this.a.put(clazz, t);
        }
        finally {
            this.b.clear();
        }
    }
    
    public T g(Object remove) {
        try {
            remove = this.a.remove(remove);
            return (T)remove;
        }
        finally {
            this.b.clear();
        }
    }
    
    public int h() {
        return this.a.size();
    }
    
    private final class b implements f<Class<?>, T>
    {
        public T a(final Class<?> clazz) {
            final Iterator<Class<?>> iterator = c.d(clazz).iterator();
            while (iterator.hasNext()) {
                final Object value = c.this.a.get(iterator.next());
                if (value != null) {
                    return (T)value;
                }
            }
            return null;
        }
    }
}
