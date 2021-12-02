// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.e;

final class n
{
    @e
    public static final n a;
    
    static {
        a = new n();
    }
    
    private n() {
    }
    
    @e
    public final String a(@e final Constructor<?> constructor) {
        k0.p((Object)constructor, "constructor");
        final StringBuilder sb = new StringBuilder();
        sb.append("(");
        final Class[] parameterTypes = constructor.getParameterTypes();
        k0.o((Object)parameterTypes, "constructor.parameterTypes");
        final int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            final Class clazz = parameterTypes[i];
            ++i;
            k0.o((Object)clazz, "parameterType");
            sb.append(b.c(clazz));
        }
        sb.append(")V");
        final String string = sb.toString();
        k0.o((Object)string, "sb.toString()");
        return string;
    }
    
    @e
    public final String b(@e final Field field) {
        k0.p((Object)field, "field");
        final Class<?> type = field.getType();
        k0.o((Object)type, "field.type");
        return b.c(type);
    }
    
    @e
    public final String c(@e final Method method) {
        k0.p((Object)method, "method");
        final StringBuilder sb = new StringBuilder();
        sb.append("(");
        final Class<?>[] parameterTypes = method.getParameterTypes();
        k0.o((Object)parameterTypes, "method.parameterTypes");
        final int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            final Class<?> clazz = parameterTypes[i];
            ++i;
            k0.o((Object)clazz, "parameterType");
            sb.append(b.c(clazz));
        }
        sb.append(")");
        final Class<?> returnType = method.getReturnType();
        k0.o((Object)returnType, "method.returnType");
        sb.append(b.c(returnType));
        final String string = sb.toString();
        k0.o((Object)string, "sb.toString()");
        return string;
    }
}
