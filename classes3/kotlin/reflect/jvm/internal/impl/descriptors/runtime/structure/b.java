// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.Array;
import kotlin.jvm.internal.k0;
import java.util.Iterator;
import n6.o;
import n6.n;
import n6.m;
import n6.k;
import n6.j;
import n6.i;
import n6.h;
import n6.g;
import n6.f;
import n6.c;
import n6.w;
import n6.u;
import n6.s;
import n6.r;
import n6.q;
import n6.p;
import n6.l;
import kotlin.collections.y0;
import kotlin.n1;
import m6.a;
import kotlin.s0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k1;
import kotlin.t;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.reflect.d;
import java.util.List;

public final class b
{
    @e
    private static final List<d<?>> a;
    @e
    private static final Map<Class<?>, Class<?>> b;
    @e
    private static final Map<Class<?>, Class<?>> c;
    @e
    private static final Map<Class<? extends t<?>>, Integer> d;
    
    static {
        final d d2 = k1.d((Class)Boolean.TYPE);
        int i = 0;
        final List<d<?>> list = (List<d<?>>)(a = v.L((Object[])new d[] { d2, k1.d((Class)Byte.TYPE), k1.d((Class)Character.TYPE), k1.d((Class)Double.TYPE), k1.d((Class)Float.TYPE), k1.d((Class)Integer.TYPE), k1.d((Class)Long.TYPE), k1.d((Class)Short.TYPE) }));
        final ArrayList list2 = new ArrayList<s0>(v.Y((Iterable)list, 10));
        for (final d d3 : list) {
            list2.add(n1.a((Object)m6.a.e(d3), (Object)m6.a.f(d3)));
        }
        b = y0.B0((Iterable)list2);
        final List<d<?>> a2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a;
        final ArrayList list3 = new ArrayList<s0>(v.Y((Iterable)a2, 10));
        for (final d d4 : a2) {
            list3.add(n1.a((Object)m6.a.f(d4), (Object)m6.a.e(d4)));
        }
        c = y0.B0((Iterable)list3);
        final List l = v.L((Object[])new Class[] { n6.a.class, l.class, p.class, q.class, r.class, s.class, n6.t.class, u.class, n6.v.class, w.class, n6.b.class, c.class, n6.d.class, n6.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class });
        final ArrayList list4 = new ArrayList<s0>(v.Y((Iterable)l, 10));
        for (final Class<?> next : l) {
            if (i < 0) {
                v.W();
            }
            list4.add(n1.a((Object)next, (Object)i));
            ++i;
        }
        d = y0.B0((Iterable)list4);
    }
    
    @e
    public static final Class<?> a(@e final Class<?> componentType) {
        k0.p((Object)componentType, "<this>");
        return Array.newInstance(componentType, 0).getClass();
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.a b(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        if (clazz.isPrimitive()) {
            throw new IllegalArgumentException(k0.C("Can't compute ClassId for primitive type: ", (Object)clazz));
        }
        if (!clazz.isArray()) {
            if (clazz.getEnclosingMethod() == null && clazz.getEnclosingConstructor() == null) {
                final String simpleName = clazz.getSimpleName();
                k0.o((Object)simpleName, "simpleName");
                if (simpleName.length() != 0) {
                    final Class declaringClass = clazz.getDeclaringClass();
                    kotlin.reflect.jvm.internal.impl.name.a d;
                    if (declaringClass == null) {
                        d = null;
                    }
                    else {
                        d = b(declaringClass).d(kotlin.reflect.jvm.internal.impl.name.e.i(clazz.getSimpleName()));
                    }
                    kotlin.reflect.jvm.internal.impl.name.a m = d;
                    if (d == null) {
                        m = kotlin.reflect.jvm.internal.impl.name.a.m(new kotlin.reflect.jvm.internal.impl.name.b(clazz.getName()));
                    }
                    k0.o((Object)m, "declaringClass?.classId?.createNestedClassId(Name.identifier(simpleName)) ?: ClassId.topLevel(FqName(name))");
                    return m;
                }
            }
            final kotlin.reflect.jvm.internal.impl.name.b b = new kotlin.reflect.jvm.internal.impl.name.b(clazz.getName());
            return new kotlin.reflect.jvm.internal.impl.name.a(b.e(), kotlin.reflect.jvm.internal.impl.name.b.k(b.g()), true);
        }
        throw new IllegalArgumentException(k0.C("Can't compute ClassId for array type: ", (Object)clazz));
    }
    
    @e
    public static final String c(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        if (k0.g((Object)clazz, (Object)Void.TYPE)) {
            return "V";
        }
        final String name = a(clazz).getName();
        k0.o((Object)name, "createArrayType().name");
        final String substring = name.substring(1);
        k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
        return kotlin.text.s.j2(substring, '.', '/', false, 4, null);
    }
    
    @org.jetbrains.annotations.f
    public static final Integer d(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.d.get(clazz);
    }
    
    @e
    public static final List<Type> e(@e final Type type) {
        k0.p((Object)type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return (List<Type>)v.E();
        }
        final ParameterizedType parameterizedType = (ParameterizedType)type;
        if (parameterizedType.getOwnerType() == null) {
            final Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            k0.o((Object)actualTypeArguments, "actualTypeArguments");
            return (List<Type>)kotlin.collections.m.ey((Object[])actualTypeArguments);
        }
        return kotlin.sequences.p.V2(kotlin.sequences.p.A0((kotlin.sequences.m<?>)kotlin.sequences.p.o((T)type, (n6.l<? super T, ? extends T>)b$a.G), (n6.l<? super Object, ? extends kotlin.sequences.m<? extends Type>>)b$b.G));
    }
    
    @org.jetbrains.annotations.f
    public static final Class<?> f(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b.get(clazz);
    }
    
    @e
    public static final ClassLoader g(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        ClassLoader classLoader;
        if ((classLoader = clazz.getClassLoader()) == null) {
            classLoader = ClassLoader.getSystemClassLoader();
            k0.o((Object)classLoader, "getSystemClassLoader()");
        }
        return classLoader;
    }
    
    @org.jetbrains.annotations.f
    public static final Class<?> h(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.c.get(clazz);
    }
    
    public static final boolean i(@e final Class<?> clazz) {
        k0.p((Object)clazz, "<this>");
        return Enum.class.isAssignableFrom(clazz);
    }
}
