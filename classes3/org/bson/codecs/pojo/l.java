// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.configuration.a;
import java.lang.annotation.Annotation;
import f7.c;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Type;
import f7.e;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

final class l<T>
{
    private final Class<T> a;
    private final Constructor<T> b;
    private final Method c;
    private final List<e> d;
    private final Integer e;
    private final List<Class<?>> f;
    private final List<Type> g;
    
    l(final Class<T> clazz, final Constructor<T> constructor) {
        this(clazz, constructor, null);
    }
    
    private l(final Class<T> a, final Constructor<T> b, final Method c) {
        this.d = new ArrayList<e>();
        final ArrayList<Object> f = new ArrayList<Object>();
        this.f = (List<Class<?>>)f;
        final ArrayList<Object> g = new ArrayList<Object>();
        this.g = (List<Type>)g;
        this.a = a;
        this.b = b;
        this.c = c;
        Integer e = null;
        if (b != null || c != null) {
            Class<?>[] a2;
            if (b != null) {
                a2 = b.getParameterTypes();
            }
            else {
                a2 = c.getParameterTypes();
            }
            Type[] a3;
            if (b != null) {
                a3 = b.getGenericParameterTypes();
            }
            else {
                a3 = c.getGenericParameterTypes();
            }
            f.addAll(Arrays.asList(a2));
            g.addAll(Arrays.asList(a3));
            Annotation[][] array;
            if (b != null) {
                array = b.getParameterAnnotations();
            }
            else {
                array = c.getParameterAnnotations();
            }
            e = null;
            Integer value;
            for (int i = 0; i < array.length; ++i, e = value) {
                final Annotation[] array2 = array[i];
                final int length = array2.length;
                int n = 0;
                while (true) {
                    value = e;
                    if (n >= length) {
                        break;
                    }
                    final Annotation annotation = array2[n];
                    if (annotation.annotationType().equals(e.class)) {
                        this.d.add((e)annotation);
                        value = e;
                        break;
                    }
                    if (annotation.annotationType().equals(c.class)) {
                        this.d.add(null);
                        value = i;
                        break;
                    }
                    ++n;
                }
            }
        }
        this.e = e;
    }
    
    l(final Class<T> clazz, final Method method) {
        this(clazz, null, method);
    }
    
    private void a() {
        if (this.b == null && this.c == null) {
            throw new a(String.format("Cannot find a public constructor for '%s'.", this.a.getSimpleName()));
        }
    }
    
    private static a c(final Class<?> clazz, final boolean b, final String s) {
        String s2;
        if (b) {
            s2 = "constructor";
        }
        else {
            s2 = "method";
        }
        return new a(String.format("Invalid @BsonCreator %s in %s. %s", s2, clazz.getSimpleName(), s));
    }
    
    a b(final Class<?> clazz, final String s) {
        return c(clazz, this.b != null, s);
    }
    
    Integer d() {
        return this.e;
    }
    
    T e() {
        this.a();
        try {
            final Constructor<T> b = this.b;
            if (b != null) {
                return b.newInstance(new Object[0]);
            }
            return (T)this.c.invoke(this.a, new Object[0]);
        }
        catch (Exception ex) {
            throw new a(ex.getMessage(), ex);
        }
    }
    
    T f(final Object[] array) {
        this.a();
        try {
            final Constructor<T> b = this.b;
            if (b != null) {
                return b.newInstance(array);
            }
            return (T)this.c.invoke(this.a, array);
        }
        catch (Exception ex) {
            throw new a(ex.getMessage(), ex);
        }
    }
    
    List<Type> g() {
        return this.g;
    }
    
    List<Class<?>> h() {
        return this.f;
    }
    
    List<e> i() {
        return this.d;
    }
    
    Class<T> j() {
        return this.a;
    }
}
