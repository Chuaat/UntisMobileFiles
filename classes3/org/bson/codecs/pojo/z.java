// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import e7.a;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

final class z
{
    private z() {
    }
    
    private static <T, S> void a(final i0<T> i0, final Map<String, p0> map, final o0<S> o0, final List<String> list, final Type type) {
        final p0 h = h(list, type);
        map.put(i0.h(), h);
        i0.v(h, o0);
    }
    
    static <T> void b(final c<T> c, final Class<T> clazz) {
        c.y(a.e("clazz", clazz));
        final ArrayList<Annotation> list = new ArrayList<Annotation>();
        final TreeSet<Object> set = new TreeSet<Object>();
        final HashMap<String, p0> hashMap = new HashMap<String, p0>();
        final String simpleName = clazz.getSimpleName();
        final HashMap<Object, i0> hashMap2 = new HashMap<Object, i0>();
        Class<? super T> superclass = clazz;
        o0<Object> i = null;
        while (!superclass.isEnum() && superclass.getSuperclass() != null) {
            list.addAll(Arrays.asList(superclass.getDeclaredAnnotations()));
            final ArrayList<String> list2 = new ArrayList<String>();
            final TypeVariable<Class<T>>[] typeParameters = superclass.getTypeParameters();
            for (int length = typeParameters.length, j = 0; j < length; ++j) {
                list2.add(typeParameters[j].getName());
            }
            final m0.a a = m0.a(superclass);
            for (final Method method : a.b()) {
                final String d = m0.d(method);
                set.add(d);
                final i0<?> f = f(d, simpleName, (Map<String, i0<?>>)hashMap2, o0.h(method), hashMap, i, list2, d(method));
                if (f.j() == null) {
                    f.u(method);
                    final Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    for (int length2 = declaredAnnotations.length, k = 0; k < length2; ++k) {
                        f.b(declaredAnnotations[k]);
                    }
                }
            }
            for (final Method method2 : a.a()) {
                final String d2 = m0.d(method2);
                set.add(d2);
                final i0 i2 = hashMap2.get(d2);
                if (i2 != null && i2.g() != null) {
                    continue;
                }
                final i0<?> f2 = f(d2, simpleName, (Map<String, i0<?>>)hashMap2, o0.h(method2), hashMap, i, list2, d(method2));
                if (f2.g() != null) {
                    continue;
                }
                f2.t(method2);
                final Annotation[] declaredAnnotations2 = method2.getDeclaredAnnotations();
                for (int length3 = declaredAnnotations2.length, l = 0; l < length3; ++l) {
                    f2.a(declaredAnnotations2[l]);
                }
            }
            for (final Field field : superclass.getDeclaredFields()) {
                set.add(field.getName());
                final i0<?> e = e(field.getName(), simpleName, (Map<String, i0<?>>)hashMap2, o0.g(field), hashMap, i, list2, field.getGenericType());
                if (e != null && e.f() == null) {
                    e.c(field);
                    for (final Annotation annotation : field.getDeclaredAnnotations()) {
                        e.a(annotation);
                        e.b(annotation);
                    }
                }
            }
            i = (o0<Object>)o0.i(superclass.getGenericSuperclass(), (Class<S>)superclass);
            superclass = superclass.getSuperclass();
        }
        if (superclass.isInterface()) {
            list.addAll(Arrays.asList(superclass.getDeclaredAnnotations()));
        }
        final Iterator<String> iterator3 = set.iterator();
        while (iterator3.hasNext()) {
            final i0<?> i3 = hashMap2.get(iterator3.next());
            if (i3.q() || i3.o()) {
                c.a(c(i3));
            }
        }
        Collections.reverse(list);
        c.b(list);
        c.w(hashMap);
        final Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        final int length6 = declaredConstructors.length;
        int n3 = 0;
        Constructor<Object> constructor = null;
        while (n3 < length6) {
            final Constructor<?> constructor2 = declaredConstructors[n3];
            Constructor<?> constructor3 = constructor;
            Label_0807: {
                if (constructor2.getParameterTypes().length == 0) {
                    if (!Modifier.isPublic(constructor2.getModifiers())) {
                        constructor3 = constructor;
                        if (!Modifier.isProtected(constructor2.getModifiers())) {
                            break Label_0807;
                        }
                    }
                    constructor2.setAccessible(true);
                    constructor3 = constructor2;
                }
            }
            ++n3;
            constructor = (Constructor<Object>)constructor3;
        }
        c.v(new u<T>(new l<Object>((Class<Object>)clazz, constructor)));
    }
    
