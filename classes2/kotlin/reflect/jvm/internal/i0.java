// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import n6.l;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u0001*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class i0
{
    private static final String b(final Method method) {
        final StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        final Class<?>[] parameterTypes = method.getParameterTypes();
        k0.o(parameterTypes, "parameterTypes");
        sb.append(m.Ig(parameterTypes, "", "(", ")", 0, null, i0$a.G, 24, null));
        final Class<?> returnType = method.getReturnType();
        k0.o(returnType, "returnType");
        sb.append(b.c((Class)returnType));
        return sb.toString();
    }
}
