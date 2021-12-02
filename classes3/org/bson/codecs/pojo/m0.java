// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Collection;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.util.ArrayList;

final class m0
{
    private static final String a = "is";
    private static final String b = "get";
    private static final String c = "set";
    
    private m0() {
    }
    
    static a a(final Class<?> clazz) {
        final ArrayList<Method> list = new ArrayList<Method>();
        final ArrayList<Method> list2 = new ArrayList<Method>();
        for (final Method method : clazz.getDeclaredMethods()) {
            if (Modifier.isPublic(method.getModifiers()) && !method.isBridge()) {
                if (b(method)) {
                    list2.add(method);
                }
                else if (c(method)) {
                    list.add(method);
                }
            }
        }
        return new a(list2, list);
    }
    
    static boolean b(final Method method) {
        if (method.getParameterTypes().length > 0) {
            return false;
        }
        Label_0049: {
            if (!method.getName().startsWith("get")) {
                break Label_0049;
            }
            final int length = method.getName().length();
            final int n = 3;
            if (length <= 3) {
                break Label_0049;
            }
            return Character.isUpperCase(method.getName().charAt(n));
        }
        if (method.getName().startsWith("is")) {
            final int length2 = method.getName().length();
            final int n = 2;
            if (length2 > 2) {
                return Character.isUpperCase(method.getName().charAt(n));
            }
        }
        return false;
    }
    
    static boolean c(final Method method) {
        return method.getName().startsWith("set") && method.getName().length() > 3 && method.getParameterTypes().length == 1 && Character.isUpperCase(method.getName().charAt(3));
    }
    
    static String d(final Method method) {
        final String name = method.getName();
        int beginIndex;
        if (name.startsWith("is")) {
            beginIndex = 2;
        }
        else {
            beginIndex = 3;
        }
        final char[] charArray = name.substring(beginIndex, name.length()).toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }
    
    static class a
    {
        private final Collection<Method> a;
        private final Collection<Method> b;
        
        a(final Collection<Method> a, final Collection<Method> b) {
            this.a = a;
            this.b = b;
        }
        
        Collection<Method> a() {
            return this.a;
        }
        
        Collection<Method> b() {
            return this.b;
        }
    }
}
