// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import c6.h;
import java.lang.reflect.Type;
import java.lang.reflect.Method;

abstract class v<T>
{
    static <T> v<T> b(final u u, final Method method) {
        final s b = s.b(u, method);
        final Type genericReturnType = method.getGenericReturnType();
        if (y.j(genericReturnType)) {
            throw y.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return (v<T>)k.f(u, method, b);
        }
        throw y.m(method, "Service methods cannot return void.", new Object[0]);
    }
    
    @h
    abstract T a(final Object[] p0);
}
