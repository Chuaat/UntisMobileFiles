// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import c6.h;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import c6.c;

@c
public final class a0
{
    private a0() {
    }
    
    static Type a(final Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType)type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class)type).getComponentType();
        }
        return null;
    }
    
    public static GenericArrayType b(final Type type) {
        return new com.squareup.moshi.internal.c.a(type);
    }
    
    public static Type c(Type k, final Class<?> clazz) {
        final Type type = k = k(k, clazz, Collection.class);
        if (type instanceof WildcardType) {
            k = ((WildcardType)type).getUpperBounds()[0];
        }
        if (k instanceof ParameterizedType) {
            return ((ParameterizedType)k).getActualTypeArguments()[0];
        }
        return Object.class;
    }
    
    static <T extends Annotation> T d(final Class<T> obj) {
        if (!obj.isAnnotation()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" must be an annotation.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!obj.isAnnotationPresent(l.class)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" must have @JsonQualifier.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (obj.getDeclaredMethods().length == 0) {
            return (T)Proxy.newProxyInstance(obj.getClassLoader(), new Class[] { obj }, new InvocationHandler() {
                @Override
                public Object invoke(Object obj, final Method method, final Object[] args) throws Throwable {
                    final String name = method.getName();
                    name.hashCode();
                    final int hashCode = name.hashCode();
                    int n = -1;
                    switch (hashCode) {
                        case 1444986633: {
                            if (!name.equals("annotationType")) {
                                break;
                            }
                            n = 3;
                            break;
                        }
                        case 147696667: {
                            if (!name.equals("hashCode")) {
                                break;
                            }
                            n = 2;
                            break;
                        }
                        case -1295482945: {
                            if (!name.equals("equals")) {
                                break;
                            }
                            n = 1;
                            break;
                        }
                        case -1776922004: {
                            if (!name.equals("toString")) {
                                break;
                            }
                            n = 0;
                            break;
                        }
                    }
                    switch (n) {
                        default: {
                            return method.invoke(obj, args);
                        }
                        case 3: {
                            return obj;
                        }
                        case 2: {
                            return 0;
                        }
                        case 1: {
                            obj = args[0];
                            return obj.isInstance(obj);
                        }
                        case 0: {
                            obj = new StringBuilder();
                            ((StringBuilder)obj).append("@");
                            ((StringBuilder)obj).append(obj.getName());
                            ((StringBuilder)obj).append("()");
                            return ((StringBuilder)obj).toString();
                        }
                    }
                }
            });
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(" must not declare methods.");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    public static boolean e(@h final Type type, @h final Type obj) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (type == obj) {
            return true;
        }
        if (type instanceof Class) {
            if (obj instanceof GenericArrayType) {
                return e(((Class)type).getComponentType(), ((GenericArrayType)obj).getGenericComponentType());
            }
            return type.equals(obj);
        }
        else if (type instanceof ParameterizedType) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final ParameterizedType parameterizedType2 = (ParameterizedType)obj;
            Type[] a;
            if (parameterizedType instanceof com.squareup.moshi.internal.c.b) {
                a = ((com.squareup.moshi.internal.c.b)parameterizedType).I;
            }
            else {
                a = parameterizedType.getActualTypeArguments();
            }
            Type[] a2;
            if (parameterizedType2 instanceof com.squareup.moshi.internal.c.b) {
                a2 = ((com.squareup.moshi.internal.c.b)parameterizedType2).I;
            }
            else {
                a2 = parameterizedType2.getActualTypeArguments();
            }
            if (!e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(a, a2)) {
                b3 = false;
            }
            return b3;
        }
        else if (type instanceof GenericArrayType) {
            if (obj instanceof Class) {
                return e(((Class)obj).getComponentType(), ((GenericArrayType)type).getGenericComponentType());
            }
            return obj instanceof GenericArrayType && e(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)obj).getGenericComponentType());
        }
        else if (type instanceof WildcardType) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            final WildcardType wildcardType = (WildcardType)type;
            final WildcardType wildcardType2 = (WildcardType)obj;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) && b;
        }
        else {
            if (!(type instanceof TypeVariable)) {
                return false;
            }
            if (!(obj instanceof TypeVariable)) {
                return false;
            }
            final TypeVariable typeVariable = (TypeVariable)type;
            final TypeVariable typeVariable2 = (TypeVariable)obj;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName()) && b2;
        }
    }
    
    public static String f(final Class<?> obj) {
        if (obj.getAnnotation(i.class) != null) {
            return g(obj.getName());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Class does not have a JsonClass annotation: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String g(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.replace("$", "_"));
        sb.append("JsonAdapter");
        return sb.toString();
    }
    
    public static Set<? extends Annotation> h(final Class<?> clazz, final String s) {
        try {
            final Field declaredField = clazz.getDeclaredField(s);
            declaredField.setAccessible(true);
            final Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            final LinkedHashSet s2 = new LinkedHashSet<Annotation>(declaredAnnotations.length);
            for (final Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(l.class)) {
                    s2.add(annotation);
                }
            }
            return Collections.unmodifiableSet((Set<? extends Annotation>)s2);
        }
        catch (NoSuchFieldException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not access field ");
            sb.append(s);
            sb.append(" on class ");
            sb.append(clazz.getCanonicalName());
            throw new IllegalArgumentException(sb.toString(), cause);
        }
    }
    
    static Type i(final Type type) {
        final Class<?> j = j(type);
        return com.squareup.moshi.internal.c.s(type, j, j.getGenericSuperclass());
    }
    
    public static Class<?> j(final Type obj) {
        if (obj instanceof Class) {
            return (Class<?>)obj;
        }
        if (obj instanceof ParameterizedType) {
            return (Class<?>)((ParameterizedType)obj).getRawType();
        }
        if (obj instanceof GenericArrayType) {
            return Array.newInstance(j(((GenericArrayType)obj).getGenericComponentType()), 0).getClass();
        }
        if (obj instanceof TypeVariable) {
            return Object.class;
        }
        if (obj instanceof WildcardType) {
            return j(((WildcardType)obj).getUpperBounds()[0]);
        }
        String name;
        if (obj == null) {
            name = "null";
        }
        else {
            name = obj.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(obj);
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static Type k(final Type type, final Class<?> clazz, final Class<?> clazz2) {
        if (clazz2.isAssignableFrom(clazz)) {
            return com.squareup.moshi.internal.c.s(type, clazz, com.squareup.moshi.internal.c.g(type, clazz, clazz2));
        }
        throw new IllegalArgumentException();
    }
    
    static Type[] l(Type k, final Class<?> clazz) {
        if (k == Properties.class) {
            return new Type[] { String.class, String.class };
        }
        k = k(k, clazz, Map.class);
        if (k instanceof ParameterizedType) {
            return ((ParameterizedType)k).getActualTypeArguments();
        }
        return new Type[] { Object.class, Object.class };
    }
    
    public static ParameterizedType m(final Type obj, final Type... array) {
        if (array.length != 0) {
            return new com.squareup.moshi.internal.c.b(null, obj, array);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Missing type arguments for ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static ParameterizedType n(final Type type, final Type obj, final Type... array) {
        if (array.length != 0) {
            return new com.squareup.moshi.internal.c.b(type, obj, array);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Missing type arguments for ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @h
    public static Set<? extends Annotation> o(final Set<? extends Annotation> c, final Class<? extends Annotation> obj) {
        if (!obj.isAnnotationPresent(l.class)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" is not a JsonQualifier.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (c.isEmpty()) {
            return null;
        }
        for (final Annotation annotation : c) {
            if (obj.equals(annotation.annotationType())) {
                final LinkedHashSet<Annotation> s = new LinkedHashSet<Annotation>(c);
                s.remove(annotation);
                return (Set<? extends Annotation>)Collections.unmodifiableSet((Set<?>)s);
            }
        }
        return null;
    }
    
    public static WildcardType p(final Type type) {
        Type[] upperBounds;
        if (type instanceof WildcardType) {
            upperBounds = ((WildcardType)type).getUpperBounds();
        }
        else {
            upperBounds = new Type[] { type };
        }
        return new com.squareup.moshi.internal.c.c(upperBounds, com.squareup.moshi.internal.c.b);
    }
    
    public static WildcardType q(final Type type) {
        Type[] lowerBounds;
        if (type instanceof WildcardType) {
            lowerBounds = ((WildcardType)type).getLowerBounds();
        }
        else {
            lowerBounds = new Type[] { type };
        }
        return new com.squareup.moshi.internal.c.c(new Type[] { Object.class }, lowerBounds);
    }
}