    static <T> k0<T> c(final i0<T> i0) {
        final k0<T> u = j0.a().q(i0.h()).t(i0.h()).x(i0.h()).v(i0.k()).s(i0.i()).w(i0.n()).r(new l0<T>()).p(new e0<T>(i0)).u(i0.e());
        if (i0.m() != null) {
            j(u, i0);
        }
        return u;
    }
    
    private static Type d(final Method method) {
        Type genericReturnType;
        if (m0.b(method)) {
            genericReturnType = method.getGenericReturnType();
        }
        else {
            genericReturnType = method.getGenericParameterTypes()[0];
        }
        return genericReturnType;
    }
    
    private static <T, S> i0<T> e(final String s, final String s2, final Map<String, i0<?>> map, final o0<T> o0, final Map<String, p0> map2, final o0<S> o2, final List<String> list, final Type type) {
        final i0<T> g = g(s, s2, map, o0);
        if (!g.k().a().isAssignableFrom(o0.a())) {
            return null;
        }
        a(g, map2, o2, list, type);
        return g;
    }
    
    private static <T, S> i0<T> f(final String s, final String s2, final Map<String, i0<?>> map, final o0<T> o0, final Map<String, p0> map2, final o0<S> o2, final List<String> list, final Type type) {
        final i0<T> g = g(s, s2, map, o0);
        if (!i(g.k().a(), o0.a())) {
            g.s(String.format("Property '%s' in %s, has differing data types: %s and %s.", s, s2, g.k(), o0));
        }
        a(g, map2, o2, list, type);
        return g;
    }
    
    private static <T> i0<T> g(final String s, final String s2, final Map<String, i0<?>> map, final o0<T> o0) {
        i0<T> i0;
        if ((i0 = map.get(s)) == null) {
            i0 = new i0<T>(s, s2, o0);
            map.put(s, i0);
        }
        return i0;
    }
    
    private static p0 h(final List<String> list, final Type type) {
        final int index = list.indexOf(type.toString());
        final p0.b a = p0.a();
        if (index != -1) {
            a.a(index);
        }
        else if (type instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            for (int i = 0; i < parameterizedType.getActualTypeArguments().length; ++i) {
                final int index2 = list.indexOf(parameterizedType.getActualTypeArguments()[i].toString());
                if (index2 != -1) {
                    a.b(i, index2);
                }
            }
        }
        return a.c();
    }
    
    private static boolean i(final Class<?> clazz, final Class<?> clazz2) {
        return clazz.isAssignableFrom(clazz2) || clazz2.isAssignableFrom(clazz);
    }
    
    private static <V> void j(final k0<V> k0, final i0<V> i0) {
        if (i0.l().c() && !i0.m().isEmpty()) {
            final Map<Integer, Integer> b = i0.l().b();
            final Integer n = b.get(-1);
            o0<V> c;
            if (n != null) {
                c = (o0<V>)i0.m().get(n);
            }
            else {
                final o0.b<V> c2 = o0.c(k0.j().a());
                final ArrayList<o0<?>> list = new ArrayList<o0<?>>(k0.j().getTypeParameters());
                for (int j = 0; j < list.size(); ++j) {
                    for (final Map.Entry<Integer, Integer> entry : b.entrySet()) {
                        if (entry.getKey().equals(j)) {
                            list.set(j, (o0<?>)i0.m().get(entry.getValue()));
                        }
                    }
                }
                c2.b(list);
                c = c2.c();
            }
            k0.v(c);
        }
    }
    
    static <V> V k(final String s, final V v) {
        if (v != null) {
            return v;
        }
        throw new IllegalStateException(String.format("%s cannot be null", s));
    }
}
