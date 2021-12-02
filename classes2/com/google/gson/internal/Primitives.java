// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;

public final class Primitives
{
    private Primitives() {
    }
    
    public static boolean isPrimitive(final Type type) {
        return type instanceof Class && ((Class)type).isPrimitive();
    }
    
    public static boolean isWrapperType(final Type type) {
        return type == Integer.class || type == Float.class || type == Byte.class || type == Double.class || type == Long.class || type == Character.class || type == Boolean.class || type == Short.class || type == Void.class;
    }
    
    public static <T> Class<T> unwrap(final Class<T> clazz) {
        if (clazz == Integer.class) {
            return (Class<T>)Integer.TYPE;
        }
        if (clazz == Float.class) {
            return (Class<T>)Float.TYPE;
        }
        if (clazz == Byte.class) {
            return (Class<T>)Byte.TYPE;
        }
        if (clazz == Double.class) {
            return (Class<T>)Double.TYPE;
        }
        if (clazz == Long.class) {
            return (Class<T>)Long.TYPE;
        }
        if (clazz == Character.class) {
            return (Class<T>)Character.TYPE;
        }
        if (clazz == Boolean.class) {
            return (Class<T>)Boolean.TYPE;
        }
        if (clazz == Short.class) {
            return (Class<T>)Short.TYPE;
        }
        Serializable type;
        if ((type = clazz) == Void.class) {
            type = Void.TYPE;
        }
        return (Class<T>)type;
    }
    
    public static <T> Class<T> wrap(final Class<T> clazz) {
        if (clazz == Integer.TYPE) {
            return (Class<T>)Integer.class;
        }
        if (clazz == Float.TYPE) {
            return (Class<T>)Float.class;
        }
        if (clazz == Byte.TYPE) {
            return (Class<T>)Byte.class;
        }
        if (clazz == Double.TYPE) {
            return (Class<T>)Double.class;
        }
        if (clazz == Long.TYPE) {
            return (Class<T>)Long.class;
        }
        if (clazz == Character.TYPE) {
            return (Class<T>)Character.class;
        }
        if (clazz == Boolean.TYPE) {
            return (Class<T>)Boolean.class;
        }
        if (clazz == Short.TYPE) {
            return (Class<T>)Short.class;
        }
        Serializable s;
        if ((s = clazz) == Void.TYPE) {
            s = Void.class;
        }
        return (Class<T>)s;
    }
}
