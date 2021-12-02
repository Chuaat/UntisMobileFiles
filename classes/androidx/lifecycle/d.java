// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import androidx.annotation.k0;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

final class d
{
    static d c;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private final Map<Class<?>, a> a;
    private final Map<Class<?>, Boolean> b;
    
    static {
        androidx.lifecycle.d.c = new d();
    }
    
    d() {
        this.a = new HashMap<Class<?>, a>();
        this.b = new HashMap<Class<?>, Boolean>();
    }
    
    private a a(final Class<?> clazz, @k0 Method[] b) {
        final Class<?> superclass = clazz.getSuperclass();
        final HashMap<b, s.b> hashMap = new HashMap<b, s.b>();
        if (superclass != null) {
            final a c = this.c(superclass);
            if (c != null) {
                hashMap.putAll((Map<?, ?>)c.b);
            }
        }
        final Class<?>[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry<b, s.b> entry : this.c(interfaces[i]).b.entrySet()) {
                this.e(hashMap, entry.getKey(), entry.getValue(), clazz);
            }
        }
        if (b == null) {
            b = this.b(clazz);
        }
        final int length2 = b.length;
        int j = 0;
        boolean b2 = false;
        while (j < length2) {
            final Method method = b[j];
            final m0 m0 = method.getAnnotation(m0.class);
            if (m0 != null) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                int n;
                if (parameterTypes.length > 0) {
                    if (!parameterTypes[0].isAssignableFrom(y.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                final s.b value = m0.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(s.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != s.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    n = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                this.e(hashMap, new b(n, method), value, clazz);
                b2 = true;
            }
            ++j;
        }
        final a a = new a(hashMap);
        this.a.put(clazz, a);
        this.b.put(clazz, b2);
        return a;
    }
    
    private Method[] b(final Class<?> clazz) {
        try {
            return clazz.getDeclaredMethods();
        }
        catch (NoClassDefFoundError cause) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", cause);
        }
    }
    
    private void e(final Map<b, s.b> map, final b b, final s.b obj, final Class<?> clazz) {
        final s.b obj2 = map.get(b);
        if (obj2 != null && obj != obj2) {
            final Method b2 = b.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(b2.getName());
            sb.append(" in ");
            sb.append(clazz.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(obj2);
            sb.append(", new value ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        if (obj2 == null) {
            map.put(b, obj);
        }
    }
    
    a c(final Class<?> clazz) {
        final a a = this.a.get(clazz);
        if (a != null) {
            return a;
        }
        return this.a(clazz, null);
    }
    
    boolean d(final Class<?> clazz) {
        final Boolean b = this.b.get(clazz);
        if (b != null) {
            return b;
        }
        final Method[] b2 = this.b(clazz);
        for (int length = b2.length, i = 0; i < length; ++i) {
            if (b2[i].getAnnotation(m0.class) != null) {
                this.a(clazz, b2);
                return true;
            }
        }
        this.b.put(clazz, Boolean.FALSE);
        return false;
    }
    
    static class a
    {
        final Map<s.b, List<b>> a;
        final Map<b, s.b> b;
        
        a(final Map<b, s.b> b) {
            this.b = b;
            this.a = new HashMap<s.b, List<b>>();
            for (final Map.Entry<b, s.b> entry : b.entrySet()) {
                final s.b b2 = entry.getValue();
                List<b> list;
                if ((list = this.a.get(b2)) == null) {
                    list = new ArrayList<b>();
                    this.a.put(b2, list);
                }
                list.add(entry.getKey());
            }
        }
        
        private static void b(final List<b> list, final y y, final s.b b, final Object o) {
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; --i) {
                    list.get(i).a(y, b, o);
                }
            }
        }
        
        void a(final y y, final s.b b, final Object o) {
            b(this.a.get(b), y, b, o);
            b(this.a.get(s.b.ON_ANY), y, b, o);
        }
    }
    
    static final class b
    {
        final int a;
        final Method b;
        
        b(final int a, final Method b) {
            this.a = a;
            (this.b = b).setAccessible(true);
        }
        
        void a(final y y, final s.b b, final Object obj) {
            try {
                final int a = this.a;
                if (a != 0) {
                    if (a != 1) {
                        if (a == 2) {
                            this.b.invoke(obj, y, b);
                        }
                    }
                    else {
                        this.b.invoke(obj, y);
                    }
                }
                else {
                    this.b.invoke(obj, new Object[0]);
                }
            }
            catch (IllegalAccessException cause) {
                throw new RuntimeException(cause);
            }
            catch (InvocationTargetException ex) {
                throw new RuntimeException("Failed to call observer method", ex.getCause());
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b2 = (b)o;
            if (this.a != b2.a || !this.b.getName().equals(b2.b.getName())) {
                b = false;
            }
            return b;
        }
        
        @Override
        public int hashCode() {
            return this.a * 31 + this.b.getName().hashCode();
        }
    }
}
