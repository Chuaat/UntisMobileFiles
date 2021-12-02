// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common;

import c6.h;
import java.lang.reflect.Field;

public final class ReflectionUtil
{
    private ReflectionUtil() {
    }
    
    @h
    public static Object getFieldValue(final Field field, final Object obj) {
        try {
            return field.get(obj);
        }
        catch (IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    @h
    public static Class<?> tryGetClassForName(final String className) {
        try {
            return Class.forName(className);
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
    @h
    public static Field tryGetDeclaredField(final Class<?> clazz, final String name) {
        try {
            return clazz.getDeclaredField(name);
        }
        catch (NoSuchFieldException ex) {
            LogUtil.d(ex, "Could not retrieve %s field from %s", name, clazz);
            return null;
        }
    }
}
