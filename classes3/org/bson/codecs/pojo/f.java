// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import f7.d;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.Constructor;
import f7.a;
import java.lang.reflect.Modifier;
import f7.b;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.ArrayList;

final class f implements e
{
    private <T, S> k0<S> b(final c<T> c, final String s, final Class<S> clazz) {
        final k0<S> x = z.c(new i0<S>(s, c.s().getSimpleName(), o0.c(clazz).c())).t(null).x(s);
        c.a(x);
        return x;
    }
    
    private void c(final c<?> c) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final k0 k0 : c.q()) {
            if (!k0.n() && !k0.o()) {
                list.add(k0.e());
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            c.x(iterator2.next());
        }
    }
    
    private void d(final c<?> c, final Annotation annotation) {
        if (annotation instanceof b) {
            final b b = (b)annotation;
            final String key = b.key();
            if (!key.equals("")) {
                c.g(key);
            }
            final String value = b.value();
            if (!value.equals("")) {
                c.f(value);
            }
            c.h(true);
        }
    }
    
    private <T> void e(final c<T> c) {
        final Class<T> s = c.s();
        final Constructor[] declaredConstructors = s.getDeclaredConstructors();
        final int length = declaredConstructors.length;
        int i = 0;
        l<Object> l = null;
        while (i < length) {
            final Constructor constructor = declaredConstructors[i];
            l<Object> j = l;
            if (Modifier.isPublic(constructor.getModifiers())) {
                j = l;
                if (!constructor.isSynthetic()) {
                    final Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                    final int length2 = declaredAnnotations.length;
                    int n = 0;
                    while (true) {
                        j = l;
                        if (n >= length2) {
                            break;
                        }
                        l<Object> k = l;
                        if (declaredAnnotations[n].annotationType().equals(a.class)) {
                            if (l != null) {
                                throw new org.bson.codecs.configuration.a("Found multiple constructors annotated with @BsonCreator");
                            }
                            k = new l<Object>((Class<Object>)s, constructor);
                        }
                        ++n;
                        l = k;
                    }
                }
            }
            ++i;
            l = j;
        }
        Class<? super T> superclass = s;
        int n2 = 0;
        l<Object> m = l;
        while (superclass != null && n2 == 0) {
            final Method[] declaredMethods = superclass.getDeclaredMethods();
            final int length3 = declaredMethods.length;
            int n3 = 0;
            l<Object> l2 = m;
            while (n3 < length3) {
                final Method method = declaredMethods[n3];
                int n4 = n2;
                l<Object> l3 = l2;
                if (Modifier.isStatic(method.getModifiers())) {
                    n4 = n2;
                    l3 = l2;
                    if (!method.isSynthetic()) {
                        n4 = n2;
                        l3 = l2;
                        if (!method.isBridge()) {
                            final Annotation[] declaredAnnotations2 = method.getDeclaredAnnotations();
                            final int length4 = declaredAnnotations2.length;
                            int n5 = 0;
                            while (true) {
                                n4 = n2;
                                l3 = l2;
                                if (n5 >= length4) {
                                    break;
                                }
                                l<Object> l4 = l2;
                                if (declaredAnnotations2[n5].annotationType().equals(a.class)) {
                                    if (l2 != null) {
                                        throw new org.bson.codecs.configuration.a("Found multiple constructors / methods annotated with @BsonCreator");
                                    }
                                    if (!superclass.isAssignableFrom(method.getReturnType())) {
                                        throw new org.bson.codecs.configuration.a(String.format("Invalid method annotated with @BsonCreator. Returns '%s', expected %s", method.getReturnType(), superclass));
                                    }
                                    l4 = new l<Object>((Class<Object>)s, method);
                                    n2 = 1;
                                }
                                ++n5;
                                l2 = l4;
                            }
                        }
                    }
                }
                ++n3;
                n2 = n4;
                l2 = l3;
            }
            superclass = superclass.getSuperclass();
            m = l2;
        }
        if (m != null) {
            final List<f7.e> i2 = (List<f7.e>)m.i();
            final List h = m.h();
            final List g = m.g();
            if (i2.size() != h.size()) {
                throw m.b(s, "All parameters in the @BsonCreator method / constructor must be annotated with a @BsonProperty.");
            }
            for (int i3 = 0; i3 < i2.size(); ++i3) {
                final boolean b = m.d() != null && m.d().equals(i3);
                final Class<S> clazz = h.get(i3);
                final Type type = g.get(i3);
                k0<?> k2;
                if (b) {
                    k2 = c.p(c.n());
                }
                else {
                    final f7.e e = i2.get(i3);
                    final Iterator<k0<?>> iterator = c.q().iterator();
                    Object o = null;
                    Object o2;
                    while (true) {
                        o2 = o;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        o2 = iterator.next();
                        if (e.value().equals(((k0)o2).l())) {
                            break;
                        }
                        if (!e.value().equals(((k0)o2).i())) {
                            continue;
                        }
                        o = o2;
                    }
                    if (o2 == null) {
                        k2 = c.p(e.value());
                    }
                    else {
                        k2 = (k0<?>)o2;
                    }
                    if (k2 == null) {
                        k2 = this.b(c, e.value(), (Class<T>)clazz);
                    }
                    else {
                        if (!e.value().equals(k2.e())) {
                            k2.x(e.value());
                        }
                        g(clazz, k2, type);
                    }
                }
                if (!k2.j().e(clazz)) {
                    throw m.b(s, String.format("Invalid Property type for '%s'. Expected %s, found %s.", k2.l(), k2.j().a(), clazz));
                }
            }
            c.v(new u<T>((l<T>)m));
        }
    }
    
    private void f(final c<?> c, final k0<?> k0) {
        for (final Annotation annotation : k0.h()) {
            if (annotation instanceof f7.e) {
                final f7.e e = (f7.e)annotation;
                if (!"".equals(e.value())) {
                    k0.t(e.value());
                }
                k0.c(e.useDiscriminator());
                if (!k0.e().equals(c.n())) {
                    continue;
                }
                c.u(null);
            }
            else if (annotation instanceof f7.c) {
                c.u(k0.e());
            }
            else {
                if (!(annotation instanceof d)) {
                    continue;
                }
                k0.t(null);
            }
        }
        for (final Annotation annotation2 : k0.k()) {
            if (annotation2 instanceof f7.e) {
                final f7.e e2 = (f7.e)annotation2;
                if ("".equals(e2.value())) {
                    continue;
                }
                k0.x(e2.value());
            }
            else {
                if (!(annotation2 instanceof d)) {
                    continue;
                }
                k0.x(null);
            }
        }
    }
    
    private static <T> void g(final Class<?> clazz, final k0<T> k0, final Type type) {
        if (clazz.isAssignableFrom(k0.j().a())) {
            k0.v(o0.i(type, clazz));
        }
    }
    
    @Override
    public void a(final c<?> c) {
        final Iterator iterator = c.i().iterator();
        while (iterator.hasNext()) {
            this.d(c, iterator.next());
        }
        final Iterator<k0<?>> iterator2 = (Iterator<k0<?>>)c.q().iterator();
        while (iterator2.hasNext()) {
            this.f(c, iterator2.next());
        }
        this.e(c);
        this.c(c);
    }
}
