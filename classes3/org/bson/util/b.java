// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.util;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

class b
{
    private static final ConcurrentMap<Class<?>, List<Class<?>>> a;
    
    static {
        a = e.i();
    }
    
    private static List<Class<?>> a(final Class<?> clazz) {
        final ArrayList<Class<?>> list = new ArrayList<Class<?>>();
        list.add(Object.class);
        b(clazz, list);
        Collections.reverse(list);
        return (List<Class<?>>)Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
    }
    
    private static <T> void b(final Class<T> clazz, final List<Class<?>> list) {
        if (clazz != null) {
            if (clazz != Object.class) {
                final Class[] interfaces = clazz.getInterfaces();
                for (int i = interfaces.length - 1; i >= 0; --i) {
                    b(interfaces[i], list);
                }
                b((Class<? super T>)clazz.getSuperclass(), list);
                if (!list.contains(clazz)) {
                    list.add(clazz);
                }
            }
        }
    }
    
    public static <T> List<Class<?>> c(final Class<T> clazz) {
        final ConcurrentMap<Class<?>, List<Class<?>>> d = d();
        List<Class<?>> list;
        while (true) {
            list = d.get(clazz);
            if (list != null) {
                break;
            }
            d.putIfAbsent(clazz, a(clazz));
        }
        return list;
    }
    
    private static ConcurrentMap<Class<?>, List<Class<?>>> d() {
        return b.a;
    }
}
