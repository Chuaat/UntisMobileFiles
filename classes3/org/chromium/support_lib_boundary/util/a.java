// 
// Decompiled by Procyon v0.5.36
// 

package org.chromium.support_lib_boundary.util;

import java.lang.reflect.InvocationTargetException;
import android.os.Build;
import java.lang.reflect.Method;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collection;
import java.lang.reflect.Proxy;
import androidx.annotation.k0;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;

public class a
{
    @k0
    public static <T> T a(@j0 final Class<T> clazz, @k0 final InvocationHandler h) {
        if (h == null) {
            return null;
        }
        return clazz.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[] { clazz }, h));
    }
    
    public static boolean b(final Collection<String> collection, final String str) {
        if (!collection.contains(str)) {
            if (i()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":dev");
                if (collection.contains(sb.toString())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean c(final String[] a, final String s) {
        return b(Arrays.asList(a), s);
    }
    
    @k0
    @p0(19)
    public static InvocationHandler d(@k0 final Object o) {
        if (o == null) {
            return null;
        }
        return new a(o);
    }
    
    @k0
    @p0(19)
    public static InvocationHandler[] e(@k0 final Object[] array) {
        if (array == null) {
            return null;
        }
        final int length = array.length;
        final InvocationHandler[] array2 = new InvocationHandler[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = d(array[i]);
        }
        return array2;
    }
    
    public static Method f(final Method method, final ClassLoader loader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, loader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }
    
    @k0
    public static Object g(@k0 final InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((a)invocationHandler).a();
    }
    
    public static boolean h(final Object o, final String name) {
        try {
            return Class.forName(name, false, o.getClass().getClassLoader()).isInstance(o);
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    private static boolean i() {
        final String type = Build.TYPE;
        return "eng".equals(type) || "userdebug".equals(type);
    }
    
    @p0(19)
    private static class a implements InvocationHandler
    {
        private final Object a;
        
        public a(@j0 final Object a) {
            this.a = a;
        }
        
        @j0
        public Object a() {
            return this.a;
        }
        
        @Override
        public Object invoke(Object invoke, final Method obj, final Object[] args) throws Throwable {
            final ClassLoader classLoader = this.a.getClass().getClassLoader();
            try {
                invoke = org.chromium.support_lib_boundary.util.a.f(obj, classLoader).invoke(this.a, args);
                return invoke;
            }
            catch (ReflectiveOperationException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Reflection failed for method ");
                sb.append(obj);
                throw new RuntimeException(sb.toString(), cause);
            }
            catch (InvocationTargetException ex) {
                throw ex.getTargetException();
            }
        }
    }
}
